package calculadora;

import java.io.IOException;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EXEMPLOCONTROLLER implements Initializable {

    private TabPane tabPane;
    
    @FXML
    private ImageView btnCli;
    @FXML
    private ImageView btnUsu;
    @FXML
    private ImageView btnFun;
    @FXML
    private ImageView btnForn;
    @FXML
    private ImageView btnCu;
    @FXML
    private ImageView btnPro;
    @FXML
    private ImageView btnRel;
    @FXML
    private ImageView btnComp;
    @FXML
    private ImageView btnVen;
    @FXML
    private ImageView btnRec;
    @FXML
    private ImageView btnPag;
    @FXML
    private ImageView btnDesp;
    @FXML
    private ImageView btnCai;
    @FXML
    private Pane paneFun;
    @FXML
    private Label abrirRelComp;
    @FXML
    private Label abrirRelVenda;
    @FXML
    private Label abrirRelCurso;
    @FXML
    private Label abrirRelCaixa;
    
    public void initialize(){
        tabPane.getTabs().add(new Tab("Tab 1"));
    }
    
    private void btnFCompra(){
        int numTabs = tabPane.getTabs().size();
        Tab tab = new Tab("Tab "+(numTabs+1));
        tabPane.getTabs().add(tab);
    }
    
    private void listTabs(){
        tabPane.getTabs().forEach(tab -> System.out.println(tab.getText()));
        System.out.println();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void abrirCliente(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroCliente.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Cliente");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirUsuario(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroUsuario.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Usuário");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirFuncionario(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroFuncionario.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Funcionário");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirFornecedores(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroFornecedor.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Fornecedor");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void abrirCursos(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Curso.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Curso");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void abrirProdutos(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroProduto.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Produto");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirFunc(MouseEvent event) throws IOException {
        
        paneFun.setVisible(true);
    }

    @FXML
    private void abrirCompra(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Compra.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Compra");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirVenda(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Venda.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Venda");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void abrirRecebimentos(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Recebimento.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Recebimentos");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirPagamentos(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Pagamento.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Pagamentos");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirDespesa(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroDespesa.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Despesa");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirCaixa(MouseEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Caixa.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Caixa");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void abrirRelCo(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/RelatorioCompra.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Relatório de Compra");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirRelVe(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/RelatorioVenda.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Relatório de Venda");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirRelCu(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/RelatorioCurso.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Relatório de Curso");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirRelCa(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/RelatorioCaixa.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Relatório de Caixa");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void onPaneExited(MouseEvent event) {
        if (paneFun.isVisible())
            paneFun.setVisible(false);
    }
    
}
