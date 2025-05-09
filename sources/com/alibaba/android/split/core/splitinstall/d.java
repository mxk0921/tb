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
public final class d extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f2240a;
    private final qft b;
    private final ycq c;

    static {
        t2o.a(677380241);
    }

    public d(ycq ycqVar, qft qftVar, int i, qft qftVar2) {
        super(qftVar);
        this.c = ycqVar;
        this.f2240a = i;
        this.b = qftVar2;
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/GetSessionStateTask");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            ((ISplitInstallService) this.c.b.getIInterface()).getSessionState(ycq.e(this.c), this.f2240a, new SplitInstallGetSessionCallback(this.c, this.b));
        } catch (RemoteException e) {
            ycq.d().d(e, "getSessionState(%d)", Integer.valueOf(this.f2240a));
            this.b.c(new RuntimeException(e));
        }
    }
}
