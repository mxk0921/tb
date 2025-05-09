package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f24452a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String _BUILD = "";
        public static final String _JAVA_VERSION = "";
        public static final String _MAGIC = "CrashSDK";
        public static final String _NATIVE_VERSION = "160509105620";
        public static final String _TARGET = "beta";
        public static final String _VERSION = "3.3.0.0";

        public static String a(x0s x0sVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d433891f", new Object[]{x0sVar, str, str2});
            }
            long currentTimeMillis = System.currentTimeMillis();
            String b = b(x0sVar.d("APP_VERSION", "1.0.0"));
            String b2 = b(str2);
            return "CrashSDK_3.3.0.0__df_df_df_" + x0sVar.d("APP_KEY", "0") + "_" + b + "_" + currentTimeMillis + "_" + s91.c(currentTimeMillis) + "_" + asq.c(b2, "df") + "_" + str + ".log";
        }

        public static String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bb69e9e1", new Object[]{str});
            }
            if (str != null) {
                return str.replace("_", "&#95;");
            }
            return "";
        }
    }

    public n1s(File file, String str) {
        this.f24452a = file;
        this.b = str;
    }

    public File a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("88881834", new Object[]{this});
        }
        return this.f24452a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80f1d2f5", new Object[]{this});
        }
        return this.b;
    }
}
