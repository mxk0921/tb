package tb;

import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class vx1 implements lr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View d;

    /* renamed from: a  reason: collision with root package name */
    public final List<vrp> f30309a = new ArrayList();
    public String b = null;
    public final Set<String> c = new HashSet();
    public int e = 0;
    public final Collection<String> f = new HashSet();

    static {
        t2o.a(468713908);
        t2o.a(469762061);
    }

    @Override // tb.lr9
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e5941e2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.lr9
    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abcb7266", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.lr9
    public boolean j(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.lr9
    public void k(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
        }
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        return ((HashSet) this.c).contains(str);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.d == null) {
        } else {
            if (akt.p2("ShortVideo.fixHideHandler", false)) {
                this.d.setVisibility(4);
                this.d.setEnabled(false);
                return;
            }
            this.d.setVisibility(8);
        }
    }

    public final void n(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c523caee", new Object[]{this, new Float(f)});
            return;
        }
        View view = this.d;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public List o(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d7302b42", new Object[]{this, vrpVar});
        }
        Object obj = vrpVar.h.get("filter");
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj != null) {
            return JSON.parseArray(obj.toString());
        }
        return null;
    }

    @Override // tb.lr9
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.e = 4;
        }
    }

    public void p(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139cabcc", new Object[]{this, view});
            return;
        }
        this.d = view;
        s();
        if (!(this instanceof s83) && view != null) {
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ac2743", new Object[]{this, str});
            return;
        }
        this.b = str;
        ((HashSet) this.c).add(str);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.d != null) {
            if (akt.p2("ShortVideo.fixHideHandler", false)) {
                this.d.setEnabled(true);
            }
            this.d.setVisibility(0);
        }
    }
}
