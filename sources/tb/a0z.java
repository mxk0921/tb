package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutDirection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class a0z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737111);
    }

    public static final /* synthetic */ boolean a(ldz ldzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f53f408", new Object[]{ldzVar})).booleanValue();
        }
        return d(ldzVar);
    }

    public static final /* synthetic */ void b(qjz qjzVar, ldz ldzVar, LayoutDirection layoutDirection, int i, int i2, can canVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2a40b0", new Object[]{qjzVar, ldzVar, layoutDirection, new Integer(i), new Integer(i2), canVar});
        } else {
            e(qjzVar, ldzVar, layoutDirection, i, i2, canVar);
        }
    }

    public static final zzy c(ldz ldzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzy) ipChange.ipc$dispatch("d5f098a4", new Object[]{ldzVar});
        }
        ofz a2 = ldzVar.a();
        if (a2 instanceof zzy) {
            return (zzy) a2;
        }
        return null;
    }

    public static final boolean d(ldz ldzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcc9e348", new Object[]{ldzVar})).booleanValue();
        }
        zzy c = c(ldzVar);
        if (c == null) {
            return false;
        }
        return c.b();
    }

    public static final void e(qjz qjzVar, ldz ldzVar, LayoutDirection layoutDirection, int i, int i2, can canVar) {
        can canVar2;
        can a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f1bff0", new Object[]{qjzVar, ldzVar, layoutDirection, new Integer(i), new Integer(i2), canVar});
            return;
        }
        zzy c = c(ldzVar);
        if (c == null || (a2 = c.a()) == null) {
            canVar2 = canVar;
        } else {
            canVar2 = a2;
        }
        qjzVar.n(canVar2.a(iaz.a(qjzVar.k(), qjzVar.h()), iaz.a(i, i2), layoutDirection));
    }
}
