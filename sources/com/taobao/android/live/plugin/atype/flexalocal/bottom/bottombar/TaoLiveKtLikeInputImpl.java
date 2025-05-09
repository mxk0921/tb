package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeInputProtocol;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.TaoLiveKtLikeInputModel;
import tb.giv;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveKtLikeInputImpl implements ITaoLiveKtLikeInputProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ux9 mFrameContext;

    static {
        t2o.a(295698495);
        t2o.a(1003487337);
    }

    public TaoLiveKtLikeInputImpl(ux9 ux9Var) {
        this.mFrameContext = ux9Var;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeInputProtocol
    public TaoLiveKtLikeInputModel fetchLikeInputModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtLikeInputModel) ipChange.ipc$dispatch("f8401c9c", new Object[]{this});
        }
        TaoLiveKtLikeInputModel taoLiveKtLikeInputModel = new TaoLiveKtLikeInputModel();
        if (this.mFrameContext == null) {
            return taoLiveKtLikeInputModel;
        }
        taoLiveKtLikeInputModel.setExtraFlag(JSON.toJSONString(giv.f().j(this.mFrameContext)));
        return taoLiveKtLikeInputModel;
    }
}
