package tb;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import dalvik.system.BaseDexClassLoader;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661643);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r2 == null) goto L_0x005a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.bww.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "ba29cbf2"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/maps"
            r0.<init>(r1)
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: all -> 0x0050, IOException -> 0x0052
            java.io.FileReader r3 = new java.io.FileReader     // Catch: all -> 0x0050, IOException -> 0x0052
            r3.<init>(r0)     // Catch: all -> 0x0050, IOException -> 0x0052
            r2.<init>(r3)     // Catch: all -> 0x0050, IOException -> 0x0052
        L_0x0024:
            java.lang.String r0 = r2.readLine()     // Catch: all -> 0x0044, IOException -> 0x0047
            if (r0 == 0) goto L_0x0049
            java.lang.String r3 = "icudt"
            boolean r3 = r0.contains(r3)     // Catch: all -> 0x0044, IOException -> 0x0047
            if (r3 == 0) goto L_0x0024
            r3 = 47
            int r3 = r0.indexOf(r3)     // Catch: all -> 0x0044, IOException -> 0x0047
            java.lang.String r0 = r0.substring(r3)     // Catch: all -> 0x0044, IOException -> 0x0047
            java.lang.String r0 = r0.trim()     // Catch: all -> 0x0044, IOException -> 0x0047
            r2.close()     // Catch: IOException -> 0x0043
        L_0x0043:
            return r0
        L_0x0044:
            r0 = move-exception
            r1 = r2
            goto L_0x005b
        L_0x0047:
            r0 = move-exception
            goto L_0x0054
        L_0x0049:
            r2.close()     // Catch: all -> 0x0044, IOException -> 0x0047
        L_0x004c:
            r2.close()     // Catch: IOException -> 0x005a
            goto L_0x005a
        L_0x0050:
            r0 = move-exception
            goto L_0x005b
        L_0x0052:
            r0 = move-exception
            r2 = r1
        L_0x0054:
            r0.printStackTrace()     // Catch: all -> 0x0044
            if (r2 == 0) goto L_0x005a
            goto L_0x004c
        L_0x005a:
            return r1
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            r1.close()     // Catch: IOException -> 0x0060
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bww.a():java.lang.String");
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aee46535", new Object[]{str});
        }
        String findLibrary = ((BaseDexClassLoader) WXEnvironment.class.getClassLoader()).findLibrary(str);
        if (!TextUtils.isEmpty(findLibrary)) {
            File file = new File(findLibrary);
            if (file.exists()) {
                WXLogUtils.e(str + "'s Path is" + findLibrary);
                return file.getAbsolutePath();
            }
            WXLogUtils.e(str + "'s Path is " + findLibrary + " but file does not exist");
        }
        String str2 = "lib" + str + jcq.SO_EXTENSION;
        String d = d();
        if (TextUtils.isEmpty(d)) {
            WXLogUtils.e("cache dir is null");
            return "";
        }
        if (d.indexOf("/cache") > 0) {
            findLibrary = new File(d.replace("/cache", "/lib"), str2).getAbsolutePath();
        }
        if (new File(findLibrary).exists()) {
            WXLogUtils.e(str + "use lib so");
        }
        return findLibrary;
    }

    public static Boolean c(Object obj, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8e5b7995", new Object[]{obj, bool});
        }
        if (obj == null) {
            return bool;
        }
        if (TextUtils.equals("false", obj.toString())) {
            return Boolean.FALSE;
        }
        return TextUtils.equals("true", obj.toString()) ? Boolean.TRUE : bool;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77e6ca78", new Object[0]);
        }
        Application application = WXEnvironment.getApplication();
        if (application == null || application.getApplicationContext() == null) {
            return null;
        }
        return application.getApplicationContext().getCacheDir().getPath();
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return -1;
    }

    public static boolean f() {
        IWXFoldDeviceAdapter wXFoldDeviceAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[0])).booleanValue();
        }
        if (!WXUtils.disableBuildVersionFix() && (wXFoldDeviceAdapter = WXSDKManager.getInstance().getWXFoldDeviceAdapter()) != null) {
            return wXFoldDeviceAdapter.isFoldDevice();
        }
        return false;
    }

    public static boolean g() {
        IWXFoldDeviceAdapter wXFoldDeviceAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[0])).booleanValue();
        }
        if (!WXUtils.disableBuildVersionFix() && (wXFoldDeviceAdapter = WXSDKManager.getInstance().getWXFoldDeviceAdapter()) != null) {
            return wXFoldDeviceAdapter.isTablet();
        }
        return false;
    }
}
