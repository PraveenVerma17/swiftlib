package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;
import MTMessages.MT103.Interfaces.IntermediaryInstitution;

public class IntermediaryInstitution_C  implements IntermediaryInstitution, ITag {
  private final static String tag = "56";
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
