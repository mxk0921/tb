package com.taobao.umipublish.extension.windvane.abilities;

import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.hander.ContentPublishHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadFileHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.DownloadMaterialHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.ExportHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.InsertContentListTopHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.KFCHandler;
import com.taobao.umipublish.extension.windvane.abilities.hander.UploadFileHandler;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import tb.jfv;
import tb.muu;
import tb.odg;
import tb.qrf;
import tb.t2o;
import tb.vgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class QuickPublishAbility extends QuickBaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LOCAL_MEDIA_FILES = "localMediaFiles";
    private static final String TAG = "QuickPublishAbility";
    private final IntermediateData mIntermediateData = new IntermediateData();

    static {
        t2o.a(944767186);
    }

    public static /* synthetic */ Object ipc$super(QuickPublishAbility quickPublishAbility, String str, Object... objArr) {
        if (str.hashCode() == -1778552717) {
            super.onExecute((JSONObject) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/QuickPublishAbility");
    }

    private void statPublishStartIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431ddac1", new Object[]{this});
        } else if (!muu.w(this.mContext)) {
            jfv.g(this.mUrlParams);
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility, com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        super.onExecute(jSONObject);
        statPublishStartIfNeed();
        try {
            BaseAbility a2 = AbilityUtils.a(ITemplateExportAbility.class);
            BaseAbility a3 = AbilityUtils.a(IContentPublishAbility.class);
            BaseAbility a4 = AbilityUtils.a(IUploadFilesAbility.class);
            if (!(a2 == null || a3 == null || a4 == null)) {
                AbilityChain weight = new AbilityChain(new DownloadFilesAbility(), this.mContext).weight(0.2f);
                int i = R.string.gg_pub_resource_download;
                AbilityChain name = weight.name(Localization.q(i));
                int i2 = R.string.gg_pub_resource_downloading;
                AbilityChain inputAndOutputHandler = name.loadingText(Localization.q(i2)).inputAndOutputHandler(new DownloadFileHandler(this.mCardData, this.mUrlParams, this.mIntermediateData));
                AbilityChain inputAndOutputHandler2 = new AbilityChain(new DownloadMaterialAbility(), this.mContext).weight(0.1f).name(Localization.q(i)).loadingText(Localization.q(i2)).inputAndOutputHandler(new DownloadMaterialHandler(this.mCardData, this.mUrlParams, this.mIntermediateData));
                AbilityChain inputAndOutputHandler3 = new AbilityChain(a2, this.mContext).weight(0.5f).name(Localization.q(R.string.gg_pub_video_composition)).loadingText(Localization.q(R.string.gg_pub_video_synthesis_in_progress)).inputAndOutputHandler(new ExportHandler(this.mCardData, this.mUrlParams, this.mIntermediateData));
                AbilityChain inputAndOutputHandler4 = new AbilityChain(a4, this.mContext).weight(0.1f).name(Localization.q(R.string.gg_pub_file_upload)).loadingText(Localization.q(R.string.gg_pub_file_uploading)).inputAndOutputHandler(new UploadFileHandler(this.mCardData, this.mUrlParams, this.mIntermediateData));
                AbilityChain weight2 = new AbilityChain(new KfcCheckAbility(), this.mContext).weight(0.03f);
                int i3 = R.string.gg_pub_publish;
                AbilityChain name2 = weight2.name(Localization.q(i3));
                int i4 = R.string.gg_pub_publishing;
                AbilityChain inputAndOutputHandler5 = name2.loadingText(Localization.q(i4)).inputAndOutputHandler(new KFCHandler(this.mCardData, this.mUrlParams, this.mIntermediateData));
                inputAndOutputHandler.next(inputAndOutputHandler2).next(inputAndOutputHandler3).next(inputAndOutputHandler4).next(inputAndOutputHandler5).next(new AbilityChain(a3, this.mContext).weight(0.06f).name(Localization.q(i3)).loadingText(Localization.q(i4)).inputAndOutputHandler(new ContentPublishHandler(this.mCardData, this.mUrlParams, this.mIntermediateData))).next(new AbilityChain(new InsertContentListTopAbility(), this.mContext).weight(0.01f).name(Localization.q(i3)).loadingText(Localization.q(i4)).inputAndOutputHandler(new InsertContentListTopHandler(this.mCardData, this.mUrlParams, this.mIntermediateData)));
                if (!this.mCardData.containsKey("localMediaFiles")) {
                    this.mHead = inputAndOutputHandler;
                } else {
                    this.mHead = inputAndOutputHandler2.weight(0.3f);
                    JSONArray jSONArray = this.mCardData.getJSONArray("localMediaFiles");
                    if (jSONArray != null && jSONArray.size() > 0) {
                        this.mIntermediateData.mDownloadedMediaList.addAll(jSONArray);
                        this.mIntermediateData.mMainClipSource = qrf.m(jSONArray.getJSONObject(0), "clipSource", "0");
                    }
                }
                showProgressDialog();
                this.mHead.setListener(this.mMListener);
                this.mHead.execute(jSONObject);
                return;
            }
            odg.c("QuickPublishAbility", "createAbility error.");
            UmiPublishMonitor.w().o("QuickPublishAbility", "-1", "createAbility call error", null);
            errorCallback(vgn.RATE_LIST_CODE, "RemoteNotReady");
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }
}
