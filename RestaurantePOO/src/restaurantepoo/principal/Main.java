/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurantepoo.principal;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashSet;
import restaurantepoo.bancodados.CriaConexao;
import restaurantepoo.dao.FuncionarioDao;
import restaurantepoo.dao.MesaDao;
import restaurantepoo.dao.ProdutoDao;
import restaurantepoo.forms.jFCadFuncionario;
import restaurantepoo.forms.jFCadProduto;
import restaurantepoo.forms.jFMesas;
import restaurantepoo.logica.Funcionario;
import restaurantepoo.logica.Produto;

/**
 *
 * @author red
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ParseException{
           //new jFCadProduto().setVisible(true);
//           new jFCadFuncionario().setVisible(true);

        new jFMesas().setVisible(true);

    }
}
