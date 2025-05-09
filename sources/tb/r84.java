package tb;

import com.ali.user.mobile.app.constant.UTConstant;
import kotlin.Metadata;
import tb.stt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH¦\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltb/r84;", "Ltb/stt;", "", "Ltb/s08;", "duration", "c", "(J)Ltb/r84;", "E", "other", "G", "(Ltb/r84;)J", "", UTConstant.Args.UT_SUCCESS_F, "(Ltb/r84;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface r84 extends stt, Comparable<r84> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static int a(r84 r84Var, r84 r84Var2) {
            ckf.g(r84Var2, "other");
            return s08.i(r84Var.G(r84Var2), s08.Companion.c());
        }

        public static boolean b(r84 r84Var) {
            return stt.a.a(r84Var);
        }

        public static boolean c(r84 r84Var) {
            return stt.a.b(r84Var);
        }

        public static r84 d(r84 r84Var, long j) {
            return r84Var.c(s08.l0(j));
        }
    }

    @Override // tb.stt
    /* synthetic */ long D();

    r84 E(long j);

    /* synthetic */ stt E(long j);

    int F(r84 r84Var);

    long G(r84 r84Var);

    /* synthetic */ boolean H();

    /* synthetic */ boolean I();

    r84 c(long j);

    /* synthetic */ stt c(long j);

    boolean equals(Object obj);

    int hashCode();
}
