package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.trtc.api.TrtcConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class z9s extends t9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ViewGroup h;
    public cas i;
    public boolean j;

    static {
        t2o.a(835715146);
    }

    public /* synthetic */ z9s(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, int i, a07 a07Var) {
        this(activity, (i & 2) != 0 ? null : viewGroup, (i & 4) != 0 ? null : viewGroup2);
    }

    public static /* synthetic */ Object ipc$super(z9s z9sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/embed/TMSEmbedContainerHelper");
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b976f5", new Object[]{this});
            return;
        }
        this.j = true;
        cas casVar = this.i;
        if (casVar != null) {
            casVar.i();
        }
    }

    @Override // tb.t9s
    public swd c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (swd) ipChange.ipc$dispatch("c3bfb8ed", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        cas casVar = new cas(bbsVar, this.h);
        this.i = casVar;
        if (this.j) {
            casVar.i();
        }
        cas casVar2 = this.i;
        ckf.d(casVar2);
        return casVar2;
    }

    @Override // tb.mqb
    public TMSContainerType getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSContainerType) ipChange.ipc$dispatch("71d656c0", new Object[]{this});
        }
        return TMSContainerType.EMBEDDED;
    }

    public final boolean p() {
        j0c j0cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("928969df", new Object[]{this})).booleanValue();
        }
        bbs f = f();
        if (f == null || (j0cVar = (j0c) f.getExtension(j0c.class)) == null) {
            return false;
        }
        return j0cVar.j0();
    }

    public final void q(String str, JSON json, String str2) {
        cas casVar;
        ITMSPage topPage;
        cas casVar2;
        ITMSPage topPage2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df877ac8", new Object[]{this, str, json, str2});
            return;
        }
        ckf.g(str, "eventName");
        xhv xhvVar = null;
        if (!(str2 == null || (casVar2 = this.i) == null || (topPage2 = casVar2.getTopPage()) == null)) {
            topPage2.A(str2, str, json);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null && (casVar = this.i) != null && (topPage = casVar.getTopPage()) != null) {
            topPage.w(str, json);
        }
    }

    public final <T extends krb> T r(Class<T> cls) {
        ITMSPage iTMSPage;
        swd W;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((krb) ipChange.ipc$dispatch("3ff331de", new Object[]{this, cls}));
        }
        ckf.g(cls, "clz");
        bbs f = f();
        if (f != null && (t = (T) ((krb) f.getExtension(cls))) != null) {
            return t;
        }
        bbs f2 = f();
        if (f2 == null || (W = f2.W()) == null) {
            iTMSPage = null;
        } else {
            iTMSPage = W.getTopPage();
        }
        if (iTMSPage == null) {
            return null;
        }
        return (T) ((krb) iTMSPage.getExtension(cls));
    }

    public final void s() {
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        cas casVar = this.i;
        if (casVar != null && (topPage = casVar.getTopPage()) != null) {
            topPage.onPause();
        }
    }

    public final void t() {
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        cas casVar = this.i;
        if (casVar != null && (topPage = casVar.getTopPage()) != null) {
            topPage.onResume();
        }
    }

    public final void u() {
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        cas casVar = this.i;
        if (casVar != null && (topPage = casVar.getTopPage()) != null) {
            topPage.onStart();
        }
    }

    public final void v() {
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        cas casVar = this.i;
        if (casVar != null && (topPage = casVar.getTopPage()) != null) {
            topPage.onStop();
        }
    }

    public final void w() {
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        bbs f = f();
        if (f != null) {
            f.i("hasViewAppear", true);
        }
        cas casVar = this.i;
        if (casVar != null && (topPage = casVar.getTopPage()) != null) {
            topPage.onViewAppear();
        }
    }

    public final void x() {
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        bbs f = f();
        if (f != null) {
            f.i("hasViewAppear", false);
        }
        cas casVar = this.i;
        if (casVar != null && (topPage = casVar.getTopPage()) != null) {
            topPage.onViewDisappear();
        }
    }

    public final void y(yad yadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2028ef", new Object[]{this, yadVar});
            return;
        }
        ckf.g(yadVar, TrtcConstants.TRTC_PARAMS_EXTENSION);
        bbs f = f();
        if (f != null) {
            f.k0(yadVar);
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4183936a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        bbs f = f();
        if (f != null) {
            pcs pcsVar = new pcs();
            pcsVar.f26018a = str;
            f.reload(pcsVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9s(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(activity, viewGroup);
        ckf.g(activity, "activity");
        this.h = viewGroup2;
    }
}
