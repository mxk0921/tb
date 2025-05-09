package com.taobao.taolive.room.controller2;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.sdk.controller.IComponentLifeCycle2;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.cba;
import tb.fws;
import tb.naj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveGoodCardVH extends TaoLiveRoomBaseVH implements IComponentLifeCycle2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private fws mController;

    static {
        t2o.a(779092884);
        t2o.a(806356051);
    }

    public TaoLiveGoodCardVH(View view) {
        super(view);
        fws fwsVar = new fws();
        this.mController = fwsVar;
        fwsVar.r(view);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveGoodCardVH taoLiveGoodCardVH, String str, Object... objArr) {
        if (str.hashCode() == 331949262) {
            super.setGlobalContext((cba) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/TaoLiveGoodCardVH");
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            return fwsVar.o();
        }
        return null;
    }

    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            return fwsVar.p();
        }
        return "";
    }

    @Override // com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH
    public void initMultiRoomVideoControllerObserver(naj najVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dfc9", new Object[]{this, najVar});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.t(najVar);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.v();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.w();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.x();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.y();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPreloadView(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72946fa", new Object[]{this, iRecyclerModel});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null && (iRecyclerModel instanceof RecModel)) {
            fwsVar.u((RecModel) iRecyclerModel);
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onRemove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885fa4a", new Object[]{this});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.z();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.A(i);
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.B();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        }
    }

    @Override // com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.C();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onUnloadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931608a", new Object[]{this});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef86571", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.H();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.D();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.E();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.F();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.G();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillLoad(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efaa6133", new Object[]{this, iRecyclerModel});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null && (iRecyclerModel instanceof RecModel)) {
            fwsVar.I((RecModel) iRecyclerModel);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.J();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.K();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH
    public void setGlobalContext(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c924ce", new Object[]{this, cbaVar});
            return;
        }
        super.setGlobalContext(cbaVar);
        this.mController.N(cbaVar);
        this.mController.P(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        fws fwsVar = this.mController;
        if (fwsVar != null) {
            fwsVar.C();
        }
    }
}
