package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import java.util.Set;
import tb.jbs;
import tb.mwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class kcs implements mwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<? extends mwd>> f22570a = jfp.c(c9s.class);
    public final Set<jbs.a> b = jfp.c(jbs.a.e(jbs.a.Companion.a()));
    public final ExecutorType c = ExecutorType.UI;

    static {
        t2o.a(839909743);
        t2o.a(839909724);
    }

    @Override // tb.mwd
    public Set<jbs.a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e038254a", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.mwd
    public Set<Class<? extends mwd>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("aeaeee15", new Object[]{this});
        }
        return this.f22570a;
    }

    @Override // tb.mwd
    public void c(jbs jbsVar, mwd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc1e853", new Object[]{this, jbsVar, aVar});
            return;
        }
        ckf.g(jbsVar, "launchRuntime");
        ckf.g(aVar, "callback");
        c9s c9sVar = (c9s) jbsVar.g(c9s.class);
        x4b x4bVar = null;
        ITMSPage f = c9sVar == null ? null : c9sVar.f();
        IpChange ipChange2 = TMSAssertUtils.$ipChange;
        if (f != null) {
            jbsVar.getInstance().W().a(f);
            Object extension = jbsVar.getInstance().getExtension(ngb.class);
            if (extension instanceof x4b) {
                x4bVar = (x4b) extension;
            }
            if (x4bVar != null) {
                x4bVar.t(f);
            }
            jbsVar.getInstance().T().k(jbs.a.Companion.c());
            aVar.onSuccess();
        }
    }

    @Override // tb.mwd
    public ExecutorType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorType) ipChange.ipc$dispatch("23c9b0d7", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.mwd
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSPushPageTask";
    }
}
