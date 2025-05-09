package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dx4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f18125a = false;
    public static volatile String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452985189);
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

    static {
        t2o.a(452985188);
    }

    public static String a(int i) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14999176", new Object[]{new Integer(i)});
        }
        if (f18125a) {
            return b;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = new ProcessBuilder("/system/bin/cat", String.format("/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i))).start().getInputStream();
            String str = "";
            if (inputStream2 != null) {
                while (inputStream2.read(new byte[24]) != -1) {
                    str = str + new String(bArr);
                }
                inputStream2.close();
            }
            b = str.trim();
            f18125a = true;
        } catch (IOException e) {
            e.printStackTrace();
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        AVSDKLog.d(tfb.MODULE_SDK_PAGE, "CPU max freq: " + b);
        return b;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e7ecbe", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception e) {
            AVSDKLog.d(tfb.MODULE_SDK_PAGE, "CPU Count: Failed.");
            e.printStackTrace();
            return 1;
        }
    }
}
