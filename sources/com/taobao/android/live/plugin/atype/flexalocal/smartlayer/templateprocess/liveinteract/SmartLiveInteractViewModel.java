package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.liveinteract;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.b0d;
import tb.e7q;
import tb.frd;
import tb.g6q;
import tb.l6q;
import tb.t2o;
import tb.ux9;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLiveInteractViewModel extends SmartLayerViewModel implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ frd f8671a;

        public a(frd frdVar) {
            this.f8671a = frdVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                SmartLiveInteractViewModel.access$100(SmartLiveInteractViewModel.this, netResponse, this.f8671a);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            JSONObject jSONObject2 = null;
            String str = "";
            if (!(netBaseOutDo == null || netBaseOutDo.getData() == null || (jSONObject = (JSONObject) netBaseOutDo.getData()) == null || jSONObject.size() <= 0)) {
                String access$000 = SmartLiveInteractViewModel.access$000(SmartLiveInteractViewModel.this);
                if (!TextUtils.isEmpty(access$000)) {
                    jSONObject2 = (JSONObject) jSONObject.get(access$000);
                    if (jSONObject2 == null) {
                        str = "-没有指定" + access$000 + "数据";
                    }
                } else {
                    str = "-interactType为空";
                }
            }
            frd frdVar = this.f8671a;
            if (frdVar == null) {
                return;
            }
            if (jSONObject2 != null) {
                frdVar.onSuccess(jSONObject2);
                return;
            }
            frdVar.onFail("query_interact_data_empty", "权益数据请求为空" + str);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                SmartLiveInteractViewModel.access$100(SmartLiveInteractViewModel.this, netResponse, this.f8671a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ frd f8672a;

        public b(frd frdVar) {
            this.f8672a = frdVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                SmartLiveInteractViewModel.access$100(SmartLiveInteractViewModel.this, netResponse, this.f8672a);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo == null) {
                frd frdVar = this.f8672a;
                if (frdVar != null) {
                    frdVar.onFail("do_issue_interact_data_empty", "权益数据领取为空");
                }
            } else if (this.f8672a != null && (netBaseOutDo.getData() instanceof JSONObject)) {
                this.f8672a.onSuccess((JSONObject) netBaseOutDo.getData());
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                SmartLiveInteractViewModel.access$100(SmartLiveInteractViewModel.this, netResponse, this.f8672a);
            }
        }
    }

    static {
        t2o.a(295699800);
        t2o.a(806355930);
    }

    public SmartLiveInteractViewModel(l6q l6qVar, g6q g6qVar) {
        super(l6qVar, g6qVar);
    }

    public static /* synthetic */ String access$000(SmartLiveInteractViewModel smartLiveInteractViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b493a96b", new Object[]{smartLiveInteractViewModel});
        }
        return smartLiveInteractViewModel.obtainInteractType();
    }

    public static /* synthetic */ void access$100(SmartLiveInteractViewModel smartLiveInteractViewModel, NetResponse netResponse, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8fdb85", new Object[]{smartLiveInteractViewModel, netResponse, frdVar});
        } else {
            smartLiveInteractViewModel.callbackFail(netResponse, frdVar);
        }
    }

    public static /* synthetic */ void access$200(SmartLiveInteractViewModel smartLiveInteractViewModel, int[] iArr, int[] iArr2, JSONArray jSONArray, JSONArray jSONArray2, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f0e8d7", new Object[]{smartLiveInteractViewModel, iArr, iArr2, jSONArray, jSONArray2, frdVar});
        } else {
            smartLiveInteractViewModel.requestMultiAwardData(iArr, iArr2, jSONArray, jSONArray2, frdVar);
        }
    }

    private void callbackFail(NetResponse netResponse, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca978ff9", new Object[]{this, netResponse, frdVar});
            return;
        }
        String str = "network_request_error";
        String str2 = "网络请求失败";
        if (netResponse != null) {
            if (!TextUtils.isEmpty(netResponse.getRetCode())) {
                str = netResponse.getRetCode();
            }
            if (!TextUtils.isEmpty(netResponse.getRetMsg())) {
                str2 = netResponse.getRetMsg();
            }
        }
        if (frdVar != null) {
            frdVar.onFail(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(SmartLiveInteractViewModel smartLiveInteractViewModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/liveinteract/SmartLiveInteractViewModel");
    }

    private String obtainInteractType() {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56642244", new Object[]{this});
        }
        g6q g6qVar = this.mSmartConfig;
        if (g6qVar == null || (hashMap = g6qVar.h) == null) {
            return null;
        }
        return hashMap.get(yj4.PARAM_FANDOM_INTERACTTYPE);
    }

    private void requestShowData(frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49049711", new Object[]{this, frdVar});
        } else if (this.mSmartContext != null && this.mSmartConfig != null && frdVar != null) {
            e7q e7qVar = new e7q(new a(frdVar));
            try {
                String str = "";
                String obtainInteractType = obtainInteractType();
                if (!TextUtils.isEmpty(obtainInteractType)) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.add(obtainInteractType);
                    str = jSONArray.toJSONString();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("liveSource", (Object) this.mSmartContext.b);
                jSONObject.put("spm", (Object) this.mSmartContext.i);
                l6q l6qVar = this.mSmartContext;
                e7qVar.M(l6qVar.e, l6qVar.c, str, jSONObject.toJSONString());
            } catch (Exception e) {
                frdVar.onFail("query_interact_data_exception", "权益数据请求发生异常");
                e.printStackTrace();
            }
        }
    }

    private void requestSingleAwardData(JSONObject jSONObject, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432c122d", new Object[]{this, jSONObject, frdVar});
        } else if (this.mSmartContext != null && this.mSmartConfig != null && frdVar != null) {
            e7q e7qVar = new e7q(new b(frdVar));
            JSONObject modeDataWithStage = getModeDataWithStage("show");
            if (modeDataWithStage == null) {
                frdVar.onFail("do_issue_interact_no_show_data", "领取时无展示态数据");
                return;
            }
            try {
                String string = (jSONObject == null || jSONObject.getString("asac") == null) ? modeDataWithStage.getString("asac") : jSONObject.getString("asac");
                String string2 = modeDataWithStage.getString(yj4.PARAM_FANDOM_INTERACTTYPE);
                String string3 = modeDataWithStage.getString("interactId");
                String string4 = modeDataWithStage.getString("rightsType");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("liveSource", (Object) this.mSmartContext.b);
                ux9 ux9Var = this.mSmartContext.t;
                if (!(ux9Var == null || ux9Var.D() == null)) {
                    Map<String, String> D = this.mSmartContext.t.D();
                    if (!TextUtils.isEmpty(D.get("returnSource"))) {
                        jSONObject2.put("returnSource", (Object) D.get("returnSource"));
                    }
                    if (!TextUtils.isEmpty(D.get("searchQuery"))) {
                        try {
                            jSONObject2.put("queryToken", (Object) URLEncoder.encode(D.get("searchQuery"), "utf-8"));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (!(jSONObject == null || jSONObject.getJSONObject("issueModel") == null)) {
                    jSONObject2.putAll(jSONObject.getJSONObject("issueModel"));
                }
                l6q l6qVar = this.mSmartContext;
                e7qVar.K(l6qVar.e, l6qVar.c, string2, string3, string4, string, jSONObject2.toJSONString());
            } catch (Exception e2) {
                frdVar.onFail("do_issue_interact_exception", "权益数据领取发生异常");
                e2.printStackTrace();
            }
        }
    }

    private void rightsReceiveCallbackIfNeed(int i, JSONArray jSONArray, JSONArray jSONArray2, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b9e7dc", new Object[]{this, new Integer(i), jSONArray, jSONArray2, frdVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (jSONArray2 != null) {
            if (i == jSONArray2.size()) {
                jSONObject.put("winning", "true");
            } else {
                jSONObject.put("winning", "false");
            }
            jSONObject.put("successCount", (Object) Integer.valueOf(i));
            jSONObject.put("totalCount", (Object) Integer.valueOf(jSONArray2.size()));
            jSONObject.put("rights", (Object) jSONArray);
            if (frdVar != null) {
                frdVar.onSuccess(jSONObject);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel
    public void requestDataWithStage(String str, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6253a24", new Object[]{this, str, frdVar});
        } else if (TextUtils.equals(str, "show")) {
            requestShowData(frdVar);
        } else if (TextUtils.equals(str, "award")) {
            requestAwardData(frdVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements frd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f8673a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ int[] d;
        public final /* synthetic */ JSONArray e;
        public final /* synthetic */ frd f;

        public c(int[] iArr, JSONArray jSONArray, JSONObject jSONObject, int[] iArr2, JSONArray jSONArray2, frd frdVar) {
            this.f8673a = iArr;
            this.b = jSONArray;
            this.c = jSONObject;
            this.d = iArr2;
            this.e = jSONArray2;
            this.f = frdVar;
        }

        @Override // tb.frd
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            int[] iArr = this.d;
            iArr[0] = iArr[0] + 1;
            SmartLiveInteractViewModel.access$200(SmartLiveInteractViewModel.this, iArr, this.f8673a, this.b, this.e, this.f);
        }

        @Override // tb.frd
        public void onSuccess(JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("benefitVO")) == null || !TextUtils.equals(jSONObject2.getString("rightSubStatus"), "successObtained"))) {
                int[] iArr = this.f8673a;
                iArr[0] = iArr[0] + 1;
                this.b.add(this.c);
            }
            int[] iArr2 = this.d;
            iArr2[0] = iArr2[0] + 1;
            SmartLiveInteractViewModel.access$200(SmartLiveInteractViewModel.this, iArr2, this.f8673a, this.b, this.e, this.f);
        }
    }

    private void requestAwardData(frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4683c173", new Object[]{this, frdVar});
            return;
        }
        JSONObject modeDataWithStage = getModeDataWithStage("show");
        if (modeDataWithStage == null) {
            frdVar.onFail("do_issue_interact_no_show_data", "领取时无展示态数据");
            return;
        }
        JSONArray jSONArray = modeDataWithStage.getJSONArray("rights");
        if (jSONArray == null || jSONArray.size() == 0) {
            frdVar.onFail("do_issue_interact_no_right_data", "领取时无权益数据");
        } else if (jSONArray.size() == 1) {
            requestSingleAwardData(jSONArray.getJSONObject(0), frdVar);
        } else {
            requestMultiAwardData(new int[]{0}, new int[]{0}, new JSONArray(), jSONArray, frdVar);
        }
    }

    private void requestMultiAwardData(int[] iArr, int[] iArr2, JSONArray jSONArray, JSONArray jSONArray2, frd frdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bcf9a4", new Object[]{this, iArr, iArr2, jSONArray, jSONArray2, frdVar});
        } else if (jSONArray2 != null) {
            if (iArr[0] >= jSONArray2.size()) {
                rightsReceiveCallbackIfNeed(iArr2[0], jSONArray, jSONArray2, frdVar);
                return;
            }
            JSONObject jSONObject = jSONArray2.getJSONObject(iArr[0]);
            if (TextUtils.equals(jSONObject.getString("rightSubStatus"), "successObtained")) {
                iArr2[0] = iArr2[0] + 1;
                iArr[0] = iArr[0] + 1;
                requestMultiAwardData(iArr, iArr2, jSONArray, jSONArray2, frdVar);
                return;
            }
            requestSingleAwardData(jSONObject, new c(iArr2, jSONArray, jSONObject, iArr, jSONArray2, frdVar));
        }
    }
}
