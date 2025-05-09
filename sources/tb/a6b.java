package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.ThemeServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.globaltheme.compose.GlobalThemeConfig;
import java.util.List;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a6b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f15564a;
    public h6c.a b;
    public ThemeFrameLayout c;
    public GlobalThemeConfig d;
    public final IHostService e;
    public final IMainFeedsViewService<?> f;
    public final rbp g = new rbp();
    public final ept h;
    public final s9c i;
    public int j;
    public IRocketSubService k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782837);
            t2o.a(488636468);
        }

        public b() {
        }

        @Override // tb.h6c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd5e6c3d", new Object[]{this, new Integer(i)});
                return;
            }
            a6b a6bVar = a6b.this;
            a6b.c(a6bVar, a6b.a(a6bVar), a6b.b(a6b.this));
        }

        @Override // tb.h6c.a
        public void b(Canvas canvas, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed0a999c", new Object[]{this, canvas, viewGroup});
            } else {
                a6b.d(a6b.this, canvas, viewGroup);
            }
        }
    }

    static {
        t2o.a(491782835);
    }

    public a6b(cfc cfcVar, String str, s9c s9cVar) {
        this.f15564a = cfcVar;
        this.e = (IHostService) cfcVar.a(IHostService.class);
        this.f = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.h = new ept(str);
        this.i = s9cVar;
    }

    public static /* synthetic */ ThemeFrameLayout a(a6b a6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeFrameLayout) ipChange.ipc$dispatch("e636497f", new Object[]{a6bVar});
        }
        return a6bVar.c;
    }

    public static /* synthetic */ int b(a6b a6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a29e4770", new Object[]{a6bVar})).intValue();
        }
        return a6bVar.j;
    }

    public static /* synthetic */ void c(a6b a6bVar, ThemeFrameLayout themeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17586a4e", new Object[]{a6bVar, themeFrameLayout, new Integer(i)});
        } else {
            a6bVar.y(themeFrameLayout, i);
        }
    }

    public static /* synthetic */ void d(a6b a6bVar, Canvas canvas, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2efaf405", new Object[]{a6bVar, canvas, viewGroup});
        } else {
            a6bVar.i(canvas, viewGroup);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4769387f", new Object[]{this});
        } else if (this.b == null) {
            this.b = new b();
            this.f.getLifeCycleRegister().m(this.b);
        }
    }

    public final int f(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cf15ea3", new Object[]{this, globalThemeConfig})).intValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f15564a.a(IContainerDataService.class);
        List totalData = (iContainerDataService == null || iContainerDataService.getContainerData() == null) ? null : iContainerDataService.getContainerData().getTotalData();
        int b2 = (globalThemeConfig == null || totalData == null || totalData.isEmpty()) ? -1 : e83.b(this.d.bgEndSection, totalData);
        if (b2 < 0) {
            b2 = n(this.f15564a);
        }
        if (b2 < 0) {
            fve.e("HostGlobalThemeHandler", "统一背景找不到锚点");
        }
        fve.e("HostGlobalThemeHandler", "themeBgEndSectionPosition = " + b2);
        return b2;
    }

    public final void g(ThemeFrameLayout themeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f3b2d0", new Object[]{this, themeFrameLayout});
        } else if (themeFrameLayout != null && themeFrameLayout.getParent() == null) {
            this.e.getInvokeCallback().g().setBgView(themeFrameLayout);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            u();
        }
    }

    public final void i(Canvas canvas, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed0a999c", new Object[]{this, canvas, viewGroup});
            return;
        }
        int n = n(this.f15564a);
        this.g.f(canvas, viewGroup, o(n), n, this.f.getVisiblePositionRange());
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8428fa22", new Object[]{this})).intValue();
        }
        ThemeFrameLayout themeFrameLayout = this.c;
        if (themeFrameLayout == null) {
            return -1;
        }
        return themeFrameLayout.hashCode();
    }

    public final GlobalThemeConfig k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalThemeConfig) ipChange.ipc$dispatch("f299f221", new Object[]{this, jSONObject});
        }
        GlobalThemeConfig globalThemeConfig = null;
        if (!cpt.a() || jSONObject == null) {
            return null;
        }
        try {
            globalThemeConfig = (GlobalThemeConfig) JSON.parseObject(jSONObject.toJSONString(), GlobalThemeConfig.class);
        } catch (Throwable th) {
            fve.c("HostGlobalThemeHandler", "getGlobalBgThemeConfig error ", th);
        }
        return v(globalThemeConfig);
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c6288c", new Object[]{this})).intValue();
        }
        ged k = this.e.getInvokeCallback().k();
        if (k != null) {
            return k.u();
        }
        return 0;
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5411de96", new Object[]{this})).intValue();
        }
        czc i = this.e.getInvokeCallback().i();
        if (i != null) {
            return (int) i.c();
        }
        return 0;
    }

    public final int n(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c80bdeef", new Object[]{this, cfcVar})).intValue();
        }
        if (this.k == null) {
            this.k = (IRocketSubService) cfcVar.a(IRocketSubService.class);
        }
        IRocketSubService iRocketSubService = this.k;
        if (iRocketSubService != null) {
            return iRocketSubService.getRocketAnchorPosition();
        }
        return -1;
    }

    public final View o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7e64835b", new Object[]{this, new Integer(i)});
        }
        if (i == -1) {
            return null;
        }
        return this.f.findItemViewByPosition(i);
    }

    public final boolean p() {
        u5d j;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.e;
        if (iHostService == null || (j = iHostService.getInvokeCallback().j()) == null) {
            return false;
        }
        if (j.f() == null) {
            context = eue.a();
        } else {
            context = j.f();
        }
        return oza.a(context);
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8115ee64", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = this.e;
        if (iHostService == null || iHostService.getInvokeCallback().g() == null || this.f == null) {
            return false;
        }
        return true;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe0f9c2", new Object[]{this});
            return;
        }
        this.g.i();
        if (gj7.a()) {
            u();
            x();
            fve.e("HostGlobalThemeHandler", "reset global bg view for fold device");
        }
    }

    public final void s(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a13b1e", new Object[]{this, globalThemeConfig});
        } else if (globalThemeConfig == null || p()) {
            u();
        } else {
            if (!globalThemeConfig.equals(this.d)) {
                w(globalThemeConfig);
                if (this.c == null) {
                    eve.c("HostGlobalThemeHandler", "createThemeFrameLayout");
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.c = this.h.c();
                    fve.e("HostGlobalThemeHandler", "Theme createThemeFrameLayout use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    eve.b("HostGlobalThemeHandler", "createThemeFrameLayout");
                }
                if (this.c != null) {
                    this.j = f(globalThemeConfig);
                    eve.c("HostGlobalThemeHandler", "updateThemeFrameLayoutHeight");
                    y(this.c, this.j);
                    eve.b("HostGlobalThemeHandler", "updateThemeFrameLayoutHeight");
                } else {
                    return;
                }
            }
            eve.c("HostGlobalThemeHandler", "checkAddToHost");
            g(this.c);
            eve.b("HostGlobalThemeHandler", "checkAddToHost");
            e();
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a3d2a2", new Object[]{this});
        } else if (this.b != null) {
            this.f.getLifeCycleRegister().F(this.b);
            this.b = null;
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21383", new Object[]{this});
            return;
        }
        this.h.f();
        this.g.j();
        this.c = null;
        this.d = null;
        if (q()) {
            t();
            this.e.getInvokeCallback().g().setBgView(null);
        }
    }

    public final GlobalThemeConfig v(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalThemeConfig) ipChange.ipc$dispatch("1a1a535c", new Object[]{this, globalThemeConfig});
        }
        if (!vxl.b().o() || !TextUtils.equals(globalThemeConfig.separatorImageUrl, "https://gw.alicdn.com/imgextra/i2/O1CN01gGJZH91CMGxw2F5Ru_!!6000000000066-0-tps-1125-180.jpg") || !TextUtils.equals(globalThemeConfig.themeData.skinPic, "https://gw.alicdn.com/imgextra/i4/O1CN018T87Vf1J6syBsDMJA_!!6000000000980-0-tps-1125-1125.jpg")) {
            return globalThemeConfig;
        }
        fve.e("HostGlobalThemeHandler", "discardEmptyTheme");
        return null;
    }

    public final void w(GlobalThemeConfig globalThemeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81d25cf", new Object[]{this, globalThemeConfig});
            return;
        }
        this.g.l(globalThemeConfig.separatorImageUrl);
        this.g.k(globalThemeConfig.maskBackgroundColor);
        this.h.g(globalThemeConfig.themeData);
        this.d = globalThemeConfig;
    }

    public void x() {
        ThemeData themeData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ad3329", new Object[]{this});
        } else if (!q()) {
            fve.e("HostGlobalThemeHandler", "isEnableGlobalTheme is false");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            eve.c("HostGlobalThemeHandler", "getGlobalBgThemeConfig");
            GlobalThemeConfig k = k(((ThemeServiceImpl.a) this.i).a());
            if (!(k == null || (themeData = k.themeData) == null)) {
                themeData.isComplexTexture = String.valueOf(q92.a());
            }
            eve.b("HostGlobalThemeHandler", "getGlobalBgThemeConfig");
            eve.c("HostGlobalThemeHandler", "refreshGlobalThemeView");
            s(k);
            eve.b("HostGlobalThemeHandler", "refreshGlobalThemeView");
            fve.k("HostGlobalThemeHandler", "Theme refreshGlobalThemeView use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
    }

    public final void y(ThemeFrameLayout themeFrameLayout, int i) {
        int[] itemViewHeights;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5d8675", new Object[]{this, themeFrameLayout, new Integer(i)});
        } else if (themeFrameLayout != null && (itemViewHeights = this.f.getItemViewHeights()) != null && itemViewHeights.length != 0 && i >= 0) {
            int l = l();
            if (l != 0) {
                i2 = 0 - l;
            } else {
                i2 = 0;
            }
            int max = Math.max(0, i2);
            for (int i3 = 0; i3 <= i; i3++) {
                max += itemViewHeights[i3];
            }
            this.h.i(themeFrameLayout, max + m());
        }
    }
}
