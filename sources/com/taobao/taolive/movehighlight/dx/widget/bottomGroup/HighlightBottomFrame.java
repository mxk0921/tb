package com.taobao.taolive.movehighlight.dx.widget.bottomGroup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import tb.axa;
import tb.cdr;
import tb.d9m;
import tb.dxa;
import tb.k0e;
import tb.qr4;
import tb.t2o;
import tb.uwa;
import tb.ux9;
import tb.z6m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightBottomFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public z6m playerControllerBean;
    private JSONObject renderJsonObject;

    static {
        t2o.a(779092640);
    }

    public HighlightBottomFrame(Context context, ux9 ux9Var, JSONObject jSONObject) {
        super(context, ux9Var);
        this.renderJsonObject = jSONObject;
    }

    private void initBottomBar(View view) {
        ViewStub viewStub;
        BaseFrame createHighlightBottomBarFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de410f33", new Object[]{this, view});
            return;
        }
        k0e k0eVar = this.playerControllerBean.b;
        View view2 = this.mContainer;
        if (view2 != null && (viewStub = (ViewStub) view2.findViewById(R.id.taolive_highlight_dx_group_bottom)) != null && (createHighlightBottomBarFrame = d9m.g().createHighlightBottomBarFrame(this.mContext, this.mFrameContext, viewStub, axa.f(), this.renderJsonObject, k0eVar, view)) != null) {
            addComponent(createHighlightBottomBarFrame);
        }
    }

    private qr4 initHighlightDxControllerHolder(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qr4) ipChange.ipc$dispatch("bfebf7e3", new Object[]{this, frameLayout});
        }
        if (this.mContainer == null) {
            return null;
        }
        qr4 qr4Var = new qr4();
        qr4Var.f26892a = frameLayout;
        qr4Var.f = (SeekBar) this.mContainer.findViewById(R.id.highlight_video_controller_seekBar);
        return qr4Var;
    }

    private void initRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446c68de", new Object[]{this});
            return;
        }
        z6m h = dxa.b(this.mFrameContext).h();
        this.playerControllerBean = h;
        if (h != null && h.b != null) {
            initBottomBar(initPlayerController());
        }
    }

    public static /* synthetic */ Object ipc$super(HighlightBottomFrame highlightBottomFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/movehighlight/dx/widget/bottomGroup/HighlightBottomFrame");
        }
    }

    public qr4 getControllerHolder(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qr4) ipChange.ipc$dispatch("ea8e4205", new Object[]{this, frameLayout});
        }
        if (frameLayout == null) {
            return null;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R.layout.taolive_replay_progress_bar_preview_update, frameLayout);
        qr4 qr4Var = new qr4();
        qr4Var.f26892a = viewGroup.findViewById(R.id.taolive_video_bar_frame_layout);
        qr4Var.d = (TextView) viewGroup.findViewById(R.id.video_controller_total_time);
        qr4Var.e = (TextView) viewGroup.findViewById(R.id.video_controller_current_time);
        qr4Var.f = (SeekBar) viewGroup.findViewById(R.id.video_controller_seekBar);
        return qr4Var;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_highlight_dx_bottom_group;
    }

    public View initPlayerController() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("98348fd6", new Object[]{this});
        }
        PlayerController2 g = this.playerControllerBean.b.g();
        View view = this.mContainer;
        if (view == null || g == null || (frameLayout = (FrameLayout) view.findViewById(R.id.highlight_video_controller_layout)) == null) {
            return null;
        }
        if (uwa.y()) {
            frameLayout.setVisibility(8);
            if (!(this.mFrameContext instanceof cdr) || this.mContainer.getRootView() == null || (frameLayout = (FrameLayout) this.mContainer.getRootView().findViewById(R.id.taolive_highlight_playcontroller_layer)) == null) {
                return null;
            }
            g.setUpdateControllerHolder((cdr) this.mFrameContext, getControllerHolder(frameLayout), false, false);
        } else {
            frameLayout.setVisibility(0);
            qr4 initHighlightDxControllerHolder = initHighlightDxControllerHolder(frameLayout);
            if (initHighlightDxControllerHolder == null) {
                return null;
            }
            g.setControllerHolder(initHighlightDxControllerHolder);
        }
        return frameLayout;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        initRootView();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
        } else {
            super.onViewCreated(view);
        }
    }
}
