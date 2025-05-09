package com.taobao.android.themis.graphics;

import android.view.MotionEvent;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface IRiverBackend {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum EngineType {
        Qking,
        V8
    }

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    void p(String str, JSONObject jSONObject, boolean z);

    void q(String str, String str2);

    boolean r(String str);

    void s(String str, String str2);

    void t(byte[] bArr, String str);

    void u(byte[] bArr, String str);

    void v(HashMap<String, String> hashMap);

    void w(byte[] bArr, String str);

    void x(Map<String, String> map);
}
