package com.taobao.live.liveroom.liveBizComponent.ktManager.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtRenderComponent;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtRender;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtRenderComponent;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtRenderComponent;", "<init>", "()V", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtRender;", "adapter", "Ltb/xhv;", "updateRender", "(Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtRender;)V", "renderAdapter", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtRender;", "getRootView", "()Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtRender;", "rootView", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class TaoLiveKtRenderComponent extends TaoLiveKtComponent implements ITaoLiveKtRenderComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ITaoLiveKtRender renderAdapter;

    static {
        t2o.a(1010827284);
        t2o.a(1003487273);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtRenderComponent taoLiveKtRenderComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtRenderComponent");
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtRenderComponent
    public ITaoLiveKtRender getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtRender) ipChange.ipc$dispatch("4470d5c3", new Object[]{this});
        }
        return this.renderAdapter;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtRenderComponent
    public void updateRender(ITaoLiveKtRender iTaoLiveKtRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56883657", new Object[]{this, iTaoLiveKtRender});
            return;
        }
        ckf.g(iTaoLiveKtRender, "adapter");
        this.renderAdapter = iTaoLiveKtRender;
    }
}
