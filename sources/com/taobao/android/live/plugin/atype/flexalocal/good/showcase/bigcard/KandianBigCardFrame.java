package com.taobao.android.live.plugin.atype.flexalocal.good.showcase.bigcard;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.hha;
import tb.s1g;
import tb.t2o;
import tb.ux9;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class KandianBigCardFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "KandianBigCardFrame";
    private s1g mBigCard;
    private LiveItem mLiveItem;

    static {
        t2o.a(295699127);
        t2o.a(806355156);
    }

    public KandianBigCardFrame(Context context, ux9 ux9Var, LiveItem liveItem, FrameLayout frameLayout) {
        super(context, ux9Var);
        this.mContainer = frameLayout;
        this.mLiveItem = liveItem;
    }

    public static /* synthetic */ Object ipc$super(KandianBigCardFrame kandianBigCardFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/bigcard/KandianBigCardFrame");
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-showcase-kandian-bigcard";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_goods_showcase_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            super.hide();
        }
    }

    public void init(LiveItem liveItem) {
        s1g s1gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cce372", new Object[]{this, liveItem});
        } else if (liveItem == null || (s1gVar = this.mBigCard) == null) {
            hha.b(TAG, "initKandianBigCard | error, mBigCard=" + this.mBigCard);
        } else {
            s1gVar.f(liveItem);
        }
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
        s1g s1gVar = this.mBigCard;
        if (s1gVar != null) {
            s1gVar.b();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && (this.mFrameContext.k() instanceof xea)) {
            hha.b(TAG, "onDataReceived | newShowcase. this=" + this);
            this.mBigCard = new s1g((FrameLayout) this.mContainer, tBLiveDataModel.mVideoInfo, (xea) this.mFrameContext.k());
            init(this.mLiveItem);
        }
    }
}
