package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class el7 extends Dialog implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final epo f18657a = new epo(Looper.getMainLooper(), this);
    public Message b;
    public Message c;

    static {
        t2o.a(775946250);
    }

    public el7(Context context, int i) {
        super(context, i);
    }

    public static /* synthetic */ Object ipc$super(el7 el7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/oom/Dialog");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 67) {
            ((DialogInterface.OnDismissListener) message.obj).onDismiss(this);
        } else if (i == 68) {
            ((DialogInterface.OnCancelListener) message.obj).onCancel(this);
        }
        return true;
    }

    @Override // android.app.Dialog
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04fa50f", new Object[]{this, onCancelListener});
        } else if (onCancelListener != null) {
            Message obtainMessage = this.f18657a.obtainMessage(68, onCancelListener);
            this.b = obtainMessage;
            setCancelMessage(obtainMessage);
        } else {
            Message message = this.b;
            if (message != null) {
                message.recycle();
            }
            this.b = null;
            setCancelMessage(null);
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else if (onDismissListener != null) {
            Message obtainMessage = this.f18657a.obtainMessage(67, onDismissListener);
            this.c = obtainMessage;
            setDismissMessage(obtainMessage);
        } else {
            Message message = this.c;
            if (message != null) {
                message.recycle();
            }
            this.c = null;
            setDismissMessage(null);
        }
    }
}
