package tb;

import android.app.ActivityManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class fi7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEVICEINFO_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    public static final FileFilter f19308a = new a();

    static {
        t2o.a(989856309);
    }

    public static int a(byte[] bArr, int i) {
        byte b;
        byte b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59ff85b8", new Object[]{bArr, new Integer(i)})).intValue();
        }
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (b < 48 || b > 57) {
                i++;
            } else {
                int i2 = i + 1;
                while (i2 < bArr.length && (b2 = bArr[i2]) >= 48 && b2 <= 57) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
        }
        return -1;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb47a4d", new Object[0])).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < e(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i3 = 0;
                        while (true) {
                            byte b = bArr[i3];
                            if (b < 48 || b > 57 || i3 >= 128) {
                                break;
                            }
                            i3++;
                        }
                        int parseInt = Integer.parseInt(new String(bArr, 0, i3));
                        if (parseInt > i) {
                            i = parseInt;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            int h = h("cpu MHz", fileInputStream2) * 1000;
            if (h > i) {
                i = h;
            }
            fileInputStream2.close();
        }
        return i;
    }

    public static ArrayList<Long> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a5e9e240", new Object[0]);
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/stat", "r");
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null || !readLine.startsWith(APower.TYPE_CPU)) {
                    break;
                }
                String[] split = readLine.split("\\s+");
                long parseLong = Long.parseLong(split[4]);
                arrayList.add(Long.valueOf(Long.parseLong(split[1]) + Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7])));
                arrayList.add(Long.valueOf(parseLong));
            }
            randomAccessFile.close();
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static long d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a62ce71", new Object[]{context})).longValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("466e95fc", new Object[0])).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f19308a).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb4dff26", new Object[0])).floatValue();
        }
        ArrayList<Long> c = c();
        if (c != null && c.size() >= 2) {
            float longValue = (float) c.get(0).longValue();
            float longValue2 = (float) c.get(1).longValue();
            try {
                Thread.sleep(360L);
            } catch (Exception unused) {
            }
            ArrayList<Long> c2 = c();
            if (c2 != null && c2.size() >= 2) {
                float longValue3 = (float) c2.get(0).longValue();
                return ((longValue3 - ((float) c2.get(1).longValue())) - (longValue - longValue2)) / (longValue3 - longValue);
            }
        }
        return 0.0f;
    }

    public static long g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e13c9746", new Object[]{context})).longValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static int h(String str, FileInputStream fileInputStream) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("539e43a", new Object[]{str, fileInputStream})).intValue();
        }
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            while (i < read) {
                byte b = bArr[i];
                if (b == 10 || i == 0) {
                    if (b == 10) {
                        i++;
                    }
                    for (int i2 = i; i2 < read; i2++) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            break;
                        } else if (i3 == str.length() - 1) {
                            return a(bArr, i2);
                        }
                    }
                    continue;
                }
                i++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
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
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    }
}
