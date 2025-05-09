package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.waj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zaj implements rvk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f32648a = 0;
    public String b;
    public JSONObject c;
    public final a d;
    public JSONObject e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(729809456);
        t2o.a(729810179);
    }

    public zaj(a aVar) {
        this.d = aVar;
    }

    @Override // tb.rvk
    public void a(imn imnVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a163b5e6", new Object[]{this, imnVar, jSONObject, str});
        }
    }

    @Override // tb.rvk
    public void b(imn imnVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e63fb7", new Object[]{this, imnVar, jSONObject, str});
        } else if (imnVar != null && jSONObject != null) {
            String string = jSONObject.getString("requestType");
            d9j.c("MultiTabRequestService", "requestType: " + string);
            if (((waj.c) this.d).a(this.b, string, "local".equals(jSONObject.getString("dataSourceType")))) {
                this.b = string;
                this.c = jSONObject;
                this.e = vaj.l(imnVar.u(str));
                c();
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12f67d0", new Object[]{this});
        } else if (this.f32648a != 1 || !f4b.b("enableFixSubscribeLoginSwitch", true)) {
            boolean equals = TextUtils.equals("base", this.c.getString("dataChangeType"));
            d9j.c("MultiTabRequestService", "onProcess " + equals);
            if (equals) {
                ((waj.c) this.d).b(this.e);
            } else {
                ((waj.c) this.d).c(this.e);
            }
        } else {
            this.f32648a = 2;
            d9j.c("MultiTabRequestService", "checkAndRefreshTab 当前onStop wait onStart ");
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        d9j.c("MultiTabRequestService", "onStart");
        if (this.f32648a == 2) {
            c();
        }
        this.f32648a = 0;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        d9j.c("MultiTabRequestService", "onStop");
        this.f32648a = 1;
    }
}
