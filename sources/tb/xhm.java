package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.LocalActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.abilitykit.ability.pop.render.AKFragmentPopRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.android.tbabilitykit.pop.StdPopActivityGroup;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex_ability.page.WeexContainerFragment;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xhm INSTANCE = new xhm();

    static {
        t2o.a(786432010);
    }

    @JvmStatic
    public static final void d(Activity activity) {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            ckf.f(declaredField, "Activity::class.java.getDeclaredField(\"mToken\")");
            boolean isAccessible = declaredField.isAccessible();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(INSTANCE);
            if (activity != null) {
                declaredField.set(activity, obj);
            }
            declaredField.setAccessible(isAccessible);
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("replaceToken", "replaceToken err = " + th);
        }
    }

    @JvmStatic
    public static final c8<?> e(Fragment fragment, n9 n9Var, a9 a9Var, n8 n8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("66645b07", new Object[]{fragment, n9Var, a9Var, n8Var, u8Var});
        }
        ckf.g(fragment, "fragment");
        ckf.g(n9Var, "akContext");
        ckf.g(a9Var, "popParams");
        ckf.g(n8Var, "akData");
        ckf.g(u8Var, "akCb");
        k9 k9Var = new k9();
        k9Var.v(new AKFragmentPopRender(fragment));
        c8<?> h = ye2.h(k9Var, a9Var, n8Var, n9Var, u8Var);
        ckf.f(h, "BizUtils.showPop(\n      …           akCb\n        )");
        return h;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements IAKPopRender<a9, n9> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public StdPopActivityGroup f31404a;
        public final WeakReference<tsd> b;
        public final WeakReference<fee> c;
        public int d;
        public a9 e;
        public iab f;
        public boolean g;
        public final /* synthetic */ Intent h;
        public final /* synthetic */ n9 i;
        public final /* synthetic */ a9 j;

        public a(Intent intent, n9 n9Var, a9 a9Var) {
            this.h = intent;
            this.i = n9Var;
            this.j = a9Var;
            Context d = n9Var.d();
            fee feeVar = null;
            this.b = new WeakReference<>((tsd) (!(d instanceof tsd) ? null : d));
            Context d2 = n9Var.d();
            this.c = new WeakReference<>(d2 instanceof fee ? d2 : feeVar);
            this.d = -1;
        }

        /* renamed from: a */
        public void j(n9 n9Var, a9 a9Var, View view, iab iabVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b41b2806", new Object[]{this, n9Var, a9Var, view, iabVar});
                return;
            }
            ckf.g(n9Var, "akCtx");
            ckf.g(a9Var, "params");
            ckf.g(iabVar, "callback");
            Context d = n9Var.d();
            if (!(d instanceof StdPopActivityGroup)) {
                d = null;
            }
            StdPopActivityGroup stdPopActivityGroup = (StdPopActivityGroup) d;
            this.f31404a = stdPopActivityGroup;
            this.e = a9Var;
            this.f = iabVar;
            if (stdPopActivityGroup != null) {
                Resources resources = stdPopActivityGroup.getResources();
                ckf.f(resources, "it.resources");
                this.d = resources.getConfiguration().orientation;
                c(stdPopActivityGroup, a9Var, iabVar);
            }
        }

        public final void b(String str, JSONObject jSONObject) {
            Context applicationContext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e296426", new Object[]{this, str, jSONObject});
                return;
            }
            StdPopActivityGroup stdPopActivityGroup = this.f31404a;
            if (stdPopActivityGroup != null && (applicationContext = stdPopActivityGroup.getApplicationContext()) != null) {
                Intent intent = new Intent(str);
                intent.replaceExtras(hp6.a(intent.getExtras(), jSONObject));
                LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent);
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void h(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
                return;
            }
            ckf.g(str, "state");
            if (this.j.f20479a.L()) {
                fee feeVar = this.c.get();
                if (feeVar != null) {
                    feeVar.h(str, jSONObject);
                    TLog.loge("stdPopTag", "stdPopTag", "send event to " + feeVar.getClass().getName() + ' ' + str);
                }
                if (jSONObject != null) {
                    jSONObject.put((JSONObject) "windowState", str);
                }
                b("mega.stdPop.broadcast.windowStateChanged", jSONObject);
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public String i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
            }
            return "native";
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void k(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70661375", new Object[]{this, view});
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public boolean l(View view, int i) {
            Activity activity;
            LocalActivityManager localActivityManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            ckf.g(view, "contentView");
            StdPopActivityGroup stdPopActivityGroup = this.f31404a;
            Boolean bool = null;
            if (stdPopActivityGroup == null || (localActivityManager = stdPopActivityGroup.getLocalActivityManager()) == null) {
                activity = null;
            } else {
                activity = localActivityManager.getCurrentActivity();
            }
            if (!(activity instanceof d9c)) {
                activity = null;
            }
            d9c d9cVar = (d9c) activity;
            if (d9cVar != null) {
                bool = Boolean.valueOf(d9cVar.canScrollVertically());
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return !this.j.f20479a.H();
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void m(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc9c903", new Object[]{this, view});
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void onDestroyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void onSizeChanged(int i, int i2) {
            a9 a9Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            StdPopActivityGroup stdPopActivityGroup = this.f31404a;
            if (stdPopActivityGroup != null && (a9Var = this.e) != null && a9Var.k()) {
                Resources resources = stdPopActivityGroup.getResources();
                ckf.f(resources, "act.resources");
                int i3 = resources.getConfiguration().orientation;
                if (this.d != i3) {
                    this.d = i3;
                    iab iabVar = this.f;
                    ckf.d(iabVar);
                    c(stdPopActivityGroup, a9Var, iabVar);
                    stdPopActivityGroup.t(a9Var.f20479a);
                }
            }
        }

        public final void c(StdPopActivityGroup stdPopActivityGroup, a9 a9Var, iab iabVar) {
            Bundle extras;
            n9 n9Var = this.i;
            Intent intent = this.h;
            try {
                LocalActivityManager localActivityManager = stdPopActivityGroup.getLocalActivityManager();
                if (localActivityManager != null) {
                    if (localActivityManager.getCurrentActivity() != null) {
                        localActivityManager.destroyActivity("StdPop", true);
                    }
                    Context d = n9Var.d();
                    if (d != null) {
                        Intent intent2 = ((Activity) d).getIntent();
                        if (!(intent2 == null || (extras = intent2.getExtras()) == null)) {
                            intent.putExtras(extras);
                        }
                        intent.removeExtra("std_pop_to_page");
                        intent.removeExtra("std_pop_origin_component_cls_name");
                        intent.removeExtra("std_pop_origin_component_pkg_name");
                        xhv xhvVar = xhv.INSTANCE;
                        Window startActivity = localActivityManager.startActivity("StdPop", intent);
                        if (startActivity != null) {
                            if (gxv.l(n9Var.d()) && abl.I()) {
                                View.class.getDeclaredMethod("setIsRootNamespace", Boolean.TYPE).invoke(startActivity.getDecorView(), Boolean.FALSE);
                                String D = this.j.f20479a.D();
                                if (!(D == null || D.length() == 0)) {
                                    a9Var.f20479a.n0(gxv.d(a9Var.f(), stdPopActivityGroup));
                                }
                            }
                            iabVar.onRenderSuccess(startActivity.getDecorView());
                            return;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
                iabVar.a(new a8(90001, "StartSubActivityFail"), new PopErrorView(stdPopActivityGroup, a9Var));
            } catch (Throwable th) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "localActivityManagerStartError " + stringWriter);
                AppMonitor.Counter.commit("AbilityKit", "localManagerStartError", th.toString(), 1.0d);
                if (abl.D(stdPopActivityGroup) && !(th instanceof ActivityNotFoundException)) {
                    stdPopActivityGroup.startActivityForResult(intent, intent.getIntExtra("stdPopShowWithCode", -1));
                    stdPopActivityGroup.finish();
                }
            }
        }

        @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
        public void n(String str, JSONObject jSONObject) {
            StdPopActivityGroup stdPopActivityGroup;
            LocalActivityManager localActivityManager;
            Activity currentActivity;
            FragmentManager supportFragmentManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
                return;
            }
            ckf.g(str, "type");
            JSONObject jSONObject2 = null;
            boolean b = ckf.b(jSONObject != null ? jSONObject.getString("from") : null, "innerPopForward");
            if (!b) {
                b(str, jSONObject);
            }
            if (this.j.f20479a.K() || b) {
                if (jSONObject != null) {
                    jSONObject.remove("from");
                }
                tsd tsdVar = this.b.get();
                if (ckf.b(str, IAKPopRender.LifecycleType.CHANGE_POSITION) || ckf.b(str, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
                    if (tsdVar != null) {
                        tsdVar.S0(jSONObject);
                    }
                    b("mega.stdPop.broadcast.positionChanged", jSONObject);
                    return;
                }
                if (tsdVar != null) {
                    tsdVar.G(str, jSONObject);
                }
                if (jSONObject != null) {
                    jSONObject.put("popState", (Object) str);
                }
                b("mega.stdPop.broadcast.popStateChanged", jSONObject);
            } else if (this.j.f20479a.J() && (stdPopActivityGroup = this.f31404a) != null && (localActivityManager = stdPopActivityGroup.getLocalActivityManager()) != null && (currentActivity = localActivityManager.getCurrentActivity()) != null) {
                if (!(currentActivity instanceof FragmentActivity)) {
                    currentActivity = null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
                Fragment findFragmentByTag = (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentByTag("ali_mus_fragment_tag");
                if ((findFragmentByTag instanceof WeexFragment) || (findFragmentByTag instanceof WeexContainerFragment)) {
                    m5x m5xVar = new m5x(findFragmentByTag);
                    if (ckf.b(str, IAKPopRender.LifecycleType.CHANGE_POSITION) || ckf.b(str, IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
                        Object obj = jSONObject != null ? jSONObject.get("data") : null;
                        if (!(obj instanceof JSONObject)) {
                            obj = null;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj;
                        if (jSONObject3 != null) {
                            if (!this.g) {
                                this.g = true;
                                m5xVar.c(jSONObject3, this.f31404a, WeexExternalEventType.START);
                            }
                            m5xVar.c(jSONObject3, this.f31404a, WeexExternalEventType.UPDATE);
                        }
                    }
                    if (ckf.b(str, IAKPopRender.LifecycleType.OUT_ANIMATION_END) || ckf.b(str, IAKPopRender.LifecycleType.IN_ANIMATION_END) || ckf.b(str, IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END)) {
                        Object obj2 = jSONObject != null ? jSONObject.get("data") : null;
                        if (obj2 instanceof JSONObject) {
                            jSONObject2 = obj2;
                        }
                        JSONObject jSONObject4 = jSONObject2;
                        if (jSONObject4 != null) {
                            if (!this.g) {
                                m5xVar.c(jSONObject4, this.f31404a, WeexExternalEventType.START);
                            }
                            this.g = false;
                            m5xVar.c(jSONObject4, this.f31404a, WeexExternalEventType.END);
                        }
                    }
                }
            }
        }
    }

    @JvmStatic
    public static final void a(Activity activity, Context context) {
        if (activity != null) {
            try {
                Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
                ckf.f(declaredField, "field");
                boolean isAccessible = declaredField.isAccessible();
                declaredField.setAccessible(true);
                declaredField.set(activity, context);
                declaredField.setAccessible(isAccessible);
            } catch (Throwable th) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "changeActBase err = " + th);
            }
        }
    }

    @JvmStatic
    public static final boolean c(Activity activity, String str) {
        Object systemService;
        ComponentName componentName;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85cf4e02", new Object[]{activity, str})).booleanValue();
        }
        String str2 = null;
        if (activity != null) {
            try {
                systemService = activity.getSystemService("activity");
            } catch (Throwable unused) {
                return false;
            }
        } else {
            systemService = null;
        }
        if (systemService != null) {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
            ckf.f(runningTasks, "runningTasks");
            if (runningTasks.isEmpty()) {
                return false;
            }
            componentName = runningTasks.get(0).baseActivity;
            if (!ckf.b(componentName != null ? componentName.getClassName() : null, INSTANCE.getClass().getName())) {
                if (componentName != null) {
                    str2 = componentName.getClassName();
                }
                if (!ckf.b(str2, str)) {
                    z = false;
                }
            }
            iih.INSTANCE.a("stdPopTag", "isRootActivity by runningTask = " + z);
            return z;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    @JvmStatic
    public static final c8<?> f(Intent intent, n9 n9Var, a9 a9Var, n8 n8Var, u8 u8Var) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("9a5dc356", new Object[]{intent, n9Var, a9Var, n8Var, u8Var});
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(n9Var, "akContext");
        ckf.g(a9Var, "popParams");
        ckf.g(n8Var, "akData");
        ckf.g(u8Var, "akCb");
        String i = a9Var.i();
        if (i == null) {
            i = intent.getStringExtra(qxq.KEY_FRAGMENT_NAME);
        }
        a9Var.m(i);
        Context d = n9Var.d();
        if (d != null) {
            List<ResolveInfo> queryIntentActivities = d.getPackageManager().queryIntentActivities(intent, 0);
            ckf.f(queryIntentActivities, "it.packageManager.queryIntentActivities(intent, 0)");
            if (queryIntentActivities.size() > 0) {
                a9Var.l(queryIntentActivities.get(0).activityInfo);
            }
        }
        if (a9Var.i() == null) {
            a9Var.k = true;
            obj = new a(intent, n9Var, a9Var);
        } else {
            obj = new AKFragmentPopRender(null);
        }
        k9 k9Var = new k9();
        k9Var.v(obj);
        c8<?> h = ye2.h(k9Var, a9Var, n8Var, n9Var, u8Var);
        ckf.f(h, "BizUtils.showPop(\n      …           akCb\n        )");
        return h;
    }

    @JvmStatic
    public static final Object b(Class<?> cls, String str, Object obj) {
        if (cls == null || str == null) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            ckf.f(declaredField, "field");
            boolean isAccessible = declaredField.isAccessible();
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            declaredField.setAccessible(isAccessible);
            return obj2;
        } catch (Throwable unused) {
            iih.INSTANCE.a("stdPopTag", "getField failed key = ".concat(str));
            return null;
        }
    }
}
