package com.taobao.kmp.live.liveBizComponent.service.biz.comment;

import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveKtCommentDriverResult;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "<init>", "()V", "originData", "", "", "", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "normal", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "getNormal", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "setNormal", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;)V", "bottom", "getBottom", "setBottom", "hotSale", "getHotSale", "setHotSale", "everyBodySay", "getEveryBodySay", "setEveryBodySay", BaseFBPlugin.PWD_TIPS_TYPE.typeWarning, "getWarning", "setWarning", "normalResponse", "getNormalResponse", "setNormalResponse", "atmospherePop", "", "getAtmospherePop", "()Z", "setAtmospherePop", "(Z)V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentDriverResult implements ITaoLiveKtOutViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean atmospherePop;
    private TaoLiveKtCommentEntity bottom;
    private TaoLiveKtCommentEntity everyBodySay;
    private TaoLiveKtCommentEntity hotSale;
    private TaoLiveKtCommentEntity normal;
    private TaoLiveKtCommentEntity normalResponse;
    private Map<String, ? extends Object> originData;
    private TaoLiveKtCommentEntity warning;

    static {
        t2o.a(1003487349);
        t2o.a(1003487283);
    }

    public final boolean getAtmospherePop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a3be24", new Object[]{this})).booleanValue();
        }
        return this.atmospherePop;
    }

    public final TaoLiveKtCommentEntity getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("9ff63715", new Object[]{this});
        }
        return this.bottom;
    }

    public final TaoLiveKtCommentEntity getEveryBodySay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("d37bd7d2", new Object[]{this});
        }
        return this.everyBodySay;
    }

    public final TaoLiveKtCommentEntity getHotSale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("2a1208d8", new Object[]{this});
        }
        return this.hotSale;
    }

    public final TaoLiveKtCommentEntity getNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("af983fd9", new Object[]{this});
        }
        return this.normal;
    }

    public final TaoLiveKtCommentEntity getNormalResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("b0775b98", new Object[]{this});
        }
        return this.normalResponse;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    public final TaoLiveKtCommentEntity getWarning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("acd2d870", new Object[]{this});
        }
        return this.warning;
    }

    public final void setAtmospherePop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2003ac0", new Object[]{this, new Boolean(z)});
        } else {
            this.atmospherePop = z;
        }
    }

    public final void setBottom(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f460b2db", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            this.bottom = taoLiveKtCommentEntity;
        }
    }

    public final void setEveryBodySay(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3030be", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            this.everyBodySay = taoLiveKtCommentEntity;
        }
    }

    public final void setHotSale(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39d80e0", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            this.hotSale = taoLiveKtCommentEntity;
        }
    }

    public final void setNormal(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ffc297", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            this.normal = taoLiveKtCommentEntity;
        }
    }

    public final void setNormalResponse(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c52b8", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            this.normalResponse = taoLiveKtCommentEntity;
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

    public final void setWarning(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f6a448", new Object[]{this, taoLiveKtCommentEntity});
        } else {
            this.warning = taoLiveKtCommentEntity;
        }
    }
}
