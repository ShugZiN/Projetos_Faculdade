Enviei 2 arquivos diferentes do código do perceptron! 
Sendo o 1º Alterado, e o 2º corrigido, pois eu não consegui fazer o original rodar em minha máquina!
E troquei o "numpy" para "math" pois não estava conseguindo fazer rodar com o uso do "numpy"

Perguntas :
1- Varie a taxa de aprendisado e verifique o impacto no treinamento

2- Varie a quantidade de epocas e avalie o impacto no treinamento

3- Testar com a porta AND (alterar o padrão de saída do treinamento -- outputs)

4- Extraia a função de ativação para um novo método

5- Altere a função de ativação para a função DEGRAU -- avalie se houve impacto na qualidade das decisões.

6- Altere o algoritmo para receber três entradas;

Respostas :
1 - Pelo oque eu entendi, valores pequenos apresentam um aprendizado lento, enquanto valores grandes o faz oscilar

2 - Mais epócas (epochs) ter, mais treinamento será obtido.

3- Testado, e foi definido na parte de outputs_and = outputs_and = [[0],[0],[0],[1]]

4- Metodo activate()

5- Implementado em : no activate() com if self.activation_type == "step".

6- Adicionei as 3 entradas, onde foram destacadas como : Perceptron(n_inputs=3) / inputs3 / outputs_and3
