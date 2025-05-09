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
public abstract class TaoliveRoomTab2RightGuideFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356383);
    }

    public TaoliveRoomTab2RightGuideFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(TaoliveRoomTab2RightGuideFrame taoliveRoomTab2RightGuideFrame, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/morelive/TaoliveRoomTab2RightGuideFrame");
    }

    public abstract void showMoreLiveFrame(boolean z);

    public TaoliveRoomTab2RightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public TaoliveRoomTab2RightGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}
