package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import tb.n30;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0013H\u0084\b¢\u0006\u0004\b\u0015\u0010\u0016R8\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Ltb/l30;", "Ltb/n30;", ExifInterface.LATITUDE_SOUTH, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", at.j, "()Ltb/n30;", "", "size", "", at.k, "(I)[Ltb/n30;", bmv.MSGTYPE_INTERVAL, "slot", "Ltb/xhv;", "m", "(Ltb/n30;)V", "Lkotlin/Function1;", pg1.ATOM_EXT_block, "l", "(Ltb/g1a;)V", "<set-?>", "a", "[Ltb/n30;", o.b, "()[Ltb/n30;", "slots", TplMsg.VALUE_T_NATIVE_RETURN, TLogTracker.LEVEL_INFO, "n", "()I", "nCollectors", "c", vqx.ZIM_IDENTIFY_NEXTINDEX, "Ltb/jwq;", "d", "Ltb/jwq;", "_subscriptionCount", "Ltb/ajq;", "e", "()Ltb/ajq;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class l30<S extends n30<?>> {

    /* renamed from: a  reason: collision with root package name */
    private S[] f23077a;
    private int b;
    private int c;
    private jwq d;

    public static final /* synthetic */ int g(l30 l30Var) {
        return l30Var.b;
    }

    public static final /* synthetic */ n30[] h(l30 l30Var) {
        return l30Var.f23077a;
    }

    public final ajq<Integer> e() {
        jwq jwqVar;
        synchronized (this) {
            jwqVar = this.d;
            if (jwqVar == null) {
                jwqVar = new jwq(this.b);
                this.d = jwqVar;
            }
        }
        return jwqVar;
    }

    public final S i() {
        S s;
        jwq jwqVar;
        synchronized (this) {
            try {
                S[] sArr = this.f23077a;
                if (sArr == null) {
                    sArr = k(2);
                    this.f23077a = sArr;
                } else if (this.b >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    ckf.f(copyOf, "copyOf(this, newSize)");
                    this.f23077a = (S[]) ((n30[]) copyOf);
                    sArr = (S[]) ((n30[]) copyOf);
                }
                int i = this.c;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = j();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    ckf.e(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s.a(this));
                this.c = i;
                this.b++;
                jwqVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jwqVar != null) {
            jwqVar.e0(1);
        }
        return s;
    }

    public abstract S j();

    public abstract S[] k(int i);

    public final void l(g1a<? super S, xhv> g1aVar) {
        n30[] n30VarArr;
        if (!(this.b == 0 || (n30VarArr = this.f23077a) == null)) {
            for (n30 n30Var : n30VarArr) {
                if (n30Var != null) {
                    g1aVar.invoke(n30Var);
                }
            }
        }
    }

    public final void m(S s) {
        jwq jwqVar;
        int i;
        ar4<xhv>[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                jwqVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                ckf.e(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ar4<xhv> ar4Var : b) {
            if (ar4Var != null) {
                ar4Var.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
            }
        }
        if (jwqVar != null) {
            jwqVar.e0(-1);
        }
    }

    public final int n() {
        return this.b;
    }

    public final S[] o() {
        return this.f23077a;
    }
}
