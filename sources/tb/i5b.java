package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.tao.Globals;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i5b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAUNCHER_NAME = "launcherName";
    public static final String LAUNCHER_TRIGGER = "triggerLauncher";
    public static final String LAUNCHER_TYPE = "launcherType";
    public static Boolean e;
    public static final AtomicInteger f = new AtomicInteger(-1);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f21101a = new AtomicBoolean(false);
    public Boolean b;
    public Boolean c;
    public Boolean d;

    static {
        t2o.a(729809212);
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("125619", new Object[]{this})).intValue();
        }
        return f4b.i("HomepageQosQueueDoFrameCount", 4);
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29871a78", new Object[]{this})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "homeTabInitOpt4");
        bqa.d("HomepageOptUtils", "homeTabInitOpt4: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("190e2d95", new Object[]{this})).booleanValue();
        }
        if (!B()) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "homeTabPreCreateOpt4");
        bqa.d("HomepageOptUtils", "homeTabPreCreateOpt: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean D() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dd3340f", new Object[]{this})).booleanValue();
        }
        if (BootstrapMode.o() && ABGlobal.isFeatureOpened(Globals.getApplication(), "homepagePreRenderEight")) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "homepagePreRenderEight  = " + z);
        return z;
    }

    public boolean E() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9646d9c", new Object[]{this})).booleanValue();
        }
        if (BootstrapMode.o() && ABGlobal.isFeatureOpened(Globals.getApplication(), "homepagePreRenderFour")) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "homepagePreRenderFour  = " + z);
        return z;
    }

    public boolean F() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f171822", new Object[]{this})).booleanValue();
        }
        if (BootstrapMode.o() && ABGlobal.isFeatureOpened(Globals.getApplication(), "homepagePreRenderSix")) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "homepagePreRenderSix  = " + z);
        return z;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9e6451", new Object[]{this})).booleanValue();
        }
        AtomicInteger atomicInteger = f;
        if (atomicInteger.get() < 0) {
            atomicInteger.set(fxp.g(fxp.j()));
        }
        if (atomicInteger.get() == 1) {
            return true;
        }
        return false;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("495ccf28", new Object[]{this})).booleanValue();
        }
        return f4b.b("coldStartSupportDelta", true);
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0ce0196", new Object[]{this})).booleanValue();
        }
        return BootstrapMode.o();
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d574ec9a", new Object[]{this, new Boolean(z)});
        } else {
            this.f21101a.set(z);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9effc4fd", new Object[]{this})).booleanValue();
        }
        boolean i = vxl.i();
        bqa.d("HomepageOptUtils", "closeNetworkDataUploadByLowDevice: " + i);
        return i;
    }

    public boolean b() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83531b43", new Object[]{this})).booleanValue();
        }
        if (vxl.i() || (!vxl.i() && f4b.b("enableMHRemoveUnusedLayout", true))) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "closeUnusedLayout: " + z);
        return z;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c195bff3", new Object[]{this})).booleanValue();
        }
        if (!I()) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "degradeCacheLiveCard4");
        bqa.d("HomepageOptUtils", "degradeCacheLiveCard4: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60726c0a", new Object[]{this})).booleanValue();
        }
        if (!I() || this.f21101a.get()) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "HomePageDisableDownloadViewWithCookie");
        bqa.d("HomepageOptUtils", "HomePageDisableDownloadViewWithCookie: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean e() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f83d2fd", new Object[]{this})).booleanValue();
        }
        if (BootstrapMode.o() && ABGlobal.isFeatureOpened(Globals.getApplication(), "disableGongGePreRender")) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "disableGongGePreRender  = " + z);
        return z;
    }

    public boolean f() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1dbf423", new Object[]{this})).booleanValue();
        }
        if (BootstrapMode.o() && ABGlobal.isFeatureOpened(Globals.getApplication(), "disableIconPreRender")) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "disableIconPreRender  = " + z);
        return z;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41d48e80", new Object[]{this})).booleanValue();
        }
        boolean I = I();
        bqa.d("HomepageOptUtils", "disableInfoFlowPreRender  = " + I);
        return I;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9008e7b", new Object[]{this})).booleanValue();
        }
        boolean b = f4b.b("disableOptTools", true);
        bqa.d("HomepageOptUtils", "disableOptTools  = " + b);
        return b;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d887138e", new Object[]{this})).booleanValue();
        }
        boolean a2 = ute.a(null, null, "disable_out_link_delay_cold_start");
        bqa.d("HomepageOptUtils", "disable_out_link_delay_cold_start: " + a2);
        return a2;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e014054", new Object[]{this})).booleanValue();
        }
        if (b9b.h() || b9b.e()) {
            return false;
        }
        if (this.c == null) {
            this.c = Boolean.valueOf(f4b.b("disableHomepageUIRefreshOnPagePause", true));
        }
        bqa.d("HomepageOptUtils", "disableUIRefreshOnPagePause: " + this.c);
        return this.c.booleanValue();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8d136a7", new Object[]{this})).booleanValue();
        }
        boolean I = I();
        bqa.d("HomepageOptUtils", "enableAsyncBinderMethodByCreateView: " + I);
        return I;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c096910", new Object[]{this})).booleanValue();
        }
        boolean I = I();
        bqa.d("HomepageOptUtils", "enableClipIconSecondScreenForCache: " + I);
        return I;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28e46e4b", new Object[]{this})).booleanValue();
        }
        if (!b9b.e() || !f4b.b("enableFoldDeviceDelayColdStartReq", true)) {
            return false;
        }
        return true;
    }

    public boolean n() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef52c69", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            if (BootstrapMode.n() || BootstrapMode.o()) {
                z = true;
            }
            this.b = Boolean.valueOf(z);
        }
        return this.b.booleanValue();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68fa6182", new Object[]{this})).booleanValue();
        }
        boolean I = I();
        bqa.d("HomepageOptUtils", "enableDiscardEmptyTheme: " + I);
        return I;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a179d646", new Object[]{this})).booleanValue();
        }
        if (!I()) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "HomePageSecondRefreshTask");
        bqa.d("HomepageOptUtils", "HomePageSecondRefreshTask: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36354663", new Object[]{this})).booleanValue();
        }
        if (!I() || !ABGlobal.isFeatureOpened(Globals.getApplication(), "HomepageQosDump")) {
            return false;
        }
        return true;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1616335a", new Object[]{this})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(Globals.getApplication(), "HomepageQosOpt");
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7018a2dd", new Object[]{this})).booleanValue();
        }
        return ABGlobal.isFeatureOpened(Globals.getApplication(), "HomepageUseQosQueue");
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5c94ef7", new Object[]{this})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "homepageEnableLogPrint");
        bqa.d("HomepageOptUtils", "homepageEnableLogPrint: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2e3ec45", new Object[]{this})).booleanValue();
        }
        boolean I = I();
        bqa.d("HomepageOptUtils", "enableMoreThreadLoadCache: " + I);
        return I;
    }

    public boolean v() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc3a5cd", new Object[]{this})).booleanValue();
        }
        if (e == null) {
            e = (Boolean) mza.d().c("enableOptEditionSwitch", Boolean.class);
        }
        Boolean bool = e;
        if (bool != null && bool.booleanValue()) {
            z = true;
        }
        e = Boolean.valueOf(z);
        bqa.d("HomepageOptUtils", "enableOptEditionSwitch: " + e);
        return e.booleanValue();
    }

    public boolean w() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93e0fc43", new Object[]{this})).booleanValue();
        }
        if (BootstrapMode.o() && ABGlobal.isFeatureOpened(Globals.getApplication(), "enablePreCreateNativeView")) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "enablePreCreateNativeView: " + z);
        return z;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4a936d4", new Object[]{this})).booleanValue();
        }
        if (!I() || !ABGlobal.isFeatureOpened(Globals.getApplication(), "HomePageReorderLoadCacheTask")) {
            return false;
        }
        return true;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f68b0398", new Object[]{this})).booleanValue();
        }
        boolean I = I();
        bqa.d("HomepageOptUtils", "enableResetSlider: " + I);
        return I;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44c55171", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = Boolean.valueOf(ABGlobal.isFeatureOpened(Globals.getApplication(), "fixHomePagePreCreateNativeLayout"));
        }
        bqa.d("HomepageOptUtils", "fixPreCreateNativeView: " + this.d);
        return this.d.booleanValue();
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac26feb0", new Object[]{this})).booleanValue();
        }
        if (!I()) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "preloadTaskOpt4");
        bqa.d("HomepageOptUtils", "preloadTaskOpt4: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50236479", new Object[]{this})).booleanValue();
        }
        if (!I() || !x() || kbq.e(Globals.getApplication())) {
            return false;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "subDXPrerenderOpt4");
        bqa.d("HomepageOptUtils", "subDXPrerenderOpt4: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean L() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3acad7f", new Object[]{this})).booleanValue();
        }
        if (vxl.i() || (!vxl.i() && f4b.b("enableMHSimpleDownTemplate", true))) {
            z = true;
        }
        bqa.d("HomepageOptUtils", "simpleDownloadTemplate: " + z);
        return z;
    }
}
