package tb;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class at8 extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(714080271);
    }

    public at8(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(at8 at8Var, String str, Object... objArr) {
        if (str.hashCode() == -884160602) {
            return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/core/dialog/ExtraDialog");
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb7bcfc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = i3;
        attributes.width = i;
        attributes.height = i2;
        attributes.x = i4;
        attributes.y = i5;
        window.setAttributes(attributes);
    }

    public void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b4aeec", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            c(i, i2, i3, i4, 0, 0);
        }
    }

    public void c(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db53044c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        setContentView(i);
        a(i2, i3, i4, i5, i6);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 25 && keyEvent.getRepeatCount() > 0 && Versions.isDebug()) {
            dismiss();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public at8(Context context, int i) {
        super(context, i);
    }
}
