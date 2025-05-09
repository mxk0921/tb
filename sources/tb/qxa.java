package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayNative;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qxa implements pxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944560);
        t2o.a(1034944559);
    }

    public qxa() {
        sxa.a();
    }

    @Override // tb.pxa
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481436ee", new Object[]{this, str});
            return;
        }
        try {
            h(str, null);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "sendSceneEvents: doSendSceneEvents error");
        }
    }

    @Override // tb.pxa
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a88449c", new Object[]{this, str});
            return;
        }
        try {
            f(str);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "sendBatchEvents: doSendBatchEvents error");
        }
    }

    @Override // tb.pxa
    public void c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8e009b", new Object[]{this, str, jSONObject});
        } else {
            i(str, false, jSONObject, "EMPTY_SOL", "EMPTY_TRI");
        }
    }

    @Override // tb.pxa
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dec138", new Object[]{this, str, str2});
            return;
        }
        try {
            h(str, str2);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "sendSceneEvents: doSendSceneEvents error");
        }
    }

    @Override // tb.pxa
    public void e(String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728e442f", new Object[]{this, str, jSONObject, str2, str3});
        } else {
            i(str, vxa.f(str), jSONObject, str2, str3);
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc052d1", new Object[]{this, str});
        } else if (!rxa.d().i() || !rxa.d().j()) {
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.e("HighwayClientImpl", "sendEvent: name is empty");
            } else {
                DataHighwayNative.b(str);
            }
        }
    }

    public final void g(String str, boolean z, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53e8876", new Object[]{this, str, new Boolean(z), jSONObject, str2, str3});
        } else if (!rxa.d().i() || !rxa.d().j()) {
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.e("HighwayClientImpl", "sendEvent: name is empty");
            } else if (jSONObject == null) {
                Log.e("HighwayClientImpl", "sendEvent: param is null");
            } else {
                DataHighwayNative.c(str, jSONObject, Boolean.valueOf(z), str2, str3);
            }
        }
    }

    public final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb58c2d", new Object[]{this, str, str2});
        } else if (!rxa.d().i() || !rxa.d().j()) {
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.e("HighwayClientImpl", "sendEvent: name is empty");
            } else {
                DataHighwayNative.d(str, str2);
            }
        }
    }

    public void i(String str, boolean z, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2abac1", new Object[]{this, str, new Boolean(z), jSONObject, str2, str3});
            return;
        }
        try {
            g(str, z, jSONObject, str2, str3);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "send event: doSendEvent error");
        }
    }
}
