package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.f;
import kotlinx.coroutines.m;
import tb.a07;
import tb.ar4;
import tb.ckf;
import tb.d1a;
import tb.jxq;
import tb.pg1;
import tb.u1a;
import tb.xhv;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BJ\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0015\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "Lkotlin/coroutines/d;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "<init>", "(Lkotlin/coroutines/d;JLtb/u1a;)V", "Landroidx/lifecycle/LiveData;", "source", "Ltb/rr7;", "emitSource$lifecycle_livedata_release", "(Landroidx/lifecycle/LiveData;Ltb/ar4;)Ljava/lang/Object;", "emitSource", "clearSource$lifecycle_livedata_release", "(Ltb/ar4;)Ljava/lang/Object;", "clearSource", "onActive", "()V", "onInactive", "Landroidx/lifecycle/BlockRunner;", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "Landroidx/lifecycle/EmittedSource;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BlockRunner<T> blockRunner;
    private EmittedSource emittedSource;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.CoroutineLiveData$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CoroutineLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoroutineLiveData<T> coroutineLiveData) {
            super(0);
            this.this$0 = coroutineLiveData;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/CoroutineLiveData$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                CoroutineLiveData.access$setBlockRunner$p(this.this$0, null);
            }
        }
    }

    public /* synthetic */ CoroutineLiveData(d dVar, long j, u1a u1aVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i & 2) != 0 ? 5000L : j, u1aVar);
    }

    public static final /* synthetic */ void access$setBlockRunner$p(CoroutineLiveData coroutineLiveData, BlockRunner blockRunner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1309df7", new Object[]{coroutineLiveData, blockRunner});
        } else {
            coroutineLiveData.blockRunner = blockRunner;
        }
    }

    public static /* synthetic */ Object ipc$super(CoroutineLiveData coroutineLiveData, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 287719153) {
            super.onInactive();
            return null;
        } else if (hashCode == 1088384972) {
            super.onActive();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/lifecycle/CoroutineLiveData");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(tb.ar4<? super tb.xhv> r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.lifecycle.CoroutineLiveData.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "131964ea"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            return r6
        L_0x0016:
            boolean r1 = r6 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r1 == 0) goto L_0x0029
            r1 = r6
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r1 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0029
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x002e
        L_0x0029:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r1 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r1.<init>(r5, r6)
        L_0x002e:
            java.lang.Object r6 = r1.result
            java.lang.Object r2 = tb.dkf.d()
            int r3 = r1.label
            if (r3 == 0) goto L_0x004a
            if (r3 != r0) goto L_0x0042
            java.lang.Object r0 = r1.L$0
            androidx.lifecycle.CoroutineLiveData r0 = (androidx.lifecycle.CoroutineLiveData) r0
            kotlin.b.b(r6)
            goto L_0x005d
        L_0x0042:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x004a:
            kotlin.b.b(r6)
            androidx.lifecycle.EmittedSource r6 = r5.emittedSource
            if (r6 == 0) goto L_0x005c
            r1.L$0 = r5
            r1.label = r0
            java.lang.Object r6 = r6.disposeNow(r1)
            if (r6 != r2) goto L_0x005c
            return r2
        L_0x005c:
            r0 = r5
        L_0x005d:
            r6 = 0
            r0.emittedSource = r6
            tb.xhv r6 = tb.xhv.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.clearSource$lifecycle_livedata_release(tb.ar4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData<T> r7, tb.ar4<? super tb.rr7> r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.lifecycle.CoroutineLiveData.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "21b8cb70"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r6
            r4[r1] = r7
            r4[r0] = r8
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            return r7
        L_0x0019:
            boolean r2 = r8 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r2 == 0) goto L_0x002c
            r2 = r8
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r2 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x002c
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x0031
        L_0x002c:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r2 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r2.<init>(r6, r8)
        L_0x0031:
            java.lang.Object r8 = r2.result
            java.lang.Object r3 = tb.dkf.d()
            int r4 = r2.label
            if (r4 == 0) goto L_0x005d
            if (r4 == r1) goto L_0x004f
            if (r4 != r0) goto L_0x0047
            java.lang.Object r7 = r2.L$0
            androidx.lifecycle.CoroutineLiveData r7 = (androidx.lifecycle.CoroutineLiveData) r7
            kotlin.b.b(r8)
            goto L_0x007d
        L_0x0047:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004f:
            java.lang.Object r7 = r2.L$1
            androidx.lifecycle.LiveData r7 = (androidx.lifecycle.LiveData) r7
            java.lang.Object r1 = r2.L$0
            androidx.lifecycle.CoroutineLiveData r1 = (androidx.lifecycle.CoroutineLiveData) r1
            kotlin.b.b(r8)
            r8 = r7
            r7 = r1
            goto L_0x006f
        L_0x005d:
            kotlin.b.b(r8)
            r2.L$0 = r6
            r2.L$1 = r7
            r2.label = r1
            java.lang.Object r8 = r6.clearSource$lifecycle_livedata_release(r2)
            if (r8 != r3) goto L_0x006d
            return r3
        L_0x006d:
            r8 = r7
            r7 = r6
        L_0x006f:
            r2.L$0 = r7
            r1 = 0
            r2.L$1 = r1
            r2.label = r0
            java.lang.Object r8 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r7, r8, r2)
            if (r8 != r3) goto L_0x007d
            return r3
        L_0x007d:
            androidx.lifecycle.EmittedSource r8 = (androidx.lifecycle.EmittedSource) r8
            r7.emittedSource = r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData, tb.ar4):java.lang.Object");
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40df6fcc", new Object[]{this});
            return;
        }
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11263ef1", new Object[]{this});
            return;
        }
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    public CoroutineLiveData(d dVar, long j, u1a<? super LiveDataScope<T>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        ckf.g(dVar, "context");
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        this.blockRunner = new BlockRunner<>(this, u1aVar, j, f.a(zq7.c().N0().plus(dVar).plus(jxq.a((m) dVar.get(m.Key)))), new AnonymousClass1(this));
    }
}
