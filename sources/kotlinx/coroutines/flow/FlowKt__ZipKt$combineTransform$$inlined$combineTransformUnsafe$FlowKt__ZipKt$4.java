package kotlinx.coroutines.flow;

import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.CombineKt;
import tb.ar4;
import tb.c2a;
import tb.d1a;
import tb.dkf;
import tb.qp9;
import tb.sp9;
import tb.u1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Ltb/sp9;", "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 extends SuspendLambda implements u1a<sp9<Object>, ar4<? super xhv>, Object> {
    final /* synthetic */ qp9[] $flows;
    final /* synthetic */ c2a $transform$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Ltb/sp9;", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "<anonymous>", "(Ltb/sp9;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements w1a<sp9<Object>, Object[], ar4<? super xhv>, Object> {
        final /* synthetic */ c2a $transform$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ar4 ar4Var, c2a c2aVar) {
            super(3, ar4Var);
            this.$transform$inlined = c2aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d = dkf.d();
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                sp9 sp9Var = (sp9) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                c2a c2aVar = this.$transform$inlined;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.label = 1;
                if (c2aVar.invoke(sp9Var, obj2, obj3, obj4, obj5, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return xhv.INSTANCE;
        }

        public final Object invoke(sp9<Object> sp9Var, Object[] objArr, ar4<? super xhv> ar4Var) {
            AnonymousClass1 r0 = new AnonymousClass1(ar4Var, this.$transform$inlined);
            r0.L$0 = sp9Var;
            r0.L$1 = objArr;
            return r0.invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(qp9[] qp9VarArr, ar4 ar4Var, c2a c2aVar) {
        super(2, ar4Var);
        this.$flows = qp9VarArr;
        this.$transform$inlined = c2aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(this.$flows, ar4Var, this.$transform$inlined);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4.L$0 = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d1a b;
        Object d = dkf.d();
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qp9[] qp9VarArr = this.$flows;
            b = FlowKt__ZipKt.b();
            AnonymousClass1 r4 = new AnonymousClass1(null, this.$transform$inlined);
            this.label = 1;
            if (CombineKt.a((sp9) this.L$0, qp9VarArr, b, r4, this) == d) {
                return d;
            }
        } else if (i == 1) {
            b.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return xhv.INSTANCE;
    }

    public final Object invoke(sp9<Object> sp9Var, ar4<? super xhv> ar4Var) {
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4) create(sp9Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
