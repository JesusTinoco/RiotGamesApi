package dto.staticData;

import java.util.List;

/**
 * @version 1.2
 */
public class ChampionSpell {

    private List<Image> altimages;
    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    private String costType;
    private String description;
    private List<Object> effect;
    private List<String> effectBurn;
    private Image image;
    private String key;
    private LevelTip leveltip;
    private int maxrank;
    private String name;
    private Object range;
    private String rangeBurn;
    private String resource;
    private String sanitizedDescription;
    private String sanitizedTooltip;
    private String tooltip;
    private List<SpellVars> vars;

    public List<Image> getAltimages() {
        return altimages;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public String getCostType() {
        return costType;
    }

    public String getDescription() {
        return description;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public Image getImage() {
        return image;
    }

    public String getKey() {
        return key;
    }

    public LevelTip getLeveltip() {
        return leveltip;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return This field is either a List of Integer or the String 'self' for spells that target one's own champion.
     */
    public Object getRange() {
        return range;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public String getResource() {
        return resource;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public String getTooltip() {
        return tooltip;
    }

    public List<SpellVars> getVars() {
        return vars;
    }
}
