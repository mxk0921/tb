package com.taobao.global.setting.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.mtop.model.UserProfile;
import com.taobao.global.setting.mtop.response.UserProfileDataResponse;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ayn;
import tb.gyb;
import tb.h7h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RemoteDataManager$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ayn this$0;
    public final /* synthetic */ gyb val$callback;

    public RemoteDataManager$1(ayn aynVar, gyb gybVar) {
        this.val$callback = gybVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        gyb gybVar = this.val$callback;
        if (gybVar != null) {
            gybVar.onFailed(gyb.ERROR_MTOP_SERVICE_EXCEPTION, mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        UserProfile simpleInfo = ((UserProfileDataResponse) baseOutDo).getData().getSimpleInfo();
        if (simpleInfo != null) {
            String str = "Global_User_Profile" + Login.getUserId();
            h7h.g().c(str);
            if (h7h.g().f()) {
                h7h.g().e(str, simpleInfo);
            }
            gyb gybVar = this.val$callback;
            if (gybVar != null) {
                gybVar.onSuccess(simpleInfo);
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            onError(i, mtopResponse, obj);
        }
    }
}
