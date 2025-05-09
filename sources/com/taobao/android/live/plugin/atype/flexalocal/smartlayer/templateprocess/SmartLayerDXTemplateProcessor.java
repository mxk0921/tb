package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.templateprocess;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.a1u;
import tb.b7q;
import tb.g6q;
import tb.g7q;
import tb.h5q;
import tb.j7q;
import tb.l6q;
import tb.n5q;
import tb.p6q;
import tb.p7q;
import tb.s6q;
import tb.t2o;
import tb.t5q;
import tb.v5q;
import tb.x6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLayerDXTemplateProcessor extends x6q implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLayerDXTemplatePlugin";
    public boolean isReceiving = false;
    public g6q mConfig;
    public String mCurrentStage;
    public n5q mLayerController;
    public l6q mSmartContext;
    public SmartLayerViewModel mViewModel;

    static {
        t2o.a(295699780);
        t2o.a(806355930);
    }

    public SmartLayerDXTemplateProcessor(n5q n5qVar) {
        this.mLayerController = n5qVar;
        if (n5qVar != null) {
            this.mConfig = n5qVar.f24542a;
            this.mViewModel = n5qVar.c;
            this.mSmartContext = n5qVar.b;
        }
    }

    public static /* synthetic */ Object ipc$super(SmartLayerDXTemplateProcessor smartLayerDXTemplateProcessor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/templateprocess/SmartLayerDXTemplateProcessor");
    }

    public JSONObject generateTemplateData(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31998a4a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.mViewModel == null || this.mSmartContext == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("layerStatus", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        VideoInfo videoInfo = this.mSmartContext.o;
        if (videoInfo != null) {
            jSONObject2.put("liveDetail", JSON.toJSON(videoInfo));
        }
        jSONObject2.put("isPreload", (Object) Boolean.valueOf(this.mSmartContext.v));
        jSONObject2.put("isPreloadMode", (Object) Boolean.valueOf(this.mSmartContext.w));
        if (this.isReceiving) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        jSONObject2.put("isReceiving", (Object) str2);
        jSONObject.put("commonData", (Object) jSONObject2);
        JSONObject modeDataWithStage = this.mViewModel.getModeDataWithStage("show");
        jSONObject.put("data", (Object) modeDataWithStage);
        if (TextUtils.equals(str, "award") || TextUtils.equals(str, "fail") || TextUtils.equals(str, "expire")) {
            JSONObject jSONObject3 = new JSONObject();
            if (modeDataWithStage != null) {
                jSONObject3.putAll(modeDataWithStage);
            }
            JSONObject modeDataWithStage2 = this.mViewModel.getModeDataWithStage("award");
            if (modeDataWithStage2 != null) {
                jSONObject3.putAll(modeDataWithStage2);
            }
            jSONObject.put("awardData", (Object) jSONObject3);
        }
        return jSONObject;
    }

    public void jumpUrl4EventHandler(Object[] objArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4d14ad", new Object[]{this, objArr, new Boolean(z)});
        } else if (objArr != null && objArr.length != 0) {
            String valueOf = String.valueOf(objArr[0]);
            n5q n5qVar = this.mLayerController;
            if (n5qVar != null) {
                n5qVar.m(valueOf, z);
            }
        }
    }

    public void manualClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac343d59", new Object[]{this});
            return;
        }
        n5q n5qVar = this.mLayerController;
        if (n5qVar != null) {
            n5qVar.o();
        }
    }

    public void onLayerDidShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9814c91", new Object[]{this});
        }
    }

    public void onLayerWillShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e3ec8", new Object[]{this});
        }
    }

    @Override // tb.x6q
    public void onLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1309896c", new Object[]{this});
            return;
        }
        registerEventHandler();
        processShowStage();
    }

    public void onUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b567900f", new Object[]{this});
        } else {
            refreshTemplate();
        }
    }

    public void processAwardStage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215012f7", new Object[]{this});
        } else if (this.mViewModel == null || this.mLayerController == null) {
            p6q.e(SmartLayerConstant$SmartLayerStage.SMART_TEMPLATE, this.mConfig, TAG, "processAwardStage", "viewModel为空", false);
        } else {
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_TEMPLATE;
            p6q.d(smartLayerConstant$SmartLayerStage, this.mConfig, TAG, "processAwardStage");
            String str = "award";
            if (!isValid(str)) {
                if (useToast4Error()) {
                    s6q modeWithStage = this.mViewModel.getModeWithStage(str);
                    String str2 = "领取失败";
                    String str3 = "ERROR_CODE_AWARD_ERROR";
                    if (modeWithStage != null) {
                        str2 = !TextUtils.isEmpty(modeWithStage.d) ? modeWithStage.d : str2;
                        if (!TextUtils.isEmpty(modeWithStage.b)) {
                            str3 = modeWithStage.b;
                        }
                        if (!TextUtils.isEmpty(modeWithStage.c)) {
                            str2 = modeWithStage.c;
                        }
                    } else {
                        str2 = str2;
                        str3 = str3;
                    }
                    a1u.a(this.mLayerController.j(), str2);
                    g6q g6qVar = this.mConfig;
                    p6q.e(smartLayerConstant$SmartLayerStage, g6qVar, TAG, "processAwardStage", "award失败,  " + str3 + " ," + str2, false);
                    this.mLayerController.d(str3, str2);
                    return;
                }
                str = "fail";
            }
            this.mCurrentStage = str;
            g6q g6qVar2 = this.mConfig;
            p6q.e(smartLayerConstant$SmartLayerStage, g6qVar2, TAG, "processAwardStage", "award渲染, mCurrentStage=" + this.mCurrentStage, true);
            this.mLayerController.D(generateTemplateData(str));
            l6q l6qVar = this.mSmartContext;
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage2 = SmartLayerConstant$SmartLayerStage.SMART_AWARD_SUCCESS;
            l6qVar.e(smartLayerConstant$SmartLayerStage2);
            b7q.e(this.mConfig, this.mSmartContext, smartLayerConstant$SmartLayerStage2, SmartLayerConstant$SmartLayerStage.SMART_AWARD, null);
        }
    }

    public void processShowStage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32e27d9", new Object[]{this});
        } else if (this.mViewModel != null) {
            if (!isValid("show")) {
                this.mLayerController.d("ERROR_CODE_DATA_ERROR", "数据不合法");
                return;
            }
            p6q.d(SmartLayerConstant$SmartLayerStage.SMART_TEMPLATE, this.mConfig, TAG, "processShowStage");
            this.mCurrentStage = "show";
            this.mLayerController.D(generateTemplateData("show"));
            this.mLayerController.g();
            onLayerWillShow();
        }
    }

    public void refreshTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590afa7c", new Object[]{this});
        } else if (this.mLayerController != null) {
            this.mLayerController.D(generateTemplateData(this.mCurrentStage));
        }
    }

    public void registerEventHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b02649a", new Object[]{this});
            return;
        }
        n5q n5qVar = this.mLayerController;
        if (n5qVar != null) {
            n5qVar.C(new j7q(this));
            this.mLayerController.C(new v5q(this));
            this.mLayerController.C(new t5q(this));
            this.mLayerController.C(new h5q(this));
            this.mLayerController.C(new g7q(this));
            this.mLayerController.C(new p7q(this));
        }
    }

    public boolean useToast4Error() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b3d19f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isValid(String str) {
        s6q modeWithStage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e5607", new Object[]{this, str})).booleanValue();
        }
        if (this.mViewModel == null || this.mLayerController == null || TextUtils.isEmpty(str) || (modeWithStage = this.mViewModel.getModeWithStage(str)) == null || modeWithStage.f27828a == null) {
            return false;
        }
        return !TextUtils.equals(str, "award") || !TextUtils.equals(modeWithStage.f27828a.getString("winning"), "false");
    }
}
