package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w1u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(153092152);
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
            return ((Number) ipChange.ipc$dispatch("9ec18a00", new Object[]{new Integer(i)})).intValue();
        }
        try {
            return FestivalMgr.i().h(GloblaNavUIConfig.KEY_GLOBAL_ACTIONBAR_TEXT_COLOR, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9029a2c", new Object[]{new Integer(i)})).intValue();
        }
        return (i >> 8) & 255;
    }

    public static boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa816dbd", new Object[]{new Integer(i)})).booleanValue();
        }
        if ((e(i) * 0.299d) + (c(i) * 0.587d) + (a(i) * 0.114d) < 192.0d) {
            return true;
        }
        return false;
    }

    public static int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce5b795e", new Object[]{new Integer(i)})).intValue();
        }
        return (i >> 16) & 255;
    }
}
