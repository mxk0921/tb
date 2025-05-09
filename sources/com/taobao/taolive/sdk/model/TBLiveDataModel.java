package com.taobao.taolive.sdk.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveDataModel implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mActionUrl;
    public FandomInfo mFandomInfo;
    public Map<String, String> mInitParams;
    public boolean mIsDiantaoTimeShift;
    public String mRawData;
    public ChatRoomInfo mRoomInfo;
    public VideoInfo mVideoInfo;
    public String mViewItemId;

    static {
        t2o.a(806356176);
        t2o.a(806355930);
    }

    public void clearManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e9e527", new Object[]{this});
        }
    }
}
