package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n65 extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<isb> f24536a;

    static {
        t2o.a(455081999);
    }

    public n65(Looper looper) {
        super(looper);
    }

    public static /* synthetic */ Object ipc$super(n65 n65Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/common/thread/DTHandler");
    }

    public final isb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (isb) ipChange.ipc$dispatch("5a3c0dd9", new Object[]{this});
        }
        WeakReference<isb> weakReference = this.f24536a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f24536a.get();
    }

    public void b(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0f35f9", new Object[]{this, new Integer(i), obj});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        sendMessage(obtain);
    }

    public void c(isb isbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea35f562", new Object[]{this, isbVar});
        } else {
            this.f24536a = new WeakReference<>(isbVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        isb a2 = a();
        if (a2 != null) {
            a2.handleMessage(message);
        } else {
            removeCallbacksAndMessages(null);
        }
    }
}
