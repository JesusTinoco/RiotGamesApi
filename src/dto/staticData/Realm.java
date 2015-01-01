package dto.staticData;

import java.util.Map;

/**
 * @version 1.2
 */
public class Realm {

    private String cdn;
    private String css;
    private String dd;
    private String l;
    private String lg;
    private Map<String, String> n;
    private int profileiconmax;
    private String store;
    private String v;

    /**
     *
     * @return The base CDN url.
     */
    public String getCdn() {
        return cdn;
    }

    /**
     *
     * @return Latest changed version of Dragon Magic's css file.
     */
    public String getCss() {
        return css;
    }

    /**
     *
     * @return Latest changed version of Dragon Magic.
     */
    public String getDd() {
        return dd;
    }

    /**
     *
     * @return Default language for this realm.
     */
    public String getL() {
        return l;
    }

    /**
     *
     * @return Legacy script mode for IE6 or older.
     */
    public String getLg() {
        return lg;
    }

    /**
     *
     * @return Latest changed version for each data type listed.
     */
    public Map<String, String> getN() {
        return n;
    }

    /**
     *
     * @return Special behavior number identifying the largest profileicon id that can be used under 500. Any profileicon that is requested between this number and 500 should be mapped to 0.
     */
    public int getProfileiconmax() {
        return profileiconmax;
    }

    /**
     *
     * @return Additional api data drawn from other sources that may be related to data dragon functionality.
     */
    public String getStore() {
        return store;
    }

    /**
     *
     * @return Current version of this file for this realm.
     */
    public String getV() {
        return v;
    }
}
