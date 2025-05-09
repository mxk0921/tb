package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveMediaCardView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import tb.bjr;
import tb.cpb;
import tb.qlr;
import tb.rlr;
import tb.t2o;
import tb.tlc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveOpenCardView extends RelativeLayout implements tlc, cpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mAtmosphereBenefitData;
    private JSONObject mChatData;
    private Object mPageID;
    private RelativeLayout mRootView;
    private TBLOpenPlatformView mTBLOpenPlatformView;
    private TBLiveAtmosphereView mTbLiveAtmosphereView;
    private TBLiveMessageView mTbLiveMessageView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements TBLiveMediaCardView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TBLiveOpenCardView tBLiveOpenCardView) {
        }

        @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLiveMediaCardView.d
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(310378892);
        t2o.a(806356525);
        t2o.a(806356529);
    }

    public TBLiveOpenCardView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mRootView = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        TBLOpenPlatformView tBLOpenPlatformView = new TBLOpenPlatformView(context);
        this.mTBLOpenPlatformView = tBLOpenPlatformView;
        tBLOpenPlatformView.setLayoutParams(layoutParams);
        this.mRootView.addView(this.mTBLOpenPlatformView);
        addView(this.mRootView);
    }

    public static /* synthetic */ Object ipc$super(TBLiveOpenCardView tBLiveOpenCardView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/view/TBLiveOpenCardView");
    }

    public boolean addFeature(AbsFeature<? super ImageView> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.addFeature(absFeature);
        }
        return false;
    }

    @Override // tb.tlc, tb.cpb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
        }
        TBLiveAtmosphereView tBLiveAtmosphereView = this.mTbLiveAtmosphereView;
        if (tBLiveAtmosphereView != null) {
            tBLiveAtmosphereView.setVisibility(8);
            this.mTbLiveAtmosphereView.destroy();
            RelativeLayout relativeLayout = this.mRootView;
            if (relativeLayout != null) {
                relativeLayout.removeView(this.mTbLiveAtmosphereView);
            }
            this.mTbLiveAtmosphereView = null;
        }
        TBLiveMessageView tBLiveMessageView = this.mTbLiveMessageView;
        if (tBLiveMessageView != null) {
            tBLiveMessageView.setVisibility(8);
            this.mTbLiveMessageView.destroy();
            try {
                bjr.d().e(this.mPageID, this.mTbLiveMessageView);
            } catch (Exception unused) {
            }
            RelativeLayout relativeLayout2 = this.mRootView;
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(this.mTbLiveMessageView);
            }
            this.mTbLiveMessageView = null;
        }
    }

    public AbsFeature<? super ImageView> findFeature(Class<? extends AbsFeature<? super ImageView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.findFeature(cls);
        }
        return null;
    }

    public TUrlImageView getCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e99e40f4", new Object[]{this});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.getCover();
        }
        return null;
    }

    public Bitmap getCurrentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.getCurrentFrame();
        }
        return null;
    }

    public ViewGroup getPlayerRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bcf1150", new Object[]{this});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.getPlayerRootView();
        }
        return null;
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.isMuted();
        }
        return false;
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.isPlayVideo();
        }
        return false;
    }

    @Override // tb.tlc
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            return tBLOpenPlatformView.isPlaying();
        }
        return false;
    }

    @Override // tb.cpb
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // tb.tlc
    public boolean playVideo(qlr qlrVar, rlr rlrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28601df1", new Object[]{this, qlrVar, rlrVar})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return true;
        }
        tBLOpenPlatformView.setTBLiveOpenCardViewCallback(qlrVar);
        this.mTBLOpenPlatformView.setPlayerCallback(rlrVar);
        boolean playVideo = this.mTBLOpenPlatformView.playVideo();
        if (this.mChatData != null && playVideo) {
            RelativeLayout relativeLayout = this.mRootView;
            if (relativeLayout != null && relativeLayout.getChildCount() > 0) {
                for (int i = 0; i < this.mRootView.getChildCount(); i++) {
                    if (this.mRootView.getChildAt(i) instanceof TBLiveMessageView) {
                        ((TBLiveMessageView) this.mRootView.getChildAt(i)).destroy();
                        this.mRootView.removeViewAt(i);
                    }
                }
            }
            TBLiveMessageView tBLiveMessageView = new TBLiveMessageView(getContext());
            this.mTbLiveMessageView = tBLiveMessageView;
            tBLiveMessageView.setData(this.mChatData);
            this.mRootView.addView(this.mTbLiveMessageView);
            bjr.d().a(this.mPageID, this.mTbLiveMessageView);
        }
        return playVideo;
    }

    @Override // tb.cpb
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    @Override // tb.tlc
    public void setAnimateTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd97b50", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setAnimateTime(i);
        }
    }

    public void setAtmosphereBenefitData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a3b800", new Object[]{this, obj});
        } else if (obj instanceof JSONObject) {
            this.mAtmosphereBenefitData = (JSONObject) obj;
        } else {
            this.mAtmosphereBenefitData = null;
        }
    }

    public void setChatData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace37025", new Object[]{this, jSONObject});
        } else {
            this.mChatData = jSONObject;
        }
    }

    @Override // tb.tlc
    public void setCloseSkipPlaySwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddf5290", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setCloseSkipPlaySwitch(z);
        }
    }

    public void setColorFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca662803", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setColorFilter(i);
        }
    }

    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setCornerRadius(i, i2, i3, i4);
        }
    }

    public void setCoverImageSuccessCallBack(TBLiveMediaCardView.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24170546", new Object[]{this, dVar});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null && dVar != null) {
            tBLOpenPlatformView.setCoverImageSuccessCallBack(dVar);
        }
    }

    public void setEnableConsumePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9960b5", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setEnableConsumePlayer(z);
        }
    }

    @Override // tb.tlc
    public void setEnableCoverFade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be301c1f", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setEnableCoverFade(z);
        }
    }

    public void setEnableKeepLastFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b948960", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setEnableKeepLastFrame(z);
        }
    }

    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setImageResource(i);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setImageUrl(str);
        }
    }

    @Deprecated
    public void setLiveVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187caa0", new Object[]{this, new Boolean(z)});
        }
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setMuted(z);
        }
    }

    public void setNeedShowNodeWhenLiveStart(DinamicXEngine dinamicXEngine, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a511bc", new Object[]{this, dinamicXEngine, dXWidgetNode, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setNeedShowNodeWhenLiveStart(dinamicXEngine, dXWidgetNode, str);
        }
    }

    @Override // tb.tlc
    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            this.mPageID = obj;
            tBLOpenPlatformView.setPageId(obj);
        }
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setPlaceHoldImageResId(i);
        }
    }

    @Override // tb.tlc
    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setPlayDuration(i);
        }
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setPlayUrl(str);
        }
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setPlayVideo(z);
        }
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.getJSONObject("queryParams") == null && jSONObject.getJSONObject("queryParam") != null) {
            jSONObject.put("queryParams", (Object) jSONObject.getJSONObject("queryParam"));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("playParams", (Object) jSONObject);
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setData(jSONObject2);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setScaleType(scaleType);
        }
    }

    @Override // tb.tlc
    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setSubBusinessType(str);
        }
    }

    @Override // tb.tlc
    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setVideoLoop(z);
        }
    }

    public void setViewInfoLifeCycleSyncOpenCard(DinamicXEngine dinamicXEngine, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be9097", new Object[]{this, dinamicXEngine, dXWidgetNode, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setViewInfoLifeCycleSyncOpenCard(dinamicXEngine, dXWidgetNode, str);
        }
    }

    public void showAtmosphereView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df515cb", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout != null && relativeLayout.getChildCount() > 0) {
            for (int i = 0; i < this.mRootView.getChildCount(); i++) {
                if (this.mRootView.getChildAt(i) instanceof TBLiveAtmosphereView) {
                    ((TBLiveAtmosphereView) this.mRootView.getChildAt(i)).destroy();
                    this.mRootView.removeViewAt(i);
                }
            }
        }
        if (this.mAtmosphereBenefitData != null && isPlaying()) {
            TBLiveAtmosphereView tBLiveAtmosphereView = new TBLiveAtmosphereView(getContext());
            this.mTbLiveAtmosphereView = tBLiveAtmosphereView;
            tBLiveAtmosphereView.setRootView(this.mRootView);
            this.mTbLiveAtmosphereView.setData(this.mAtmosphereBenefitData);
            this.mRootView.addView(this.mTbLiveAtmosphereView);
        }
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.stopVideo();
        }
    }

    public TBLiveOpenCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public void setImageUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960810d", new Object[]{this, str, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setImageUrl(str);
            if (z) {
                this.mTBLOpenPlatformView.setCoverImageSuccessCallBack(new a(this));
            }
        }
    }

    public TBLiveOpenCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
