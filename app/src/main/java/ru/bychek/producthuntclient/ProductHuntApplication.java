package ru.bychek.producthuntclient;

import android.app.Application;

import ru.bychek.producthuntclient.storage.ProductHuntStorage;

public class ProductHuntApplication extends Application {

    private ProductHuntStorage mProductHuntStorage = new ProductHuntStorage();

    public ProductHuntStorage getProductHuntStorage() {
        return mProductHuntStorage;
    }

}
