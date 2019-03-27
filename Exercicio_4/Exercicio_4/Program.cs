using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio_4
{
    class Program
    {
        static void Main(string[] args)
        {
            /*  Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
                incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
                impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 
            */

            // Declarando variavéis

            int senhaValida = 2002;
            int tentativa = 0;

            do
            {
                // Inserindo tentativa de senha
                Console.Write("Informe a senha para acesso: ");
                tentativa = Int32.Parse(Console.ReadLine());

                // Verificando se os dados digitados são corretos
                if (tentativa == senhaValida)
                {
                    Console.WriteLine("\nAcesso permitido!");
                    Console.ReadLine();
                }   //Senão são tens que digitar novamente
                    else
                {
                    Console.WriteLine("\nAcesso negado! Senha incorreta.");
                    Console.ReadLine();
                }
                Console.Clear();
            } while (tentativa != senhaValida);
               

        }
    }
}
