package com.ali.user.mobile.filter;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface LoginFilterCallback {
    void onFail(int i, Map<String, String> map);

    void onSuccess();
}
