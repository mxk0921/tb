package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.ViewModeWVApi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ixm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f21631a;

    public static /* synthetic */ afg a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afg) ipChange.ipc$dispatch("68ef70ca", new Object[]{str});
        }
        return e(str);
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (!f21631a) {
            synchronized (ixm.class) {
                try {
                    if (!f21631a) {
                        d(context);
                        f21631a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebbabd1", new Object[]{context});
            return;
        }
        udg udgVar = new udg();
        udgVar.f29306a = RVEnvironmentService.PLATFORM_TB;
        udgVar.b = b(context);
        rog.INSTANCE.a(context, udgVar);
        ViewModeWVApi.registerActionListener("readPrivacyKey", new b());
        ViewModeWVApi.registerActionListener("writePrivacyKey", new c());
    }

    public static afg e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afg) ipChange.ipc$dispatch("2b6c05d8", new Object[]{str});
        }
        afg afgVar = new afg();
        afgVar.a("msg", str);
        return afgVar;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements ViewModeWVApi.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.tao.welcome.ViewModeWVApi.b
        public boolean a(String str, vdg vdgVar) {
            String d;
            String d2;
            String d3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72b7b0b2", new Object[]{this, str, vdgVar})).booleanValue();
            }
            ajc c = vdgVar.c();
            if (c == null) {
                vdgVar.b(ixm.a("webview of context is null"));
                return false;
            }
            Context context = c.getView().getContext();
            if (!(context instanceof Activity)) {
                vdgVar.b(ixm.a("the container should be Android Activity"));
                return false;
            }
            JSONArray parseArray = JSON.parseArray(str);
            if (parseArray == null || parseArray.isEmpty()) {
                vdgVar.b(ixm.a("param invalid"));
                return false;
            }
            afg afgVar = new afg();
            if (parseArray.contains("recommend") && (d3 = br0.d(context, "recommend")) != null) {
                afgVar.a("recommend", d3);
            }
            if (parseArray.contains("innerAd") && (d2 = br0.d(context, "innerAd")) != null) {
                afgVar.a("innerAd", d2);
            }
            if (parseArray.contains("outerAd") && (d = br0.d(context, "outerAd")) != null) {
                afgVar.a("outerAd", d);
            }
            vdgVar.e(afgVar);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements ViewModeWVApi.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.tao.welcome.ViewModeWVApi.b
        public boolean a(String str, vdg vdgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72b7b0b2", new Object[]{this, str, vdgVar})).booleanValue();
            }
            ajc c = vdgVar.c();
            if (c == null) {
                vdgVar.b(ixm.a("webview of context is null"));
                return false;
            }
            Context context = c.getView().getContext();
            if (!(context instanceof Activity)) {
                vdgVar.b(ixm.a("the container should be Android Activity"));
                return false;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null || parseObject.isEmpty()) {
                vdgVar.b(ixm.a("param invalid"));
                return false;
            }
            afg afgVar = new afg();
            String str2 = "false";
            if (parseObject.containsKey("recommend")) {
                afgVar.a("recommend", br0.l(context, "recommend", "true".equalsIgnoreCase(parseObject.getString("recommend")) ? "true" : str2) ? "true" : str2);
            }
            if (parseObject.containsKey("innerAd")) {
                afgVar.a("innerAd", br0.l(context, "innerAd", "true".equalsIgnoreCase(parseObject.getString("innerAd")) ? "true" : str2) ? "true" : str2);
            }
            if (parseObject.containsKey("outerAd")) {
                if (br0.l(context, "outerAd", "true".equalsIgnoreCase(parseObject.getString("outerAd")) ? "true" : str2)) {
                    str2 = "true";
                }
                afgVar.a("outerAd", str2);
            }
            vdgVar.e(afgVar);
            return true;
        }
    }
}
