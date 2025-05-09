package tb;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.SilentChangeAppIconActivity;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconMtopResponse;
import com.taobao.android.change.app.icon.mtop.ChangeAppIconRequest;
import com.taobao.android.change.app.icon.utils.MtopUtils;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qh3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIcon";

    /* renamed from: a  reason: collision with root package name */
    public static Application f26749a;
    public static Map<String, AppIconComponentName> b;
    public static AppIconComponentName c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements wh3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wh3
        public void a(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ecbbf69", new Object[]{this, changeAppIconMtopResponse});
            } else {
                c();
            }
        }

        @Override // tb.wh3
        public void b(ChangeAppIconMtopResponse changeAppIconMtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6a7254e", new Object[]{this, changeAppIconMtopResponse});
            } else {
                c();
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45231709", new Object[]{this});
                return;
            }
            AdapterForTLog.loge(qh3.TAG, "checkChangeAppIconIsRestart clear infos");
            faq.f().o("");
        }
    }

    static {
        t2o.a(284164111);
    }

    public static void a(AppIconComponentName... appIconComponentNameArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dabac966", new Object[]{appIconComponentNameArr});
        } else if (appIconComponentNameArr != null && appIconComponentNameArr.length > 0) {
            for (AppIconComponentName appIconComponentName : appIconComponentNameArr) {
                b.put(appIconComponentName.iconName, appIconComponentName);
                AdapterForTLog.loge(TAG, "launchEntry Alias:" + appIconComponentName.iconName);
            }
        }
    }

    public static void b(int i) {
        k1s k1sVar;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e359d688", new Object[]{new Integer(i)});
            return;
        }
        try {
            UncaughtCrashManager manager = TCrashSDK.instance().getManager();
            if (manager instanceof k1s) {
                k1sVar = (k1s) manager;
            } else {
                k1sVar = null;
            }
            if (k1sVar != null) {
                AppIconComponentName l = l(k());
                AppIconComponentName r = r();
                k1sVar.a("currentAppIcon", l.toString());
                if (r == null) {
                    str = "null";
                } else {
                    str = r.toString();
                }
                k1sVar.a("expectAppIcon", str);
                k1sVar.a("enableAppIcons", Integer.valueOf(i));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void d(AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12ae600", new Object[]{appIconComponentName});
        } else {
            vh3.f().c(j("NOW", appIconComponentName, ""));
        }
    }

    public static void e(AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ece7656", new Object[]{appIconComponentName});
        } else {
            vh3.f().c(j("BG", appIconComponentName, ""));
        }
    }

    public static void f(Context context, AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94c1faf", new Object[]{context, appIconComponentName});
        } else {
            g(context, j("SILENT", appIconComponentName, ""));
        }
    }

    public static void g(Context context, ChangeAppIconJSModel changeAppIconJSModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ecba407", new Object[]{context, changeAppIconJSModel});
            return;
        }
        Intent intent = new Intent(f26749a, SilentChangeAppIconActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        intent.putExtra(SilentChangeAppIconActivity.KEY_CHANGE_APP_ICON_DATA, JSON.toJSONString(changeAppIconJSModel));
        context.startActivity(intent);
    }

    public static void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f7e844", new Object[]{new Boolean(z)});
            return;
        }
        int p = p(k());
        AdapterForTLog.loge(TAG, "changeDefaultAppIcon size:" + p + " now:" + z);
        t4v.a(t4v.PAGE_NAME, "changeDefaultAppIcon", "enableComponentNameSize:" + p + " now:" + z, "default:" + c.toString(), null);
        AppIconComponentName appIconComponentName = c;
        int i = appIconComponentName.state;
        if (i == 1 || i == 0) {
            AdapterForTLog.loge(TAG, "now icon is default,return");
        } else if (z) {
            d(appIconComponentName);
        } else {
            e(appIconComponentName);
        }
    }

    public static void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa705dd9", new Object[]{new Integer(i)});
            return;
        }
        boolean z = faq.f().g().getBoolean(ubl.ORANGE_KEY_CHANGE_APP_ICON_CHECK_IS_RESTART_REPORT, true);
        String h = faq.f().h();
        AdapterForTLog.loge(TAG, "checkChangeAppIconIsRestart open:" + z + " infos:" + h);
        ChangeAppIconJSModel changeAppIconJSModel = (ChangeAppIconJSModel) hxv.g(h, ChangeAppIconJSModel.class);
        if (z && changeAppIconJSModel != null && !TextUtils.isEmpty(changeAppIconJSModel.iconName)) {
            ChangeAppIconRequest changeAppIconRequest = new ChangeAppIconRequest(changeAppIconJSModel.iconName, "TIMEOUT", i);
            changeAppIconRequest.setChangeType(changeAppIconJSModel);
            changeAppIconRequest.setKilled(true);
            t4v.a(t4v.PAGE_NAME, "change_happen_restart", changeAppIconRequest.toString(), null, null);
            MtopUtils.f(changeAppIconRequest, new b());
        }
    }

    public static ChangeAppIconJSModel j(String str, AppIconComponentName appIconComponentName, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeAppIconJSModel) ipChange.ipc$dispatch("2c520fa8", new Object[]{str, appIconComponentName, str2});
        }
        a(appIconComponentName);
        ChangeAppIconJSModel changeAppIconJSModel = new ChangeAppIconJSModel();
        changeAppIconJSModel.iconName = appIconComponentName.iconName;
        changeAppIconJSModel.changeType = str;
        changeAppIconJSModel.crash = str2;
        return changeAppIconJSModel;
    }

    public static Application k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return f26749a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        com.taobao.tlog.adapter.AdapterForTLog.loge(tb.qh3.TAG, "getCurrentAppIconComponentName match expect:" + r4.iconName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.change.app.icon.model.AppIconComponentName l(android.content.Context r7) {
        /*
            r0 = 1
            java.lang.String r1 = "ChangeAppIcon"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.qh3.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0017
            java.lang.String r1 = "bf0e6f91"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r1, r0)
            com.taobao.android.change.app.icon.model.AppIconComponentName r7 = (com.taobao.android.change.app.icon.model.AppIconComponentName) r7
            return r7
        L_0x0017:
            com.taobao.android.change.app.icon.model.AppIconComponentName r2 = n()
            java.util.List r7 = o(r7)     // Catch: Exception -> 0x005a
            com.taobao.android.change.app.icon.model.AppIconComponentName r3 = r()     // Catch: Exception -> 0x005a
            java.util.Iterator r7 = r7.iterator()     // Catch: Exception -> 0x005a
        L_0x0027:
            boolean r4 = r7.hasNext()     // Catch: Exception -> 0x005a
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r7.next()     // Catch: Exception -> 0x005a
            com.taobao.android.change.app.icon.model.AppIconComponentName r4 = (com.taobao.android.change.app.icon.model.AppIconComponentName) r4     // Catch: Exception -> 0x005a
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = r4.iconName     // Catch: Exception -> 0x005a
            java.lang.String r6 = r3.iconName     // Catch: Exception -> 0x005a
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch: Exception -> 0x005a
            if (r5 == 0) goto L_0x005c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: Exception -> 0x0057
            r7.<init>()     // Catch: Exception -> 0x0057
            java.lang.String r0 = "getCurrentAppIconComponentName match expect:"
            r7.append(r0)     // Catch: Exception -> 0x0057
            java.lang.String r0 = r4.iconName     // Catch: Exception -> 0x0057
            r7.append(r0)     // Catch: Exception -> 0x0057
            java.lang.String r7 = r7.toString()     // Catch: Exception -> 0x0057
            com.taobao.tlog.adapter.AdapterForTLog.loge(r1, r7)     // Catch: Exception -> 0x0057
            r2 = r4
            goto L_0x0062
        L_0x0057:
            r7 = move-exception
            r2 = r4
            goto L_0x0079
        L_0x005a:
            r7 = move-exception
            goto L_0x0079
        L_0x005c:
            int r5 = r4.state     // Catch: Exception -> 0x005a
            if (r5 != r0) goto L_0x0027
            r2 = r4
            goto L_0x0027
        L_0x0062:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: Exception -> 0x005a
            r7.<init>()     // Catch: Exception -> 0x005a
            java.lang.String r0 = "getCurrentAppIconComponentName result:"
            r7.append(r0)     // Catch: Exception -> 0x005a
            java.lang.String r0 = r2.iconName     // Catch: Exception -> 0x005a
            r7.append(r0)     // Catch: Exception -> 0x005a
            java.lang.String r7 = r7.toString()     // Catch: Exception -> 0x005a
            com.taobao.tlog.adapter.AdapterForTLog.loge(r1, r7)     // Catch: Exception -> 0x005a
            goto L_0x0081
        L_0x0079:
            r7.printStackTrace()
            java.lang.String r0 = "getCurrentAppIconComponentName error:"
            com.taobao.tlog.adapter.AdapterForTLog.loge(r1, r0, r7)
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qh3.l(android.content.Context):com.taobao.android.change.app.icon.model.AppIconComponentName");
    }

    public static List<AppIconComponentName> m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a09c03e0", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        q(context);
        for (Map.Entry<String, AppIconComponentName> entry : s().entrySet()) {
            AppIconComponentName value = entry.getValue();
            if (value.state == 0) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    public static AppIconComponentName n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppIconComponentName) ipChange.ipc$dispatch("d34da13", new Object[0]);
        }
        return c;
    }

    public static List<AppIconComponentName> o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b540b32", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        q(context);
        for (Map.Entry<String, AppIconComponentName> entry : s().entrySet()) {
            AppIconComponentName value = entry.getValue();
            if (value.state == 1) {
                arrayList.add(value);
            }
        }
        if (n().state == 0) {
            arrayList.add(n());
        }
        if (arrayList.isEmpty()) {
            arrayList.add(n());
        }
        return arrayList;
    }

    public static int p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7345144", new Object[]{context})).intValue();
        }
        return q(context).size();
    }

    public static List<ComponentName> q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bd08f62a", new Object[]{context});
        }
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        for (Map.Entry<String, AppIconComponentName> entry : s().entrySet()) {
            AppIconComponentName value = entry.getValue();
            ComponentName componentName = new ComponentName(context, value.clzPath);
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            value.state = componentEnabledSetting;
            if (componentEnabledSetting == 1) {
                arrayList.add(componentName);
            }
            AdapterForTLog.loge(TAG, "getEnableLaunchers name:" + value.iconName + " state:" + value.state);
        }
        return arrayList;
    }

    public static AppIconComponentName r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppIconComponentName) ipChange.ipc$dispatch("7b4171c5", new Object[0]);
        }
        AppIconComponentName n = n();
        try {
            n = (AppIconComponentName) hxv.g(faq.f().g().getString(faq.SP_KEY_EXPECT_APP_ICON_MODEL, ""), AppIconComponentName.class);
        } catch (Exception e) {
            e.printStackTrace();
            AdapterForTLog.loge(TAG, "getExpectAppIconModel error:", e);
        }
        if (n == null) {
            return n();
        }
        return n;
    }

    public static Map<String, AppIconComponentName> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5973a13c", new Object[0]);
        }
        return b;
    }

    public static void v(AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ddc75c6", new Object[]{appIconComponentName});
            return;
        }
        try {
            faq.f().l(faq.SP_KEY_EXPECT_APP_ICON_MODEL, JSON.toJSONString(appIconComponentName)).a();
        } catch (Exception e) {
            e.printStackTrace();
            AdapterForTLog.loge(TAG, "saveExpectAppIconModel error:", e);
        }
    }

    public static void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7275515e", new Object[0]);
            return;
        }
        AdapterForTLog.loge(TAG, "updateOrange");
        OrangeConfig.getInstance().getConfigs(ubl.NAMESPACE_DEFAULT);
        OrangeConfig.getInstance().registerListener(new String[]{ubl.NAMESPACE_DEFAULT}, new a(), true);
    }

    public static void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8972e0f9", new Object[]{new Integer(i)});
            return;
        }
        int i2 = faq.f().g().getInt(ubl.ORANGE_KEY_CHANGE_APP_ICON_INIT_REPORT, 0);
        boolean e = hxv.e(i2);
        AdapterForTLog.loge(TAG, "reportInitByMtop change_app_icon_init_report:" + i2 + " open:" + e);
        if (e) {
            MtopUtils.f(new ChangeAppIconRequest("", ModuleConstants.VI_MODULE_NAME_INIT, i), null);
        }
    }

    public static boolean t(Application application, boolean z, AppIconComponentName appIconComponentName, AppIconComponentName... appIconComponentNameArr) {
        boolean z2;
        long currentTimeMillis;
        Throwable th;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8ea22c5", new Object[]{application, new Boolean(z), appIconComponentName, appIconComponentNameArr})).booleanValue();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            f26749a = application;
            z3 = faq.f().g().getBoolean(ubl.ORANGE_KEY_CHANGE_APP_ICON_CAN_INIT, true);
            AdapterForTLog.loge(TAG, "init canInit:" + z3 + " start:" + currentTimeMillis2);
        } catch (Throwable th2) {
            th = th2;
        }
        if (!z3) {
            AdapterForTLog.loge(TAG, "init canInit:" + z3 + " return");
            return false;
        }
        c = appIconComponentName;
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(appIconComponentName.iconName, appIconComponentName);
        AdapterForTLog.loge(TAG, "init launchEntry Alias:" + c.iconName);
        AdapterForTLog.loge(TAG, "init deviceBrand:" + Build.BRAND + " deviceModel:" + Build.MODEL + " osVersion:" + Build.VERSION.RELEASE + " harmonyVersion:" + hxv.a());
        a(appIconComponentNameArr);
        List<AppIconComponentName> o = o(application);
        int size = o.size();
        List<AppIconComponentName> m = m(application);
        AppIconComponentName l = l(application);
        AppIconComponentName r = r();
        StringBuilder sb = new StringBuilder("init enableStateIcons:");
        sb.append(o.size());
        sb.append(" defaultStateIcons:");
        sb.append(m.size());
        sb.append(" currentIcon:");
        String str = "null";
        sb.append(l == null ? str : l.iconName);
        sb.append(" expectIcon:");
        if (r != null) {
            str = r.iconName;
        }
        sb.append(str);
        AdapterForTLog.loge(TAG, sb.toString());
        if (size == 0) {
            AdapterForTLog.loge(TAG, "enableComponentNameSize is zero,defaultState:" + c.state);
            boolean z4 = c.state == 0;
            t4v.a(t4v.PAGE_NAME, "init", "first_install:" + z4, null, null);
            if (z4) {
                size = 1;
            }
        }
        w();
        vh3.f().i();
        if (z) {
            c(o, m, l, r);
        } else {
            try {
                if (faq.f().g().getBoolean(ubl.ORANGE_KEY_CHANGE_APP_SAFEMODE_CHANGE_TO_DEFAULT_ICON, false)) {
                    h(true);
                }
            } catch (Throwable th3) {
                th = th3;
                th.printStackTrace();
                AdapterForTLog.loge(TAG, "init error:", th);
                z2 = false;
                AdapterForTLog.loge(TAG, "init end:" + System.currentTimeMillis() + " cost(ms):" + (currentTimeMillis - currentTimeMillis2) + " result:" + z2);
                return z2;
            }
        }
        i(size);
        t4v.a(t4v.PAGE_NAME, "init", "enableComponentNameSize:" + size, "isMainProcess:" + z, null);
        u(size);
        b(size);
        z2 = true;
        AdapterForTLog.loge(TAG, "init end:" + System.currentTimeMillis() + " cost(ms):" + (currentTimeMillis - currentTimeMillis2) + " result:" + z2);
        return z2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (ubl.NAMESPACE_DEFAULT.equals(str)) {
                OrangeConfig.getInstance().unregisterListener(new String[]{ubl.NAMESPACE_DEFAULT}, this);
                String string = faq.f().g().getString(faq.SP_KEY_ORANGE_LAST_VERSION, "");
                String str2 = map.get("configVersion");
                AdapterForTLog.loge(qh3.TAG, "updateOrange namespace:" + str + " fromCache:" + map.get("fromCache") + " lastV:" + string + " newVersion:" + str2 + " infos:" + OrangeConfig.getInstance().getConfigs(str));
                if (!TextUtils.equals(str2, string)) {
                    boolean a2 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_ICON_CAN_INIT, "true");
                    boolean a3 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, "false");
                    int b = ubl.b(ubl.ORANGE_KEY_CHANGE_APP_ICON_INIT_REPORT, 0);
                    boolean a4 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG, "true");
                    boolean a5 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_ICON_REDRESS_DEFAULT_ICON_ENABLE, "false");
                    boolean a6 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_ICON_CHECK_IS_RESTART_REPORT, "true");
                    boolean a7 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_SAFEMODE_CHANGE_TO_DEFAULT_ICON, "false");
                    boolean a8 = ubl.a(ubl.ORANGE_KEY_CHANGE_APP_ICON_IN_BG_OPEN, "true");
                    faq.f().l(faq.SP_KEY_ORANGE_LAST_VERSION, str2).i(ubl.ORANGE_KEY_CHANGE_APP_ICON_CAN_INIT, a2).i(ubl.ORANGE_KEY_CHANGE_APP_ICON_TO_DEFAULT_IN_BG, a3).j(ubl.ORANGE_KEY_CHANGE_APP_ICON_INIT_REPORT, b).i(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG, a4).i(ubl.ORANGE_KEY_CHANGE_APP_ICON_REDRESS_DEFAULT_ICON_ENABLE, a5).i(ubl.ORANGE_KEY_CHANGE_APP_ICON_CHECK_IS_RESTART_REPORT, a6).i(ubl.ORANGE_KEY_CHANGE_APP_SAFEMODE_CHANGE_TO_DEFAULT_ICON, a7).i(ubl.ORANGE_KEY_CHANGE_APP_ICON_IN_BG_OPEN, a8).k(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_INTERVAL, ubl.c(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_INTERVAL, 86400000L)).j(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_MAX_ATTEMPT_COUNT, ubl.b(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG_MAX_ATTEMPT_COUNT, 2)).a();
                }
            }
        }
    }

    public static void c(List<AppIconComponentName> list, List<AppIconComponentName> list2, AppIconComponentName appIconComponentName, AppIconComponentName appIconComponentName2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c073471d", new Object[]{list, list2, appIconComponentName, appIconComponentName2});
            return;
        }
        int size = list.size();
        int size2 = list2.size();
        boolean z = faq.f().g().getBoolean(ubl.ORANGE_KEY_CHANGE_APP_ICON_AUTO_REPAIR_MORE_ICONS_IN_BG, false);
        boolean z2 = faq.f().g().getBoolean(ubl.ORANGE_KEY_CHANGE_APP_ICON_REDRESS_DEFAULT_ICON_ENABLE, false);
        AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg open:" + z + " enableComponentNameSize:" + size + " redressDefaultIconEnable:" + z2);
        if (z) {
            StringBuilder sb = new StringBuilder("autoRepairMoreAppIconsInBg attempt repair。 enableComponentNameSize:");
            sb.append(size);
            sb.append(" defaultComponentNameSize:");
            sb.append(size2);
            sb.append(" currentAppIconComponentName:");
            String str = "null";
            sb.append(appIconComponentName == null ? str : appIconComponentName.iconName);
            sb.append(" expectAppIconComponentName:");
            if (appIconComponentName2 != null) {
                str = appIconComponentName2.iconName;
            }
            sb.append(str);
            AdapterForTLog.loge(TAG, sb.toString());
            if (size > 1) {
                long currentTimeMillis = System.currentTimeMillis();
                long d = faq.f().d(0L);
                long c2 = faq.f().c();
                AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair,currentTimeMillis:" + currentTimeMillis + " autoRepairMoreIconsInBgLastTime:" + d + " interval:" + c2);
                StringBuilder sb2 = new StringBuilder("enableComponentNameSize:");
                sb2.append(size);
                t4v.a(t4v.PAGE_NAME, "auto_repair_more_icons_bg", sb2.toString(), "more_enable_icon", null);
                if (currentTimeMillis - d <= c2) {
                    AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair，but time interval not exceeded");
                    return;
                }
                int e = faq.f().e(2);
                int b2 = faq.f().b(0);
                AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair,maxAttemptCount:" + e + " historyAttemptCount:" + b2);
                if (b2 >= e) {
                    AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair，but historyAttemptCount >= maxAttemptCount");
                    return;
                }
                AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more enable icon repair start");
                faq.f().n(currentTimeMillis);
                faq.f().m(b2 + 1);
                e(appIconComponentName2);
            } else if (z2 && size == 1 && size2 > 0) {
                AdapterForTLog.loge(TAG, "autoRepairMoreAppIconsInBg more default icon repair");
                t4v.a(t4v.PAGE_NAME, "auto_repair_more_icons_bg", "enableComponentNameSize:" + size, "more_default_icon", null);
                e(appIconComponentName2);
            }
        }
    }
}
