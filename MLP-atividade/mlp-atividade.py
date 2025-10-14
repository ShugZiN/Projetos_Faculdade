import numpy as np

class MLP:
    def __init__(self):
        pass

    def sigmoid(self, x):
        return 1 / (1 + np.exp(-x))
    
    def sigmoid_derivative(self, output):
        return output * (1 - output)
    
    def train(self, inputs, outputs, alpha, epochs):
        self.inputs = np.array(inputs)
        self.outputs = np.array(outputs).reshape(-1, 1)
        self.alpha = alpha
        self.epochs = epochs

        w11, w12, w21, w22 = np.random.uniform(0, 1, 4) # Aq é onde tem a iniciação dos pesos e biases aleatoriamente
        wh1, wh2 = np.random.uniform(0, 1, 2)
        b1, b2, b3 = np.random.uniform(0, 1, 3)

        for epoch in range(epochs):  # aq é o loop de treinamento
            for i in range(len(self.inputs)):
                x1, x2 = self.inputs[i]
                y_true = self.outputs[i] 

                h1 = self.sigmoid((x1 * w11) + (x2 * w21) + b1)
                h2 = self.sigmoid((x1 * w12) + (x2 * w22) + b2)
                y = self.sigmoid((h1 * wh1) + (h2 * wh2) + b3)

                error = y_true - y
                derivative_y = error * self.sigmoid_derivative(y)
                derivative_h1 = self.sigmoid_derivative(h1) * derivative_y * wh1
                derivative_h2 = self.sigmoid_derivative(h2) * derivative_y * wh2

                w11 += alpha * derivative_h1 * x1
                w21 += alpha * derivative_h1 * x2
                w12 += alpha * derivative_h2 * x1
                w22 += alpha * derivative_h2 * x2

                wh1 += alpha * derivative_y * h1
                wh2 += alpha * derivative_y * h2

                b1 += alpha * derivative_h1
                b2 += alpha * derivative_h2
                b3 += alpha * derivative_y

                return w11, w12, w21, w22, wh1, wh2, b1, b2, b3 # Retorna os pesos finais após o treinamento se td estiver certo
            
            def predict(self, weights, x1, x2):
             w11, w12, w21, w22, wh1, wh2, b1, b2, b3 = weights

        h1 = 1 / (1 + np.exp(-((x1 * w11) + (x2 * w21) + b1)))
        h2 = 1 / (1 + np.exp(-((x1 * w12) + (x2 * w22) + b2)))
        y = 1 / (1 + np.exp(-((h1 * wh1) + (h2 * wh2) + b3)))

        return y
    
    inputs = [
    [0, 0],
    [0, 1],
    [1, 0],
    [1, 1]
]
outputs = [
    [0],
    [1],
    [1],
    [0]

]
mlp = MLP()
pesos_finais = mlp.train(inputs, outputs, alpha=0.05, epochs=10000)

print("RESULTADOS FINAIS - PORTA LÓGICA XOR \n")

for entrada in inputs:
    x1, x2 = entrada
    y_pred = mlp.predict(pesos_finais, x1, x2)
    print(f"Entrada: {entrada} -> Saída prevista: {y_pred:.6f} -> Arredondado: {round(y_pred)}")

    print("\n PESOS E BIASES FINAIS ")
nomes = ["w11", "w12", "w21", "w22", "wh1", "wh2", "b1", "b2", "b3"]
for nome, valor in zip(nomes, pesos_finais):
    print(f"{nome} = {valor:.6f}")


