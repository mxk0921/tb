package androidx.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.ckf;
import tb.d1a;
import tb.nn2;
import tb.pg1;
import tb.u1a;
import tb.uu4;
import tb.xhv;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bb\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0002\b\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R;\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/BlockRunner;", "T", "", "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Ltb/ar4;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "", "timeoutInMs", "Ltb/uu4;", Constants.Name.SCOPE, "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Ltb/u1a;JLtb/uu4;Ltb/d1a;)V", "maybeRun", "()V", "cancel", "Landroidx/lifecycle/CoroutineLiveData;", "Ltb/u1a;", "J", "Ltb/uu4;", "Ltb/d1a;", "Lkotlinx/coroutines/m;", "runningJob", "Lkotlinx/coroutines/m;", "cancellationJob", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class BlockRunner<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final u1a<LiveDataScope<T>, ar4<? super xhv>, Object> block;
    private m cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final d1a<xhv> onDone;
    private m runningJob;
    private final uu4 scope;
    private final long timeoutInMs;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(CoroutineLiveData<T> coroutineLiveData, u1a<? super LiveDataScope<T>, ? super ar4<? super xhv>, ? extends Object> u1aVar, long j, uu4 uu4Var, d1a<xhv> d1aVar) {
        ckf.g(coroutineLiveData, "liveData");
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        ckf.g(uu4Var, Constants.Name.SCOPE);
        ckf.g(d1aVar, "onDone");
        this.liveData = coroutineLiveData;
        this.block = u1aVar;
        this.timeoutInMs = j;
        this.scope = uu4Var;
        this.onDone = d1aVar;
    }

    public static final /* synthetic */ u1a access$getBlock$p(BlockRunner blockRunner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("df978134", new Object[]{blockRunner});
        }
        return blockRunner.block;
    }

    public static final /* synthetic */ CoroutineLiveData access$getLiveData$p(BlockRunner blockRunner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CoroutineLiveData) ipChange.ipc$dispatch("e743ff66", new Object[]{blockRunner});
        }
        return blockRunner.liveData;
    }

    public static final /* synthetic */ d1a access$getOnDone$p(BlockRunner blockRunner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("5eab7556", new Object[]{blockRunner});
        }
        return blockRunner.onDone;
    }

    public static final /* synthetic */ m access$getRunningJob$p(BlockRunner blockRunner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("f1477ac0", new Object[]{blockRunner});
        }
        return blockRunner.runningJob;
    }

    public static final /* synthetic */ long access$getTimeoutInMs$p(BlockRunner blockRunner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9de5d7ba", new Object[]{blockRunner})).longValue();
        }
        return blockRunner.timeoutInMs;
    }

    public static final /* synthetic */ void access$setRunningJob$p(BlockRunner blockRunner, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c1943e", new Object[]{blockRunner, mVar});
        } else {
            blockRunner.runningJob = mVar;
        }
    }

    public final void cancel() {
        m b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.cancellationJob == null) {
            b = nn2.b(this.scope, zq7.c().N0(), null, new BlockRunner$cancel$1(this, null), 2, null);
            this.cancellationJob = b;
        } else {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
    }

    public final void maybeRun() {
        m b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a594680a", new Object[]{this});
            return;
        }
        m mVar = this.cancellationJob;
        if (mVar != null) {
            m.a.b(mVar, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob == null) {
            b = nn2.b(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
            this.runningJob = b;
        }
    }
}
