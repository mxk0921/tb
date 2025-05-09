package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.musie.NSMuiseViewHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class otf extends abx implements og3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String d;
    public final fo6 e;
    public final z2e f;
    public final acx g;
    public mtf l;
    public final yko o;

    /* renamed from: a  reason: collision with root package name */
    public final xgd f25641a = new qt4(this, 50);
    public final gbd b = new gjm();
    public String c = "";
    public final Map<String, Boolean> h = new HashMap();
    public final Runnable i = new ktf(this);
    public final TreeSet<Integer> j = new TreeSet<>();
    public int k = 0;
    public String m = "";
    public boolean n = false;
    public String p = null;
    public Map<String, Object> q = null;
    public Map<String, String> r = null;
    public int s = 0;
    public int t = 0;
    public long u = 0;
    public long v = 0;
    public final Handler w = new Handler(Looper.getMainLooper());

    static {
        t2o.a(995098632);
        t2o.a(993001759);
    }

    public otf(Activity activity, ude udeVar, acx acxVar) {
        super(activity, udeVar);
        yko core = udeVar.getCore();
        this.o = core;
        this.g = acxVar;
        try {
            this.f = (z2e) ((etf) core.f().f()).f().newInstance();
            this.e = q2();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(otf otfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/xsearchplugin/jarvis/JarvisKitWidget");
        }
    }

    public final List<a3e> A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("835bc70e", new Object[]{this});
        }
        return ((etf) this.o.f().f()).i();
    }

    public acx B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acx) ipChange.ipc$dispatch("8e297a2", new Object[]{this});
        }
        return this.g;
    }

    public final void C2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e85087", new Object[]{this, new Boolean(z)});
            return;
        }
        o02<? extends BaseSearchResult, LocalDataManager> e = this.g.e();
        BaseSearchResult baseSearchResult = (BaseSearchResult) e.getLastSearchResult();
        if (baseSearchResult != null && baseSearchResult.isSuccess() && !baseSearchResult.getCells().isEmpty() && z) {
            I2();
            F2(baseSearchResult);
            H2();
        }
        if (this.n) {
            ((gjm) this.b).c(e);
            G2(baseSearchResult);
        }
        ((qt4) this.f25641a).g(new ArrayList());
        ((qt4) this.f25641a).d(new ArrayList());
        for (a3e a3eVar : A2()) {
            a3eVar.b(this, new dh0(z));
        }
        List<String> z2 = z2("after");
        if (!z2.isEmpty()) {
            Map<String, Object> input = this.f.getInput("after", this);
            for (String str : z2) {
                if (c4p.i().j()) {
                    c4p.B("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
                }
                gtf.i().o(this.d, str, input, this.e);
            }
        }
    }

    public final void D2(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba512007", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(str)) {
            Map<String, String> map2 = this.r;
            if (map2 != null) {
                map.putAll(map2);
            }
            this.p = str;
            this.q = map;
            H2();
            for (a3e a3eVar : A2()) {
                a3eVar.e(this, new rt3(str, map));
            }
            List<String> z2 = z2("click");
            if (!(z2 == null || z2.isEmpty())) {
                Map<String, Object> input = this.f.getInput("click", this);
                if (map != null) {
                    input.putAll(map);
                }
                for (String str2 : z2) {
                    if (c4p.i().j()) {
                        c4p.B("[XSearchJarvis]", "page:" + this.d + ", event:" + str2 + ", inputData:\n", new JSONObject(input));
                    }
                    gtf.i().o(this.d, str2, input, this.e);
                }
            }
        }
    }

    public boolean E2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ccb2ab", new Object[]{this, str})).booleanValue();
        }
        Boolean bool = (Boolean) ((HashMap) this.h).get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void H2() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf0f26f", new Object[]{this});
            return;
        }
        this.w.removeCallbacks(this.i);
        mtf mtfVar = this.l;
        if (mtfVar != null) {
            i = mtfVar.b.b;
        } else {
            i = -1;
        }
        if (!z2("idle").isEmpty() && i > 0) {
            this.w.postDelayed(this.i, i * 1000);
        }
    }

    public final void I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29ed4ed", new Object[]{this});
            return;
        }
        this.c = "";
        this.j.clear();
        ((HashMap) this.h).clear();
        this.t = 0;
        this.k = 0;
        this.u = 0L;
        this.v = 0L;
        ((qt4) this.f25641a).l();
        ((gjm) this.b).a();
        this.l = null;
    }

    public void J2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e0bdbe", new Object[]{this, map});
        } else {
            this.r = map;
        }
    }

    public final boolean K2() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c2c877c", new Object[]{this})).booleanValue();
        }
        mtf mtfVar = this.l;
        if (mtfVar != null) {
            i = mtfVar.f24293a.b;
        } else {
            i = 0;
        }
        if (i < 2) {
            return true;
        }
        int i2 = this.s + 1;
        this.s = i2;
        int i3 = i2 % i;
        this.s = i3;
        if (i3 == 0) {
            return true;
        }
        return false;
    }

    public void L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496bccbd", new Object[]{this});
            return;
        }
        H2();
        if (this.g.g()) {
            List<String> z2 = z2("idle");
            if (!z2.isEmpty()) {
                Map<String, Object> input = this.f.getInput("idle", this);
                for (String str : z2) {
                    gtf.i().o(this.d, str, input, this.e);
                }
            }
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "JarvisKitWidget";
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        this.w.removeCallbacksAndMessages(null);
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.w.removeCallbacks(this.i);
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        H2();
        if (this.g.g() && !TextUtils.isEmpty(this.p)) {
            for (a3e a3eVar : A2()) {
                a3eVar.f(this, new rt3(this.p, null));
            }
            List<String> z2 = z2("detailBack");
            if (!z2.isEmpty()) {
                Map<String, Object> input = this.f.getInput("detailBack", this);
                Map<String, Object> map = this.q;
                if (map != null) {
                    input.putAll(map);
                }
                for (String str : z2) {
                    if (c4p.i().j()) {
                        c4p.B("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
                    }
                    gtf.i().o(this.d, str, input, this.e);
                }
                this.p = null;
                this.q = null;
            }
        }
    }

    public void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
        } else {
            C2(t2pVar.c());
        }
    }

    public final fo6 q2() throws Exception {
        return (fo6) ((etf) this.o.f().f()).g().getConstructor(otf.class).newInstance(this);
    }

    public Map<String, Object> s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39d91e7e", new Object[]{this});
        }
        return this.q;
    }

    public String t2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49fab165", new Object[]{this});
        }
        return this.m;
    }

    @Override // tb.og3
    public void u0(int i, BaseTypedBean baseTypedBean, long j, BaseSearchResult baseSearchResult, o02 o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52748deb", new Object[]{this, new Integer(i), baseTypedBean, new Long(j), baseSearchResult, o02Var});
            return;
        }
        this.j.remove(Integer.valueOf(i));
        for (a3e a3eVar : A2()) {
            a3eVar.d(this, new op7(baseTypedBean, i));
        }
    }

    public int u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c0fcf33", new Object[]{this})).intValue();
        }
        if (this.j.isEmpty()) {
            return -1;
        }
        return this.j.last().intValue();
    }

    public int v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1f665d5", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public fjm w2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjm) ipChange.ipc$dispatch("41bcf126", new Object[]{this, new Integer(i)});
        }
        return ((gjm) this.b).b(i);
    }

    public xgd x2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xgd) ipChange.ipc$dispatch("156a2b7f", new Object[]{this});
        }
        return this.f25641a;
    }

    public String y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this});
        }
        return this.d;
    }

    public final List<String> z2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3edd55f4", new Object[]{this, str});
        }
        mtf mtfVar = this.l;
        if (mtfVar == null) {
            return Collections.emptyList();
        }
        j22 a2 = mtfVar.a(str);
        if (a2 == null) {
            return Collections.emptyList();
        }
        return a2.f21711a;
    }

    public final void F2(BaseSearchResult baseSearchResult) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fe6b77", new Object[]{this, baseSearchResult});
        } else if (baseSearchResult != null) {
            String popExtMod = baseSearchResult.popExtMod("jarvisConfig");
            if (!TextUtils.isEmpty(popExtMod)) {
                try {
                    JSONObject parseObject = JSON.parseObject(popExtMod);
                    wpb d = ((etf) this.o.f().f()).d();
                    this.d = d.c(parseObject);
                    this.l = d.a(parseObject);
                    this.m = d.b(baseSearchResult);
                    JSONObject jSONObject = parseObject.getJSONObject("ext");
                    if (jSONObject != null && (intValue = jSONObject.getIntValue("max_buffer_size")) > 0) {
                        ((qt4) this.f25641a).n(intValue);
                    }
                    this.n = false;
                    this.n = JSON.parseObject(this.m).getBooleanValue("isOpenClientResort");
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // tb.og3
    public void n1(int i, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult, o02 o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783354d9", new Object[]{this, new Integer(i), baseTypedBean, baseSearchResult, o02Var});
            return;
        }
        this.k = Math.max(this.k, i);
        if (baseTypedBean != null) {
            this.j.add(Integer.valueOf(i));
            String c = ntf.c(baseTypedBean, this.o);
            if (!TextUtils.isEmpty(c)) {
                Boolean bool = (Boolean) ((HashMap) this.h).get(c);
                if (bool == null || !bool.booleanValue()) {
                    this.t++;
                }
                ((HashMap) this.h).put(c, Boolean.TRUE);
                if (this.c.length() > 0) {
                    this.c += ",";
                }
                this.c += c;
                for (a3e a3eVar : A2()) {
                    a3eVar.a(this, new v91(baseTypedBean, i, this.r));
                }
                List<String> z2 = z2("expose");
                if (!z2.isEmpty() && K2()) {
                    Map<String, Object> input = this.f.getInput("expose", this);
                    for (String str : z2) {
                        if (c4p.i().j()) {
                            c4p.B("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
                        }
                        gtf.i().o(this.d, str, input, this.e);
                    }
                    this.c = "";
                }
            }
        }
    }

    public void onEventMainThread(y2p y2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2e0d0", new Object[]{this, y2pVar});
        } else {
            C2(true);
        }
    }

    public final void G2(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384d6ed9", new Object[]{this, baseSearchResult});
            return;
        }
        xgd x2 = x2();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int cellsCount = baseSearchResult.getCellsCount() - 1; cellsCount >= 0; cellsCount--) {
            BaseCellBean baseCellBean = baseSearchResult.getCells().get(cellsCount);
            if (TextUtils.equals(baseCellBean.cardType, "item")) {
                if (baseCellBean.isP4p) {
                    arrayList2.add(baseCellBean);
                } else {
                    arrayList.add(baseCellBean);
                }
            }
        }
        if (t70.c().f()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BaseCellBean baseCellBean2 = (BaseCellBean) it.next();
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(baseCellBean2.itemId);
            }
            c4p.D("[XSearchJarvis]", "翻页追加buffer：" + sb.toString(), new Object[0]);
        }
        x2.h(arrayList);
        if (t70.c().f()) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                BaseCellBean baseCellBean3 = (BaseCellBean) it2.next();
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(baseCellBean3.itemId);
            }
            c4p.D("[XSearchJarvis]", "翻页追加广告buffer：" + sb2.toString(), new Object[0]);
        }
        x2.a(arrayList2);
    }

    public void onEventMainThread(jtf jtfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638438da", new Object[]{this, jtfVar});
        } else {
            D2(jtfVar.f22199a, jtfVar.b);
        }
    }

    public void onEventMainThread(zxo zxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858b8879", new Object[]{this, zxoVar});
        } else if (this.g.g()) {
            H2();
            for (a3e a3eVar : A2()) {
                a3eVar.g(this, new oxo(zxoVar.f33079a));
            }
        }
    }

    public void onEventMainThread(ayo ayoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f64efd3", new Object[]{this, ayoVar});
        } else if (this.g.g()) {
            H2();
            for (a3e a3eVar : A2()) {
                a3eVar.c(this, new oxo(ayoVar.f16078a));
            }
            List<String> z2 = z2(NSMuiseViewHolder.ACTION_STOP_SCROLL);
            if (!z2.isEmpty()) {
                rnq rnqVar = this.l.d;
                long currentTimeMillis = System.currentTimeMillis();
                int i = rnqVar.b;
                if (i <= 0 || currentTimeMillis - this.u >= i * 1000) {
                    int i2 = rnqVar.c;
                    if (i2 <= 0 || this.t - this.v >= i2) {
                        Map<String, Object> input = this.f.getInput(NSMuiseViewHolder.ACTION_STOP_SCROLL, this);
                        for (String str : z2) {
                            if (c4p.i().j()) {
                                c4p.B("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
                            }
                            gtf.i().o(this.d, str, input, this.e);
                        }
                        this.u = currentTimeMillis;
                        this.v = this.t;
                        return;
                    }
                    c4p.D("[XSearchJarvis]", "滚动停止触发曝光间隔不满足，当前间隔" + (this.t - this.v) + ", 触发间隔" + rnqVar.c, new Object[0]);
                    return;
                }
                c4p.D("[XSearchJarvis]", "滚动停止触发时间间隔不满足，当前间隔" + (currentTimeMillis - this.u) + "ms, 触发间隔" + (rnqVar.b * 1000) + "ms", new Object[0]);
            }
        }
    }

    public void onEventMainThread(f64 f64Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23ff93", new Object[]{this, f64Var});
        } else if (this.g.g()) {
            JSONObject jSONObject = f64Var.b;
            String str = f64Var.f19044a;
            if (!(TextUtils.isEmpty(str) || jSONObject == null || !"recordItemClick".equals(str))) {
                String string = jSONObject.getString("itemId");
                ArrayMap arrayMap = new ArrayMap();
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 != null) {
                    for (String str2 : jSONObject2.keySet()) {
                        String string2 = jSONObject2.getString(str2);
                        if (!TextUtils.isEmpty(string2)) {
                            arrayMap.put(str2, string2);
                        }
                    }
                }
                D2(string, arrayMap);
            }
        }
    }
}
