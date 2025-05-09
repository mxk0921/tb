package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface aeb {
    ViewGroup A(Context context);

    boolean a(Context context);

    boolean b(Context context);

    Map<String, String> f();

    String p();

    View q(String str);

    INetDataObject r();

    void s(Context context, String str, boolean z);

    boolean t();

    int u(Context context);

    void v(b3d b3dVar);

    void w(JSONObject jSONObject);

    void x(b3d b3dVar);

    void y(String str);

    void z(Context context, String str);
}
