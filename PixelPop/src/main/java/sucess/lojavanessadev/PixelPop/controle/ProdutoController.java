package sucess.lojavanessadev.PixelPop.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sucess.lojavanessadev.PixelPop.model.Produto;
import sucess.lojavanessadev.PixelPop.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtorepository;

	
	@RequestMapping (value="/cadastrarProduto",method=RequestMethod.GET)
	public String form() {
		return "produto/formProduto";
	}
	@RequestMapping (value="/cadastrarProduto",method=RequestMethod.POST)
	public String form(Produto produto) {
		produtorepository.save(produto);
		return "redirect:/cadastrarProduto";
	}
	

	
}


