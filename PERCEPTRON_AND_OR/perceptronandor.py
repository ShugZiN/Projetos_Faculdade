from math import exp

class Perceptron:
    def __init__(self):
        pass

    def train(self, inputs, outputs, learning_rate=0.1, epochs=1000):
        # pesos aleatórios simples
        w1, w2, bias = 0.5, -0.3, 0.1

        for _ in range(epochs):
            for j in range(len(inputs)):
                x1, x2 = inputs[j]
                y = outputs[j][0]
                z = w1 * x1 + w2 * x2 + bias
                sigmoid = 1 / (1 + exp(-z))
                error = y - sigmoid
                w1 += learning_rate * error * x1
                w2 += learning_rate * error * x2
                bias += learning_rate * error

        return w1, w2, bias

    def predict(self, weights, x1, x2):
        w1, w2, bias = weights
        z = w1 * x1 + w2 * x2 + bias
        sigmoid = 1 / (1 + exp(-z))
        return 1 if sigmoid > 0.5 else 0

if __name__ == "__main__":
    inputs  = [[0,0],[0,1],[1,0],[1,1]]
    outputs = [[0],[1],[1],[1]]  # OR

    p = Perceptron()
    weights = p.train(inputs, outputs, learning_rate=0.1, epochs=1000)

    print("Pesos finais:", weights)
    for x in inputs:
        print(x, "->", p.predict(weights, x[0], x[1]))
