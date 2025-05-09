package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xwj implements rl8<hc> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f31647a;

    static {
        t2o.a(352321779);
        t2o.a(723517460);
    }

    public xwj(cxj cxjVar, g8n g8nVar, String str) {
        this.f31647a = g8nVar.g;
        el8.b(cxjVar.h(), str, kk8.a(hc.class, ""), this);
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    /* renamed from: a */
    public gl8 h(hc hcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl8) ipChange.ipc$dispatch("c6aa3826", new Object[]{this, hcVar});
        }
        if (hcVar.b != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("navStart", (Object) Long.valueOf(this.f31647a));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apmConfigSend", (Object) jSONObject);
            hcVar.b.a(jSONObject2);
        }
        return gl8.SUCCESS;
    }
}
