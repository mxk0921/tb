package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.driver;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority;
import java.util.Map;
import kotlin.Metadata;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ<\u0010\u0012\u001a\u00020\u00042+\u0010\u0011\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\tR\"\u0010\"\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\tR\"\u0010%\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\tR\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\"\u0010)\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\tR\"\u0010,\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\tR;\u0010/\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentShowPriority;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;", "<init>", "()V", "Ltb/xhv;", "postStatus", "", "value", "postAnchorResponseShow", "(Z)V", "postEveryBodySayHidden", "postHotSaleHidden", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "priority", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentPriorityChanged;", "changed", "listenStatus", "(Ltb/g1a;)V", "", "", "", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "bottomHidden", "Z", "getBottomHidden", "()Z", "setBottomHidden", "hotSaleHidden", "getHotSaleHidden", "setHotSaleHidden", "everyBodySayHidden", "getEveryBodySayHidden", "setEveryBodySayHidden", "everyBodySayShowing", "anchorTopShowing", "getAnchorTopShowing", "setAnchorTopShowing", "anchorResponseShowing", "getAnchorResponseShowing", "setAnchorResponseShowing", "changedCallback", "Ltb/g1a;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentShowPriority implements ITaoLiveKtCommentShowPriority {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean anchorResponseShowing;
    private boolean anchorTopShowing;
    private boolean bottomHidden;
    private g1a<? super ITaoLiveKtCommentShowPriority, xhv> changedCallback;
    private boolean everyBodySayHidden;
    private boolean everyBodySayShowing;
    private boolean hotSaleHidden;
    private Map<String, ? extends Object> originData;

    static {
        t2o.a(1010827316);
        t2o.a(1003487347);
    }

    private final void postStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adce3839", new Object[]{this});
            return;
        }
        g1a<? super ITaoLiveKtCommentShowPriority, xhv> g1aVar = this.changedCallback;
        if (g1aVar != null) {
            g1aVar.invoke(this);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public boolean getAnchorResponseShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b3f9f24", new Object[]{this})).booleanValue();
        }
        return this.anchorResponseShowing;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public boolean getAnchorTopShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd3bb3c6", new Object[]{this})).booleanValue();
        }
        return this.anchorTopShowing;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public boolean getBottomHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9432a136", new Object[]{this})).booleanValue();
        }
        return this.bottomHidden;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public boolean getEveryBodySayHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b651d619", new Object[]{this})).booleanValue();
        }
        return this.everyBodySayHidden;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public boolean getHotSaleHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aab749d3", new Object[]{this})).booleanValue();
        }
        return this.hotSaleHidden;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void listenStatus(g1a<? super ITaoLiveKtCommentShowPriority, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e26f666", new Object[]{this, g1aVar});
        } else {
            this.changedCallback = g1aVar;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void postAnchorResponseShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c978a81a", new Object[]{this, new Boolean(z)});
            return;
        }
        setAnchorResponseShowing(z);
        setBottomHidden(!z);
        setEveryBodySayHidden(!z);
        setHotSaleHidden(!z);
        postStatus();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void postEveryBodySayHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cfc2d5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (getAnchorResponseShowing()) {
            this.everyBodySayShowing = false;
            setBottomHidden(true);
            setHotSaleHidden(true);
        } else {
            this.everyBodySayShowing = !z;
            setBottomHidden(!z);
            setHotSaleHidden(!z);
        }
        postStatus();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void postHotSaleHidden(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9655adaf", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!getAnchorResponseShowing() && !this.everyBodySayShowing && z) {
            z2 = false;
        }
        setBottomHidden(z2);
        postStatus();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void setAnchorResponseShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c73adc0", new Object[]{this, new Boolean(z)});
        } else {
            this.anchorResponseShowing = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void setAnchorTopShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4e29c6", new Object[]{this, new Boolean(z)});
        } else {
            this.anchorTopShowing = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void setBottomHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb84456", new Object[]{this, new Boolean(z)});
        } else {
            this.bottomHidden = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void setEveryBodySayHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1984d3", new Object[]{this, new Boolean(z)});
        } else {
            this.everyBodySayHidden = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority
    public void setHotSaleHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435e24f1", new Object[]{this, new Boolean(z)});
        } else {
            this.hotSaleHidden = z;
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
}
