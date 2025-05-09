package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.MtopRequestHelper;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class njh extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "logisticsV2";
    public String j;
    public String k;
    public o5e l;
    public IDMComponent m;
    public final Set<String> n = new HashSet();
    public Context o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements pqb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pqb
        public void B1(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
            }
        }

        @Override // tb.pqb
        public void U1(JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
            }
        }

        @Override // tb.pqb
        public void X(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc8b03e2", new Object[]{this, str, mtopResponse, dataStatus, pageStatus});
            } else if (mtopResponse != null) {
                ldv.h(njh.J(njh.this), "newAddress", mtopResponse);
            }
        }

        @Override // tb.pqb
        public void h2(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
            } else if (mtopResponse != null) {
                kor.a("newAddress", "onSuccess", mtopResponse.getApi() + "-" + mtopResponse.getV(), mtopResponse.getRet().toString(), "请求成功");
                njh.K(njh.this, mtopResponse);
            }
        }
    }

    static {
        t2o.a(614465756);
    }

    public static /* synthetic */ Context J(njh njhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1880d14e", new Object[]{njhVar});
        }
        return njhVar.o;
    }

    public static /* synthetic */ void K(njh njhVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f24e9dc", new Object[]{njhVar, mtopResponse});
        } else {
            njhVar.L(mtopResponse);
        }
    }

    public static /* synthetic */ Object ipc$super(njh njhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/LogisticsSubscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "619610359928115438";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        kor.a("newAddress", "onHandleEventChain", "----");
        if (b8vVar != null && b8vVar.d() != null) {
            this.o = b8vVar.e();
            this.l = b8vVar.n();
            this.m = b8vVar.d();
            JSONObject E = E(b8vVar);
            if (E != null) {
                this.j = E.getString("mainOrderId");
                kor.a("newAddress", "onHandleEventChain", "mainOrderId =" + this.j);
                this.k = E.getString(CoreConstants.IN_PARAM_ARCHIVE);
                kor.a("newAddress", "onHandleEventChain", "archive =" + this.k);
                String h = b8vVar.h();
                kor.a("newAddress", "onHandleEventChain", "current eventKey =" + h);
                if (!((HashSet) this.n).contains(h)) {
                    M(h, b8vVar.e());
                    ((HashSet) this.n).add(h);
                }
            }
        }
    }

    public final void L(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672de5b1", new Object[]{this, mtopResponse});
        } else if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
            org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            JSONObject jSONObject = this.m.getFields().getJSONObject("mainTitle");
            if (!(jSONObject == null || dataJsonObject == null)) {
                try {
                    kor.a("newAddress", "notifyDataSetChanged", dataJsonObject.toString());
                    if (jSONObject.containsKey("desc") && !TextUtils.isEmpty(dataJsonObject.getString("description"))) {
                        jSONObject.put("desc", (Object) dataJsonObject.getString("description"));
                    }
                    if (jSONObject.containsKey("title") && !TextUtils.isEmpty(dataJsonObject.getString("title"))) {
                        jSONObject.put("title", (Object) dataJsonObject.getString("title"));
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            o5e o5eVar = this.l;
            if (o5eVar instanceof com.alibaba.android.ultron.vfw.instance.a) {
                ((com.alibaba.android.ultron.vfw.instance.a) o5eVar).X(2);
            }
        }
    }

    public final boolean M(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c5c8e71", new Object[]{this, str, context})).booleanValue();
        }
        if (!SUBSCRIBER_ID.equals(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.j)) {
            "true".equals(this.k);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("taobaoTradeId", this.j);
                MtopRequestHelper.a(new u3o(this.o).a(ncl.CAINIAO_API_NAME).C(hashMap).I("1.0").B(false), new a());
                kor.a("newAddress", "startAsyncLogisticsWork", "star load cainiao api");
            } catch (Throwable th) {
                ldv.d(this.o, "newAddress", th.toString());
            }
        } else {
            ldv.c(this.o, "newAddress", this.j, "");
        }
        return true;
    }
}
