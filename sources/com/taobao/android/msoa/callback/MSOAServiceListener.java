package com.taobao.android.msoa.callback;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface MSOAServiceListener {
    void onFail(String str, String str2, boolean z, Map<String, Object> map);

    void onSuccess(Map<String, Object> map);
}
