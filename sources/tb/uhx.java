package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.oe8;
import tb.yam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uhx extends d93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159083);
        t2o.a(790626432);
    }

    public uhx(oe8 oe8Var) {
        super(oe8Var);
    }

    public static /* synthetic */ void h(oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc129a", new Object[]{bVar});
        } else if (bVar != null) {
            bVar.a(false);
        }
    }

    public static /* synthetic */ Object ipc$super(uhx uhxVar, String str, Object... objArr) {
        if (str.hashCode() == 675653801) {
            return super.e((StateModel) objArr[0], (StateVersionModel) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/channel/desktoplinktask/floatwindow/content/WindowStateManager");
    }

    @Override // tb.d93
    public View e(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2845a8a9", new Object[]{this, stateModel, stateVersionModel});
        }
        View e = super.e(stateModel, stateVersionModel);
        otq.a(this.f17661a, e, stateModel, this.f17661a.j().f().style);
        return e;
    }

    public void i(final oe8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e733cf0c", new Object[]{this, bVar});
            return;
        }
        try {
            this.f17661a.f().f(this.f17661a, "close", this.f17661a.j().f().animation, this.b, new yam.f() { // from class: tb.thx
                @Override // tb.yam.f
                public final void onAnimationEnd() {
                    uhx.h(oe8.b.this);
                }
            });
        } catch (Throwable th) {
            yv8.b("WindowStateManager.onClosed.error", th);
            if (bVar != null) {
                bVar.a(false);
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4eb0d49", new Object[]{this});
            return;
        }
        m();
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.o();
            }
        }
    }

    public void k(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ef08c9", new Object[]{this, str, jSONObject});
            return;
        }
        oe8 oe8Var = this.f17661a;
        gk8.a(oe8Var, oe8Var.j().f(), jSONObject);
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.s(str, jSONObject);
            }
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24202be5", new Object[]{this});
            return;
        }
        m();
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ubm ubmVar = (ubm) it.next();
            if (ubmVar != null) {
                ubmVar.t();
            }
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd086fe", new Object[]{this});
            return;
        }
        StateBaseModel f = this.f17661a.j().f();
        if (f != null) {
            this.f17661a.f().f(this.f17661a, "expose", f.animation, this.b, null);
        }
    }
}
