package com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeViewModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "<init>", "()V", "originData", "", "", "", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "showLikeCount", "", "getShowLikeCount", "()J", "setShowLikeCount", "(J)V", "remoteLikeDiff", "getRemoteLikeDiff", "setRemoteLikeDiff", "userLikeCount", "getUserLikeCount", "setUserLikeCount", "userTotalLikeCount", "getUserTotalLikeCount", "setUserTotalLikeCount", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtLikeViewModel implements ITaoLiveKtOutViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ? extends Object> originData;
    private long remoteLikeDiff;
    private long showLikeCount;
    private long userLikeCount;
    private long userTotalLikeCount;

    static {
        t2o.a(1003487341);
        t2o.a(1003487283);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    public final long getRemoteLikeDiff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5030813", new Object[]{this})).longValue();
        }
        return this.remoteLikeDiff;
    }

    public final long getShowLikeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82461f80", new Object[]{this})).longValue();
        }
        return this.showLikeCount;
    }

    public final long getUserLikeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8f74d72", new Object[]{this})).longValue();
        }
        return this.userLikeCount;
    }

    public final long getUserTotalLikeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6f36570", new Object[]{this})).longValue();
        }
        return this.userTotalLikeCount;
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

    public final void setRemoteLikeDiff(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a331f9", new Object[]{this, new Long(j)});
        } else {
            this.remoteLikeDiff = j;
        }
    }

    public final void setShowLikeCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da9cac4", new Object[]{this, new Long(j)});
        } else {
            this.showLikeCount = j;
        }
    }

    public final void setUserLikeCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd1e5b12", new Object[]{this, new Long(j)});
        } else {
            this.userLikeCount = j;
        }
    }

    public final void setUserTotalLikeCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9a63c", new Object[]{this, new Long(j)});
        } else {
            this.userTotalLikeCount = j;
        }
    }
}
