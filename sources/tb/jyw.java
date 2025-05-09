package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jyw extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<ccc> f22296a;

    static {
        t2o.a(806356200);
    }

    public jyw(ccc cccVar) {
        super(Looper.getMainLooper());
        this.f22296a = new WeakReference<>(cccVar);
    }

    public static /* synthetic */ Object ipc$super(jyw jywVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/WeakHandler");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ccc cccVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        WeakReference<ccc> weakReference = this.f22296a;
        if (weakReference != null && (cccVar = weakReference.get()) != null) {
            cccVar.handleMessage(message);
        }
    }
}
