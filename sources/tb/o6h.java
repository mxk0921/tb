package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o6h extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809181);
    }

    public o6h(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(o6h o6hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/LoadingDialog");
    }

    public final int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{this, context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4330260", new Object[]{this});
        } else {
            e(-1, -1, 17, true);
        }
    }

    public void d(int i, int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ed5351", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
        } else {
            f(i, i2, i3, i4, i5, z);
        }
    }

    public void e(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea313af1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        } else {
            d(i, i2, i3, 0, 0, z);
        }
    }

    public final void f(int i, int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b409558", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
            return;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = i3;
        attributes.width = i;
        attributes.height = i2;
        attributes.dimAmount = 0.0f;
        attributes.x = i4;
        attributes.y = i5;
        window.setAttributes(attributes);
        if (z) {
            int a2 = a(getContext());
            int b = b(getContext());
            int i6 = a2 - b;
            if (a2 > 0 && b > 0 && i6 > 0) {
                getWindow().setLayout(-1, i6);
            }
        }
    }

    public o6h(Context context, int i) {
        super(context, i);
    }

    public final int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{this, context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
