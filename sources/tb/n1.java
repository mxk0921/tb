package tb;

import android.content.Context;
import com.nirvana.tools.logger.cache.db.DbException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n1 extends a00<l1> {
    public final j1 l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends i30 {
        public a() {
        }

        @Override // tb.i30
        public void a() {
            List<l1> k;
            int i = 0;
            while (n1.this.d()) {
                n1 n1Var = n1.this;
                if (i < n1Var.j && (k = n1Var.l.k(n1.this.i)) != null && ((ArrayList) k).size() > 0) {
                    try {
                        n1.this.c(k);
                        i++;
                    } catch (DbException e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public n1(Context context, j1 j1Var, p1<l1> p1Var, rtn rtnVar) {
        super(context, p1Var, j1Var, rtnVar);
        this.l = j1Var;
    }

    @Override // tb.a00
    public void e(List<l1> list) throws DbException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (l1 l1Var : list) {
            if (l1Var.m() == 1 || l1Var.e() >= 2) {
                arrayList.add(l1Var);
            } else {
                arrayList2.add(l1Var);
            }
        }
        j1 j1Var = this.l;
        j1Var.c(arrayList);
        j1Var.a(arrayList2);
    }

    public void p() {
        q();
    }

    public final void q() {
        this.f15458a.execute(new a());
    }

    public void o() {
    }

    public void n(int i) {
    }
}
