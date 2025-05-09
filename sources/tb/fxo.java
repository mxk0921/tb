package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199591);
    }

    public static int a(Activity activity) {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a70058bc", new Object[]{activity})).intValue();
        }
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return Math.max(0, (b(activity) - rect.top) - rect.height());
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f1e58d", new Object[]{context})).intValue();
        }
        Point point = new Point();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static float c(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f140d", new Object[]{context})).floatValue();
        }
        if (ykl.a()) {
            return d7r.f(context, true);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (context.getResources().getConfiguration().orientation == 1) {
            i = displayMetrics.widthPixels;
        } else {
            i = displayMetrics.heightPixels;
        }
        return i;
    }
}
