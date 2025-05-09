package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597552);
    }

    public static boolean a(View view, float f) {
        int i;
        int i2;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db020401", new Object[]{view, new Float(f)})).booleanValue();
        }
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        if (globalVisibleRect) {
            i = rect.height();
        } else {
            i = 0;
        }
        if (globalVisibleRect) {
            i2 = rect.width();
        } else {
            i2 = 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        if (measuredHeight == 0) {
            f2 = measuredHeight;
        } else {
            f2 = i / measuredHeight;
        }
        if (f2 <= f) {
            if (measuredWidth == 0) {
                f3 = measuredWidth;
            } else {
                f3 = i2 / measuredWidth;
            }
            if (f3 <= f) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(View view, float f) {
        int i;
        int i2;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26d3633b", new Object[]{view, new Float(f)})).booleanValue();
        }
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        if (globalVisibleRect) {
            i = rect.height();
        } else {
            i = 0;
        }
        if (globalVisibleRect) {
            i2 = rect.width();
        } else {
            i2 = 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        if (measuredHeight == 0) {
            f2 = measuredHeight;
        } else {
            f2 = i / measuredHeight;
        }
        if (f2 >= f) {
            if (measuredWidth == 0) {
                f3 = measuredWidth;
            } else {
                f3 = i2 / measuredWidth;
            }
            if (f3 >= f) {
                return true;
            }
        }
        return false;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{str});
        } else {
            ic5.s(h36.TAG, null, "native", "native_crash", f.DX_NATIVE_CRASH_6, str);
        }
    }
}
