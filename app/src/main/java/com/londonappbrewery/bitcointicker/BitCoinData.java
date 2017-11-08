package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hp on 11/8/2017.
 */

public class BitCoinData {

    private String mBtcValue;


    public static BitCoinData fromJson (JSONObject jsonObject){
        try {
            BitCoinData btcValue = new BitCoinData();
            double tempValue = jsonObject.getDouble("last");
            btcValue.mBtcValue = Double.toString(tempValue);
            return btcValue;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getBtcValue() {
        return mBtcValue;
    }
}
