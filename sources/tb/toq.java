package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class toq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28847a;
    public final String b;
    public final String c;

    static {
        t2o.a(301990015);
    }

    public toq(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
        if (jSONObject2 == null) {
            ck.g().f("endpoint is null !!", ck.b.b().l("StreamConfigModel").a());
            return;
        }
        this.b = jSONObject2.getString("streamCount");
        this.f28847a = jSONObject2.getString("qpUp");
        this.c = jSONObject2.getString("streamPopWindowEnable");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64120e54", new Object[]{this});
        } else {
            this.f28847a = "1";
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebd0f018", new Object[]{this})).booleanValue();
        }
        String str = this.b;
        if (str == null || Integer.parseInt(str) <= 1) {
            return false;
        }
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0becf65", new Object[]{this})).booleanValue();
        }
        return "true".equals(this.c);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1accb42", new Object[]{this})).booleanValue();
        }
        return true ^ "0".equals(this.f28847a);
    }
}
