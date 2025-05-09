package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ewp;
import tb.hha;
import tb.hqd;
import tb.nh4;
import tb.t2o;
import tb.ux9;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShowcaseFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShowcaseFrameCommon";
    public xea goodLiveContext = null;
    private hqd mControllerCommon;

    static {
        t2o.a(295699112);
    }

    public ShowcaseFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(ShowcaseFrame showcaseFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 588897590) {
            super.onVideoStatusChanged(((Number) objArr[0]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/ShowcaseFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-showcase-common";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_goods_showcase_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        hha.b(TAG, "onCleanUp. this=" + this);
        hqd hqdVar = this.mControllerCommon;
        if (hqdVar != null) {
            hqdVar.destroy();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
            return;
        }
        super.onVideoStatusChanged(i);
        if (i == 5 && this.mControllerCommon != null) {
            xea xeaVar = this.goodLiveContext;
            if (xeaVar == null || !xeaVar.Q()) {
                this.mControllerCommon.a();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
            if (nh4.z()) {
                hha.b(TAG, "onDataReceived | initGoodLiveContext.");
                xea J = xea.J(this.mFrameContext, this.mContext, this.mLiveDataModel, this.mLandscape, false, "showcase");
                this.goodLiveContext = J;
                if (J == null) {
                    hha.b(TAG, "onDataReceived | goodLiveContext is null.");
                    return;
                }
            } else if (this.mFrameContext.k() instanceof xea) {
                this.goodLiveContext = (xea) this.mFrameContext.k();
            }
            StringBuilder sb = new StringBuilder("onDataReceived | newShowcase. this=");
            sb.append(this);
            sb.append("  contextNull=");
            if (this.goodLiveContext != null) {
                z = false;
            }
            sb.append(z);
            hha.b(TAG, sb.toString());
            this.mControllerCommon = new ewp((ViewGroup) getContainerView(), this.mFrameContext.t(), tBLiveDataModel, this.goodLiveContext);
        }
    }
}
