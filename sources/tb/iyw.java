package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iyw extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<bcc> f21652a;

    public iyw(bcc bccVar) {
        super(Looper.getMainLooper());
        this.f21652a = new WeakReference<>(bccVar);
    }

    public static /* synthetic */ Object ipc$super(iyw iywVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/util/WeakHandler");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        bcc bccVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        WeakReference<bcc> weakReference = this.f21652a;
        if (weakReference != null && (bccVar = weakReference.get()) != null) {
            bccVar.handleMessage(message);
        }
    }
}
