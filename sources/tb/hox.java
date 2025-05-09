package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.xsl.refact.XslChildPageWidget;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class hox extends hsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final XslChildPageWidget b;
    public final HashMap<Integer, Boolean> c = new HashMap<>();
    public final Rect d = new Rect();

    static {
        t2o.a(993002085);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hox(MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
        ude parent = metaListWidget.getParent();
        ckf.e(parent, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslChildPageWidget");
        this.b = (XslChildPageWidget) parent;
    }

    public static /* synthetic */ Object ipc$super(hox hoxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1090694930:
                super.f();
                return null;
            case -740946165:
                super.d();
                return null;
            case 840752859:
                super.b();
                return null;
            case 1727106610:
                super.i();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/refact/XslListPlugin");
        }
    }

    @Override // tb.hsi
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        super.b();
        l();
    }

    @Override // tb.hsi
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
            return;
        }
        super.d();
        l();
    }

    @Override // tb.hsi
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befd50ee", new Object[]{this});
            return;
        }
        super.f();
        this.c.clear();
        l();
    }

    @Override // tb.hsi
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
            return;
        }
        super.i();
        l();
    }

    public final void k(kae<?, ?> kaeVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a610d1", new Object[]{this, kaeVar, new Boolean(z)});
            return;
        }
        this.c.put(Integer.valueOf(kaeVar.hashCode()), Boolean.valueOf(z));
        if (ckf.b(this.c.get(Integer.valueOf(kaeVar.hashCode())), Boolean.valueOf(z))) {
            return;
        }
        if (z) {
            if (kaeVar instanceof x91) {
                ((x91) kaeVar).S0();
            }
        } else if (kaeVar instanceof x91) {
            ((x91) kaeVar).j2();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72752df9", new Object[]{this});
        } else if (((acx) a().getModel()).g()) {
            Iterator<kae<?, ?>> it = this.b.x3().iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                kae<?, ?> next = it.next();
                ckf.f(next, "next(...)");
                kae<?, ?> kaeVar = next;
                View view = kaeVar.getView();
                if (view != null) {
                    view.getGlobalVisibleRect(this.d);
                    if (this.d.width() <= 0 || this.d.height() <= 0) {
                        k(kaeVar, false);
                    } else {
                        k(kaeVar, true);
                    }
                }
            }
        } else {
            Iterator<kae<?, ?>> it2 = this.b.x3().iterator();
            ckf.f(it2, "iterator(...)");
            while (it2.hasNext()) {
                kae<?, ?> next2 = it2.next();
                ckf.f(next2, "next(...)");
                k(next2, false);
            }
        }
    }
}
