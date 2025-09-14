1. Média = 5000 min e Desvio Padrão = 0.050 min

2. Quando temos apenas 1 caixa, todos os clientes passam sequencialmente, e o tempo médio de conclusão permanece igual à média de atendimento de cada cliente (≈ 5 min). Com 2 caixas, o trabalho é dividido em paralelo: cada caixa atende ~50 clientes, e o tempo médio global cai para aproximadamente 5 / 2 = 2,5 min. Com 3 caixas, o paralelismo aumenta ainda mais: cada caixa atende ~33 clientes, e a média fica próxima de 5 / 3 ≈ 1,67 min. Portanto, mais caixas reduzem significativamente o tempo médio de atendimento, porque há divisão da carga de trabalho entre servidores paralelos.

3. O valor da média global se mantém praticamente constante em torno de µ = 5,0 min, já que a distribuição continua centrada em µ. O que muda é o desvio-padrão das médias: quanto maior o σ dos tempos individuais, maior a dispersão das médias obtidas nas rodadas. A relação é:

- Para sigma = 0,25 -> 0,025
- Para sigma = 0,25 -> 0,010
- Para sigma = 0,25 -> 0,020

Ou seja, aumentar o sigma não altera a média, mas aumenta a variabilidade dos resultados médios.

4. O simulador é considerado estocástico porque os tempos de atendimento são gerados de forma aleatória a partir de uma distribuição normal. Isso significa que, mesmo configurando os mesmos parâmetros, cada execução produz resultados diferentes devido à presença de variáveis aleatórias.

Esse comportamento reflete situações reais: em um supermercado, o tempo de atendimento de cada cliente nunca é exatamente igual, variando por fatores como quantidade de produtos, experiência do atendente, problemas no caixa etc. Ou seja, o simulador aproxima-se da realidade ao incorporar essa incerteza probabilística.