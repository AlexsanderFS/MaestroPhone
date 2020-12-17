/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.maestrophone;

import br.edu.ifnmg.maestrophone.entidade.Bateria;
import br.edu.ifnmg.maestrophone.entidade.Camera;
import br.edu.ifnmg.maestrophone.entidade.Celular;
import br.edu.ifnmg.maestrophone.entidade.Cliente;
import br.edu.ifnmg.maestrophone.entidade.Display;
import br.edu.ifnmg.maestrophone.entidade.Dispositivo;
import br.edu.ifnmg.maestrophone.entidade.Funcionario;
import br.edu.ifnmg.maestrophone.entidade.Memoria;
import br.edu.ifnmg.maestrophone.entidade.Processador;
import br.edu.ifnmg.maestrophone.entidade.TransacaoFinanceira;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author maestro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Bateria> listaBateria = new ArrayList<>();
    private static ArrayList<Camera> listaCamera = new ArrayList<>();
    private static ArrayList<Display> listaDisplay = new ArrayList<>();
    private static ArrayList<Memoria> listaMemoria = new ArrayList<>();
    private static ArrayList<Processador> listaProcessador = new ArrayList<>();
    private static ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    private static ArrayList<Cliente> listaCliente = new ArrayList<>();
    private static ArrayList<Celular> listaCelular = new ArrayList<>();
    private static ArrayList<TransacaoFinanceira> listaTransacao = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {                       
        carregarDados();
        loginFuncionario();                
    }
    
    private static void carregarDados() throws IOException {            
        carregarDadosDispositivoProcessador();
        carregarDadosDispositivoBateria();
        carregarDadosDispositivoCamera();
        carregarDadosDispositivoDisplay();
        carregarDadosDispositivoMemoria();
        carregarDadosPessoaFuncionario();
        carregarDadosPessoaCliente();
    }
            
    private static void carregarDadosDispositivoProcessador() throws IOException {
        System.out.println("Carregando dados dos processadores...");
        
        String arquivo = "dados/processador.csv";
        BufferedReader bufferedReader = null;        
        String separador = ",";                        
        
        FileReader fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        
        //Lê e ignora a primeira linha com cabeçalho das colunas
        String linha = bufferedReader.readLine();

        while((linha = bufferedReader.readLine()) != null){
            String[] colunas = linha.split(separador);
            int codDispositivo = Integer.parseInt(colunas[0]);
            String marca = colunas[1];
            int qtdEstoque = Integer.parseInt(colunas[2]);
            double valorDispositivo =  Double.parseDouble(colunas[3]);
            int qtdNucleos = Integer.parseInt(colunas[4]);
            double qtdClocks =  Double.parseDouble(colunas[5]);
            
            Processador pro = new Processador(codDispositivo, marca, qtdEstoque, valorDispositivo, qtdNucleos, qtdClocks); 
            listaProcessador.add(pro);            
        }                            
        System.out.println("Dados dos processadores carregados.");
    }
    
    private static void carregarDadosDispositivoBateria() throws IOException {
        System.out.println("Carregando dados das baterias...");
        
        String arquivo = "dados/bateria.csv";
        BufferedReader bufferedReader = null;        
        String separador = ",";                        
        
        FileReader fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        
        //Lê e ignora a primeira linha com cabeçalho das colunas
        String linha = bufferedReader.readLine();

        while((linha = bufferedReader.readLine()) != null){
            String[] colunas = linha.split(separador);
            int codDispositivo = Integer.parseInt(colunas[0]);
            String marca = colunas[1];
            int qtdEstoque = Integer.parseInt(colunas[2]);
            double valorDispositivo =  Double.parseDouble(colunas[3]);
            String tipoDaBateria = colunas[4];
            int ampere = Integer.parseInt(colunas[5]);
            
            Bateria bat = new Bateria(codDispositivo, marca, qtdEstoque, valorDispositivo, tipoDaBateria, ampere); 
            listaBateria.add(bat);            
        }                            
        System.out.println("Dados das baterias carregados.");
    }
    
    private static void carregarDadosDispositivoCamera() throws IOException {
        System.out.println("Carregando dados das cameras...");
        
        String arquivo = "dados/camera.csv";
        BufferedReader bufferedReader = null;        
        String separador = ",";                        
        
        FileReader fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        
        //Lê e ignora a primeira linha com cabeçalho das colunas
        String linha = bufferedReader.readLine();

        while((linha = bufferedReader.readLine()) != null){
            String[] colunas = linha.split(separador);
            int codDispositivo = Integer.parseInt(colunas[0]);
            String marca = colunas[1];
            int qtdEstoque = Integer.parseInt(colunas[2]);
            double valorDispositivo =  Double.parseDouble(colunas[3]);
            String tipoDaCamera = colunas[4];
            int megapixel = Integer.parseInt(colunas[5]);
            int fpsGravacao = Integer.parseInt(colunas[6]);
            String resolucaoGravacao = colunas[7];
            String resolucaoFoto = colunas[8];
            String tipoDeFlash = colunas[9];
            
            
            
            Camera cam = new Camera(codDispositivo, marca, qtdEstoque,
            valorDispositivo, tipoDaCamera, megapixel,
            fpsGravacao, resolucaoGravacao, resolucaoFoto,
            tipoDeFlash); 
            listaCamera.add(cam);            
        }                            
        System.out.println("Dados das cameras carregados.");
    }
    
    private static void carregarDadosDispositivoDisplay() throws IOException {
        System.out.println("Carregando dados dos displays...");
        
        String arquivo = "dados/display.csv";
        BufferedReader bufferedReader = null;        
        String separador = ",";                        
        
        FileReader fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        
        //Lê e ignora a primeira linha com cabeçalho das colunas
        String linha = bufferedReader.readLine();

        while((linha = bufferedReader.readLine()) != null){
            String[] colunas = linha.split(separador);
            int codDispositivo = Integer.parseInt(colunas[0]);
            String marca = colunas[1];
            int qtdEstoque = Integer.parseInt(colunas[2]);
            double valorDispositivo =  Double.parseDouble(colunas[3]);
            double polegadas =  Double.parseDouble(colunas[4]);      
            String resolucao = colunas[5];
            String tipoDisplay = colunas[6];
            String qtdCores = colunas[7];
            
            Display dis = new Display(codDispositivo, marca, qtdEstoque, valorDispositivo,
                                            polegadas, resolucao, tipoDisplay, qtdCores); 
            listaDisplay.add(dis);            
        }                            
        System.out.println("Dados dos displays carregados.");
    }
    
    private static void carregarDadosDispositivoMemoria() throws IOException {
        System.out.println("Carregando dados das memorias...");
        
        String arquivo = "dados/memoria.csv";
        BufferedReader bufferedReader = null;        
        String separador = ",";                        
        
        FileReader fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        
        //Lê e ignora a primeira linha com cabeçalho das colunas
        String linha = bufferedReader.readLine();

        while((linha = bufferedReader.readLine()) != null){
            String[] colunas = linha.split(separador);
            int codDispositivo = Integer.parseInt(colunas[0]);
            String marca = colunas[1];
            int qtdEstoque = Integer.parseInt(colunas[2]);
            double valorDispositivo =  Double.parseDouble(colunas[3]);
            double taxaDeTransferenciaHD =  Double.parseDouble(colunas[4]);
            int armazenamentoHD = Integer.parseInt(colunas[5]);
            int tamanhoRAM = Integer.parseInt(colunas[6]);
            double frequenciaRAM =  Double.parseDouble(colunas[7]);
            
            Memoria mem = new Memoria(codDispositivo, marca, qtdEstoque, valorDispositivo,
                                      taxaDeTransferenciaHD, armazenamentoHD, tamanhoRAM, frequenciaRAM); 
            listaMemoria.add(mem);            
        }                            
        System.out.println("Dados das memorias carregados.");
    }
    
    private static void carregarDadosPessoaFuncionario() throws IOException {
        System.out.println("Carregando dados dos funcionarios...");
        
        String arquivo = "dados/funcionario.csv";
        BufferedReader bufferedReader = null;        
        String separador = ",";                        
        
        FileReader fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        
        //Lê e ignora a primeira linha com cabeçalho das colunas
        String linha = bufferedReader.readLine();

        while((linha = bufferedReader.readLine()) != null){
            String[] colunas = linha.split(separador);
            String nome = colunas[0];
            String cpf = colunas[1];
            String email = colunas[2];
            String login = colunas[3];
            String senha = colunas[4];
            
            Funcionario func = new Funcionario(nome, cpf, email, login, senha); 
            listaFuncionario.add(func);            
        }                            
        System.out.println("Dados dos funcionarios carregados.");
    }
    
    private static void carregarDadosPessoaCliente() throws IOException {
        System.out.println("Carregando dados dos clientes...");
        
        String arquivo = "dados/cliente.csv";
        BufferedReader bufferedReader = null;        
        String separador = ",";                        
        
        FileReader fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        
        //Lê e ignora a primeira linha com cabeçalho das colunas
        String linha = bufferedReader.readLine();

        while((linha = bufferedReader.readLine()) != null){
            String[] colunas = linha.split(separador);
            String nome = colunas[0];
            String cpf = colunas[1];
            String email = colunas[2];
            String telefone = colunas[3];
            String rua = colunas[4];
            int numero = Integer.parseInt(colunas[5]);
            String bairro = colunas[6];
            
            Cliente func = new Cliente(nome, cpf, email, telefone, rua, numero, bairro); 
            listaCliente.add(func);            
        }                            
        System.out.println("Dados dos clientes carregados.");
    }
        
    public static void menuMaestroPhone(Funcionario func){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            System.out.println("\n\n \t\t\t---- MAESTROPHONE ----      \n");
            System.out.println("1 - Consultar Dispositivo                ");
            System.out.println("2 - Consultar Pessoa                     ");
            System.out.println("3 - Lista dispositivo preço Menor - Maior");
            System.out.println("4 - Lista dispositivo preço Maior - Menor");
            System.out.println("5 - Cadastrar Dispositivo                ");
            System.out.println("6 - Montar Smartphone                    ");
            System.out.println("7 - Efetuar Venda                        ");
            System.out.println("0 - Sair                                 ");
            System.out.println("Informe a opção:                         ");
            operacao = scanner.nextInt();
            
            if(operacao == 1){
                menuConsultaDispositivo(func);
            }else if(operacao == 2){
                menuConsultaPessoas(func);
            }else if(operacao == 3){
                exibirDispositivosOrdenadosPrecoCrescente();
            }else if(operacao == 4){
                exibirDispositivosOrdenadosPrecoDecrescente();
            }
            else if(operacao == 5){
                menuCadastroDispositivo(func);
            }else if(operacao == 6){
                construirSmartphone();
            }else if(operacao == 7){
                efetuarVenda();
            }           
        }while(operacao != 0);
    
    }
    
    public static void menuDispositivos(Funcionario func){
        System.out.println("\n\n \t\t\t---- MAESTROPHONE ---- \n");
        System.out.println("1 - Baterias                        ");
        System.out.println("2 - Cameras                         ");
        System.out.println("3 - Displays                        ");
        System.out.println("4 - Memorias                        ");
        System.out.println("5 - Processadores                   ");
        System.out.println("0 - Sair                            ");
        System.out.println("Informe a opção:                    ");
    }
    
    public static void menuPessoas(Funcionario func){
        System.out.println("\n\n \t\t\t---- MAESTROPHONE ---- \n");
        System.out.println("1 - Funcionarios                    ");
        System.out.println("2 - Clientes                        ");
        System.out.println("0 - Sair                            ");
        System.out.println("Informe a opção:                    ");
    }
    
    public static void menuConsultaPessoas(Funcionario func){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            menuPessoas(func);
            operacao = scanner.nextInt();
            
            if(operacao == 1){
                listarFuncionario();
            }else if(operacao == 2){
                listarCliente();
            }
        }while(operacao != 0);
        
    }
    
    public static void menuConsultaDispositivo(Funcionario func){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            menuDispositivos(func);
            operacao = scanner.nextInt();
            
            if(operacao == 1){
                listarBateria();
            }else if(operacao == 2){
                listarCamera();
            }else if(operacao == 3){
                listarDisplay();
            }else if(operacao == 4){
                listarMemoria();
            }else if(operacao == 5){
                listarProcessador();
            }
        }while(operacao != 0);
        
    }
    
    public static void menuCadastroDispositivo(Funcionario func){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            menuDispositivos(func);
            operacao = scanner.nextInt();
            
            if(operacao == 1){
                cadastrarBateria();
            }else if(operacao == 2){
                cadastrarCamera();
            }else if(operacao == 3){
                cadastrarDisplay();
            }else if(operacao == 4){
                cadastrarMemoria();
            }else if(operacao == 5){
                cadastrarProcessador();
            }
        }while(operacao != 0);
    }
    
    private static void listarBateria(){
                
        System.out.print("\n\n \t\t\t---- BATERIA ---- \n");
        listaBateria.forEach(bat -> {
                System.out.printf("Codigo: %d\tMarca: %s%s\tPreço: %.2f\tEstoque: %d", 
                    bat.getCodDispositivo(),
                    bat.getMarca(),
                    bat.getDescricaoDispositivo(),
                    bat.getValorDispositivo(),
                    bat.getQtdEstoque());        
        });
    }
        
    private static void listarCamera(){
                
        System.out.print("\n\n \t\t\t---- CAMERA TRASEIRA---- \n");
        listaCamera.forEach(cam -> {
                    System.out.printf("Codigo: %d\tMarca: %s%s\tPreço: %.2f\tEstoque: %d", 
                    cam.getCodDispositivo(),
                    cam.getMarca(),
                    cam.getDescricaoDispositivo(),
                    cam.getValorDispositivo(),
                    cam.getQtdEstoque());
        });
    }
    
    private static void listarCameraFrontal(){
                
        System.out.print("\n\n \t\t\t---- CAMERA FRONTAL---- \n");
        String frontal = "frontal";
        listaCamera.forEach(camF -> {
            if(camF.getTipoDaCamera().equals(frontal)){
                System.out.printf("Codigo: %d\tMarca: %s%s\tPreço: %.2f\tEstoque: %d",
                        camF.getCodDispositivo(),
                        camF.getMarca(),
                        camF.getDescricaoDispositivo(),
                        camF.getValorDispositivo(),
                        camF.getQtdEstoque());
            }
        });
    }
    
    private static void listarCameraTraseira(){
                
        System.out.print("\n\n \t\t\t---- CAMERA TRASEIRA---- \n");
        String traseira = "traseira";
        for(Camera camT: listaCamera){
            if(camT.getTipoDaCamera().equals(traseira)){
                System.out.printf("Codigo: %d\tMarca: %s%s\tPreço: %.2f\tEstoque: %d",
                        camT.getCodDispositivo(),
                        camT.getMarca(),
                        camT.getDescricaoDispositivo(),
                        camT.getValorDispositivo(),
                        camT.getQtdEstoque());
            }
        }
    }
    
    private static void listarDisplay(){
                
        System.out.print("\n\n \t\t\t---- DISPLAY ---- \n");
        listaDisplay.forEach(dis -> {
                System.out.printf("Codigo: %d\tMarca: %s%s\tPreço: %.2f\tEstoque: %d", 
                    dis.getCodDispositivo(),
                    dis.getMarca(),
                    dis.getDescricaoDispositivo(),
                    dis.getValorDispositivo(),
                    dis.getQtdEstoque());
        });
    }
    
    private static void listarMemoria(){
                
        System.out.print("\n\n \t\t\t---- MEMORIA ---- \n");
        listaMemoria.forEach(mem -> {
                System.out.printf("Codigo: %d\tMarca: %s%s\tPreço: %.2f\tEstoque: %d", 
                    mem.getCodDispositivo(),
                    mem.getMarca(),
                    mem.getDescricaoDispositivo(),
                    mem.getValorDispositivo(),
                    mem.getQtdEstoque());
        });
    }
    
    private static void listarProcessador(){
                
        System.out.print("\n\n \t\t\t---- PROCESSADOR ---- \n");
        listaProcessador.forEach(pro -> {
                System.out.printf("Codigo: %d\tMarca: %s%s\tPreço: %.2f\tEstoque: %d", 
                    pro.getCodDispositivo(),
                    pro.getMarca(),
                    pro.getDescricaoDispositivo(),
                    pro.getValorDispositivo(),
                    pro.getQtdEstoque());
        });
    }
    
    private static void listarFuncionario(){
                
        System.out.print("\n\n \t\t\t---- FUNCIONARIO ---- \n");
        listaFuncionario.forEach(func -> {
                System.out.printf("Nome: %s\tCPF: %s\tEmail: %s\t%s",
                    func.getNome(),
                    func.getCpf(),
                    func.getEmail(),
                    func.getDescricaoPessoa());
        });
    }
    
    private static void listarCliente(){
                
        System.out.print("\n\n \t\t\t---- CLIENTE ---- \n");
        listaCliente.forEach(clt -> {
                System.out.printf("Nome: %s\tCPF: %s\tEmail: %s\t%s",
                    clt.getNome(),
                    clt.getCpf(),
                    clt.getEmail(),
                    clt.getDescricaoPessoa());
        });
    }
    
    private static void listarCelular(){
        System.out.print("\n\n \t\t\t---- CELULAR MONTADO ---- \n");
        listaCelular.forEach(cell -> {
                System.out.printf("Codigo: %d\nCor: %s\nS.O: %s\nPreço: %.2f\t",
                    cell.getCodigoCell(),
                    cell.getCor(),
                    cell.getSistemaOperacional(),
                    cell.getValorTotal());
        });
    }
    
    private static void exibirDispositivosOrdenadosPrecoCrescente() {                
        Comparator<Dispositivo> comparadorDispositivo = (Dispositivo dispo1, Dispositivo dispo2) -> {
            int diferenca;
            diferenca = (int) (dispo1.getValorDispositivo() - dispo2.getValorDispositivo());
            if(diferenca != 0){
                return diferenca;
            }
            return 0;
        };
        
       Collections.sort(listaBateria, comparadorDispositivo);
       listarBateria();
        
       Collections.sort(listaCamera, comparadorDispositivo); 
       listarCamera();
        
       Collections.sort(listaDisplay, comparadorDispositivo);
       listarDisplay();
        
       Collections.sort(listaMemoria, comparadorDispositivo);
       listarMemoria();
        
       Collections.sort(listaProcessador, comparadorDispositivo);
       listarProcessador();
        
    }
    
    private static void exibirDispositivosOrdenadosPrecoDecrescente() {                
        Comparator<Dispositivo> comparadorDispositivo = (Dispositivo dispo1, Dispositivo dispo2) -> {
            int diferenca;
            diferenca = (int) (dispo1.getValorDispositivo() - dispo2.getValorDispositivo());
            if(diferenca != 0){
                return diferenca * -1;
            }
            return 0;
        };
        
       Collections.sort(listaBateria, comparadorDispositivo);
       listarBateria();
        
       Collections.sort(listaCamera, comparadorDispositivo); 
       listarCamera();
        
       Collections.sort(listaDisplay, comparadorDispositivo);
       listarDisplay();
        
       Collections.sort(listaMemoria, comparadorDispositivo);
       listarMemoria();
        
       Collections.sort(listaProcessador, comparadorDispositivo);
       listarProcessador();
    }
    
    private static void notaFiscal(){
        System.out.print("\n\n \t\t\t---- NOTA FISCAL ---- \n");
        listaTransacao.forEach(compra -> {
                System.out.printf("Codigo: %d\nQtd Pedido: %d\nValor frete: %.2f\nValor Total: %.2f\nTipo do Pagamento: %s",
                    compra.getCodTransacao(),
                    compra.getQtdPedido(),
                    compra.getValorFrete(),
                    compra.getValorTotal(),
                    compra.getTipoDoPagamento());
        });
    }
    
    public static void cadastrarBateria(){
        System.out.println("\n\n \t\t\t---- MAESTROPHONE ----      \n");
        
        Bateria bat = new Bateria();
        Scanner scanner = new Scanner(System.in);
        
        bat.setCodDispositivo(listaBateria.size()+60);
        
        System.out.println("Qual a marca? (String)");
        bat.setMarca(scanner.nextLine());        
        System.out.println("Qual o tipo?(String)");
        bat.setTipoDaBateria(scanner.nextLine());
        System.out.println("Qual o ampere?(int)");
        bat.setAmpere(scanner.nextInt());
        System.out.println("Qual a quantidade no estoque?(int)");
        bat.setQtdEstoque(scanner.nextInt());
        System.out.println("Qual o valor?(double)");
        bat.setValorDispositivo(scanner.nextDouble());
                
        listaBateria.add(bat);
        
        System.out.println("\nBateria cadastrada com sucesso!");

    }
    
    public static void cadastrarCamera(){
        System.out.println("\n\n \t\t\t---- MAESTROPHONE ----      \n");
        
        Camera cam = new Camera();
        Scanner scanner = new Scanner(System.in);
        
        cam.setCodDispositivo(listaCamera.size()+70);
        
        System.out.println("Qual a marca? (String)");
        cam.setMarca(scanner.nextLine());        
        System.out.println("Qual o tipo? (String)");
        cam.setTipoDaCamera(scanner.nextLine());
        System.out.println("Qual a resolução de vídeo? (String)");
        cam.setResolucaoGravacao(scanner.nextLine());
        System.out.println("Qual a resolução de foto? (String)");
        cam.setResolucaoFoto(scanner.nextLine());
        System.out.println("Qual o tipo de Flash? (String)");
        cam.setTipoDeFlash(scanner.nextLine());
        System.out.println("Qual o megapixel? (int)");
        cam.setMegapixel(scanner.nextInt());
        System.out.println("Qual o fps de Gravação? (int)");
        cam.setFpsGravacao(scanner.nextInt());
        System.out.println("Qual a quantidade no estoque? (int)");
        cam.setQtdEstoque(scanner.nextInt());
        System.out.println("Qual o valor? (double)");
        cam.setValorDispositivo(scanner.nextDouble());
                
        listaCamera.add(cam);
        
        System.out.println("\nCamera cadastrada com sucesso!");

    }
    
    public static void cadastrarDisplay(){
        System.out.println("\n\n \t\t\t---- MAESTROPHONE ----      \n");
        
        Display dis = new Display();
        Scanner scanner = new Scanner(System.in);
        
        dis.setCodDispositivo(listaDisplay.size()+80);
        
        System.out.println("Qual a marca? (String)");
        dis.setMarca(scanner.nextLine());        
        System.out.println("Qual a resolução? (String)");
        dis.setResolucao(scanner.nextLine());
        System.out.println("Qual o tipo de display? (String)");
        dis.setTipoDisplay(scanner.nextLine());
        System.out.println("Qual a quantidade de cores? (String)");
        dis.setQtdCores(scanner.nextLine());
        System.out.println("Quantas polegadas? (double)");
        dis.setPolegadas(scanner.nextDouble());
        System.out.println("Qual a quantidade no estoque? (int)");
        dis.setQtdEstoque(scanner.nextInt());
        System.out.println("Qual o valor? (double)");
        dis.setValorDispositivo(scanner.nextDouble());
                
        listaDisplay.add(dis);
        
        System.out.println("\nDisplay cadastrado com sucesso!");

    }

    public static void cadastrarMemoria(){
        System.out.println("\n\n \t\t\t---- MAESTROPHONE ----      \n");
        
        Memoria mem = new Memoria();
        Scanner scanner = new Scanner(System.in);
        
        mem.setCodDispositivo(listaMemoria.size()+90);
        
        System.out.println("Qual a marca? (String)");
        mem.setMarca(scanner.nextLine()); 
        System.out.println("Qual a taxa de transferencia do HD? (double)");
        mem.setTaxaDeTransferenciaHD(scanner.nextDouble());
        System.out.println("Qual o armazenamento do HD? (int)");
        mem.setArmazenamentoHD(scanner.nextInt());
        System.out.println("Qual o tamanho da RAM? (int)");
        mem.setTamanhoRAM(scanner.nextInt());
        System.out.println("Qual a frequencia da RAM? (double)");
        mem.setFrequenciaRAM(scanner.nextDouble());
        System.out.println("Qual a quantidade no estoque? (int)");
        mem.setQtdEstoque(scanner.nextInt());
        System.out.println("Qual o valor? ");
        mem.setValorDispositivo(scanner.nextDouble());
                
        listaMemoria.add(mem);
        
        System.out.println("\nMemoria cadastrada com sucesso!");

    }

    public static void cadastrarProcessador(){
        System.out.println("\n\n \t\t\t---- MAESTROPHONE ----      \n");
        
        Processador pro = new Processador();
        Scanner scanner = new Scanner(System.in);
        
        pro.setCodDispositivo(listaProcessador.size()+100);
        
        System.out.println("Qual a marca? (String)");
        pro.setMarca(scanner.nextLine());  
        System.out.println("Quantos nucleos? (int)");
        pro.setQtdNucleos(scanner.nextInt());
        System.out.println("Quantos clocks? (double)");
        pro.setQtdClocks(scanner.nextDouble());
        System.out.println("Qual a quantidade no estoque? (int)");
        pro.setQtdEstoque(scanner.nextInt());
        System.out.println("Qual o valor? (double)");
        pro.setValorDispositivo(scanner.nextDouble());
                
        listaProcessador.add(pro);
        
        System.out.println("\nProcessador cadastrado com sucesso!");

    }

    private static void loginFuncionario(){
        Scanner scanner = new Scanner(System.in);        

        Funcionario funcionarioPesquisado = null;
        
        do{        
            System.out.println("\nDigite o login: ");
            String loginPesquisado = scanner.next();      
            System.out.println("Digite a senha: ");
            String senhaPesquisada = scanner.next();
            
            for(Funcionario func : listaFuncionario){
                if(func.getLogin().equals(loginPesquisado)) {
                    funcionarioPesquisado = func;

                    boolean autenticadoSucesso = funcionarioPesquisado.autenticar(senhaPesquisada);

                    if(autenticadoSucesso){
                        System.out.printf("\nAutenticado com sucesso!");
                        menuMaestroPhone(funcionarioPesquisado);
                    }else{
                        System.out.printf("\nNão autenticado! Senha incorreta.");
                    }
                }
            }           
            
        }while (funcionarioPesquisado == null);
    }
    
    private static void construirSmartphone(){
        
        Scanner scanner = new Scanner(System.in);
        Celular cell = new Celular();
        int codigo;
        double preco = 0;
                
        cell.setCodigoCell(listaCelular.size()+1);
        
        System.out.println("\n\nQual a cor desejada: ");    
        cell.setCor(scanner.nextLine());
        
        boolean soCelular = true;
        
        while(soCelular){
            System.out.println("\n\nQual o sistema operacional desejado?: ");
            System.out.println("Opções: Android ou iOS");
            System.out.println("Digite: ");
            cell.setSistemaOperacional(scanner.nextLine());
            if(cell.getSistemaOperacional().equals("Android") || cell.getSistemaOperacional().equals("iOS")){
                soCelular = false;
            }else{
                System.out.println("\nDigite uma das opções válidas");
            }
        }
        
        listarBateria();
        
        boolean verBat = true;
        
        while(verBat){            
            System.out.println("\n\nSelecione o código da bateria: \n");
            codigo = scanner.nextInt();        
            for(Bateria bat : listaBateria){
                if(bat.getCodDispositivo() == codigo){
                    int batEstoque = bat.getQtdEstoque();
                    preco = preco+bat.getValorDispositivo();
                    bat.setQtdEstoque(batEstoque-1);
                    cell.setBateria(bat);
                    verBat = false;
                }
            }
        }

        listarCameraTraseira();
        
        boolean verCamTra = true;
        
        while(verCamTra){
            System.out.println("\n\nSelecione o código da camera Traseira: \n");
            codigo = scanner.nextInt();        
            for(Camera cam : listaCamera){
                if((cam.getCodDispositivo() == codigo) && (cam.getTipoDaCamera().equals("traseira"))){
                    int camEstoque = cam.getQtdEstoque();
                    preco = preco+cam.getValorDispositivo();
                    cam.setQtdEstoque(camEstoque-1);
                    cell.setCamera(cam);
                    verCamTra = false;
                }
            }
        }
            
        listarCameraFrontal();
        
        boolean verCamFro = true;
        
        while(verCamFro){
            System.out.println("\n\nSelecione o código da camera Frontal: \n");
            codigo = scanner.nextInt();        
            for(Camera cam : listaCamera){
                if((cam.getCodDispositivo() == codigo) && (cam.getTipoDaCamera().equals("frontal"))){
                    int camEstoque = cam.getQtdEstoque();
                    preco = preco+cam.getValorDispositivo();
                    cam.setQtdEstoque(camEstoque-1);
                    cell.setCamera(cam);
                    verCamFro = false;
                }
            }
        }
            
        listarDisplay();
        
        boolean verDis = true;
        
        while(verDis){
            System.out.println("\n\nSelecione o código do display: \n");
            codigo = scanner.nextInt();
            for(Display dis : listaDisplay){
                if(dis.getCodDispositivo() == codigo){
                    int disEstoque = dis.getQtdEstoque();
                    preco = preco+dis.getValorDispositivo();
                    dis.setQtdEstoque(disEstoque-1);
                    cell.setDisplay(dis);
                    verDis = false;
                }
            }
        }
        
        listarMemoria();
        
        boolean verMem = true;
        
        while(verMem){
            System.out.println("\n\nSelecione o código da memoria: \n");
            codigo = scanner.nextInt();
            for(Memoria mem : listaMemoria){
                if(mem.getCodDispositivo() == codigo){
                    int memEstoque = mem.getQtdEstoque();
                    preco = preco+mem.getValorDispositivo();
                    mem.setQtdEstoque(memEstoque-1);
                    cell.setMemoria(mem);
                    verMem = false;
                }
            }
        }
        
        listarProcessador();
        
        boolean verPro = true;
        
        while(verPro){
            System.out.println("\n\nSelecione o código do processador: \n");
            codigo = scanner.nextInt();
            for(Processador pro : listaProcessador){
                if(pro.getCodDispositivo() == codigo){
                    int proEstoque = pro.getQtdEstoque();
                    preco = preco+pro.getValorDispositivo();
                    pro.setQtdEstoque(proEstoque-1);
                    cell.setProcessador(pro);
                    verPro = false;
                }
            }
        }
        
        System.out.println(" \n\n------- ESTOQUE ATUALIZADO --------- \n\n");    
        System.out.printf("Valor do celular: %.2f", preco);
        cell.setValorTotal(preco);
        
        listaCelular.add(cell);
}
    
    private static void efetuarVenda(){
        
        Scanner scanner = new Scanner(System.in);
        TransacaoFinanceira venda = new TransacaoFinanceira();
        
        venda.setCodTransacao(listaTransacao.size()+1);
        
        int opcao = 0;
        String cpf;
        String pagamento;
        
        boolean pag = true;
        
        System.out.println("\nTIPOS DE PAGAMENTO");
        System.out.println("\n'Dinheiro' - 'Cartão - 'Cheque'");
        
        while(pag){
            System.out.println("\nDigite o tipo de pagamento: \n");
            pagamento = scanner.nextLine();
            if(pagamento.equals("Dinheiro")||pagamento.equals("Cheque")||pagamento.equals("Cartão")){
                venda.setTipoDoPagamento(pagamento);
                pag = false;
            }
        }
        
        listarCliente();
        
        boolean verClt = true;
        
        while(verClt){
            System.out.println("\nDigite o CPF do cliente: \n");
            cpf = scanner.nextLine();                    
            for(Cliente clt : listaCliente){
                    if(clt.getCpf().equals(cpf)){
                        listarCelular();
                        verClt = false;                        
                    }
                }
        }

        
        double preco = 0;
        boolean verCell = true;
        
        while(verCell){
            System.out.println("\n\nDigite o código do celular montado: \n");
            opcao = scanner.nextInt();
            for(Celular cell : listaCelular){
                    if(cell.getCodigoCell() == opcao){
                        preco = cell.getValorTotal();
                        verCell = false;
                    }
            }
        }
               
        double frete = 0;
        System.out.println("\nValor do frete: \n");
        frete = scanner.nextDouble();
        
        double total = frete+preco;
        
        GregorianCalendar gc=new GregorianCalendar();
        Date d1=gc.getTime();
        venda.setData(d1);
        venda.setQtdPedido(1);
        venda.setValorFrete(frete);
        venda.setValorTotal(total);
        
        
        listaTransacao.add(venda);
        
        notaFiscal();
    }
}