package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rmn implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d90 f27470a;
    public final /* synthetic */ smn b;

    public rmn(smn smnVar, d90 d90Var) {
        this.b = smnVar;
        this.f27470a = d90Var;
    }

    private void a() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b50ccd8", new Object[]{this});
        } else if (smn.b(this.b).isEmpty()) {
            smn.d(this.b, null);
        } else {
            JSONObject jSONObject2 = (JSONObject) smn.b(this.b).peek();
            String str = "null";
            bqa.e("gw2.playerQueue", "try to peek ", jSONObject2 == null ? str : jSONObject2.getString("sectionBizCode"), ", currentHead =", smn.c(this.b) == null ? str : smn.c(this.b).getString("sectionBizCode"));
            if (jSONObject2 != null && jSONObject2 != smn.c(this.b) && (jSONObject = (JSONObject) smn.e(this.b).get(Integer.valueOf(System.identityHashCode(jSONObject2)))) != null && smn.c(this.b) != jSONObject2) {
                smn.d(this.b, jSONObject2);
                JSONObject jSONObject3 = jSONObject.getJSONObject("dataModel");
                if (jSONObject3 != null) {
                    str = jSONObject3.getString("sectionBizCode");
                }
                bqa.e("gw2.playerQueue", "play next=", str);
                ((v4a.a) this.f27470a).a("headerChanged", jSONObject, null);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        a();
        this.b.e = false;
    }
}
