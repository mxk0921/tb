package kotlinx.coroutines.flow;

import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Ltb/sp9;", "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__ZipKt$combineTransformUnsafe$1 extends SuspendLambda implements u1a<sp9<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ qp9<Object>[] $flows;
    final /* synthetic */ w1a<sp9<Object>, Object[], ar4<? super xhv>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Ltb/sp9;", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements w1a<sp9<Object>, Object[], ar4<? super xhv>, Object> {
        final /* synthetic */ w1a<sp9<Object>, Object[], ar4<? super xhv>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(w1a<? super sp9<Object>, ? super Object[], ? super ar4<? super xhv>, ? extends Object> w1aVar, ar4<? super AnonymousClass1> ar4Var) {
            super(3, ar4Var);
            this.$transform = w1aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d = dkf.d();
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                w1a<sp9<Object>, Object[], ar4<? super xhv>, Object> w1aVar = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (w1aVar.invoke((sp9) this.L$0, (Object[]) this.L$1, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return xhv.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((sp9) this.L$0, (Object[]) this.L$1, this);
            return xhv.INSTANCE;
        }

        public final Object invoke(sp9<Object> sp9Var, Object[] objArr, ar4<? super xhv> ar4Var) {
            ckf.l();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(qp9<Object>[] qp9VarArr, w1a<? super sp9<Object>, ? super Object[], ? super ar4<? super xhv>, ? extends Object> w1aVar, ar4<? super FlowKt__ZipKt$combineTransformUnsafe$1> ar4Var) {
        super(2, ar4Var);
        this.$flows = qp9VarArr;
        this.$transform = w1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.$flows, this.$transform, ar4Var);
        flowKt__ZipKt$combineTransformUnsafe$1.L$0 = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            sp9 sp9Var = (sp9) this.L$0;
            FlowKt__ZipKt.b();
            ckf.l();
            throw null;
        } else if (i == 1) {
            b.b(obj);
            return xhv.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        sp9 sp9Var = (sp9) this.L$0;
        FlowKt__ZipKt.b();
        ckf.l();
        throw null;
    }

    public final Object invoke(sp9<Object> sp9Var, ar4<? super xhv> ar4Var) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(sp9Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
