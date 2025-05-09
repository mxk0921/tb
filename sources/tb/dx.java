package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class dx<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001925);
    }

    public abstract BEAN a();

    public abstract Class<BEAN> b();

    public abstract String c();

    public void d(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        c4p.o("Parser_" + c(), null, exc);
    }

    public abstract void e(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception;

    public final BEAN f(JSONObject jSONObject, CTX ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BEAN) ipChange.ipc$dispatch("66608aa0", new Object[]{this, jSONObject, ctx});
        }
        try {
            BEAN g = g(jSONObject, ctx);
            h(g, jSONObject, ctx);
            return g;
        } catch (Exception e) {
            d(e);
            return null;
        }
    }

    public BEAN g(JSONObject jSONObject, CTX ctx) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BEAN) ipChange.ipc$dispatch("9a6fb0f0", new Object[]{this, jSONObject, ctx});
        }
        BEAN a2 = a();
        e(jSONObject, a2, ctx);
        return a2;
    }

    public abstract void h(BEAN bean, JSONObject jSONObject, CTX ctx);
}
