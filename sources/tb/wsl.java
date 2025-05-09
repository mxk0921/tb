package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.HashMap;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wsl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hhc f30898a;
    public final hhc.a b;
    public final fdc c;
    public final IHomeSubTabController d;
    public JSONObject e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements hhc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hhc.a
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
            }
            return "getTabPassParams";
        }

        @Override // tb.hhc.a
        public void b(String str, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2afe60b", new Object[]{this, str, jSONObject, aVar});
            } else if (TextUtils.equals("popLayerPassParams", str)) {
                wsl.a(wsl.this, aVar);
                wsl.b(wsl.this, null);
            } else if (TextUtils.equals("tabPassParams", str)) {
                wsl.c(wsl.this, aVar);
            }
        }
    }

    static {
        t2o.a(490733598);
    }

    public wsl(hhc hhcVar, fdc fdcVar, IHomeSubTabController iHomeSubTabController) {
        this.f30898a = hhcVar;
        this.c = fdcVar;
        this.d = iHomeSubTabController;
        hhc.a f = f();
        this.b = f;
        hhcVar.a(f);
    }

    public static /* synthetic */ void a(wsl wslVar, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f3fde9", new Object[]{wslVar, aVar});
        } else {
            wslVar.d(aVar);
        }
    }

    public static /* synthetic */ JSONObject b(wsl wslVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9642206d", new Object[]{wslVar, jSONObject});
        }
        wslVar.e = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void c(wsl wslVar, hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52b06a7", new Object[]{wslVar, aVar});
        } else {
            wslVar.e(aVar);
        }
    }

    public final void d(hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59e1a59", new Object[]{this, aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            ((mvf) aVar).c("popLayerPassParams == null");
            return;
        }
        hashMap.put("popLayerPassParams", jSONObject);
        fve.e("PassParamsService", "获取popLayerPassParams: " + this.e);
        ((mvf) aVar).e(hashMap);
    }

    public final void e(hhc.a.AbstractC0939a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c67cf088", new Object[]{this, aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        JSONObject d = tl4.d(this.c.v(this.d));
        if (d == null) {
            ((mvf) aVar).c("tabPassParams == null");
            return;
        }
        hashMap.put("tabPassParams", d);
        fve.e("PassParamsService", "获取passParams: " + d);
        ((mvf) aVar).e(hashMap);
    }

    public final hhc.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhc.a) ipChange.ipc$dispatch("757d81", new Object[]{this});
        }
        return new a();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.f30898a.b(this.b);
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352de850", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }
}
