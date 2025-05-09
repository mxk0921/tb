package com.alipay.android.app.selftest;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.util.Pair;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ui.ImageLoader;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.ResUtils;
import com.alipay.mobile.common.rpc.EmptyRpcInvokeContext;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SelfTestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f3496a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class DepInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
            }
            try {
                return BirdNestEngine.getVersion();
            } catch (Throwable unused) {
                return "unknown";
            }
        }

        public static /* synthetic */ String access$600() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("582c4343", new Object[0]);
            }
            return a();
        }

        public static /* synthetic */ String access$700() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("542dd222", new Object[0]);
            }
            return b();
        }

        public static String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
            }
            try {
                return AppInfo.getInstance().getViSdkVersion();
            } catch (Throwable unused) {
                return "unknown";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class FuncInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
            }
            try {
                EmptyRpcInvokeContext.getInstance().setAppKey("");
                return "true";
            } catch (NoClassDefFoundError | NoSuchMethodError unused) {
                return "false";
            } catch (Throwable unused2) {
                return "unknown";
            }
        }

        public static /* synthetic */ String access$800() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("502f6101", new Object[0]);
            }
            return a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class PkgInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static String a() {
            ApplicationInfo applicationInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
            }
            try {
                Context context = GlobalHelper.getInstance().getContext();
                if (context == null || (applicationInfo = context.getApplicationInfo()) == null) {
                    return "unknown";
                }
                return String.valueOf(applicationInfo.targetSdkVersion);
            } catch (Throwable unused) {
                return "unknown";
            }
        }

        public static /* synthetic */ String access$300() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
            }
            return a();
        }

        public static /* synthetic */ String access$400() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
            }
            return b();
        }

        public static /* synthetic */ String access$500() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c2ab464", new Object[0]);
            }
            return c();
        }

        public static String b() {
            boolean is64Bit;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]);
            }
            try {
                if (Build.VERSION.SDK_INT < 23) {
                    return "unknown";
                }
                is64Bit = Process.is64Bit();
                return String.valueOf(is64Bit);
            } catch (Throwable unused) {
                return "unknown";
            }
        }

        public static String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]);
            }
            try {
                return GlobalHelper.getInstance().getPackageInfo().packageName;
            } catch (Throwable unused) {
                return "unknown";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ResInfoTests {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f277e371", new Object[]{str, str2})).intValue();
            }
            try {
                Context context = GlobalHelper.getInstance().getContext();
                if (context != null) {
                    return ResUtils.getResourceId(context, str, str2);
                }
                return -1;
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return -1;
            }
        }

        public static /* synthetic */ Pair access$100(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("62ef444c", new Object[]{str});
            }
            return b(str);
        }

        public static /* synthetic */ int access$200(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5e87ea80", new Object[]{str, str2})).intValue();
            }
            return a(str, str2);
        }

        public static Pair<String, String> b(String str) {
            int imageResId;
            Pair<String, String> pair;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("f5610200", new Object[]{str});
            }
            Pair<String, String> pair2 = new Pair<>("", "");
            try {
                Context context = GlobalHelper.getInstance().getContext();
                if (context == null || (imageResId = ImageLoader.getInstance().getImageResId(str)) == 0) {
                    return pair2;
                }
                Drawable drawable = context.getResources().getDrawable(imageResId);
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    pair = new Pair<>(String.valueOf(bitmap.getWidth()), String.valueOf(bitmap.getHeight()));
                } else if (drawable == null) {
                    return pair2;
                } else {
                    pair = new Pair<>(String.valueOf(drawable.getIntrinsicWidth()), String.valueOf(drawable.getIntrinsicHeight()));
                }
                return pair;
            } catch (Throwable unused) {
                return pair2;
            }
        }

        public static int idResFromCashier(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d7cd30c", new Object[]{str, str2, str3})).intValue();
            }
            if (str3 == null) {
                try {
                    str3 = GlobalHelper.getInstance().getContext().getPackageName();
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    return -1;
                }
            }
            return com.alipay.android.msp.utils.ResUtils.getResourceId(str, str2, str3);
        }

        public static int idResFromSafepay(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d173563a", new Object[]{str, str2})).intValue();
            }
            try {
                Context context = GlobalHelper.getInstance().getContext();
                if (context != null) {
                    return com.alipay.android.app.safepaybase.util.ResUtils.getResourceId(context, str, str2);
                }
                return -1;
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return -1;
            }
        }
    }

    public static /* synthetic */ void access$000() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            b();
        }
    }

    public static synchronized void b() throws Exception {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (f()) {
                LogUtil.record(2, "STM.startSelfTestSync", "mem done");
            } else if (i()) {
                LogUtil.record(2, "STM.startSelfTestSync", "spref done");
                e();
            } else {
                h();
                e();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                d(jSONObject2, "target", PkgInfoTests.access$300());
                d(jSONObject2, "is_64_bit", PkgInfoTests.access$400());
                d(jSONObject2, "app_name", PkgInfoTests.access$500());
                d(jSONObject2, "sdk_ver", GlobalSdkConstant.getMspVersion());
                LogUtil.record(2, "STM.testBasicInfo", "basic -> ".concat(String.valueOf(jSONObject2)));
                d(jSONObject, "basic_info", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                d(jSONObject3, "BirdNest", DepInfoTests.access$600());
                d(jSONObject3, "VISDK", DepInfoTests.access$700());
                LogUtil.record(2, "STM.testDependencyInfo", "dependency -> ".concat(String.valueOf(jSONObject3)));
                d(jSONObject, "dependency", jSONObject3);
                JSONObject jSONObject4 = new JSONObject();
                d(jSONObject4, "RPCSDK.setAppKey", FuncInfoTests.access$800());
                LogUtil.record(2, "STM.testFuncInfo", "dependency -> ".concat(String.valueOf(jSONObject4)));
                d(jSONObject, "func", jSONObject4);
                JSONArray jSONArray = new JSONArray();
                c(jSONArray, g("com.alipay.android.app/alipay_msp_arrow_left"));
                c(jSONArray, g("com.alipay.android.app/alipay_msp_close"));
                c(jSONArray, g("com.alipay.android.app/alipay_msp_rmb"));
                c(jSONArray, g("AlipaySDK.bundle/alipay_msp_check"));
                c(jSONArray, g("com.alipay.android.app/alipay_substitute_user_corner_bg"));
                d(jSONObject, "resource_detect", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                c(jSONArray2, a(1, "year_up_btn", "id", null));
                c(jSONArray2, a(2, "alipay_msp_tag_view_holder", "id", "com.alipay.android.app.template"));
                c(jSONArray2, a(3, "year_down_btn", "id", null));
                d(jSONObject, "id_detect", jSONArray2);
                String replace = jSONObject.toString().replace("#", "#0").replace(",", "#1");
                LogUtil.record(2, "STM.startSelfTestSync", "report content: ".concat(String.valueOf(replace)));
                EventLogUtil.logPayEvent("1010914", "info", replace);
            }
        }
    }

    public static void c(JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8566c5e", new Object[]{jSONArray, obj});
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Throwable unused) {
        }
    }

    public static void d(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f61e7c", new Object[]{jSONObject, str, obj});
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public static synchronized void e() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            } else {
                f3496a.set(true);
            }
        }
    }

    public static synchronized boolean f() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
            }
            return f3496a.get();
        }
    }

    public static JSONObject g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("df1cfc63", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        d(jSONObject, "name", str);
        Pair access$100 = ResInfoTests.access$100(str);
        d(jSONObject, "width", access$100.first);
        d(jSONObject, "height", access$100.second);
        LogUtil.record(2, "STM.testImageResource", "img -> ".concat(String.valueOf(jSONObject)));
        return jSONObject;
    }

    public static synchronized void h() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[0]);
                return;
            }
            int i = GlobalHelper.getInstance().getPackageInfo().versionCode;
            LogUtil.record(2, "STM.setSPrefTested", "tested <- ".concat(String.valueOf(i)));
            PrefUtils.putInt("cashier_test_info", "tested_max_app_version", Integer.valueOf(i));
        }
    }

    public static synchronized boolean i() {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
            }
            int i = GlobalHelper.getInstance().getPackageInfo().versionCode;
            Integer num = PrefUtils.getInt("cashier_test_info", "tested_max_app_version", 0);
            LogUtil.record(2, "STM.getSPrefTested", "tested = " + num + ", current = " + i);
            return num.intValue() >= i;
        }
    }

    public static synchronized void triggerSelfTestAsync(Context context) {
        synchronized (SelfTestManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc1a469b", new Object[]{context});
            } else if (context != null) {
                final Context applicationContext = context.getApplicationContext();
                if (!DrmManager.getInstance(applicationContext).isGray(DrmKey.DEGRADE_SDK_RUNTIME_INFO_DETECT, false, applicationContext)) {
                    long j = 10;
                    com.alibaba.fastjson.JSONObject drmValueFromKey = DrmManager.getInstance(applicationContext).getDrmValueFromKey(DrmKey.CONFIG_SDK_RUNTIME_INFO_DETECT_DELAY_IN_SECOND);
                    if (drmValueFromKey != null && drmValueFromKey.containsKey("delay")) {
                        j = drmValueFromKey.getLongValue("delay");
                    }
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.selftest.SelfTestManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                GlobalHelper.getInstance().init(applicationContext);
                                SelfTestManager.access$000();
                            } catch (Throwable th) {
                                LogUtil.record(8, "STM.triggerSelfTestAsync", "task error");
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    }, TimeUnit.SECONDS.toMillis(j));
                }
            }
        }
    }

    public static JSONObject a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d7814da7", new Object[]{new Integer(i), str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        d(jSONObject, "name", str2 + "/" + str);
        if (i == 1) {
            d(jSONObject, "id", Integer.valueOf(ResInfoTests.access$200(str, str2)));
        } else if (i == 2) {
            d(jSONObject, "id", Integer.valueOf(ResInfoTests.idResFromCashier(str, str2, str3)));
        } else if (i == 3) {
            d(jSONObject, "id", Integer.valueOf(ResInfoTests.idResFromSafepay(str, str2)));
        }
        return jSONObject;
    }
}
