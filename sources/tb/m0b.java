package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.TBEditionSwitcherElderHomePopBridge;
import com.taobao.android.editionswitcher.TBEditionSwitcherPopBridge;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.FragmentLifecycle;
import com.taobao.tao.homepage.HomePageLBSWVPlugin;
import com.taobao.tao.homepage.windvane.HomePageWVPlugin;
import com.taobao.tao.recommend3.TradeInfoFlowWVPlugin;
import com.taobao.tao.recommend3.observer.HomeLifecycleObserver;
import com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService;
import java.util.HashMap;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m0b extends zya {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEVICE_LEVEL_HIGH = "h";
    public static final String DEVICE_LEVEL_LOW = "l";
    public static final String DEVICE_LEVEL_MID = "m";
    public static Application b;
    public static volatile String c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements q1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(m0b m0bVar) {
        }

        @Override // tb.q1c
        public void a(s78 s78Var, t7l t7lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baa06836", new Object[]{this, s78Var, t7lVar});
            } else if (s78Var != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(mzj.SWITCH_REQUEST_CONSTANT, (Object) s78Var.c());
                if (s78Var.c != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("switcherVersion", (Object) s78Var.c.c);
                    jSONObject.put("bizParam", (Object) jSONObject2);
                }
                vqa.k().i("MTopRequest").j("HomeLauncherdoEditionSwitch").g("requestType", "editionSwitch").g(mzj.SWITCH_REQUEST_CONSTANT, jSONObject.toString()).a();
                yyj.e().Q(jSONObject);
            }
        }
    }

    static {
        t2o.a(729809323);
    }

    public static Application c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        Application application = b;
        if (application == null) {
            return Globals.getApplication();
        }
        return application;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89bffabe", new Object[0]);
        }
        if (TextUtils.isEmpty(c)) {
            c = qy8.b.e("home_device", m09.TASK_TYPE_LEVEL, "");
        }
        if (TextUtils.isEmpty(c)) {
            f();
        }
        if (TextUtils.isEmpty(c)) {
            c = "l";
        }
        return c;
    }

    public static void f() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf63cb8f", new Object[0]);
            return;
        }
        try {
            chb g = c21.g();
            if (g != null) {
                int i = g.getInt("deviceLevel", -1);
                if (i == 2) {
                    str = "l";
                } else if (i == 1) {
                    str = "m";
                } else {
                    str = "h";
                }
                g(str);
            }
        } catch (Throwable th) {
            bqa.b("HomeLauncher", "get deviceLevel error", th);
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d18cf99", new Object[]{str});
            return;
        }
        c = str;
        qy8.b.i("home_device", m09.TASK_TYPE_LEVEL, str);
    }

    public static /* synthetic */ Object ipc$super(m0b m0bVar, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/homepage/launcher/HomeLauncher");
    }

    @Override // tb.zya
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        phg.e("HomeLauncher");
        if (dvh.o()) {
            dvh.a(dvh.STAGE_APP_LAUNCH_TASKS);
        }
        this.f33099a.p("HomeLauncher", 4);
        super.a(application, hashMap);
        b = application;
        FestivalMgr.i().r();
        b();
        e();
        x9u.I();
        i2v.getInstance().registerPlugin(eza.b());
        com.taobao.tao.navigation.a.G(new FragmentLifecycle());
        HomeLifecycleObserver.c();
        x9u.r(wzi.LAUNCHER);
        wp8.n("orderListRecmdPrefetchEnable", new del());
        wp8.n("paySuccessRecmdPrefetchEnable", new yvl());
        wp8.n("shoppingCartRecmdPrefetchEnable", new lrp());
        uqa.b("LauncherTask", "HomeLauncher", "HomeLauncher.init; 首页业务初始化");
        this.f33099a.c("HomeLauncher");
        phg.d("HomeLauncher");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae06e48", new Object[]{this});
        } else if (!vxl.b().v()) {
            q78.a(new a(this));
            try {
                fsw.i("TBEditionSwitcherElderHomePopBridge", TBEditionSwitcherElderHomePopBridge.class, true);
                fsw.i("TBEditionSwitcherPopBridge", TBEditionSwitcherPopBridge.class, true);
            } catch (Exception e) {
                bqa.c("WVPluginManager.registerPlugin exception:", e, new String[0]);
                r5a.i("Page_Home", 19999, "WVPluginRegister_fail", "");
            }
        } else {
            IHomeEditionSwitchService iHomeEditionSwitchService = (IHomeEditionSwitchService) c4b.i().h(IHomeEditionSwitchService.class);
            if (iHomeEditionSwitchService != null) {
                iHomeEditionSwitchService.initEditionSwitch();
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda583fc", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            fsw.i("TBHomePageWVPlugin", HomePageWVPlugin.class, true);
            fsw.i("TBTradeInfoflowWVPlugin", TradeInfoFlowWVPlugin.class, true);
            fsw.i("TBHClientCache", HomePageLBSWVPlugin.class, true);
        } catch (Exception e) {
            bqa.c("WVPluginManager.registerPlugin exception:", e, new String[0]);
            r5a.i("Page_Home", 19999, "WVPluginRegister_fail", "");
        }
        new StringBuilder("jsBridge register cost: ").append(System.currentTimeMillis() - currentTimeMillis);
    }
}
