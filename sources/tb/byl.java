package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class byl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";
    public static final String y = byl.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f16721a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long h;
    public long i;
    public long j;
    public String m;
    public String o;
    public boolean p;
    public final Map<String, String> g = new HashMap();
    public long k = -1;
    public boolean l = false;
    public String n = "other";
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public long t = 0;
    public int u = 0;
    public final Map<String, String> v = new HashMap();
    public long w = -1;
    public long x = -1;

    static {
        t2o.a(806355623);
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f4074a", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee29c92a", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.u == 0) {
            this.u = i;
        }
        v2s.o().A().c(y + "-upDownSwipe#", "playerErrorCode: id=" + this.b + ", liveSource=" + this.f16721a + ", errorCode=" + i);
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d23e7", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4204b13", new Object[]{this});
        } else if (!this.p) {
            this.p = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.k = currentTimeMillis;
            long j = currentTimeMillis - this.h;
            d("kPlayerReceivePlayData", j, j);
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45efcf52", new Object[]{this});
            return;
        }
        if (this.s == 0) {
            this.s = System.currentTimeMillis();
        }
        v2s.o().A().c(y + "-upDownSwipe#", "swipeInEnd: id=" + this.b + ", liveSource=" + this.f16721a + ", time=" + this.s);
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e57f19", new Object[]{this});
            return;
        }
        if (this.q == 0) {
            this.q = System.currentTimeMillis();
        }
        v2s.o().A().c(y + "-upDownSwipe#", "swipeInStart: id=" + this.b + ", liveSource=" + this.f16721a + ", time=" + this.q);
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609300b9", new Object[]{this});
            return;
        }
        if (this.r == 0) {
            this.r = System.currentTimeMillis();
        }
        v2s.o().A().c(y + "-upDownSwipe#", "swipeOutEnd: id=" + this.b + ", liveSource=" + this.f16721a + ", time=" + this.r);
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2527d355", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91572e64", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb25b7b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2129be8", new Object[]{this});
        } else if (hjr.d()) {
            HashMap hashMap = new HashMap();
            if (!((HashMap) this.g).containsKey("liveBizPmError")) {
                ((HashMap) this.g).put("liveBizPmError", "0");
            }
            if (!((HashMap) this.g).containsKey("interactPmError")) {
                ((HashMap) this.g).put("interactPmError", "0");
            }
            hashMap.putAll(this.g);
            v2s.o().s().a("BizPmStability", yj4.STAIN_TRACK_PAGE, hashMap);
            ((HashMap) this.g).clear();
            ((HashMap) this.g).put("liveBizPmError", "0");
            ((HashMap) this.g).put("interactPmError", "0");
        }
    }

    public final void L(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4ea420", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> f = f();
        f.put("pointString", str2);
        if (v2s.o().A() != null) {
            v2s.o().A().c(str, JSON.toJSONString(f));
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6dd484", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.j;
        long j2 = currentTimeMillis - this.h;
        this.w = j2;
        d("kUIRenderFinish", j, j2);
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8287cb5c", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.j;
        long j2 = currentTimeMillis - this.h;
        this.w = j2;
        d("kUIRenderFinish2", j, j2);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23de1081", new Object[]{this});
            return;
        }
        int i = this.u;
        if (i != 0) {
            ((HashMap) this.v).put("playerErrorCode", String.valueOf(i));
        }
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda3b88d", new Object[]{this, map});
        } else if (j()) {
            StringBuilder sb = new StringBuilder(" [ \n");
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sb.append("\t");
                sb.append(str);
                sb.append(":");
                sb.append(map.get(str));
                sb.append("\n");
            }
            sb.append(" ] \n");
            Log.e("kLifeCycle", sb.toString());
        }
    }

    public final void d(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d4b53b", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        Map<String, String> map = this.v;
        ((HashMap) map).put(str + "Duration", String.valueOf(j));
        Map<String, String> map2 = this.v;
        ((HashMap) map2).put(str + "TotalDuration", String.valueOf(j2));
        L(y, str);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54057e88", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enableFixPerformanceUt", "true"));
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("24d16441", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        return hashMap;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc5973f", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        d("kInteractiveH5RenderFinish", currentTimeMillis - this.j, currentTimeMillis - this.h);
    }

    public void h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e699f515", new Object[]{this, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        d("kInteractiveRenderFinish#" + str + "#", j, currentTimeMillis);
    }

    public void i(String str, int i, boolean z, String str2) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b78bf8", new Object[]{this, str, new Integer(i), new Boolean(z), str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        if (this.l || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        d(String.format("kRightComponent%dRenderFinish#%s#%s#", Integer.valueOf(i), str, str2), 0L, currentTimeMillis);
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4aeae8b", new Object[]{this})).booleanValue();
        }
        try {
            if ((v2s.o().f().getApplication().getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10153c8", new Object[]{this});
            return;
        }
        this.i = System.currentTimeMillis();
        cwd A = v2s.o().A();
        A.b("livedetailResponse", "mtopBegin" + this.i);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496b3b02", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.j = currentTimeMillis;
        d("kMtopReceive", currentTimeMillis - this.i, currentTimeMillis - this.h);
    }

    public void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc141b3", new Object[]{this, new Long(j)});
            return;
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.h = j;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcc539", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        d("kPageInitFinish", currentTimeMillis, currentTimeMillis);
    }

    public void o(long j) {
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad50552c", new Object[]{this, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i <= 0) {
            j = currentTimeMillis;
        }
        long j4 = j - this.k;
        long j5 = this.h;
        long j6 = j - j5;
        if (i == 0 || j4 < 0 || j5 == 0 || j6 < 0) {
            j3 = 1;
            j2 = 1;
        } else {
            j2 = j6;
            j3 = j4;
        }
        this.x = j2;
        d("kPlayerFirstFrameFinish", j3, j2);
        d("kPlayerFirstFrameRealFinish", currentTimeMillis - this.k, currentTimeMillis - this.h);
    }

    public void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b12ba90", new Object[]{this, str, str2});
        } else {
            ((HashMap) this.v).put(str, str2);
        }
    }

    public void q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a303bb", new Object[]{this, map});
        } else {
            ((HashMap) this.g).putAll(map);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.l = false;
        this.h = 0L;
        this.d = null;
        this.q = 0L;
        this.s = 0L;
        this.r = 0L;
        this.t = 0L;
        this.u = 0;
        ((HashMap) this.v).clear();
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a48500f", new Object[]{this});
        } else if (e()) {
            t();
        } else {
            u();
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca99769d", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3518aac", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8845bb06", new Object[]{this});
            return;
        }
        if (this.t == 0) {
            this.t = System.currentTimeMillis();
        }
        v2s.o().A().c(y + "-upDownSwipe#", "firstFrameFinish: id=" + this.b + ", liveSource=" + this.f16721a + ", time=" + this.t);
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757aec24", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else {
            this.f16721a = str;
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e351d7f", new Object[]{this});
            return;
        }
        this.p = false;
        ((HashMap) this.v).put("feedId", this.b);
        ((HashMap) this.v).put("livesource", this.f16721a);
        ((HashMap) this.v).put("deviceLevel", this.o);
        ((HashMap) this.v).put(yj4.PARAM_PLAYER_TOKEN, this.c);
        ((HashMap) this.v).put("viewMode", this.f);
        ((HashMap) this.v).put("enableMultiBatchRender", String.valueOf(this.l));
        ((HashMap) this.v).put("firstFrameTime", String.valueOf(this.x));
        ((HashMap) this.v).put("uiRenderFinish", String.valueOf(this.w));
        ((HashMap) this.v).put("playerReceivePlayData", String.valueOf(this.k));
        if (!TextUtils.isEmpty(this.d)) {
            ((HashMap) this.v).put("urlPlayMode", this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            ((HashMap) this.v).put(yj4.PARAM_PLAY_MODE, this.e);
        }
        if (!TextUtils.isEmpty(this.m)) {
            ((HashMap) this.v).put("h5RenderVersion", this.m);
        }
        if (!TextUtils.isEmpty(this.n)) {
            ((HashMap) this.v).put(hnn.KEY_VIDEO_TYPE, this.n);
        }
        if (!TextUtils.isEmpty(null)) {
            ((HashMap) this.v).put("videoFormat", null);
        }
        v2s.o().E().track4Click("Page_TaobaoLiveWatch", "kLifeCycle", this.v);
        v2s.o().s().a("kLifeCycle", "Page_TaobaoLiveWatch", this.v);
        K();
        c(this.v);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e018686", new Object[]{this});
        } else if (this.x >= 0 && this.w > 0 && this.k > 0) {
            this.p = false;
            ((HashMap) this.v).put("feedId", this.b);
            ((HashMap) this.v).put("livesource", this.f16721a);
            ((HashMap) this.v).put("deviceLevel", this.o);
            ((HashMap) this.v).put(yj4.PARAM_PLAYER_TOKEN, this.c);
            ((HashMap) this.v).put("viewMode", this.f);
            ((HashMap) this.v).put("enableMultiBatchRender", String.valueOf(this.l));
            if (!TextUtils.isEmpty(this.d)) {
                ((HashMap) this.v).put("urlPlayMode", this.d);
            }
            if (!TextUtils.isEmpty(this.e)) {
                ((HashMap) this.v).put(yj4.PARAM_PLAY_MODE, this.e);
            }
            if (!TextUtils.isEmpty(this.m)) {
                ((HashMap) this.v).put("h5RenderVersion", this.m);
            }
            if (!TextUtils.isEmpty(this.n)) {
                ((HashMap) this.v).put(hnn.KEY_VIDEO_TYPE, this.n);
            }
            if (!TextUtils.isEmpty(null)) {
                ((HashMap) this.v).put("videoFormat", null);
            }
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "kLifeCycle", this.v);
            K();
        }
    }

    public void b() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718f371c", new Object[]{this});
            return;
        }
        long j = this.s;
        if (j != 0) {
            long j2 = this.t;
            long j3 = j2 - this.q;
            int i2 = (j2 != 0 && j2 < j) ? 1 : 0;
            if (j2 != 0) {
                long j4 = this.r;
                if (j4 <= 0 || j2 <= 0 || j2 < j4) {
                    i = 1;
                }
            }
            ((HashMap) this.v).put("isPlayBeforeStable", String.valueOf(i2));
            ((HashMap) this.v).put("isPlayBeforeSwipe", String.valueOf(i));
            ((HashMap) this.v).put("startSwipeToFirstFrameDuration", String.valueOf(j3));
            v2s.o().A().c(y + "-upDownSwipe#", "send: id=" + this.b + ", liveSource=" + this.f16721a + ", isPlayBeforeStable=" + i2 + ", isPlayBeforeSwipe=" + i + ", startSwipeToFirstFrameDuration=" + j3);
        }
    }
}
