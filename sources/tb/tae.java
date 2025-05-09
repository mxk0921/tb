package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexInstanceImpl;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface tae {
    void a(String str, Object obj);

    void b(String str, Map<String, Object> map);

    String c();

    void d(int i, String str, JSONObject jSONObject);

    void e(String str, WeexInstanceImpl weexInstanceImpl);

    void f(int i, View view, JSONObject jSONObject, rce rceVar, ice iceVar);

    void g();

    void h(int i, String str, String str2);

    void i(int i, String str, long j);

    void onEnd();

    void onStage(String str, long j);
}
