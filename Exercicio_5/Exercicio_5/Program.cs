using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_5
{
    class Program
    {
        static void Main(string[] args)
        {
            /*  Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
                Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
                essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
                */

            // Declarando variavéis
            int n;
            int numeroInteiros;
            int countIn = 0;
            int countOut = 0;

            // Declarando as vezes que vai ser inserido os números inteiros
            Console.Write("Informe a quantidade de vezes que o será inserido os números: ");
            n = Int32.Parse(Console.ReadLine());
            Console.Clear();

            // Inserção dos números inteiros 
            for (int i = 1; i<=n; i++)
            {
                Console.Write( i + ": Insira um número inteiro: " );
                numeroInteiros = Int32.Parse(Console.ReadLine());
                // verificando se o número inserido esta entre 10 e 20
                if (numeroInteiros >= 10 && numeroInteiros <= 20)
                {
                    countIn++;
                }
                else
                {
                    countOut++;
                }
            }

            Console.Write("\nSegue a saída... \n\n");
            // Exibindo quantas vezes foi inserido os números dentro e fora do intervalo entre 10 e 20
            Console.WriteLine(countIn + " in "
                +"\n"
                + countOut + " out ");

            Console.ReadLine();
        }
    }
}
