package tb;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ct8 extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199628);
    }

    public ct8(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ct8 ct8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/widget/ExtraDialog");
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb7bcfc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        Window window = getWindow();
        View decorView = window.getDecorView();
        if (decorView != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = i3;
        attributes.width = i;
        attributes.height = i2;
        attributes.x = i4;
        attributes.y = i5;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(17170445);
        window.clearFlags(131072);
    }

    public void b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af275277", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            c(i, i2, i3, 17);
        }
    }

    public void c(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c36f6c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            d(i, i2, i3, i4, 0, 0);
        }
    }

    public void d(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b3a4cc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        show();
        setContentView(i);
        a(i2, i3, i4, i5, i6);
    }

    public ct8(Context context, int i) {
        super(context, i);
    }
}
