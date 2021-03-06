package ru.covariance.mythkeeperpackager.packager;

import org.json.JSONObject;

/**
 * Class that stores data about author used in Mythkeeper packager.
 *
 * @author Pavel Martynov (git: CovarianceMomentum)
 */
public class Author {

  String name;
  String mail;
  String url;
  String donation;

  public Author(String name) {
    this.name = name;
  }

  public Author setMail(String mail) {
    this.mail = mail;
    return this;
  }

  public Author setUrl(String url) {
    this.url = url;
    return this;
  }

  public Author setDonation(String donation) {
    this.donation = donation;
    return this;
  }

  /**
   * Method that creates a JSON representation of author.
   *
   * @return JSONObject containing this author info
   */
  public JSONObject getRepresentation() {
    JSONObject result = new JSONObject();

    result.put("exists", name != null);

    if (name == null) {
      return result;
    }

    result.put("name", name);
    result.put("mail", mail != null ? mail : false);
    result.put("url", url != null ? url : false);
    result.put("donation", donation != null ? donation : false);

    return result;
  }
}
