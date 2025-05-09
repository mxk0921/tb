package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.status.RSoStatus;
import java.io.File;
import tb.lgd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gbn implements hbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f19870a;
    public final kgd b;
    public final agd c;
    public final lgd d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements lgd.a<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(gbn gbnVar) {
        }

        /* renamed from: b */
        public Boolean a(RSoStatus rSoStatus, lgd.c cVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("c0ba6e97", new Object[]{this, rSoStatus, cVar});
            }
            if (rSoStatus != RSoStatus.LOADED_IN_MEMORY) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements nan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19871a;
        public final /* synthetic */ u5h b;

        public b(String str, u5h u5hVar) {
            this.f19871a = str;
            this.b = u5hVar;
        }

        @Override // tb.nan
        public void a(pan panVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("168e9942", new Object[]{this, panVar});
                return;
            }
            try {
                this.b.onLoadFinished(gbn.d(gbn.this, this.f19871a, panVar));
            } catch (Throwable th) {
                this.b.onLoadFinished(l6h.b(this.f19871a, RSoException.error(4010, th)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements lgd.a<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(gbn gbnVar) {
        }

        /* renamed from: b */
        public Boolean a(RSoStatus rSoStatus, lgd.c cVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("c0ba6e97", new Object[]{this, rSoStatus, cVar});
            }
            if (rSoStatus != RSoStatus.LOADED_IN_MEMORY) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements lgd.a<Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19872a;
        public final /* synthetic */ z6o b;
        public final /* synthetic */ String c;

        public d(String str, z6o z6oVar, String str2) {
            this.f19872a = str;
            this.b = z6oVar;
            this.c = str2;
        }

        /* renamed from: b */
        public Void a(RSoStatus rSoStatus, lgd.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("7121a23", new Object[]{this, rSoStatus, cVar});
            }
            RSoStatus rSoStatus2 = RSoStatus.LOADED_IN_MEMORY;
            if (rSoStatus == rSoStatus2) {
                RSoLog.d("doLoad -> already loaded = " + this.f19872a);
                return null;
            }
            RSoStatus rSoStatus3 = RSoStatus.LOADING;
            if (rSoStatus == rSoStatus3) {
                rbn.e("doLoad,loading", this.b + " " + rSoStatus);
            }
            try {
                RSoLog.d("doLoad -> libFullPath = " + this.f19872a);
                if (!trq.c(this.f19872a)) {
                    cVar.a(rSoStatus3);
                    gbn.e(gbn.this, this.c, this.f19872a);
                    RSoLog.d("doLoad -> finish, libFullPath = " + this.f19872a);
                    cVar.a(rSoStatus2);
                    return null;
                }
                throw new IllegalStateException(this.c + "'s libFullPath is empty, wtf?");
            } catch (Throwable th) {
                rbn.e("doLoad -> failed", this.c + this.f19872a + th);
                cVar.a(RSoStatus.LOAD_FAILED);
                throw RSoException.error(4021, th);
            }
        }
    }

    public gbn(cgd cgdVar, kgd kgdVar, agd agdVar, lgd lgdVar) {
        this.f19870a = cgdVar;
        this.b = kgdVar;
        this.c = agdVar;
        this.d = lgdVar;
    }

    public static /* synthetic */ l6h d(gbn gbnVar, String str, pan panVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("e383a2eb", new Object[]{gbnVar, str, panVar});
        }
        return gbnVar.g(str, panVar);
    }

    public static /* synthetic */ void e(gbn gbnVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cffb0fc", new Object[]{gbnVar, str, str2});
        } else {
            gbnVar.h(str, str2);
        }
    }

    @Override // tb.hbn
    public void a(String str, u5h u5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27e1402", new Object[]{this, str, u5hVar});
            return;
        }
        try {
            if (this.f19870a.h(str)) {
                RSoLog.a("loadAsync ->  lib in config is disabled, libName=" + str);
                u5hVar.onLoadFinished(l6h.a(str, 4003));
                return;
            }
            this.c.a(str, new b(str, u5hVar));
        } catch (Throwable th) {
            RSoLog.c("loader, loadAsync error:", th);
            u5hVar.onLoadFinished(l6h.b(str, RSoException.error((int) RSoException.ERROR_LOAD_ASYNC_FAILED, th)));
        }
    }

    @Override // tb.hbn
    public l6h c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("8aed7eb3", new Object[]{this, str});
        }
        try {
            if (this.f19870a.h(str)) {
                return l6h.a(str, 4003);
            }
            return g(str, this.c.c(str));
        } catch (Throwable th) {
            RSoLog.c("loader, loadSync error:", th);
            return l6h.b(str, RSoException.error((int) RSoException.ERROR_LOAD_SYNC_FAILED, th));
        }
    }

    public final void f(a7o a7oVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f7e531", new Object[]{this, a7oVar, str, str2});
            return;
        }
        z6o g = a7oVar.g();
        this.d.b(g, new d(str2, g, str));
    }

    public final l6h g(String str, pan panVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("d2b07d83", new Object[]{this, str, panVar});
        }
        RSoLog.d("loadPullResult, enter, lib=" + str);
        long b2 = uos.b();
        a7o b3 = panVar.b();
        SoIndexData.SoFileInfo c2 = b3.c();
        if (((Boolean) this.d.b(b3.g(), new c(this))).booleanValue()) {
            RSoLog.d("loadPullResult, already loaded, lib=" + str + ", cost=" + (uos.b() - b2));
            return l6h.j(str).l(c2.getMajorVersion(), c2.getMinorVersion()).k(b3.i());
        } else if (b3.j()) {
            for (a7o a7oVar : panVar.a()) {
                f(a7oVar, a7oVar.e(), a7oVar.d());
            }
            RSoLog.d("loadPullResult, success, lib=" + str + ", cost=" + (uos.b() - b2));
            return l6h.j(str).l(c2.getMajorVersion(), c2.getMinorVersion()).k(b3.i());
        } else {
            RSoException b4 = b3.b();
            if (b4 == null) {
                b4 = RSoException.error(4001, b3.e() + " needed by " + str + " load failed");
            }
            RSoLog.d("loadPullResult, resolve failed, lib=" + str + ", cost=" + (uos.b() - b2));
            return l6h.b(str, b4).k(b3.i());
        }
    }

    public final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6749702", new Object[]{this, str, str2});
        } else if (!this.b.b()) {
            System.load(str2);
            RSoLog.d("SWSoLoaderCore, succ load in other process, " + str + ",  libPath " + str2);
        } else {
            try {
                RSoLog.d("SWSoLoaderCore, performLoad enter " + str);
                File c2 = goq.c(this.b.getApp(), "nativeLib");
                goo.a(goo.class.getClassLoader(), c2);
                goq.a(new File(str2), c2);
                System.loadLibrary(str);
                RSoLog.d("SWSoLoaderCore, succ loadLibrary " + str);
            } catch (Throwable th) {
                rbn.f("SWSoLoaderCore,loadLibrary", str, th);
                System.load(str2);
                RSoLog.d("SWSoLoaderCore, succ load " + str + ",  libPath " + str2);
            }
        }
    }

    @Override // tb.hbn
    public l6h load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("e22015f8", new Object[]{this, str});
        }
        try {
            if (!this.f19870a.h(str)) {
                return g(str, this.c.b(str));
            }
            RSoLog.a("load -> failure , lib in config is disabled, libName=" + str);
            return l6h.a(str, 4003);
        } catch (Throwable th) {
            RSoLog.c("loader, load error:", th);
            return l6h.b(str, RSoException.error(4001, th));
        }
    }

    @Override // tb.hbn
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f98724", new Object[]{this, str})).booleanValue();
        }
        if (trq.c(str)) {
            return false;
        }
        try {
            a7o b2 = this.c.b(str).b();
            if (b2.j()) {
                return ((Boolean) this.d.b(b2.g(), new a(this))).booleanValue();
            }
        } catch (Throwable th) {
            rbn.g("isLoaded,error", th);
        }
        return false;
    }
}
