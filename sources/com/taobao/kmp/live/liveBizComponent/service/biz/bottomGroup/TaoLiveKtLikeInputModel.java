package com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeInputModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "<init>", "()V", "originData", "", "", "", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "extraFlag", "getExtraFlag", "()Ljava/lang/String;", "setExtraFlag", "(Ljava/lang/String;)V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtLikeInputModel implements ITaoLiveKtOutViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String extraFlag;
    private Map<String, ? extends Object> originData;

    static {
        t2o.a(1003487340);
        t2o.a(1003487283);
    }

    public final String getExtraFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2438e9d3", new Object[]{this});
        }
        return this.extraFlag;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    public final void setExtraFlag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5220c6b", new Object[]{this, str});
        } else {
            this.extraFlag = str;
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
