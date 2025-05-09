package com.taobao.android.tbsku.bizevent;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.ContractSelectedRet;
import com.taobao.android.detail.sdk.model.node.ContractNode;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.ag0;
import tb.b8v;
import tb.cjz;
import tb.ds0;
import tb.f8v;
import tb.gr4;
import tb.lfb;
import tb.pr0;
import tb.q2q;
import tb.t2o;
import tb.v2q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ContractOpenHandler implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_detailAction";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ContractSelectedRet> f9573a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gr4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f9574a;
        public final /* synthetic */ pr0 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(Activity activity, pr0 pr0Var, String str, String str2) {
            this.f9574a = activity;
            this.b = pr0Var;
            this.c = str;
            this.d = str2;
        }

        @Override // tb.gr4
        public void a(ContractSelectedRet contractSelectedRet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa74ad1a", new Object[]{this, contractSelectedRet});
                return;
            }
            Activity activity = this.f9574a;
            if (activity != null && !activity.isFinishing() && contractSelectedRet != null) {
                ContractOpenHandler.b(ContractOpenHandler.this).put(contractSelectedRet.versionCode, contractSelectedRet);
                ContractOpenHandler contractOpenHandler = ContractOpenHandler.this;
                ContractOpenHandler.d(contractOpenHandler, this.b, this.c, this.d, contractSelectedRet.isSelectedComplete, contractSelectedRet.selectedRetMap, ContractOpenHandler.c(contractOpenHandler, new String[]{contractSelectedRet.cityName, contractSelectedRet.planName, contractSelectedRet.phoneNumber}));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements gr4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f9575a;
        public final /* synthetic */ pr0 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(Activity activity, pr0 pr0Var, String str, String str2) {
            this.f9575a = activity;
            this.b = pr0Var;
            this.c = str;
            this.d = str2;
        }

        @Override // tb.gr4
        public void a(ContractSelectedRet contractSelectedRet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa74ad1a", new Object[]{this, contractSelectedRet});
                return;
            }
            Activity activity = this.f9575a;
            if (activity != null && !activity.isFinishing() && contractSelectedRet != null) {
                ContractOpenHandler.b(ContractOpenHandler.this).put(contractSelectedRet.versionCode, contractSelectedRet);
                ContractOpenHandler contractOpenHandler = ContractOpenHandler.this;
                ContractOpenHandler.d(contractOpenHandler, this.b, this.c, this.d, contractSelectedRet.isSelectedComplete, contractSelectedRet.selectedRetMap, ContractOpenHandler.c(contractOpenHandler, new String[]{contractSelectedRet.cityName, contractSelectedRet.planName, contractSelectedRet.networkName, contractSelectedRet.phoneNumber}));
            }
        }
    }

    static {
        t2o.a(785383468);
        t2o.a(442499194);
    }

    public static /* synthetic */ Map b(ContractOpenHandler contractOpenHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("52c48ee6", new Object[]{contractOpenHandler});
        }
        return contractOpenHandler.f9573a;
    }

    public static /* synthetic */ String c(ContractOpenHandler contractOpenHandler, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("198f6f71", new Object[]{contractOpenHandler, strArr});
        }
        return contractOpenHandler.f(strArr);
    }

    public static /* synthetic */ void d(ContractOpenHandler contractOpenHandler, pr0 pr0Var, String str, String str2, boolean z, Map map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f025058b", new Object[]{contractOpenHandler, pr0Var, str, str2, new Boolean(z), map, str3});
        } else {
            contractOpenHandler.g(pr0Var, str, str2, z, map, str3);
        }
    }

    public final ContractNode e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContractNode) ipChange.ipc$dispatch("faf205ac", new Object[]{this, jSONObject});
        }
        return new ContractNode(jSONObject);
    }

    public final String f(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef03a992", new Object[]{this, strArr});
        }
        StringBuilder sb = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(",");
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public final void g(pr0 pr0Var, String str, String str2, boolean z, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8422faf0", new Object[]{this, pr0Var, str, str2, new Boolean(z), map, str3});
            return;
        }
        f8v eventHandler = pr0Var.f().getEventHandler();
        if (eventHandler != null) {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("comKey", (Object) str);
            jSONObject.put("elementKey", (Object) str2);
            jSONObject.put("isComplete", (Object) Boolean.valueOf(z));
            if (map != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putAll(map);
                jSONObject.put("params", (Object) jSONObject2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("selectedTips", (Object) str3);
            }
            b8v e = eventHandler.e();
            e.t(ag0.EVENT_TYPE);
            e.r(new DMEvent(ag0.EVENT_TYPE, new JSONObject() { // from class: com.taobao.android.tbsku.bizevent.ContractOpenHandler.3
                {
                    put("subType", "outer_input");
                    put("payload", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.bizevent.ContractOpenHandler.3.1
                        {
                            putAll(jSONObject);
                            put("action", "alicom_data_input");
                        }
                    });
                }
            }, null));
            eventHandler.k(e);
        }
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        JSONObject c;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("ContractOpenHandler.handleEvent");
        }
        if (v2qVar != null && v2qVar.d().size() >= 3) {
            String valueOf = String.valueOf(v2qVar.d().get(0));
            String valueOf2 = String.valueOf(v2qVar.d().get(1));
            String valueOf3 = String.valueOf(v2qVar.d().get(2));
            if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(valueOf2) && (c = v2qVar.c()) != null && (jSONObject = c.getJSONObject("fields")) != null && !jSONObject.isEmpty()) {
                String string = jSONObject.getString("itemId");
                String string2 = jSONObject.getString(q2q.KEY_SKU_ID);
                JSONObject E = pr0Var.c().E();
                JSONObject jSONObject5 = null;
                if (!(E == null || (jSONObject2 = E.getJSONObject("skuVertical")) == null || (jSONArray = jSONObject2.getJSONArray("contractData")) == null || jSONArray.isEmpty())) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if ((next instanceof JSONObject) && (jSONObject4 = (jSONObject3 = (JSONObject) next).getJSONObject("version")) != null && valueOf3.equalsIgnoreCase(jSONObject4.getString("versionCode"))) {
                            jSONObject5 = jSONObject3;
                        }
                    }
                }
                if (jSONObject5 != null && !jSONObject5.isEmpty() && (v2qVar.b() instanceof Activity)) {
                    Activity activity = (Activity) v2qVar.b();
                    try {
                        if ("open_contract_phone_page".equalsIgnoreCase(valueOf2)) {
                            ds0.a(activity, new a(activity, pr0Var, valueOf, valueOf3), e(jSONObject5), string, string2, (ContractSelectedRet) ((HashMap) this.f9573a).get(valueOf3));
                        } else if ("open_phone_number_sale_page".equalsIgnoreCase(valueOf2)) {
                            ds0.b(activity, new b(activity, pr0Var, valueOf, valueOf3), e(jSONObject5), string, string2, (ContractSelectedRet) ((HashMap) this.f9573a).get(valueOf3));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
