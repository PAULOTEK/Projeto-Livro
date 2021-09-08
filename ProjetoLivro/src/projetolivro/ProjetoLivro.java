/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Paulo
 */
public class ProjetoLivro {
        public static void main(String[] args) {
            Pessoa[] p = new Pessoa[2];
            Livro [] l = new Livro[3];

            p[0] = new Pessoa("Paulo",25,"M");
            p[1] = new Pessoa("Deny",22,"F");

            l[0] = new Livro(" Sherlok", "jon ",500, p[0]);
            l[1] = new Livro("12 batidas do relogio", "Merlin ",300, p[1]);
            l[2] = new Livro("500 Passos de vc", "klaquer ",200, p[1]);

            l[0].abrir();
            l[0].folhear(100);
            l[0].avançarPag();

            System.out.println(l[0].detalhes());

        }
    
}
