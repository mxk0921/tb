package tb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.tao.topmultitab.service.searchbar.HomeSearchBarServiceImpl;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qps extends bx implements a.e, a.d, a.AbstractC0710a, a.c, TBSwipeRefreshLayout.OnPullRefreshListener, hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final taj b;
    public final fuq c;
    public JSONObject d;
    public String e;
    public boolean h;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f26872a = Arrays.asList("tryShowTabTips", "showDownPanelTips");
    public long f = 0;
    public int g = 0;
    public final Handler i = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/pop/TabBarGuidePopLayerManager$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            qps.u(qps.this);
        }
    }

    static {
        t2o.a(729809582);
        t2o.a(729809499);
        t2o.a(729809498);
        t2o.a(729809585);
        t2o.a(729809497);
        t2o.a(932184133);
        t2o.a(729809365);
    }

    public qps(taj tajVar, fuq fuqVar) {
        this.b = tajVar;
        this.c = fuqVar;
    }

    public static /* synthetic */ Object ipc$super(qps qpsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/pop/TabBarGuidePopLayerManager");
    }

    public static /* synthetic */ void u(qps qpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77de390", new Object[]{qpsVar});
        } else {
            qpsVar.J();
        }
    }

    public final JSONObject A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("46ddf183", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        return jSONObject;
    }

    public final nsw B(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nsw) ipChange.ipc$dispatch("5c3282cd", new Object[]{this, str, str2, str3, str4, str5});
        }
        nsw nswVar = new nsw();
        nswVar.b("tips", str);
        nswVar.b("buttonText", str3);
        nswVar.b("anchorPointX", str4);
        nswVar.b("anchorPointY", str5);
        nswVar.b(vaj.KEY_TAB_ID, str2);
        nswVar.b("passParams", "");
        return nswVar;
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            k0b.e(this);
        }
    }

    public void D(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1084c876", new Object[]{this, new Long(j)});
            return;
        }
        d9j.c("TabBarGuidePopLayerManager", "execTriggerPopShow");
        this.i.removeCallbacksAndMessages(null);
        JSONObject k = vaj.k();
        this.d = k;
        if (k == null) {
            d9j.c("TabBarGuidePopLayerManager", "execTriggerPopShow GuidePopData null");
            return;
        }
        try {
            this.g = Integer.parseInt(E(k, "delayDisplayInterval")) * 1000;
        } catch (Exception e) {
            d9j.d("TabBarGuidePopLayerManager", "execTriggerPopShow parse time error", e);
        }
        this.i.sendEmptyMessageDelayed(1, this.g + j);
    }

    public final String E(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43839538", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getString(str);
    }

    public final String F(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("556a802b", new Object[]{this, jSONObject, str, str2});
        }
        JSONObject j = vaj.j(jSONObject, str);
        if (j == null || (jSONObject2 = j.getJSONObject("content")) == null) {
            return null;
        }
        return jSONObject2.getString(str2);
    }

    public final float[] G(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("1975d33e", new Object[]{this, str, new Integer(i)});
        }
        int[] f = ((com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.b.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY)).f(str);
        z6d c = h2b.a().c();
        if (c == null) {
            return new float[0];
        }
        if (c.q1() == null) {
            return new float[0];
        }
        return new float[]{a3b.g(f[0] - i), a3b.g(f[1] - HomeSearchBarServiceImpl.STATUS_HEIGHT_PX)};
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            k0b.d(this);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void a(int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff5e72f", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
            return;
        }
        d9j.c("TabBarGuidePopLayerManager", "onTabSelected ");
        D(300L);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.d
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
        } else {
            L("tabSlided", A("tab"));
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e64a789", new Object[]{this});
        } else {
            L("multiTabEditPanelShow", A("userManually"));
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void d(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a3619e", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        d9j.c("TabBarGuidePopLayerManager", "onTabUnselected ");
        L("tabSlided", A("page"));
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return this.f26872a;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        d9j.c("TabBarGuidePopLayerManager", "onPageScrollStateChanged ");
        this.e = "scroll";
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        d9j.c("TabBarGuidePopLayerManager", "onPageScrolled send pop event tabSlided");
        L("tabSlided", A("page"));
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        d9j.c("TabBarGuidePopLayerManager", "onPageScrolled send pop event dataRefresh");
        L("dataRefresh", A("pullDown"));
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.d
    public void onScrollStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616aa2a8", new Object[]{this});
            return;
        }
        d9j.c("TabBarGuidePopLayerManager", "onScrollStopped ");
        D(300L);
    }

    public final boolean w(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d3af203", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (Boolean.parseBoolean(E(jSONObject, "enableShowAtRecommend"))) {
            if (this.c.o() == this.c.n()) {
                return true;
            }
        } else if (this.c.o() == this.c.u(str) && v(jSONObject, str)) {
            return true;
        }
        return false;
    }

    public final boolean x(String str) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b03bd8ba", new Object[]{this, str})).booleanValue();
        }
        com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.b.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
        if (aVar == null || (a2 = aVar.a(str)) == null) {
            return false;
        }
        return a2.getGlobalVisibleRect(new Rect());
    }

    public final void y(JSONObject jSONObject) {
        int u;
        JSONObject j;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b521660", new Object[]{this, jSONObject});
        } else if (this.d != null && (u = this.c.u(E(jSONObject, vaj.KEY_TAB_ID))) != -1 && (j = vaj.j(jSONObject, "1")) != null && (jSONObject2 = j.getJSONObject("clickParam")) != null) {
            j.put("isTracked", (Object) Boolean.FALSE);
            vaj.e(jSONObject2, u);
            r5a.c(j);
        }
    }

    public final void z(JSONObject jSONObject, String str) {
        JSONObject j;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269a9a74", new Object[]{this, jSONObject, str});
            return;
        }
        int u = this.c.u(str);
        if (u != -1 && (j = vaj.j(jSONObject, "0")) != null && (jSONObject2 = j.getJSONObject(i2b.TRACK_EXPOSURE_PARAM)) != null) {
            vaj.e(jSONObject2, u);
            j.put("isTracked", (Object) Boolean.FALSE);
            r5a.l(j);
        }
    }

    public final void J() {
        StringBuilder sb;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569c0847", new Object[]{this});
            return;
        }
        int o = this.c.o();
        String t = this.c.t(o);
        if (o == this.c.n()) {
            sb = new StringBuilder();
            sb.append(r5a.f27121a);
            sb.append("_Recommend");
        } else {
            sb = new StringBuilder();
            sb.append(this.c.j(o));
            sb.append("_");
            sb.append(t);
        }
        String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(vaj.KEY_TAB_ID, (Object) t);
        jSONObject.put("tabIndex", (Object) Integer.valueOf(o));
        if (TextUtils.isEmpty(this.e)) {
            str = "click";
        } else {
            str = this.e;
        }
        jSONObject.put("enterType", (Object) str);
        try {
            d9j.c("TabBarGuidePopLayerManager", "execTriggerPopShow sendUCPEvent:");
            this.f = System.currentTimeMillis();
            UCPManager.p(sb2, "tap", "PageHomeTabEnter", jSONObject);
        } catch (Exception e) {
            d9j.d("TabBarGuidePopLayerManager", "sendUCPEvent error", e);
        }
        this.e = null;
        this.h = false;
    }

    public final void L(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d30282", new Object[]{this, str, jSONObject});
        } else if (System.currentTimeMillis() - this.f < 300) {
            d9j.c("TabBarGuidePopLayerManager", "triggerPopRemove 保护时间内不触发移除");
        } else if (!this.h) {
            this.i.removeCallbacksAndMessages(null);
            rgm.h().p("PageTaoHome", str, jSONObject, null);
            this.h = true;
        }
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "tryShowTabTips")) {
            return I(this.d, wVCallBackContext);
        }
        if (!TextUtils.equals(str, "showDownPanelTips")) {
            return false;
        }
        L("multiTabEditPanelShow", A("userManually"));
        return K(str2);
    }

    public final boolean K(String str) {
        JSONObject j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad4ba890", new Object[]{this, str})).booleanValue();
        }
        String v = vaj.v(str);
        if (TextUtils.isEmpty(v) || (j = vaj.j(this.d, "3")) == null) {
            return false;
        }
        JSONObject jSONObject = j.getJSONObject("ext");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            j.put("ext", (Object) jSONObject);
        }
        jSONObject.put(vaj.KEY_TAB_ID, (Object) v);
        d9j.c("TabBarGuidePopLayerManager", "triggerCustomPanelShow :");
        ((com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.b.b(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY)).b(j);
        y(this.d);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[LOOP:0: B:18:0x0051->B:23:0x0063, LOOP_START, PHI: r2 
      PHI: (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:16:0x004e, B:23:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(com.alibaba.fastjson.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.qps.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "7b8bd923"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r5
            r4[r1] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            java.lang.String r2 = "startPos"
            java.lang.String r2 = r5.E(r6, r2)
            java.lang.String r3 = "endPos"
            java.lang.String r6 = r5.E(r6, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0065
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0039
            goto L_0x0065
        L_0x0039:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: Exception -> 0x0044
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: Exception -> 0x0042
            goto L_0x004e
        L_0x0042:
            r6 = move-exception
            goto L_0x0046
        L_0x0044:
            r6 = move-exception
            r2 = 0
        L_0x0046:
            java.lang.String r3 = "TabBarGuidePopLayerManager"
            java.lang.String r4 = "checkRangeAvailable parseIntError"
            tb.d9j.d(r3, r4, r6)
            r6 = 0
        L_0x004e:
            if (r6 > r2) goto L_0x0051
            return r0
        L_0x0051:
            int r3 = r6 + 1
            if (r2 >= r3) goto L_0x0065
            tb.fuq r3 = r5.c
            java.lang.String r3 = r3.t(r2)
            boolean r3 = android.text.TextUtils.equals(r3, r7)
            if (r3 == 0) goto L_0x0063
            r0 = 1
            goto L_0x0065
        L_0x0063:
            int r2 = r2 + r1
            goto L_0x0051
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qps.v(com.alibaba.fastjson.JSONObject, java.lang.String):boolean");
    }

    public final boolean I(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f6de45", new Object[]{this, jSONObject, wVCallBackContext})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String E = E(jSONObject, vaj.KEY_TAB_ID);
        if (TextUtils.isEmpty(E)) {
            d9j.c("TabBarGuidePopLayerManager", "renderGuidePopView tabId null");
            return false;
        } else if (!w(jSONObject, E)) {
            d9j.c("TabBarGuidePopLayerManager", "check show page fail");
            return false;
        } else if (!x(E)) {
            d9j.c("TabBarGuidePopLayerManager", "check view visible fail");
            return false;
        } else {
            try {
                i = Integer.parseInt(E(jSONObject, "guideArrowOffset"));
            } catch (Exception e) {
                d9j.d("TabBarGuidePopLayerManager", "parseInt arrowOffset error", e);
                i = 8;
            }
            float[] G = G(E, i);
            if (G.length < 2) {
                return false;
            }
            wVCallBackContext.success(B(F(jSONObject, "0", "text"), E, F(jSONObject, "1", "buttonText"), String.valueOf(G[0]), String.valueOf(G[1])));
            z(jSONObject, E);
            return true;
        }
    }
}
