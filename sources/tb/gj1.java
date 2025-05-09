package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.augecore.data.CrowdResponse;
import com.taobao.augecore.data.CrowdResponseData;
import com.taobao.augecore.data.GroupData;
import com.taobao.augecore.data.SpecialCrowd;
import com.taobao.augecore.network.NetworkRequest;
import com.taobao.augecore.network.NetworkResponse;
import com.taobao.login4android.api.Login;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROID_TOKEN = "dT1jcm93ZC1hbmRyb2lk";
    public static final String GROUP_DATA = "group_data";
    public static final String GROUP_DATA_EXPIRE_TIME = "group_data_expire_time";
    public static final String GROUP_DATA_LOW_BUYER = "group_data_low_buyer";

    /* renamed from: a  reason: collision with root package name */
    public List<GroupData> f20036a;
    public String b;
    public boolean c;
    public long d;
    public String e;
    public SpecialCrowd f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements guj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ry4 f20037a;

        public a(ry4 ry4Var) {
            this.f20037a = ry4Var;
        }

        public void a(NetworkResponse networkResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4dfca8e", new Object[]{this, networkResponse});
                return;
            }
            hj1.b(jj1.LOG_TAG, "response: 错误信息 === " + networkResponse.errorMsg);
            this.f20037a.a(new ArrayList(), "");
            gj1.this.c = false;
        }

        public void b(NetworkResponse networkResponse) {
            CrowdResponseData crowdResponseData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9944aa33", new Object[]{this, networkResponse});
                return;
            }
            hj1.a(jj1.LOG_TAG, "response data === " + networkResponse.jsonData);
            BaseOutDo baseOutDo = networkResponse.pojo;
            if (!(baseOutDo == null || (crowdResponseData = (CrowdResponseData) baseOutDo.getData()) == null)) {
                gj1.this.f20036a = crowdResponseData.getCrowds();
                gj1.b(gj1.this, crowdResponseData.getExpireTime());
                gj1.this.f = crowdResponseData.getSpecialCrowd();
            }
            fj1.n().u(gj1.this.f20036a);
            ry4 ry4Var = this.f20037a;
            gj1 gj1Var = gj1.this;
            ry4Var.a(gj1Var.f20036a, gj1.a(gj1Var));
            fj1 n = fj1.n();
            gj1 gj1Var2 = gj1.this;
            n.v(gj1Var2.f20036a, gj1.a(gj1Var2));
            if (gj1.this.f != null) {
                fj1.n().y(gj1.this.f.getLowbuyer());
                fj1.n().x(gj1.this.f.getLowbuyer());
            }
            gj1.this.c = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gj1 f20038a = new gj1(null);

        public static /* synthetic */ gj1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gj1) ipChange.ipc$dispatch("1b998fb7", new Object[0]);
            }
            return f20038a;
        }
    }

    public /* synthetic */ gj1(a aVar) {
        this();
    }

    public static /* synthetic */ String a(gj1 gj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfc5f30f", new Object[]{gj1Var});
        }
        return gj1Var.b;
    }

    public static /* synthetic */ String b(gj1 gj1Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44f2ef03", new Object[]{gj1Var, str});
        }
        gj1Var.b = str;
        return str;
    }

    public static gj1 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gj1) ipChange.ipc$dispatch("82d0b332", new Object[0]);
        }
        return b.a();
    }

    public gj1() {
        this.f20036a = new ArrayList();
        this.c = false;
        this.d = 0L;
    }

    public void d(ry4 ry4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471273ec", new Object[]{this, ry4Var});
            return;
        }
        try {
            String userId = Login.getUserId();
            if (System.currentTimeMillis() - this.d <= m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT && this.e == userId) {
                hj1.a(jj1.LOG_TAG, "三分钟之内，不重复请求，返回上一次请求结果:groupDataList=" + this.f20036a + "  mExpireTime=" + this.b);
                ry4Var.a(this.f20036a, this.b);
            }
            this.c = true;
            this.d = System.currentTimeMillis();
            this.e = userId;
            HashMap hashMap = new HashMap();
            hashMap.put("imei", ej1.d(jj1.h().f22023a));
            hashMap.put("imsi", ej1.e(jj1.h().f22023a));
            hashMap.put("userid", userId);
            hashMap.put("utdid", UTDevice.getUtdid(jj1.h().f22023a));
            hashMap.put("bizCode", ej1.b());
            NetworkRequest networkRequest = new NetworkRequest();
            networkRequest.setParams(JSON.toJSONString(hashMap));
            networkRequest.setToken(ANDROID_TOKEN);
            hj1.a(jj1.LOG_TAG, "requestData === 请求参数 === " + networkRequest.getParams() + "  token = dT1jcm93ZC1hbmRyb2lk");
            ij1.a().b(new a(ry4Var), networkRequest, jj1.h().e(), CrowdResponse.class);
            ej1.a(ej1.AUGE_LOCAL_BIZ_CODE);
        } catch (Exception unused) {
            this.c = false;
        }
    }
}
