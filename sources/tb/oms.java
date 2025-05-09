package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String readLine = new BufferedReader(new InputStreamReader(new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream())).readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    wms.c("tschedule", "cupMaxHz", readLine);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements FileFilter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(329253025);
            }

            public a(b bVar) {
            }

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                }
                if (Pattern.matches("cpu[0-9]", file.getName())) {
                    return true;
                }
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a(this));
                if (listFiles != null) {
                    wms.c("tschedule", "cpuCores", listFiles.length + "");
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(329253022);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d468735", new Object[0]);
        }
        String b2 = wms.b("tschedule", "cupMaxHz", "null");
        if (!"null".equals(b2)) {
            return b2;
        }
        c();
        return "N/A";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d755d735", new Object[0]);
        }
        String b2 = wms.b("tschedule", "cpuCores", "");
        if (!TextUtils.isEmpty(b2)) {
            return b2;
        }
        d();
        return "1";
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e4c90d", new Object[0]);
        } else {
            Coordinator.execute(new a());
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a32fb85", new Object[0]);
        } else {
            Coordinator.execute(new b());
        }
    }
}
