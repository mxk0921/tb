package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter;
import com.taobao.android.stdpop.api.StdPopNativeParams;
import com.taobao.android.tbabilitykit.pop.StdPopActivityGroup;
import com.taobao.android.tbabilitykit.pop.StdPopContainerActivity;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class olq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final olq INSTANCE = new olq();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uv2 f25465a;

        public a(uv2 uv2Var) {
            this.f25465a = uv2Var;
        }

        @Override // tb.u8
        public final void callback(String str, c8<Object> c8Var) {
            uv2 uv2Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
                return;
            }
            JSONObject jSONObject = null;
            if (ckf.b(str, "onClose")) {
                uv2 uv2Var2 = this.f25465a;
                if (uv2Var2 != null) {
                    Object a2 = c8Var != null ? c8Var.a() : null;
                    if (a2 instanceof JSONObject) {
                        jSONObject = a2;
                    }
                    uv2Var2.b((JSONObject) jSONObject);
                }
            } else if (ckf.b(str, "onBlockBackDismissed") && (uv2Var = this.f25465a) != null) {
                Object a3 = c8Var != null ? c8Var.a() : null;
                if (a3 instanceof JSONObject) {
                    jSONObject = a3;
                }
                uv2Var.a(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mlq f25466a;

        public b(mlq mlqVar) {
            this.f25466a = mlqVar;
        }

        @Override // tb.u8
        public final void callback(String str, c8<Object> c8Var) {
            mlq mlqVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else if (ckf.b(str, "onClose") && (mlqVar = this.f25466a) != null) {
                JSONObject jSONObject = null;
                Object a2 = c8Var != null ? c8Var.a() : null;
                if (a2 instanceof JSONObject) {
                    jSONObject = a2;
                }
                mlqVar.b(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uv2 f25467a;

        public c(uv2 uv2Var) {
            this.f25467a = uv2Var;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/stdpop/api/StdPopFacade$showNativePopWithPadAutoRotate$4");
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            uv2 uv2Var = this.f25467a;
            if (uv2Var != null) {
                uv2Var.b(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uv2 f25468a;

        public d(uv2 uv2Var) {
            this.f25468a = uv2Var;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/stdpop/api/StdPopFacade$showNativePopWithPadAutoRotateByFragment$4");
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            uv2 uv2Var = this.f25468a;
            if (uv2Var != null) {
                uv2Var.b(jSONObject);
            }
        }
    }

    static {
        t2o.a(786432023);
    }

    @JvmStatic
    public static final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b64ca84", new Object[]{context, str});
            return;
        }
        iih iihVar = iih.INSTANCE;
        iihVar.a("stdPopTag", "StdPopFacade disMissPop = " + str);
        AKBasePopPresenter.Companion.b(context, str, null);
    }

    @JvmStatic
    public static final void b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13538d0", new Object[]{context, str, new Boolean(z)});
            return;
        }
        iih iihVar = iih.INSTANCE;
        iihVar.a("stdPopTag", "StdPopFacade disMissPop = " + str + " withAnimation = " + z);
        AKBasePopPresenter.Companion.c(context, str, null, z);
    }

    @JvmStatic
    public static final boolean d(Activity activity) {
        Activity activity2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c915ccb", new Object[]{activity})).booleanValue();
        }
        if (activity != null) {
            activity2 = activity.getParent();
        } else {
            activity2 = null;
        }
        return activity2 instanceof StdPopActivityGroup;
    }

    @JvmStatic
    public static final boolean e(Activity activity) {
        h9 c2;
        e9 e9Var;
        h9 c3;
        e9 e9Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b327dceb", new Object[]{activity})).booleanValue();
        }
        String str = null;
        if (activity instanceof StdPopActivityGroup) {
            qlq h = ((StdPopActivityGroup) activity).h();
            if (!(h == null || (c3 = h.c()) == null || (e9Var2 = c3.b) == null)) {
                str = e9Var2.D();
            }
            return ckf.b(str, h9.DEFAULT_LANDSCAPE_DRAWER);
        } else if (!(activity instanceof StdPopContainerActivity)) {
            return false;
        } else {
            qlq l3 = ((StdPopContainerActivity) activity).l3();
            if (!(l3 == null || (c2 = l3.c()) == null || (e9Var = c2.b) == null)) {
                str = e9Var.D();
            }
            return ckf.b(str, h9.DEFAULT_LANDSCAPE_DRAWER);
        }
    }

    @JvmStatic
    public static final boolean f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72696b02", new Object[]{activity})).booleanValue();
        }
        return d(activity);
    }

    @JvmStatic
    public static final zao i(Context context, Intent intent, uv2 uv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("1493067a", new Object[]{context, intent, uv2Var});
        }
        if (intent == null) {
            zao zaoVar = new zao();
            zaoVar.f32653a = false;
            return zaoVar;
        } else if (context == null) {
            zao zaoVar2 = new zao();
            zaoVar2.f32653a = false;
            return zaoVar2;
        } else if (abl.i(context)) {
            try {
                if (context instanceof Activity) {
                    ((Activity) context).startActivityForResult(intent, intent.getIntExtra("stdPopShowWithCode", -1));
                } else {
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            } catch (Throwable th) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "stdPopForPad downgradeToNav error = " + th);
            }
            zao zaoVar3 = new zao();
            zaoVar3.f32653a = false;
            return zaoVar3;
        } else {
            nlq nlqVar = new nlq();
            nlqVar.i(context);
            nlqVar.r(intent);
            nlqVar.q(new WeakReference<>(context));
            AppMonitor.Counter.commit("AbilityKit", "showDrawerByCtx", intent.getDataString(), 1.0d);
            return h(nlqVar, intent, INSTANCE.c(intent, context), new c(uv2Var));
        }
    }

    @JvmStatic
    public static final zao k(Context context, Intent intent, Fragment fragment, uv2 uv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("2e2aea29", new Object[]{context, intent, fragment, uv2Var});
        }
        ckf.g(fragment, "fromFragment");
        nlq nlqVar = new nlq();
        if (intent == null) {
            zao zaoVar = new zao();
            zaoVar.f32653a = false;
            return zaoVar;
        } else if (context == null) {
            zao zaoVar2 = new zao();
            zaoVar2.f32653a = false;
            return zaoVar2;
        } else if (abl.i(context)) {
            try {
                fragment.startActivityForResult(intent, intent.getIntExtra("stdPopShowWithCode", -1));
            } catch (Throwable th) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "showNativePopWithPadAutoRotateByFragment error = " + th);
            }
            zao zaoVar3 = new zao();
            zaoVar3.f32653a = false;
            return zaoVar3;
        } else {
            nlqVar.i(context);
            nlqVar.q(new WeakReference<>(fragment));
            AppMonitor.Counter.commit("AbilityKit", "showDrawerByFragment", intent.getDataString(), 1.0d);
            return h(nlqVar, intent, INSTANCE.c(intent, context), new d(uv2Var));
        }
    }

    @JvmStatic
    public static final zao g(Context context, Fragment fragment, JSONObject jSONObject, uv2 uv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("f78cbf63", new Object[]{context, fragment, jSONObject, uv2Var});
        }
        ckf.g(context, "appContext");
        ckf.g(fragment, "fragment");
        ckf.g(jSONObject, "params");
        TLog.loge("stdPopTag", "showFragmentPop = ".concat(fragment.getClass().getName()));
        n9 n9Var = new n9();
        n9Var.i(context);
        JSONObject jSONObject2 = new JSONObject(2);
        jSONObject2.put("type", (Object) "showNativePop");
        jSONObject2.put("params", (Object) jSONObject);
        xhv xhvVar = xhv.INSTANCE;
        n8 n8Var = new n8(jSONObject2);
        c8<?> e = xhm.e(fragment, n9Var, new a9(n8Var.h()), n8Var, new a(uv2Var));
        zao zaoVar = new zao();
        if (e instanceof b8) {
            b8 b8Var = (b8) e;
            a8 a2 = b8Var.a();
            String str = null;
            zaoVar.b = a2 != null ? String.valueOf(a2.a()) : null;
            a8 a3 = b8Var.a();
            if (a3 != null) {
                str = a3.b();
            }
            zaoVar.c = str;
            zaoVar.f32653a = false;
        } else {
            zaoVar.f32653a = true;
        }
        return zaoVar;
    }

    @JvmStatic
    public static final zao h(nlq nlqVar, Intent intent, StdPopNativeParams stdPopNativeParams, mlq mlqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("fc118ca2", new Object[]{nlqVar, intent, stdPopNativeParams, mlqVar});
        }
        iih iihVar = iih.INSTANCE;
        StringBuilder sb = new StringBuilder("intent = ");
        String str = null;
        sb.append(intent != null ? intent.toString() : null);
        iihVar.a("stdPopTag", sb.toString());
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put("type", (Object) "showNativePop");
        jSONObject.put("params", (Object) stdPopNativeParams);
        xhv xhvVar = xhv.INSTANCE;
        n8 n8Var = new n8(jSONObject);
        c8<?> f = xhm.f(intent, nlqVar, new a9(n8Var.h()), n8Var, new b(mlqVar));
        zao zaoVar = new zao();
        if (f instanceof b8) {
            b8 b8Var = (b8) f;
            a8 a2 = b8Var.a();
            zaoVar.b = a2 != null ? String.valueOf(a2.a()) : null;
            a8 a3 = b8Var.a();
            if (a3 != null) {
                str = a3.b();
            }
            zaoVar.c = str;
            zaoVar.f32653a = false;
        } else {
            zaoVar.f32653a = true;
        }
        return zaoVar;
    }

    public final StdPopNativeParams c(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StdPopNativeParams) ipChange.ipc$dispatch("11677efb", new Object[]{this, intent, context});
        }
        String h = gxv.h(intent, "stdPopAttachMode");
        float floatExtra = intent.getFloatExtra("stdPopMaxW", 1.0f);
        float floatExtra2 = intent.getFloatExtra("stdPopMaxH", 1.0f);
        int intExtra = intent.getIntExtra("stdPopCorner", 0);
        int intExtra2 = intent.getIntExtra("stdPopShowWithCode", -1);
        boolean booleanExtra = intent.getBooleanExtra("stdPopModal", false);
        boolean booleanExtra2 = intent.getBooleanExtra("stdPopPanEnable", true);
        boolean booleanExtra3 = intent.getBooleanExtra("stdPopHandleBack", false);
        boolean booleanExtra4 = intent.getBooleanExtra("stdPopBlockHandleBack", false);
        boolean booleanExtra5 = intent.getBooleanExtra("stdPopFullScreen", true);
        boolean booleanExtra6 = intent.getBooleanExtra("stdPopRecreateOnSysChanged", false);
        boolean booleanExtra7 = intent.getBooleanExtra("stdPopTapEnable", true);
        boolean booleanExtra8 = intent.getBooleanExtra("stdPopEnablePadActTransition", true);
        Pair a2 = jpu.a("maxWidth", Float.valueOf(floatExtra));
        Pair a3 = jpu.a("maxHeight", Float.valueOf(floatExtra2));
        Pair a4 = jpu.a(hij.KEY_CORNER_RADIUS, Integer.valueOf(intExtra));
        Pair a5 = jpu.a("panEnable", Boolean.valueOf(booleanExtra2));
        Pair a6 = jpu.a("drawerNotModal", Boolean.valueOf(!booleanExtra));
        Pair a7 = jpu.a("droidFullScreen", Boolean.valueOf(booleanExtra5));
        Pair a8 = jpu.a("drawerMode", h9.PAD_FULL_SCREEN_DRAWER);
        Boolean bool = Boolean.TRUE;
        JSONObject jSONObject = new JSONObject(kotlin.collections.a.k(a2, a3, a4, a5, a6, a7, a8, jpu.a("recoverWindow", bool), jpu.a("adaptSpecificPadPop", bool), jpu.a("animation", "noAnimation"), jpu.a(nbf.STDPOP_CONFIG_BACK, Boolean.valueOf(booleanExtra3)), jpu.a("droidBlockHandleBack", Boolean.valueOf(booleanExtra4)), jpu.a("tapEnable", Boolean.valueOf(booleanExtra7)), jpu.a("autoRotate", Boolean.valueOf(gxv.l(context))), jpu.a(nbf.STDPOP_CONFIG_WINDOW_NOTIFY, Boolean.FALSE)));
        if (!(h == null || h.length() == 0)) {
            jSONObject.put((JSONObject) "attachMode", h);
        }
        if (!booleanExtra) {
            jSONObject.put((JSONObject) "backgroundMode", "color");
            jSONObject.put((JSONObject) "backgroundStyle", "#00000000");
        }
        return new StdPopNativeParams(jSONObject).extConfig(new JSONObject(new JSONObject(kotlin.collections.a.k(jpu.a("showNativeWithCode", Integer.valueOf(intExtra2)), jpu.a("recreateOnSysChanged", Boolean.valueOf(booleanExtra6)), jpu.a("recoverWindow", bool), jpu.a("enablePadActTransition", Boolean.valueOf(booleanExtra8))))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0199, code lost:
        if (r13.equals("simple") != false) goto L_0x01a2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012b, code lost:
        if (r12.equals("fullscreen") == false) goto L_0x0166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
        r2 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016d, code lost:
        if (r12.equals("offsetFullscreen") != false) goto L_0x012d;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final tb.zao l(tb.nlq r26, tb.mlq r27) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.olq.l(tb.nlq, tb.mlq):tb.zao");
    }

    @JvmStatic
    public static final zao j(Context context, Fragment fragment, uv2 uv2Var) {
        String str;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zao) ipChange.ipc$dispatch("5e06481f", new Object[]{context, fragment, uv2Var});
        }
        ckf.g(context, "appContext");
        ckf.g(fragment, "fragment");
        AppMonitor.Counter.commit("AbilityKit", "showFragmentDrawer", fragment.getClass().getName(), 1.0d);
        Bundle arguments = fragment.getArguments();
        boolean z3 = arguments != null ? arguments.getBoolean("stdPopModal", true) : true;
        float f = 1.0f;
        float f2 = arguments != null ? arguments.getFloat("stdPopMaxW", 1.0f) : 1.0f;
        if (arguments != null) {
            f = arguments.getFloat("stdPopMaxH", 1.0f);
        }
        int i = arguments != null ? arguments.getInt("stdPopCorner", 0) : 0;
        String str2 = null;
        String string = arguments != null ? arguments.getString("stdPopAttachMode") : null;
        Boolean valueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("stdPopMatchContent", false)) : null;
        String string2 = arguments != null ? arguments.getString("stdPopPopId", null) : null;
        boolean z4 = arguments != null ? arguments.getBoolean("stdPopBlockClose", false) : false;
        boolean z5 = arguments != null ? arguments.getBoolean("stdPopHandleBack", true) : true;
        String string3 = arguments != null ? arguments.getString("stdPopAnimation", null) : null;
        if (arguments != null) {
            str2 = arguments.getString("landScapeAnimation", null);
        }
        boolean z6 = arguments != null ? arguments.getBoolean("stdPopPanEnable", true) : true;
        boolean z7 = arguments != null ? arguments.getBoolean("stdPopBlockHandleBack", false) : false;
        if (arguments != null) {
            str = string2;
            z = true;
            z2 = arguments.getBoolean("stdPopTapEnable", true);
        } else {
            str = string2;
            z = true;
            z2 = true;
        }
        JSONObject jSONObject = new JSONObject(kotlin.collections.a.k(jpu.a("maxWidth", Float.valueOf(f2)), jpu.a("maxHeight", Float.valueOf(f)), jpu.a(hij.KEY_CORNER_RADIUS, Integer.valueOf(i)), jpu.a("panEnable", Boolean.valueOf(z6)), jpu.a("drawerNotModal", Boolean.valueOf(!z3)), jpu.a(e9.TAK_ABILITY_MATCH_CONTENT, valueOf), jpu.a("adaptSpecificPadPop", Boolean.valueOf(arguments != null ? arguments.getBoolean("useDrawerMode", z) : true)), jpu.a("autoRotate", Boolean.valueOf(gxv.l(context))), jpu.a("shouldBlockClose", Boolean.valueOf(z4)), jpu.a(nbf.STDPOP_CONFIG_BACK, Boolean.valueOf(z5)), jpu.a("droidBlockHandleBack", Boolean.valueOf(z7)), jpu.a("landScapeAnimation", string3), jpu.a("tapEnable", Boolean.valueOf(z2)), jpu.a("animation", string3), jpu.a("landScapeAnimation", str2)));
        if (!(string == null || string.length() == 0)) {
            jSONObject.put("attachMode", (Object) string);
        }
        if (!z3) {
            jSONObject.put((JSONObject) "backgroundMode", "color");
            jSONObject.put((JSONObject) "backgroundStyle", "#00000000");
        }
        return g(context, fragment, new JSONObject(kotlin.collections.a.k(jpu.a("popId", str), jpu.a(h9.KEY_POP_CONFIG, jSONObject))), uv2Var);
    }
}
