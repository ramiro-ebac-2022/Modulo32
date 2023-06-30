/**
 * 
 */
package com.zavala.test;

import org.junit.Assert;
import org.junit.Test;

import com.zavala.dao.IProdutoDao;
import com.zavala.dao.ProdutoDao;
import com.zavala.domain.Produto;

/**
 * @author Ramiro
 *
 */
public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		
		Produto produto = new Produto();
		produto.setCodigo("Produto1");
		produto.setNome("Nome Produto 1");
		produto.setUnidade("Unidade 1");
		produto.setValor(23d);
		produto = produtoDao.cadastrar(produto);
		
		Assert.assertNotNull(produto);
		Assert.assertNotNull(produto.getId());
	}
}
