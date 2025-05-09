package tb;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.FileManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.tao.TaobaoApplication;
import dalvik.system.DexFile;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class s11 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SYSTEM_ROOT_STATE_DISABLE = 0;
    public static final int SYSTEM_ROOT_STATE_ENABLE = 1;
    public static final int SYSTEM_ROOT_STATE_UNKNOW = -1;

    /* renamed from: a  reason: collision with root package name */
    public static String f27737a;
    public static String b;
    public static int c;
    public static long d;
    public static String e;

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c405518a", new Object[]{context})).booleanValue();
        }
        try {
            if (((Integer) Reflector.s(context.getResources().getAssets()).l("addAssetPath", String.class).b(context.getApplicationInfo().sourceDir)).intValue() != 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void c(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b029b329", new Object[]{str, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("err_log", 0);
        int i = sharedPreferences.getInt(str, 0);
        if (i >= 3) {
            j(context);
        } else {
            sharedPreferences.edit().putInt(str, i + 1).commit();
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3168fba9", new Object[]{context});
            return;
        }
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separatorChar + "bundleBaseline");
        File file2 = new File(context.getFilesDir(), "bundleupdate");
        if (file2.exists()) {
            ah9.a(file2);
        }
        if (file.exists()) {
            ah9.a(file);
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[0]);
        }
        return f27737a;
    }

    public static String i(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("186f88ee", new Object[]{file, file2});
        }
        String name = file.getName();
        if (!name.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
            int lastIndexOf = name.lastIndexOf(".");
            if (lastIndexOf < 0) {
                name = name.concat(FileManager.CLASSES_DEX_SUFFIX);
            } else {
                StringBuilder sb = new StringBuilder(lastIndexOf + 4);
                sb.append((CharSequence) name, 0, lastIndexOf);
                sb.append(FileManager.CLASSES_DEX_SUFFIX);
                name = sb.toString();
            }
        }
        return new File(file2, name).getPath();
    }

    public static void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38e590e", new Object[]{context});
            return;
        }
        File file = new File(context.getFilesDir(), "storage/version_meta");
        DataOutputStream dataOutputStream = null;
        try {
            try {
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable unused2) {
        }
        if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream2.writeUTF(b);
                dataOutputStream2.writeLong(c);
                dataOutputStream2.writeLong(d);
                dataOutputStream2.writeUTF(e);
                dataOutputStream2.writeUTF(Build.FINGERPRINT + "" + Build.VERSION.SDK_INT);
                dataOutputStream2.flush();
                dataOutputStream2.close();
            } catch (Throwable unused3) {
                dataOutputStream = dataOutputStream2;
                try {
                    Log.e("ApkUtils", "storePackageVersion failed!");
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                } catch (Throwable th) {
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            }
        }
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b668b4b", new Object[]{context});
            return;
        }
        try {
            ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).notify(123, new Notification.Builder(context).setSmallIcon(context.getResources().getIdentifier("icon", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName())).setContentTitle(wmc.TIPS).setAutoCancel(true).setContentText("应用安装不完整,请您卸载重新安装!").build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ae2baf", new Object[]{context})).booleanValue();
        }
        AssetManager assets = context.getResources().getAssets();
        try {
            Reflector g = Reflector.s(assets).g("mStringBlocks");
            Reflector l = Reflector.s(assets).l("getCookieName", Integer.TYPE);
            Object[] objArr = (Object[]) g.k(assets);
            for (int i = 1; i < objArr.length + 1; i++) {
                if (((String) l.b(Integer.valueOf(i))).toLowerCase().contains("taobao")) {
                    return true;
                }
            }
            Log.e("ApkUtils", "apk resources add failed");
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static void e(Context context) {
        Object k;
        Reflector g;
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1488aea", new Object[]{context});
            return;
        }
        try {
            Reflector g2 = Reflector.s(s11.class.getClassLoader()).g("pathList");
            if (!(g2 == null || (k = g2.k(s11.class.getClassLoader())) == null || (g = Reflector.s(k).g("dexElements")) == null || (objArr = (Object[]) g.k(k)) == null || objArr.length <= 0)) {
                for (Object obj : objArr) {
                    if (((DexFile) Reflector.s(obj).g("dexFile").j()).getName().toLowerCase().contains("taobao")) {
                        Reflector.s(obj).g("dexFile").r(obj, DexFile.loadDex(new File(e).getPath(), i(new File(e), context.getCodeCacheDir()), 0));
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean g(Context context) {
        PackageInfo packageInfo;
        DataInputStream dataInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("617d59fc", new Object[]{context})).booleanValue();
        }
        DataInputStream dataInputStream2 = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            Process.killProcess(Process.myPid());
            packageInfo = null;
        }
        String str = packageInfo.versionName;
        b = str;
        c = packageInfo.versionCode;
        d = packageInfo.lastUpdateTime;
        if (TextUtils.isEmpty(str)) {
            Log.e("TaobaoApplication", "version name is empty ");
            Process.killProcess(Process.myPid());
        }
        File file = new File(context.getFilesDir(), "storage/version_meta");
        try {
            if (file.exists()) {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                } catch (Throwable unused2) {
                }
                try {
                    String readUTF = dataInputStream.readUTF();
                    long readLong = dataInputStream.readLong();
                    long readLong2 = dataInputStream.readLong();
                    String readUTF2 = dataInputStream.readUTF();
                    String readUTF3 = dataInputStream.readUTF();
                    System.setProperty("APP_VERSION_TAG", b);
                    if (packageInfo.versionCode == readLong && TextUtils.equals(packageInfo.versionName, readUTF) && packageInfo.lastUpdateTime == readLong2 && context.getApplicationInfo().sourceDir.equals(readUTF2)) {
                        if ((Build.FINGERPRINT + "" + Build.VERSION.SDK_INT).equals(readUTF3)) {
                            try {
                                dataInputStream.close();
                            } catch (Throwable unused3) {
                            }
                            return false;
                        }
                    }
                    if (!TextUtils.isEmpty(readUTF)) {
                        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("lastInstalledVersionName", readUTF).apply();
                    }
                    dataInputStream.close();
                } catch (Throwable unused4) {
                    dataInputStream2 = dataInputStream;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    return true;
                }
            }
        } catch (Throwable unused5) {
        }
        return true;
    }

    public static boolean h(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d4d8c1c", new Object[]{context})).booleanValue();
        }
        f27737a = TaobaoApplication.getProcessName(context);
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return false;
        }
        String str2 = applicationInfo.sourceDir;
        e = str2;
        String str3 = applicationInfo.nativeLibraryDir;
        if (str2 == null || !new File(e).exists()) {
            c("InvalidApkPath", context);
            return false;
        }
        if (str3 == null || !new File(str3).exists()) {
            Log.e("TaobaoApplication", "can not find nativeLibDir : " + str3);
        }
        if (Build.VERSION.SDK_INT > 22) {
            return true;
        }
        int myPid = Process.myPid();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    f27737a = runningAppProcessInfo.processName;
                }
                if (runningAppProcessInfo.processName.endsWith(":fixdoat") && runningAppProcessInfo.pid != myPid) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(f27737a)) {
            Log.e("TaobaoApplication", "getProcess failed");
            return false;
        } else if (f27737a.endsWith(":fixdoat")) {
            return true;
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i == 21 || i == 22) {
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.printStackTrace();
                    str = "";
                }
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                if (!defaultSharedPreferences.getBoolean("need_dex2oat_" + str, false)) {
                    SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(context);
                    if (!defaultSharedPreferences2.getBoolean("should_reinstall_" + str, false)) {
                        SharedPreferences defaultSharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(context);
                        if (defaultSharedPreferences3.getBoolean("fixdex2oat_" + str, false)) {
                            Log.e("ApkUtils", "replace new dexFile");
                            e(context);
                        }
                        SharedPreferences defaultSharedPreferences4 = PreferenceManager.getDefaultSharedPreferences(context);
                        if (defaultSharedPreferences4.getBoolean("should_checkRes_" + str, false)) {
                            if (!b(context)) {
                                if (!a(context)) {
                                    Toast.makeText(context, "应用安装不完整,请您卸载重新安装!", 1).show();
                                    return false;
                                }
                            } else if (context.getResources().getIdentifier("ttidStore", pg1.ATOM_String, "com.taobao.taobao") == 0) {
                                Toast.makeText(context, "应用安装不完整,请您卸载重新安装!", 1).show();
                                return false;
                            }
                        }
                    }
                }
                Log.e("ApkUtils", "show reinstall or fixdexoating....");
                return false;
            }
            return true;
        }
    }
}
