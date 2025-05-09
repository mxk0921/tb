package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.openPushAbility.OpenPushProvider;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ty1 implements OpenPushProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseOpenPushHandler";

    /* renamed from: a  reason: collision with root package name */
    public boolean f29028a = true;
    public final WeakReference<Context> b;

    static {
        t2o.a(295699634);
        t2o.a(610271301);
    }

    public ty1(Context context) {
        this.b = new WeakReference<>(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.b.get();
        if (context == null) {
            o3s.b(TAG, "getContext: null");
        }
        return context;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b(TAG, "setEnabled: " + z);
        this.f29028a = z;
    }
}
