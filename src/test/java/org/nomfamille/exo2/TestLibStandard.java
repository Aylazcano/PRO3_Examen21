package org.nomfamille.exo2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLibStandard {

	/**
	 * VOUS DEVEZ MODIFIER LA LIGNE SUIVANTE
	 */

	@Test(timeout = 1000)
	public void testNFoisN1(){
		List<Integer> result = LibStandard.nFoisN(1);
		Assert.assertEquals(Arrays.asList(1),result);

	}

	@Test(timeout = 1000)
	public void testNFoisN4(){
		List<Integer> result = LibStandard.nFoisN(4);
		Assert.assertEquals(Arrays.asList(1,2,2,3,3,3,4,4,4,4),result);

	}

	@Test(timeout = 1000)
	public void testNFoisN10(){
		List<Integer> result = LibStandard.nFoisN(10);
		Assert.assertEquals(Arrays.asList(
				1,
				2,2,
				3,3,3,
				4,4,4,4,
				5,5,5,5,5,
				6,6,6,6,6,6,
				7,7,7,7,7,7,7,
				8,8,8,8,8,8,8,8,
				9,9,9,9,9,9,9,9,9,
				10,10,10,10,10,10,10,10,10,10),result);

	}

	@Test(timeout = 1000)
	public void testTriCroissant(){
		List<Integer> nonTriee = new ArrayList<>();
		nonTriee.addAll(Arrays.asList(3,2,1));
		System.out.println("Liste de départ est  " + nonTriee);
		List<Integer> result = LibStandard.triCroissant(nonTriee);
		System.out.println("résultat de la méthode  " + result);
		Assert.assertEquals(Arrays.asList(1,2,3) , result);
	}

	@Test(timeout = 1000)
	public void testTriCroissant2(){
		List<Integer> nonTriee = new ArrayList<>();
		nonTriee.addAll(Arrays.asList(23,10,15,-9,-900,50,0,0));
		System.out.println("Liste de départ est  " + nonTriee);
		List<Integer> result = LibStandard.triCroissant(nonTriee);
		System.out.println("résultat de la méthode  " + result);
		Assert.assertEquals(Arrays.asList(-900,-9,0,0,10,15,23,50) , result);
	}

}



