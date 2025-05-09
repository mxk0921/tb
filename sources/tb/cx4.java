package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cx4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806356541);
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    static {
        t2o.a(806356540);
    }

    public static String a(int i) {
        String str;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14999176", new Object[]{new Integer(i)});
        }
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = new ProcessBuilder("/system/bin/cat", String.format("/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i))).start().getInputStream();
            str = "";
            if (inputStream2 != null) {
                while (inputStream2.read(new byte[24]) != -1) {
                    str = str + new String(bArr);
                }
                inputStream2.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            str = "N/A";
        }
        return str.trim();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e7ecbe", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            if (listFiles != null) {
                return listFiles.length;
            }
            return 2;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
}
