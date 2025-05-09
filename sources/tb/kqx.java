package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f22860a = 0;
    public static int b = 0;
    public static final HashMap<String, String> c = new HashMap<>();

    static {
        t2o.a(962593016);
    }

    public static synchronized boolean a(String str, boolean z) {
        synchronized (kqx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ec54e33", new Object[]{str, new Boolean(z)})).booleanValue();
            } else if (TextUtils.isEmpty(str)) {
                return false;
            } else {
                if (z) {
                    if (str.length() > 1024) {
                        return false;
                    }
                } else if (str.length() > 256) {
                    return false;
                }
                if (f22860a + str.length() > 32768) {
                    return false;
                }
                return true;
            }
        }
    }

    public static synchronized void b() {
        synchronized (kqx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[0]);
                return;
            }
            c.clear();
            f22860a = 0;
            b = 0;
        }
    }

    public static synchronized byte[] c(String str) throws IOException {
        synchronized (kqx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("c9f7f617", new Object[]{str});
            }
            return d(str, false);
        }
    }

    public static synchronized byte[] d(String str, boolean z) throws IOException {
        int i;
        synchronized (kqx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("751c5a8f", new Object[]{str, new Boolean(z)});
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (a(str, z)) {
                try {
                    i = Integer.parseInt(c.get(str));
                } catch (Exception unused) {
                    i = -1;
                }
                if (i >= 0) {
                    byteArrayOutputStream.write(g(1, i));
                } else {
                    h(str);
                    byteArrayOutputStream.write(g(2, str.getBytes().length));
                    byteArrayOutputStream.write(str.getBytes());
                }
            } else if (TextUtils.isEmpty(str)) {
                byteArrayOutputStream.write(g(3, 0));
            } else {
                byteArrayOutputStream.write(g(3, str.getBytes().length));
                byteArrayOutputStream.write(str.getBytes());
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return byteArray;
        }
    }

    public static synchronized byte[] e(String str) throws IOException {
        synchronized (kqx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("da861d17", new Object[]{str});
            }
            return d(str, true);
        }
    }

    public static byte[] f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("223f39b0", new Object[]{new Integer(i)});
        }
        return g(0, i);
    }

    public static byte[] g(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("25b5cfc7", new Object[]{new Integer(i), new Integer(i2)});
        }
        int i3 = 1 << (8 - i);
        byte b2 = (byte) i3;
        int i4 = i3 - 1;
        if (i2 < i4) {
            return kp2.c(i2 | b2);
        }
        byte[] bArr = new byte[5];
        bArr[0] = (byte) ((b2 | i4) & 255);
        int i5 = i2 - i4;
        int i6 = 1;
        while (i5 >= 128) {
            bArr[i6] = (byte) (((i5 % 128) | 128) & 255);
            i5 /= 128;
            i6++;
        }
        bArr[i6] = (byte) (i5 & 127);
        return kp2.g(bArr, 0, i6 + 1);
    }

    public static synchronized void h(String str) {
        synchronized (kqx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("772ca860", new Object[]{str});
                return;
            }
            c.put(str, String.valueOf(b));
            f22860a += str.length();
            b++;
        }
    }
}
