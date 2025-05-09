package com.taobao.android.address.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RecommendAddressContainer implements Serializable {
    public boolean isSessionValid;
    public boolean locationEnabled;
    public Map<String, RecommendedAddress> recommendAddressMap = new HashMap();
    public long timestamp;
}
