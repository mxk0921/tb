package tb;

import android.content.Context;
import android.graphics.Point;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ivo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f21602a;
    public static int b;

    static {
        t2o.a(626000050);
    }

    public static Pair<Integer, Integer> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a41e0848", new Object[]{context});
        }
        if (f21602a > 0 && b > 0) {
            return new Pair<>(Integer.valueOf(f21602a), Integer.valueOf(b));
        }
        if (context != null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f21602a = point.x;
            b = point.y;
        }
        wdm.d("ScreenInfo.getScreenSize.mScreenWidth=%s.mScreenHeight=%s", Integer.valueOf(f21602a), Integer.valueOf(b));
        return new Pair<>(Integer.valueOf(f21602a), Integer.valueOf(b));
    }
}
