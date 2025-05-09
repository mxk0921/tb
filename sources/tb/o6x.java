package tb;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.sku.weex.SkuPreloadModule;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o6x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PRE_WEEX_SIZE = 2;
    public static final String TAG = "WeexInstancePreloader";
    public static boolean b;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f25173a = new HashMap();
    public static final Map<String, Map<String, MUSDKInstance>> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements lce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25174a;

        public a(Context context) {
            this.f25174a = context;
        }

        @Override // tb.lce
        public Rect computeCurrentScreenMetrics() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this});
            }
            return all.INSTANCE.d(this.f25174a);
        }
    }

    static {
        t2o.a(442499297);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
            return;
        }
        SkuPreloadModule.clearPreloadInstanceStatus();
        b.f().a();
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773880f", new Object[]{str});
        } else if (b) {
            a();
            l(str);
            m(str);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f3d1cb9", new Object[0])).booleanValue();
        }
        return o2q.c("enable_weex_preload_opt");
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc3e21f", new Object[]{str, str2});
        }
        String str3 = "";
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str3;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("id");
        if (TextUtils.isEmpty(queryParameter)) {
            return str3;
        }
        String path = parse.getPath();
        if (TextUtils.isEmpty(path)) {
            return str3;
        }
        boolean equals = "true".equals(parse.getQueryParameter("buy_button"));
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(queryParameter);
        if (equals) {
            str3 = "_isBuyButton";
        }
        sb.append(str3);
        return sb.toString();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("340b6901", new Object[0])).booleanValue();
        }
        AliConfigInterface b2 = yo0.b();
        if (b2 == null) {
            return false;
        }
        return Boolean.parseBoolean(b2.getConfig("android_sku", "is_weex_preload_open", "true"));
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8725277a", new Object[]{str, str2});
            return;
        }
        String d = d(str, str2);
        if (!TextUtils.isEmpty(d)) {
            Map<String, String> map = f25173a;
            if (((HashMap) map).containsKey(d)) {
                SkuLogUtils.l(TAG, "notifyWeexCreatedBeforePreload instanceId has created " + d);
                return;
            }
            ((HashMap) map).put(d, str2);
        }
    }

    public static String k(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c65060a", new Object[]{context, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("_sku_token_", str2).appendQueryParameter("hit_sku_preload", "true");
        all allVar = all.INSTANCE;
        String c2 = allVar.c(context);
        if (c2 != null && allVar.f(context)) {
            buildUpon.appendQueryParameter(k7m.KEY_DEVICE_TYPE, c2);
        }
        return buildUpon.build().toString();
    }

    public static void l(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e133c8", new Object[]{str});
        } else if (!TextUtils.isEmpty(str) && (map = f25173a) != null && !((HashMap) map).isEmpty()) {
            Iterator it = ((HashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, (CharSequence) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                }
            }
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b20874", new Object[]{str});
        } else {
            ((HashMap) c).remove(str);
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cbd0a4d", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("enable_sku_preload");
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return Boolean.parseBoolean(queryParameter);
        } catch (Throwable th) {
            SkuLogUtils.j("isWeexPreload fail", th.toString());
            return false;
        }
    }

    public static void i(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2404c25", new Object[]{context, str, str2, str3});
        } else if (c()) {
            try {
                MUSDKInstance e = e(context, str2, str3);
                if (e != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timeStamp", (Object) String.valueOf(System.currentTimeMillis()));
                    e.fireEvent(0, str, jSONObject);
                }
            } catch (Exception e2) {
                SkuLogUtils.i("postOnButtonClick error : " + e2);
            }
        }
    }

    public static MUSDKInstance e(Context context, String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("d9e93fd4", new Object[]{context, str, str2});
        }
        SkuLogUtils.j(TAG, "getPreloadedInstance " + str2);
        MUSDKInstance mUSDKInstance = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!f(str) || !b) {
                return null;
            }
            HashMap hashMap = (HashMap) c;
            Map map = (Map) hashMap.get(str2);
            if (map == null || map.get(str) == null) {
                String k = k(context, str, str2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) k);
                String d = d(str, str2);
                if (TextUtils.isEmpty(d)) {
                    return null;
                }
                mUSDKInstance = b.f().e(d, jSONObject);
                StringBuilder sb = new StringBuilder("getPreloadedInstance result ");
                if (mUSDKInstance == null) {
                    z = false;
                }
                sb.append(z);
                SkuLogUtils.j(TAG, sb.toString());
                if (mUSDKInstance == null) {
                    SkuLogUtils.a(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance is null");
                }
                SkuLogUtils.u(d, str);
                if (mUSDKInstance != null && c()) {
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(str2, map);
                    }
                    map.put(str, mUSDKInstance);
                }
            } else {
                SkuLogUtils.j(TAG, "has getPreloadedInstance, url : " + str + " uniqueId : " + str2);
                return (MUSDKInstance) map.get(str);
            }
        }
        return mUSDKInstance;
    }

    public static void j(Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4953e47a", new Object[]{context, str, str2, jSONObject});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        SkuLogUtils.l(TAG, "preloadWeexInstance start " + str2 + ",url = " + str);
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && jSONObject != null && f(str)) {
            boolean g = g();
            b = g;
            if (g) {
                String d = d(str, str2);
                if (!TextUtils.isEmpty(d)) {
                    HashMap hashMap = (HashMap) f25173a;
                    if (hashMap.containsKey(d)) {
                        SkuLogUtils.l(TAG, "preloadWeexInstance has created " + d);
                        return;
                    }
                    hashMap.put(d, str2);
                    if (SkuPreloadModule.cacheSize() > 2) {
                        a();
                    }
                    SkuPreloadModule.registerModule();
                    MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                    mUSInstanceConfig.B(true);
                    mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
                    mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
                    mUSInstanceConfig.v(false);
                    mUSInstanceConfig.E(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage);
                    if (all.INSTANCE.f(context)) {
                        mUSInstanceConfig.q(new a(context));
                    }
                    String k = k(context, str, str2);
                    JSONObject jSONObject2 = new JSONObject();
                    if (c()) {
                        jSONObject.put("tradeParamStr", (Object) q3q.a(context));
                    }
                    jSONObject2.put("bizName", (Object) d);
                    jSONObject2.put("bundleUrl", (Object) k);
                    jSONObject2.put("initData", (Object) jSONObject);
                    b.f().g(context, mUSInstanceConfig, jSONObject2, 0, 0);
                    SkuLogUtils.v(d, str, SystemClock.uptimeMillis() - uptimeMillis);
                    SkuLogUtils.l(TAG, "preloadWeexInstance end " + str2);
                }
            }
        }
    }
}
