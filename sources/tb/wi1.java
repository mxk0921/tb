package tb;

import android.content.Context;
import android.media.AudioManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wi1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714563);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7922e238", new Object[]{context})).intValue();
        }
        try {
            int streamVolume = ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
            ir9.b("tab3MuteUpgrade", "当前音量:" + streamVolume);
            return streamVolume;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c01869a", new Object[]{context})).booleanValue();
        }
        if (a(context) > 0) {
            return true;
        }
        return false;
    }
}
