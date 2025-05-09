package kotlinx.coroutines.channels;

import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.dv6;
import tb.hl2;
import tb.k9p;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {Result.ALIPAY_VERIFY_UNREG_NODE_FAILED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class BroadcastChannelImpl$registerSelectForSend$2 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
    final /* synthetic */ Object $element;
    final /* synthetic */ k9p<?> $select;
    int label;
    final /* synthetic */ BroadcastChannelImpl<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$registerSelectForSend$2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, k9p<?> k9pVar, ar4<? super BroadcastChannelImpl$registerSelectForSend$2> ar4Var) {
        super(2, ar4Var);
        this.this$0 = broadcastChannelImpl;
        this.$element = obj;
        this.$select = k9pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        return new BroadcastChannelImpl$registerSelectForSend$2(this.this$0, this.$element, this.$select, ar4Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        Object obj2;
        HashMap hashMap2;
        Object d = dkf.d();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                b.b(obj);
                hl2 hl2Var = this.this$0;
                Object obj3 = this.$element;
                this.label = 1;
                if (hl2Var.d(obj3, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th) {
            if (!this.this$0.f() || (!(th instanceof ClosedSendChannelException) && this.this$0.m0() != th)) {
                throw th;
            }
            z = false;
        }
        ReentrantLock reentrantLock = ((BroadcastChannelImpl) this.this$0).w;
        BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
        k9p<?> k9pVar = this.$select;
        reentrantLock.lock();
        try {
            String str = dv6.DEBUG_PROPERTY_NAME;
            hashMap = ((BroadcastChannelImpl) broadcastChannelImpl).z;
            if (z) {
                obj2 = xhv.INSTANCE;
            } else {
                obj2 = BufferedChannelKt.z();
            }
            hashMap.put(k9pVar, obj2);
            ckf.e(k9pVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            SelectImplementation selectImplementation = (SelectImplementation) k9pVar;
            Object obj4 = xhv.INSTANCE;
            if (((SelectImplementation) k9pVar).y(broadcastChannelImpl, obj4) != TrySelectDetailedResult.REREGISTER) {
                hashMap2 = ((BroadcastChannelImpl) broadcastChannelImpl).z;
                hashMap2.remove(k9pVar);
            }
            reentrantLock.unlock();
            return obj4;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
        return ((BroadcastChannelImpl$registerSelectForSend$2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
