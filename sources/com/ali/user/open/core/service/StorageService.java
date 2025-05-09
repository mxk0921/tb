package com.ali.user.open.core.service;

import com.ali.user.open.core.callback.MemberCallback;
import com.ali.user.open.core.model.WUAData;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface StorageService {
    String decrypt(String str);

    String encode(String str);

    String getAppKey();

    String getDDpExValue(String str);

    String getUmid();

    void getUmid(MemberCallback<String> memberCallback);

    String getValue(String str, boolean z);

    WUAData getWUA();

    void putDDpExValue(String str, String str2);

    void putValue(String str, String str2, boolean z);

    void removeDDpExValue(String str);

    void removeSafeToken(String str);

    void removeValue(String str, boolean z);

    boolean saveSafeToken(String str, String str2);

    void setUmid(String str);

    String signMap(String str, TreeMap<String, String> treeMap);
}
