package com.alibaba.android.split.core.splitinstall;

import android.os.RemoteException;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.core.internal.AbstractTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qft;
import tb.t2o;
import tb.ycq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class e extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final qft f2241a;
    private final ycq b;

    static {
        t2o.a(677380242);
    }

    public e(ycq ycqVar, qft qftVar, qft qftVar2) {
        super(qftVar);
        this.b = ycqVar;
        this.f2241a = qftVar2;
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/GetSessionStatesTask");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            ((ISplitInstallService) this.b.b.getIInterface()).getSessionStates(ycq.e(this.b), new SplitInstallGetSessionStatesCallback(this.b, this.f2241a));
        } catch (RemoteException e) {
            ycq.d().d(e, "getSessionStates", new Object[0]);
            this.f2241a.c(new RuntimeException(e));
        }
    }
}
