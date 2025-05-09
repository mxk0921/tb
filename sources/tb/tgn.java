package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateDisplayApplication;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.model.RateInfoV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class tgn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String STAGE_END_IMAGE_LOADED = "endImageLoaded";
    public static final String STAGE_END_PRE_REQUEST = "endPreRequest";
    public static final String STAGE_END_RENDER_VIEW_APPEAR = "endRenderViewAppear";
    public static final String STAGE_START_PRE_REQUEST = "startPreRequest";
    public static final String STAGE_START_RENDER_VIEW_APPEAR = "startRenderViewAppear";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, csd> f28709a = new HashMap<>();
    public final ArrayList<csd> b = new ArrayList<>();
    public final Handler c;
    public final boolean d;
    public boolean e;
    public ugn f;
    public JSONObject g;
    public final String h;
    public final RateFeedsFragment i;
    public final long j;
    public final long k;
    public qwl l;
    public qwl m;
    public qwl n;
    public c o;

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
                tgn.this.s();
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void onFirstFrame();
    }

    public tgn(RateFeedsFragment rateFeedsFragment, Long l, Long l2, String str) {
        ckf.g(rateFeedsFragment, "fragment");
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = handler;
        boolean m = m();
        this.d = m;
        if (m) {
            this.e = true;
            this.h = str;
            this.i = rateFeedsFragment;
            g();
            long currentTimeMillis = System.currentTimeMillis();
            if (l == null || l.longValue() <= 0) {
                this.j = currentTimeMillis;
            } else {
                this.j = l.longValue();
            }
            if (l2 == null || l2.longValue() <= 0) {
                this.k = currentTimeMillis;
            } else {
                this.k = l2.longValue();
            }
            c("startClick", new r7k("startClick", this.j, new JSONObject()));
            c("startNav", new r7k("startNav", this.k, new JSONObject()));
            c("rateListContainerCreate", new r7k("rateListContainerCreate", currentTimeMillis, new JSONObject()));
            handler.postDelayed(new a(), n9l.INSTANCE.F());
            l();
        }
    }

    public final void a(csd csdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357293e1", new Object[]{this, csdVar});
            return;
        }
        ckf.g(csdVar, "subStagBean");
        if (n() && (csdVar instanceof eme)) {
            eme emeVar = (eme) csdVar;
            int i = emeVar.d;
            ugn ugnVar = this.f;
            if (ugnVar == null) {
                e(emeVar.f27165a, emeVar.b);
            } else if (i < ugnVar.e()) {
                this.b.add(csdVar);
                if (ugnVar.a(emeVar)) {
                    e(emeVar.f27165a, emeVar.b);
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
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(jSONObject));
        parseObject.remove("rateList");
        parseObject.put((JSONObject) z1x.PRE_RENDER, (String) Boolean.valueOf(onm.INSTANCE.b()));
        parseObject.put((JSONObject) RateInfoV2.KEY_OPEN_MODE, this.h);
        parseObject.put((JSONObject) "isColdStart", (String) Boolean.valueOf(RateDisplayApplication.isColdStart));
        this.g = parseObject;
    }

    public final void c(String str, csd csdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b78ea6b", new Object[]{this, str, csdVar});
            return;
        }
        ckf.g(str, "keySection");
        ckf.g(csdVar, "stagBean");
        if (n()) {
            "current keySection = ".concat(str);
            this.f28709a.put(str, csdVar);
            if (TextUtils.equals(str, "endDataHandle")) {
                JSONObject b2 = csdVar.b();
                if (b2 != null) {
                    b(b2);
                    x();
                    q(b2.getJSONArray("rateList"));
                }
            } else if (TextUtils.equals(str, "endImageLoaded")) {
                u(csdVar);
            }
        }
    }

    public final void d(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddb72a2", new Object[]{this, new Long(j), jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.g;
        if (jSONObject2 != null) {
            jSONObject2.put((JSONObject) "isScroll", (String) Boolean.TRUE);
        }
        if (o()) {
            Long h = h();
            if (h != null) {
                e(h.longValue(), jSONObject);
            } else {
                e(j, jSONObject);
            }
        }
    }

    public final void e(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e78e80d", new Object[]{this, new Long(j), jSONObject});
        } else {
            c("endImageLoaded", new r7k("endImageLoaded", j, jSONObject));
        }
    }

    public final qwl f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwl) ipChange.ipc$dispatch("26a752e6", new Object[]{this});
        }
        return new qwl(vgn.PAGE_NAME, vgn.PID, vgn.COLLECTION_URL);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75e0885", new Object[]{this});
            return;
        }
        this.f28709a.clear();
        this.b.clear();
        this.c.removeCallbacksAndMessages(null);
    }

    public final Long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("590c3646", new Object[]{this});
        }
        Iterator<T> it = this.b.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Long valueOf = Long.valueOf(((csd) it.next()).a());
        while (it.hasNext()) {
            Long valueOf2 = Long.valueOf(((csd) it.next()).a());
            if (valueOf.compareTo(valueOf2) < 0) {
                valueOf = valueOf2;
            }
        }
        return valueOf;
    }

    public final String i(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17f19c8d", new Object[]{this, jSONObject, str, str2});
        }
        Object obj = jSONObject.get(str);
        if (obj == null) {
            return str2;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof JSONObject) {
            return obj.toString();
        }
        if (!(obj instanceof JSONArray)) {
            return str2;
        }
        String jSONString = ((JSONArray) obj).toJSONString();
        ckf.f(jSONString, "value.toJSONString()");
        return jSONString;
    }

    public final csd j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (csd) ipChange.ipc$dispatch("ba1e672b", new Object[]{this, str});
        }
        return this.f28709a.get(str);
    }

    public final Map<String, String> k() {
        String str;
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b7128f3e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.g;
        if (jSONObject != null) {
            hashMap.put("mode", i(jSONObject, RateInfoV2.KEY_OPEN_MODE, "default"));
            hashMap.put(z1x.PRE_RENDER, i(jSONObject, z1x.PRE_RENDER, "false"));
            hashMap.put("coldStart", i(jSONObject, "isColdStart", "false"));
            hashMap.put("source", i(jSONObject, "source", "-1"));
            hashMap.put("rateType", i(jSONObject, "rateType", "1"));
            hashMap.put("isScroll", i(jSONObject, "isScroll", "false"));
        }
        hashMap.put(n9l.ENABLE_RATE_LIST_PERFORMANCE, String.valueOf(n9l.INSTANCE.g()));
        VariationSet activate = UTABTest.activate(xgn.AB_COMPONENT, xgn.AB_MODULE);
        Long l = null;
        Long valueOf2 = activate != null ? Long.valueOf(activate.getExperimentBucketId()) : null;
        VariationSet activate2 = UTABTest.activate(xgn.AB_COMPONENT_DETAIL_PRE_REQUEST, xgn.AB_MODULE_DETAIL_PRE_REQUEST);
        if (activate2 != null) {
            l = Long.valueOf(activate2.getExperimentBucketId());
        }
        String str2 = "0";
        if (valueOf2 == null || (str = String.valueOf(valueOf2.longValue())) == null) {
            str = str2;
        }
        hashMap.put("experimentBucketId", str);
        if (!(l == null || (valueOf = String.valueOf(l.longValue())) == null)) {
            str2 = valueOf;
        }
        hashMap.put("preRequestExperimentBucketId", str2);
        return hashMap;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afabbbe", new Object[]{this});
            return;
        }
        qwl f = f();
        this.l = f;
        if (f != null) {
            f.o("RateListFirstFrameTrackManager");
        }
        n9l n9lVar = n9l.INSTANCE;
        if (n9lVar.S()) {
            qwl f2 = f();
            this.m = f2;
            if (f2 != null) {
                f2.o("RateListFirstFrameTimeStampStart");
            }
        }
        if (n9lVar.R()) {
            qwl f3 = f();
            this.n = f3;
            if (f3 != null) {
                f3.o("RateListFirstFrameTimeStampEnd");
            }
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return n9l.INSTANCE.T();
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1732ea01", new Object[]{this})).booleanValue();
        }
        if (!this.d || !this.e) {
            return false;
        }
        return true;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e672ae10", new Object[]{this})).booleanValue();
        }
        ugn ugnVar = this.f;
        if (ugnVar == null || ugnVar.b() > 1 || ugnVar.c() > 1) {
            return false;
        }
        return true;
    }

    public final void p(qwl qwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44cef0b7", new Object[]{this, qwlVar});
        } else if (qwlVar != null) {
            qwlVar.h(n9l.INSTANCE.N());
            qwlVar.g(JSON.toJSONString(this.g));
            qwlVar.l(k());
            tcu.s(qwlVar);
        }
    }

    public final void q(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2ac5cc", new Object[]{this, jSONArray});
        } else if (jSONArray == null || jSONArray.size() == 0) {
            csd j = j("endDataHandle");
            if (j != null) {
                e(j.a(), j.b());
            }
        } else {
            this.f = new ugn(jSONArray);
        }
    }

    public final void r(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0917a", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "firstFrameCallback");
        this.o = cVar;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6546199", new Object[]{this});
            return;
        }
        this.e = false;
        g();
    }

    public final void t(csd csdVar, csd csdVar2, String str) {
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
        long a3 = csdVar.a();
        long a4 = csdVar2.a();
        csd j = j("startClick");
        if (j != null) {
            a3 = csdVar.a() - j.a();
            a4 = csdVar2.a() - j.a();
        }
        z(this.g, a3, a4);
        uhn.j("rate_performance", "rate_cost", str2, String.valueOf(a2), this.g);
        qwl qwlVar = this.l;
        if (qwlVar != null) {
            qwlVar.j(str2, a2);
        }
        qwl qwlVar2 = this.m;
        if (qwlVar2 != null) {
            qwlVar2.j(str2, a3);
        }
        qwl qwlVar3 = this.n;
        if (qwlVar3 != null) {
            qwlVar3.j(str2, a4);
        }
    }

    public final void u(csd csdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d5f664", new Object[]{this, csdVar});
            return;
        }
        y();
        csd j = j("endDataHandle");
        if (j != null) {
            t(j, csdVar, "renderProcess");
        }
        r7k r7kVar = new r7k("endALL", csdVar.a(), new JSONObject());
        this.f28709a.put("endALL", r7kVar);
        csd j2 = j("startClick");
        if (j2 != null) {
            t(j2, r7kVar, "firstFrame");
        }
        RateFeedsFragment rateFeedsFragment = this.i;
        if (rateFeedsFragment != null) {
            qc.INSTANCE.a(rateFeedsFragment);
        }
        v();
        s();
        c cVar = this.o;
        if (cVar != null) {
            cVar.onFirstFrame();
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2559f07", new Object[]{this});
            return;
        }
        p(this.l);
        p(this.m);
        p(this.n);
    }

    public final void w(String str, String str2, String str3) {
        csd j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2184b3b7", new Object[]{this, str, str2, str3});
            return;
        }
        csd j2 = j(str2);
        if (j2 != null && (j = j(str)) != null) {
            t(j, j2, str3);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414b0d91", new Object[]{this});
        } else if (n()) {
            w("startClick", "startNav", "clickProcess");
            w("startNav", "rateListContainerCreate", "navProcess");
            w("rateListContainerCreate", "startNetworkRequest", "createProcess");
            w("startNetworkRequest", "endNetworkRequest", "networkProcess");
            w("endNetworkRequest", "endDataHandle", "dataHandleProcess");
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e35e72d", new Object[]{this});
            return;
        }
        w(STAGE_START_PRE_REQUEST, STAGE_END_PRE_REQUEST, z1x.PRE_REQUEST);
        w("endDataHandle", STAGE_END_RENDER_VIEW_APPEAR, "renderViewAppear");
    }

    public final void z(JSONObject jSONObject, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9211b9a2", new Object[]{this, jSONObject, new Long(j), new Long(j2)});
        } else if (jSONObject != null) {
            jSONObject.put((JSONObject) "timeStampStart", (String) Long.valueOf(j));
            jSONObject.put((JSONObject) "timeStampEnd", (String) Long.valueOf(j2));
        }
    }
}
