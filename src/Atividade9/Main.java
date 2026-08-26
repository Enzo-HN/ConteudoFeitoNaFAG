package Atividade9;
import Atividade9.pokemons.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int opcao = 0;
    static Batalha batalha = new Batalha();
    static List<Treinador> treinadores = new ArrayList<>();
    static List<Pokemon> pokemons = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("\nSISTEMA DE TREINADORES E POKEMON");
            System.out.println("1 - Cadastrar treinador");
            System.out.println("2 - Cadastrar Pokemon");
            System.out.println("3 - Associar Pokemon a um treinador");
            System.out.println("4 - Listar treinadores cadastrados");
            System.out.println("5 - Listar Pokemon cadastrados");
            System.out.println("6 - Exibir os Pokemon de um treinador");
            System.out.println("7 - Realizar batalha entre Pokemon");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("\nCadastro de Treinador");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Cidade de origem: ");
                String cidade = scanner.nextLine();

                treinadores.add(new Treinador(nome, idade, cidade));
                System.out.println("Treinador cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n-- Cadastro de Pokemon --");
                System.out.println("1 - Fogo | 2 - Água | 3 - Grama");
                System.out.print("Tipo: ");
                int tipo = scanner.nextInt();
                scanner.nextLine();

                if (tipo < 1 || tipo > 3) {
                    System.out.println("Tipo inválido. Cadastro cancelado.");
                } else {
                    System.out.print("Nome do Pokemon: ");
                    String nome = scanner.nextLine();
                    System.out.print("Pontos de vida (HP): ");
                    int hp = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ataque: ");
                    int atk = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Defesa: ");
                    int defesa = scanner.nextInt();
                    scanner.nextLine();

                    Pokemon novoPokemon;
                    if (tipo == 1) {
                        novoPokemon = new PokemonFogo(hp, nome, atk, defesa);
                    } else if (tipo == 2) {
                        novoPokemon = new PokemonAgua(hp, nome, atk, defesa);
                    } else {
                        novoPokemon = new PokemonGrama(hp, nome, atk, defesa);
                    }
                    pokemons.add(novoPokemon);
                    System.out.println("Pokemon cadastrado com sucesso!");
                }

            } else if (opcao == 3) {
                System.out.println("\n-- Associar Pokemon a um Treinador --");
                if (treinadores.isEmpty() || pokemons.isEmpty()) {
                    System.out.println("Cadastre pelo menos um treinador e um Pokemon primeiro.");
                } else {
                    for (int i = 0; i < treinadores.size(); i++) {
                        System.out.println((i + 1) + ". " + treinadores.get(i));
                    }
                    System.out.print("Número do treinador: ");
                    int it = scanner.nextInt() - 1;
                    scanner.nextLine();

                    for (int i = 0; i < pokemons.size(); i++) {
                        System.out.println((i + 1) + ". " + pokemons.get(i));
                    }
                    System.out.print("Número do Pokemon: ");
                    int ip = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (it < 0 || it >= treinadores.size() || ip < 0 || ip >= pokemons.size()) {
                        System.out.println("Treinador ou Pokemon inválido.");
                    } else {
                        Treinador treinador = treinadores.get(it);
                        Pokemon pokemon = pokemons.get(ip);
                        treinador.adicionarPokemon(pokemon);
                        System.out.println(pokemon.getNome() + " foi associado ao treinador " + treinador.getNome() + "!");
                    }
                }

            } else if (opcao == 4) {
                System.out.println("\nTreinadores Cadastrados");
                if (treinadores.isEmpty()) {
                    System.out.println("Nenhum treinador cadastrado ainda.");
                } else {
                    for (int i = 0; i < treinadores.size(); i++) {
                        System.out.println((i + 1) + ". " + treinadores.get(i));
                    }
                }

            } else if (opcao == 5) {
                System.out.println("\nPokemon Cadastrados");
                if (pokemons.isEmpty()) {
                    System.out.println("Nenhum Pokemon cadastrado ainda.");
                } else {
                    for (int i = 0; i < pokemons.size(); i++) {
                        System.out.println((i + 1) + ". " + pokemons.get(i));
                    }
                }

            } else if (opcao == 6) {
                System.out.println("\n-- Pokemon de um Treinador --");
                if (treinadores.isEmpty()) {
                    System.out.println("Nenhum treinador cadastrado ainda.");
                } else {
                    for (int i = 0; i < treinadores.size(); i++) {
                        System.out.println((i + 1) + ". " + treinadores.get(i));
                    }
                    System.out.print("Número do treinador: ");
                    int it = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (it < 0 || it >= treinadores.size()) {
                        System.out.println("Treinador inválido.");
                    } else {
                        Treinador treinador = treinadores.get(it);
                        System.out.println("\nPokemon de " + treinador.getNome() + ":");
                        treinador.listarPokemons();
                    }
                }

            } else if (opcao == 7) {
                System.out.println("\n-- Batalha entre Pokemon --");
                if (treinadores.size() < 2) {
                    System.out.println("Cadastre pelo menos dois treinadores com Pokemon associado.");
                } else {
                    for (int i = 0; i < treinadores.size(); i++) {
                        System.out.println((i + 1) + ". " + treinadores.get(i));
                    }

                    System.out.print("Treinador 1: ");
                    int it1 = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Treinador 2: ");
                    int it2 = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (it1 < 0 || it1 >= treinadores.size() || it2 < 0 || it2 >= treinadores.size() || it1 == it2) {
                        System.out.println("Treinadores inválidos.");
                    } else {
                        Treinador t1 = treinadores.get(it1);
                        Treinador t2 = treinadores.get(it2);

                        if (t1.getPokemons().isEmpty() || t2.getPokemons().isEmpty()) {
                            System.out.println("Os dois treinadores precisam ter Pokemon associado.");
                        } else {
                            System.out.println("Pokemon de " + t1.getNome() + ":");
                            t1.listarPokemons();
                            System.out.print("Escolha o Pokemon de " + t1.getNome() + ": ");
                            int ip1 = scanner.nextInt() - 1;
                            scanner.nextLine();

                            System.out.println("Pokemon de " + t2.getNome() + ":");
                            t2.listarPokemons();
                            System.out.print("Escolha o Pokemon de " + t2.getNome() + ": ");
                            int ip2 = scanner.nextInt() - 1;
                            scanner.nextLine();

                            if (ip1 < 0 || ip1 >= t1.getPokemons().size() || ip2 < 0 || ip2 >= t2.getPokemons().size()) {
                                System.out.println("Pokemon inválido.");
                            } else {
                                Pokemon p1 = t1.getPokemons().get(ip1);
                                Pokemon p2 = t2.getPokemons().get(ip2);
                                batalha.comecarBatalha(t1, p1, t2, p2);
                            }
                        }
                    }
                }

            } else if (opcao == 0) {
                System.out.println("Encerrando o sistema. Até mais!");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}