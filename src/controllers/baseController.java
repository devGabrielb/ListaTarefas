package controllers;

import data.BancodeDados;

public abstract class baseController {
    

    protected BancodeDados _banco;

    public baseController() {
        this._banco = BancodeDados.getInstance();
    }
}
