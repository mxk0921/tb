package tb;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bt8 extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499368);
    }

    public bt8(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(bt8 bt8Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2012646654) {
            super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/sku/widget/ExtraDialog");
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b405587", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = i3;
        attributes.width = i;
        attributes.height = i2;
        attributes.x = i4;
        attributes.y = i5;
        attributes.windowAnimations = i6;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(17170445);
        window.clearFlags(131072);
        if (getWindow() != null) {
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
    }

    public void b(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af5503d", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            c(view, i, i2, i3, 0, 0);
        }
    }

    public void c(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f0955d", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            d(view, i, i2, i3, i4, i5, 16973826);
        }
    }

    public void d(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb228946", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        setContentView(view);
        a(i, i2, i3, i4, i5, i6);
        show();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    public bt8(Context context, int i) {
        super(context, i);
    }
}
