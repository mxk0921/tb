package tb;

import android.os.IBinder;
import android.os.IInterface;
import com.alibaba.android.split.core.internal.BinderCreator;
import com.alibaba.android.split.core.internal.SplitInstallServiceStub;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zcq implements BinderCreator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BinderCreator INSTANCE = new zcq();

    static {
        t2o.a(677380257);
        t2o.a(677380130);
    }

    /* renamed from: a */
    public final IInterface createBinder(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInterface) ipChange.ipc$dispatch("9e4c80ea", new Object[]{this, iBinder});
        }
        return SplitInstallServiceStub.asInterface(iBinder);
    }
}
