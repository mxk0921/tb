package tb;

import com.nirvana.tools.logger.cache.db.DbException;
import java.util.ArrayList;
import java.util.List;
import tb.o1;
import tb.y00;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g1<T extends o1, G extends y00<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final G f19670a;
    public final rtn b;

    public g1(G g, rtn rtnVar) {
        this.f19670a = g;
        this.b = rtnVar;
    }

    public void a(List<T> list) throws DbException {
        this.f19670a.s(list, System.currentTimeMillis(), 1);
    }

    public boolean b(List<T> list) throws DbException {
        return this.f19670a.k(list);
    }

    public boolean c(List<T> list) throws DbException {
        return this.f19670a.d(list);
    }

    public List<T> d() {
        return this.f19670a.o(-1, 1, null);
    }

    public List<T> e() {
        return this.f19670a.o(-1, -1, null);
    }

    public long f() {
        return this.f19670a.q();
    }

    public List<T> g(long j, long j2, int i) {
        return this.f19670a.p(j, j2, i);
    }

    public List<T> h() {
        return this.f19670a.o(-1, 0, null);
    }

    public boolean i() {
        List<T> o = this.f19670a.o(1, 1, null);
        if (o == null || ((ArrayList) o).size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean j() {
        List<T> o = this.f19670a.o(1, 0, null);
        if (o == null || ((ArrayList) o).size() <= 0) {
            return false;
        }
        return true;
    }
}
