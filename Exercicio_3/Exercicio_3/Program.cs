using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_3
{
    class Program
    {
        static void Main(string[] args)
        {
            /*  Com base na tabela de preços ao lado( Vou inserir a tabela no código), faça
                um programa que leia o código de um item e a
                quantidade deste item. A seguir, calcule e
                   mostre o valor da conta a pagar. 
             */

            // Declarando variaveis

            int cod, qtd;
            float pag = 0;
            
            // Vetores
            int[] codL = new int[5];
            float[] price = new float[5];
            String[] lanche = new string[5];

            // Preenchendo vetores
            lanche[0] = "Cachorro Quente";
            lanche[1] = "X - Salada";
            lanche[2] = "X - Bacon";
            lanche[3] = "Torrada simples";
            lanche[4] = "Refrigerante";

            price[0] = 4;
            price[1] = 4.5f;
            price[2] = 5;
            price[3] = 2;
            price[4] = 1.5f;


            float valorF = 0;

            // Exibindo tabela de produtos e preços
            Console.WriteLine(" Código |    Lanche        |       Preço");
            for (int i = 0; i <5; i++)
            {
                codL[i] = i;
                Console.Write(codL[i]);
                Console.Write("         " + lanche[i] +"        ");
                Console.Write("R$ " + price[i]);
                Console.Write("\n\n");       
            }

            // Escolhendo o produto
            Console.WriteLine("Informe o código do produto: ");
            cod = Int32.Parse(Console.ReadLine());

            Console.WriteLine("Informe a quantidade de porções: ");
            qtd = Int32.Parse(Console.ReadLine());

            // Calculando o valor a ser pago
            pag = price[cod] * qtd;


            // Exibindo na tela o valor a ser pago
            Console.WriteLine("O valor final para pagar: R$" + pag);

            Console.ReadLine();

        }      
    }
}
