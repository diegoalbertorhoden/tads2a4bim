package br.univel.cadastro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDaoH2Impl implements ClienteDao {
	
	private static Connection con;
	
	private Connection getConnection(){
		
		synchronized(con){
			
			if (con == null) {
				// TODO
			}
			return con;
			
		}
	}

	@Override
	public void inserir(Cliente c) {
		String sql = "INSERT INTO....";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(Cliente c) throws SQLException {
		PreparedStatement ps = con.
				prepareStatement("UPDATE PESSOA SET ID = ?, NOME = ? WHERE ID =?");
		ps.setInt(1, 2);
		ps.setString(2, "Hira");
		ps.setInt(3, 1);
		int res = ps.executeUpdate();


		System.out.println(res + "registro atualizado");
	}

	@Override
	public void excluir(Cliente c) throws SQLException {
		PreparedStatement ps = con.prepareStatement("DELETE FROM PESSOA WHERE ID = ?");
		ps.setInt(1, 2);
		int res = ps.executeUpdate();

		System.out.println(res + "registro deletado");

	}

	@Override
	public Cliente buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarPorExemplo(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AbrirConexao() throws SQLException {

		String url = "jdbc:h2:./aulah2";
		String user = "sa";
		String pass = "sa";
		con = DriverManager.getConnection(url, user, pass);
		
	}

	@Override
	public void fecharConexao() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
