package com.ali.user.mobile.service;

import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface NumberAuthService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface PrefetchResultObserver {
        void onResult(Map<String, String> map);
    }

    void addPrefetchResultObserver(PrefetchResultObserver prefetchResultObserver);

    Map<String, String> getAuthInfoMap();

    Map<String, String> getAuthInfoMap(boolean z);

    void getLoginMaskPhone(int i, CommonDataCallback commonDataCallback);

    void getLoginMaskPhone(int i, String str, CommonDataCallback commonDataCallback);

    void getLoginMaskPhone(int i, String str, String str2, CommonDataCallback commonDataCallback);

    void getLoginToken(String str, NumAuthTokenCallback numAuthTokenCallback);

    void getLoginToken(String str, String str2, NumAuthTokenCallback numAuthTokenCallback);

    void getToken(NumAuthTokenCallback numAuthTokenCallback);

    boolean hasPreFecthMaskPhone();

    boolean isSupport4G();

    boolean needPrefetch();

    void preFecth(String str);

    void preFecth(String str, String str2);

    void removePrefetchResultObserver(PrefetchResultObserver prefetchResultObserver);
}
