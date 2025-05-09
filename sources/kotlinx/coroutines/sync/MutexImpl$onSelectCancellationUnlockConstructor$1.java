package kotlinx.coroutines.sync;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.k9p;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Ltb/k9p;", "<anonymous parameter 0>", "", "owner", "<anonymous parameter 2>", "Lkotlin/Function1;", "", "Ltb/xhv;", "invoke", "(Ltb/k9p;Ljava/lang/Object;Ljava/lang/Object;)Ltb/g1a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class MutexImpl$onSelectCancellationUnlockConstructor$1 extends Lambda implements w1a<k9p<?>, Object, Object, g1a<? super Throwable, ? extends xhv>> {
    final /* synthetic */ MutexImpl this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<Throwable, xhv> {
        final /* synthetic */ Object $owner;
        final /* synthetic */ MutexImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutexImpl mutexImpl, Object obj) {
            super(1);
            this.this$0 = mutexImpl;
            this.$owner = obj;
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
            invoke2(th);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.this$0.unlock(this.$owner);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexImpl$onSelectCancellationUnlockConstructor$1(MutexImpl mutexImpl) {
        super(3);
        this.this$0 = mutexImpl;
    }

    public final g1a<Throwable, xhv> invoke(k9p<?> k9pVar, Object obj, Object obj2) {
        return new AnonymousClass1(this.this$0, obj);
    }
}
