using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_2
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
               casas decimais conforme exemplos.
               Fórmula: area = π.raio²
               Considere o valor de π = 3.14159
               */

            // Declarando variaveis
            double raio, area = 0;
                        
            Console.Write("Informe o raio do círculo: ");
            raio = Double.Parse(Console.ReadLine());

            // Calculando a área do círculo
            area = (raio * raio) * 3.14159;

            // Exibindo resultado
            Console.Write("\nSegue a fórmula: " + raio +"² x 3.14159 = "+ area);
            Console.ReadLine();
        }
    }
}
