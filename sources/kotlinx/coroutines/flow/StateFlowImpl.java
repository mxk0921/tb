package kotlinx.coroutines.flow;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.channels.BufferOverflow;
import tb.ar4;
import tb.ckf;
import tb.hfj;
import tb.iak;
import tb.l30;
import tb.o2a;
import tb.qp9;
import tb.t23;
import tb.u1r;
import tb.xhv;
import tb.xz3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b%\u0010&J-\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010/R*\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b4\u0010\u001a\u001a\u0004\b1\u00102\"\u0004\b3\u0010\nR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u00078\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Ltb/l30;", "Lkotlinx/coroutines/flow/n;", "Ltb/hfj;", "Ltb/t23;", "Ltb/o2a;", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "expectedState", "newState", "", "s", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "compareAndSet", "value", "d", "(Ljava/lang/Object;)Z", "Ltb/xhv;", "emit", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "c", "()V", "Ltb/sp9;", "collector", "", "a", "(Ltb/sp9;Ltb/ar4;)Ljava/lang/Object;", "p", "()Lkotlinx/coroutines/flow/n;", "", "size", "", "q", "(I)[Lkotlinx/coroutines/flow/n;", "Lkotlin/coroutines/d;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Ltb/qp9;", "f", "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ltb/qp9;", TLogTracker.LEVEL_INFO, "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "r", "", TplMsg.VALUE_T_NATIVE_RETURN, "()Ljava/util/List;", "replayCache", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class StateFlowImpl<T> extends l30<n> implements hfj<T>, t23<T>, o2a<T> {
    private static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "e");
    @Volatile
    private volatile Object e;
    private int f;

    public StateFlowImpl(Object obj) {
        this.e = obj;
    }

    private final boolean s(Object obj, Object obj2) {
        int i;
        n[] o;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj == null || ckf.b(obj3, obj))) {
                return false;
            }
            if (ckf.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.f = i3;
                n[] o2 = o();
                xhv xhvVar = xhv.INSTANCE;
                while (true) {
                    n[] nVarArr = o2;
                    if (nVarArr != null) {
                        for (n nVar : nVarArr) {
                            if (nVar != null) {
                                nVar.g();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f;
                        if (i == i3) {
                            this.f = i3 + 1;
                            return true;
                        }
                        o = o();
                        xhv xhvVar2 = xhv.INSTANCE;
                    }
                    o2 = o;
                    i3 = i;
                }
            } else {
                this.f = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
        if (tb.ckf.b(r11, r12) == false) goto L_0x00be;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:19:0x0060, B:21:0x0073, B:31:0x009c, B:32:0x00ab, B:34:0x00b3, B:36:0x00b8, B:38:0x00be, B:42:0x00c5, B:46:0x00d9, B:48:0x00df), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:19:0x0060, B:21:0x0073, B:31:0x009c, B:32:0x00ab, B:34:0x00b3, B:36:0x00b8, B:38:0x00be, B:42:0x00c5, B:46:0x00d9, B:48:0x00df), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:19:0x0060, B:21:0x0073, B:31:0x009c, B:32:0x00ab, B:34:0x00b3, B:36:0x00b8, B:38:0x00be, B:42:0x00c5, B:46:0x00d9, B:48:0x00df), top: B:53:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [tb.n30] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00dd -> B:32:0x00ab). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ef -> B:32:0x00ab). Please submit an issue!!! */
    @Override // tb.clp, tb.qp9, tb.t23
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(tb.sp9<? super T> r11, tb.ar4<?> r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.a(tb.sp9, tb.ar4):java.lang.Object");
    }

    @Override // tb.clp
    public List<T> b() {
        return xz3.e(getValue());
    }

    @Override // tb.gfj
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // tb.hfj
    public boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = (T) iak.NULL;
        }
        if (t2 == null) {
            t2 = (T) iak.NULL;
        }
        return s(t, t2);
    }

    @Override // tb.gfj
    public boolean d(T t) {
        setValue(t);
        return true;
    }

    @Override // tb.gfj, tb.sp9
    public Object emit(T t, ar4<? super xhv> ar4Var) {
        setValue(t);
        return xhv.INSTANCE;
    }

    @Override // tb.o2a
    public qp9<T> f(d dVar, int i, BufferOverflow bufferOverflow) {
        return m.b(this, dVar, i, bufferOverflow);
    }

    @Override // tb.hfj, tb.ajq
    public T getValue() {
        u1r u1rVar = iak.NULL;
        T t = (T) g.get(this);
        if (t == u1rVar) {
            return null;
        }
        return t;
    }

    /* renamed from: p */
    public n j() {
        return new n();
    }

    /* renamed from: q */
    public n[] k(int i) {
        return new n[i];
    }

    @Override // tb.hfj
    public void setValue(T t) {
        if (t == null) {
            t = (T) iak.NULL;
        }
        s(null, t);
    }

    public static /* synthetic */ void r() {
    }
}
