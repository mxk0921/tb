package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kyw extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<dcc> f23008a;

    static {
        t2o.a(806356531);
    }

    public kyw(dcc dccVar) {
        super(Looper.getMainLooper());
        this.f23008a = new WeakReference<>(dccVar);
    }

    public static /* synthetic */ Object ipc$super(kyw kywVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/common/WeakHandler");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        dcc dccVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        WeakReference<dcc> weakReference = this.f23008a;
        if (weakReference != null && (dccVar = weakReference.get()) != null) {
            dccVar.handleMessage(message);
        }
    }
}
