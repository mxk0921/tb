package com.alibaba.android.split.core.splitinstall;

import android.os.RemoteException;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.core.internal.AbstractTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.qft;
import tb.t2o;
import tb.ycq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class c extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f2239a;
    private final qft b;
    private final ycq c;

    static {
        t2o.a(677380238);
    }

    public c(ycq ycqVar, qft qftVar, List<String> list, qft qftVar2) {
        super(qftVar);
        this.c = ycqVar;
        this.f2239a = list;
        this.b = qftVar2;
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/DeferredUninstallTask");
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            ((ISplitInstallService) this.c.b.getIInterface()).deferredUninstall(ycq.e(this.c), ycq.g(this.f2239a), ycq.b(this.silence), new SplitInstallDeferredUninstallCallback(this.c, this.b));
        } catch (RemoteException e) {
            ycq.d().d(e, "deferredUninstall(%s)", this.f2239a);
            this.b.c(new RuntimeException(e));
        }
    }
}
