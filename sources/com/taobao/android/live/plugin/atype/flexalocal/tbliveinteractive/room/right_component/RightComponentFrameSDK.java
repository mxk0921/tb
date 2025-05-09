package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.right_component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.RightComponentController;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.czd;
import tb.rbt;
import tb.t2o;
import tb.t54;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RightComponentFrameSDK extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RightComponentController mRightComponentController;

    static {
        t2o.a(295699936);
    }

    @Deprecated
    public RightComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    private void adjustLayoutParams() {
        ATaoLiveOpenEntity A;
        czd czdVar;
        Float f;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        ux9 ux9Var = this.mFrameContext;
        float f2 = 0.0f;
        if (ux9Var != null && (A = ux9Var.A()) != null && (czdVar = A.uiCompontent) != null && ((rbt) czdVar).b() != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString().equals(A.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString().equals(A.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(A.bizCode) && (f = ((rbt) A.uiCompontent).b().f()) != null && f.floatValue() > 0.0f && f.floatValue() <= 500.0f) {
            f2 = f.floatValue();
            z = true;
        }
        if (z) {
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin + f2);
        }
        getComponentView().setLayoutParams(marginLayoutParams);
    }

    private IInteractiveProxy.h getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("d5cdd132", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof t54) {
            return ((t54) ux9Var).z0();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(RightComponentFrameSDK rightComponentFrameSDK, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1777320968:
                super.onCreateView2((ViewGroup) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 47479189:
                return super.getComponentView();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/room/right_component/RightComponentFrameSDK");
        }
    }

    private void setRightComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f3a50f", new Object[]{this});
            return;
        }
        RightComponentController rightComponentController = this.mRightComponentController;
        if (rightComponentController != null && rightComponentController.l() != null && this.mFrameContext != null) {
            this.mFrameContext.m0(this.mRightComponentController.l().findViewById(R.id.interactive_right_component_recycler));
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        RightComponentController rightComponentController = this.mRightComponentController;
        if (rightComponentController != null) {
            rightComponentController.i();
            this.mRightComponentController = null;
        }
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return RightComponentController.TAG;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public View getComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d47995", new Object[]{this});
        }
        RightComponentController rightComponentController = this.mRightComponentController;
        if (rightComponentController != null) {
            return rightComponentController.o();
        }
        return super.getComponentView();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        IInteractiveProxy.h tBLiveInteractiveManager = getTBLiveInteractiveManager();
        if (tBLiveInteractiveManager != null) {
            View view = this.mContainer;
            if (view instanceof ViewGroup) {
                IInteractiveProxy.i p = tBLiveInteractiveManager.p((ViewGroup) view, isLandscape());
                if (p instanceof RightComponentController) {
                    RightComponentController rightComponentController = (RightComponentController) p;
                    this.mRightComponentController = rightComponentController;
                    rightComponentController.p();
                    setRightComponentView();
                }
            }
        }
        adjustLayoutParams();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96103bf8", new Object[]{this, viewGroup});
            return;
        }
        super.onCreateView2(viewGroup);
        this.mContainer = viewGroup;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i == 1) {
            init();
        }
    }

    public RightComponentFrameSDK(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}
