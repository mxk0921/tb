package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b7l extends m1u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public m1u c;
    public m1u d;
    public m1u e;

    static {
        t2o.a(985661615);
    }

    public b7l(String str, int i) {
        super(str, i);
    }

    public static /* synthetic */ Object ipc$super(b7l b7lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/el/parse/Operator");
    }

    @Override // tb.m1u
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (f7l.AND_NOT.equals(b())) {
            return "{!" + this.c + "}";
        } else if (this.c == null) {
            return "{" + this.d + b() + this.e + "}";
        } else {
            return "{" + this.c + b() + this.d + ":" + this.e + "}";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
        if (r3.equals("*") == false) goto L_0x0025;
     */
    @Override // tb.m1u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b7l.a(java.lang.Object):java.lang.Object");
    }
}
