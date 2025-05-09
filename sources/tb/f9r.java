package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.dinamicx.s;
import com.taobao.android.purchase.preload.TBBuyPreRequest;
import java.io.File;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f19123a;
        public final /* synthetic */ Context b;

        public b(Map map, Context context) {
            this.f19123a = map;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Intent intent = (Intent) fk.b(this.f19123a, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, Intent.class, null);
            Boolean bool = (Boolean) fk.b(this.f19123a, "fullScreen", Boolean.class, null);
            if (intent == null || bool == null) {
                Toast.makeText(this.b, "请加入 intent 和 fullScreen 参数", 1).show();
                return;
            }
            ck.g().e("enablePrefetch true");
            TBBuyPreRequest.a(this.b, intent, bool.booleanValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String a2 = u9r.a(mop.KEY_TEMPLATE_LIST, "");
                if (!TextUtils.isEmpty(a2) && (parseObject = JSON.parseObject(a2)) != null) {
                    for (String str : parseObject.keySet()) {
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = parseObject.getJSONObject(str);
                            String string = jSONObject.getString("templateId");
                            if (!TextUtils.isEmpty(string)) {
                                hm0.c(str, string, jSONObject.getJSONObject("config"));
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                vm0.e("PRE_FETCH_TEMPLATE_ERROR", th.getMessage());
            }
        }
    }

    static {
        t2o.a(708837588);
    }

    public static void a(Context context, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82a00d8", new Object[]{context, sVar});
        } else if (AliBuyPerfSwitcher.enablePreRender() || AliBuyPerfSwitcher.enableSmoothButter()) {
            dn.h(new a(sVar, context));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7af990c", new Object[0]);
        } else if (AliBuyPerfSwitcher.enableBoostCpu()) {
            ck.g().e("boostCpu", ck.b.b().i("AURA/performance").a());
            ADaemon.boostCpu(2);
        }
    }

    public static void c(Context context, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6390cfc", new Object[]{context, new Boolean(z)});
        } else if (AliBuyPerfSwitcher.enableNativeRender() && !z && !a8r.b(context)) {
            boolean a2 = v48.a();
            if (!a2) {
                v48.b();
                r58.b("checkIsInstallSuccess", "dynamic-trade-uikit 未下载成功");
            } else {
                r58.b("checkIsInstallFail", "dynamic-trade-uikit 下载成功");
            }
            rbb g = ck.g();
            if (a2) {
                str = "已经安装";
            } else {
                str = "未安装";
            }
            g.e("ultron-dynamic-uikit".concat(str), ck.b.b().i("AURA/nativeRender").a());
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c335f78", new Object[0]);
        } else {
            dn.h(new c());
        }
    }

    public static void e(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483db0b0", new Object[]{context, map});
        } else if (AliBuyPerfSwitcher.enablePrefetch()) {
            dn.h(new b(map, context));
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e6c019", new Object[]{context});
        } else if (AliBuyPerfSwitcher.enableNativeRender() && !a8r.b(context) && v48.a()) {
            ck.g().e("预 加载native view ", ck.b.b().i("AURA/nativeRender").a());
            r58.g(context);
        }
    }

    public static s i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("e632b4e5", new Object[]{context});
        }
        s d = gm0.d(context);
        y7r.a(d);
        y7r.c(d);
        im0.b(d);
        im0.c(d);
        im0.a(d);
        return d;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f19122a;
        public final /* synthetic */ Context b;

        public a(s sVar, Context context) {
            this.f19122a = sVar;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s sVar = this.f19122a;
            if (sVar != null) {
                Context context = this.b;
                if (new File("/data/local/tmp/.preRenderDX").exists() || Boolean.parseBoolean(y8r.g("enablePreRenderDX", "true"))) {
                    z = true;
                }
                hm0.d(context, sVar, z);
            }
        }
    }

    public static void f(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da0d64c", new Object[]{context, map});
        } else if (AliBuyPerfSwitcher.enablePrefetchV2()) {
            Bundle bundle = (Bundle) fk.b(map, "bundle", Bundle.class, null);
            if (bundle == null) {
                Toast.makeText(context, "请加入 intent 和 fullScreen 参数", 1).show();
                return;
            }
            Intent intent = new Intent();
            intent.putExtras(bundle);
            ck.g().e("enablePrefetch true");
            TBBuyPreRequest.b(context, intent);
        }
    }

    public static void h(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f85a85", new Object[]{context, map});
        } else if (AliBuyPerfSwitcher.enableAuraPreload()) {
            String str = (String) fk.b(map, "bizName", String.class, "purchase");
            String str2 = (String) fk.b(map, "from", String.class, "iCartChanged");
            if (str == null || str2 == null) {
                Toast.makeText(context, "请加入 model 和 from 参数", 1).show();
            } else {
                d9r.d(context, str, str2);
            }
        }
    }
}
