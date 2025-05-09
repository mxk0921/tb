package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.actionreport.bussiness.ActionReportRequest;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vjl implements f9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f30045a;
    public int c = 0;
    public int d = 0;
    public final nt1 e = new nt1(new a());
    public int b = hjr.j();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            o3s.b("ActionReportManager", "onError: " + netResponse.getRetMsg());
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netResponse != null && netResponse.getDataJsonObject() != null) {
                try {
                    JSONObject dataJsonObject = netResponse.getDataJsonObject();
                    if (dataJsonObject == null || !dataJsonObject.has("loopInterval")) {
                        o3s.b("ActionReportManager", "心跳间隔Key不存在于JSON中");
                    } else {
                        int i2 = dataJsonObject.getInt("loopInterval");
                        if (i2 > 0 && vjl.c(vjl.this) != i2) {
                            o3s.b("ActionReportManager", "更新心跳间隔:" + i2);
                            vjl.d(vjl.this, i2);
                        }
                    }
                } catch (Exception e) {
                    o3s.b("ActionReportManager", "onSuccess: " + e);
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            o3s.b("ActionReportManager", "onSystemError: " + netResponse.getRetMsg());
        }
    }

    static {
        t2o.a(295699836);
        t2o.a(806356557);
    }

    public vjl(ux9 ux9Var) {
        this.f30045a = ux9Var;
    }

    public static /* synthetic */ int c(vjl vjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1761d268", new Object[]{vjlVar})).intValue();
        }
        return vjlVar.b;
    }

    public static /* synthetic */ int d(vjl vjlVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afb2695f", new Object[]{vjlVar, new Integer(i)})).intValue();
        }
        vjlVar.b = i;
        return i;
    }

    @Override // tb.f9z
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7405b9e", new Object[]{this, new Integer(i)});
            return;
        }
        g(i);
        if (this.f30045a == null) {
            o3s.b("ActionReportManager", "frameContext is null");
            return;
        }
        ActionReportRequest actionReportRequest = new ActionReportRequest();
        actionReportRequest.liveId = this.f30045a.i;
        actionReportRequest.actionList = fkx.i(e());
        if (this.f30045a.g() == null || this.f30045a.g().a() == null || this.f30045a.g().a().broadCaster == null || this.f30045a.g().a().broadCaster.encodeAccountId == null) {
            o3s.b("ActionReportManager", "encodeAccountId is null");
            return;
        }
        actionReportRequest.encodeAnchorId = this.f30045a.g().a().broadCaster.encodeAccountId;
        this.e.C(1, actionReportRequest, null);
    }

    @Override // tb.f9z
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65ea9de9", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final JSONArray e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("82fb9cad", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(f());
        return jSONArray;
    }

    public final com.alibaba.fastjson.JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("b02175c3", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
        jSONObject2.put("time", (Object) Integer.valueOf(this.c));
        jSONObject2.put("addUpTime", (Object) Integer.valueOf(this.d));
        jSONObject.put("action", (Object) "stay");
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47349de6", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        this.d += i;
    }
}
