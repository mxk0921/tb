package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.liveinteract;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import tb.b0d;
import tb.e7q;
import tb.n5q;
import tb.s6q;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLayerLiveInteractTemplateProcessor extends SmartLayerDXTemplateProcessor implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONArray benefitMarquees;
    private String marqueeDesc;

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
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo != null && netBaseOutDo.getData() != null) {
                try {
                    JSONArray jSONArray = ((JSONObject) netBaseOutDo.getData()).getJSONArray("benefitMarqueeVOList");
                    SmartLayerLiveInteractTemplateProcessor.access$002(SmartLayerLiveInteractTemplateProcessor.this, jSONArray);
                    SmartLayerLiveInteractTemplateProcessor smartLayerLiveInteractTemplateProcessor = SmartLayerLiveInteractTemplateProcessor.this;
                    SmartLayerLiveInteractTemplateProcessor.access$102(smartLayerLiveInteractTemplateProcessor, SmartLayerLiveInteractTemplateProcessor.access$200(smartLayerLiveInteractTemplateProcessor, jSONArray));
                    SmartLayerLiveInteractTemplateProcessor.this.refreshTemplate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    static {
        t2o.a(295699798);
        t2o.a(806355930);
    }

    public SmartLayerLiveInteractTemplateProcessor(n5q n5qVar) {
        super(n5qVar);
    }

    public static /* synthetic */ JSONArray access$002(SmartLayerLiveInteractTemplateProcessor smartLayerLiveInteractTemplateProcessor, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7f73cc84", new Object[]{smartLayerLiveInteractTemplateProcessor, jSONArray});
        }
        smartLayerLiveInteractTemplateProcessor.benefitMarquees = jSONArray;
        return jSONArray;
    }

    public static /* synthetic */ String access$102(SmartLayerLiveInteractTemplateProcessor smartLayerLiveInteractTemplateProcessor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9127b845", new Object[]{smartLayerLiveInteractTemplateProcessor, str});
        }
        smartLayerLiveInteractTemplateProcessor.marqueeDesc = str;
        return str;
    }

    public static /* synthetic */ String access$200(SmartLayerLiveInteractTemplateProcessor smartLayerLiveInteractTemplateProcessor, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c78e0e6", new Object[]{smartLayerLiveInteractTemplateProcessor, jSONArray});
        }
        return smartLayerLiveInteractTemplateProcessor.generateMarqueeDesc(jSONArray);
    }

    public static /* synthetic */ Object ipc$super(SmartLayerLiveInteractTemplateProcessor smartLayerLiveInteractTemplateProcessor, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -223096417:
                return new Boolean(super.useToast4Error());
            case 125720071:
                return new Boolean(super.isValid((String) objArr[0]));
            case 342769352:
                super.onLayerWillShow();
                return null;
            case 832145994:
                return super.generateTemplateData((String) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/liveinteract/SmartLayerLiveInteractTemplateProcessor");
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor
    public boolean isValid(String str) {
        s6q modeWithStage;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e5607", new Object[]{this, str})).booleanValue();
        }
        boolean isValid = super.isValid(str);
        if (!(isValid || (modeWithStage = this.mViewModel.getModeWithStage("award")) == null || (jSONObject = modeWithStage.f27828a) == null)) {
            int intValue = jSONObject.getIntValue("successCount");
            int intValue2 = jSONObject.getIntValue("totalCount");
            if (intValue == 0) {
                modeWithStage.d = "领取失败, 请重试";
                modeWithStage.b = "ERROR_CODE_AWARD_ALL_ERROR";
                modeWithStage.c = "领取失败";
            } else if (intValue < intValue2) {
                modeWithStage.d = "部分领取失败，请重试";
                modeWithStage.b = "ERROR_CODE_AWARD_PART_ERROR";
                modeWithStage.c = "部分领取失败";
            }
        }
        return isValid;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor
    public boolean useToast4Error() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b3d19f", new Object[]{this})).booleanValue();
        }
        s6q modeWithStage = this.mViewModel.getModeWithStage("show");
        if (modeWithStage == null || (jSONObject = modeWithStage.f27828a) == null || jSONObject.getJSONArray("rights") == null || modeWithStage.f27828a.getJSONArray("rights").size() <= 1) {
            return super.useToast4Error();
        }
        return true;
    }

    private String generateMarqueeDesc(JSONArray jSONArray) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978e1c73", new Object[]{this, jSONArray});
        }
        String str = "";
        if (jSONArray == null) {
            return str;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            if (jSONArray.getJSONObject(i) != null) {
                str = str + jSONObject.getString("snsNick") + " " + jSONObject.getString("benefitTitle");
                if (i < jSONArray.size() - 1) {
                    str = str + "   ";
                }
            }
        }
        return str;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor
    public JSONObject generateTemplateData(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31998a4a", new Object[]{this, str});
        }
        JSONObject generateTemplateData = super.generateTemplateData(str);
        if (generateTemplateData == null) {
            return null;
        }
        JSONObject jSONObject = generateTemplateData.getJSONObject("data");
        JSONObject jSONObject2 = generateTemplateData.getJSONObject("awardData");
        if (!(jSONObject == null || jSONObject2 == null || (jSONArray = jSONObject.getJSONArray("rights")) == null || jSONArray.size() != 1)) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(0);
            JSONObject jSONObject4 = jSONObject2.getJSONObject("benefitVO");
            JSONObject jSONObject5 = new JSONObject();
            if (jSONObject3 != null) {
                jSONObject5.putAll(jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject5.putAll(jSONObject4);
            }
            jSONObject2.put("benefitVO", (Object) jSONObject5);
        }
        JSONArray jSONArray2 = this.benefitMarquees;
        if (jSONArray2 != null && jSONArray2.size() > 0) {
            JSONObject jSONObject6 = generateTemplateData.getJSONObject("commonData");
            if (jSONObject6 == null) {
                jSONObject6 = new JSONObject();
            }
            jSONObject6.put("benefitMarquees", (Object) this.benefitMarquees);
            jSONObject6.put("marqueeDesc", (Object) this.marqueeDesc);
            generateTemplateData.put("commonData", (Object) jSONObject6);
        }
        return generateTemplateData;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess.SmartLayerDXTemplateProcessor
    public void onLayerWillShow() {
        JSONObject modeDataWithStage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e3ec8", new Object[]{this});
            return;
        }
        super.onLayerWillShow();
        SmartLayerViewModel smartLayerViewModel = this.mViewModel;
        if (smartLayerViewModel != null && (modeDataWithStage = smartLayerViewModel.getModeDataWithStage("show")) != null && modeDataWithStage.getJSONArray("rights") != null) {
            JSONArray jSONArray = modeDataWithStage.getJSONArray("rights");
            if (jSONArray.size() == 1) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                if (jSONObject.getJSONObject("benefitVO") != null) {
                    String string = jSONObject.getJSONObject("benefitVO").getString("marqueeBizId");
                    String string2 = modeDataWithStage.getString(yj4.PARAM_FANDOM_INTERACTTYPE);
                    if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string)) {
                        new e7q(new a()).L(string, string2);
                    }
                }
            }
        }
    }
}
