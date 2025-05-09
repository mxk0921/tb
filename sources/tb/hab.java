package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import tb.h9;
import tb.k8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface hab<PARAMS extends h9, CONTEXT extends k8> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void b(JSONObject jSONObject);
    }

    void a(JSONObject jSONObject, boolean z);

    void b(a aVar);

    void changeGravity(String str);

    void changeSize(float f, float f2, boolean z);

    boolean d(CONTEXT context, PARAMS params, View view, int i);
}
