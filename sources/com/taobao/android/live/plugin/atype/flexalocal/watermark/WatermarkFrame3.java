package com.taobao.android.live.plugin.atype.flexalocal.watermark;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.czd;
import tb.giv;
import tb.iw0;
import tb.liv;
import tb.rbt;
import tb.t2o;
import tb.ty;
import tb.u3t;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WatermarkFrame3 extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView numberText;

    static {
        t2o.a(295700144);
    }

    public WatermarkFrame3(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    private void adjustLayoutParams(TBLiveDataModel tBLiveDataModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee732f3", new Object[]{this, tBLiveDataModel, view});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!isOfficialLive(tBLiveDataModel) || this.mLandscape) {
            marginLayoutParams.topMargin = getTopMargin();
        } else {
            marginLayoutParams.topMargin = iw0.a(this.mContext, 3.0f);
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private int getTopMargin() {
        ATaoLiveOpenEntity A;
        czd czdVar;
        ty tyVar;
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3710f6a7", new Object[]{this})).intValue();
        }
        int a2 = iw0.a(this.mContext, 32.0f);
        if (this.mLandscape) {
            a2 = iw0.a(this.mContext, 30.0f);
        } else if (giv.c().b()) {
            a2 = iw0.a(this.mContext, 26.0f);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || !(((rbt) czdVar).b() instanceof ty) || (tyVar = (ty) ((rbt) A.uiCompontent).b()) == null || (d = tyVar.d()) < 0) {
            return a2;
        }
        return d;
    }

    public static /* synthetic */ Object ipc$super(WatermarkFrame3 watermarkFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/watermark/WatermarkFrame3");
        }
    }

    public static boolean isDiantaoOfficial(VideoInfo videoInfo) {
        VideoInfo.DiantaoDisplayInfo diantaoDisplayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d03d1859", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (diantaoDisplayInfo = videoInfo.displayInfo) == null || diantaoDisplayInfo.diantaoRoomType != 1) {
            return false;
        }
        return true;
    }

    private boolean isOfficialLive(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2e1e945", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        if (isShowTaoLiveBanner(tBLiveDataModel) || isShowDiantaoOfficialBanner(tBLiveDataModel.mVideoInfo)) {
            return true;
        }
        return false;
    }

    public static boolean isShowDiantaoOfficialBanner(VideoInfo videoInfo) {
        VideoInfo.DiantaoOfficialAtmosphereInfo diantaoOfficialAtmosphereInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b5ac76a", new Object[]{videoInfo})).booleanValue();
        }
        if (!isDiantaoOfficial(videoInfo) || (diantaoOfficialAtmosphereInfo = videoInfo.displayInfo.diantaoOfficialAtmosphereInfo) == null || TextUtils.isEmpty(diantaoOfficialAtmosphereInfo.taoLiveIcon)) {
            return false;
        }
        return true;
    }

    private boolean isShowTaoLiveBanner(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        VideoInfo.TaoLiveAtmosphereInfo taoLiveAtmosphereInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a46e0c77", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || !liv.j(videoInfo) || (taoLiveAtmosphereInfo = videoInfo.taoLiveAtmosphereInfo) == null || TextUtils.isEmpty(taoLiveAtmosphereInfo.taoLiveIcon)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-watermark";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_room_watermark_layout2_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        adjustLayoutParams(tBLiveDataModel, this.mContainer);
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo != null) {
            this.numberText.setText(u3t.INSTANCE.a(videoInfo.roomNum));
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
        this.numberText = (TextView) view.findViewById(R.id.taolive_room_watermark_text);
        ((TUrlImageView) view.findViewById(R.id.taolive_room_icon_watermark)).setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01RrmPTP1p8JxK7Xd3V_!!6000000005315-2-tps-78-30.png");
    }
}
