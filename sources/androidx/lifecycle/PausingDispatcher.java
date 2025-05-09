package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineDispatcher;
import tb.ckf;
import tb.pg1;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/PausingDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "Lkotlin/coroutines/d;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/d;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", pg1.ATOM_EXT_block, "Ltb/xhv;", "dispatch", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PausingDispatcher extends CoroutineDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    public static /* synthetic */ Object ipc$super(PausingDispatcher pausingDispatcher, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/PausingDispatcher");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(d dVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7a5d1", new Object[]{this, dVar, runnable});
            return;
        }
        ckf.g(dVar, "context");
        ckf.g(runnable, pg1.ATOM_EXT_block);
        this.dispatchQueue.dispatchAndEnqueue(dVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5da20ff6", new Object[]{this, dVar})).booleanValue();
        }
        ckf.g(dVar, "context");
        if (zq7.c().N0().isDispatchNeeded(dVar)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
