package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tb.ar4;
import tb.dkf;
import tb.ozm;
import tb.u1a;
import tb.uu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/ozm;", "Ltb/xhv;", "<anonymous>", "(Ltb/ozm;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 1, 2}, l = {107, 112, 113, 115}, m = "invokeSuspend", n = {"observer", "observer", "observer"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements u1a<ozm<? super T>, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ LiveData<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    public int label;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Observer<T> $observer;
        public final /* synthetic */ LiveData<T> $this_asFlow;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<T> liveData, Observer<T> observer, ar4<? super AnonymousClass1> ar4Var) {
            super(2, ar4Var);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/FlowLiveDataConversions$asFlow$1$1");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
            }
            return new AnonymousClass1(this.$this_asFlow, this.$observer, ar4Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
            }
            dkf.d();
            if (this.label == 0) {
                b.b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return xhv.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((AnonymousClass1) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Observer<T> $observer;
        public final /* synthetic */ LiveData<T> $this_asFlow;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, ar4<? super AnonymousClass2> ar4Var) {
            super(2, ar4Var);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/FlowLiveDataConversions$asFlow$1$2");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
            }
            return new AnonymousClass2(this.$this_asFlow, this.$observer, ar4Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
            }
            dkf.d();
            if (this.label == 0) {
                b.b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return xhv.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((AnonymousClass2) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltb/uu4;", "Ltb/xhv;", "<anonymous>", "(Ltb/uu4;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements u1a<uu4, ar4<? super xhv>, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Observer<T> $observer;
        public final /* synthetic */ LiveData<T> $this_asFlow;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LiveData<T> liveData, Observer<T> observer, ar4<? super AnonymousClass3> ar4Var) {
            super(2, ar4Var);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/FlowLiveDataConversions$asFlow$1$3");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
            }
            return new AnonymousClass3(this.$this_asFlow, this.$observer, ar4Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("241f63cb", new Object[]{this, obj});
            }
            dkf.d();
            if (this.label == 0) {
                b.b(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return xhv.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(uu4 uu4Var, ar4<? super xhv> ar4Var) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("de4ace36", new Object[]{this, uu4Var, ar4Var}) : ((AnonymousClass3) create(uu4Var, ar4Var)).invokeSuspend(xhv.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, ar4<? super FlowLiveDataConversions$asFlow$1> ar4Var) {
        super(2, ar4Var);
        this.$this_asFlow = liveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ozm ozmVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb46b6e4", new Object[]{ozmVar, obj});
        } else {
            ozmVar.m(obj);
        }
    }

    public static /* synthetic */ Object ipc$super(FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/FlowLiveDataConversions$asFlow$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, ar4Var);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 2
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.lifecycle.FlowLiveDataConversions$asFlow$1.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "241f63cb"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r10
            r1[r0] = r11
            java.lang.Object r11 = r2.ipc$dispatch(r3, r1)
            return r11
        L_0x0016:
            java.lang.Object r2 = tb.dkf.d()
            int r3 = r10.label
            r4 = 4
            r5 = 3
            r6 = 0
            if (r3 == 0) goto L_0x0057
            if (r3 == r0) goto L_0x004f
            if (r3 == r1) goto L_0x0047
            if (r3 == r5) goto L_0x003a
            if (r3 == r4) goto L_0x0031
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0031:
            java.lang.Object r0 = r10.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.b.b(r11)
            goto L_0x00c9
        L_0x003a:
            java.lang.Object r0 = r10.L$0
            androidx.lifecycle.Observer r0 = (androidx.lifecycle.Observer) r0
            kotlin.b.b(r11)     // Catch: all -> 0x0042
            goto L_0x00a3
        L_0x0042:
            r11 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L_0x00a9
        L_0x0047:
            java.lang.Object r0 = r10.L$0
            androidx.lifecycle.Observer r0 = (androidx.lifecycle.Observer) r0
            kotlin.b.b(r11)     // Catch: all -> 0x0042
            goto L_0x0098
        L_0x004f:
            java.lang.Object r0 = r10.L$0
            androidx.lifecycle.Observer r0 = (androidx.lifecycle.Observer) r0
            kotlin.b.b(r11)
            goto L_0x007e
        L_0x0057:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.L$0
            tb.ozm r11 = (tb.ozm) r11
            tb.fq9 r3 = new tb.fq9
            r3.<init>()
            tb.fzh r11 = tb.zq7.c()
            tb.fzh r11 = r11.N0()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r7 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            androidx.lifecycle.LiveData<T> r8 = r10.$this_asFlow
            r7.<init>(r8, r3, r6)
            r10.L$0 = r3
            r10.label = r0
            java.lang.Object r11 = tb.mn2.c(r11, r7, r10)
            if (r11 != r2) goto L_0x007d
            return r2
        L_0x007d:
            r0 = r3
        L_0x007e:
            tb.fzh r11 = tb.zq7.c()     // Catch: all -> 0x0042
            tb.fzh r11 = r11.N0()     // Catch: all -> 0x0042
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r3 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2     // Catch: all -> 0x0042
            androidx.lifecycle.LiveData<T> r7 = r10.$this_asFlow     // Catch: all -> 0x0042
            r3.<init>(r7, r0, r6)     // Catch: all -> 0x0042
            r10.L$0 = r0     // Catch: all -> 0x0042
            r10.label = r1     // Catch: all -> 0x0042
            java.lang.Object r11 = tb.mn2.c(r11, r3, r10)     // Catch: all -> 0x0042
            if (r11 != r2) goto L_0x0098
            return r2
        L_0x0098:
            r10.L$0 = r0     // Catch: all -> 0x0042
            r10.label = r5     // Catch: all -> 0x0042
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.a(r10)     // Catch: all -> 0x0042
            if (r11 != r2) goto L_0x00a3
            return r2
        L_0x00a3:
            kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: all -> 0x0042
            r11.<init>()     // Catch: all -> 0x0042
            throw r11     // Catch: all -> 0x0042
        L_0x00a9:
            tb.fzh r1 = tb.zq7.c()
            tb.fzh r1 = r1.N0()
            kotlinx.coroutines.o r3 = kotlinx.coroutines.o.INSTANCE
            kotlin.coroutines.d r1 = r1.plus(r3)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3 r3 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3
            androidx.lifecycle.LiveData<T> r5 = r10.$this_asFlow
            r3.<init>(r5, r11, r6)
            r10.L$0 = r0
            r10.label = r4
            java.lang.Object r11 = tb.mn2.c(r1, r3, r10)
            if (r11 != r2) goto L_0x00c9
            return r2
        L_0x00c9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(ozm<? super T> ozmVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c2b37dfd", new Object[]{this, ozmVar, ar4Var}) : ((FlowLiveDataConversions$asFlow$1) create(ozmVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
