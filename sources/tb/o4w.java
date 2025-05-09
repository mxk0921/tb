package tb;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class o4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o4w INSTANCE = new o4w();

    static {
        t2o.a(481297660);
    }

    @JvmStatic
    public static final void a() {
        VibrationEffect createOneShot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a4b975", new Object[0]);
            return;
        }
        try {
            Object systemService = caa.c().getSystemService("vibrator");
            if (systemService != null) {
                Vibrator vibrator = (Vibrator) systemService;
                if (vibrator.hasVibrator()) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        createOneShot = VibrationEffect.createOneShot(30L, -1);
                        vibrator.vibrate(createOneShot);
                        return;
                    }
                    vibrator.vibrate(30L);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        } catch (Exception unused) {
        }
    }
}
