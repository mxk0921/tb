package tb;

import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class vbp<T> {
    public abstract Object a(T t, ar4<? super xhv> ar4Var);

    public abstract Object c(Iterator<? extends T> it, ar4<? super xhv> ar4Var);

    public final Object d(sbp<? extends T> sbpVar, ar4<? super xhv> ar4Var) {
        Object c = c(sbpVar.iterator(), ar4Var);
        if (c == dkf.d()) {
            return c;
        }
        return xhv.INSTANCE;
    }
}
