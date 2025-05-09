package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.security.realidentity.o;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.uc.webview.export.extension.UCCore;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.bmv;
import tb.ckf;
import tb.d1a;
import tb.da4;
import tb.dkf;
import tb.dv6;
import tb.fa4;
import tb.g1a;
import tb.g23;
import tb.gr3;
import tb.h30;
import tb.ia4;
import tb.ma0;
import tb.o5k;
import tb.ov6;
import tb.pg1;
import tb.q23;
import tb.qww;
import tb.r23;
import tb.rgq;
import tb.rr7;
import tb.tkf;
import tb.tu4;
import tb.u1r;
import tb.uq7;
import tb.v8p;
import tb.vu4;
import tb.w23;
import tb.wq7;
import tb.x7k;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001e\u001a\u00020\u00152'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0019j\u0002`\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u00020\u00152\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u000fJ\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010.J8\u00100\u001a\u00020/2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0019j\u0002`\u001cH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u00104JZ\u00109\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010)2\u0006\u0010\n\u001a\u00020\t2#\u00107\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\b\u00108\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b9\u0010:JH\u0010;\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u00010)2\u0006\u0010\n\u001a\u00020\t2%\b\u0002\u00107\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0002¢\u0006\u0004\b;\u0010<JJ\u0010>\u001a\u0004\u0018\u00010=2\b\u00106\u001a\u0004\u0018\u00010)2\b\u00108\u001a\u0004\u0018\u00010)2#\u00107\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020@2\b\u00106\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0015H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0015H\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010\u0001\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0001\u0010\u000fJ\u0017\u0010H\u001a\n\u0018\u00010Fj\u0004\u0018\u0001`GH\u0016¢\u0006\u0004\bH\u0010IJ\u0011\u0010J\u001a\u0004\u0018\u00010)H\u0010¢\u0006\u0004\bJ\u0010KJ!\u0010M\u001a\u00020\u00152\b\u0010L\u001a\u0004\u0018\u00010)2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bO\u0010\u0013J\u0017\u0010P\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bR\u0010SJ8\u0010T\u001a\u00020\u00152!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bT\u0010\u001fJ\u0017\u0010W\u001a\u00020\u00102\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0011\u0010Y\u001a\u0004\u0018\u00010)H\u0001¢\u0006\u0004\bY\u0010KJ\u000f\u0010Z\u001a\u00020\u0015H\u0000¢\u0006\u0004\bZ\u0010DJ \u0010]\u001a\u00020\u00152\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010+J<\u0010_\u001a\u00020\u00152\u0006\u0010^\u001a\u00028\u00002#\u00107\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0016¢\u0006\u0004\b_\u0010`J#\u0010b\u001a\u00020\u00152\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010a\u001a\u00020\tH\u0016¢\u0006\u0004\bb\u0010cJ8\u0010d\u001a\u00020\u00152'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00150\u0019j\u0002`\u001cH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0015H\u0000¢\u0006\u0004\bf\u0010DJ#\u0010g\u001a\u0004\u0018\u00010)2\u0006\u0010^\u001a\u00028\u00002\b\u00108\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bg\u0010hJH\u0010i\u001a\u0004\u0018\u00010)2\u0006\u0010^\u001a\u00028\u00002\b\u00108\u001a\u0004\u0018\u00010)2#\u00107\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019H\u0016¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010)2\u0006\u0010k\u001a\u00020\u0010H\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00152\u0006\u0010n\u001a\u00020)H\u0016¢\u0006\u0004\bo\u0010+J\u001b\u0010q\u001a\u00020\u0015*\u00020p2\u0006\u0010^\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u0015*\u00020p2\u0006\u0010k\u001a\u00020\u0010H\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010,\u001a\u0004\u0018\u00010)H\u0010¢\u0006\u0004\bu\u0010vJ\u001b\u0010w\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010)H\u0010¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020yH\u0014¢\u0006\u0004\b|\u0010{R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b}\u0010\u007fR\u001f\u0010\u0084\u0001\u001a\u00030\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bw\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010(R\u0016\u0010\u0088\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010{R\u0017\u0010,\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010KR\u0016\u0010\u008b\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010\u000fR\u0016\u0010\u008d\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010\u000fR\u0016\u0010\u008f\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u000fR\u001f\u0010\u0092\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\f\u0010\u0093\u0001\u001a\u00020)8\u0002X\u0082\u0004R\u0014\u0010\u0094\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0)8\u0002X\u0082\u0004R\u0014\u0010\u0095\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0)8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0096\u0001"}, d2 = {"Lkotlinx/coroutines/c;", "T", "Lkotlinx/coroutines/j;", "Ltb/q23;", "Ltb/vu4;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ltb/qww;", "Ltb/ar4;", "delegate", "", "resumeMode", "<init>", "(Ltb/ar4;I)V", "", "K", "()Z", "", "cause", "u", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Ltb/xhv;", pg1.ATOM_EXT_block, "n", "(Ltb/d1a;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "m", "(Ltb/g1a;Ljava/lang/Throwable;)V", "Ltb/v8p;", "segment", "s", "(Ltb/v8p;Ljava/lang/Throwable;)V", "d0", "Z", "Ltb/rr7;", UTConstant.Args.UT_SUCCESS_F, "()Ltb/rr7;", "", "G", "(Ljava/lang/Object;)V", "state", "P", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ltb/g23;", "O", "(Ltb/g1a;)Ltb/g23;", "mode", "x", "(I)V", "Ltb/x7k;", "proposedUpdate", "onCancellation", "idempotent", "X", "(Ltb/x7k;Ljava/lang/Object;ILtb/g1a;Ljava/lang/Object;)Ljava/lang/Object;", "U", "(Ljava/lang/Object;ILtb/g1a;)V", "Ltb/u1r;", "a0", "(Ljava/lang/Object;Ljava/lang/Object;Ltb/g1a;)Ltb/u1r;", "", at.j, "(Ljava/lang/Object;)Ljava/lang/Void;", "w", "()V", "E", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", bmv.MSGTYPE_INTERVAL, "()Ljava/lang/Object;", "takenState", TplMsg.VALUE_T_NATIVE_RETURN, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "t", "R", "(Ljava/lang/Throwable;)V", at.k, "(Ltb/g23;Ljava/lang/Throwable;)V", o.b, "Lkotlinx/coroutines/m;", a.MSG_SOURCE_PARENT, "y", "(Lkotlinx/coroutines/m;)Ljava/lang/Throwable;", "A", ExifInterface.LATITUDE_SOUTH, "Lkotlin/Result;", "result", "resumeWith", "value", "l", "(Ljava/lang/Object;Ltb/g1a;)V", "index", "c", "(Ltb/v8p;I)V", "h", "(Ltb/g1a;)V", "v", "Y", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "q", "(Ljava/lang/Object;Ljava/lang/Object;Ltb/g1a;)Ljava/lang/Object;", "exception", "b0", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "p", "Lkotlinx/coroutines/CoroutineDispatcher;", "r", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "W", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "Q", "d", "Ltb/ar4;", "()Ltb/ar4;", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "context", AmnetConstant.VAL_SUPPORT_ZSTD, "parentHandle", TLogTracker.LEVEL_DEBUG, "stateDebugRepresentation", "B", "H", "isActive", "J", "isCompleted", TLogTracker.LEVEL_INFO, "isCancelled", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "_decisionAndIndex", "_parentHandle", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class c<T> extends j<T> implements q23<T>, vu4, qww {
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(c.class, "f");
    private static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, at.f);
    private static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "h");
    private final ar4<T> d;
    private final d e;
    @Volatile
    private volatile int f = 536870911;
    @Volatile
    private volatile Object g = ma0.INSTANCE;
    @Volatile
    private volatile Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(ar4<? super T> ar4Var, int i2) {
        super(i2);
        this.d = ar4Var;
        String str = dv6.DEBUG_PROPERTY_NAME;
        this.e = ar4Var.getContext();
    }

    private final String D() {
        Object B = B();
        if (B instanceof x7k) {
            return "Active";
        }
        if (B instanceof w23) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final rr7 F() {
        m mVar = (m) getContext().get(m.Key);
        if (mVar == null) {
            return null;
        }
        rr7 e = m.a.e(mVar, true, false, new gr3(this), 2, null);
        h30.a(k, this, null, e);
        return e;
    }

    private final void G(Object obj) {
        boolean z;
        String str = dv6.DEBUG_PROPERTY_NAME;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof ma0)) {
                if (obj2 instanceof g23) {
                    z = true;
                } else {
                    z = obj2 instanceof v8p;
                }
                Throwable th = null;
                if (z) {
                    P(obj, obj2);
                    throw null;
                } else if (obj2 instanceof fa4) {
                    fa4 fa4Var = (fa4) obj2;
                    if (!fa4Var.b()) {
                        P(obj, obj2);
                        throw null;
                    } else if (obj2 instanceof w23) {
                        if (!(obj2 instanceof fa4)) {
                            fa4Var = null;
                        }
                        if (fa4Var != null) {
                            th = fa4Var.f19137a;
                        }
                        if (obj instanceof g23) {
                            k((g23) obj, th);
                            return;
                        }
                        ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        s((v8p) obj, th);
                        return;
                    } else {
                        return;
                    }
                } else if (obj2 instanceof da4) {
                    da4 da4Var = (da4) obj2;
                    if (da4Var.b != null) {
                        P(obj, obj2);
                        throw null;
                    } else if (!(obj instanceof v8p)) {
                        ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        g23 g23Var = (g23) obj;
                        if (da4Var.c()) {
                            k(g23Var, da4Var.e);
                            return;
                        }
                        if (h30.a(j, this, obj2, da4.b(da4Var, null, g23Var, null, null, null, 29, null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(obj instanceof v8p)) {
                    ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (h30.a(j, this, obj2, new da4(obj2, (g23) obj, null, null, null, 28, null))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (h30.a(j, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean K() {
        if (wq7.c(this.c)) {
            ar4<T> ar4Var = this.d;
            ckf.e(ar4Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((uq7) ar4Var).s()) {
                return true;
            }
        }
        return false;
    }

    private final void M(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, g1a<? super Integer, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void N(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, g1a<Object, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final g23 O(g1a<? super Throwable, xhv> g1aVar) {
        if (g1aVar instanceof g23) {
            return (g23) g1aVar;
        }
        return new tkf(g1aVar);
    }

    private final void P(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void U(Object obj, int i2, g1a<? super Throwable, xhv> g1aVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof x7k) {
            } else {
                if (obj2 instanceof w23) {
                    w23 w23Var = (w23) obj2;
                    if (w23Var.c()) {
                        if (g1aVar != null) {
                            o(g1aVar, w23Var.f19137a);
                            return;
                        }
                        return;
                    }
                }
                j(obj);
                throw null;
            }
        } while (!h30.a(j, this, obj2, X((x7k) obj2, obj, i2, g1aVar, null)));
        w();
        x(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(c cVar, Object obj, int i2, g1a g1aVar, int i3, Object obj2) {
        if (obj2 == null) {
            if ((i3 & 4) != 0) {
                g1aVar = null;
            }
            cVar.U(obj, i2, g1aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object X(x7k x7kVar, Object obj, int i2, g1a<? super Throwable, xhv> g1aVar, Object obj2) {
        g23 g23Var;
        if (obj instanceof fa4) {
            String str = dv6.DEBUG_PROPERTY_NAME;
            return obj;
        } else if (!wq7.b(i2) && obj2 == null) {
            return obj;
        } else {
            if (g1aVar == null && !(x7kVar instanceof g23) && obj2 == null) {
                return obj;
            }
            if (x7kVar instanceof g23) {
                g23Var = (g23) x7kVar;
            } else {
                g23Var = null;
            }
            return new da4(obj, g23Var, g1aVar, obj2, null, 16, null);
        }
    }

    private final boolean Z() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!i.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
        return true;
    }

    private final u1r a0(Object obj, Object obj2, g1a<? super Throwable, xhv> g1aVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof x7k) {
            } else if (!(obj3 instanceof da4) || obj2 == null || ((da4) obj3).d != obj2) {
                return null;
            } else {
                String str = dv6.DEBUG_PROPERTY_NAME;
                return r23.RESUME_TOKEN;
            }
        } while (!h30.a(j, this, obj3, X((x7k) obj3, obj, this.c, g1aVar, obj2)));
        w();
        return r23.RESUME_TOKEN;
    }

    private final boolean d0() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!i.compareAndSet(this, i2, UCCore.VERIFY_POLICY_PAK_QUICK + (536870911 & i2)));
        return true;
    }

    private final void e0(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, g1a<? super Integer, Integer> g1aVar, Object obj) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, g1aVar.invoke(Integer.valueOf(i2)).intValue()));
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void m(g1a<? super Throwable, xhv> g1aVar, Throwable th) {
        try {
            g1aVar.invoke(th);
        } catch (Throwable th2) {
            d context = getContext();
            tu4.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void n(d1a<xhv> d1aVar) {
        try {
            d1aVar.invoke();
        } catch (Throwable th) {
            d context = getContext();
            tu4.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void s(v8p<?> v8pVar, Throwable th) {
        int i2 = i.get(this) & 536870911;
        if (i2 != 536870911) {
            try {
                v8pVar.o(i2, th, getContext());
            } catch (Throwable th2) {
                d context = getContext();
                tu4.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    private final boolean u(Throwable th) {
        if (!K()) {
            return false;
        }
        ar4<T> ar4Var = this.d;
        ckf.e(ar4Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((uq7) ar4Var).u(th);
    }

    private final void w() {
        if (!K()) {
            v();
        }
    }

    private final void x(int i2) {
        if (!Z()) {
            wq7.a(this, i2);
        }
    }

    private final rr7 z() {
        return (rr7) k.get(this);
    }

    public final Object A() {
        m mVar;
        Throwable i2;
        Throwable i3;
        boolean K = K();
        if (d0()) {
            if (z() == null) {
                F();
            }
            if (K) {
                S();
            }
            return dkf.d();
        }
        if (K) {
            S();
        }
        Object B = B();
        if (B instanceof fa4) {
            Throwable th = ((fa4) B).f19137a;
            if (!dv6.c()) {
                throw th;
            }
            i3 = rgq.i(th, this);
            throw i3;
        } else if (!wq7.b(this.c) || (mVar = (m) getContext().get(m.Key)) == null || mVar.isActive()) {
            return f(B);
        } else {
            CancellationException u0 = mVar.u0();
            b(B, u0);
            if (!dv6.c()) {
                throw u0;
            }
            i2 = rgq.i(u0, this);
            throw i2;
        }
    }

    public final Object B() {
        return j.get(this);
    }

    public void E() {
        rr7 F = F();
        if (F != null && J()) {
            F.dispose();
            k.set(this, o5k.INSTANCE);
        }
    }

    public boolean H() {
        return B() instanceof x7k;
    }

    public boolean I() {
        return B() instanceof w23;
    }

    public boolean J() {
        return !(B() instanceof x7k);
    }

    public String Q() {
        return "CancellableContinuation";
    }

    public final void R(Throwable th) {
        if (!u(th)) {
            t(th);
            w();
        }
    }

    public final void S() {
        uq7 uq7Var;
        Throwable z;
        ar4<T> ar4Var = this.d;
        if (ar4Var instanceof uq7) {
            uq7Var = (uq7) ar4Var;
        } else {
            uq7Var = null;
        }
        if (uq7Var != null && (z = uq7Var.z(this)) != null) {
            v();
            t(z);
        }
    }

    public final boolean T() {
        String str = dv6.DEBUG_PROPERTY_NAME;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (!(obj instanceof da4) || ((da4) obj).d == null) {
            i.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, ma0.INSTANCE);
            return true;
        }
        v();
        return false;
    }

    public void W(CoroutineDispatcher coroutineDispatcher, Throwable th) {
        uq7 uq7Var;
        int i2;
        ar4<T> ar4Var = this.d;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (ar4Var instanceof uq7) {
            uq7Var = (uq7) ar4Var;
        } else {
            uq7Var = null;
        }
        fa4 fa4Var = new fa4(th, false, 2, null);
        if (uq7Var != null) {
            coroutineDispatcher2 = uq7Var.d;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i2 = 4;
        } else {
            i2 = this.c;
        }
        V(this, fa4Var, i2, null, 4, null);
    }

    public Object Y(T t, Object obj) {
        return a0(t, obj, null);
    }

    @Override // kotlinx.coroutines.j
    public void b(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof x7k) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof fa4)) {
                if (obj2 instanceof da4) {
                    da4 da4Var = (da4) obj2;
                    if (!da4Var.c()) {
                        if (h30.a(j, this, obj2, da4.b(da4Var, null, null, null, null, th, 15, null))) {
                            da4Var.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once");
                    }
                } else if (h30.a(j, this, obj2, new da4(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public Object b0(Throwable th) {
        return a0(new fa4(th, false, 2, null), null, null);
    }

    @Override // tb.qww
    public void c(v8p<?> v8pVar, int i2) {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        G(v8pVar);
    }

    @Override // kotlinx.coroutines.j
    public final ar4<T> d() {
        return this.d;
    }

    @Override // kotlinx.coroutines.j
    public Throwable e(Object obj) {
        Throwable i2;
        Throwable e = super.e(obj);
        if (e == null) {
            return null;
        }
        ar4<T> ar4Var = this.d;
        if (!dv6.c() || !(ar4Var instanceof vu4)) {
            return e;
        }
        i2 = rgq.i(e, (vu4) ar4Var);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.j
    public <T> T f(Object obj) {
        if (obj instanceof da4) {
            return (T) ((da4) obj).f17676a;
        }
        return obj;
    }

    @Override // tb.vu4
    public vu4 getCallerFrame() {
        ar4<T> ar4Var = this.d;
        if (ar4Var instanceof vu4) {
            return (vu4) ar4Var;
        }
        return null;
    }

    @Override // tb.ar4
    public d getContext() {
        return this.e;
    }

    @Override // tb.vu4
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // tb.q23
    public void h(g1a<? super Throwable, xhv> g1aVar) {
        G(O(g1aVar));
    }

    @Override // kotlinx.coroutines.j
    public Object i() {
        return B();
    }

    public final void k(g23 g23Var, Throwable th) {
        try {
            g23Var.f(th);
        } catch (Throwable th2) {
            d context = getContext();
            tu4.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // tb.q23
    public void l(T t, g1a<? super Throwable, xhv> g1aVar) {
        U(t, this.c, g1aVar);
    }

    public final void o(g1a<? super Throwable, xhv> g1aVar, Throwable th) {
        try {
            g1aVar.invoke(th);
        } catch (Throwable th2) {
            d context = getContext();
            tu4.a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // tb.q23
    public void p(Object obj) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        x(this.c);
    }

    @Override // tb.q23
    public Object q(T t, Object obj, g1a<? super Throwable, xhv> g1aVar) {
        return a0(t, obj, g1aVar);
    }

    @Override // tb.q23
    public void r(CoroutineDispatcher coroutineDispatcher, T t) {
        uq7 uq7Var;
        int i2;
        ar4<T> ar4Var = this.d;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (ar4Var instanceof uq7) {
            uq7Var = (uq7) ar4Var;
        } else {
            uq7Var = null;
        }
        if (uq7Var != null) {
            coroutineDispatcher2 = uq7Var.d;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i2 = 4;
        } else {
            i2 = this.c;
        }
        V(this, t, i2, null, 4, null);
    }

    @Override // tb.ar4
    public void resumeWith(Object obj) {
        V(this, ia4.b(obj, this), this.c, null, 4, null);
    }

    public boolean t(Throwable th) {
        Object obj;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof x7k)) {
                return false;
            }
            if ((obj instanceof g23) || (obj instanceof v8p)) {
                z = true;
            }
        } while (!h30.a(j, this, obj, new w23(this, th, z)));
        x7k x7kVar = (x7k) obj;
        if (x7kVar instanceof g23) {
            k((g23) obj, th);
        } else if (x7kVar instanceof v8p) {
            s((v8p) obj, th);
        }
        w();
        x(this.c);
        return true;
    }

    public String toString() {
        return Q() + '(' + ov6.c(this.d) + "){" + D() + "}@" + ov6.b(this);
    }

    public final void v() {
        rr7 z = z();
        if (z != null) {
            z.dispose();
            k.set(this, o5k.INSTANCE);
        }
    }

    public Throwable y(m mVar) {
        return mVar.u0();
    }
}
