package tb;

import android.app.Application;
import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.api.c;
import com.taobao.android.shake.remote.IShakeRemoteApi;
import com.taobao.tao.Globals;
import tb.ahp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ahp f27367a;
    public IShakeRemoteApi b;
    public bhp c;
    public ViewStub d;
    public Boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ahp.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ahp.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            xgp.a("ShakeApiWrapper", "摇一摇远程化加载失败，errorMsg ： " + str);
            sgp.a(str);
        }

        @Override // tb.ahp.d
        public void b(IShakeRemoteApi iShakeRemoteApi) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76d4b4c", new Object[]{this, iShakeRemoteApi});
                return;
            }
            xgp.a("ShakeApiWrapper", "摇一摇远程化加载成功, shakeRemoteApi : " + iShakeRemoteApi);
            rgp.a(rgp.this, iShakeRemoteApi);
            rgp.b(rgp.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final rgp f27369a = new rgp(null);

        static {
            t2o.a(763363332);
        }

        public static /* synthetic */ rgp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rgp) ipChange.ipc$dispatch("ba935f0a", new Object[0]);
            }
            return f27369a;
        }
    }

    static {
        t2o.a(763363330);
    }

    public /* synthetic */ rgp(a aVar) {
        this();
    }

    public static /* synthetic */ IShakeRemoteApi a(rgp rgpVar, IShakeRemoteApi iShakeRemoteApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShakeRemoteApi) ipChange.ipc$dispatch("d7aa1e57", new Object[]{rgpVar, iShakeRemoteApi});
        }
        rgpVar.b = iShakeRemoteApi;
        return iShakeRemoteApi;
    }

    public static /* synthetic */ void b(rgp rgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70557126", new Object[]{rgpVar});
        } else {
            rgpVar.d();
        }
    }

    public static rgp f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgp) ipChange.ipc$dispatch("450cb5f0", new Object[0]);
        }
        return b.a();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b07fc1", new Object[]{this});
            return;
        }
        Application application = Globals.getApplication();
        if (application == null) {
            xgp.a("ShakeApiWrapper", "checkLoadShakeBundle context is null");
            return;
        }
        xgp.a("ShakeApiWrapper", "checkLoadShakeBundle");
        this.f27367a.e(application);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daedfbdc", new Object[]{this});
            return;
        }
        bhp bhpVar = this.c;
        if (bhpVar != null) {
            xgp.a("ShakeApiWrapper", "发生补偿 mShakeSensorRegisterModel");
            k(bhpVar.b(), bhpVar.c(), bhpVar.a());
            this.c = null;
        }
        ViewStub viewStub = this.d;
        if (viewStub != null) {
            xgp.a("ShakeApiWrapper", "发生补偿 mViewStub");
            i(viewStub);
            this.d = null;
        }
        Boolean bool = this.e;
        if (bool != null) {
            xgp.a("ShakeApiWrapper", "发生补偿 mIsEnable");
            g(bool.booleanValue());
            this.e = null;
        }
    }

    public final ahp.d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ahp.d) ipChange.ipc$dispatch("777de093", new Object[]{this});
        }
        return new a();
    }

    public boolean g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e55ac9fc", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        xgp.a("ShakeApiWrapper", "homePageEnableShake enable : " + z);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            return iShakeRemoteApi.homePageEnableShake(z);
        }
        this.e = Boolean.valueOf(z);
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1954173c", new Object[]{this})).booleanValue();
        }
        xgp.a("ShakeApiWrapper", "homePageUnregisterService homePageIsShakeEnable. : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            return iShakeRemoteApi.homePageIsShakeEnable();
        }
        return false;
    }

    public boolean i(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8be40bd", new Object[]{this, viewStub})).booleanValue();
        }
        xgp.a("ShakeApiWrapper", "homePageRegisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.homePageRegisterService(viewStub);
        } else {
            this.d = viewStub;
            xgp.a("ShakeApiWrapper", "homePageRegisterService 检查下载远程bundle");
            c();
        }
        return true;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0ff72", new Object[]{this});
            return;
        }
        xgp.a("ShakeApiWrapper", "homePageUnregisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.homePageUnregisterService();
        } else {
            this.d = null;
        }
    }

    public void k(Context context, c.b bVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf7b0823", new Object[]{this, context, bVar, aVar});
            return;
        }
        xgp.a("ShakeApiWrapper", "shakeSensorRegisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.shakeSensorRegisterService(context, bVar, aVar);
            return;
        }
        this.c = new bhp(context, bVar, aVar);
        xgp.a("ShakeApiWrapper", "shakeSensorRegisterService 检查下载远程bundle");
        c();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9498bd", new Object[]{this});
            return;
        }
        xgp.a("ShakeApiWrapper", "shakeSensorRequestDetection mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.shakeSensorRequestDetection();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99421860", new Object[]{this});
            return;
        }
        xgp.a("ShakeApiWrapper", "shakeSensorUnregisterService mShakeRemoteApi : " + this.b);
        IShakeRemoteApi iShakeRemoteApi = this.b;
        if (iShakeRemoteApi != null) {
            iShakeRemoteApi.shakeSensorUnregisterService();
        } else {
            this.c = null;
        }
    }

    public rgp() {
        this.f27367a = new ahp(e());
        c();
    }
}
