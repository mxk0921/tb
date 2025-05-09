package kotlinx.coroutines.flow;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.gk2;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class StartedWhileSubscribed$command$2 extends SuspendLambda implements u1a<SharingCommand, ar4<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public StartedWhileSubscribed$command$2(ar4<? super StartedWhileSubscribed$command$2> ar4Var) {
        super(2, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(ar4Var);
        startedWhileSubscribed$command$2.L$0 = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        dkf.d();
        if (this.label == 0) {
            b.b(obj);
            if (((SharingCommand) this.L$0) != SharingCommand.START) {
                z = true;
            } else {
                z = false;
            }
            return gk2.a(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(SharingCommand sharingCommand, ar4<? super Boolean> ar4Var) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
