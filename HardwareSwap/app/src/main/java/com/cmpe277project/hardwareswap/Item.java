package com.cmpe277project.hardwareswap;

public class Item {
    String itemName;
    String itemDesc;
    Double itemPrice;
    Buyer[] itemBuyers;
    String itemOwner;
    String itemSection;
    Boolean itemStatus;
    String itemImage;

    public Item(){
        itemName = "";
        itemDesc = "";
        itemImage = "";
        itemPrice = 0.0;

        itemBuyers = new Buyer[0];
        itemOwner = "";
        itemSection = "";
        itemStatus = false;

    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setItemDesc(String itemDesc){
        this.itemDesc = itemDesc;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }




    public void setItemBuyers(Buyer[] buyers){
        this.itemBuyers = buyers;
    }

    public  void setItemOwner(String itemOwner){
        this.itemOwner = itemOwner;
    }

    public  void setItemSection(String itemSection){
        this.itemSection = itemSection;
    }

    public void setItemStatus(Boolean itemStatus){
        this.itemStatus = itemStatus;
    }

}
