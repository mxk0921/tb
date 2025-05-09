package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.SubWrapFrameLayout;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ovq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fuq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_ITEM_INDEX = -2;
    public final fdc k;
    public IHomeSubTabController l;
    public IHomeSubTabController m;
    public final ovq.c n;
    public IMultiTabPerformanceListener o;
    public IMultiTabStabilityListener p;
    public otd q;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, IHomeSubTabController> f19537a = new ConcurrentHashMap();
    public final Map<String, View> b = new ConcurrentHashMap();
    public final Map<String, JSONObject> c = new ConcurrentHashMap();
    public final Map<String, String> d = new ConcurrentHashMap();
    public final Map<Integer, String> e = new ConcurrentHashMap();
    public int f = 1;
    public int g = -1;
    public String h = "recommend";
    public int i = -1;
    public int j = -1;
    public int r = -1;

    static {
        t2o.a(729809459);
    }

    public fuq(fdc fdcVar, ovq.c cVar) {
        f4b.i("multiTabInstanceSize", 3);
        this.k = fdcVar;
        this.n = cVar;
    }

    public static boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96537da7", new Object[]{context})).booleanValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        double d = memoryInfo.availMem / memoryInfo.totalMem;
        d9j.c("SubMultiTabManager", "memoryAvailable availablePercent:" + d);
        if (d > f4b.e("MultiTabMemPercent", 0.1d)) {
            return true;
        }
        return false;
    }

    public boolean A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeddc222", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i != this.i || i == this.f) {
            return false;
        }
        return true;
    }

    public final boolean B(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68de9da2", new Object[]{this, view})).booleanValue();
        }
        if (view instanceof SubWrapFrameLayout) {
            return ((SubWrapFrameLayout) view).isRealView();
        }
        return true;
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37df94", new Object[]{this, new Integer(i)});
            return;
        }
        String t = t(i);
        if (!TextUtils.isEmpty(t)) {
            ((ConcurrentHashMap) this.f19537a).put(t, this.l);
        }
    }

    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0fe266", new Object[]{this, new Integer(i)});
            return;
        }
        d9j.c("SubMultiTabManager", "removeTabView:  " + i);
        if (i != -1) {
            String t = t(i);
            if (!TextUtils.isEmpty(t)) {
                ((ConcurrentHashMap) this.b).remove(t);
            }
        }
    }

    public final void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1cf258", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a9fa81", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void I(IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79038be2", new Object[]{this, iMultiTabPerformanceListener});
        } else {
            this.o = iMultiTabPerformanceListener;
        }
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b38733", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void K(IMultiTabStabilityListener iMultiTabStabilityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b7b900", new Object[]{this, iMultiTabStabilityListener});
        } else {
            this.p = iMultiTabStabilityListener;
        }
    }

    public void L(otd otdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e6cd41", new Object[]{this, otdVar});
        } else {
            this.q = otdVar;
        }
    }

    public void N(String str, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b8974", new Object[]{this, str, new Integer(i), jSONObject});
            return;
        }
        int u = u(str);
        if (u == this.f || TextUtils.equals(str, this.h)) {
            d9j.c("SubMultiTabManager", "updateTabCache recommend not update: ");
            return;
        }
        d9j.c("SubMultiTabManager", "updateTabCache tabId:" + str + ",originalPosition:" + u + ",newPosition:" + i);
        if (((View) ((ConcurrentHashMap) this.b).get(str)) instanceof SubWrapFrameLayout) {
            ((ConcurrentHashMap) this.b).remove(str);
        }
        ((ConcurrentHashMap) this.e).remove(Integer.valueOf(i));
        ((ConcurrentHashMap) this.e).put(Integer.valueOf(i), str);
        ((ConcurrentHashMap) this.c).put(str, jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("containerType");
            ((ConcurrentHashMap) this.d).put(str, string);
            D(string, i, str, jSONObject);
        }
    }

    public void a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b9b503", new Object[]{this, iHomeSubTabController});
        } else {
            this.l = iHomeSubTabController;
        }
    }

    public final void b(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95de9ee", new Object[]{this, new Integer(i), view});
            return;
        }
        String t = t(i);
        if (!TextUtils.isEmpty(t) && !((ConcurrentHashMap) this.b).containsKey(t) && view != null) {
            ((ConcurrentHashMap) this.b).put(t, view);
            d9j.c("SubMultiTabManager", "cache position :  " + i + ",view:" + view);
        }
    }

    public void c(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd68995", new Object[]{this, new Integer(i), view});
        } else if (z(view.getContext())) {
            d9j.c("SubMultiTabManager", "cacheViewByMemory memoryAvailable");
            b(i, view);
        } else {
            d9j.c("SubMultiTabManager", "cacheViewByMemory removeFarthestTab");
            E(i);
            b(i, view);
        }
    }

    public View d(int i, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7ed2037", new Object[]{this, new Integer(i), context, str});
        }
        IHomeSubTabController q = q(i);
        if (q == null) {
            d9j.c("SubMultiTabManager", "SubMultiTabManger -> createView iHomeSubTabController null ");
            return new View(context);
        }
        String t = t(i);
        if (TextUtils.isEmpty(t)) {
            return new View(context);
        }
        ((suq) this.q).c(i);
        G(i);
        this.o.f(t, System.currentTimeMillis(), str);
        View createView = q.createView(context);
        this.o.b(t, System.currentTimeMillis(), str);
        ((suq) this.q).b(i);
        return createView;
    }

    public View e(ViewGroup viewGroup, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        String t = t(i);
        d9j.c("SubMultiTabManager", "createView: position " + i + ",tabId:" + t);
        Context context = viewGroup.getContext();
        if (vxl.b().z() && (context instanceof cew)) {
            Context a2 = ((cew) context).a();
            if (a2 instanceof Activity) {
                context = a2;
            }
        }
        if (TextUtils.isEmpty(t)) {
            return new SubWrapFrameLayout(context, i);
        }
        View view2 = (View) ((ConcurrentHashMap) this.b).get(t);
        if (view2 != null) {
            d9j.c("SubMultiTabManager", "createView: position 存在 " + i);
            return view2;
        }
        if (this.j == i || i == this.f) {
            view = d(i, context, "tabSelected");
            d9j.c("SubMultiTabManager", "SubMultiTabManger -> createView: 创建真实视图  " + i + "， view " + view);
        } else {
            d9j.c("SubMultiTabManager", "SubMultiTabManger -> createView SubWrapFrameLayout " + i);
            view = new SubWrapFrameLayout(context, i);
        }
        c(i, view);
        return view;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832e9d6c", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.f19537a).entrySet()) {
            ((IHomeSubTabController) entry.getValue()).onDestroy();
        }
        ((ConcurrentHashMap) this.f19537a).clear();
        ((ConcurrentHashMap) this.b).clear();
        ((ConcurrentHashMap) this.d).clear();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eeb725b", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.f19537a).entrySet()) {
            if (!TextUtils.equals((CharSequence) entry.getKey(), this.h)) {
                ((IHomeSubTabController) entry.getValue()).onDestroy();
                if (u((String) entry.getKey()) != this.g || (entry.getValue() instanceof ovq)) {
                    ((ConcurrentHashMap) this.f19537a).remove(entry.getKey());
                }
            }
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.b).entrySet()) {
            if (!TextUtils.equals((CharSequence) entry2.getKey(), this.h)) {
                ((ConcurrentHashMap) this.b).remove(entry2.getKey());
            }
        }
        for (Map.Entry entry3 : ((ConcurrentHashMap) this.d).entrySet()) {
            if (!TextUtils.equals((CharSequence) entry3.getKey(), this.h)) {
                ((ConcurrentHashMap) this.d).remove(entry3.getKey());
            }
        }
        for (Map.Entry entry4 : ((ConcurrentHashMap) this.c).entrySet()) {
            if (!TextUtils.equals((CharSequence) entry4.getKey(), this.h)) {
                ((ConcurrentHashMap) this.c).remove(entry4.getKey());
            }
        }
    }

    public String j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("561202a9", new Object[]{this, new Integer(i)});
        }
        String t = t(i);
        if (TextUtils.isEmpty(t)) {
            return "";
        }
        return (String) ((ConcurrentHashMap) this.d).get(t);
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("160892f2", new Object[]{this})).intValue();
        }
        int i = this.r;
        this.r = -1;
        return i;
    }

    public IHomeSubTabController m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("71a4203f", new Object[]{this});
        }
        return q(this.f);
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea035e49", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48e8b235", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a570eb", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public IHomeSubTabController q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("d5eaa2e", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i > ((ConcurrentHashMap) this.f19537a).size()) {
            return null;
        }
        String t = t(i);
        if (TextUtils.isEmpty(t)) {
            return null;
        }
        return (IHomeSubTabController) ((ConcurrentHashMap) this.f19537a).get(t);
    }

    public IHomeSubTabController r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("8dd100", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (IHomeSubTabController) ((ConcurrentHashMap) this.f19537a).get(str);
    }

    public JSONObject s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("898b1373", new Object[]{this, new Integer(i)});
        }
        if (i >= ((ConcurrentHashMap) this.c).size() || i < 0) {
            d9j.c("SubMultiTabManager", "数组越界");
            return null;
        }
        String t = t(i);
        if (TextUtils.isEmpty(t)) {
            return null;
        }
        return (JSONObject) ((ConcurrentHashMap) this.c).get(t);
    }

    public String t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1890371e", new Object[]{this, new Integer(i)});
        }
        return (String) ((ConcurrentHashMap) this.e).get(Integer.valueOf(i));
    }

    public int u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7594df7", new Object[]{this, str})).intValue();
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.e).entrySet()) {
            if (TextUtils.equals(str, (CharSequence) entry.getValue())) {
                return ((Integer) entry.getKey()).intValue();
            }
        }
        return -1;
    }

    public JSONObject v(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a14454e5", new Object[]{this, iHomeSubTabController});
        }
        d9j.c("SubMultiTabManager", "getTabSelfData");
        for (Map.Entry entry : ((ConcurrentHashMap) this.f19537a).entrySet()) {
            if (iHomeSubTabController == entry.getValue()) {
                int u = u((String) entry.getKey());
                JSONObject s = s(u);
                d9j.c("SubMultiTabManager", "getTabSelfData，position:" + u);
                return s;
            }
        }
        return null;
    }

    public View w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e74eeba", new Object[]{this, new Integer(i)});
        }
        String t = t(i);
        if (TextUtils.isEmpty(t)) {
            return null;
        }
        return (View) ((ConcurrentHashMap) this.b).get(t);
    }

    public String x(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a832121a", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (z) {
            return h(i);
        }
        return i(i);
    }

    public boolean y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f5258b1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        String t = t(i);
        if (TextUtils.isEmpty(t)) {
            return true;
        }
        return !((ConcurrentHashMap) this.b).containsKey(t);
    }

    public final void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12758486", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = -1;
        for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
            int u = u((String) entry.getKey());
            if (!(u == this.f || u == this.j || (f4b.b("enableFixDestroyCurrentTabOnLowMemory", true) && u == i))) {
                int abs = Math.abs(i - u);
                if (abs > i2 && B((View) entry.getValue())) {
                    i3 = u;
                    i2 = abs;
                }
            }
        }
        String t = t(i3);
        if (!TextUtils.isEmpty(t) && ((ConcurrentHashMap) this.b).containsKey(t)) {
            View view = (View) ((ConcurrentHashMap) this.b).get(t);
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            ((ConcurrentHashMap) this.b).remove(t);
            d9j.c("SubMultiTabManager", "移除 farthestTabId :  " + t);
        }
    }

    public final String h(int i) {
        String n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e8640ed", new Object[]{this, new Integer(i)});
        }
        do {
            i++;
            if (i >= ((ConcurrentHashMap) this.c).size()) {
                return null;
            }
            n = vaj.n(s(i));
        } while (TextUtils.isEmpty(n));
        d9j.c("SubMultiTabManager", "从左往右找，找到的链接是：" + n);
        return n;
    }

    public final String i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b43f1f1", new Object[]{this, new Integer(i)});
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            String n = vaj.n(s(i2));
            if (!TextUtils.isEmpty(n)) {
                d9j.c("SubMultiTabManager", "从右往左找，找到的链接是：" + n);
                return n;
            }
        }
        return null;
    }

    public void M(JSONObject jSONObject, IHomeSubTabController iHomeSubTabController) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8b886", new Object[]{this, jSONObject, iHomeSubTabController});
            return;
        }
        g();
        List<JSONObject> x = vaj.x(jSONObject);
        if (x != null) {
            ((ConcurrentHashMap) this.e).clear();
            for (int i = 0; i < x.size(); i++) {
                JSONObject jSONObject3 = x.get(i);
                if (!(jSONObject3 == null || (jSONObject2 = x.get(i).getJSONObject("content")) == null)) {
                    String string = jSONObject2.getString(vaj.KEY_TAB_ID);
                    if (!TextUtils.isEmpty(string)) {
                        ((ConcurrentHashMap) this.c).put(string, jSONObject3);
                        ((ConcurrentHashMap) this.e).put(Integer.valueOf(i), string);
                        String string2 = jSONObject2.getString("containerType");
                        ((ConcurrentHashMap) this.d).put(string, string2);
                        String string3 = jSONObject2.getString(vaj.KEY_IS_RECOMMEND_TAB);
                        if (!TextUtils.isEmpty(string3) && Boolean.parseBoolean(string3)) {
                            this.m = iHomeSubTabController;
                            if (iHomeSubTabController == null) {
                                this.m = new i0b(this.k, xti.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
                            }
                        }
                        D(string2, i, string, jSONObject3);
                    }
                }
            }
        }
    }

    public b5b l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b5b) ipChange.ipc$dispatch("3a65a8cb", new Object[]{this});
        }
        for (int i = 0; i < ((ConcurrentHashMap) this.f19537a).size(); i++) {
            String t = t(i);
            if (!TextUtils.isEmpty(t)) {
                IHomeSubTabController iHomeSubTabController = (IHomeSubTabController) ((ConcurrentHashMap) this.f19537a).get(t);
                if (iHomeSubTabController instanceof b5b) {
                    b5b b5bVar = (b5b) iHomeSubTabController;
                    d9j.c("SubMultiTabManager", "第一个web视图 position :  " + i);
                    return b5bVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r8.equals(com.taobao.tao.topmultitab.service.controller.IHomeControllerService.HOME_TAB_ID_HOUR_DELIVERY) == false) goto L_0x0042;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.lang.String r8, int r9, java.lang.String r10, com.alibaba.fastjson.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fuq.D(java.lang.String, int, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }
}
