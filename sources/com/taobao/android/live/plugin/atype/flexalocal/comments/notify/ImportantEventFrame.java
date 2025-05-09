package com.taobao.android.live.plugin.atype.flexalocal.comments.notify;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.cpr;
import tb.e9m;
import tb.ffa;
import tb.fse;
import tb.nh4;
import tb.oec;
import tb.q0h;
import tb.t2o;
import tb.t54;
import tb.ux9;
import tb.vc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ImportantEventFrame extends BaseFrame implements cpr.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ImportantEventFrame";
    private FrameLayout mDxRootView;
    private final boolean mEnableImportantHighPriority = true;
    private final t54 mFrameContext;
    private ffa mGoodRecommendManager;
    private oec mIImportantEvent;
    private FrameLayout mRootView;

    static {
        t2o.a(295698723);
        t2o.a(806356196);
    }

    public ImportantEventFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
        this.mFrameContext = (t54) ux9Var;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mIImportantEvent = new fse(this.mContext, this.mFrameContext, this.mRootView, this.mDxRootView, this.mEnableImportantHighPriority);
        }
    }

    public static /* synthetic */ Object ipc$super(ImportantEventFrame importantEventFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/ImportantEventFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean asyncRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514e8f6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-important-event";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_room_important_event_notify_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        oec oecVar = this.mIImportantEvent;
        if (oecVar != null) {
            ((fse) oecVar).n();
        }
        ffa ffaVar = this.mGoodRecommendManager;
        if (ffaVar != null) {
            ffaVar.d();
            this.mGoodRecommendManager = null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        VideoInfo.AccountTag accountTag;
        VideoInfo videoInfo3;
        VideoInfo.AdmireInfo admireInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (nh4.a0() && !vc.h(this.mContext) && isLandscape()) {
            return;
        }
        if (!nh4.Z() || tBLiveDataModel == null || (videoInfo3 = tBLiveDataModel.mVideoInfo) == null || (admireInfo = videoInfo3.admireInfo) == null || admireInfo.contributionEnabled) {
            ((fse) this.mIImportantEvent).o();
            if (this.mGoodRecommendManager == null) {
                this.mGoodRecommendManager = new ffa(this.mFrameContext);
            }
            this.mGoodRecommendManager.h(tBLiveDataModel);
            if (!(tBLiveDataModel == null || (videoInfo2 = tBLiveDataModel.mVideoInfo) == null || (accountTag = videoInfo2.accountTag) == null)) {
                ((fse) this.mIImportantEvent).s(accountTag);
                q0h.b(TAG, "updateAccountTagData");
            }
            if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null)) {
                ((fse) this.mIImportantEvent).t(videoInfo.importantEventList);
                q0h.b(TAG, "updateImportantData");
            }
            if (this.mEnableImportantHighPriority) {
                ((fse) this.mIImportantEvent).r();
            }
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ffa ffaVar = this.mGoodRecommendManager;
        if (ffaVar != null) {
            ffaVar.c();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ffa ffaVar = this.mGoodRecommendManager;
        if (ffaVar != null) {
            ffaVar.f();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mRootView = (FrameLayout) view;
        this.mDxRootView = (FrameLayout) view.findViewById(R.id.fl_important_dx_root);
        init();
        FlexaLiveX.w("ImportantEventFrame: class: " + getClass().getName() + ", pluginEnv: " + e9m.b());
    }
}
