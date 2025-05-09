package com.taobao.tao.util;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import java.io.File;
import mtopsdk.mtop.global.SDKConfig;
import tb.s11;
import tb.t1m;
import tb.t2o;
import tb.vs3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaoHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class DialogClickListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Activity mActivity;
        private TBDialog mDialog;

        static {
            t2o.a(775946447);
        }

        public DialogClickListener(TBDialog tBDialog, Activity activity) {
            this.mDialog = tBDialog;
            this.mActivity = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBDialog tBDialog = this.mDialog;
            if (tBDialog != null) {
                tBDialog.dismiss();
                this.mDialog = null;
            }
            Activity activity = this.mActivity;
            if (activity != null) {
                activity.finish();
                this.mActivity = null;
            }
        }
    }

    static {
        t2o.a(775946446);
    }

    public static boolean clearProgramCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb277956", new Object[0])).booleanValue();
        }
        deleteDirectory(generalDataDirectory("shared_prefs"));
        deleteDirectory(generalDataDirectory("pic"));
        deleteDirectory(generalDataDirectory("persist_images"));
        return true;
    }

    public static String formatPriceStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a15b9c10", new Object[]{str});
        }
        if (StringUtil.isEmpty(str)) {
            return "0.00";
        }
        if (str.indexOf(".") < 0) {
            return str.concat(".00");
        }
        if (str.indexOf(".") == str.length() - 3) {
            return str;
        }
        String substring = str.substring(str.indexOf("."));
        if (substring.length() > 3) {
            return str.substring(0, str.indexOf(".") + 3);
        }
        if (substring.length() >= 3) {
            return str;
        }
        while (str.indexOf(".") != str.length() - 3) {
            str = str.concat("0");
        }
        return str;
    }

    public static File generalDataDirectory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9abcea61", new Object[]{str});
        }
        try {
            File file = new File(getPackageDirectory(), str);
            if (!file.exists()) {
                return null;
            }
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getActualVersionName() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0e6effa", new Object[0]);
        }
        try {
            str = Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "1.0.0";
        }
        new StringBuilder("getActualVersionName").append(str);
        return str;
    }

    public static String getHardnessInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89bbf6b3", new Object[0]);
        }
        return "imei=" + t1m.b(Globals.getApplication()) + "&imsi=" + t1m.c(Globals.getApplication()) + "&ttid=" + getTTID();
    }

    private static File getPackageDirectory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("81841549", new Object[0]);
        }
        return Globals.getApplication().getFilesDir().getParentFile();
    }

    public static String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[0]);
        }
        return Globals.getApplication().getPackageName();
    }

    @Deprecated
    public static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        return s11.f();
    }

    @Deprecated
    public static long getSystemAvailableMemorySize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea2e9861", new Object[0])).longValue();
        }
        return 102401L;
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return TaoPackageInfo.getTTID();
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (SDKConfig.getInstance().getGlobalAppVersion() != null) {
            return SDKConfig.getInstance().getGlobalAppVersion();
        }
        try {
            return Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }

    public static boolean isSpecialManuFacturer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96c10055", new Object[]{str})).booleanValue();
        }
        String str2 = Build.MANUFACTURER;
        String str3 = Build.BRAND;
        if (str2 != null && str2.trim().equalsIgnoreCase(str)) {
            return true;
        }
        if (str3 == null || !str3.trim().equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static String replaceLessString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85cc1b91", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return str.replace(".", "").replace("元", "");
    }

    public static void setClipboardText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91f1a72", new Object[]{str});
            return;
        }
        try {
            ((ClipboardManager) Globals.getApplication().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("剪贴板内容", str));
        } catch (Exception e) {
            e.printStackTrace();
            TBS.Ext.commitEvent("setClipboardText", Constants.EventID_RD_TRACE, e.toString());
        }
    }

    public static String formatArtPriceStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9a34c7b", new Object[]{str});
        }
        if (StringUtil.isEmpty(str)) {
            return "0.00";
        }
        if (str.length() >= 3) {
            return str.substring(0, str.length() - 2) + "." + str.substring(str.length() - 2);
        } else if (str.length() == 2) {
            return "0.".concat(str);
        } else {
            return "0.0".concat(str);
        }
    }

    public static void deleteDirectory(File file) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed50240", new Object[]{file});
        } else if (file != null && file.exists() && file.isDirectory()) {
            File packageDirectory = getPackageDirectory();
            String absolutePath = file.getAbsolutePath();
            if (!absolutePath.equals(new File(packageDirectory, "lib").getAbsolutePath())) {
                if (absolutePath.equals(new File(packageDirectory, "shared_prefs").getAbsolutePath())) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            String absolutePath2 = file2.getAbsolutePath();
                            if (!absolutePath2.contains("userinfo.xml") && !absolutePath2.contains("user_ticker.xml") && !absolutePath2.contains("CONFIG.xml") && !absolutePath2.contains("imei.xml") && !absolutePath2.contains(Constants.TBSettingsPrefernceKey.concat(".xml")) && !absolutePath2.contains("tbservice.xml") && !absolutePath2.contains("tb_share_copy_content.xml") && !absolutePath2.contains("com.taobao.tao.Welcome.xml")) {
                                String[] split = absolutePath2.split("/|\\.");
                                if (split.length > 1) {
                                    try {
                                        Globals.getApplication().getSharedPreferences(split[split.length - 2], 0).edit().clear().commit();
                                    } catch (IllegalArgumentException e) {
                                        e.printStackTrace();
                                    }
                                }
                                file2.delete();
                            }
                        }
                    }
                } else if (absolutePath.equals(new File(packageDirectory, vs3.FILES_DIR_NAME).getAbsolutePath())) {
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 != null) {
                        int length = listFiles2.length;
                        while (i < length) {
                            File file3 = listFiles2[i];
                            if (file3.isDirectory()) {
                                deleteDirectory(file3);
                            } else {
                                String absolutePath3 = file3.getAbsolutePath();
                                if (!absolutePath3.contains("libndk-tbsengine") && !absolutePath3.contains("DataService.config") && !absolutePath3.contains("resource.config")) {
                                    file3.delete();
                                }
                            }
                            i++;
                        }
                    }
                } else {
                    File[] listFiles3 = file.listFiles();
                    if (listFiles3 != null) {
                        int length2 = listFiles3.length;
                        while (i < length2) {
                            File file4 = listFiles3[i];
                            if (file4.isDirectory()) {
                                deleteDirectory(file4);
                            } else {
                                file4.delete();
                            }
                            i++;
                        }
                        file.delete();
                    }
                }
            }
        }
    }

    public static boolean isWifi(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c896226", new Object[]{context})).booleanValue();
        }
        return NetworkInfo.State.CONNECTED == ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).getState();
    }
}
