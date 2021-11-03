package Recipe;

import java.util.List;

public class Recipe {
    private Integer id;
    private String recipe;
    private List<String> dietaryRequirement;
    private Boolean shellfish;
    private Boolean salicylates;
    private Boolean vegan;
    //  private enum diet;


    public Recipe(Integer id, String recipe, List<String> dietaryRequirement, Boolean shellfish, Boolean salicylates, Boolean vegan) {
        this.id = id;
        this.recipe = recipe;
        this.dietaryRequirement = dietaryRequirement;
        this.shellfish = shellfish;
        this.salicylates = salicylates;
        this.vegan = vegan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<String> getDietaryRequirement() {
        return dietaryRequirement;
    }

    public void setDietaryRequirement(List<String> dietaryRequirement) {
        this.dietaryRequirement = dietaryRequirement;
    }

    public Boolean getShellfish() {
        return shellfish;
    }

    public void setShellfish(Boolean shellfish) {
        this.shellfish = shellfish;
    }

    public Boolean getSalicylates() {
        return salicylates;
    }

    public void setSalicylates(Boolean salicylates) {
        this.salicylates = salicylates;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }
}