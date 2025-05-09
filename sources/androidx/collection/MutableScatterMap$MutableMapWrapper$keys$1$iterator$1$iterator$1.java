package androidx.collection;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import tb.ar4;
import tb.u1a;
import tb.vbp;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "Ltb/vbp;", "", "Ltb/xhv;", "<anonymous>", "(Ltb/vbp;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1515}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends RestrictedSuspendLambda implements u1a<vbp<? super Integer>, ar4<? super xhv>, Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, ar4<? super MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1> ar4Var) {
        super(2, ar4Var);
        this.this$0 = mutableScatterMap;
    }

    public static /* synthetic */ Object ipc$super(MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ar4<xhv> create(Object obj, ar4<?> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ar4) ipChange.ipc$dispatch("513284d7", new Object[]{this, obj, ar4Var});
        }
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.this$0, ar4Var);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:27:0x00a5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:18:0x0073). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:24:0x009c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0099 -> B:24:0x009c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 0
            r2 = 2
            r3 = 1
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "241f63cb"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            r2[r3] = r21
            java.lang.Object r1 = r4.ipc$dispatch(r5, r2)
            return r1
        L_0x0018:
            java.lang.Object r4 = tb.dkf.d()
            int r5 = r0.label
            r6 = 8
            if (r5 == 0) goto L_0x0042
            if (r5 != r3) goto L_0x003a
            int r2 = r0.I$3
            int r5 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            tb.vbp r12 = (tb.vbp) r12
            kotlin.b.b(r21)
            goto L_0x009c
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            kotlin.b.b(r21)
            java.lang.Object r5 = r0.L$0
            tb.vbp r5 = (tb.vbp) r5
            androidx.collection.MutableScatterMap<K, V> r7 = r0.this$0
            long[] r7 = r7.metadata
            int r8 = r7.length
            int r8 = r8 - r2
            if (r8 < 0) goto L_0x00a9
            r2 = 0
        L_0x0052:
            r9 = r7[r2]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x00a5
            int r11 = r2 - r8
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r5
            r5 = r11
            r11 = r7
            r18 = r9
            r9 = r2
            r10 = r8
            r7 = r18
            r2 = 0
        L_0x0073:
            if (r2 >= r5) goto L_0x009f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x009c
            int r13 = r9 << 3
            int r13 = r13 + r2
            java.lang.Integer r13 = tb.gk2.b(r13)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r5
            r0.I$3 = r2
            r0.label = r3
            java.lang.Object r13 = r12.a(r13, r0)
            if (r13 != r4) goto L_0x009c
            return r4
        L_0x009c:
            long r7 = r7 >> r6
            int r2 = r2 + r3
            goto L_0x0073
        L_0x009f:
            if (r5 != r6) goto L_0x00a9
            r2 = r9
            r8 = r10
            r7 = r11
            r5 = r12
        L_0x00a5:
            if (r2 == r8) goto L_0x00a9
            int r2 = r2 + r3
            goto L_0x0052
        L_0x00a9:
            tb.xhv r1 = tb.xhv.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(vbp<? super Integer> vbpVar, ar4<? super xhv> ar4Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d1c4479a", new Object[]{this, vbpVar, ar4Var}) : ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create(vbpVar, ar4Var)).invokeSuspend(xhv.INSTANCE);
    }
}
