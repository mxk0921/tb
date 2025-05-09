package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements uv2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            }
        }

        @Override // tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements uv2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            }
        }

        @Override // tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
            }
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efa9460c", new Object[]{str});
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            userId = "_NotLogin";
        } else {
            str = str.concat("_");
        }
        return str.concat(userId);
    }

    public static Activity d(Context context, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("cb7a5f74", new Object[]{context, fragment});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (fragment == null || fragment.getActivity() == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public static ComponentName e(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("25c4bd56", new Object[]{context, intent});
        }
        try {
            ComponentName component = intent.getComponent();
            if (component != null) {
                return component;
            }
            return intent.resolveActivity(context.getPackageManager());
        } catch (Exception e) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "getComponent: ", e);
            return null;
        }
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba38aa20", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static void i(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861f90ed", new Object[]{context, intent});
        } else if (!g(context, null, intent, -1, false)) {
            context.startActivity(intent);
        }
    }

    public static void j(Activity activity, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59168a98", new Object[]{activity, intent, new Integer(i)});
        } else if (!g(activity, null, intent, i, true)) {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void k(Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad0b6b2", new Object[]{fragment, intent, new Integer(i)});
        } else if (!g(fragment.getActivity(), fragment, intent, i, true)) {
            fragment.startActivityForResult(intent, i);
        }
    }

    public static void b(Intent intent, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffb2cef", new Object[]{intent, componentName});
        } else if (intent != null && componentName != null && "com.taobao.android.detail.wrapper.activity.DetailActivity".equals(componentName.getClassName())) {
            intent.putExtra("stdPopRecreateOnSysChanged", true);
        }
    }

    public static void h(Context context, Fragment fragment, Intent intent, ComponentName componentName, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a514e59", new Object[]{context, fragment, intent, componentName, new Integer(i), new Boolean(z)});
            return;
        }
        if (i >= 0 || z) {
            intent.putExtra("stdPopShowWithCode", i);
        }
        a(intent.getData(), intent);
        b(intent, componentName);
        TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open success. stdPopShowWithCode=" + i + ", stdPopModal=" + intent.getBooleanExtra("stdPopModal", false) + ", stdPopRecreateOnSysChanged=" + intent.getBooleanExtra("stdPopRecreateOnSysChanged", false));
        if (fragment != null) {
            olq.k(context, intent, fragment, new a());
        } else {
            olq.i(context, intent, new b());
        }
    }

    public static void a(Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da968150", new Object[]{uri, intent});
        } else if (uri == null) {
            intent.putExtra("stdPopModal", true);
        } else {
            String queryParameter = uri.getQueryParameter("largescreenmask");
            if ("true".equals(queryParameter)) {
                intent.putExtra("stdPopModal", true);
            } else if ("false".equals(queryParameter)) {
                intent.putExtra("stdPopModal", false);
            } else {
                intent.putExtra("stdPopModal", true);
            }
        }
    }

    public static boolean g(Context context, Fragment fragment, Intent intent, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8feacc01", new Object[]{context, fragment, intent, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (!TBDeviceUtils.p(context) && !TBDeviceUtils.P(context)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. isFoldDevice=" + TBDeviceUtils.p(context) + " isTablet=" + TBDeviceUtils.P(context));
            return false;
        } else if (ig4.m().C() && TBDeviceUtils.p(context)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Orange force all activity to open in full screen on fold device.");
            return false;
        } else if (ig4.m().D() && TBDeviceUtils.P(context)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Orange force all activity to open in full screen on tablet device.");
            return false;
        } else if (ig4.m().B()) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Orange force all activity to open in full screen.");
            return false;
        } else if (TBDeviceUtils.D(d(context, fragment))) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. isEasyGoOpen=true, fromActivity=" + d(context, fragment));
            return false;
        } else if (intent.getBooleanExtra("from_browser", false)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. from_browser=true, fromActivity=" + d(context, fragment));
            return false;
        } else if (context.getSharedPreferences(c(context.getPackageName()), 0).getBoolean("fullScreenOpenView", false)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Users set the page in Settings to open in full screen.");
            return false;
        } else {
            ComponentName e = e(context, intent);
            if (e == null || TextUtils.isEmpty(e.getPackageName()) || TextUtils.equals(e.getPackageName(), f(context))) {
                Uri data = intent.getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY);
                    if ("fullscreen".equals(queryParameter)) {
                        TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. The url carries large screen parameters.");
                        return false;
                    } else if ("split".equals(queryParameter)) {
                        h(context, fragment, intent, e, i, z);
                        return true;
                    }
                }
                if (data != null && ldq.d().f(context, data)) {
                    TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. The url is required by orange to be opened on a large screen.");
                    return false;
                } else if (ldq.d().e(context, e)) {
                    TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. The component is required by orange to be opened on a large screen.");
                    return false;
                } else {
                    h(context, fragment, intent, e, i, z);
                    return true;
                }
            } else {
                TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. jump other app, packageName = " + e.getPackageName());
                return false;
            }
        }
    }
}
