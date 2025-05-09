package com.taobao.taolive.room.controller2;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;
import com.taobao.taolive.room.openarchitecture.kmp.OpenArchSingleEntityAdapter;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.sdk.controller.IComponentLifeCycle2;
import com.taobao.taolive.sdk.controller.IRecyclerModel;
import com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import tb.cba;
import tb.cdr;
import tb.d4s;
import tb.naj;
import tb.t2o;
import tb.wiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OpenLiveSingleRoomVH extends TaoLiveRoomBaseVH implements IComponentLifeCycle2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isAboutToEndState;
    private OpenSingleViewController mController;
    private RecModel recModel;
    private final wiv mUpDownLifeCycleMonitor = new wiv();
    private boolean hasDidAppear = false;

    static {
        t2o.a(779092848);
        t2o.a(806356051);
    }

    public OpenLiveSingleRoomVH(View view) {
        super(view);
        OpenSingleViewController openSingleViewController = new OpenSingleViewController();
        this.mController = openSingleViewController;
        openSingleViewController.initKMPKMPEntityAdapter(openSingleViewController);
    }

    public static /* synthetic */ Object ipc$super(OpenLiveSingleRoomVH openLiveSingleRoomVH, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 267248023) {
            super.init();
            return null;
        } else if (hashCode == 331949262) {
            super.setGlobalContext((cba) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/controller2/OpenLiveSingleRoomVH");
        }
    }

    public void aboutToDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1754a2", new Object[]{this});
        } else if (d4s.e("aboutToDisappearBugfix", true)) {
            if (this.hasDidAppear && !this.isAboutToEndState) {
                this.isAboutToEndState = true;
                OpenSingleViewController openSingleViewController = this.mController;
                if (openSingleViewController != null) {
                    openSingleViewController.aboutToDisappear();
                }
            }
        } else if (!this.isAboutToEndState) {
            this.isAboutToEndState = true;
            OpenSingleViewController openSingleViewController2 = this.mController;
            if (openSingleViewController2 != null) {
                openSingleViewController2.aboutToDisappear();
            }
        }
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            return openSingleViewController.getUbeeContainer();
        }
        return null;
    }

    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            return openSingleViewController.getViewItemId();
        }
        return "";
    }

    @Override // com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        View view = this.itemView;
        if (view != null) {
            this.mController.init(view.getContext(), this.itemView);
        }
    }

    @Override // com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH
    public void initMultiRoomVideoControllerObserver(naj najVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dfc9", new Object[]{this, najVar});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            openSingleViewController.initMultiRoomVideoControllerObserver(najVar);
        }
    }

    public void interruptEndingState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15448e4e", new Object[]{this});
        } else if (this.isAboutToEndState) {
            this.isAboutToEndState = false;
            OpenSingleViewController openSingleViewController = this.mController;
            if (openSingleViewController != null) {
                openSingleViewController.interruptEndingState();
            }
        }
    }

    public boolean isAboutToEndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c1737f", new Object[]{this})).booleanValue();
        }
        return this.isAboutToEndState;
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
        if (d4s.e("enableUpDownLifecycleMonitor2", true)) {
            this.mUpDownLifeCycleMonitor.b(getViewItemId());
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onDestory, "activityLifecycle", null)) {
            this.mController.onDestroy();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onPause, "activityLifecycle", null)) {
            this.mController.onPause();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPreloadView(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72946fa", new Object[]{this, iRecyclerModel});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && (iRecyclerModel instanceof RecModel)) {
            RecModel recModel = (RecModel) iRecyclerModel;
            this.recModel = recModel;
            openSingleViewController.initSingleEntity();
            HashMap hashMap = new HashMap();
            hashMap.put("LifeCycleNativeParams", this.recModel);
            if (!this.mController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onBindView, "scrollContainerLifecycle", hashMap)) {
                this.mController.onBindView(recModel);
            }
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
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onResume, "activityLifecycle", null)) {
            this.mController.onResume();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            openSingleViewController.onScrollStateChanged(i);
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onStart, "activityLifecycle", null)) {
            this.mController.onStart();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (this.mController != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isOpenSmallWindowOnce", Boolean.TRUE);
            if (!this.mController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onStop, "activityLifecycle", hashMap)) {
                this.mController.onStop(true);
            }
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
    public void onViewHolderWillLoad(IRecyclerModel iRecyclerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efaa6133", new Object[]{this, iRecyclerModel});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && (iRecyclerModel instanceof RecModel)) {
            RecModel recModel = (RecModel) iRecyclerModel;
            this.recModel = recModel;
            openSingleViewController.initSingleEntity();
            HashMap hashMap = new HashMap();
            hashMap.put("LifeCycleNativeParams", this.recModel);
            if (!this.mController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onViewHolderWillLoad, "viewHolderLifecycle", hashMap)) {
                this.mController.onViewHolderWillLoad(recModel);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onWillDisappear, "scrollContainerLifecycle", null)) {
            this.mController.onWillDisappear();
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
        this.mController.setGlobalContext(cbaVar);
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
            return;
        }
        if (d4s.e("enableUpDownLifecycleMonitor2", true)) {
            this.mUpDownLifeCycleMonitor.f(getViewItemId());
        }
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onViewHolderWillDisappear, "viewHolderLifecycle", null)) {
            this.mController.onViewHolderWillDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        this.hasDidAppear = true;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            OpenArchSingleEntityAdapter openArchEntityAdapter = openSingleViewController.getOpenArchEntityAdapter();
            RecModel recModel = this.recModel;
            cdr frameContext = this.mController.getFrameContext();
            if (!this.mController.isPreRequest() && !this.mController.isPreSimpleRequest()) {
                z = true;
            }
            if (!openArchEntityAdapter.g("scrollContainerLifecycle", recModel, frameContext, z)) {
                this.mController.onDidAppear();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        this.hasDidAppear = false;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().h("scrollContainerLifecycle", true)) {
            this.mController.onDidDisappear();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef86571", new Object[]{this});
            return;
        }
        if (d4s.e("enableUpDownLifecycleMonitor2", true)) {
            this.mUpDownLifeCycleMonitor.h(getViewItemId());
        }
        this.hasDidAppear = false;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onViewHolderDestroy, "viewHolderLifecycle", null)) {
            this.mController.onViewHolderDestroy();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidAppear() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
            return;
        }
        if (d4s.e("enableUpDownLifecycleMonitor2", true)) {
            this.mUpDownLifeCycleMonitor.c(getViewItemId());
        }
        this.hasDidAppear = true;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            OpenArchSingleEntityAdapter openArchEntityAdapter = openSingleViewController.getOpenArchEntityAdapter();
            RecModel recModel = this.recModel;
            cdr frameContext = this.mController.getFrameContext();
            if (!this.mController.isPreRequest() && !this.mController.isPreSimpleRequest()) {
                z = true;
            }
            if (!openArchEntityAdapter.g("viewHolderLifecycle", recModel, frameContext, z)) {
                this.mController.onViewHolderDidAppear();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
            return;
        }
        if (d4s.e("enableUpDownLifecycleMonitor2", true)) {
            this.mUpDownLifeCycleMonitor.d(getViewItemId());
        }
        this.hasDidAppear = false;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null && !openSingleViewController.getOpenArchEntityAdapter().h("viewHolderLifecycle", true)) {
            this.mController.onViewHolderDidDisappear();
        }
    }

    @Override // com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
            return;
        }
        if (d4s.e("enableUpDownLifecycleMonitor2", true)) {
            this.mUpDownLifeCycleMonitor.e(getViewItemId());
        }
        this.isAboutToEndState = false;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            if (!openSingleViewController.getOpenArchEntityAdapter().j("viewHolderLifecycle", this.recModel, this.mController.getFrameContext(), !this.mController.isPreRequest() && !this.mController.isPreSimpleRequest(), null)) {
                this.mController.onViewHolderWillAppear();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        this.isAboutToEndState = false;
        OpenSingleViewController openSingleViewController = this.mController;
        if (openSingleViewController != null) {
            if (!openSingleViewController.getOpenArchEntityAdapter().j("scrollContainerLifecycle", this.recModel, this.mController.getFrameContext(), !this.mController.isPreRequest() && !this.mController.isPreSimpleRequest(), null)) {
                this.mController.onWillAppear();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.controller.TaoLiveRoomBaseVH
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
        } else if (this.mController != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isOpenSmallWindowOnce", Boolean.valueOf(z));
            if (!this.mController.getOpenArchEntityAdapter().i(PlatformListenerEnum.onStop, "activityLifecycle", hashMap)) {
                this.mController.onStop(z);
            }
        }
    }
}
