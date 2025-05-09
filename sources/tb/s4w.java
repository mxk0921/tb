package tb;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Vibrator f27799a;

    static {
        t2o.a(779093545);
    }

    public static void a(Context context) {
        VibrationEffect createOneShot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7260cc9", new Object[]{context});
            return;
        }
        if (f27799a == null) {
            f27799a = (Vibrator) context.getSystemService("vibrator");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = f27799a;
            createOneShot = VibrationEffect.createOneShot(30L, -1);
            vibrator.vibrate(createOneShot);
            return;
        }
        f27799a.vibrate(30L);
    }
}
