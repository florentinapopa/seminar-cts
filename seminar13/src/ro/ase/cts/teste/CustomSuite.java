package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.categorii.PromovabilitateCategory;
import ro.ase.cts.teste.categorii.UrgentTestCategory;

@RunWith(Categories.class)
@SuiteClasses({TesteConstructorGrupa.class,TestePromovabilitateGrupa.class,TestePromovabilitateGrupaCuDubluri.class,TestPromovabilitateGrupaWithFixture.class})
@IncludeCategory(PromovabilitateCategory.class)
@ExcludeCategory(UrgentTestCategory.class)
public class CustomSuite {

}
