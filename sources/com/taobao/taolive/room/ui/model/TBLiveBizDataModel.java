package com.taobao.taolive.room.ui.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.bxl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveBizDataModel extends TBLiveDataModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IInteractiveProxy.h liveInteractiveManager;
    public bxl perfomenceTrackManager;

    static {
        t2o.a(779093270);
    }

    public TBLiveBizDataModel() {
    }

    public static /* synthetic */ Object ipc$super(TBLiveBizDataModel tBLiveBizDataModel, String str, Object... objArr) {
        if (str.hashCode() == 1927931175) {
            super.clearManager();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/model/TBLiveBizDataModel");
    }

    @Override // com.taobao.taolive.sdk.model.TBLiveDataModel
    public void clearManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e9e527", new Object[]{this});
            return;
        }
        super.clearManager();
        this.perfomenceTrackManager = null;
        this.liveInteractiveManager = null;
    }

    public TBLiveBizDataModel(TBLiveDataModel tBLiveDataModel) {
        this.mVideoInfo = tBLiveDataModel.mVideoInfo;
        this.mRoomInfo = tBLiveDataModel.mRoomInfo;
        this.mRawData = tBLiveDataModel.mRawData;
        this.mFandomInfo = tBLiveDataModel.mFandomInfo;
        this.mInitParams = tBLiveDataModel.mInitParams;
        this.mActionUrl = tBLiveDataModel.mActionUrl;
        this.mViewItemId = tBLiveDataModel.mViewItemId;
    }
}
