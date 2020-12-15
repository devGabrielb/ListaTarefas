import java.util.Scanner;

import controllers.TarefaController;
import controllers.userController;
import models.Tarefas;
import models.Usuario;

public class Main {
    
    public static void main(String[] args){
        userController userController = new userController();
        TarefaController tarefaController = new TarefaController();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        
        int  menu = 0;



        System.out.println("Login ou cadastro");

        System.out.println("Digite o nome: ");
        String nome = entradaString.nextLine();

        System.out.println("Digite o email: ");
        String email = entradaString.nextLine();

        Usuario usuarioLogin = new Usuario(nome, email);
        userController.login(usuarioLogin);

        do{ exibirMenu();
            menu = entrada.nextInt();
            
            switch(menu){
                
                case 1: 
                    do{
                       exibirMenu1();
                       menu = 0;
                       menu = entrada.nextInt();
                       switch (menu){
                           case 1: 
                            //cadastro do cliente
                               System.out.println("Digite o nome: ");
                               nome = entradaString.nextLine();
                               System.out.println("Digite o email: ");
                               email = entradaString.nextLine();
                             
                              userController.create(nome, email);
                               break;
                               
                           case 2: 
                               
                               //cadastro de tarefa
                               System.out.println("titulo: ");
                               String titulo = entradaString.nextLine();
                               System.out.println("Descrição: ");
                               String descricao = entradaString.nextLine();
                               System.out.println("Prioridade(alta, média, baixa): ");
                               String prioridade = entradaString.nextLine();
                               System.out.println("Categoria: ");
                               String categoria = entradaString.nextLine();
                              
                               
                               tarefaController.create(
                                   new Tarefas(
                                       titulo, 
                                       descricao, 
                                       prioridade, 
                                       categoria)
                                    );
                               break;
                               
                               case 0: 
                               break;    
                               
                           default: 
                                  System.out.println("Opção inválida!");
                       } 
                       
                       
                       
                    }while(menu!=0);
                   
                        break;
                    
                case 2: 
                    
                          do{
                       exibirMenu2();
                       menu = 0;
                       menu = entrada.nextInt();
                       switch (menu){
                           case 1: 
                           System.out.println("\n\n\n");
                           System.out.println("LISTAGEM DE TAREFAS DO USUÁRIO");
                           for(Usuario usuario : userController.getUsuarios()){
                                System.out.println("USUÁRIO");
                                System.out.println("NOME: "+usuario.getName());
                                System.out.println("EMAIL: "+usuario.getEmail());
                                System.out.println("\n\n\n");
                           }
                               
                               break; 
                           case 2: 
                                System.out.println("\n\n\n");
                               System.out.println("LISTAGEM DE TAREFAS DO USUÁRIO");
                               for(Tarefas tarefa :tarefaController.getTarefaUsuario()){
                                   
                                    System.out.println("TITULO: "+tarefa.getTitulo());
                                    System.out.println("DESCRIÇÃO: "+tarefa.getDescricao());
                                    System.out.println("PRIORIDADE: "+tarefa.getPrioridade());
                                    System.out.println("CATEGORIA: "+tarefa.getCategoria());
                                    
                                    System.out.println("\n\n\n");
                               }
                               break;
                               
                            case 0: 
                                break;          
                               
                           default: 
                                  System.out.println("Opção inválida!");
                       } 
                    
                       
                       
                    }while(menu != 0);
                   
                    
                    break;
                    
                case 3: 
                   
                    do{
                       exibirMenu3();
                       menu = entrada.nextInt();
                       switch (menu){
                           case 1: 
                            //excluir clientes
                              
                               System.out.println("---EXCLUSÃO DE USUÁRIO---");
                               System.out.println("Digite o email do usuário: ");
                               email = entradaString.nextLine();
                               userController.deleteUsuario(email);
                               
                       
                                   
                               
                               break; 
                           case 2: 
                               
                               System.out.println("---EXCLUSÃO DE TAREFAS---");
                               System.out.println("Digite o titulo da tarefa: ");
                               String tarefaTitulo = entradaString.nextLine();
                               
                               tarefaController.deleteTarefa(tarefaTitulo);
                               
                       
                           
                               
                               break;
                            case 0: 
                               break;    
                               
                               
                           default: 
                                  System.out.println("Opção inválida!");
                       
                       
                       }
                       
                    }while(menu!=0);
                   
                    
                    break;
                    
                    
                    
                case 0: 
                   
                    System.out.println("Saindo...");
                    break;     
                
                default: 
                    System.out.println("Opção de menu inválida!");
            }
        
        
        
        
        }while(menu != 5);
        
        
        }
        static void exibirMenu(){
          System.out.println("---------LISTA DE TAREFAS---------");   
          System.out.println("1 - CADASTRAR");
          System.out.println("2 - LISTAR");
          System.out.println("3 - EXCLUIR");
          System.out.println("4 - PESQUISAR");
          System.out.println("5 - SAIR");
          System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA====>  ");
          
        }
        static void exibirMenu1(){
          System.out.println("---CADASTRO---");
          System.out.println("1 - USUARIO");
          System.out.println("2 - TAREFA");
          System.out.println("0 - SAIR");
          System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA====>  ");
        }
        
        static void exibirMenu2(){
          System.out.println("---LISTAGEM---");
          System.out.println("1 - USUARIO");
          System.out.println("2 - TAREFAS");
          System.out.println("0 - SAIR");
          System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA====>  ");
        }
        
        static void exibirMenu3(){
          System.out.println("---EXCLUSÃO---");
          System.out.println("1 - USUARIOS");
          System.out.println("2 - TAREFAS");
          System.out.println("0 - SAIR");
          System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA====>  ");
        }
        
    }
   





