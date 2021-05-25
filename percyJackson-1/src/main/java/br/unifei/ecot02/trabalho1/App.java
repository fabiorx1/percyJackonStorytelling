package br.unifei.ecot02.trabalho1;
import java.util.List;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		
		
		Profecia grandeProfecia = new Profecia(new Humano("Antigo Oraculo", "condenado por Apolo a cumprir essa funcao"));
		grandeProfecia.setPoema("Um Meio-Sangue, dos deuses antigos filho,\nChegará aos dezesseis apesar de empecilhos\nNum sono sem fim o mundo estará\nE a alma do herói, a lâmina maldita ceifará\nUma escolha seus dias vai encerrar\nO Olimpo preservar ou arrasar");
		
		
		// Zeus
		Deidade zeus = new Deidade("Zeus","O rei dos deuses");
		zeus.getElementos().add(Elemento.nevoa(100, zeus));
		zeus.getElementos().add(Elemento.atletismo(120, zeus));
		zeus.getElementos().add(Elemento.raio(120, zeus));
		zeus.getElementos().add(Elemento.estrategia(100, zeus));
		zeus.getElementos().add(Elemento.forca(100, zeus));
		
		// Poseidon
		Deidade pos = new Deidade("Poseidon", "O rei dos mares");
		pos.getElementos().add(Elemento.nevoa(100, pos));
		pos.getElementos().add(Elemento.atletismo(120, pos));
		pos.getElementos().add(Elemento.agua(120, pos));
		pos.getElementos().add(Elemento.estrategia(100, pos));
		pos.getElementos().add(Elemento.forca(100, pos));
		
		
		// Hades
		Deidade had = new Deidade("Hades", "O rei dos mortos");
		had.getElementos().add(Elemento.nevoa(120, had));
		had.getElementos().add(Elemento.morte(150, had));
		had.getElementos().add(Elemento.estrategia(100, had));
		had.getElementos().add(Elemento.forca(100, had));
		
		// Hermes
		Deidade her = new Deidade("Hermes", "O deus dos persuasivos (e, consequentemente, dos persuadidos, rsrs)");
		her.getElementos().add(Elemento.nevoa(110, her));
		her.getElementos().add(Elemento.eloquencia(120, her));
		her.getElementos().add(Elemento.adivinhacao(120, her));
		her.getElementos().add(Elemento.atletismo(120, her));
		her.getElementos().add(Elemento.estrategia(100, her));
		her.getElementos().add(Elemento.forca(100, her));
		
		// Pã
		Deidade pa = new Deidade("Pa (a com til)","O deus dos bosques, dos campos, dos rebanhos e dos pastores");
		pa.getElementos().add(Elemento.nevoa(130, pa));
		pa.getElementos().add(Elemento.natureza(180, pa));
		pa.getElementos().add(Elemento.estrategia(100, pa));
		pa.getElementos().add(Elemento.forca(100, pa));
		
		// Atena
		Deidade aten = new Deidade("Atena","A deusa da sabedoria, das artes, da estratégia em batalha");
		aten.getElementos().add(Elemento.nevoa(110, aten));
		aten.getElementos().add(Elemento.natureza(80, aten));
		aten.getElementos().add(Elemento.estrategia(140, aten));
		aten.getElementos().add(Elemento.forca(80, aten));
		
		// Kronos
		Deidade kron = new Deidade("Kronos", "o titã do tempo");
		kron.getElementos().add(new Elemento("Tempo", 200, kron));
		kron.getElementos().add(Elemento.nevoa(140, kron));
		kron.getElementos().add(Elemento.forca(200, kron));
		
		// Groover
		Antropozoomorfo groover = new Antropozoomorfo(pa, new Animal("bode"), "Groover", "um satiro diferenciando");

		
		
		// Heroies da Profecia
		
		Heroi luke = new Heroi(her, "Luke Castellan", "um jovem ambicioso e talentoso");
		luke.setProtetor(groover);
		luke.setEnteHumano(new Humano("May Castellan", "mae de Luke"));
		
		Heroi anna = new Heroi(aten, "Annabeth Chase", "uma jovem muito inteligente e perspicaz");
		luke.setProtetor(groover);
		
		Ser thal = new Heroi(zeus, "Thalia Grace", "a primeira filha dos Tres Grandes do ultimo seculo");
		luke.setProtetor(groover);
		
		System.out.println("Ao descobrir que Zeus havia tido uma filha, Hades tentou mata-la, mas Thalia encontrou Luke e Annabeth e juntos, com a ajuda de Groover, seu protetor, conseguiram chegar ao acampamento, um lugar seguro para os semideuses, protegido por magias contra monstros.");
		
		Heroi pj = new Heroi(pos, "Percy Jackson", "O personagem principal");
		pj.setProtetor(groover);
		pj.setEnteHumano(new Humano("Sally Jackson", "mae de Percy"));
		
		System.out.println("Percy Jackson nasceu depois, mas assim que foi descoberto também sofreu perseguicoes, mas com a ajuda de Groover conseguiu chegar ao acampamento.");
		System.out.println("Os deuses estavam acusando-o de roubar o raio de Zeus, o que nao aconteceu...");
		System.out.println("O que ninguem sabia, porem, e que Luke havia roubado o raio e estava ajudando Kronos a se reerguer...");
		
		for(Elemento elemento : pj.getElementos()) {
			while(elemento.getDominio() < 80)
				elemento.treinar();			
		}
		
		for(Elemento elemento : luke.getElementos()) {
			while(elemento.getDominio() < 90)
				elemento.treinar();			
		}
				
		grandeProfecia.getEnvolvidos().add(luke);
		grandeProfecia.getEnvolvidos().add(anna);
		grandeProfecia.getEnvolvidos().add(thal);
		grandeProfecia.getEnvolvidos().add(pj);
		
		// Atlas
		Deidade atlas = new Deidade("Atlas", "aquele que segura os céus");
		atlas.getElementos().add(Elemento.forca(200, atlas));
		
		System.out.println("Cacadoras de Artemis sao garotas que juraram abdicar o amor romantico a Atena, se dedicando somente a caca e recebendo bencaos por isso, como a Imortalidade");
		
		// Zoe
		Ser zoe = new Antropozoomorfo(atlas, new Animal("Borboleta"), "Zoe Doce-Amarga", ".");
		zoe = ((Antropozoomorfo) zoe).jurarArtemis();
		
		
		System.out.println("Hades teve dois filhos antes mesmo de Zeus, porem conseguiu esconde-los no covil de comedores de Lotus, onde o tempo nao passa. \nPorem Percy, Groover e Annabeth, na sua busca pelo raio roubado, encontraram-os");
		
		Ser bianc = new Heroi(had, "Bianca di Angelo", "a irma mais velha de Nico");
		Heroi nico = new Heroi(had, "Nico di Angelo", "uma crianca amargurada");
		
		
		System.out.println("Apos alguns acontecimentos, Bianca decide se juntar as cacadoras, o que deixa Nico levemente revoltado");
		bianc = ((Heroi) bianc).jurarArtemis();
		
		
		System.out.println("Nico invoca um exercito e sai por ai fazendo um massacre, influenciado por Kronos que queria dominar o mundo mas precisava de tempo para renascer");
		
		
		System.out.println("Contextualizando os zumbis...");
		List<Mortal> exercito = new ArrayList<Mortal>();
		for(int i=1; i<21; i++) {
			exercito.add(new Humano("Soldado %d".formatted(i), "um soldado da segunda guerra").morrer(null));
			nico.getElementos().get(1).usar(exercito.get(i-1), null);
		}
		
		
		System.out.println("Percy encontra-o e levam-o para o acampamento, livrando-o da influencia de Kronos");
		
		
		System.out.println("O Antigo Oraculo esta morrendo! Um humano precisou absorver os poderes.");
		Humano rachel = new Humano("Rachel Elizabeth Dare", "uma amiga de Percy");
		rachel.assumirOraculo();
		
		System.out.println("Entre muitos acontecimentos, Kronos consegue surgir atraves de Luke, que agora divide seu corpo mortal com Kronos");
		System.out.println("Porem Luke consegue ver a verdade e os objetivos destrutivos de Kronos, e enfia uma faca no proprio peito");
		
		luke.getElementos().get(1).usar(kron, null);
		
		System.out.println("Fim da historia relacionada a primeira profecia. Luke era o heroi da profecia.");
		System.out.println("E a alma do herói, a lâmina maldita ceifará\n"
				+ "Uma escolha seus dias vai encerrar");
		
		
		System.out.println("Uma nova profecia chega...");
		Profecia segundaProfecia = new Profecia(rachel);
				segundaProfecia.setPoema("\n\nSete Meios-Sangues responderão ao chamado\n"
						+ "Em tempestade ou fogo, o mundo terá acabado\n"
						+ "Um juramento a manter com um alento final\n"
						+ "E inimigos com armas, às Portas da Morte afinal\n\n");
				
		rachel.recitar(segundaProfecia);
		
		System.out.println("Thalia, que durante toda a guerra estava sob a maldicao de ser uma arvore, agora voltou a sua forma humana e decide se juntar as cacadoras");		
		thal = ((Heroi)thal).jurarArtemis();

		System.out.println("E o resto fica para a segunda saga, Os Herois do Olimpo!");
		System.out.println("Fim do storytelling de Percy Jackson & os Olimpianos");
		
		
	}

}
