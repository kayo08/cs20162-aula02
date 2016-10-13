/*
Copyright (c) 2016. Kayo Martins Freitas
 */
package com.github.kayo08.Aula02;

/**
 *Esta classe está destinada para a implementação dos algoritmos listados nas
 * listas "aula-2" e "aula-3" a pedido do professor
 * Fábio Nogueira - Construção de Software - UFG/INF.
 *
 * @author k8_ma
*/

//Algoritmos presente na lista "aula-2":

public class operacoes {
    //Algoritmos presente na lista "aula-2"

    /**
     * Algoritmo para calcular a soma dos primeiro numeros naturais.
     *
     * @param n é um numero maior que 1 e a quatidade de numeros que serão
     * somados.
     *
     * @return Valor da somatoria dos primeiros numeros naturais determinado.
     */
    public static int somaNaturais(int n) {
        int i = 2;
        int s = 1;

        if (n < 1) {
            throw new IllegalArgumentException("ERRO: Numero menor que 1");
        }

        else{

            while (i <= n){
                s = s + i;
                i++;
            }
            return s;
        }
    }

    /**
     * Um algoritmo que produz o produto de dois inteiros usando a menor
     * quantidade de somas é fornecido abaixo.
     *
     * @param a Numero inteiro positivo, que será multiplicado por b.
     * @param b Numero inteiro positivo, que será multiplicado por a.
     *
     * @return O produto de a * b.
     */
    public static int produto(int a, int b) {
        int TotalParcelas = a;
        int Parcelas = b;
        int s = 0;
        int i = 1;

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("ERRO: Um dos valores ou ambos apresentao numero menor que 0.");
        }

        else {

            if (b < a){
                TotalParcelas = b;
                Parcelas = a;
            }

            while (i <= TotalParcelas) {
                s = s + Parcelas;
                i++;
            }

            return s;
        }
    }

    /**
     * Algoritmo que implementa a potência usando apenas somas, reutilizando o
     * algoritmo Produto.
     * 
     * @param x Valor caracterizado como a base da potenciação.
     * @param y Valor caracterizado como o expoente da potenciação.
     * 
     * @return O valor da potencia de x elevado a y.
     */
    public static int potencia(int x, int y) {
        int potencia = 1;
        int i = 1;

        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("ERRO: Um dos valores ou ambos apresentao valores menores que 0");
        }

        else {
            while (i <= y) {
                potencia = produto(potencia, x);
                i++;
            }
            return potencia;
        }
    }

    /**
     * Algoritmo que verfica se o numero informado e apresenta esse propriedade.
     *
     * @param n Valor do numero que será verificado se apresenta a propriedade.
     *
     * @return Valor do de n caso seja caracterizado como Propriedade3025 ou
     * retornara outro valor qualquer diferente de n caso não seje.
     * caracterizado.
     */
    public static int propriedade3025(int n) {
        int i = n / 100;
        int j = n % 100;

        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("ERRO: Numero MENOR que 0 ou MAIOR que 9999");
        }

        else {
            return potencia((i + j), 2);
        }
    }

    /**
     * Algoritmo semelhante a Propriedade3025, so que verificará se o numero
     * solicitado e caracterizado como Propriedade153.
     *
     * @param n Valor maior/igual a 0 e menor/igual a 9999 que será verificado
     * se é uma Propriedade153.
     *
     *@return Valor de n caso seja Propriedade 153, ou retorna qualquer outro
     * numero diferente de n caso não seja Propriedade 153.
     */
    public static int propridade153 (int n) {
        int i = n / 100;
        int j = (n - (100 * i)) / 10;
        int k = n / 10;

        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("ERRO: Numero MENOR que 0 ou MAIOR que 9999");
        }

        else {
            n = potencia(i, 3) + potencia(j, 3) + potencia(k, 3);

            return n;
        }
    }

    /**
     * Algoritmo que verifica se o número  solicitado é primo.
     *
     * @param n Número maior que 1 que será verificado se é ou não um número.
     * primo.
     *
     * @return Falso caso o valor de n não seje primo ou Verdadeiro caso n seja
     * primo.
     */
    public static boolean primo(int n) {
        int i = 2;

        if (n < 1) {
            throw new IllegalArgumentException("ERRO: Numero MENOR que 1");
        }

        else {
            while (i <= (n - 1)) {
                if (n % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
            }
    }

    /**
     * Algoritmo que mostra atravez do método Crivo Eratostenes quais são os
     * numero primos dentro do intervalo definido por n.
     *
     * @param a Vetor onde sera armazenados os numeros defidos pelo tamanho de n.
     * @param n Variavel responsavel por determinar o tamanho do vetor a.
     *
     * @return Valores armazenados no vetor 'a' que representam os número primos.
     */
    public static int[] crivoEratostenes(int a[], int n) {
        int i = 2;
        int c;
        int aux = 1;
        while (aux <= n) {
            if (n < 1 || a[aux] != 0) {
                throw new IllegalArgumentException ("ERRO: 'n' MENOR que 1 e/ou 'a' diferente de 0");
            }

            else {
                while (i <= (n / 2)) {
                    if (a[i] == 0) {
                        c = i + i;
                        while (c <= n) {
                            a[c] = 1;
                            c = c + i;
                        }
                    }
                    i++;
                }
            }
        }
        return a;
    }

    /**
     * Algoritmo que calcula o maior divisor comum entre 2 numeros.
     *
     * @param a Valor maior/igual a b que na qual sera calculado junto de b o MDC.
     * @param b Valor maior que 0 que na qual será calculado junto de a o MDC.
     *
     * @return O valor referente ao Maior Divisor Comum de 'a' e 'b'.
     */
    public static int mDC (int a, int b) {
        int m;

        if (a < b || b < 0) {
            throw new IllegalArgumentException("ERRO: Valor de 'a' menor que 'b' e/ou 'b' menor que 0");
        }

        else {
            while (b != 0) {
                m = a % b;
                a = b;
                b = m;
            }
            return a;
        }
    }

    /**
     * Algoritmo que calcula o Maior Divisor Comum, porem se limita ao uso de
     * subtração.
     *
     * @param a Valor maior/igual que 'b' que será calculado junto com 'b' o MDC.
     * @param b Valor maior que 0 que sera calculado o MDC junto com 'a'.
     *
     * @return O Maior Divisor Comum de 'a' e 'b'.
     */
    public static int mDCsubtracoes (int a, int b) {
        if (a < b || b < 0) {
            throw new IllegalArgumentException("ERRO: Valor de 'a' menor que 'b' e/ou 'b' menor que 0");
        }

        else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                }

                else {
                    b = b - a;
                }
            }
            return a;
        }
    }

    /**
     * Algoritmo que calcula o n-ésiomo número harmônico de 'n'.
     *
     * @param n número maior ou igual a 1 na qual sera calculado o seu n-ésimo
     * numero.
     *
     * @return o número harmonico de 'n'.
     */
    public static int numeroHarmonico (int n) {
        int i = 2;
        int s = 1;

        if (n < 1) {
            throw new IllegalArgumentException("ERRO: Numero MENOR que 1");
        }

        else {
            while (i <= n) {
                s = s + (1 / i);

                i++;
            }
            return s;
        } 
    }

    //Algoritmos presente na lista "aula-3":

    /**
     * Algoritmo que calcula o somatório dos primeiro números naturais.
     *
     * @param n número maior ou igual a 1, na qual representa até que número
     * será somado.
     *
     * @return O número da somatoria dos numero representando por 'n'.
     */
    public static float somatoriosElementar (int n) {
        int i = 1;
        float s = 0;
        float d;

        if (n < 1) {
            throw new IllegalArgumentException("ERRO: Numero MENOR que 1");
        }

        else {
            while (n >= i) {
                d = 1 + (i * i);
                s = s + (1 / d);
                i++;
            }
            return s;
        }
    }

    /**
     * Algoritmo que calcula o numero de pi.
     *
     * @param n Número maior ou igual a 1. Representa o limite prático para a
     * quantidades de termos do somatorio.
     *
     * @return O resultado de pi da somatoria dos termos estabelecido por 'n'.
     */
    public static int pi (int n) {
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;

        if (n < 1) {
            throw new IllegalArgumentException("ERRO: Numero MENOR que 1");
        }

        else {
            while (i <= n) {
                d = d + 2;
                s = -1 * s;
                p = p + ((4 * s) / d);
                i++;
            }
            return p;
        }
    }

    /**
     * Algoritmo que calcula o fatorial de um numero natural.
     *
     * @param n Número maior ou igual a 1, na qual será calculado seu número
     * fatorial.
     *
     * @return O número fatorial de 'n'.
     */
    public static int fatorial(int n) {
        int i = 2;
        int f = 1;

        if (n < 1) {
            throw new IllegalArgumentException("ERRO: Numero MENOR que 1");
        }

        else {
            while (n >= i) {
                f = f * i;
                i++;
            }
            return f;
        }
    }

    /**
     * Algoritmo que calcula o logaritmo natural de 'n'.
     *
     * @param n Número maior ou igual a 1, na qual será caculado seu logaritmo
     * natural.
     * @param k Número maior ou igual a 2, que representa o somatorio para o
     * logaritmo.
     *
     * @return O valor do logaritmo natural de 'n'.
     */
    public static int logaritmoNatual(int n, int k) {
        int i = 2;
        int e = n + 1;
        int p;
        int f;

        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("ERRO: 'n' menor que 1 e/ou 'k' menor que 2");
        }

        else {
            while (k >= i) {
                p = potencia(n, i);
                f = fatorial(i);
                e = e + (p / f);
                i++;
            }
            return e;
        }
    }

    /**
     * Algoritmo que calcula a razão aurea.
     *
     * @param x Número maior ou igual a 0, que será um dos números iniciais para
     * o processo.
     * @param y Númeor maior que 'x', que será o outro número para o processo da
     * razão aurea.
     * @param k Número maior que 0, que será o valor que determinará o limite
     * ate onde deverá ser calculado a razão aurea.
     *
     * @return O valor da razão aurea.
     */
    public static int razaoAurea(int x, int y, int k) {
        int c = y;
        int a = x;
        int t;
        int i = 1;

        if (x < 0 || x > y || k < 0) {
            throw new IllegalArgumentException("ERRO: 'x' menor que 0 e/ou 'x' menor que 'y' e/ou 'k' menor que 0");
        }

        else {
            while (k >= i) {
                t = c;
                c = c + a;
                a = t;

                i++;
            }

            return c / a;
        }
    }

    /**
     * Algoritmo que calcula o quadro perfeito.
     *
     * @param k Número maior oi igual a 1, na qual será calculado seu quadrado
     * perfeito.
     *
     * @return O valor do quadrado perfeito de 'k'.
     */
    public static int quadradoPerfeito (int k) {
        int i = 1;
        int q = 1;

        if (k < 1) {
            throw new IllegalArgumentException("ERRO: Valor de 'k' é menor que 1");
        }

        else {
            while (q < k) {
                i = i + 2;
                q = q + i;
            }
            k = q;
            return k;
        }
    }

    /**
     * Calcula o resto da divisão de x/y.
     *
     * @param x Número maior ou igual a 0, representado pelo dividendo.
     * @param y Número maior que 0, repsentado pelo divisor.
     *
     * @return O valor do resto da divisão de x/y.
     */
    public static int Mod(int x, int y) {
        int s;

        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("ERRO: O valor de 'x' e/ou 'y' está menor que 0");
        }

        else {
            s = x;
            while (y <= s) {
                s = s - y;
            }

            return s;
        }
    }

    /**
     * Algoritmo que calcula o valor da raiz quadrada, obtido pelo metodo
     * babilonico.
     *
     * @param n Número maior que 0, que será calculado o valor da sua raiz
     * quadrada.
     * @param i Número maior que 0, onde quanto maior o seu valor maior será a
     * aproximação da raiz desejada.
     *
     * @return O valor da raiz quadrada.
     */
    public static int Raiz(int n, int i) {
        int r = 1;

        if (n < 0 || i < 0) {
            throw new IllegalArgumentException("ERRO: O valor de 'n' é menor que 0");
        }

        else {
            while (i >= 0) {
                r = (r + (n / r)) / 2;
                i--;
            }

            return r;
        }
    }

    /**
     * Algoritmo que avalia um polinômio com a regra de horner.
     *
     * @param x
     * @param g
     * @param a
     * @return 
     */
    public static int Horner(int x, int g, int a[]) {
        int p = a[g];
        int i = g - 1;
        
        if (g < 1) {
            throw new IllegalArgumentException("ERRO: O valor de 'g' e MENOR que 1");
        }

        else {
            while (i >= 0) {
                p = (p * x) + a[i];
                i--;
            }

            return p;
        }
    }

    /**
     * Algoritmo que calcula que obtem o n-ésimo número de Fibonacci.
     *
     * @param n Número maior ou igual a 0, na qual será calculado o seu n-ésimo.
     * numero.
     *
     * @return O valor do n-ésimo número de 'n'.
     */
    public static int Fibonacci(int n) {
        int a = 0;
        int c = 1;
        int t;
        int i = 2;

        if (n < 0) {
            throw new IllegalArgumentException("ERRO: O valor de 'n' e MENOR que 0");
        }

        else {
            if (n == 0 || n == 1) {
                return n;
            }

            else {
                while (i <= n) {
                    t = c;
                    c = c + a;
                    a = t;
                    i++;
                }
            }

            return c;
        }
    }
}