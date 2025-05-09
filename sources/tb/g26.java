package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g26 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f19690a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ JSONObject c;
    public final /* synthetic */ Object[] d;
    public final /* synthetic */ DXRuntimeContext e;
    public final /* synthetic */ h26 f;

    public g26(h26 h26Var, String str, JSONObject jSONObject, JSONObject jSONObject2, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        this.f = h26Var;
        this.f19690a = str;
        this.b = jSONObject;
        this.c = jSONObject2;
        this.d = objArr;
        this.e = dXRuntimeContext;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            h26.a(this.f, this.f19690a, this.b, this.c, this.d, this.e);
        }
    }
}
