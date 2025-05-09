package tb;

import android.os.CountDownTimer;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class erp extends jfj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long COUNT_DOWN_INTERVAL = 1000;
    public final int g;
    public String h;
    public CountDownTimer i;
    public boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f18780a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, FluidContext fluidContext) {
            super(j, j2);
            this.f18780a = fluidContext;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/mute/helper/ShopVideoMuteImpl$1");
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            ir9.b("ShopVideoMuteImpl", "timer onFinish");
            erp.this.h(this.f18780a);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                return;
            }
            ir9.b("ShopVideoMuteImpl", "timer onTick()" + j);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final erp f18781a = new erp(null);

        static {
            t2o.a(468714578);
        }

        public static /* synthetic */ erp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (erp) ipChange.ipc$dispatch("fb44fe24", new Object[0]);
            }
            return f18781a;
        }
    }

    static {
        t2o.a(468714576);
        t2o.a(468714570);
    }

    public /* synthetic */ erp(a aVar) {
        this();
    }

    public static void C(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773c52d6", new Object[]{map, new Boolean(z)});
        } else if (TextUtils.equals(String.valueOf(map.get("isCommonMuteSet")), "true")) {
            ono.j(p91.a(), "common_mute_storage", String.valueOf(z));
        }
    }

    public static /* synthetic */ Object ipc$super(erp erpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/mute/helper/ShopVideoMuteImpl");
    }

    public static boolean o(FluidContext fluidContext) {
        ncp j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c981dc8", new Object[]{fluidContext})).booleanValue();
        }
        if (!"false".equals(z()) || (j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j()) == null) {
            return false;
        }
        String str = j.x;
        if (TextUtils.isEmpty(j.w) || TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }

    public static erp y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (erp) ipChange.ipc$dispatch("6a4c37e9", new Object[0]);
        }
        return b.a();
    }

    public static String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e426485", new Object[0]);
        }
        String f = ono.f(p91.a(), "common_mute_storage", null);
        if (TextUtils.isEmpty(f)) {
            return "false";
        }
        return f;
    }

    public final boolean A(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24daf88c", new Object[]{this, fluidContext})).booleanValue();
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null) {
            return false;
        }
        return pto.k("disableCommonMuteStateCheckBizTypeList", sessionParams.b, null);
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9762ddc", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCommonMute", true);
    }

    public final void D(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cd0a44", new Object[]{this, fluidContext});
            return;
        }
        q(fluidContext);
        E(fluidContext, this.g, 1000L);
    }

    public final void E(FluidContext fluidContext, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f2266f", new Object[]{this, fluidContext, new Long(j), new Long(j2)});
            return;
        }
        u();
        a aVar = new a(j * 1000, j2, fluidContext);
        this.i = aVar;
        aVar.start();
    }

    @Override // tb.jfj, tb.vxc
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecb2401", new Object[]{this, fluidContext});
        }
    }

    @Override // tb.jfj, tb.vxc
    public boolean e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de2969a0", new Object[]{this, fluidContext})).booleanValue();
        }
        if (mfj.k(fluidContext, mfj.j(fluidContext))) {
            return n();
        }
        if (v(fluidContext)) {
            return n();
        }
        return false;
    }

    @Override // tb.jfj, tb.vxc
    public Map<String, Object> g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a96bdb70", new Object[]{this, fluidContext});
        }
        HashMap hashMap = new HashMap();
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j == null) {
            hashMap.put("muted", "false");
        } else if (!TextUtils.equals(j.x, "true")) {
            hashMap.put("muted", "false");
            return hashMap;
        } else if (o(fluidContext)) {
            hashMap.put("muted", Boolean.valueOf(e(fluidContext)));
            hashMap.put("commonMuteCountdown", j.w);
            hashMap.put("commonShowMuteTips", "true");
            return hashMap;
        } else {
            hashMap.put("muted", Boolean.valueOf(e(fluidContext)));
            hashMap.put("commonShowMuteTips", "false");
        }
        return hashMap;
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3642c215", new Object[]{this});
            return;
        }
        this.j = true;
        CountDownTimer countDownTimer = this.i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final boolean v(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("321446cd", new Object[]{this, fluidContext})).booleanValue();
        }
        if (!B() || A(fluidContext)) {
            return false;
        }
        return true;
    }

    public final int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be389017", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("commonMuteTimeout", "2"));
        } catch (Throwable th) {
            ir9.c("ShopVideoMuteImpl", "", th);
            return 2;
        }
    }

    /* renamed from: x */
    public HashMap<String, Object> f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b29dd1fb", new Object[]{this, fluidContext});
        }
        return mfj.m(this.h, fluidContext);
    }

    public erp() {
        super("shop_last_show_mute_tips_time", "shop_has_show_mute_tips_count", "common_mute_storage", jfj.SHOP_VIDEO_MUTE_FLAG);
        this.j = false;
        this.g = w();
    }

    @Override // tb.vxc
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448cb8f4", new Object[]{this, fluidContext});
            return;
        }
        String j = mfj.j(fluidContext);
        this.h = j;
        if (mfj.k(fluidContext, j)) {
            ((Boolean) j9t.e(p91.a(), this.h).b().b(this.h, "mute", Boolean.FALSE, null)).booleanValue();
            j9t.e(p91.a(), this.h).b().c("muteCountDown", false);
        } else if (v(fluidContext)) {
            if (TextUtils.equals(z(), "true")) {
                D(fluidContext);
            } else if (o(fluidContext) && TextUtils.equals(((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().x, "true")) {
                D(fluidContext);
            }
        }
    }

    @Override // tb.vxc
    public void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e879e135", new Object[]{this, fluidContext});
            return;
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).setMuteABTestForSettings(false);
        h(fluidContext);
        if (!v(fluidContext) || this.j) {
            ir9.b("ShopVideoMuteImpl", "走了降级的策略到直接打开声音");
        } else if (TextUtils.equals(z(), "true") && !this.j) {
            q(fluidContext);
        } else if (o(fluidContext) && !this.j && TextUtils.equals(((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().x, "true")) {
            q(fluidContext);
        }
    }

    @Override // tb.jfj, tb.vxc
    public void c(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4370712c", new Object[]{this, fluidContext, map});
        } else if (map != null) {
            Object obj = map.get("muted");
            if ("true".equals(obj)) {
                q(fluidContext);
                C(map, true);
            } else if ("false".equals(obj)) {
                h(fluidContext);
                C(map, false);
            }
            if (nwv.o(map.get("global"), true)) {
                j9t.e(p91.a(), this.h).c().a(this.h, "mute", Boolean.valueOf("true".equals(obj)), null);
            }
        }
    }
}
