package android.taobao.windvane.extra.uc;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import tb.t2o;
import tb.v7t;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUCUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_KEY = "ISX86";
    public static final String TAG = "WVUCUtils";
    public static final long VAL_ARM = 2;
    public static final long VAL_DEAFAULT = 0;
    public static final long VAL_X86 = 1;
    private static String sAbi;
    private static String sAbi2;
    private static String[] sAbiList;
    private static String sArch;
    private static String sCpuAbi;
    private static String[] sSupportedABIs;

    static {
        t2o.a(989856108);
    }

    private static void close(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean is64Bit() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf7f490", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return isART64();
        }
        is64Bit = Process.is64Bit();
        v7t.i(TAG, "is 64 bit = [" + is64Bit + "]");
        return is64Bit;
    }

    private static boolean is64bitCPU() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72807fce", new Object[0])).booleanValue();
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            str = strArr[0];
        } else {
            str = null;
        }
        if (str == null || !str.contains("arm64")) {
            return false;
        }
        return true;
    }

    public static boolean isArchContains(String str) {
        String str2;
        String fromSystemProp;
        String str3;
        if (sArch == null) {
            sArch = System.getProperty("os.arch");
        }
        String str4 = sArch;
        if (str4 != null && str4.toLowerCase().contains(str)) {
            return true;
        }
        if (sAbi == null) {
            try {
                sAbi = Build.CPU_ABI;
                sAbi2 = Build.CPU_ABI2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String str5 = sAbi;
        if (str5 != null && str5.toLowerCase().contains(str)) {
            return true;
        }
        if (sSupportedABIs == null) {
            try {
                sSupportedABIs = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String[] strArr = sSupportedABIs;
        if (strArr != null && strArr.length > 0 && (str3 = strArr[0]) != null && str3.toLowerCase().contains(str)) {
            return true;
        }
        if (sCpuAbi == null) {
            sCpuAbi = getFromSystemProp("ro.product.cpu.abi");
        }
        String str6 = sCpuAbi;
        if (str6 != null && str6.toLowerCase().contains(str)) {
            return true;
        }
        if (!(sAbiList != null || (fromSystemProp = getFromSystemProp("ro.product.cpu.abilist")) == null || fromSystemProp.length() == 0)) {
            sAbiList = fromSystemProp.split(",");
        }
        String[] strArr2 = sAbiList;
        return strArr2 != null && strArr2.length > 0 && (str2 = strArr2[0]) != null && str2.toLowerCase().contains(str);
    }

    private static String getFromSystemProp(String str) {
        Throwable th;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ded5037d", new Object[]{str});
        }
        try {
            fileInputStream = new FileInputStream(new File("/system/build.prop"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else if (readLine.contains(str)) {
                                String[] split = readLine.split("=");
                                if (split.length == 2 && split[0].trim().equals(str)) {
                                    return split[1].trim();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                return null;
                            } finally {
                                close(bufferedReader);
                                close(inputStreamReader);
                                close(fileInputStream);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader = null;
        }
        return null;
    }

    private static boolean isART64() {
        try {
            Object invoke = ClassLoader.class.getDeclaredMethod("findLibrary", String.class).invoke(yaa.n.getClassLoader(), "art");
            if (invoke != null) {
                return ((String) invoke).contains("lib64");
            }
            return false;
        } catch (Exception unused) {
            return is64bitCPU();
        }
    }
}
