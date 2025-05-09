package com.taobao.browser.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.pm.ShortcutManagerCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainActivity;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;
import tb.fm2;
import tb.gm2;
import tb.km2;
import tb.m7r;
import tb.mrw;
import tb.slo;
import tb.t2o;
import tb.vpw;
import tb.xpc;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BrowserUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_LIMIT = 10000;
    public static final String KEY_QUERY_MULTI_PROCESS = "browser_multiProcess";

    /* renamed from: a  reason: collision with root package name */
    public static final String f10259a = xpc.RECORD_EXECUTE;
    public static final String b = "onCreate";
    public static final String c = "deprecated_class";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum PhoneClass {
        Level0,
        Level1,
        Level2,
        Level3,
        Level4,
        Level5,
        UNKNOWN;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PhoneClass phoneClass, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/utils/BrowserUtil$PhoneClass");
        }

        public static PhoneClass valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PhoneClass) ipChange.ipc$dispatch("eca9598e", new Object[]{str});
            }
            return (PhoneClass) Enum.valueOf(PhoneClass.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!Login.checkSessionValid() || Login.checkLoginCookieValid()) {
                y7t.a("BrowserUtil", "Login.checkLoginCookieValid()");
            } else {
                y7t.a("BrowserUtil", "checkLoginCookieInvalid refreshCookies");
                Login.refreshCookies();
            }
        }
    }

    public static Bundle a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("8cdecc30", new Object[]{str});
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return bundle;
    }

    public static void b(String str, String str2, String str3, String str4, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2448ce51", new Object[]{str, str2, str3, str4, map});
        } else if (fm2.commonConfig.o) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("className", str);
            map.put("method", str2);
            if (str3 != null) {
                map.put("branch", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                map.put("url", str4);
            }
            AppMonitor.Alarm.commitSuccess(m7r.KEY_MONITOR_MODULE, "WebViewFeature", new com.alibaba.fastjson.JSONObject(map).toString());
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f484e731", new Object[]{str})).booleanValue();
        }
        try {
            return Pattern.compile(vpw.commonConfig.j, 2).matcher(str).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int d(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56b6e2e8", new Object[]{iWVWebView, str})).intValue();
        }
        return 2;
    }

    public static boolean i(Context context, String str) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("292f220a", new Object[]{context, str})).booleanValue();
        }
        gm2 gm2Var = fm2.commonConfig;
        if (!gm2Var.m) {
            z = context instanceof TBMainActivity;
        } else if (TBMainHost.a(context) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = context instanceof BrowserActivity;
        if (z3 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!gm2Var.i) {
            z2 = !z3;
        }
        if ((context instanceof BrowserUpperActivity) || z2) {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setPackage(context.getPackageName());
            intent.setAction("android.intent.action.VIEW");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null && BrowserActivity.class.toString().contains(resolveActivity.activityInfo.name)) {
                return false;
            }
        }
        return true;
    }

    public static Bitmap j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cd0063e7", new Object[]{view});
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    public static void k(Context context, String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadbd8db", new Object[]{context, str, str2, bitmap});
            return;
        }
        Intent intent = new Intent(ShortcutManagerCompat.ACTION_INSTALL_SHORTCUT);
        intent.putExtra(AgooConstants.MESSAGE_DUPLICATE, false);
        intent.putExtra("android.intent.extra.shortcut.NAME", str2);
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        try {
            Intent intent2 = new Intent();
            intent2.setData(Uri.parse(str));
            intent2.setPackage(context.getPackageName());
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            context.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static float l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be5e9883", new Object[]{context})).floatValue();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843499});
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        try {
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
        }
        return dimension;
    }

    @Deprecated
    public static String[] m(Context context, int i) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1a8b0374", new Object[]{context, new Integer(i)});
        }
        if (context == null || (string = context.getResources().getString(i)) == null) {
            return null;
        }
        return string.split(";");
    }

    public static BitmapDrawable n(int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("73894d03", new Object[]{new Integer(i), context});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setText(i);
        tIconFontTextView.setTextSize(20.0f);
        tIconFontTextView.setTextColor(Color.parseColor("#F5A623"));
        tIconFontTextView.setTypeface(Typeface.createFromAsset(context.getAssets(), "uik_iconfont.ttf"));
        return new BitmapDrawable(context.getResources(), j(tIconFontTextView));
    }

    public static final int o(String str) {
        try {
            return R.string.class.getDeclaredField("uik_icon_" + str).getInt(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return 0;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return 0;
        } catch (SecurityException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static String q(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e7c3a", new Object[]{stackTraceElementArr});
        }
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString() + " \n");
        }
        return sb.toString();
    }

    public static String r(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("747c30ba", new Object[]{activity});
        }
        return Integer.toHexString(activity.hashCode());
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final boolean t(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb1822a", new Object[]{str, strArr})).booleanValue();
        }
        if (!(str == null || strArr == null)) {
            for (String str2 : strArr) {
                if (!(str2 == null || str.indexOf(str2) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void u(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4951fe91", new Object[]{context, iWVWebView});
        } else if (!ABGlobal.b(context, "anrOpt", "WindVane", "optNotifyRefreshCookies") || !TextUtils.equals("true", OrangeConfig.getInstance().getConfig("WindVane", m7r.KEY_ORANGE_CONFIG_NOTIFY_REFRESH_COOKIES, "true"))) {
            y7t.a("BrowserUtil", "refreshCookies");
            Login.refreshCookies();
        } else {
            km2.a().b(new a());
        }
    }

    public static String v(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e4e1c42", new Object[]{str, str2, str3});
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(str2);
            if (queryParameter == null) {
                Uri.Builder buildUpon = parse.buildUpon();
                String path = parse.getPath();
                if (path != null) {
                    if (path.length() == 0) {
                    }
                    return buildUpon.appendQueryParameter(str2, str3).toString();
                }
                buildUpon.appendPath("");
                return buildUpon.appendQueryParameter(str2, str3).toString();
            } else if (!"".equals(queryParameter)) {
                return str.replace(queryParameter, str3);
            } else {
                return str.replace(str2 + "=", str2 + "=" + str3);
            }
        } catch (Exception e) {
            y7t.a(y7t.TAOBAO_TAG, "" + e.getMessage());
            return str;
        }
    }

    public static Bitmap w(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6bd6d5fd", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = i / height;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static final void x(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
            return;
        }
        Toast makeText = Toast.makeText(Globals.getApplication(), "", 1);
        if (makeText != null) {
            makeText.setText(str);
            makeText.show();
        }
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c1ea02", new Object[]{uri})).booleanValue();
        }
        try {
            String queryParameter = uri.getQueryParameter("disableNav");
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!"true".equals(queryParameter)) {
                    if (slo.VALUE_YES.equals(queryParameter)) {
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean f(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("621a564", new Object[]{uri})).booleanValue();
        }
        try {
            String queryParameter = uri.getQueryParameter("disableScreenShot");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("true".equals(queryParameter.trim())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            TLog.loge("BrowserUtil", e.getMessage());
            return false;
        }
    }

    public static boolean g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2524b29e", new Object[]{uri})).booleanValue();
        }
        try {
            String queryParameter = uri.getQueryParameter("wvUseSysWebView");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("true".equals(queryParameter)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean h(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9caab19d", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        try {
            String queryParameter = uri.getQueryParameter("useSysWebView");
            if (!TextUtils.isEmpty(queryParameter)) {
                if ("true".equals(queryParameter)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    static {
        t2o.a(619708648);
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1964309", new Object[0]);
        }
        String[] d = mrw.b().d();
        if (d == null) {
            mrw.b().a();
            return null;
        }
        String str = "(function(){var d=document,r={}";
        String str2 = "";
        for (int i = 0; i < d.length; i++) {
            str = str + String.format(",n%d='%s',e%d=d.getElementById(n%d)", Integer.valueOf(i), d[i], Integer.valueOf(i), Integer.valueOf(i));
            str2 = str2 + String.format("if(e%d){r[n%d]=e%d.getAttribute('value')}", Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(";" + str2 + "return JSON.stringify(r);})()");
        return sb.toString();
    }
}
