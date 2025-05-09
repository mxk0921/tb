package kotlinx.coroutines.flow;

import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.sp9;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltb/sp9;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;I)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, WSContextConstant.HANDSHAKE_RECEIVE_SIZE}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements w1a<sp9<? super SharingCommand>, Integer, ar4<? super xhv>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, ar4<? super StartedWhileSubscribed$command$1> ar4Var) {
        super(3, ar4Var);
        this.this$0 = startedWhileSubscribed;
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ Object invoke(sp9<? super SharingCommand> sp9Var, Integer num, ar4<? super xhv> ar4Var) {
        return invoke(sp9Var, num.intValue(), ar4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r9.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r6) goto L_0x0038
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            goto L_0x0038
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0020:
            java.lang.Object r1 = r9.L$0
            tb.sp9 r1 = (tb.sp9) r1
            kotlin.b.b(r10)
            goto L_0x008e
        L_0x0028:
            java.lang.Object r1 = r9.L$0
            tb.sp9 r1 = (tb.sp9) r1
            kotlin.b.b(r10)
            goto L_0x007d
        L_0x0030:
            java.lang.Object r1 = r9.L$0
            tb.sp9 r1 = (tb.sp9) r1
            kotlin.b.b(r10)
            goto L_0x0064
        L_0x0038:
            kotlin.b.b(r10)
            goto L_0x009c
        L_0x003c:
            kotlin.b.b(r10)
            java.lang.Object r10 = r9.L$0
            r1 = r10
            tb.sp9 r1 = (tb.sp9) r1
            int r10 = r9.I$0
            if (r10 <= 0) goto L_0x0053
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
            r9.label = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x009c
            return r0
        L_0x0053:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r6 = kotlinx.coroutines.flow.StartedWhileSubscribed.c(r10)
            r9.L$0 = r1
            r9.label = r5
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r6, r9)
            if (r10 != r0) goto L_0x0064
            return r0
        L_0x0064:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r5 = kotlinx.coroutines.flow.StartedWhileSubscribed.b(r10)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x008e
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
            r9.L$0 = r1
            r9.label = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x007d
            return r0
        L_0x007d:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.b(r10)
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r4, r9)
            if (r10 != r0) goto L_0x008e
            return r0
        L_0x008e:
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r9.L$0 = r3
            r9.label = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x009c
            return r0
        L_0x009c:
            tb.xhv r10 = tb.xhv.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(sp9<? super SharingCommand> sp9Var, int i, ar4<? super xhv> ar4Var) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, ar4Var);
        startedWhileSubscribed$command$1.L$0 = sp9Var;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(xhv.INSTANCE);
    }
}
