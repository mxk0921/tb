package tb;

import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b02;
import tb.v8f;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tbt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MORE_FEATURE = "taolivesearch";
    public static final String TAG = "TaoliveRoomMoreManager";
    public static tbt h;

    /* renamed from: a  reason: collision with root package name */
    public chd f28621a;
    public fhd b;
    public s6t d;
    public r6t e;
    public jby f;
    public boolean g = false;
    public final ucq c = com.taobao.appbundle.a.Companion.a().h();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f28622a;

        public a(tbt tbtVar, Application application) {
            this.f28622a = application;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            try {
                ((p5c) cls.newInstance()).init(this.f28622a, null);
                o3s.b(tbt.TAG, "installModuleMore onClassLoaded success class: " + cls);
            } catch (Exception e) {
                o3s.b(tbt.TAG, "installModuleMore onClassLoaded fail, Exception: " + e.getMessage());
                e.printStackTrace();
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                o3s.b(tbt.TAG, "installModuleMore onClassNotFound class: com.taobao.taolivehome.api.TaoliveHomeSDK");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements b02.b<p5c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f28623a;

        public b(tbt tbtVar, Application application) {
            this.f28623a = application;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            } else {
                o3s.b(tbt.TAG, "startInstallLiveHome onFailure");
            }
        }

        /* renamed from: c */
        public void b(p5c p5cVar, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dff0ef1", new Object[]{this, p5cVar, bundle});
                return;
            }
            o3s.b(tbt.TAG, "startInstallLiveHome onInstantiate");
            p5cVar.init(this.f28623a, bundle);
        }
    }

    static {
        t2o.a(806356379);
    }

    public static tbt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tbt) ipChange.ipc$dispatch("f55f031f", new Object[0]);
        }
        if (h == null) {
            h = new tbt();
        }
        return h;
    }

    public void a(chd chdVar, fhd fhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452c278", new Object[]{this, chdVar, fhdVar});
            return;
        }
        o3s.b(TAG, "bindRealLogic");
        this.f28621a = chdVar;
        this.b = fhdVar;
        if (fhdVar != null) {
            s6t s6tVar = this.d;
            if (s6tVar != null) {
                fhdVar.c(s6tVar);
            }
            r6t r6tVar = this.e;
            if (r6tVar != null) {
                this.b.b(r6tVar);
            }
        }
        if (this.g) {
            fhd fhdVar2 = this.b;
            if (fhdVar2 != null) {
                fhdVar2.init();
            }
            jby jbyVar = this.f;
            if (jbyVar != null) {
                jbyVar.a(this.f28621a);
            }
            this.g = false;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cacf75", new Object[]{this});
            return;
        }
        this.d = null;
        this.e = null;
        this.f = null;
        fhd fhdVar = this.b;
        if (fhdVar != null) {
            fhdVar.destroy();
        }
        this.g = false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99d61f85", new Object[]{this})).booleanValue();
        }
        fhd fhdVar = this.b;
        if (fhdVar != null) {
            return fhdVar.a();
        }
        return false;
    }

    public s6t e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s6t) ipChange.ipc$dispatch("a1aea88a", new Object[]{this});
        }
        return this.d;
    }

    public chd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (chd) ipChange.ipc$dispatch("4afa58ea", new Object[]{this});
        }
        return this.f28621a;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551db10b", new Object[]{this});
            return;
        }
        fhd fhdVar = this.b;
        if (fhdVar != null) {
            fhdVar.init();
        } else {
            this.g = true;
        }
    }

    public void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfc89dc", new Object[]{this, application});
        } else if (i(MORE_FEATURE)) {
            o3s.b(TAG, "installModuleMore isModuleMoreReady = true");
            zk9.b("com.taobao.taolivehome.api.TaoliveHomeSDK", new a(this, application));
        } else {
            o3s.b(TAG, "installModuleMore isModuleMoreReady = false startInstallLiveHome");
            m(application);
        }
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb7b004d", new Object[]{this, str})).booleanValue();
        }
        return bl9.g().b();
    }

    public void j(s6t s6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d409f708", new Object[]{this, s6tVar});
            return;
        }
        this.d = s6tVar;
        fhd fhdVar = this.b;
        if (fhdVar != null) {
            fhdVar.c(s6tVar);
        }
    }

    public void k(jby jbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ef4633", new Object[]{this, jbyVar});
        } else {
            this.f = jbyVar;
        }
    }

    public void l(r6t r6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43625b80", new Object[]{this, r6tVar});
            return;
        }
        this.e = r6tVar;
        fhd fhdVar = this.b;
        if (fhdVar != null) {
            fhdVar.b(r6tVar);
        }
    }

    public final void m(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7cd4", new Object[]{this, application});
            return;
        }
        v8f.b h2 = v8f.h(application, "com.taobao.taolivehome.api.TaoliveHomeSDK");
        h2.f(new b(this, application));
        vcq.a(application).c(xcq.c().k(h2.a()).n());
    }
}
