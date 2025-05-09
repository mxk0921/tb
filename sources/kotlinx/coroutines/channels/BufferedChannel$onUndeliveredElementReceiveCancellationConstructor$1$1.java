package kotlinx.coroutines.channels;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.address.themis.ThemisConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import tb.g1a;
import tb.k9p;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"E", "Ltb/k9p;", ThemisConfig.SCENE_SELECT, "", "<anonymous parameter 1>", "element", "Lkotlin/Function1;", "", "Ltb/xhv;", "invoke", "(Ltb/k9p;Ljava/lang/Object;Ljava/lang/Object;)Ltb/g1a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1 extends Lambda implements w1a<k9p<?>, Object, Object, g1a<? super Throwable, ? extends xhv>> {
    final /* synthetic */ BufferedChannel<E> this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<Throwable, xhv> {
        final /* synthetic */ Object $element;
        final /* synthetic */ k9p<?> $select;
        final /* synthetic */ BufferedChannel<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, BufferedChannel<E> bufferedChannel, k9p<?> k9pVar) {
            super(1);
            this.$element = obj;
            this.this$0 = bufferedChannel;
            this.$select = k9pVar;
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
            invoke2(th);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.$element != BufferedChannelKt.z()) {
                OnUndeliveredElementKt.b(this.this$0.b, this.$element, this.$select.getContext());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1(BufferedChannel<E> bufferedChannel) {
        super(3);
        this.this$0 = bufferedChannel;
    }

    public final g1a<Throwable, xhv> invoke(k9p<?> k9pVar, Object obj, Object obj2) {
        return new AnonymousClass1(obj2, this.this$0, k9pVar);
    }
}
