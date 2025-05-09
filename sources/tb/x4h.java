package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x4h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31139a;
    public int b;
    public long c;
    public boolean d;
    public String e;
    public boolean f;

    static {
        t2o.a(295699284);
    }

    public void a(th5 th5Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cf7f0f", new Object[]{this, th5Var});
        } else if (th5Var != null) {
            if (!th5Var.g) {
                JSONObject jSONObject2 = th5Var.b;
                if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("itemExtData")) != null) {
                    this.c = jSONObject.getLongValue("cacheExpire");
                }
            } else if (wda.d()) {
                this.c = 1L;
            } else {
                this.c = -1L;
            }
        }
    }
}
