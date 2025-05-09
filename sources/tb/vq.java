package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s2d f30168a;

    static {
        t2o.a(144703516);
    }

    public vq(s2d s2dVar) {
        ckf.g(s2dVar, DataReceiveMonitor.CB_LISTENER);
        this.f30168a = s2dVar;
    }

    public final void a(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2930b5", new Object[]{this, executeResult});
            return;
        }
        ckf.g(executeResult, "result");
        this.f30168a.onCallback(executeResult);
    }

    public final void b(ErrorResult errorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123ed96a", new Object[]{this, errorResult});
            return;
        }
        ckf.g(errorResult, "result");
        this.f30168a.onCallback(errorResult);
    }

    public final void c(FinishResult finishResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa74066", new Object[]{this, finishResult});
            return;
        }
        ckf.g(finishResult, "result");
        this.f30168a.onCallback(finishResult);
    }

    public final void d(ExecutingResult executingResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229acb3", new Object[]{this, executingResult});
            return;
        }
        ckf.g(executingResult, "result");
        this.f30168a.onCallback(executingResult);
    }
}
