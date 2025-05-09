package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final jvr f22247a = new jvr();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22248a;

        public a(jvr jvrVar, String str) {
            this.f22248a = str;
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            Log.e("ShopRouterInit", "orange change : " + str + ", pkgName = " + this.f22248a);
            if ("shop_router".equals(str) && this.f22248a.contains("com.taobao.taobao")) {
                myr.e().j();
            }
        }
    }

    static {
        t2o.a(668991538);
    }

    public static boolean B(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdd879e", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (!isEnabled || !isTouchExplorationEnabled) {
            return false;
        }
        return true;
    }

    public static jvr p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvr) ipChange.ipc$dispatch("b985a704", new Object[0]);
        }
        return f22247a;
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7063b729", new Object[]{context})).booleanValue();
        }
        try {
            return B(context);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("201df98b", new Object[]{this})).booleanValue();
        }
        return l("memoryCacheEnabled", true);
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1373c251", new Object[]{this})).booleanValue();
        }
        return l("accessibility_SWITCH", true);
    }

    public void E(Application application) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772b8035", new Object[]{this, application});
            return;
        }
        if (application == null) {
            str = "";
        } else {
            str = application.getPackageName();
        }
        OrangeConfig.getInstance().registerListener(new String[]{"shop_router"}, new a(this, str));
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51338629", new Object[]{this})).booleanValue();
        }
        return l("delete_we_app_switch", true);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aea4921", new Object[]{this})).booleanValue();
        }
        return l("enableABTest", false);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6144d107", new Object[]{this})).booleanValue();
        }
        return l("enableAsyncWriteCache", true);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8be1f326", new Object[]{this})).booleanValue();
        }
        return l("enableNewTaoKeApi", true);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9424c4", new Object[]{this})).booleanValue();
        }
        return l("enableNotRemoveShopNav", true);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b7ed7", new Object[]{this})).booleanValue();
        }
        return l("enablePostRequest", true);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9405a000", new Object[]{this})).booleanValue();
        }
        return l("enableRouteCycleFix", true);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc4224c9", new Object[]{this})).booleanValue();
        }
        return l("enableShopDomainKeyIntercept", true);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2341161", new Object[]{this})).booleanValue();
        }
        return l("enableUTParamDelete", true);
    }

    public final boolean l(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b098d3e8", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return Boolean.valueOf(o(str, Boolean.toString(z))).booleanValue();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d733f4cb", new Object[]{this});
        }
        return o("cdnUrl", "");
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d31f5a27", new Object[]{this});
        }
        return o("md5", "");
    }

    public final String o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c33b870", new Object[]{this, str, str2});
        }
        return OrangeConfig.getInstance().getConfig("shop_router", str, str2);
    }

    public final JSONArray q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("138b0463", new Object[]{this, str});
        }
        JSONArray jSONArray = new JSONArray();
        String o = o(str, null);
        if (TextUtils.isEmpty(o)) {
            return jSONArray;
        }
        try {
            JSONArray parseArray = JSON.parseArray(o);
            if (parseArray == null) {
                return jSONArray;
            }
            return parseArray;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONArray;
        }
    }

    public long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("337b4317", new Object[]{this})).longValue();
        }
        return t("localCacheValidMinute", 60L);
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97fefc8c", new Object[]{this})).longValue();
        }
        return t("localCacheValidMinute_mini_app", 60L);
    }

    public final long t(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45ecec49", new Object[]{this, str, new Long(j)})).longValue();
        }
        String o = o(str, String.valueOf(j));
        try {
            return Long.parseLong(o);
        } catch (Throwable unused) {
            mvr.d("orange key=" + str + " might be number but it is " + o);
            return j;
        }
    }

    public List<String> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("73ebf576", new Object[]{this});
        }
        String o = o("private_window_whitelist", "");
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        String[] split = o.split(",");
        if (split.length > 0) {
            return Arrays.asList(split);
        }
        return null;
    }

    public JSONArray v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c0fe4c13", new Object[]{this});
        }
        return q("shopRouterDomainBlackList");
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef1fc0f5", new Object[]{this})).booleanValue();
        }
        return l("local_js_enabled", true);
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb036880", new Object[]{this})).booleanValue();
        }
        if (!D() || !w(lvr.b)) {
            return l("miniappDowngrade", false);
        }
        return true;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f19c143", new Object[]{this})).booleanValue();
        }
        return l("private_window_enabled", true);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d071a6a", new Object[]{this})).booleanValue();
        }
        return l("useCache", true);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d4451a", new Object[]{this})).booleanValue();
        }
        return l("useHandlerThreadWorker", true);
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80f5ca85", new Object[]{this})).booleanValue();
        }
        return l("parallel_render_enabled", true);
    }
}
