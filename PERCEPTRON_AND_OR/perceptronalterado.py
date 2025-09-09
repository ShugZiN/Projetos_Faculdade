from math import exp
import random

class Perceptron:
    def __init__(self, n_inputs=2, activation="sigmoid"):
        self.n_inputs = n_inputs
        self.activation_type = activation

        # Inicializa pesos + bias com valores pequenos aleatórios
        self.weights = [random.uniform(-1, 1) for _ in range(n_inputs)]
        self.bias = random.uniform(-1, 1)

    # (4) Função de ativação separada
    def activate(self, z):
        if self.activation_type == "sigmoid":
            return 1 / (1 + exp(-z))
        elif self.activation_type == "step":  # (5) Função degrau
            return 1 if z > 0 else 0
        else:
            raise ValueError("Função de ativação não reconhecida")

    def train(self, inputs, outputs, learning_rate=0.1, epochs=1000):
        for _ in range(epochs):
            for j in range(len(inputs)):
                x = inputs[j]
                y = outputs[j][0]

                # Soma ponderada (para N entradas)
                z = sum(w * xi for w, xi in zip(self.weights, x)) + self.bias
                y_pred = self.activate(z)

                # (1 e 2) Aprendizado varia com taxa e épocas
                error = y - y_pred

                # Atualiza pesos
                for i in range(self.n_inputs):
                    self.weights[i] += learning_rate * error * x[i]
                self.bias += learning_rate * error

        return self.weights, self.bias

    def predict(self, x):
        z = sum(w * xi for w, xi in zip(self.weights, x)) + self.bias
        y_pred = self.activate(z)
        return 1 if y_pred > 0.5 else 0 if self.activation_type == "sigmoid" else y_pred


if __name__ == "__main__":
    # (3) Porta AND - 2 entradas
    inputs2 = [[0,0],[0,1],[1,0],[1,1]]
    outputs_and = [[0],[0],[0],[1]]

    print("=== Porta AND com 2 entradas ===")
    p2 = Perceptron(n_inputs=2, activation="sigmoid")
    p2.train(inputs2, outputs_and, learning_rate=0.1, epochs=1000)
    for x in inputs2:
        print(x, "->", p2.predict(x))

    # (6) Porta AND com 3 entradas
    inputs3 = [
        [0,0,0],
        [0,0,1],
        [0,1,0],
        [0,1,1],
        [1,0,0],
        [1,0,1],
        [1,1,0],
        [1,1,1]
    ]
    outputs_and3 = [[0],[0],[0],[0],[0],[0],[0],[1]]  # só 1,1,1 dá 1

    print("\n=== Porta AND com 3 entradas ===")
    p3 = Perceptron(n_inputs=3, activation="sigmoid")
    p3.train(inputs3, outputs_and3, learning_rate=0.1, epochs=2000)
    for x in inputs3:
        print(x, "->", p3.predict(x))

    # (5) Testando função degrau
    print("\n=== Porta AND com função DEGRAU ===")
    p_step = Perceptron(n_inputs=2, activation="step")
    p_step.train(inputs2, outputs_and, learning_rate=0.1, epochs=1000)
    for x in inputs2:
        print(x, "->", p_step.predict(x))
