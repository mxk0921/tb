package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Point[] f24986a = new Point[2];
    public static Boolean b;

    static {
        t2o.a(295699241);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abda1bc1", new Object[]{new Float(f)})).intValue();
        }
        return w2s.a(f);
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbd79e28", new Object[]{new Float(f)})).intValue();
        }
        return Math.round(Math.min(h(), g()) * (f / 375.0f));
    }

    public static int c(DinamicXEngine dinamicXEngine, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4df2987", new Object[]{dinamicXEngine, context, new Float(f)})).intValue();
        }
        if (b == null) {
            b = Boolean.valueOf(vc.j(context));
        }
        if (b.booleanValue()) {
            return pb6.d(dinamicXEngine, context, f);
        }
        return b(f);
    }

    public static int d(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return w2s.c(context, f);
    }

    public static int e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f381e299", new Object[]{new Boolean(z)})).intValue();
        }
        Point[] pointArr = f24986a;
        if (pointArr[z ? 1 : 0] == null) {
            WindowManager windowManager = (WindowManager) v2s.o().f().getApplication().getSystemService(pg1.ATOM_EXT_window);
            if (windowManager == null) {
                return g();
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            pointArr[z] = point;
        }
        return pointArr[z].y;
    }

    public static int f(Context context) {
        Object systemService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81a7147b", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            return g();
        }
        systemService = context.getSystemService(WindowManager.class);
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return i3s.c();
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return i3s.f();
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caa908b3", new Object[]{context})).booleanValue();
        }
        if ((vc.i(context) || vc.d(context)) && vc.f(context)) {
            return true;
        }
        return false;
    }

    public static int j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            hha.b("AndroidUtils", "parseColor | e=" + e.getMessage());
            return -1;
        }
    }
}
