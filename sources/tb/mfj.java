package tb;

import android.content.Context;
import android.media.AudioManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.avplayer.r;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.atb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mfj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_FADEIN_VALUE = 1000;
    public static final int END_FADE_VOLUME = 1;
    public static final int FADE_IN_INTERVAL = 100;
    public static final int START_FADE_VLOME = 0;
    public static final float START_TH = 0.15f;

    /* renamed from: a  reason: collision with root package name */
    public static jfj f24013a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements xxc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ atb f24014a;

        public a(atb atbVar) {
            this.f24014a = atbVar;
        }

        @Override // tb.xxc
        public void onMuteFlagChanged(FluidContext fluidContext, String str, String str2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aea737bd", new Object[]{this, fluidContext, str, str2});
                return;
            }
            atb atbVar = this.f24014a;
            if (atbVar != null) {
                if (str2 == null) {
                    z = false;
                }
                atbVar.mute(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements xxc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f24015a;

        public b(WeakReference weakReference) {
            this.f24015a = weakReference;
        }

        @Override // tb.xxc
        public void onMuteFlagChanged(FluidContext fluidContext, String str, String str2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aea737bd", new Object[]{this, fluidContext, str, str2});
                return;
            }
            atb atbVar = (atb) this.f24015a.get();
            if (atbVar != null) {
                if (str2 == null) {
                    z = false;
                }
                atbVar.mute(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements xxc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ prp f24016a;

        public c(prp prpVar) {
            this.f24016a = prpVar;
        }

        @Override // tb.xxc
        public void onMuteFlagChanged(FluidContext fluidContext, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aea737bd", new Object[]{this, fluidContext, str, str2});
                return;
            }
            atb dWInstance = this.f24016a.n1().getDWInstance();
            if (dWInstance != null) {
                if (str2 != null) {
                    dWInstance.mute(true);
                } else if (!mfj.a(fluidContext)) {
                    dWInstance.mute(false);
                } else {
                    mfj.z(fluidContext, dWInstance, fluidContext.getContext(), false);
                }
            }
        }
    }

    static {
        t2o.a(468714572);
    }

    public static void A(FluidContext fluidContext, atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ec2ffc", new Object[]{fluidContext, atbVar});
            return;
        }
        boolean t = t();
        if (s()) {
            atbVar.mute(u(fluidContext));
        } else if (t) {
            atbVar.mute(false);
        }
    }

    public static void B(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d594f5", new Object[]{atbVar});
        } else if (t() && atbVar != null) {
            atbVar.mute(true);
        }
    }

    public static void C(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc15ac7", new Object[]{fluidContext});
        } else if (v(fluidContext) && r()) {
            tnx.u().v(fluidContext, "mute");
        }
    }

    public static void D(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32f07bf", new Object[]{fluidContext, str});
            return;
        }
        jfj i = i(fluidContext);
        if (!k(fluidContext, j(fluidContext)) || i == null) {
            ir9.b("MuteHelper", "已经是老版本，或未初始化无需回退");
        } else if ("Weex".equals(str) && ((IInteractionService) fluidContext.getService(IInteractionService.class)).isEnableGlobalWeexDSLV2()) {
            ir9.b("MuteHelper", "Weex不支持新版本代码");
            i.d(fluidContext);
        } else if ("TNode".equals(str) && !((IInteractionService) fluidContext.getService(IInteractionService.class)).isEnableGlobalWeexDSLV2()) {
            ir9.b("MuteHelper", "Tnode不支持新版本代码");
            i.d(fluidContext);
        }
    }

    public static /* synthetic */ boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2dc882d", new Object[]{fluidContext})).booleanValue();
        }
        return f(fluidContext);
    }

    public static void b(atb.a aVar, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a59f7bc", new Object[]{aVar, fluidContext});
        } else if (kfj.b(fluidContext)) {
            aVar.a(true);
            aVar.b(false);
        }
    }

    public static void c(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4370712c", new Object[]{fluidContext, map});
            return;
        }
        jfj i = i(fluidContext);
        if (i != null) {
            i.c(fluidContext, map);
        }
    }

    public static jfj d(FluidContext fluidContext) {
        jfj jfjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfj) ipChange.ipc$dispatch("b0673052", new Object[]{fluidContext});
        }
        boolean h = pto.h(fluidContext);
        if (!h) {
            jfjVar = erp.y();
        } else if (pto.g(fluidContext)) {
            if (!v(fluidContext) || !r()) {
                jfjVar = nma.u();
            } else {
                jfjVar = tnx.u();
            }
        } else if (!h || !q()) {
            jfjVar = null;
        } else {
            jfjVar = mma.u();
        }
        ir9.b("MuteHelper", "iMute 初始化为" + jfjVar);
        return jfjVar;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7238cfc", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableHotStartMute", true);
    }

    public static Map<String, Object> g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eeeabacd", new Object[]{fluidContext});
        }
        HashMap hashMap = new HashMap();
        jfj i = i(fluidContext);
        if (i == null || !k(fluidContext, j(fluidContext))) {
            return hashMap;
        }
        return i.f(fluidContext);
    }

    public static HashMap h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a57a4b8f", new Object[]{fluidContext});
        }
        String j = j(fluidContext);
        HashMap hashMap = new HashMap();
        if (k(fluidContext, j)) {
            return m(j, fluidContext);
        }
        return hashMap;
    }

    public static jfj i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfj) ipChange.ipc$dispatch("a604e2db", new Object[]{fluidContext});
        }
        if (!e()) {
            return f24013a;
        }
        IMuteService iMuteService = (IMuteService) fluidContext.getService(IMuteService.class);
        if (iMuteService != null) {
            return iMuteService.getMuteImpl();
        }
        return null;
    }

    public static String j(FluidContext fluidContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4175edfd", new Object[]{fluidContext});
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null || (str = sessionParams.b) == null) {
            return "guangguang";
        }
        return str;
    }

    public static Map<String, Object> l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a96bdb70", new Object[]{fluidContext});
        }
        HashMap hashMap = new HashMap();
        jfj i = i(fluidContext);
        if (i != null) {
            return i.g(fluidContext);
        }
        return hashMap;
    }

    public static void n(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecb2401", new Object[]{fluidContext});
            return;
        }
        jfj i = i(fluidContext);
        if (i != null) {
            i.b(fluidContext);
        }
    }

    public static void o(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792db249", new Object[]{fluidContext});
        } else if (e()) {
            IMuteService iMuteService = (IMuteService) fluidContext.getService(IMuteService.class);
            if (iMuteService != null && iMuteService.getMuteImpl() == null) {
                iMuteService.setMuteImpl(d(fluidContext));
                p(fluidContext);
            }
        } else if (i(fluidContext) == null) {
            f24013a = d(fluidContext);
            p(fluidContext);
        }
    }

    public static void p(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3c7cd5", new Object[]{fluidContext});
            return;
        }
        jfj i = i(fluidContext);
        if (i != null) {
            i.a(fluidContext);
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbfbabd1", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableGuangGuangMute", true);
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a0a1d9", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableXiaoMiB1Tab3Mute", true);
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d7db1aa", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLiveMuteConfig", false);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1e4a2fe", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePreloadLive", true);
        tfs.d("直播卡片提前播放：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    public static boolean v(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5cd42f", new Object[]{fluidContext})).booleanValue();
        }
        if (((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams() == null) {
            return false;
        }
        boolean k = pto.k("TBXiaomiB1SceneSourceTypeList", ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().d(), ",videoxiaomib1,videoxiaomib2,");
        ir9.b("MuteHelper", "isXiaoMiB1Tab3:" + k);
        return k;
    }

    public static void w(FluidContext fluidContext, atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ed5dc7", new Object[]{fluidContext, atbVar});
        } else {
            ((IMuteService) fluidContext.getService(IMuteService.class)).addMuteFlagChangedListener(new b(new WeakReference(atbVar)));
        }
    }

    public static void x(FluidContext fluidContext, prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0488f32", new Object[]{fluidContext, prpVar});
            return;
        }
        boolean h = pto.h(fluidContext);
        if (v(fluidContext)) {
            tnx.u();
        } else if (h) {
            nma.u();
        } else {
            erp.y();
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).addMuteFlagChangedListener(new c(prpVar));
        String preCoverKey = prpVar.U().getInstanceConfig().getPreCoverKey();
        boolean b2 = ogi.e().b(preCoverKey);
        r i = ogi.e().i(preCoverKey);
        if (i != null && b2) {
            i.V(u(prpVar.U()));
        }
    }

    public static xxc y(FluidContext fluidContext, atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xxc) ipChange.ipc$dispatch("df17a4f8", new Object[]{fluidContext, atbVar});
        }
        if (!s()) {
            return null;
        }
        if (pto.h(fluidContext)) {
            mma.u();
        } else {
            erp.y();
        }
        a aVar = new a(atbVar);
        ((IMuteService) fluidContext.getService(IMuteService.class)).addMuteFlagChangedListener(aVar);
        return aVar;
    }

    public static void z(FluidContext fluidContext, atb atbVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7059d15e", new Object[]{fluidContext, atbVar, context, new Boolean(z)});
        } else if (!kfj.a(fluidContext) || ((IMuteService) fluidContext.getService(IMuteService.class)).isFadInForFirstTime() || z) {
            atbVar.mute(z);
        } else {
            ((IMuteService) fluidContext.getService(IMuteService.class)).setFadInForFirstTime(true);
            E(fluidContext, atbVar, context);
        }
    }

    public static HashMap<String, Object> m(String str, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9530fff0", new Object[]{str, fluidContext});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        boolean booleanValue = ((Boolean) j9t.e(p91.a(), str).b().b(str, "mute", Boolean.FALSE, null)).booleanValue();
        boolean c2 = j9t.e(p91.a(), str).b().c("muteCountDown", false);
        boolean c3 = j9t.e(p91.a(), str).b().c("muteOpenTip", false);
        if (v(fluidContext)) {
            jfj i = i(fluidContext);
            if (i == null) {
                tnx.u().v(fluidContext, "mute");
                hashMap.put("muted", "true");
            } else {
                hashMap.put("muted", Boolean.toString(i.e(fluidContext)));
            }
        } else {
            hashMap.put("muted", Boolean.toString(booleanValue));
        }
        hashMap.put("muteCountDown", Boolean.toString(c2));
        hashMap.put("muteOpenTip", Boolean.toString(c3));
        ir9.b("MuteHelper", "getMuteEnvOption传入的值 muted&checkCountDown " + booleanValue + c2 + "场景：" + str);
        return hashMap;
    }

    public static boolean f(FluidContext fluidContext) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d536cc96", new Object[]{fluidContext})).booleanValue();
        }
        Map<String, Map<String, Object>> map2 = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().G;
        boolean o = (map2 == null || (map = map2.get("newMuteSettingV2")) == null) ? false : nwv.o(map.get("enable"), true);
        boolean p2 = akt.p2("ShortVideo.enableNewGlobalMute", true);
        ir9.b("MuteHelper", o + "--enableNewMuteSetting " + p2 + "--boolOrangeConfig");
        return o && p2;
    }

    public static boolean k(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58f4661c", new Object[]{fluidContext, str})).booleanValue();
        }
        boolean p2 = akt.p2("ShortVideo.enableGlobalMuteSetting", true);
        boolean isMuteABTestForSettings = ((IMuteService) fluidContext.getService(IMuteService.class)).isMuteABTestForSettings();
        if (!p2 || !isMuteABTestForSettings) {
            HashMap hashMap = new HashMap();
            hashMap.put("BizCode", str);
            hashMap.put("AppVersion", vr9.a());
            xau.E(fluidContext, "Button-MuteDownGrade", hashMap);
            ir9.b("MuteHelper", "静音orange开关关闭");
            return false;
        }
        ir9.b("MuteHelper", "设置端已固化为true");
        return true;
    }

    public static boolean u(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9defa59e", new Object[]{fluidContext})).booleanValue();
        }
        String j = j(fluidContext);
        if (!k(fluidContext, j)) {
            jfj i = i(fluidContext);
            if (i != null) {
                return i.e(fluidContext);
            }
            return false;
        }
        boolean booleanValue = ((Boolean) j9t.e(p91.a(), j).b().b(j, "mute", Boolean.FALSE, null)).booleanValue();
        boolean c2 = j9t.e(p91.a(), j).b().c("muteCountDown", false);
        jfj i2 = i(fluidContext);
        if (i2 == null) {
            return v(fluidContext) || booleanValue || c2;
        }
        return i2.e(fluidContext);
    }

    public static void E(FluidContext fluidContext, atb atbVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1b09f9", new Object[]{fluidContext, atbVar, context});
            return;
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        ir9.b("MuteHelper", "走了新的声音渐变");
        if (!(context == null || j == null || j.G == null)) {
            try {
                float streamVolume = ((AudioManager) context.getSystemService("audio")).getStreamVolume(3) / ((AudioManager) context.getSystemService("audio")).getStreamMaxVolume(3);
                Map<String, Object> map = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().G.get("newMuteSettingV2");
                if (map != null && streamVolume > nwv.q(map.get("startTH"), 0.15f)) {
                    atbVar.m(nwv.r(map.get("startFadeVolume"), 0), nwv.r(map.get("endFadeVolume"), 1), nwv.t(map.get("fadeDuration"), 1000), 100);
                    return;
                }
            } catch (Exception e) {
                ir9.c("MuteHelper", "", e);
            }
        }
        atbVar.mute(false);
    }
}
