package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class r30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f27076a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27077a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ imn c;

        public a(boolean z, JSONObject jSONObject, imn imnVar) {
            this.f27077a = z;
            this.b = jSONObject;
            this.c = imnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f27077a) {
                zjn.p(r30.a(r30.this), this.b);
            }
            tpv.a(r30.b(r30.this, this.c, this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f27078a;

        public b(JSONObject jSONObject) {
            this.f27078a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = this.f27078a.getJSONObject("content");
            if (jSONObject != null && jSONObject.containsKey("LBS")) {
                m6g.d(jSONObject.getString("LBS"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ imn f27079a;
        public final /* synthetic */ JSONObject b;

        public c(imn imnVar, JSONObject jSONObject) {
            this.f27079a = imnVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                r30.c(r30.this, this.f27079a, this.b);
            }
        }
    }

    static {
        t2o.a(729809835);
    }

    public r30(String str) {
        this.f27076a = str;
    }

    public static /* synthetic */ String a(r30 r30Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9c33a3e", new Object[]{r30Var});
        }
        return r30Var.f27076a;
    }

    public static /* synthetic */ Runnable b(r30 r30Var, imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("95f7a66f", new Object[]{r30Var, imnVar, jSONObject});
        }
        return r30Var.d(imnVar, jSONObject);
    }

    public static /* synthetic */ void c(r30 r30Var, imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f48bc6", new Object[]{r30Var, imnVar, jSONObject});
        } else {
            r30Var.g(imnVar, jSONObject);
        }
    }

    public final Runnable d(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("750ff306", new Object[]{this, imnVar, jSONObject});
        }
        return new c(imnVar, jSONObject);
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab928b9", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("content")) {
            Coordinator.execute(new b(jSONObject));
        }
    }

    public final void g(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7f240", new Object[]{this, imnVar, jSONObject});
            return;
        }
        vqa j = vqa.k().i("MTopRequest").j("refreshGlobalControl");
        JSONObject A = imnVar.A();
        if (A == null) {
            j.e("ext == null").a();
            return;
        }
        String string = jSONObject.getString("requestType");
        if (TextUtils.isEmpty(string)) {
            j.e("requestType == null").a();
        } else if (A.getBooleanValue("updateLtv")) {
            NativeDelegate.refreshGlobalControl(string);
            j.e("通知behaviorX").a();
        }
    }

    public void e(imn imnVar, JSONObject jSONObject) {
        Map<String, AwesomeGetContainerData> map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b2100b", new Object[]{this, imnVar, jSONObject});
            return;
        }
        AwesomeGetData awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        if (!TextUtils.isEmpty(this.f27076a) && awesomeGetData != null && (map = awesomeGetData.containers) != null && map.get(this.f27076a) != null) {
            AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.containers.get(this.f27076a);
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
            if (awesomeGetContainerInnerData == null || !awesomeGetContainerInnerData.dataChange) {
                z = false;
            }
            String string = jSONObject.getString("dataChangeType");
            JSONObject clientCache = awesomeGetContainerData.getClientCache();
            if (TextUtils.equals("delta", string)) {
                clientCache = awesomeGetContainerData.getClientCacheDelta();
            }
            phg.b("handleLocationParam");
            f(clientCache);
            phg.a("handleLocationParam");
            phg.b("handleDeltaPassParams");
            yb7.a().b(awesomeGetContainerData);
            phg.a("handleDeltaPassParams");
            vqa k = vqa.k();
            JSONObject jSONObject2 = awesomeGetData.ext;
            if (jSONObject2 == null || !TextUtils.equals("true", jSONObject2.getString("isSwitchVersionByNewSDK"))) {
                phg.b("updateSTDElderHomeInfo");
                ta8.j(Globals.getApplication(), awesomeGetContainerData.getExt());
                phg.a("updateSTDElderHomeInfo");
                k.i("Revision").j("edition_switch").e("switchOldSdk.");
            } else {
                phg.b("onVersionResponse");
                JSONObject jSONObject3 = awesomeGetData.ext.getJSONObject("switchVersionResponse");
                IHomeEditionSwitchService iHomeEditionSwitchService = (IHomeEditionSwitchService) c4b.i().h(IHomeEditionSwitchService.class);
                if (iHomeEditionSwitchService != null) {
                    iHomeEditionSwitchService.updateRevisionSwitch(jSONObject3);
                }
                phg.a("onVersionResponse");
                k.i("Revision").j("edition_switch").e("switchNewSdk.");
                if (jSONObject3 != null) {
                    k.e(jSONObject3.toString());
                } else {
                    k.e("versionResponse : null");
                }
            }
            m5a.a().e(new a(z, jSONObject, imnVar));
            k.a();
        }
    }
}
