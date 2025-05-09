package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.TBLivePopWVPlugin;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.FatigueModel;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x5q implements ISmartLandingProxy.b, ISmartLandingProxy.f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLanding";

    /* renamed from: a  reason: collision with root package name */
    public Context f31164a;
    public final t7q b;
    public final ISmartLandingProxy.e c;
    public xvp e;
    public SmartLandingTask i;
    public Timer m;
    public HashMap<String, String> d = new HashMap<>();
    public final Map<String, FatigueModel> f = new HashMap();
    public final HashMap<String, ArrayList<ISmartLandingProxy.d>> g = new HashMap<>();
    public final HashMap<String, ArrayList<ISmartLandingProxy.d>> h = new HashMap<>();
    public boolean j = false;
    public boolean k = false;
    public final Set<String> l = new HashSet();
    public boolean o = false;
    public final Handler n = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.x5q$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1095a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1095a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    x5q.n(x5q.this, 1L);
                }
            }
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlanding/SmartLanding$1");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x5q.o(x5q.this).post(new RunnableC1095a());
            }
        }
    }

    static {
        t2o.a(295699708);
        t2o.a(806355248);
        t2o.a(806355252);
        fsw.i("TBLivePopWVPlugin", TBLivePopWVPlugin.class, true);
    }

    public x5q(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, ISmartLandingProxy.e eVar) {
        this.f31164a = context;
        this.b = new t7q(this.f31164a, str, str2, str3, str4, str5, str6, str7, null, null, null, jSONObject, this, v2s.o().w());
        o3s.b("SmartLanding", "SML_SmartLanding() " + str + " entryLiveSource " + str3 + " liveSource " + str4 + " " + str5 + " " + str6);
        this.c = new a6q(eVar);
        w();
    }

    public static /* synthetic */ void n(x5q x5qVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fb0b1d", new Object[]{x5qVar, new Long(j)});
        } else {
            x5qVar.p(j);
        }
    }

    public static /* synthetic */ Handler o(x5q x5qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("6188a60", new Object[]{x5qVar});
        }
        return x5qVar.n;
    }

    public final void A(SmartLandingTask smartLandingTask) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f322ccd", new Object[]{this, smartLandingTask});
            return;
        }
        SmartLandingTask.TaskAction taskAction = smartLandingTask.popAction;
        if (taskAction != null && (jSONObject = taskAction.actionData) != null && jSONObject.getBooleanValue("acceptFatigue")) {
            FatigueModel fatigueModel = new FatigueModel();
            fatigueModel.configId = smartLandingTask.popId;
            fatigueModel.lastShowTime = System.currentTimeMillis();
            ((HashMap) this.f).put("fatigue", fatigueModel);
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7eea98", new Object[]{this});
            return;
        }
        this.e.b(this.b.i());
        this.k = true;
        Iterator it = ((HashSet) this.l).iterator();
        while (it.hasNext()) {
            g((String) it.next(), null);
        }
        ((HashSet) this.l).clear();
    }

    public final boolean D(String str, ISmartLandingProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0716aeb", new Object[]{this, str, aVar})).booleanValue();
        }
        for (SmartLandingTask smartLandingTask : v(str)) {
            if (C(smartLandingTask, str)) {
                F(str, smartLandingTask);
                if (aVar != null) {
                    aVar.onSuccess();
                }
                return true;
            }
        }
        return false;
    }

    public final void E(boolean z, String str, List<ISmartLandingProxy.d> list) {
        JSONArray jSONArray;
        String str2;
        SmartLandingTask.TaskAction taskAction;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bbcee2", new Object[]{this, new Boolean(z), str, list});
            return;
        }
        SmartLandingTask smartLandingTask = this.i;
        JSONObject jSONObject = null;
        if (smartLandingTask == null || (taskAction = smartLandingTask.popAction) == null) {
            z2 = z;
            str2 = null;
            jSONArray = null;
        } else {
            if (TextUtils.equals(str, taskAction.actionType)) {
                SmartLandingTask smartLandingTask2 = this.i;
                String str3 = smartLandingTask2.popId;
                JSONObject jSONObject2 = smartLandingTask2.popAction.actionData;
                o3s.b("SmartLanding", "SML_runTaskAction 触发task enter " + this.b.k() + " " + str3 + " " + str);
                jSONObject = jSONObject2;
                str2 = str3;
            } else {
                z2 = z;
                str2 = null;
            }
            jSONArray = this.i.popAction.benefitAliveList;
        }
        JSONObject c = this.b.c(str, jSONObject);
        if (!(!z2 || list == null || list.isEmpty())) {
            for (ISmartLandingProxy.d dVar : list) {
                dVar.onTaskActionListener(g4.b.i, str2, c, jSONArray, this.b.e());
                o3s.b("SmartLanding", "SML_TaskActionListener runListener " + z + " " + str + " " + str2 + " listener " + dVar);
            }
        }
    }

    public final void G(SmartLandingTask smartLandingTask) {
        xvp xvpVar;
        nib a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ca9125", new Object[]{this, smartLandingTask});
        } else if (smartLandingTask != null && (xvpVar = this.e) != null && (a2 = xvpVar.a(smartLandingTask)) != null) {
            a2.a(smartLandingTask);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public JSONObject a() {
        SmartLandingTask.TaskAction taskAction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce31751c", new Object[]{this});
        }
        SmartLandingTask smartLandingTask = this.i;
        if (smartLandingTask == null || (taskAction = smartLandingTask.popAction) == null) {
            return null;
        }
        JSONObject jSONObject = taskAction.actionData;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("actionType", (Object) this.i.popAction.actionType);
        return jSONObject;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void b(boolean z, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd1762a", new Object[]{this, new Boolean(z), str, str2, str3, str4, str5, jSONObject});
            return;
        }
        this.b.o(z, str, str2, str3, str4, str5, jSONObject);
        o3s.b("SmartLanding", "SML_onEnter " + this.b.k());
        if (!z) {
            w();
        }
        t();
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void c(String str, String str2, boolean z, JSONObject jSONObject) {
        SmartLandingTask.ControllerData controllerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fceff6", new Object[]{this, str, str2, new Boolean(z), jSONObject});
            return;
        }
        if (TextUtils.equals(g4.b.i, str) && this.o != z) {
            this.o = z;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hasWYSIWYG", (Object) Boolean.valueOf(this.o));
            jSONObject2.put("ext", (Object) jSONObject);
            jSONObject2.put("popId", (Object) str2);
            WVStandardEventCenter.postNotificationToJS("TBLiveWVPlugin.Event.sjsdPopStatusChanged", jSONObject2.toJSONString());
            f("hasSJSDNativePop", String.valueOf(this.o));
        }
        SmartLandingTask g = this.b.g(str2);
        if (z) {
            this.b.A("smartlanding_action_pop_show_success", str, g, null, 0L);
        }
        if (z && g != null && (controllerData = g.controllerData) != null && controllerData.realShowStrategy) {
            G(g);
        }
        o3s.b("SmartLanding", "SML_updatePopTaskStatus " + z + " popId " + str2 + " behavior " + str);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.f
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a6eeb7", new Object[]{this});
            return;
        }
        o3s.b("SmartLanding", "SML_onSuccessRequestCallback " + this.b.k());
        this.j = true;
        long currentTimeMillis = System.currentTimeMillis();
        B();
        for (String str : this.h.keySet()) {
            E(true, str, this.h.get(str));
        }
        this.b.y(currentTimeMillis);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o3s.b("SmartLanding", "SML_destroy " + this.b.k());
        this.f31164a = null;
        this.b.destroy();
        ISmartLandingProxy.e eVar = this.c;
        if (eVar != null) {
            eVar.destroy();
        }
        this.k = false;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void e(TBLiveDataModel tBLiveDataModel, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26151e09", new Object[]{this, tBLiveDataModel, hashMap});
        } else if (this.b != null) {
            o3s.b("SmartLanding", "SML_onDataReceived " + this.b.k());
            this.b.n(tBLiveDataModel, hashMap);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178d69e9", new Object[]{this, str, str2});
        } else {
            this.d.put(str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e1adedd", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void i(String str, String str2, String str3, String str4, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c255bee7", new Object[]{this, str, str2, str3, str4, hashMap});
            return;
        }
        SmartLandingTask g = this.b.g(str2);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("error_code", str3);
        hashMap.put(MUSAppMonitor.ERROR_MSG, str4);
        this.b.A("smartlanding_action_pop_error_status", str, g, hashMap, 0L);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void j(boolean z, String str, ISmartLandingProxy.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8aef61", new Object[]{this, new Boolean(z), str, dVar});
            return;
        }
        o3s.b("SmartLanding", "SML_addSmartLandingTaskActionListener " + this.b.k() + " " + z + " " + str + " " + dVar);
        if (!z) {
            z(this.g, str, dVar);
            E(false, str, Collections.singletonList(dVar));
        } else if (!this.b.m() || !this.j) {
            z(this.h, str, dVar);
        } else {
            E(true, str, Collections.singletonList(dVar));
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b08c444", new Object[]{this});
        }
        t7q t7qVar = this.b;
        if (t7qVar != null) {
            return t7qVar.j();
        }
        return "";
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.f
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb209052", new Object[]{this});
            return;
        }
        o3s.b("SmartLanding", "SML_onErrorRequestCallback " + this.b.k());
        this.j = true;
        for (String str : this.h.keySet()) {
            E(true, str, this.h.get(str));
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b45767c", new Object[]{this, str});
        } else if (this.b != null) {
            o3s.b("SmartLanding", "SML_setLiveToken " + this.b.k() + " livetoken " + str);
            this.b.v(str);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        o3s.b("SmartLanding", "SML_onExit " + this.b.k());
        r();
        Set<String> set = this.l;
        if (set != null) {
            ((HashSet) set).clear();
        }
        HashMap<String, String> hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, ArrayList<ISmartLandingProxy.d>> hashMap2 = this.g;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        HashMap<String, ArrayList<ISmartLandingProxy.d>> hashMap3 = this.h;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        this.b.p();
        this.o = false;
        this.i = null;
        this.j = false;
        xvp xvpVar = this.e;
        if (xvpVar != null) {
            xvpVar.d();
        }
    }

    public final boolean q(SmartLandingTask smartLandingTask, String str) {
        HashMap<String, ArrayList<ArrayList<SmartLandingTask.Condition>>> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51a62f58", new Object[]{this, smartLandingTask, str})).booleanValue();
        }
        if (smartLandingTask == null || (hashMap = smartLandingTask.popConditions) == null || !hashMap.containsKey(str) || !c6i.d(this.d, smartLandingTask.popConditions.get(str))) {
            return false;
        }
        return true;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54da34", new Object[]{this});
            return;
        }
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
    }

    public final void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ac29af", new Object[]{this, str, str2});
            return;
        }
        Context context = this.f31164a;
        if (context != null && iw0.j(context)) {
            Context context2 = this.f31164a;
            w0u.a(context2, str + " popId " + str2);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
            return;
        }
        y();
        f("hasSJSDNativePop", "false");
    }

    public final boolean u(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6093f8", new Object[]{this, smartLandingTask})).booleanValue();
        }
        nib a2 = this.e.a(smartLandingTask);
        if (a2 != null) {
            return a2.c(smartLandingTask);
        }
        return false;
    }

    public final List<SmartLandingTask> v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5cd40649", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        List<SmartLandingTask> i = this.b.i();
        if (i != null && !zqq.a(str)) {
            try {
                for (SmartLandingTask smartLandingTask : i) {
                    if (smartLandingTask != null) {
                        HashMap<String, ArrayList<ArrayList<SmartLandingTask.Condition>>> hashMap = smartLandingTask.popConditions;
                        if (hashMap != null) {
                            if (hashMap.containsKey(str)) {
                                if (smartLandingTask.enableTerminalCtrl) {
                                    SmartLandingTask.ShowStrategy showStrategy = smartLandingTask.showStrategy;
                                    if (showStrategy != null && showStrategy.canShow(smartLandingTask.getIdentificationId(this.b.d()))) {
                                    }
                                }
                                SmartLandingTask.ControllerData controllerData = smartLandingTask.controllerData;
                                if ((controllerData != null && controllerData.canRunMultipleTimes) || !smartLandingTask.isRunComplete) {
                                    arrayList.add(smartLandingTask);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                o3s.c("SmartLanding", "SML_getConfig exp", e);
            }
        }
        return arrayList;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf82ec5", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.b.u(currentTimeMillis);
        this.b.A("smartlanding_action_enter_room", null, null, null, currentTimeMillis);
        xvp xvpVar = new xvp(this.b.d());
        this.e = xvpVar;
        xvpVar.c();
    }

    public final boolean x(SmartLandingTask smartLandingTask) {
        JSONObject jSONObject;
        FatigueModel fatigueModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0aac4d3", new Object[]{this, smartLandingTask})).booleanValue();
        }
        SmartLandingTask.TaskAction taskAction = smartLandingTask.popAction;
        if (taskAction == null || (jSONObject = taskAction.actionData) == null || !jSONObject.getBooleanValue("acceptFatigue") || (fatigueModel = this.f.get("fatigue")) == null || System.currentTimeMillis() - fatigueModel.lastShowTime > smartLandingTask.popAction.actionData.getLongValue("fatigueInterval") * 1000) {
            return false;
        }
        return true;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ddce22", new Object[]{this});
            return;
        }
        Timer timer = new Timer("Smartlanding_timer");
        this.m = timer;
        timer.schedule(new a(), 0L, 1000L);
    }

    public final void z(HashMap<String, ArrayList<ISmartLandingProxy.d>> hashMap, String str, ISmartLandingProxy.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2918aa8e", new Object[]{this, hashMap, str, dVar});
            return;
        }
        ArrayList<ISmartLandingProxy.d> arrayList = hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(dVar);
        hashMap.put(str, arrayList);
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.b
    public boolean g(String str, ISmartLandingProxy.a aVar) {
        t7q t7qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b970c372", new Object[]{this, str, aVar})).booleanValue();
        }
        List<SmartLandingTask> i = this.b.i();
        if (!this.k || i == null || i.isEmpty()) {
            if (!TextUtils.equals(str, "leave") && !TextUtils.equals(str, "stay")) {
                ((HashSet) this.l).add(str);
            }
            return false;
        }
        if (TextUtils.equals(str, g4.b.i) && (t7qVar = this.b) != null) {
            t7qVar.A("smartlanding_action_pop_match", str, null, null, 0L);
        }
        return D(str, aVar);
    }

    public final void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e058c3", new Object[]{this, new Long(j)});
            return;
        }
        if (this.d == null) {
            this.d = new HashMap<>();
        }
        if (this.d.containsKey("totalStay")) {
            String str = this.d.get("totalStay");
            if (str != null) {
                HashMap<String, String> hashMap = this.d;
                hashMap.put("totalStay", "" + (zqq.g(str, 0) + j));
            } else {
                HashMap<String, String> hashMap2 = this.d;
                hashMap2.put("totalStay", "" + j);
            }
        } else {
            HashMap<String, String> hashMap3 = this.d;
            hashMap3.put("totalStay", "" + j);
        }
        g("stay", null);
    }

    public final boolean C(SmartLandingTask smartLandingTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f9d9c44", new Object[]{this, smartLandingTask, str})).booleanValue();
        }
        if (smartLandingTask == null || x(smartLandingTask)) {
            return false;
        }
        o3s.d("SmartLanding", "popId[" + smartLandingTask.popId + "] isInFatigueStage: true");
        if (smartLandingTask.enableTerminalCtrl && !u(smartLandingTask)) {
            return false;
        }
        o3s.d("SmartLanding", "popId[" + smartLandingTask.popId + "] getShowStrategyTask: true");
        if (smartLandingTask.disableConditionCheck || q(smartLandingTask, str)) {
            o3s.d("SmartLanding", "popId[" + smartLandingTask.popId + "] checkPopConditions: true");
            SmartLandingTask.ControllerData controllerData = smartLandingTask.controllerData;
            if (controllerData == null || !controllerData.realShowStrategy) {
                G(smartLandingTask);
            }
            A(smartLandingTask);
            return true;
        }
        return false;
    }

    public final boolean F(String str, SmartLandingTask smartLandingTask) {
        SmartLandingTask.TaskAction taskAction;
        ISmartLandingProxy.e eVar;
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22e4965d", new Object[]{this, str, smartLandingTask})).booleanValue();
        }
        if (!(smartLandingTask == null || (taskAction = smartLandingTask.popAction) == null || taskAction.actionData == null)) {
            JSONObject jSONObject = new JSONObject(smartLandingTask.popAction.actionData);
            JSONArray jSONArray = smartLandingTask.popAction.benefitAliveList;
            this.b.r(jSONObject);
            jSONObject.put("smartLandingBehavior", (Object) str);
            ArrayList<ISmartLandingProxy.d> arrayList = this.g.get(smartLandingTask.popAction.actionType);
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<ISmartLandingProxy.d> it = arrayList.iterator();
                loop0: while (true) {
                    z = false;
                    while (it.hasNext()) {
                        ISmartLandingProxy.d next = it.next();
                        if (z || next.onTaskActionListener(str, smartLandingTask.popId, jSONObject, jSONArray, this.b.e())) {
                            z = true;
                        }
                    }
                }
                z2 = z;
            }
            if (!z2 && (eVar = this.c) != null) {
                z2 = ((a6q) eVar).a(this.f31164a, str, smartLandingTask.popId, smartLandingTask.popAction.actionType, jSONObject);
            }
            if (g4.b.i.equals(str)) {
                this.i = smartLandingTask;
            }
            smartLandingTask.isRunComplete = true;
            s("触发承接 " + smartLandingTask.popAction.actionType, smartLandingTask.popId);
            o3s.b("SmartLanding", "SML_runTaskAction " + this.b.k() + " 是否触发task " + z2 + " " + smartLandingTask.popAction.actionType + " " + smartLandingTask.popId);
            this.b.z(str, smartLandingTask);
        }
        return true;
    }

    public x5q(Context context, t7q t7qVar, ISmartLandingProxy.e eVar) {
        this.f31164a = context;
        this.b = t7qVar;
        o3s.b("SmartLanding", "SML_SmartLanding() " + t7qVar.k());
        this.c = new a6q(eVar);
        w();
        t7qVar.w(this);
    }
}
