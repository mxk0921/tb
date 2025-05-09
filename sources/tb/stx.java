package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class stx implements f8y, ztx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public WeakReference<a4y> c;
    public volatile int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f28273a = hashCode();

    public stx(Context context) {
        this.b = context;
    }

    public abstract Pair<Integer, Integer> a(oxx oxxVar, i5y i5yVar);

    public abstract Pair<ytx, ? extends Object> b(oxx oxxVar, i5y i5yVar, utx utxVar);

    public abstract ytx c(oxx oxxVar, i5y i5yVar, Pair<Integer, Integer> pair);

    public abstract ytx d(oxx oxxVar, i5y i5yVar, ytx ytxVar);

    public abstract ytx e(oxx oxxVar, i5y i5yVar, boolean z);

    public abstract void f();

    public abstract void g(int i, Object obj);

    public final void h(oxx oxxVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b4d016", new Object[]{this, oxxVar, ytxVar});
        } else if (this.d == 3) {
            if (rtx.d(8)) {
                rtx.a(8, "AbstractUploaderAction", this.f28273a + " begin, state is finish");
            }
        } else if (ytxVar != null) {
            i(oxxVar, ytxVar, 1);
        } else {
            w(oxxVar);
        }
    }

    public final void j(oxx oxxVar, i5y i5yVar, f6y f6yVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e88980b", new Object[]{this, oxxVar, i5yVar, f6yVar});
            return;
        }
        utx utxVar = (utx) f6yVar;
        int a2 = utxVar.a();
        if (rtx.d(2)) {
            rtx.a(2, "AbstractUploaderAction", this.f28273a + " onReceive, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode() + " response:" + utxVar.hashCode() + " state:" + this.d + " type:" + a2 + " content:" + utxVar.c().toString());
        }
        if (this.d != 3) {
            Pair<ytx, ? extends Object> b = b(oxxVar, i5yVar, utxVar);
            ytx ytxVar = (ytx) b.first;
            switch (a2) {
                case 1:
                    if (ytxVar == null) {
                        if (!r()) {
                            l(3);
                            oxxVar.i(i5yVar, true);
                            a4y x = x();
                            if (x != null) {
                                x.a(this);
                                break;
                            }
                        } else {
                            l(2);
                            ytxVar = e(oxxVar, i5yVar, true);
                            break;
                        }
                    }
                    break;
                case 2:
                    Object obj = b.second;
                    if (obj != null) {
                        g(3, obj);
                        break;
                    }
                    break;
                case 3:
                    Object obj2 = b.second;
                    if (obj2 != null) {
                        ytxVar = c(oxxVar, i5yVar, (Pair) obj2);
                        break;
                    }
                    break;
                case 4:
                    l(3);
                    oxxVar.b(null);
                    oxxVar.i(i5yVar, true);
                    g(0, b.second);
                    a4y x2 = x();
                    if (x2 != null) {
                        x2.a(this);
                        break;
                    }
                    break;
                case 5:
                    if (ytxVar != null && "300".equals(ytxVar.f24666a) && "2".equals(ytxVar.b)) {
                        l(1);
                        ytxVar = e(oxxVar, null, true);
                        break;
                    }
                    break;
                case 6:
                    Object obj3 = b.second;
                    if (obj3 == null) {
                        str = "";
                    } else {
                        str = obj3.toString();
                    }
                    ytxVar = new ytx("300", "3", str, true);
                    break;
            }
            u(oxxVar, i5yVar, ytxVar);
        } else if (rtx.d(8)) {
            rtx.a(8, "AbstractUploaderAction", this.f28273a + " onReceive, state is finish");
        }
    }

    public final void k(a4y a4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f832c980", new Object[]{this, a4yVar});
        } else {
            this.c = new WeakReference<>(a4yVar);
        }
    }

    public final boolean l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.d == i) {
            return false;
        }
        if (rtx.d(2)) {
            rtx.a(2, "AbstractUploaderAction", this.f28273a + " setState, oldState:" + this.d + " state:" + i);
        }
        this.d = i;
        return true;
    }

    public abstract boolean m(oxx oxxVar);

    public final void n(oxx oxxVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdcff3f", new Object[]{this, oxxVar});
            return;
        }
        if (this.d == 0) {
            i = 5;
        } else {
            i = 6;
        }
        if (rtx.d(8)) {
            rtx.a(8, "AbstractUploaderAction", this.f28273a + " onStart, state:" + this.d + " notifyType:" + i + " session:" + oxxVar.hashCode());
        }
        int i2 = this.d;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (rtx.d(8)) {
                            rtx.a(8, "AbstractUploaderAction", this.f28273a + " no need to begin,  state:" + this.d);
                        }
                        g(i, null);
                    }
                }
            }
            if (!l(2)) {
                f();
                oxxVar.b(null);
                oxxVar.a();
            }
            oxxVar.b(this);
            ytx e = e(oxxVar, null, true);
            if (e != null) {
                i(oxxVar, e, 1);
            }
            g(i, null);
        }
        if (!l(1)) {
            f();
            oxxVar.b(null);
            oxxVar.a();
        }
        oxxVar.b(this);
        if (!m(oxxVar)) {
            w(oxxVar);
        }
        if (rtx.d(2)) {
            rtx.a(2, "AbstractUploaderAction", this.f28273a + " submit timeConsuming, session:" + oxxVar.hashCode() + " state:" + this.d);
        }
        g(i, null);
    }

    public final void o(oxx oxxVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2a7097", new Object[]{this, oxxVar, ytxVar});
        } else if (this.d != 3) {
            i(oxxVar, ytxVar, 0);
        } else if (rtx.d(8)) {
            rtx.a(8, "AbstractUploaderAction", this.f28273a + " onCancel, state is finish");
        }
    }

    public final void p(oxx oxxVar, i5y i5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0db836", new Object[]{this, oxxVar, i5yVar});
            return;
        }
        if (rtx.d(2)) {
            rtx.a(2, "AbstractUploaderAction", this.f28273a + " onSend, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
        }
        if (this.d != 3) {
            Pair<Integer, Integer> a2 = a(oxxVar, i5yVar);
            if (a2 != null) {
                u(oxxVar, i5yVar, c(oxxVar, i5yVar, a2));
            }
        } else if (rtx.d(8)) {
            rtx.a(8, "AbstractUploaderAction", this.f28273a + " onSend, state is finish");
        }
    }

    public final void q(oxx oxxVar, i5y i5yVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7caca10e", new Object[]{this, oxxVar, i5yVar, ytxVar});
            return;
        }
        if (rtx.d(2)) {
            rtx.a(2, "AbstractUploaderAction", this.f28273a + " onError, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode() + " error:" + ytxVar.toString());
        }
        if (this.d != 3) {
            if ("100".equals(ytxVar.f24666a)) {
                boolean b = bux.b(this.b);
                if (rtx.d(2)) {
                    rtx.a(2, "AbstractUploaderAction", this.f28273a + " onError, connection error, isConnected:" + b + " error:" + ytxVar.toString());
                }
                if (!b || "-1".equals(ytxVar.b)) {
                    i(oxxVar, ytxVar, 2);
                    return;
                }
            }
            u(oxxVar, i5yVar, ytxVar);
        } else if (rtx.d(8)) {
            rtx.a(8, "AbstractUploaderAction", this.f28273a + " onError, state is finish");
        }
    }

    public abstract boolean r();

    public final int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final void u(oxx oxxVar, i5y i5yVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b4660f", new Object[]{this, oxxVar, i5yVar, ytxVar});
        } else if (ytxVar != null) {
            if (!ytxVar.d) {
                i(oxxVar, ytxVar, 1);
                return;
            }
            ytx d = d(oxxVar, i5yVar, ytxVar);
            if (d != null) {
                i(oxxVar, d, 1);
            }
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            g(7, null);
        }
    }

    public final void w(oxx oxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788c7741", new Object[]{this, oxxVar});
            return;
        }
        boolean r = r();
        if (rtx.d(2)) {
            rtx.a(2, "AbstractUploaderAction", this.f28273a + " begin, session:" + oxxVar.hashCode() + " state:" + this.d + " stepUp:" + r);
        }
        if (r) {
            l(2);
        }
        ytx e = e(oxxVar, null, true);
        if (e != null) {
            i(oxxVar, e, 1);
        }
    }

    public final a4y x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a4y) ipChange.ipc$dispatch("985961c2", new Object[]{this});
        }
        WeakReference<a4y> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void t(oxx oxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab4bb40", new Object[]{this, oxxVar});
            return;
        }
        if (rtx.d(8)) {
            rtx.a(8, "AbstractUploaderAction", this.f28273a + "onPause");
        }
        i(oxxVar, null, 2);
    }

    public final void i(oxx oxxVar, ytx ytxVar, int i) {
        Object obj;
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e5a5ad", new Object[]{this, oxxVar, ytxVar, new Integer(i)});
            return;
        }
        int i3 = this.d;
        if (rtx.d(8)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28273a);
            sb.append(" stop, session:");
            if (oxxVar == null) {
                obj = "null";
            } else {
                obj = Integer.valueOf(oxxVar.hashCode());
            }
            sb.append(obj);
            sb.append(" oldState:");
            sb.append(i3);
            sb.append(" error:");
            sb.append(ytxVar);
            sb.append(" reason:");
            sb.append(i);
            rtx.a(8, "AbstractUploaderAction", sb.toString());
        }
        if (oxxVar != null) {
            f();
            oxxVar.b(null);
            oxxVar.a();
        }
        if (i == 2) {
            l(this.d == 2 ? 5 : 4);
            i2 = 4;
        } else {
            l(3);
            a4y x = x();
            if (x != null) {
                x.a(this);
            }
            if (i == 0) {
                i2 = 1;
            }
        }
        g(i2, ytxVar);
    }
}
