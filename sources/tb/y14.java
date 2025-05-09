package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y14 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538189);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("715f7735", new Object[]{new Integer(i)})).intValue();
        }
        return i & 255;
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9029a2c", new Object[]{new Integer(i)})).intValue();
        }
        return (i >> 8) & 255;
    }

    public static boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aad1509", new Object[]{new Integer(i)})).booleanValue();
        }
        if ((d(i) * 0.299d) + (b(i) * 0.587d) + (a(i) * 0.114d) >= 192.0d) {
            return true;
        }
        return false;
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce5b795e", new Object[]{new Integer(i)})).intValue();
        }
        return (i >> 16) & 255;
    }
}
