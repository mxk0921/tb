package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import tb.ar4;
import tb.ckf;
import tb.d1a;
import tb.ozm;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/ozm;", "Landroid/graphics/Rect;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements u1a<ozm<? super Rect>, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    public int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 $attachStateChangeListener;
        public final /* synthetic */ View.OnLayoutChangeListener $layoutChangeListener;
        public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1) {
            super(0);
            this.$view = view;
            this.$scrollChangeListener = onScrollChangedListener;
            this.$layoutChangeListener = onLayoutChangeListener;
            this.$attachStateChangeListener = pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            this.$view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
            this.$view.removeOnLayoutChangeListener(this.$layoutChangeListener);
            this.$view.removeOnAttachStateChangeListener(this.$attachStateChangeListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, ar4<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> ar4Var) {
        super(2, ar4Var);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ozm ozmVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86c5a4a", new Object[]{ozmVar, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            ckf.f(view, "v");
            ozmVar.m(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(ozm ozmVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd64e8b", new Object[]{ozmVar, view});
        } else {
            ozmVar.m(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(view));
        }
    }

    public static /* synthetic */ Object ipc$super(PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/activity/PipHintTrackerKt$trackPipAnimationHintView$flow$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, ar4Var);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "241f63cb"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r3[r0] = r8
            java.lang.Object r8 = r1.ipc$dispatch(r2, r3)
            return r8
        L_0x0016:
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r7.label
            if (r2 == 0) goto L_0x002c
            if (r2 != r0) goto L_0x0024
            kotlin.b.b(r8)
            goto L_0x0078
        L_0x0024:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x002c:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.L$0
            tb.ozm r8 = (tb.ozm) r8
            tb.f3m r2 = new tb.f3m
            r2.<init>()
            android.view.View r3 = r7.$view
            tb.g3m r4 = new tb.g3m
            r4.<init>()
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 r5 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
            r5.<init>()
            android.view.View r3 = r7.$view
            boolean r3 = r3.isAttachedToWindow()
            if (r3 == 0) goto L_0x0063
            android.view.View r3 = r7.$view
            android.graphics.Rect r3 = androidx.activity.PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(r3)
            r8.m(r3)
            android.view.View r3 = r7.$view
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            r3.addOnScrollChangedListener(r4)
            android.view.View r3 = r7.$view
            r3.addOnLayoutChangeListener(r2)
        L_0x0063:
            android.view.View r3 = r7.$view
            r3.addOnAttachStateChangeListener(r5)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1 r3 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1
            android.view.View r6 = r7.$view
            r3.<init>(r6, r4, r2, r5)
            r7.label = r0
            java.lang.Object r8 = kotlinx.coroutines.channels.ProduceKt.a(r8, r3, r7)
            if (r8 != r1) goto L_0x0078
            return r1
        L_0x0078:
            tb.xhv r8 = tb.xhv.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm<? super Rect> ozmVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2b37dfd", new Object[]{this, ozmVar, ar4Var}) : ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
