package MTMessages.MT103;

import MTMessages.MT103.Interfaces.AccountWithInstitution;
import MTMessages.MT103.Interfaces.ITag;

public class AccountWithInstitution_C  implements AccountWithInstitution, ITag {
  private final static String tag = "57";
  private final static String option = "C";
  private final static String presence = "O";

  private String partyIdentifier;

  public String getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(String partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

  @Override
  public String getTag() {
    return tag;
  }

  @Override
  public String getOption() {
    return option;
  }

  @Override
  public String getPresence() {
    return presence;
  }

}
