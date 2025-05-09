package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ig8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f21299a;
    public static Context b;

    static {
        t2o.a(503316528);
    }

    public static Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("68ab5bfe", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        try {
            ILogin q = od0.D().q();
            if (q != null) {
                HashMap hashMap2 = new HashMap();
                hashMap.put("user", hashMap2);
                boolean b2 = q.b();
                hashMap2.put("isLogin", Boolean.valueOf(b2));
                if (b2) {
                    ILogin.a a2 = q.a();
                    hashMap2.put("uId", a2.f12001a);
                    hashMap2.put("nick", a2.b);
                    hashMap2.put("userLogo", a2.c);
                }
            }
            IFestival k = od0.D().k();
            if (k != null) {
                hashMap.put("festival", k.t().toMap());
            }
        } catch (Throwable th) {
            tfs.d("getAppEnv:" + th.getMessage());
        }
        return hashMap;
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return b;
    }

    public static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("faa03dde", new Object[0]);
        }
        return f21299a;
    }

    public static JSONObject d(Context context) {
        Activity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3fe75ea", new Object[]{context});
        }
        if (!(!(context instanceof Application) || od0.D().f() == null || (a2 = od0.D().f().a()) == null)) {
            context = a2;
        }
        JSONObject jSONObject = new JSONObject();
        k(context, jSONObject);
        h(context, jSONObject);
        j(context, jSONObject);
        l(context, jSONObject);
        i(context, jSONObject);
        n(context, jSONObject);
        return jSONObject;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd0dcae3", new Object[]{context})).intValue();
        }
        return s6o.J(context, s6o.z(context) + s6o.g(context));
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        if (b == null && context != null) {
            b = context.getApplicationContext();
        }
        JSONObject jSONObject = f21299a;
        if (jSONObject != null) {
            m(context, null, jSONObject);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        f21299a = jSONObject2;
        k(context, jSONObject2);
        h(context, f21299a);
        j(context, f21299a);
        l(context, f21299a);
        i(context, f21299a);
    }

    public static void h(Context context, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff00d018", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (context.getApplicationInfo().labelRes == 0) {
                str = "taobao";
            } else {
                str = context.getString(context.getApplicationInfo().labelRes);
            }
            jSONObject2.put("name", (Object) str);
            jSONObject2.put("schema", (Object) context.getPackageName());
            try {
                jSONObject2.put("version", (Object) context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject2.put("debug", (Object) Boolean.valueOf(nwv.R(context)));
            jSONObject2.put("env", (Object) a());
            jSONObject.put("app", (Object) jSONObject2);
        } catch (Exception e3) {
            tfs.d("setupAppEnv:" + e3.getMessage());
        }
    }

    public static JSONObject j(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fb0a5049", new Object[]{context, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            int B = s6o.B(context);
            int t = s6o.t(context);
            jSONObject2.put("isX", (Object) "false");
            jSONObject2.put("resolutionW", (Object) Integer.valueOf(B));
            jSONObject2.put("resolutionH", (Object) Integer.valueOf(t));
            jSONObject2.put("width", (Object) Integer.valueOf(B));
            jSONObject2.put("height", (Object) Integer.valueOf(t));
            jSONObject2.put("statusBarH", (Object) (s6o.H(context, s6o.z(context)) + "wx"));
            jSONObject2.put("statusBarHeight", (Object) Integer.valueOf(s6o.J(context, (float) s6o.z(context))));
            jSONObject2.put("density", (Object) Float.valueOf(s6o.l(context)));
            jSONObject2.put("stableDensity", (Object) Float.valueOf(s6o.y(context)));
            IDeviceInfo i = od0.D().i();
            if (i != null) {
                jSONObject2.put("pad", (Object) Boolean.valueOf(i.i()));
                jSONObject2.put("isLandscape", (Object) Boolean.valueOf(i.h()));
                jSONObject2.put("isFoldDevice", (Object) Boolean.valueOf(i.l()));
                jSONObject2.put("tnodescale", (Object) Float.valueOf((s6o.l(context) * i.p(context)) / 2.0f));
            }
            jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, (Object) jSONObject2);
            m(context, jSONObject2, jSONObject);
        } catch (Exception e) {
            tfs.d("setupDeviceEnv:" + e.getMessage());
        }
        return jSONObject2;
    }

    public static void k(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dbf474e", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) "TNodeEngine");
            jSONObject2.put("version", (Object) "2.1.2");
            jSONObject.put("engine", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("model", (Object) Build.MODEL);
            jSONObject3.put("name", (Object) Build.PRODUCT);
            jSONObject3.put(g4.a.f2721a, (Object) Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject3.put("brand", (Object) Build.BRAND);
            jSONObject3.put("os", (Object) TimeCalculator.PLATFORM_ANDROID);
            jSONObject3.put("uuid", (Object) Build.SERIAL);
            jSONObject3.put("version", (Object) Build.VERSION.RELEASE);
            jSONObject.put("system", (Object) jSONObject3);
        } catch (Exception e) {
            tfs.d("setupSystemEngineEnv:" + e.getMessage());
        }
    }

    public static void l(Context context, JSONObject jSONObject) {
        boolean z;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f630", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            nxb h = od0.D().h();
            if (akt.P()) {
                z = h.b(context);
            } else {
                z = h.a(context);
            }
            if (z) {
                str = ThemeUtils.COLOR_SCHEME_DARK;
            } else {
                str = "";
            }
            jSONObject2.put("name", (Object) str);
            jSONObject2.put(sse.IN_SHOP_ELDER_HIT_VALUE, (Object) Boolean.valueOf(od0.D().A().a()));
            jSONObject2.put("versionCode", (Object) od0.D().A().getVersionCode());
            jSONObject.put("theme", (Object) jSONObject2);
        } catch (Exception e) {
            tfs.d("setupThemeEnv:" + e.getMessage());
        }
    }

    public static void m(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb91d374", new Object[]{context, jSONObject, jSONObject2});
        } else if (jSONObject2 != null) {
            if (jSONObject == null) {
                jSONObject = jSONObject2.getJSONObject(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
            }
            if (od0.D().i() != null) {
                try {
                    jSONObject.put("deviceInfo", (Object) od0.D().i().m(context));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void n(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5d7cda", new Object[]{context, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
        if (jSONObject2 == null) {
            jSONObject2 = j(context, jSONObject);
        }
        try {
            int f = f(context);
            jSONObject2.put("navigationH", (Object) Integer.valueOf(f));
            jSONObject2.put("navigationHeight", (Object) Integer.valueOf(f));
        } catch (Exception e) {
            tfs.d("updateNavigationH:" + e.getMessage());
        }
    }

    public static int[] e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4abee0c9", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new int[]{0, 0};
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
        return new int[]{nwv.t(jSONObject2.get("width"), 0), nwv.t(jSONObject2.get("height"), 0)};
    }

    public static void i(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604c21bd", new Object[]{context, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tdiffer", (Object) Boolean.valueOf(akt.p2("enabledTDiffer3", true)));
            jSONObject2.put("dataformat", (Object) Boolean.valueOf(akt.p2("enabledDataFormat", true)));
            jSONObject2.put("eventversion", (Object) Integer.valueOf(akt.w2("eventVersion", 0)));
            jSONObject2.put("enableExpandableView", (Object) Boolean.valueOf(akt.G()));
            jSONObject2.put("enableErrorWidget", (Object) Boolean.TRUE);
            jSONObject.put("config", (Object) jSONObject2);
        } catch (Exception e) {
            tfs.d("setupConfigEnv:" + e.getMessage());
        }
    }
}
