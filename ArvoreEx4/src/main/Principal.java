package main;

import br.edu.fateczl.arvoreint.Arvore;

public class Principal {
    public static void main(String[] args) {
        int[] valores = {7, 8, 3, 4, 2, 1, 6, 5};
        
        // Inicialização da Árvore de Busca Binária
        Arvore arvore = new Arvore();
        
        // Inserção dos dados do vetor na árvore
        for (int valor : valores) {
            arvore.insert(valor);
        }
        
        System.out.println("Atravessamento pré-fixado (antes da remoção):");
        try {
            arvore.prefixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Remoção dos elementos 7 e 6
        try {
            arvore.remove(7);
            arvore.remove(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento pré-fixado (após a remoção):");
        try {
            arvore.prefixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento in-fixado (após a remoção):");
        try {
            arvore.infixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento pós-fixado (após a remoção):");
        try {
            arvore.postfixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

