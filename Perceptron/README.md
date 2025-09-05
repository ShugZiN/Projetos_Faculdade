PERGUNTAS E RESPOSTAS!!!

1- O Perceptron é um modelo matemático inspirado no neurônio humano. Ele recebe valores de entrada, multiplica por pesos, soma com um viés (bias) e lá decide se a saída será 1 ou 0. 
E ele foi o primeiro modelo de rede neural artificial, que abriu caminhos para as redes neurais mais modernas. E para o desenvolvimento de IA

2- Penso que dizer que o perceptron é um classificador linear significa que ele só consegue separar dados usando uma reta, ou até plano, em dimensões maiores.
Suas limitaçoes são : Só resolve problemas linearmente separáveis, como separar pontos vermelhos e azuis com uma linha.
Ele não consegue resolver problemas mais complexos, como o famoso XOR, que precisa de várias camadas.

3- Já no codigo, analisei que não há treinamento. Ele apenas: 
Calcula a soma ponderada dos inputs com os pesos e bias (perceptron_input).
Usa uma função de ativação simples (retorna 1 se ≥ 0, senão 0).
Nós mostra o resultado.

4- Um exemplo simples e MUITO útil seria um filtro de spam em e-mails, algo que incomoda muito.
Entradas: quantidade de links, palavras suspeitas, uso de letras maiúsculas etc.
Saída: 1 = spam / 0 = não spam.
Minha justificativa : Esse é um problema básico, que incomoda muitas pessoas e de certa forma atrapalha, e que pode ser resolvido com separação linear, sem precisar de modelos complexos.
