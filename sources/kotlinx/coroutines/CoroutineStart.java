package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import tb.ar4;
import tb.bmi;
import tb.er4;
import tb.g1a;
import tb.pg1;
import tb.pgv;
import tb.u1a;
import tb.u23;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ^\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u00042'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "<init>", "(Ljava/lang/String;I)V", "T", "Lkotlin/Function1;", "Ltb/ar4;", "", pg1.ATOM_EXT_block, "completion", "Ltb/xhv;", "invoke", "(Ltb/g1a;Ltb/ar4;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", bmi.KEY_RECEIVER, "(Ltb/u1a;Ljava/lang/Object;Ltb/ar4;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final <T> void invoke(g1a<? super ar4<? super T>, ? extends Object> g1aVar, ar4<? super T> ar4Var) {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            u23.c(g1aVar, ar4Var);
        } else if (i == 2) {
            er4.a(g1aVar, ar4Var);
        } else if (i == 3) {
            pgv.a(g1aVar, ar4Var);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <R, T> void invoke(u1a<? super R, ? super ar4<? super T>, ? extends Object> u1aVar, R r, ar4<? super T> ar4Var) {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            u23.e(u1aVar, r, ar4Var, null, 4, null);
        } else if (i == 2) {
            er4.b(u1aVar, r, ar4Var);
        } else if (i == 3) {
            pgv.b(u1aVar, r, ar4Var);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
