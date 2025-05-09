package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.detail.industry.hourlydelivery.DeliveryBiz;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vb7 implements uyb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "DeliverUniContainerLogic";

    /* renamed from: a  reason: collision with root package name */
    public zfr<xfr> f29904a;
    public nfr b;
    public DeliveryBiz c;
    public Uri d;
    public final nv e;
    public final fdc f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(440401952);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(440401951);
        t2o.a(440401979);
    }

    public vb7(nv nvVar, fdc fdcVar) {
        ckf.g(nvVar, "tabController");
        ckf.g(fdcVar, "callback");
        this.e = nvVar;
        this.f = fdcVar;
    }

    public static final /* synthetic */ DeliveryBiz a(vb7 vb7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeliveryBiz) ipChange.ipc$dispatch("fc0dbc1e", new Object[]{vb7Var});
        }
        DeliveryBiz deliveryBiz = vb7Var.c;
        if (deliveryBiz != null) {
            return deliveryBiz;
        }
        ckf.y(es6.DP_BIZ_CONTEXT);
        throw null;
    }

    public static final /* synthetic */ nfr b(vb7 vb7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfr) ipChange.ipc$dispatch("29f3f0d2", new Object[]{vb7Var});
        }
        nfr nfrVar = vb7Var.b;
        if (nfrVar != null) {
            return nfrVar;
        }
        ckf.y("context");
        throw null;
    }

    public static final /* synthetic */ zfr c(vb7 vb7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfr) ipChange.ipc$dispatch("9c69bfdc", new Object[]{vb7Var});
        }
        zfr<xfr> zfrVar = vb7Var.f29904a;
        if (zfrVar != null) {
            return zfrVar;
        }
        ckf.y("pageManager");
        throw null;
    }

    public static final /* synthetic */ void d(vb7 vb7Var, DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56fba5d2", new Object[]{vb7Var, deliveryBiz});
        } else {
            vb7Var.c = deliveryBiz;
        }
    }

    public static final /* synthetic */ void e(vb7 vb7Var, nfr nfrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1886a2e", new Object[]{vb7Var, nfrVar});
        } else {
            vb7Var.b = nfrVar;
        }
    }

    public static final /* synthetic */ void f(vb7 vb7Var, zfr zfrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15e7b6", new Object[]{vb7Var, zfrVar});
        } else {
            vb7Var.f29904a = zfrVar;
        }
    }

    @Override // tb.uyb
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.f29904a == null) {
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b(TAG, "generate page manager: " + this);
            this.b = new nfr(context);
            nfr nfrVar = this.b;
            if (nfrVar != null) {
                this.f29904a = new zfr<>(nfrVar);
                nv nvVar = this.e;
                fdc fdcVar = this.f;
                nfr nfrVar2 = this.b;
                if (nfrVar2 != null) {
                    zfr<xfr> zfrVar = this.f29904a;
                    if (zfrVar != null) {
                        this.c = new DeliveryBiz(nvVar, fdcVar, nfrVar2, zfrVar);
                        if (this.d != null) {
                            nfr nfrVar3 = this.b;
                            if (nfrVar3 != null) {
                                nfrVar3.h().d("outLinkUri", this.d);
                                this.d = null;
                            } else {
                                ckf.y("context");
                                throw null;
                            }
                        }
                        zfr<xfr> zfrVar2 = this.f29904a;
                        if (zfrVar2 != null) {
                            DeliveryBiz deliveryBiz = this.c;
                            if (deliveryBiz != null) {
                                zfrVar2.q(deliveryBiz);
                                zfr<xfr> zfrVar3 = this.f29904a;
                                if (zfrVar3 != null) {
                                    zfrVar3.p(null);
                                    zfr<xfr> zfrVar4 = this.f29904a;
                                    if (zfrVar4 != null) {
                                        zfrVar4.f(null);
                                    } else {
                                        ckf.y("pageManager");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("pageManager");
                                    throw null;
                                }
                            } else {
                                ckf.y(es6.DP_BIZ_CONTEXT);
                                throw null;
                            }
                        } else {
                            ckf.y("pageManager");
                            throw null;
                        }
                    } else {
                        ckf.y("pageManager");
                        throw null;
                    }
                } else {
                    ckf.y("context");
                    throw null;
                }
            } else {
                ckf.y("context");
                throw null;
            }
        }
        zfr<xfr> zfrVar5 = this.f29904a;
        if (zfrVar5 != null) {
            return zfrVar5.b();
        }
        ckf.y("pageManager");
        throw null;
    }

    @Override // tb.uyb
    public JSONObject getSubTabSearchBoxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e039d89", new Object[]{this});
        }
        wfr.INSTANCE.d(TAG, "getSubTabSearchBoxData");
        DeliveryBiz deliveryBiz = this.c;
        if (deliveryBiz != null) {
            return deliveryBiz.u();
        }
        return null;
    }

    @Override // tb.uyb
    public String getUpdatePageName() {
        String d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        nfr nfrVar = this.b;
        if (nfrVar == null) {
            return null;
        }
        if (nfrVar != null) {
            xb7 xb7Var = (xb7) nfrVar.d().b();
            if (xb7Var == null || (d = xb7Var.d()) == null) {
                return "/Page_xsdshouye";
            }
            return d;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.uyb
    public Map<String, String> getUpdatePageProperties() {
        Map<String, String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        if (this.b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a21xl4.xsd-shouye.0.0");
        hashMap.put("xsd_source", "homeTab");
        hashMap.put("source", "1");
        nfr nfrVar = this.b;
        if (nfrVar != null) {
            xb7 xb7Var = (xb7) nfrVar.d().b();
            return (xb7Var == null || (e = xb7Var.e()) == null) ? hashMap : e;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.uyb
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        nfr nfrVar = this.b;
        if (nfrVar == null) {
            return null;
        }
        if (nfrVar != null) {
            xb7 xb7Var = (xb7) nfrVar.d().b();
            if (xb7Var != null) {
                return xb7Var.f();
            }
            return null;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.uyb
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        nfr nfrVar = this.b;
        if (nfrVar == null) {
            return false;
        }
        if (nfrVar != null) {
            Boolean bool = (Boolean) nfrVar.h().a("enableRefresh");
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.uyb
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        wfr.INSTANCE.d(TAG, "notifyOutLinkParams");
        Uri data = intent.getData();
        if (data != null) {
            DeliveryBiz deliveryBiz = this.c;
            if (deliveryBiz != null) {
                deliveryBiz.w(data);
            } else {
                this.d = data;
            }
        }
    }

    @Override // tb.uyb
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        DeliveryBiz deliveryBiz = this.c;
        if (deliveryBiz != null) {
            deliveryBiz.x();
        }
    }

    @Override // tb.uyb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        wfr.INSTANCE.d(TAG, "onDestroy");
        zfr<xfr> zfrVar = this.f29904a;
        if (zfrVar == null) {
            return;
        }
        if (zfrVar != null) {
            zfrVar.g();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // tb.uyb
    public void onPageSelected() {
        qc4 a2;
        String a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        nfr nfrVar = this.b;
        if (nfrVar == null) {
            return;
        }
        if (nfrVar != null) {
            xb7 xb7Var = (xb7) nfrVar.d().b();
            if (xb7Var != null && (a2 = xb7Var.a()) != null && (a3 = a2.a()) != null) {
                nfr nfrVar2 = this.b;
                if (nfrVar2 != null) {
                    na4<?> b = nfrVar2.b().b(a3);
                    if (b != null) {
                        b.a();
                        return;
                    }
                    return;
                }
                ckf.y("context");
                throw null;
            }
            return;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.uyb
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        DeliveryBiz deliveryBiz = this.c;
        if (deliveryBiz != null) {
            deliveryBiz.y();
        }
    }

    @Override // tb.uyb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        zfr<xfr> zfrVar = this.f29904a;
        if (zfrVar == null) {
            return;
        }
        if (zfrVar != null) {
            zfrVar.l();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // tb.uyb
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        nfr nfrVar = this.b;
        if (nfrVar == null) {
            return false;
        }
        if (nfrVar != null) {
            Boolean bool = (Boolean) nfrVar.h().a("showRocket");
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        ckf.y("context");
        throw null;
    }
}
