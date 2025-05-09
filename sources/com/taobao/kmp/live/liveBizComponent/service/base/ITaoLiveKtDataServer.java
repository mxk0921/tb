package com.taobao.kmp.live.liveBizComponent.service.base;

import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.czs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtDataServer;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ltb/czs;", "model", "Ltb/xhv;", "updateLiveDetail", "(Ltb/czs;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;", "impl", "updateLiveUtManager", "(Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;)V", "", "subType", "", "", "", "data", "didRevLivePowerMsg", "(JLjava/util/Map;)V", "", "isPortrait", "onScreenOrientationChanged", "(Z)V", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "updateUpDownSwitchModel", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)V", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtDataServer extends Serializable {
    void didRevLivePowerMsg(long j, Map<String, ? extends Object> map);

    void onScreenOrientationChanged(boolean z);

    void updateLiveDetail(czs czsVar);

    void updateLiveUtManager(ITaoLiveKtUtManager iTaoLiveKtUtManager);

    void updateUpDownSwitchModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel);
}
