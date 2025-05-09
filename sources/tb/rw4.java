package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEVICEINFO_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    public static transient Integer f27645a;
    public static final FileFilter b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String name = file.getName();
            if (!name.startsWith(APower.TYPE_CPU)) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1a7d094", new Object[0])).intValue();
        }
        return new File("/sys/devices/system/cpu/").listFiles(b).length;
    }

    public static int b(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("573ebd36", new Object[]{str})).intValue();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                int c = c(readLine);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return c;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return -1;
                }
                try {
                    fileInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac27ab59", new Object[]{str})).intValue();
        }
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("466e95fc", new Object[0])).intValue();
        }
        Integer num = f27645a;
        if (num != null) {
            return num.intValue();
        }
        int i = -1;
        try {
            int b2 = b("/sys/devices/system/cpu/possible");
            if (b2 == -1) {
                b2 = b("/sys/devices/system/cpu/present");
            }
            if (b2 == -1) {
                i = a();
            } else {
                i = b2;
            }
        } catch (NullPointerException | SecurityException unused) {
        }
        f27645a = Integer.valueOf(i);
        return i;
    }
}
