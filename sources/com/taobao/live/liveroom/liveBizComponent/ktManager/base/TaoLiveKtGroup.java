package com.taobao.live.liveroom.liveBizComponent.ktManager.base;

import androidx.core.graphics.drawable.IconCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponentGroup;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.czs;
import tb.es6;
import tb.exs;
import tb.i04;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J/\u0010)\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtGroup;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponentGroup;", "<init>", "()V", "Ltb/exs;", es6.DP_BIZ_CONTEXT, "Ltb/xhv;", "install", "(Ltb/exs;)V", "unInstall", "Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", IconCompat.EXTRA_OBJ, "addComponent", "(Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;)V", "addLazyComponent", "removeComponent", "clearAll", "viewWillAppear", "viewDidAppear", "viewWillDisappear", "viewDidDisappear", "onAppWillEnterForeground", "onAppDidEnterBackground", "Ltb/czs;", "model", "updateLiveDetail", "(Ltb/czs;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;", "impl", "updateLiveUtManager", "(Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;)V", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "data", "updateUpDownSwitchModel", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)V", "", "subType", "", "", "", "didRevLivePowerMsg", "(JLjava/util/Map;)V", "", "isPortrait", "onScreenOrientationChanged", "(Z)V", "", "list", "Ljava/util/List;", "", "getComponents", "()Ljava/util/List;", "components", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class TaoLiveKtGroup extends TaoLiveKtComponent implements ITaoLiveKtComponentGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ITaoLiveKtComponent> list = new ArrayList();

    static {
        t2o.a(1010827283);
        t2o.a(1003487272);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtGroup taoLiveKtGroup, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 861017161) {
            super.unInstall();
            return null;
        } else if (hashCode == 1889805786) {
            super.install((exs) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtGroup");
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponentGroup
    public void addComponent(ITaoLiveKtComponent iTaoLiveKtComponent) {
        List<ITaoLiveKtComponent> list;
        ITaoLiveKtServiceContainer c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01a77ff", new Object[]{this, iTaoLiveKtComponent});
        } else if (iTaoLiveKtComponent != null && (list = this.list) != null && !list.contains(iTaoLiveKtComponent)) {
            iTaoLiveKtComponent.install(getBizContext());
            exs bizContext = getBizContext();
            if (!(bizContext == null || (c = bizContext.c()) == null)) {
                c.registerImpl(iTaoLiveKtComponent, iTaoLiveKtComponent.getName());
            }
            List<ITaoLiveKtComponent> list2 = this.list;
            if (list2 != null) {
                list2.add(iTaoLiveKtComponent);
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponentGroup
    public void addLazyComponent(ITaoLiveKtComponent iTaoLiveKtComponent) {
        czs czsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c1d36b", new Object[]{this, iTaoLiveKtComponent});
            return;
        }
        addComponent(iTaoLiveKtComponent);
        ITaoLiveKtUtManager iTaoLiveKtUtManager = null;
        if (iTaoLiveKtComponent != null) {
            exs bizContext = getBizContext();
            if (bizContext != null) {
                czsVar = bizContext.a();
            } else {
                czsVar = null;
            }
            iTaoLiveKtComponent.updateLiveDetail(czsVar);
        }
        if (iTaoLiveKtComponent != null) {
            exs bizContext2 = getBizContext();
            if (bizContext2 != null) {
                iTaoLiveKtUtManager = bizContext2.d();
            }
            iTaoLiveKtComponent.updateLiveUtManager(iTaoLiveKtUtManager);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponentGroup
    public void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                removeComponent(iTaoLiveKtComponent);
            }
        }
        List<ITaoLiveKtComponent> list = this.list;
        if (list != null) {
            list.clear();
        }
        this.list = null;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void didRevLivePowerMsg(long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d149c7d4", new Object[]{this, new Long(j), map});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.didRevLivePowerMsg(j, map);
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponentGroup
    public List<ITaoLiveKtComponent> getComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d86cc054", new Object[]{this});
        }
        List<ITaoLiveKtComponent> list = this.list;
        if (list != null) {
            return i04.B0(list);
        }
        return null;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void install(exs exsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a425da", new Object[]{this, exsVar});
            return;
        }
        super.install(exsVar);
        this.list = new ArrayList();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void onAppDidEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc76b10", new Object[]{this});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.onAppDidEnterBackground();
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void onAppWillEnterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc6a9ee", new Object[]{this});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.onAppWillEnterForeground();
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void onScreenOrientationChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876d5f3e", new Object[]{this, new Boolean(z)});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.onScreenOrientationChanged(z);
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponentGroup
    public void removeComponent(ITaoLiveKtComponent iTaoLiveKtComponent) {
        List<ITaoLiveKtComponent> list;
        ITaoLiveKtServiceContainer c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e7f27c", new Object[]{this, iTaoLiveKtComponent});
        } else if (iTaoLiveKtComponent != null && (list = this.list) != null && list.contains(iTaoLiveKtComponent)) {
            iTaoLiveKtComponent.unInstall();
            exs bizContext = getBizContext();
            if (!(bizContext == null || (c = bizContext.c()) == null)) {
                c.unregister(iTaoLiveKtComponent.getName());
            }
            List<ITaoLiveKtComponent> list2 = this.list;
            if (list2 != null) {
                list2.remove(iTaoLiveKtComponent);
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void unInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33521449", new Object[]{this});
            return;
        }
        clearAll();
        super.unInstall();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null) {
            bizContext.f(czsVar);
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.updateLiveDetail(czsVar);
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveUtManager(ITaoLiveKtUtManager iTaoLiveKtUtManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60fb23b", new Object[]{this, iTaoLiveKtUtManager});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null) {
            bizContext.k(iTaoLiveKtUtManager);
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.updateLiveUtManager(iTaoLiveKtUtManager);
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateUpDownSwitchModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ab7284", new Object[]{this, taoLiveKtSwitchModel});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null) {
            bizContext.j(taoLiveKtSwitchModel);
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.updateUpDownSwitchModel(taoLiveKtSwitchModel);
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29bb6d6", new Object[]{this});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.viewDidAppear();
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc5f130", new Object[]{this});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.viewDidDisappear();
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ef13", new Object[]{this});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.viewWillAppear();
            }
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450173d3", new Object[]{this});
            return;
        }
        List<ITaoLiveKtComponent> components = getComponents();
        if (components != null) {
            for (ITaoLiveKtComponent iTaoLiveKtComponent : components) {
                iTaoLiveKtComponent.viewWillDisappear();
            }
        }
    }
}
