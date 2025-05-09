package com.taobao.taolive.sdk.morelive;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TaoliveRoomRightGuideFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356382);
    }

    public TaoliveRoomRightGuideFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(TaoliveRoomRightGuideFrame taoliveRoomRightGuideFrame, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/morelive/TaoliveRoomRightGuideFrame");
    }

    public abstract void showMoreLiveFrame();

    public abstract void updateClearScreenStatus(boolean z);

    public abstract void updateEntryData();

    public TaoliveRoomRightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public TaoliveRoomRightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}
