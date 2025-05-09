package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final d f28309a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f28310a;

        public a(SharedPreferences sharedPreferences) {
            this.f28310a = sharedPreferences;
        }

        @Override // java.lang.Runnable
        public void run() {
            BufferedReader bufferedReader;
            Throwable th;
            String readLine;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream()));
                    try {
                        readLine = bufferedReader.readLine();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            tgh.c("CpuInfoUtils", "initCpuFrequency", th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e) {
                                    tgh.c("CpuInfoUtils", "initCpuFrequency close exception: ", e);
                                }
                            }
                            throw th3;
                        }
                    }
                } catch (IOException e2) {
                    tgh.c("CpuInfoUtils", "initCpuFrequency close exception: ", e2);
                    return;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
            }
            if (TextUtils.isEmpty(readLine)) {
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                    tgh.c("CpuInfoUtils", "initCpuFrequency close exception: ", e3);
                }
            } else {
                sw4.a().b = readLine;
                SharedPreferences.Editor edit = this.f28310a.edit();
                edit.putString("detail_CpuFrequency", readLine);
                edit.apply();
                bufferedReader.close();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f28311a;

        public b(SharedPreferences sharedPreferences) {
            this.f28311a = sharedPreferences;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new c(null));
                if (listFiles != null) {
                    sw4.a().f28312a = String.valueOf(listFiles.length);
                    SharedPreferences.Editor edit = this.f28311a.edit();
                    edit.putInt("detail_CpuNumCores", listFiles.length);
                    edit.apply();
                }
            } catch (Throwable th) {
                tgh.c("CpuInfoUtils", "initNumCores", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262765);
        }

        public c() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            try {
            } catch (Throwable th) {
                tgh.c("CpuInfoUtils", "initNumCores", th);
            }
            if (Pattern.matches("cpu[0-9]", file.getName())) {
                return true;
            }
            return false;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f28312a;
        public String b;

        static {
            t2o.a(912262766);
        }
    }

    static {
        t2o.a(912262762);
        d dVar = new d();
        f28309a = dVar;
        dVar.f28312a = "0";
        dVar.b = "0";
    }

    public static /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("16aff70a", new Object[0]);
        }
        return f28309a;
    }

    public static d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("59f9ea5a", new Object[0]);
        }
        d dVar = new d();
        d dVar2 = f28309a;
        String str = dVar2.f28312a;
        dVar.f28312a = str;
        dVar.b = dVar2.b;
        if (TextUtils.equals("0", str)) {
            d();
        }
        if (TextUtils.equals("0", dVar.b)) {
            c();
        }
        return dVar;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823c244b", new Object[0]);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mr7.d());
        String string = defaultSharedPreferences.getString("detail_CpuFrequency", "null");
        if (!TextUtils.isEmpty(string)) {
            f28309a.b = string;
        } else {
            pos.a(new a(defaultSharedPreferences));
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a32fb85", new Object[0]);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mr7.d());
        int i = defaultSharedPreferences.getInt("detail_CpuNumCores", 0);
        if (i != 0) {
            f28309a.f28312a = String.valueOf(i);
            return;
        }
        pos.a(new b(defaultSharedPreferences));
    }
}
