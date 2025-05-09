package com.taobao.kmp.live.liveBizComponent.model.leftBottom.send;

import com.ali.user.open.ucc.data.ApiConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "<init>", "()V", "originData", "", "", "", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "canShow", "getCanShow", "setCanShow", "needAlert", "getNeedAlert", "setNeedAlert", ApiConstants.ApiField.USER_ACTION, "getUserAction", "setUserAction", "resultModel", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResultModel;", "getResultModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResultModel;", "setResultModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResultModel;)V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentSendResponse implements ITaoLiveKtOutViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canShow;
    private boolean needAlert;
    private Map<String, ? extends Object> originData;
    private TaoLiveKtCommentSendResultModel resultModel;
    private boolean success;
    private boolean userAction;

    static {
        t2o.a(1003487314);
        t2o.a(1003487283);
    }

    public final boolean getCanShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a318f3c2", new Object[]{this})).booleanValue();
        }
        return this.canShow;
    }

    public final boolean getNeedAlert() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8de29c3b", new Object[]{this})).booleanValue();
        }
        return this.needAlert;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    public final TaoLiveKtCommentSendResultModel getResultModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentSendResultModel) ipChange.ipc$dispatch("7dc119c6", new Object[]{this});
        }
        return this.resultModel;
    }

    public final boolean getSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e2b51d8", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public final boolean getUserAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89df8ae2", new Object[]{this})).booleanValue();
        }
        return this.userAction;
    }

    public final void setCanShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64f31e2", new Object[]{this, new Boolean(z)});
        } else {
            this.canShow = z;
        }
    }

    public final void setNeedAlert(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6680589", new Object[]{this, new Boolean(z)});
        } else {
            this.needAlert = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public void setOriginData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371348ec", new Object[]{this, map});
        } else {
            this.originData = map;
        }
    }

    public final void setResultModel(TaoLiveKtCommentSendResultModel taoLiveKtCommentSendResultModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6977cbe", new Object[]{this, taoLiveKtCommentSendResultModel});
        } else {
            this.resultModel = taoLiveKtCommentSendResultModel;
        }
    }

    public final void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.success = z;
        }
    }

    public final void setUserAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e91d2a", new Object[]{this, new Boolean(z)});
        } else {
            this.userAction = z;
        }
    }
}
