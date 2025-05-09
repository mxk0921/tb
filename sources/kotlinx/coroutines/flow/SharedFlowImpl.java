package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.c;
import kotlinx.coroutines.channels.BufferOverflow;
import tb.ar4;
import tb.bmv;
import tb.ckf;
import tb.dkf;
import tb.dlp;
import tb.dv6;
import tb.elp;
import tb.eme;
import tb.gfj;
import tb.jv6;
import tb.l30;
import tb.m30;
import tb.n30;
import tb.o2a;
import tb.pg1;
import tb.qp9;
import tb.rr7;
import tb.s23;
import tb.sp9;
import tb.t23;
import tb.u1r;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001BB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0015J\u0019\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u00010\u001a2\u0006\u00106\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b9\u0010:J3\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001e2\u0014\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001eH\u0002¢\u0006\u0004\b=\u0010>J!\u0010B\u001a\u00020A2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0096@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bD\u0010\u0011J\u001b\u0010E\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\bE\u0010%J\u000f\u0010F\u001a\u00020\u0016H\u0000¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010;0\u001e2\u0006\u0010H\u001a\u00020\u0016H\u0000¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0003H\u0014¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010M\u001a\u00020\u0007H\u0014¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010\u0015J-\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000T2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR \u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0014R\u0016\u0010e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\u0014R\u0014\u0010g\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010GR\u0014\u0010i\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010hR\u0014\u0010k\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0014\u0010m\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010GR\u0014\u0010o\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010GR\u001a\u0010s\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\br\u0010\u0015\u001a\u0004\bp\u0010qR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006x"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Ltb/l30;", "Ltb/elp;", "Ltb/gfj;", "Ltb/t23;", "Ltb/o2a;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "value", "", "W", "(Ljava/lang/Object;)Z", "X", "Ltb/xhv;", TLogTracker.LEVEL_INFO, "()V", "", "newHead", UTConstant.Args.UT_SUCCESS_F, "(J)V", "", "item", "L", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", "V", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "K", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlowImpl$a;", "emitter", "C", "(Lkotlinx/coroutines/flow/SharedFlowImpl$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "a0", "(JJJJ)V", TLogTracker.LEVEL_DEBUG, "slot", "Z", "(Ltb/elp;)Ljava/lang/Object;", "Y", "(Ltb/elp;)J", "index", "R", "(J)Ljava/lang/Object;", "B", "(Ltb/elp;Ltb/ar4;)Ljava/lang/Object;", "Ltb/ar4;", "resumesIn", "M", "([Ltb/ar4;)[Ltb/ar4;", "Ltb/sp9;", "collector", "", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "d", "emit", "c0", "()J", "oldIndex", "b0", "(J)[Ltb/ar4;", "G", "()Ltb/elp;", "size", "H", "(I)[Ltb/elp;", "c", "Lkotlin/coroutines/d;", "context", "capacity", "Ltb/qp9;", "f", "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ltb/qp9;", "e", at.f, "Lkotlinx/coroutines/channels/BufferOverflow;", "h", "[Ljava/lang/Object;", pg1.ATOM_EXT_buffer, bmv.MSGTYPE_INTERVAL, "J", "replayIndex", at.j, "minCollectorIndex", at.k, "bufferSize", "l", "queueSize", "O", eme.IMAGE_TYPE_HEAD, "()I", "replaySize", "U", "totalSize", "N", "bufferEndIndex", ExifInterface.LATITUDE_SOUTH, "queueEndIndex", "P", "()Ljava/lang/Object;", "Q", "lastReplayedLocked", "", TplMsg.VALUE_T_NATIVE_RETURN, "()Ljava/util/List;", "replayCache", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SharedFlowImpl<T> extends l30<elp> implements gfj<T>, t23<T>, o2a<T> {
    private final int e;
    private final int f;
    private final BufferOverflow g;
    private Object[] h;
    private long i;
    private long j;
    private int k;
    private int l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements rr7 {

        /* renamed from: a  reason: collision with root package name */
        public final SharedFlowImpl<?> f15352a;
        public final long b;
        public final Object c;
        public final ar4<xhv> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(SharedFlowImpl<?> sharedFlowImpl, long j, Object obj, ar4<? super xhv> ar4Var) {
            this.f15352a = sharedFlowImpl;
            this.b = j;
            this.c = obj;
            this.d = ar4Var;
        }

        @Override // tb.rr7
        public void dispose() {
            this.f15352a.C(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.e = i;
        this.f = i2;
        this.g = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(elp elpVar, ar4<? super xhv> ar4Var) {
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        synchronized (this) {
            try {
                if (Y(elpVar) < 0) {
                    elpVar.b = cVar;
                } else {
                    cVar.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (A == dkf.d()) {
            return A;
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(a aVar) {
        synchronized (this) {
            if (aVar.b >= O()) {
                Object[] objArr = this.h;
                ckf.d(objArr);
                if (dlp.a(objArr, aVar.b) == aVar) {
                    dlp.b(objArr, aVar.b, dlp.NO_VALUE);
                    D();
                    xhv xhvVar = xhv.INSTANCE;
                }
            }
        }
    }

    private final void D() {
        if (this.f != 0 || this.l > 1) {
            Object[] objArr = this.h;
            ckf.d(objArr);
            while (this.l > 0 && dlp.a(objArr, (O() + U()) - 1) == dlp.NO_VALUE) {
                this.l--;
                dlp.b(objArr, O() + U(), null);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(2:4|(7:6|8|(3:(6:(1:(1:13)(2:16|17))(1:18)|55|14|19|64|(3:35|(3:60|37|(2:57|39)(1:62))(4:58|(1:43)|44|(2:59|46)(1:63))|61))(4:20|51|21|22)|47|48)(5:25|53|26|(2:28|(1:30))|33)|49|34|64|(3:35|(0)(0)|61)))|7|8|(0)(0)|49|34|64|(3:35|(0)(0)|61)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <T> java.lang.Object E(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, tb.sp9<? super T> r9, tb.ar4<?> r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.E(kotlinx.coroutines.flow.SharedFlowImpl, tb.sp9, tb.ar4):java.lang.Object");
    }

    private final void F(long j) {
        n30[] h;
        if (!(l30.g(this) == 0 || (h = l30.h(this)) == null)) {
            for (n30 n30Var : h) {
                if (n30Var != null) {
                    elp elpVar = (elp) n30Var;
                    long j2 = elpVar.f18664a;
                    if (j2 >= 0 && j2 < j) {
                        elpVar.f18664a = j;
                    }
                }
            }
        }
        this.j = j;
    }

    private final void I() {
        Object[] objArr = this.h;
        ckf.d(objArr);
        dlp.b(objArr, O(), null);
        this.k--;
        long O = O() + 1;
        if (this.i < O) {
            this.i = O;
        }
        if (this.j < O) {
            F(O);
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
    }

    public static /* synthetic */ <T> Object J(SharedFlowImpl<T> sharedFlowImpl, T t, ar4<? super xhv> ar4Var) {
        if (sharedFlowImpl.d(t)) {
            return xhv.INSTANCE;
        }
        Object K = sharedFlowImpl.K(t, ar4Var);
        if (K == dkf.d()) {
            return K;
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K(T t, ar4<? super xhv> ar4Var) {
        ar4<xhv>[] ar4VarArr;
        a aVar;
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        ar4<xhv>[] ar4VarArr2 = m30.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (W(t)) {
                    cVar.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
                    ar4VarArr = M(ar4VarArr2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, U() + O(), t, cVar);
                    L(aVar2);
                    this.l++;
                    if (this.f == 0) {
                        ar4VarArr2 = M(ar4VarArr2);
                    }
                    ar4VarArr = ar4VarArr2;
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            s23.a(cVar, aVar);
        }
        for (ar4<xhv> ar4Var2 : ar4VarArr) {
            if (ar4Var2 != null) {
                ar4Var2.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
            }
        }
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (A == dkf.d()) {
            return A;
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Object obj) {
        int U = U();
        Object[] objArr = this.h;
        if (objArr == null) {
            objArr = V(null, 0, 2);
        } else if (U >= objArr.length) {
            objArr = V(objArr, U, objArr.length * 2);
        }
        dlp.b(objArr, O() + U, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.ar4<tb.xhv>[] M(tb.ar4<tb.xhv>[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            int r1 = tb.l30.g(r11)
            if (r1 == 0) goto L_0x0048
            tb.n30[] r1 = tb.l30.h(r11)
            if (r1 == 0) goto L_0x0048
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0048
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0045
            tb.elp r4 = (tb.elp) r4
            tb.ar4<? super tb.xhv> r5 = r4.b
            if (r5 != 0) goto L_0x001c
            goto L_0x0045
        L_0x001c:
            long r6 = r11.Y(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0045
            int r6 = r12.length
            if (r0 < r6) goto L_0x003a
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            tb.ckf.f(r12, r6)
        L_0x003a:
            r6 = r12
            tb.ar4[] r6 = (tb.ar4[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.b = r0
            r0 = r7
        L_0x0045:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0048:
            tb.ar4[] r12 = (tb.ar4[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.M(tb.ar4[]):tb.ar4[]");
    }

    private final long N() {
        return O() + this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long O() {
        return Math.min(this.j, this.i);
    }

    private final Object R(long j) {
        Object[] objArr = this.h;
        ckf.d(objArr);
        Object a2 = dlp.a(objArr, j);
        if (a2 instanceof a) {
            return ((a) a2).c;
        }
        return a2;
    }

    private final long S() {
        return O() + this.k + this.l;
    }

    private final int T() {
        return (int) ((O() + this.k) - this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U() {
        return this.k + this.l;
    }

    private final Object[] V(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long O = O();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + O;
                dlp.b(objArr2, j, dlp.a(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W(T t) {
        if (n() == 0) {
            X(t);
            return true;
        }
        if (this.k >= this.f && this.j <= this.i) {
            int i = b.$EnumSwitchMapping$0[this.g.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        L(t);
        int i2 = this.k + 1;
        this.k = i2;
        if (i2 > this.f) {
            I();
        }
        if (T() > this.e) {
            a0(this.i + 1, this.j, N(), S());
        }
        return true;
    }

    private final boolean X(T t) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (this.e == 0) {
            return true;
        }
        L(t);
        int i = this.k + 1;
        this.k = i;
        if (i > this.e) {
            I();
        }
        this.j = O() + this.k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Y(elp elpVar) {
        long j = elpVar.f18664a;
        if (j < N()) {
            return j;
        }
        if (this.f <= 0 && j <= O() && this.l != 0) {
            return j;
        }
        return -1L;
    }

    private final Object Z(elp elpVar) {
        Object obj;
        ar4<xhv>[] ar4VarArr = m30.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long Y = Y(elpVar);
                if (Y < 0) {
                    obj = dlp.NO_VALUE;
                } else {
                    long j = elpVar.f18664a;
                    Object R = R(Y);
                    elpVar.f18664a = Y + 1;
                    ar4VarArr = b0(j);
                    obj = R;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ar4<xhv> ar4Var : ar4VarArr) {
            if (ar4Var != null) {
                ar4Var.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
            }
        }
        return obj;
    }

    private final void a0(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        String str = dv6.DEBUG_PROPERTY_NAME;
        for (long O = O(); O < min; O++) {
            Object[] objArr = this.h;
            ckf.d(objArr);
            dlp.b(objArr, O, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - min);
        this.l = (int) (j4 - j3);
        String str2 = dv6.DEBUG_PROPERTY_NAME;
    }

    /* renamed from: G */
    public elp j() {
        return new elp();
    }

    /* renamed from: H */
    public elp[] k(int i) {
        return new elp[i];
    }

    public final T P() {
        Object[] objArr = this.h;
        ckf.d(objArr);
        return (T) dlp.a(objArr, (this.i + T()) - 1);
    }

    @Override // tb.clp, tb.qp9, tb.t23
    public Object a(sp9<? super T> sp9Var, ar4<?> ar4Var) {
        return E(this, sp9Var, ar4Var);
    }

    @Override // tb.clp
    public List<T> b() {
        synchronized (this) {
            int T = T();
            if (T == 0) {
                return yz3.i();
            }
            ArrayList arrayList = new ArrayList(T);
            Object[] objArr = this.h;
            ckf.d(objArr);
            for (int i = 0; i < T; i++) {
                arrayList.add(dlp.a(objArr, this.i + i));
            }
            return arrayList;
        }
    }

    public final ar4<xhv>[] b0(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        n30[] h;
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (j > this.j) {
            return m30.EMPTY_RESUMES;
        }
        long O = O();
        long j7 = this.k + O;
        if (this.f == 0 && this.l > 0) {
            j7++;
        }
        int i2 = 0;
        if (!(l30.g(this) == 0 || (h = l30.h(this)) == null)) {
            for (n30 n30Var : h) {
                if (n30Var != null) {
                    long j8 = ((elp) n30Var).f18664a;
                    if (j8 >= 0 && j8 < j7) {
                        j7 = j8;
                    }
                }
            }
        }
        String str2 = dv6.DEBUG_PROPERTY_NAME;
        if (j7 <= this.j) {
            return m30.EMPTY_RESUMES;
        }
        long N = N();
        if (n() > 0) {
            i = Math.min(this.l, this.f - ((int) (N - j7)));
        } else {
            i = this.l;
        }
        ar4<xhv>[] ar4VarArr = m30.EMPTY_RESUMES;
        long j9 = this.l + N;
        if (i > 0) {
            ar4VarArr = new ar4[i];
            Object[] objArr = this.h;
            ckf.d(objArr);
            j4 = N;
            while (true) {
                if (N >= j9) {
                    j2 = j7;
                    j3 = j9;
                    break;
                }
                Object a2 = dlp.a(objArr, N);
                j2 = j7;
                u1r u1rVar = dlp.NO_VALUE;
                if (a2 != u1rVar) {
                    ckf.e(a2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) a2;
                    int i3 = i2 + 1;
                    j3 = j9;
                    ar4VarArr[i2] = aVar.d;
                    dlp.b(objArr, N, u1rVar);
                    dlp.b(objArr, j4, aVar.c);
                    j6 = 1;
                    j4++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j3 = j9;
                    j6 = 1;
                }
                N += j6;
                j7 = j2;
                j9 = j3;
            }
        } else {
            j2 = j7;
            j3 = j9;
            j4 = N;
        }
        int i4 = (int) (j4 - O);
        if (n() == 0) {
            j5 = j4;
        } else {
            j5 = j2;
        }
        long max = Math.max(this.i, j4 - Math.min(this.e, i4));
        if (this.f == 0 && max < j3) {
            Object[] objArr2 = this.h;
            ckf.d(objArr2);
            if (ckf.b(dlp.a(objArr2, max), dlp.NO_VALUE)) {
                j4++;
                max++;
            }
        }
        a0(max, j5, j4, j3);
        D();
        if (ar4VarArr.length == 0) {
            return ar4VarArr;
        }
        return M(ar4VarArr);
    }

    @Override // tb.gfj
    public void c() {
        synchronized (this) {
            a0(N(), this.j, N(), S());
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final long c0() {
        long j = this.i;
        if (j < this.j) {
            this.j = j;
        }
        return j;
    }

    @Override // tb.gfj
    public boolean d(T t) {
        int i;
        boolean z;
        ar4<xhv>[] ar4VarArr = m30.EMPTY_RESUMES;
        synchronized (this) {
            if (W(t)) {
                ar4VarArr = M(ar4VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (ar4<xhv> ar4Var : ar4VarArr) {
            if (ar4Var != null) {
                ar4Var.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
            }
        }
        return z;
    }

    @Override // tb.gfj, tb.sp9
    public Object emit(T t, ar4<? super xhv> ar4Var) {
        return J(this, t, ar4Var);
    }

    @Override // tb.o2a
    public qp9<T> f(d dVar, int i, BufferOverflow bufferOverflow) {
        return dlp.c(this, dVar, i, bufferOverflow);
    }

    public static /* synthetic */ void Q() {
    }
}
