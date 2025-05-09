package tb;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.speed.TBSpeed;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.launcher.LauncherInitCheckList;
import com.taobao.tao.homepage.revision.Revision;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.location.ILocationService;
import com.taobao.tao.topmultitab.service.login.ILoginService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vy3 extends vhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean b = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ILocationService iLocationService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Activity a2 = vy3.this.a();
            if (a2 != null && (iLocationService = (ILocationService) c4b.i().h(ILocationService.class)) != null) {
                iLocationService.updateLocationAtStartUp(a2.getApplication());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(729809201);
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("speed_status", TBSpeed.getCurrentSpeedStatus());
            return hashMap;
        }
    }

    static {
        t2o.a(729809199);
    }

    public vy3(z6d z6dVar) {
        super(z6dVar);
        LauncherInitCheckList.a(z6dVar.k1());
        uqa.b("【Homepage_PageLifeCycle】", "coldStartConstruct", "冷启流程对象构造函数阶段");
    }

    public static /* synthetic */ Object ipc$super(vy3 vy3Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.p();
                return null;
            case -1126882532:
                return super.k((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -641568046:
                vy3Var.j((Bundle) objArr[0]);
                return null;
            case 1002290867:
                super.i((Bundle) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/workflow/ColdStartWorkflow");
        }
    }

    @Override // tb.vhq
    public void i(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.i(bundle);
        if (b && vxl.b().m()) {
            b = false;
            r();
        }
    }

    @Override // tb.vhq
    public View k(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        super.k(layoutInflater, viewGroup, bundle);
        uqa.b("【Homepage_PageLifeCycle】", "coldStartOnCreateView", "ColdStartWorkflow.onCreateView;冷启流程onCreateView阶段");
        return s(layoutInflater, viewGroup);
    }

    @Override // tb.vhq
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.p();
        p78.c(m0b.c(), "coldStart");
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onResume("coldStart");
        }
        uqa.b("【Homepage_PageLifeCycle】", "coldStartOnResume", "");
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4d7842", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean bool = Boolean.TRUE;
        jSONObject.put("newMultiTab", (Object) bool);
        jSONObject.put("newNewFace", (Object) bool);
        r5a.j("Page_Home", 19999, "coldSwitch", "", "", jSONObject);
        uqa.b("HomePageInit", "coldStart_switch", "是否是多tab: true 是否是newFace: true");
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b7aac0", new Object[]{this});
            return;
        }
        yyj.e().x();
        if (vxl.j()) {
            m5a.a().e(new a());
        }
    }

    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("74a0e180", new Object[]{this, layoutInflater, viewGroup});
        }
        vqa e = vqa.k().j("coldStartCreate").i("【Homepage_PageLifeCycle】").e("ColdStartWorkflow.create").e("冷启流程初始化各类功能阶段.");
        TBSpeed.updateUTParams();
        TCrashSDK.instance().addJvmUncaughtCrashListener(new b());
        Revision.b().d(Globals.getApplication());
        x9u.u("set_layout_coldstart_event", false);
        phg.m("initViewContainer");
        f0b.i().p("initViewContainer", 1);
        View l = a3b.l(layoutInflater, viewGroup);
        f0b.i().c("initViewContainer");
        phg.l("initViewContainer");
        e.g("lastTabEnable", "true").g("LastNewFaceEnable", "true").g("LastContainerID", h2b.a().b());
        this.f31731a.V1(l);
        q();
        phg.m("popCenter_init");
        wcm.a(this.f31731a.getClass().getName()).start();
        phg.l("popCenter_init");
        e.h("LauncherRuntime.sUseWelcome", LauncherRuntime.m);
        h2b.a().f(this.f31731a);
        g(l, a());
        dvh.e(dvh.STAGE_PAGE_ON_CREATE_VIEW, true);
        phg.k("TriggerProcess");
        f5b.b();
        phg.j("TriggerProcess");
        ILoginService iLoginService = (ILoginService) c4b.i().h(ILoginService.class);
        if (iLoginService != null) {
            iLoginService.handleOnCreateBundle(this.f31731a.k1().getIntent());
        }
        qul.i();
        this.f31731a.q1().c().c().set(true);
        za2.c(this.f31731a);
        try {
            vll.c().g(this.f31731a, new wll(this.f31731a.k1().getIntent()), true);
        } catch (Exception e2) {
            e.e("外链处理异常： " + e2);
        }
        phg.m("notify_onCreateView");
        s2b.c().f();
        phg.l("notify_onCreateView");
        e.a();
        return l;
    }
}
