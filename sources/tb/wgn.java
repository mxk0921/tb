package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateDisplayApplication;
import com.taobao.detail.rate.model.RateInfoV2;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wgn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String STAGE_END_IMAGE_LOADED = "endImageLoaded";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, csd> f30682a = new HashMap<>();
    public final ArrayList<csd> b = new ArrayList<>();
    public final Handler c;
    public final boolean d;
    public boolean e;
    public a7h f;
    public JSONObject g;
    public final String h;
    public final long i;
    public final long j;
    public final qwl k;
    public JSONObject l;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wgn.this.k();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    public wgn(Long l, Long l2, String str) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = handler;
        boolean g = g();
        this.d = g;
        if (g) {
            this.e = true;
            this.h = str;
            e();
            long currentTimeMillis = System.currentTimeMillis();
            if (l == null || l.longValue() <= 0) {
                this.i = currentTimeMillis;
            } else {
                this.i = l.longValue();
            }
            if (l2 == null || l2.longValue() <= 0) {
                this.j = currentTimeMillis;
            } else {
                this.j = l2.longValue();
            }
            c("startClick", new r7k("startClick", this.i, new JSONObject()));
            c("startNav", new r7k("startNav", this.j, new JSONObject()));
            c("rateListContainerCreate", new r7k("rateListContainerCreate", currentTimeMillis, new JSONObject()));
            handler.postDelayed(new a(), n9l.INSTANCE.F());
            qwl qwlVar = new qwl(vgn.PAGE_NAME, vgn.PID, vgn.COLLECTION_URL);
            this.k = qwlVar;
            qwlVar.o("RateListLoadingViewFrameTrack");
        }
    }

    public final void a(csd csdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357293e1", new Object[]{this, csdVar});
            return;
        }
        ckf.g(csdVar, "subStagBean");
        if (h() && (csdVar instanceof eme)) {
            eme emeVar = (eme) csdVar;
            int i = emeVar.d;
            a7h a7hVar = this.f;
            if (a7hVar == null) {
                d(emeVar.f27165a, emeVar.b);
            } else if (i < a7hVar.c()) {
                this.b.add(csdVar);
                if (a7hVar.a(emeVar)) {
                    d(emeVar.f27165a, emeVar.b);
                }
            }
        }
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f074b9", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.remove("rateList");
        jSONObject2.put((JSONObject) c4o.KEY_DATA_SOURCE, srf.h(c4o.KEY_DATA_SOURCE, jSONObject, "detail"));
        jSONObject2.put((JSONObject) z1x.PRE_RENDER, (String) Boolean.valueOf(onm.INSTANCE.b()));
        jSONObject2.put((JSONObject) RateInfoV2.KEY_OPEN_MODE, this.h);
        jSONObject2.put((JSONObject) "isColdStart", (String) Boolean.valueOf(RateDisplayApplication.isColdStart));
        this.g = jSONObject2;
    }

    public final void c(String str, csd csdVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b78ea6b", new Object[]{this, str, csdVar});
            return;
        }
        ckf.g(str, "keySection");
        ckf.g(csdVar, "stagBean");
        if (h()) {
            "current keySection = ".concat(str);
            this.f30682a.put(str, csdVar);
            if (TextUtils.equals(str, "endImageLoaded") && (jSONObject = this.l) != null) {
                b(jSONObject);
                if (i(jSONObject)) {
                    o();
                    m(csdVar);
                    return;
                }
                k();
            }
        }
    }

    public final void d(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e78e80d", new Object[]{this, new Long(j), jSONObject});
        } else {
            c("endImageLoaded", new r7k("endImageLoaded", j, jSONObject));
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75e0885", new Object[]{this});
            return;
        }
        this.f30682a.clear();
        this.b.clear();
        this.c.removeCallbacksAndMessages(null);
    }

    public final csd f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (csd) ipChange.ipc$dispatch("ba1e672b", new Object[]{this, str});
        }
        return this.f30682a.get(str);
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return n9l.INSTANCE.V();
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1732ea01", new Object[]{this})).booleanValue();
        }
        if (!this.d || !this.e) {
            return false;
        }
        return true;
    }

    public final boolean i(JSONObject jSONObject) {
        JSONArray f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55ee2d0", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject g = srf.g("group", jSONObject, null);
        if (g == null || (f = srf.f("items", g, null)) == null || f.size() <= 0) {
            return false;
        }
        this.f = new a7h(f);
        return true;
    }

    public final void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaa2c56", new Object[]{this, jSONObject});
        } else {
            this.l = jSONObject;
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6546199", new Object[]{this});
            return;
        }
        this.e = false;
        e();
    }

    public final void l(csd csdVar, csd csdVar2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646421b1", new Object[]{this, csdVar, csdVar2, str});
            return;
        }
        long a2 = csdVar2.a() - csdVar.a();
        if (TextUtils.equals(str, "firstFrame")) {
            str2 = "first_frame_rate_list";
        } else {
            str2 = "process_rate_list_" + str;
        }
        uhn.j("rate_performance", "rate_loading_view_cost", str2, String.valueOf(a2), this.g);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cost time = ");
        sb.append(a2);
        qwl qwlVar = this.k;
        if (qwlVar != null) {
            qwlVar.j(str2, a2);
        }
    }

    public final void m(csd csdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d5f664", new Object[]{this, csdVar});
            return;
        }
        csd f = f("rateListContainerCreate");
        if (f != null) {
            l(f, csdVar, "renderProcess");
        }
        r7k r7kVar = new r7k("endALL", csdVar.a(), new JSONObject());
        this.f30682a.put("endALL", r7kVar);
        csd f2 = f("startClick");
        if (f2 != null) {
            l(f2, r7kVar, "firstFrame");
        }
        qwl qwlVar = this.k;
        if (qwlVar != null) {
            qwlVar.h(n9l.INSTANCE.N());
            qwlVar.g(JSON.toJSONString(this.g));
            tcu.s(qwlVar);
        }
        k();
    }

    public final void n(String str, String str2, String str3) {
        csd f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2184b3b7", new Object[]{this, str, str2, str3});
            return;
        }
        csd f2 = f(str2);
        if (f2 != null && (f = f(str)) != null) {
            l(f, f2, str3);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414b0d91", new Object[]{this});
        } else if (h()) {
            n("startClick", "startNav", "clickProcess");
            n("startNav", "rateListContainerCreate", "navProcess");
        }
    }
}
