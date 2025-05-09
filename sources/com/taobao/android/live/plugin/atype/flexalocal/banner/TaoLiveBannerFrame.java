package com.taobao.android.live.plugin.atype.flexalocal.banner;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.giv;
import tb.liv;
import tb.t2o;
import tb.ux9;
import tb.voj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveBannerFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AliUrlImageView imageView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoInfo.TaoLiveAtmosphereInfo taoLiveAtmosphereInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            VideoInfo videoInfo = TaoLiveBannerFrame.this.mLiveDataModel.mVideoInfo;
            if (videoInfo != null && (taoLiveAtmosphereInfo = videoInfo.taoLiveAtmosphereInfo) != null && !TextUtils.isEmpty(taoLiveAtmosphereInfo.taoLiveIconJumpUrl)) {
                voj.a(TaoLiveBannerFrame.this.mContext, videoInfo.taoLiveAtmosphereInfo.taoLiveIconJumpUrl);
                if (giv.f() != null) {
                    giv.f().n(TaoLiveBannerFrame.this.mFrameContext, "taolive_top", new String[0]);
                }
            }
        }
    }

    static {
        t2o.a(295698435);
    }

    public TaoLiveBannerFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    private String getBannerUrl(TBLiveDataModel tBLiveDataModel) {
        VideoInfo.TaoLiveAtmosphereInfo taoLiveAtmosphereInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3be67ad3", new Object[]{this, tBLiveDataModel});
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (liv.j(videoInfo) && (taoLiveAtmosphereInfo = videoInfo.taoLiveAtmosphereInfo) != null) {
            if (!TextUtils.isEmpty(taoLiveAtmosphereInfo.taoLiveIcon)) {
                return videoInfo.taoLiveAtmosphereInfo.taoLiveIcon;
            }
            if (!TextUtils.isEmpty(videoInfo.taoLiveAtmosphereInfo.taoLiveHideMenuPic)) {
                return videoInfo.taoLiveAtmosphereInfo.taoLiveHideMenuPic;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveBannerFrame taoLiveBannerFrame, String str, Object... objArr) {
        if (str.hashCode() == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/banner/TaoLiveBannerFrame");
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_taolive_banner_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        String bannerUrl = getBannerUrl(tBLiveDataModel);
        if (!TextUtils.isEmpty(bannerUrl)) {
            this.imageView.setVisibility(0);
            this.imageView.setImageUrl(bannerUrl);
            ViewGroup.LayoutParams layoutParams = this.imageView.getLayoutParams();
            layoutParams.height = liv.f(this.mContext);
            this.imageView.setLayoutParams(layoutParams);
            return;
        }
        this.imageView.setVisibility(8);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.taolive_banner);
        this.imageView = aliUrlImageView;
        aliUrlImageView.setOnClickListener(new a());
    }
}
