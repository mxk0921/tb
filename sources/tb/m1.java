package tb;

import com.nirvana.tools.logger.cache.db.DbException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
class m1 extends i30 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n1 f23706a;

    public m1(n1 n1Var) {
        this.f23706a = n1Var;
    }

    @Override // tb.i30
    public void a() {
        if (this.f23706a.d()) {
            try {
                this.f23706a.c(this.f23706a.l.k(this.f23706a.i));
            } catch (DbException e) {
                e.printStackTrace();
                this.f23706a.o();
            }
            if (!this.f23706a.l.j()) {
                this.f23706a.getClass();
                throw null;
            }
        }
    }
}
