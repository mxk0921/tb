package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rqm extends vs1<nqm, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final gqm e;
    public mle f;

    static {
        t2o.a(620757074);
    }

    public rqm(a aVar, gqm gqmVar) {
        super(aVar);
        this.e = gqmVar;
    }

    public static /* synthetic */ Object ipc$super(rqm rqmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/chain/PrefetchLastConsumer");
    }

    @Override // tb.vs1
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d42ad49", new Object[]{this});
            return;
        }
        v0a.g(getContext().Y());
        v0a.i(getContext().Y());
        this.e.d(getContext(), null, null);
        v0a.h(getContext().Y());
        mle mleVar = this.f;
        if (mleVar != null) {
            mleVar.c(getContext().Y());
        }
    }

    /* renamed from: p */
    public void l(nqm nqmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a429b284", new Object[]{this, nqmVar, new Boolean(z)});
            return;
        }
        v0a.i(getContext().Y());
        this.e.d(getContext(), nqmVar, null);
        v0a.h(getContext().Y());
        if (this.f != null) {
            getContext().Y().C = true;
            this.f.g(getContext().Y());
        }
    }

    public void q(mle mleVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272dfd11", new Object[]{this, mleVar});
        } else {
            this.f = mleVar;
        }
    }

    @Override // tb.vs1
    public void k(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56abcc3", new Object[]{this, th});
            return;
        }
        if (xv8.g(3) && th != null) {
            th.printStackTrace();
        }
        fiv.o("PrefetchConsumer", getContext(), "received failure=%s", th);
        v0a.i(getContext().Y());
        this.e.d(getContext(), null, th);
        v0a.h(getContext().Y());
        if (this.f != null) {
            getContext().Y().C = true;
            this.f.h(getContext().Y(), th);
        }
    }
}
