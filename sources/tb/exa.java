package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.OpenHiglightAccess;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class exa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092717);
    }

    public static void a(ux9 ux9Var, TBLiveDataModel tBLiveDataModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e7d549", new Object[]{ux9Var, tBLiveDataModel, jSONObject});
        } else if (ux9Var != null) {
            try {
                if (ux9Var.A() != null && jSONObject != null) {
                    OpenHiglightAccess openHiglightAccess = new OpenHiglightAccess();
                    if (tBLiveDataModel != null) {
                        VideoInfo e = cxg.e(tBLiveDataModel);
                        openHiglightAccess.liveId = e.liveId;
                        AccountInfo accountInfo = e.broadCaster;
                        if (accountInfo != null) {
                            openHiglightAccess.accountId = accountInfo.accountId;
                        }
                        OpenHiglightAccess.HighlightSkipParams highlightSkipParams = new OpenHiglightAccess.HighlightSkipParams();
                        highlightSkipParams.id = e.liveId;
                        highlightSkipParams.productType = RecModel.MEDIA_TYPE_TIMEMOVE;
                        highlightSkipParams.keyPointId = jSONObject.getString("timeMovingId");
                        openHiglightAccess.highlightSkipParams = highlightSkipParams;
                        ux9Var.P.accessListener(AccessListenerEnum.onRecieveDetailResponse, openHiglightAccess);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void b(ux9 ux9Var, TBLiveDataModel tBLiveDataModel, LiveTimemovingModel liveTimemovingModel) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13de82a5", new Object[]{ux9Var, tBLiveDataModel, liveTimemovingModel});
        } else if (ux9Var != null) {
            try {
                if (ux9Var.A() != null && liveTimemovingModel != null) {
                    OpenHiglightAccess openHiglightAccess = new OpenHiglightAccess();
                    openHiglightAccess.liveId = liveTimemovingModel.liveId;
                    if (!(tBLiveDataModel == null || (accountInfo = cxg.e(tBLiveDataModel).broadCaster) == null)) {
                        openHiglightAccess.accountId = accountInfo.accountId;
                    }
                    OpenHiglightAccess.HighlightSkipParams highlightSkipParams = new OpenHiglightAccess.HighlightSkipParams();
                    highlightSkipParams.id = liveTimemovingModel.liveId;
                    highlightSkipParams.productType = RecModel.MEDIA_TYPE_TIMEMOVE;
                    highlightSkipParams.sjsdItemId = liveTimemovingModel.itemId;
                    highlightSkipParams.keyPointId = liveTimemovingModel.timeMovingId;
                    openHiglightAccess.highlightSkipParams = highlightSkipParams;
                    ux9Var.P.accessListener(AccessListenerEnum.onRecieveDetailResponse, openHiglightAccess);
                }
            } catch (Exception unused) {
            }
        }
    }
}
