package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class obq implements r1e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "com.taobao.tao.TBMainActivity";
    public static final String KEY_OAID = "oaid";
    public static final String SPLASH_BUSINESS_TAG = "splash_business";

    /* renamed from: a  reason: collision with root package name */
    public n4u f25285a;
    public apj b;
    public d4u c;
    public final IContainerDataService<?> d;
    public final IContainerDataService.e e;
    public qsg f;
    public final List<q1e> g = new ArrayList();
    public final tsg h = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(obq obqVar) {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            String c = lbk.c(Globals.getApplication());
            if (TextUtils.isEmpty(c)) {
                fve.e("SplashBusinessController", "oaid is null");
                return null;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("oaid", c);
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements tsg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.tsg
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9ac39842", new Object[]{this})).booleanValue();
            }
            if (obq.e(obq.this) == null) {
                return false;
            }
            return obq.e(obq.this).r();
        }
    }

    static {
        t2o.a(491782702);
        t2o.a(491782723);
    }

    public obq(cfc cfcVar) {
        g(cfcVar);
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.d = iContainerDataService;
        IContainerDataService.e f = f();
        this.e = f;
        h(iContainerDataService, f);
    }

    public static /* synthetic */ apj e(obq obqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (apj) ipChange.ipc$dispatch("d34e20d4", new Object[]{obqVar});
        }
        return obqVar.b;
    }

    @Override // tb.r1e
    public void a(q5d q5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c29da", new Object[]{this, q5dVar});
            return;
        }
        qsg qsgVar = this.f;
        if (qsgVar != null) {
            qsgVar.b(q5dVar);
        }
    }

    @Override // tb.r1e
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("476519df", new Object[]{this});
        }
        apj apjVar = this.b;
        if (apjVar == null) {
            return null;
        }
        return apjVar.k();
    }

    @Override // tb.r1e
    public void c(IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4bdcdb", new Object[]{this, iContainerDataModel});
            return;
        }
        try {
            n4u n4uVar = this.f25285a;
            if (n4uVar == null || !n4uVar.a(iContainerDataModel.getBase())) {
                fve.e(SPLASH_BUSINESS_TAG, "onUpdateSplashData-> no need update.");
            } else {
                i();
                l(iContainerDataModel);
            }
        } catch (Throwable th) {
            fve.e(SPLASH_BUSINESS_TAG, "onUpdateSplashData->  onUpdateSplashData-> error：" + Log.getStackTraceString(th));
        }
    }

    @Override // tb.r1e
    public void d(q5d q5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd7e293", new Object[]{this, q5dVar});
            return;
        }
        qsg qsgVar = this.f;
        if (qsgVar != null) {
            qsgVar.l(q5dVar);
        }
    }

    public final IContainerDataService.e f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new a(this);
    }

    public final void g(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977b8851", new Object[]{this, cfcVar});
            return;
        }
        this.f25285a = new n4u(cfcVar);
        this.b = new apj(new cpj(cfcVar));
        this.c = new d4u(cfcVar);
        qsg b2 = usg.d().b();
        this.f = b2;
        b2.a(this.b);
        this.f.a(this.c);
        ((ArrayList) this.g).add(this.b);
        ((ArrayList) this.g).add(this.c);
    }

    public final void h(IContainerDataService<?> iContainerDataService, IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566a01a8", new Object[]{this, iContainerDataService, eVar});
        } else if (iContainerDataService != null) {
            iContainerDataService.addRequestBizParamsCreator(eVar);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb849017", new Object[]{this});
            return;
        }
        qsg qsgVar = this.f;
        if (qsgVar != null) {
            qsgVar.o(this.h);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4cc8", new Object[]{this});
            return;
        }
        qsg qsgVar = this.f;
        if (qsgVar != null) {
            apj apjVar = this.b;
            if (apjVar != null) {
                qsgVar.k(apjVar);
            }
            d4u d4uVar = this.c;
            if (d4uVar != null) {
                this.f.k(d4uVar);
                this.c = null;
            }
            qsg qsgVar2 = this.f;
            if (qsgVar2 != null) {
                qsgVar2.o(null);
            }
            ((ArrayList) this.g).clear();
        }
    }

    public final void k(IContainerDataService<?> iContainerDataService, IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce953b8f", new Object[]{this, iContainerDataService, eVar});
        } else if (iContainerDataService != null) {
            iContainerDataService.removeRequestBizParamsCreator(eVar);
        }
    }

    @Override // tb.r1e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        apj apjVar = this.b;
        if (apjVar != null) {
            apjVar.s();
        }
        d4u d4uVar = this.c;
        if (d4uVar != null) {
            d4uVar.y();
        }
        k(this.d, this.e);
        j();
    }

    @Override // tb.r1e
    public boolean expendTopViewRecord() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e64c398", new Object[]{this})).booleanValue();
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            if (((q1e) it.next()).b()) {
                z = true;
            }
        }
        fve.e(SPLASH_BUSINESS_TAG, "expendTopViewRecord");
        Iterator it2 = ((ArrayList) this.g).iterator();
        while (it2.hasNext()) {
            ((q1e) it2.next()).i();
        }
        return z;
    }

    public final void l(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee076ba", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && base.isRemote()) {
            JSONObject b2 = this.f25285a.b(base);
            StringBuilder sb = new StringBuilder("onUpdateSplashData-> update success, splashData is null:");
            if (b2 != null) {
                z = false;
            }
            sb.append(z);
            fve.e(SPLASH_BUSINESS_TAG, sb.toString());
            usg.d().g(b2);
        }
    }
}
