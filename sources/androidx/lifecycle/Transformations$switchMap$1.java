package androidx.lifecycle;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "Y", "value", "Ltb/xhv;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Transformations$switchMap$1 extends Lambda implements g1a<X, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$ObjectRef<LiveData<Y>> $liveData;
    public final /* synthetic */ MediatorLiveData<Y> $result;
    public final /* synthetic */ g1a<X, LiveData<Y>> $transform;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "Ltb/xhv;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<Y, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MediatorLiveData<Y> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.$result = mediatorLiveData;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/Transformations$switchMap$1$1");
        }

        @Override // tb.g1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Y y) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5411b1b", new Object[]{this, y});
            } else {
                this.$result.setValue(y);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$1(g1a<X, LiveData<Y>> g1aVar, Ref$ObjectRef<LiveData<Y>> ref$ObjectRef, MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$transform = g1aVar;
        this.$liveData = ref$ObjectRef;
        this.$result = mediatorLiveData;
    }

    public static /* synthetic */ Object ipc$super(Transformations$switchMap$1 transformations$switchMap$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/Transformations$switchMap$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.g1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(X r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = androidx.lifecycle.Transformations$switchMap$1.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "b5411b1b"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            tb.g1a<X, androidx.lifecycle.LiveData<Y>> r0 = r4.$transform
            java.lang.Object r5 = r0.invoke(r5)
            androidx.lifecycle.LiveData r5 = (androidx.lifecycle.LiveData) r5
            kotlin.jvm.internal.Ref$ObjectRef<androidx.lifecycle.LiveData<Y>> r0 = r4.$liveData
            T r0 = r0.element
            if (r0 == r5) goto L_0x0049
            if (r0 == 0) goto L_0x002f
            androidx.lifecycle.MediatorLiveData<Y> r1 = r4.$result
            tb.ckf.d(r0)
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            r1.removeSource(r0)
        L_0x002f:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.lifecycle.LiveData<Y>> r0 = r4.$liveData
            r0.element = r5
            if (r5 == 0) goto L_0x0049
            androidx.lifecycle.MediatorLiveData<Y> r0 = r4.$result
            tb.ckf.d(r5)
            androidx.lifecycle.Transformations$switchMap$1$1 r1 = new androidx.lifecycle.Transformations$switchMap$1$1
            androidx.lifecycle.MediatorLiveData<Y> r2 = r4.$result
            r1.<init>(r2)
            androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0 r2 = new androidx.lifecycle.Transformations$sam$androidx_lifecycle_Observer$0
            r2.<init>(r1)
            r0.addSource(r5, r2)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Transformations$switchMap$1.invoke2(java.lang.Object):void");
    }
}
