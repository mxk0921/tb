package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ges;
import tb.t2i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class r2i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public t2i.c b;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f27056a = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<AppManifestManager.a> c = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements AppManifestManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.themis.kernel.metaInfo.manifest.AppManifestManager.a
        public void a(t2i.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c74fc60", new Object[]{this, cVar});
                return;
            }
            ckf.g(cVar, "result");
            r2i.c(r2i.this, cVar);
            r2i.a(r2i.this).set(true);
            if (!r2i.b(r2i.this).isEmpty()) {
                for (AppManifestManager.a aVar : r2i.b(r2i.this)) {
                    aVar.a(cVar);
                }
            }
        }
    }

    static {
        t2o.a(848298035);
    }

    public static final /* synthetic */ AtomicBoolean a(r2i r2iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("43a48f2e", new Object[]{r2iVar});
        }
        return r2iVar.f27056a;
    }

    public static final /* synthetic */ CopyOnWriteArrayList b(r2i r2iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("f8b77b49", new Object[]{r2iVar});
        }
        return r2iVar.c;
    }

    public static final /* synthetic */ void c(r2i r2iVar, t2i.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6abbc0", new Object[]{r2iVar, cVar});
        } else {
            r2iVar.b = cVar;
        }
    }

    public final void d(AppManifestManager.a aVar) {
        t2i.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645accbe", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "callback");
        if (!this.f27056a.get() || (cVar = this.b) == null) {
            this.c.add(aVar);
            return;
        }
        ckf.d(cVar);
        aVar.a(cVar);
    }

    public final void e(ges.a aVar) {
        AppManifestManager.RequestMode requestMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ca837b", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "baseInfo");
        if (!ges.INSTANCE.a(aVar)) {
            requestMode = AppManifestManager.RequestMode.NOCACHE;
        } else {
            requestMode = AppManifestManager.RequestMode.LAUNCH;
        }
        if (aVar.c() != null) {
            AppManifestManager appManifestManager = AppManifestManager.INSTANCE;
            String c = aVar.c();
            ckf.d(c);
            appManifestManager.m(c, null, requestMode, new a());
        }
    }
}
