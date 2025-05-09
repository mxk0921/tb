package tb;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.Revision;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f33104a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ imn f33105a;
        public final /* synthetic */ JSONObject b;

        public a(imn imnVar, JSONObject jSONObject) {
            this.f33105a = imnVar;
            this.b = jSONObject;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            zyh.a(zyh.this, this.f33105a, this.b);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f33106a;

        public b(JSONObject jSONObject) {
            this.f33106a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences.Editor edit = m0b.c().getSharedPreferences("homepage_common", 0).edit();
            if (!TextUtils.isEmpty(this.f33106a.getString("lastVersion"))) {
                slp.e(dzj.a(zyh.b(zyh.this)), this.f33106a.getString("lastVersion"));
                edit.putString("HomePageLatestVersion", this.f33106a.getString("lastVersion"));
            }
            String jSONString = this.f33106a.toJSONString();
            edit.putString("homePassParams", jSONString);
            edit.commit();
            Intent intent = new Intent();
            intent.setAction("HomePassParamsUpdate");
            intent.putExtra("homePassParams", jSONString);
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        }
    }

    static {
        t2o.a(729809826);
    }

    public zyh(String str) {
        this.f33104a = str;
    }

    public static /* synthetic */ void a(zyh zyhVar, imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2fd480e", new Object[]{zyhVar, imnVar, jSONObject});
        } else {
            zyhVar.d(imnVar, jSONObject);
        }
    }

    public static /* synthetic */ String b(zyh zyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1af995a7", new Object[]{zyhVar});
        }
        return zyhVar.f33104a;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba9eb8", new Object[]{this, jSONObject});
        } else if ("coldStart".equals(jSONObject.getString("requestType"))) {
            String k = yyj.e().k();
            zza.d(k).a(k, "outPushPlanId");
        }
    }

    public final void d(imn imnVar, JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318bd941", new Object[]{this, imnVar, jSONObject});
            return;
        }
        vqa e = vqa.k().i("MTopRequest").j(fdv.F_DATA_PROCESS).e("MainContainerDataProcess:");
        if (jSONObject != null) {
            str = jSONObject.getString("requestType");
        } else {
            str = "";
        }
        e.g("requestType", str);
        AwesomeGetContainerData u = imnVar.u(this.f33104a);
        if (u == null) {
            e.g("homeMainData:null containerId", this.f33104a).a();
            return;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = u.base;
        if (!(awesomeGetContainerInnerData == null || (jSONObject2 = awesomeGetContainerInnerData.ext) == null || !awesomeGetContainerInnerData.isFirstPage)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("ucpConfig");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            Boolean bool = (Boolean) mza.d().c("homeNetLowOptimization", Boolean.class);
            if (bool == null || !bool.booleanValue() || !TextUtils.equals(sue.a(), "l")) {
                UppProtocolImpl.getInstance().addBizFeatures(jSONObject3, "Page_Home");
            }
            e.g("ucpConfig", jSONObject3.toString());
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("containerId", (Object) this.f33104a);
        e.g("containerId", this.f33104a);
        if (TextUtils.isEmpty(str)) {
            str = "pullRefresh";
        }
        jSONObject4.put("requestType", (Object) str);
        e.g("requestType", str);
        String str2 = "delta";
        jSONObject4.put(x96.REFRESH_TYPE, (Object) (u.base != null ? "base" : str2));
        if (u.base != null) {
            str2 = "base";
        }
        e.g(x96.REFRESH_TYPE, str2);
        UppProtocolImpl.getInstance().sendUCPEventWithScene("Page_Home", "request", jSONObject4);
        e.a();
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3301e15", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            Coordinator.execute(new b(jSONObject));
        }
    }

    public boolean f(imn imnVar, JSONObject jSONObject) {
        Map<String, AwesomeGetContainerData> map;
        String str;
        MessageQueue queue;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cd2d6f4", new Object[]{this, imnVar, jSONObject})).booleanValue();
        }
        AwesomeGetData awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        if (TextUtils.isEmpty(this.f33104a) || awesomeGetData == null || (map = awesomeGetData.containers) == null || map.get(this.f33104a) == null) {
            String str2 = "null";
            vqa g = vqa.k().i("MTopRequest").j(fdv.F_DATA_PROCESS).g("containerId", TextUtils.isEmpty(this.f33104a) ? str2 : this.f33104a);
            if (awesomeGetData != null) {
                str2 = "not null";
            }
            g.g("responseData", str2).a();
            return false;
        }
        AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.containers.get(this.f33104a);
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
        if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.dataChange) {
            z = true;
        }
        JSONObject passParams = awesomeGetContainerData.getPassParams();
        if (z) {
            imnVar.b0(awesomeGetData.globalUTParams);
            Revision.b().h(awesomeGetContainerData.getVersionInfo());
            z60.c().h();
        }
        if (z) {
            str = Constants.VAL_YES;
        } else {
            str = "no";
        }
        uqa.b("MTopRequest", fdv.F_DATA_PROCESS, "isBaseRefresh:".concat(str));
        e(passParams);
        if (!vxl.j() || Build.VERSION.SDK_INT < 23) {
            d(imnVar, jSONObject);
        } else {
            queue = Looper.getMainLooper().getQueue();
            queue.addIdleHandler(new a(imnVar, jSONObject));
        }
        nrv.a().f(awesomeGetContainerData.getExt());
        c(jSONObject);
        return true;
    }
}
