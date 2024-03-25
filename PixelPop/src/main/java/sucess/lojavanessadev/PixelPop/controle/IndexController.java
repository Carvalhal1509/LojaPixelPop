package sucess.lojavanessadev.PixelPop.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sucess.lojavanessadev.PixelPop.model.Produto;
import sucess.lojavanessadev.PixelPop.repository.ProdutoRepository;

@Controller
public class IndexController {
	
	@Autowired
	private ProdutoRepository produtorepository;

	@RequestMapping("/")
	public ModelAndView listaProdutos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Produto> produtos = produtorepository.findAll();
		mv.addObject("produtos", produtos);
		return mv;
	}
	
}