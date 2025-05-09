package com.taobao.umipublish.extension.windvane.abilities;

import android.os.SystemClock;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.AbilityChain;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadFileHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadMaterialHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler;
import com.taobao.umipublish.monitor.PerformanceMonitor;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.eag;
import tb.muu;
import tb.odg;
import tb.qrf;
import tb.t2o;
import tb.trt;
import tb.vgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class QuickPreviewAbility extends QuickBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "QuickPreviewAbility";
    private final IntermediateData mIntermediateData = new IntermediateData();
    private long mPreviewStartTimeMs;
    private JSONObject mTemplateResult;

    static {
        t2o.a(944767182);
    }

    public static /* synthetic */ JSONObject access$000(QuickPreviewAbility quickPreviewAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2f8ecc95", new Object[]{quickPreviewAbility});
        }
        return quickPreviewAbility.mTemplateResult;
    }

    public static /* synthetic */ JSONObject access$002(QuickPreviewAbility quickPreviewAbility, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e40b7a79", new Object[]{quickPreviewAbility, jSONObject});
        }
        quickPreviewAbility.mTemplateResult = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void access$100(QuickPreviewAbility quickPreviewAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf417b6", new Object[]{quickPreviewAbility});
        } else {
            quickPreviewAbility.previewTimeCostStat();
        }
    }

    public static /* synthetic */ Object ipc$super(QuickPreviewAbility quickPreviewAbility, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1977541495) {
            return super.generateUrlParams((JSONObject) objArr[0]);
        }
        if (hashCode == -1778552717) {
            super.onExecute((JSONObject) objArr[0]);
            return null;
        } else if (hashCode == -1746903160) {
            super.errorCallback((String) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/umipublish/extension/windvane/abilities/QuickPreviewAbility");
        }
    }

    private void previewTimeCostStat() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768eab1d", new Object[]{this});
            return;
        }
        if (muu.w(this.mContext)) {
            str = "tab.inspiration";
        } else {
            str = "activity";
        }
        PerformanceMonitor.n().m(str, "quick_preview_cost", SystemClock.elapsedRealtime() - this.mPreviewStartTimeMs, this.mCardData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void errorCallback(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e05f88", new Object[]{this, str, str2});
            return;
        }
        super.errorCallback(str, str2);
        previewTimeCostStat();
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility
    public JSONObject generateUrlParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a211c89", new Object[]{this, jSONObject});
        }
        if (eag.f()) {
            return super.generateUrlParams(jSONObject);
        }
        return qrf.l(jSONObject, AbilityConst.Server.j);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility, com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        super.onExecute(jSONObject);
        try {
            this.mPreviewStartTimeMs = SystemClock.elapsedRealtime();
            BaseAbility a2 = AbilityUtils.a(ITemplateExportAbility.class);
            if (a2 == null) {
                odg.c(TAG, "createAbility error.");
                UmiPublishMonitor.w().o(TAG, "-1", "createAbility call error", null);
                errorCallback(vgn.RATE_LIST_CODE, "RemoteNotReady");
                return;
            }
            AbilityChain weight = new AbilityChain(new DownloadFilesAbility(), this.mContext).weight(0.4f);
            int i = R.string.gg_pub_resource_download;
            AbilityChain name = weight.name(Localization.q(i));
            int i2 = R.string.gg_pub_resource_downloading;
            this.mHead = name.loadingText(Localization.q(i2)).inputAndOutputHandler(new DownloadFileHandler(this.mCardData, this.mUrlParams, this.mIntermediateData));
            AbilityChain inputAndOutputHandler = new AbilityChain(new DownloadMaterialAbility(), this.mContext).weight(0.4f).name(Localization.q(i)).loadingText(Localization.q(i2)).inputAndOutputHandler(new DownloadMaterialHandler(this.mCardData, this.mUrlParams, this.mIntermediateData));
            AbilityChain loadingText = new AbilityChain(a2, this.mContext).weight(0.15f).name(Localization.q(R.string.gg_pub_video_preparation)).loadingText(Localization.q(R.string.gg_pub_video_preparing_0));
            AbilityChain loadingText2 = new AbilityChain(new QuickGoPreviewPageAbility(), this.mContext).weight(0.05f).name(Localization.q(R.string.gg_pub_page_initialization)).loadingText(Localization.q(R.string.gg_pub_page_initializing));
            this.mHead.next(inputAndOutputHandler).next(loadingText).next(loadingText2);
            loadingText.inputAndOutputHandler(new ExportHandler(this.mCardData, this.mUrlParams, this.mIntermediateData) { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1390867556) {
                        return super.a((JSONObject) objArr[0]);
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/QuickPreviewAbility$1");
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public JSONObject a(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (JSONObject) ipChange2.ipc$dispatch("52e6f464", new Object[]{this, jSONObject2});
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.add("draft");
                    JSONObject a3 = super.a(jSONObject2);
                    a3.put("outputType", (Object) jSONArray);
                    return a3;
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler, com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public void c(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("def50cbb", new Object[]{this, jSONObject2});
                    } else {
                        QuickPreviewAbility.access$002(QuickPreviewAbility.this, jSONObject2);
                    }
                }
            });
            loadingText2.inputAndOutputHandler(new AbilityChain.InputAndOutputHandler() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    if (str.hashCode() == -554365765) {
                        super.c((JSONObject) objArr[0]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/QuickPreviewAbility$2");
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public JSONObject a(JSONObject jSONObject2) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (JSONObject) ipChange2.ipc$dispatch("52e6f464", new Object[]{this, jSONObject2});
                    }
                    trt.c(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickPreviewAbility.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                QuickPreviewAbility.this.hideProcessingDialog();
                            }
                        }
                    });
                    if (muu.w(QuickPreviewAbility.this.mContext)) {
                        str = "tab.inspiration";
                    } else {
                        str = "activity";
                    }
                    UmiPublishMonitor.w().g(str, "preview_complete", jSONObject);
                    QuickPreviewAbility.access$100(QuickPreviewAbility.this);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("publish_data", (Object) QuickPreviewAbility.this.mCardData);
                    jSONObject3.put("template_data", (Object) QuickPreviewAbility.access$000(QuickPreviewAbility.this));
                    jSONObject3.put("publish_params", (Object) QuickPreviewAbility.this.mUrlParams);
                    return jSONObject3;
                }

                @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
                public void c(JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("def50cbb", new Object[]{this, jSONObject2});
                    } else {
                        super.c(jSONObject2);
                    }
                }
            });
            showProgressDialog();
            this.mHead.setListener(this.mMListener);
            this.mHead.execute(jSONObject);
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }
}
