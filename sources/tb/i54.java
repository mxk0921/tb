package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class i54 implements l63 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pvh f21098a;
    public final pvh b;

    static {
        t2o.a(481296648);
        t2o.a(481296647);
    }

    public i54(pvh pvhVar, pvh pvhVar2) {
        this.f21098a = pvhVar;
        this.b = pvhVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    @Override // tb.l63
    public void a(JSONObject jSONObject, Integer num, String str) {
        pvh pvhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954276b4", new Object[]{this, jSONObject, num, str});
            return;
        }
        xhv xhvVar = null;
        if (!(jSONObject == null || (pvhVar = this.f21098a) == null)) {
            pvhVar.b(jSONObject);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            JSONObject jSONObject2 = new JSONObject();
            Integer num2 = num;
            if (num == null) {
                num2 = "-1";
            }
            jSONObject2.put((JSONObject) "errorCode", (String) num2);
            if (str == null) {
                str = "";
            }
            jSONObject2.put((JSONObject) "errorMessage", str);
            pvh pvhVar2 = this.b;
            if (pvhVar2 != null) {
                pvhVar2.b(jSONObject2);
            }
        }
    }
}
