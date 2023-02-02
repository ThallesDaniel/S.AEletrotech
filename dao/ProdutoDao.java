/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import eletrotech.Agendamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author Aluno_Manha
 */
public class ProdutoDao {

    public List<Produto> ListarProduto() {

        String sql = "SELECT * FROM cliente WHERE idCliente = 1";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setId(rset.getInt("idCliente"));
                produto.setPlanos(rset.getString("planos"));
                produto.setValor(rset.getFloat("valor"));
                produto.setTipo(rset.getString("tipo_visita"));
                produto.setDate(rset.getDate("data_agen"));
                produto.setHora(rset.getString("horario"));
                produto.setPago(rset.getString("pago"));

                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarProduto2() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM cliente WHERE idCliente = 2";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setId(rset.getInt("idCliente"));
                produto.setPlanos(rset.getString("planos"));
                produto.setValor(rset.getFloat("valor"));
                produto.setTipo(rset.getString("tipo_visita"));
                produto.setDate(rset.getDate("data_agen"));
                produto.setHora(rset.getString("horario"));
                produto.setPago(rset.getString("pago"));

                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarProduto3() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM cliente WHERE idCliente = 3";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setId(rset.getInt("idCliente"));
                produto.setPlanos(rset.getString("planos"));
                produto.setValor(rset.getFloat("valor"));
                produto.setTipo(rset.getString("tipo_visita"));
                produto.setDate(rset.getDate("data_agen"));
                produto.setHora(rset.getString("horario"));
                produto.setPago(rset.getString("pago"));

                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarProduto4() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM cliente WHERE idCliente = 4";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setId(rset.getInt("idCliente"));
                produto.setPlanos(rset.getString("planos"));
                produto.setValor(rset.getFloat("valor"));
                produto.setTipo(rset.getString("tipo_visita"));
                produto.setDate(rset.getDate("data_agen"));
                produto.setHora(rset.getString("horario"));
                produto.setPago(rset.getString("pago"));

                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarProduto5() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM cliente WHERE idCliente = 5";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setId(rset.getInt("idCliente"));
                produto.setPlanos(rset.getString("planos"));
                produto.setValor(rset.getFloat("valor"));
                produto.setTipo(rset.getString("tipo_visita"));
                produto.setDate(rset.getDate("data_agen"));
                produto.setHora(rset.getString("horario"));
                produto.setPago(rset.getString("pago"));

                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarFun() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM funcionario WHERE idFuncionario = 1";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setIdFun(rset.getInt("idFuncionario"));
                produto.setNomeFun(rset.getString("nome"));
                produto.setIdadeFun(rset.getInt("idade"));
                produto.setFormacao(rset.getString("formacao"));
                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarFun2() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM funcionario WHERE idFuncionario = 2";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setIdFun(rset.getInt("idFuncionario"));
                produto.setNomeFun(rset.getString("nome"));
                produto.setIdadeFun(rset.getInt("idade"));
                produto.setFormacao(rset.getString("formacao"));
                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarFun3() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM funcionario WHERE idFuncionario = 3";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setIdFun(rset.getInt("idFuncionario"));
                produto.setNomeFun(rset.getString("nome"));
                produto.setIdadeFun(rset.getInt("idade"));
                produto.setFormacao(rset.getString("formacao"));
                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarFun4() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM funcionario WHERE idFuncionario = 4";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setIdFun(rset.getInt("idFuncionario"));
                produto.setNomeFun(rset.getString("nome"));
                produto.setIdadeFun(rset.getInt("idade"));
                produto.setFormacao(rset.getString("formacao"));
                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }

    public List<Produto> ListarFun5() {

        Agendamentos agen = new Agendamentos();

        String sql = "SELECT * FROM funcionario WHERE idFuncionario = 5";

        List<Produto> produtos = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet) pstm.executeQuery();

            while (rset.next()) {
                Produto produto = new Produto();
                produto.setIdFun(rset.getInt("idFuncionario"));
                produto.setNomeFun(rset.getString("nome"));
                produto.setIdadeFun(rset.getInt("idade"));
                produto.setFormacao(rset.getString("formacao"));
                produtos.add(produto);

            }

        } catch (Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        } finally {

            try {
                if (rset != null) {
                    rset.close();
                }
                if (conn != null) {
                    conn.close();
                }
                if (pstm != null) {
                    pstm.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return produtos;
    }
    
     public List<Produto> ListarUsu() {
        
       Agendamentos agen = new Agendamentos();
        
        String sql = "SELECT * FROM usuario WHERE idUsuario = 1";
        
        List<Produto> produtos = new ArrayList<Produto>();        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet)pstm.executeQuery();
            
            while (rset.next()) {
                Produto produto = new Produto();
               produto.setNomeUsu(rset.getString("nome"));
               produto.setTeleUsu(rset.getString("telefone"));
               produto.setCepUsu(rset.getString("cep"));
               
               produtos.add(produto);
            }
                    
            
            
        } catch(Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        }finally{
                
            try {
               if (rset != null) { rset.close();}
                if (conn != null) {conn.close();}
                if(pstm != null){pstm.close();}
                
               
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
        return produtos;
    }
     
     public List<Produto> ListarUsu2() {
        
       Agendamentos agen = new Agendamentos();
        
        String sql = "SELECT * FROM usuario WHERE idUsuario = 2";
        
        List<Produto> produtos = new ArrayList<Produto>();        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet)pstm.executeQuery();
            
            while (rset.next()) {
                Produto produto = new Produto();
               produto.setNomeUsu(rset.getString("nome"));
               produto.setTeleUsu(rset.getString("telefone"));
               produto.setCepUsu(rset.getString("cep"));
               
               produtos.add(produto);
            }
                    
            
            
        } catch(Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        }finally{
                
            try {
               if (rset != null) { rset.close();}
                if (conn != null) {conn.close();}
                if(pstm != null){pstm.close();}
                
               
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
        return produtos;
    }
     
     public List<Produto> ListarUsu3() {
        
       Agendamentos agen = new Agendamentos();
        
        String sql = "SELECT * FROM usuario WHERE idUsuario = 3";
        
        List<Produto> produtos = new ArrayList<Produto>();        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = (ResultSet)pstm.executeQuery();
            
            while (rset.next()) {
                Produto produto = new Produto();
               produto.setNomeUsu(rset.getString("nome"));
               produto.setTeleUsu(rset.getString("telefone"));
               produto.setCepUsu(rset.getString("cep"));
               
               produtos.add(produto);
            }
                    
            
            
        } catch(Exception e) {
            System.out.println("deu pau");
            e.printStackTrace();
        }finally{
                
            try {
               if (rset != null) { rset.close();}
                if (conn != null) {conn.close();}
                if(pstm != null){pstm.close();}
                
               
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
        return produtos;
    }
     
     
     
     

    /*public void altera(Produto produto){
        
        String  sql = "UPDATE produto SET nome = ?,valor = ?, marca = ? WHERE idproduto =  ?";
        
        Connection conn = null;
        
        PreparedStatement pstm = null;
        
        try {
            conn = Conexao.createConnectionToMysql();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            pstm.setString(1,produto.getNome());
            pstm.setDouble(2,produto.getValor());
            pstm.setString(3,produto.getMarca());
            
            pstm.setInt(4, produto.getId());
            
            pstm.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if (conn != null) {conn.close();}
                if(pstm != null){pstm.close();}
            } catch (Exception e) {
                
                e.printStackTrace();
            }
                
                
            
        }
        
        
    }*/
}
