package MTMessages.MT103;

import MTMessages.MT103.Interfaces.ITag;

public class ExchangeRate implements ITag {
   private final static String tag = "36";
   private final static String option = "";
   private final static String presence = "O";
   private String exchangeRate;

  public String getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
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
