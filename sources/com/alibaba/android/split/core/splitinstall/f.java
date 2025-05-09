package com.alibaba.android.split.core.splitinstall;

import android.os.RemoteException;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.core.internal.AbstractTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import tb.qft;
import tb.t2o;
import tb.ycq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class f extends AbstractTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Collection f2242a;
    private final Collection b;
    private final qft c;
    private final ycq d;

    static {
        t2o.a(677380267);
    }

    public f(ycq ycqVar, qft qftVar, Collection collection, Collection collection2, qft qftVar2) {
        this(ycqVar, qftVar, collection, collection2, qftVar2, false);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitinstall/StartInstallTask");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StartInstallTask{requestMoudles=" + this.f2242a + '}';
    }

    public f(ycq ycqVar, qft qftVar, Collection collection, Collection collection2, qft qftVar2, boolean z) {
        super(qftVar);
        this.d = ycqVar;
        this.f2242a = collection;
        this.b = collection2;
        this.c = qftVar2;
        this.silence = z;
    }

    @Override // com.alibaba.android.split.core.internal.AbstractTask
    public final void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            ((ISplitInstallService) this.d.b.getIInterface()).startInstall(ycq.e(this.d), ycq.g(this.f2242a), ycq.b(this.silence), new SplitInstallStartInstallCallback(this.d, this.c));
        } catch (RemoteException e) {
            ycq.d().d(e, "startInstall(%s,%s)", this.f2242a, this.b);
            this.c.c(new RuntimeException(e));
        }
    }
}
