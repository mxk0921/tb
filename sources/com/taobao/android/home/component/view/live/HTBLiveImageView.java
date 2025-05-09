package com.taobao.android.home.component.view.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import tb.arq;
import tb.bqa;
import tb.cpb;
import tb.cqa;
import tb.cvd;
import tb.f4b;
import tb.fnr;
import tb.fz0;
import tb.iqa;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HTBLiveImageView extends TUrlImageView implements cpb, cvd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HTBLiveImageView";
    private Context activityContext;
    private cvd mCallback;
    private String mPlayUrl;
    private boolean mPlayVideo;
    private HashMap<String, Object> mPlayerData;
    private JSONObject mPlayerDataJSON;
    private boolean mIsLiveVideo = true;
    private boolean mIsPlaying = false;
    private boolean mIsVideoRequestAccept = false;
    private boolean mVideoLoop = false;
    private int mPlayDuration = f4b.i("livePlayDuration", 10000);
    private int mTopLeftRadius = 0;
    private int mTopRightRadius = 0;
    private int mBottomLeftRadius = 0;
    private int mBottomRightRadius = 0;

    static {
        t2o.a(473956429);
        t2o.a(806356529);
        t2o.a(806356532);
    }

    public HTBLiveImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(HTBLiveImageView hTBLiveImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode == 828227453) {
            super.pause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/home/component/view/live/HTBLiveImageView");
        }
    }

    private void startCoverViewShowAnimation(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692da93d", new Object[]{this, hTBLiveImageView});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
        alphaAnimation.setDuration(10L);
        alphaAnimation.setFillAfter(true);
        hTBLiveImageView.startAnimation(alphaAnimation);
    }

    @Override // tb.cpb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mIsPlaying || this.mIsVideoRequestAccept) {
            stopVideo();
        }
    }

    public Context getActivityContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2fdd88e9", new Object[]{this});
        }
        if (getContext() instanceof Activity) {
            return getContext();
        }
        Context context = this.activityContext;
        if (context instanceof Activity) {
            return context;
        }
        return null;
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue();
        }
        return this.mPlayVideo;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, tb.cpb
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        super.pause();
        if (this.mIsPlaying || this.mIsVideoRequestAccept) {
            stopVideo();
        }
    }

    public boolean playVideoIfNecessary(cvd cvdVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c4d6123", new Object[]{this, cvdVar, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (!this.mPlayVideo) {
            return false;
        }
        this.mCallback = cvdVar;
        fnr fnrVar = new fnr(this, this.mPlayUrl, parseMediaLiveInfo());
        if (!this.mIsLiveVideo) {
            fnrVar.j = this.mVideoLoop;
            fnrVar.e = 2;
        }
        fnrVar.g = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        fnrVar.d = f4b.h("liveVideoBusinessType", "homepageLiveCard");
        fnrVar.f = i;
        Rect rect = new Rect();
        fnrVar.k = rect;
        fnrVar.h = str;
        fnrVar.i = z;
        fnrVar.c = this.mPlayDuration;
        getGlobalVisibleRect(rect);
        if (getActivityContext() == null) {
            return false;
        }
        return iqa.f(getActivityContext()).k(fnrVar);
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, tb.cpb
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            super.resume();
        }
    }

    public void setActivityContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebc6b03", new Object[]{this, context});
        } else {
            this.activityContext = context;
        }
    }

    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mTopLeftRadius = i;
        this.mTopRightRadius = i2;
        this.mBottomLeftRadius = i3;
        this.mBottomRightRadius = i4;
    }

    public void setLiveVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187caa0", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLiveVideo = z;
        }
    }

    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayDuration = i;
        }
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
        } else {
            this.mPlayUrl = str;
        }
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
        } else {
            this.mPlayVideo = z;
        }
    }

    public void setPlayerData(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45af8aff", new Object[]{this, hashMap});
        } else {
            this.mPlayerData = hashMap;
        }
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoLoop = z;
        }
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else if (getActivityContext() != null) {
            iqa.f(getActivityContext()).n();
        }
    }

    @Override // tb.cvd
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onVideoStart invoke. class = " + this);
        if (getActivityContext() != null) {
            this.mIsPlaying = true;
            fz0.a(this, 300L);
            cqa g = iqa.f(getActivityContext()).g();
            if (!(g == null || g.b() == null)) {
                g.b().setAlpha(1.0f);
            }
            cvd cvdVar = this.mCallback;
            if (cvdVar != null) {
                cvdVar.onVideoStart();
            }
        }
    }

    @Override // tb.cvd
    public void onVideoStop() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onVideoStop invoke. class = " + this);
        if (getActivityContext() != null) {
            if (this.mIsPlaying) {
                startCoverViewShowAnimation(this);
            }
            this.mIsVideoRequestAccept = false;
            this.mIsPlaying = false;
            cqa g = iqa.f(getActivityContext()).g();
            if (!(g == null || g.b() == null || (viewGroup = (ViewGroup) g.b().getParent()) == null)) {
                viewGroup.removeView(g.b());
            }
            cvd cvdVar = this.mCallback;
            if (cvdVar != null) {
                cvdVar.onVideoStop();
            }
        }
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
        } else {
            this.mPlayerDataJSON = jSONObject;
        }
    }

    @Override // tb.cvd
    public void onVideoRequestAccept() {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
            return;
        }
        bqa.d(TAG, "onVideoRequestAccept invoke. class = " + this);
        if (getActivityContext() != null) {
            this.mIsVideoRequestAccept = true;
            cqa g = iqa.f(getActivityContext()).g();
            if (!(g == null || g.b() == null)) {
                ViewGroup viewGroup = (ViewGroup) g.b().getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(g.b());
                }
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                if ((layoutParams2 != null ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null) {
                    layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
                    layoutParams.setMargins(getLeft(), getTop(), 0, 0);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
                }
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    try {
                        int indexOfChild = ((ViewGroup) getParent()).indexOfChild(this);
                        g.b().setAlpha(0.0f);
                        viewGroup2.addView(g.b(), Math.max(0, indexOfChild - 1), layoutParams);
                    } catch (Exception e) {
                        e.printStackTrace();
                        bqa.b(TAG, "onVideoRequestAccept exception", e);
                    }
                }
            }
            cvd cvdVar = this.mCallback;
            if (cvdVar != null) {
                cvdVar.onVideoRequestAccept();
            }
        }
    }

    private MediaLiveInfo parseMediaLiveInfo() {
        MediaLiveInfo mediaLiveInfo;
        JSONObject jSONObject;
        HashMap<String, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("7549f5c5", new Object[]{this});
        }
        if (!this.mIsLiveVideo || (hashMap = this.mPlayerData) == null || hashMap.size() <= 0 || !this.mPlayerData.containsKey("queryParams")) {
            if (!this.mIsLiveVideo || (jSONObject = this.mPlayerDataJSON) == null || !jSONObject.containsKey("queryParams") || this.mPlayerDataJSON.getIntValue("roomStatus") != 1) {
                return null;
            }
            mediaLiveInfo = new MediaLiveInfo();
            JSONObject jSONObject2 = this.mPlayerDataJSON.getJSONObject("queryParams");
            if (jSONObject2 != null) {
                JSONArray jSONArray = jSONObject2.getJSONArray("liveUrlList");
                int size = jSONArray.size();
                mediaLiveInfo.h265 = jSONObject2.getBoolean("h265").booleanValue();
                mediaLiveInfo.mediaConfig = jSONObject2.getString("mediaConfig");
                mediaLiveInfo.rateAdapte = jSONObject2.getBoolean(yj4.PARAM_MEDIA_INFO_RATEADAPTE).booleanValue();
                mediaLiveInfo.liveUrlList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    QualityLiveItem qualityLiveItem = new QualityLiveItem();
                    qualityLiveItem.artpUrl = jSONObject3.getString(yj4.PARAM_MEDIA_INFO_ARTPURL);
                    qualityLiveItem.definition = jSONObject3.getString("definition");
                    qualityLiveItem.flvUrl = jSONObject3.getString(yj4.PARAM_MEDIA_INFO_FLVURL);
                    qualityLiveItem.h265Url = jSONObject3.getString(yj4.PARAM_MEDIA_INFO_H265URL);
                    qualityLiveItem.hlsUrl = jSONObject3.getString(yj4.PARAM_MEDIA_INFO_HLSURL);
                    qualityLiveItem.name = jSONObject3.getString("name");
                    qualityLiveItem.wholeH265FlvUrl = jSONObject3.getString(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl);
                    qualityLiveItem.bfrtcUrl = (String) jSONObject3.get(MediaConstant.BFRTC_URL_NAME);
                    qualityLiveItem.rtcLiveUrl = (String) jSONObject3.get(MediaConstant.RTCLIVE_URL_NAME);
                    mediaLiveInfo.liveUrlList.add(qualityLiveItem);
                }
            }
        } else if (arq.f((String) this.mPlayerData.get("roomStatus")) != 1) {
            return null;
        } else {
            mediaLiveInfo = new MediaLiveInfo();
            Object obj = this.mPlayerData.get("queryParams");
            if (obj instanceof HashMap) {
                HashMap hashMap2 = (HashMap) obj;
                ArrayList arrayList = (ArrayList) hashMap2.get("liveUrlList");
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    mediaLiveInfo.h265 = arq.c((String) hashMap2.get("h265"));
                    mediaLiveInfo.rateAdapte = arq.c((String) hashMap2.get(yj4.PARAM_MEDIA_INFO_RATEADAPTE));
                    mediaLiveInfo.mediaConfig = (String) hashMap2.get("mediaConfig");
                    mediaLiveInfo.liveUrlList = new ArrayList<>();
                    for (int i2 = 0; i2 < size2; i2++) {
                        HashMap hashMap3 = (HashMap) arrayList.get(i2);
                        QualityLiveItem qualityLiveItem2 = new QualityLiveItem();
                        qualityLiveItem2.artpUrl = (String) hashMap3.get(yj4.PARAM_MEDIA_INFO_ARTPURL);
                        qualityLiveItem2.definition = (String) hashMap3.get("definition");
                        qualityLiveItem2.flvUrl = (String) hashMap3.get(yj4.PARAM_MEDIA_INFO_FLVURL);
                        qualityLiveItem2.h265Url = (String) hashMap3.get(yj4.PARAM_MEDIA_INFO_H265URL);
                        qualityLiveItem2.hlsUrl = (String) hashMap3.get(yj4.PARAM_MEDIA_INFO_HLSURL);
                        qualityLiveItem2.name = (String) hashMap3.get("name");
                        qualityLiveItem2.wholeH265FlvUrl = (String) hashMap3.get(yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl);
                        qualityLiveItem2.bfrtcUrl = (String) hashMap3.get(MediaConstant.BFRTC_URL_NAME);
                        qualityLiveItem2.rtcLiveUrl = (String) hashMap3.get(MediaConstant.RTCLIVE_URL_NAME);
                        mediaLiveInfo.liveUrlList.add(qualityLiveItem2);
                    }
                }
            }
        }
        return mediaLiveInfo;
    }

    public HTBLiveImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HTBLiveImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
