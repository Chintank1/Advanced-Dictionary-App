package com.example.advanceddictionary;

import com.example.advanceddictionary.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
