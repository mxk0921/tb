package com.taobao.android.live.plugin.atype.flexalocal.good.tab;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.aqs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TabBundleInfo$NativeDXTabBundle extends aqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GoodsLiveStateMutitabView stateMultiTabView;

    static {
        t2o.a(295699165);
    }

    public TabBundleInfo$NativeDXTabBundle(int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        super(i, extraGoodsTabItem);
    }

    public static /* synthetic */ Object ipc$super(TabBundleInfo$NativeDXTabBundle tabBundleInfo$NativeDXTabBundle, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/tab/TabBundleInfo$NativeDXTabBundle");
    }

    @Override // tb.aqs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        GoodsLiveStateMutitabView goodsLiveStateMutitabView = this.stateMultiTabView;
        if (goodsLiveStateMutitabView != null) {
            goodsLiveStateMutitabView.destroy();
        }
    }

    @Override // tb.aqs
    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        GoodsLiveStateMutitabView goodsLiveStateMutitabView = this.stateMultiTabView;
        if (goodsLiveStateMutitabView != null) {
            goodsLiveStateMutitabView.onHide();
        }
    }
}
