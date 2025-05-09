package com.taobao.live.liveroom.liveBizComponent.ktManager.base;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import java.util.Map;
import kotlin.Metadata;
import tb.czs;
import tb.dun;
import tb.es6;
import tb.exs;
import tb.ns3;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Ltb/exs;", es6.DP_BIZ_CONTEXT, "Ltb/xhv;", "install", "(Ltb/exs;)V", "unInstall", "viewWillAppear", "viewDidAppear", "viewWillDisappear", "viewDidDisappear", "onAppWillEnterForeground", "onAppDidEnterBackground", "Ltb/czs;", "model", "updateLiveDetail", "(Ltb/czs;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;", "impl", "updateLiveUtManager", "(Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;)V", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "data", "updateUpDownSwitchModel", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)V", "", "subType", "", "", "didRevLivePowerMsg", "(JLjava/util/Map;)V", "", "isPortrait", "onScreenOrientationChanged", "(Z)V", "context", "Ltb/exs;", "getBizContext", "()Ltb/exs;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class TaoLiveKtComponent implements ITaoLiveKtComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private exs context;

    static {
        t2o.a(1010827282);
        t2o.a(1003487271);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void didRevLivePowerMsg(long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d149c7d4", new Object[]{this, new Long(j), map});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public exs getBizContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (exs) ipChange.ipc$dispatch("5d15ce95", new Object[]{this});
        }
        return this.context;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        String simpleName = ((ns3) dun.b(getClass())).getSimpleName();
        if (simpleName == null) {
            return "";
        }
        return simpleName;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void install(exs exsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a425da", new Object[]{this, exsVar});
        } else {
            this.context = exsVar;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void onAppDidEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc76b10", new Object[]{this});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void onAppWillEnterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc6a9ee", new Object[]{this});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void onScreenOrientationChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876d5f3e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void unInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33521449", new Object[]{this});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveUtManager(ITaoLiveKtUtManager iTaoLiveKtUtManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60fb23b", new Object[]{this, iTaoLiveKtUtManager});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateUpDownSwitchModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ab7284", new Object[]{this, taoLiveKtSwitchModel});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29bb6d6", new Object[]{this});
        }
    }

    public void viewDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc5f130", new Object[]{this});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ef13", new Object[]{this});
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450173d3", new Object[]{this});
        }
    }
}
