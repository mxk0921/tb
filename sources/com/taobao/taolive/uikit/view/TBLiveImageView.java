package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.cpb;
import tb.cvd;
import tb.enr;
import tb.fz0;
import tb.r4d;
import tb.t2o;
import tb.viv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveImageView extends TUrlImageView implements cpb, cvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private cvd mCallback;
    private String mPlayUrl;
    private boolean mPlayVideo;
    private HashMap<String, Object> mPlayerData;
    private JSONObject mPlayerDataJSON;
    private boolean mIsLiveVideo = true;
    private boolean mIsPlaying = false;
    private boolean mVideoLoop = false;
    private int mPlayDuration = 10;
    private int mTopLeftRadius = 0;
    private int mTopRightRadius = 0;
    private int mBottomLeftRadius = 0;
    private int mBottomRightRadius = 0;
    private int mPlayNetWork = 0;

    static {
        t2o.a(779093699);
        t2o.a(806356529);
        t2o.a(806356532);
    }

    public TBLiveImageView(Context context) {
        super(context);
        viv.a("TBLiveImageView");
    }

    public static /* synthetic */ Object ipc$super(TBLiveImageView tBLiveImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode == 828227453) {
            super.pause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/view/TBLiveImageView");
        }
    }

    @Override // tb.cpb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mIsPlaying) {
            stopVideo();
        }
    }

    public int getPlayNetWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("741421be", new Object[]{this})).intValue();
        }
        return this.mPlayNetWork;
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue();
        }
        return this.mPlayVideo;
    }

    @Override // tb.cvd
    public void onVideoRequestAccept() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
            return;
        }
        r4d h = enr.g(getContext()).h();
        if (!(h == null || h.getView() == null)) {
            ViewGroup viewGroup = (ViewGroup) h.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(h.getView());
            }
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
                layoutParams.setMargins(getLeft(), getTop(), 0, 0);
            } else {
                layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
            }
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null) {
                try {
                    int indexOfChild = ((ViewGroup) getParent()).indexOfChild(this);
                    h.getView().setAlpha(0.0f);
                    viewGroup2.addView(h.getView(), Math.max(0, indexOfChild - 1), layoutParams);
                } catch (Exception unused) {
                }
            }
        }
        cvd cvdVar = this.mCallback;
        if (cvdVar != null) {
            cvdVar.onVideoRequestAccept();
        }
    }

    @Override // tb.cvd
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        toString();
        this.mIsPlaying = true;
        fz0.a(this, 300L);
        r4d h = enr.g(getContext()).h();
        if (!(h == null || h.getView() == null)) {
            h.getView().setAlpha(1.0f);
        }
        cvd cvdVar = this.mCallback;
        if (cvdVar != null) {
            cvdVar.onVideoStart();
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
        toString();
        if (this.mIsPlaying) {
            fz0.b(this, 300L);
        }
        this.mIsPlaying = false;
        r4d h = enr.g(getContext()).h();
        if (!(h == null || h.getView() == null || (viewGroup = (ViewGroup) h.getView().getParent()) == null)) {
            viewGroup.removeView(h.getView());
        }
        cvd cvdVar = this.mCallback;
        if (cvdVar != null) {
            cvdVar.onVideoStop();
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, tb.cpb
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        super.pause();
        if (this.mIsPlaying) {
            stopVideo();
        }
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

    public void setPlayNetWork(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26d1fa4", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayNetWork = i;
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
        } else {
            enr.g(getContext()).n();
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

    public TBLiveImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viv.a("TBLiveImageView");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean playVideoIfNecessary(tb.cvd r20, java.lang.String r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.uikit.view.TBLiveImageView.playVideoIfNecessary(tb.cvd, java.lang.String, int, boolean):boolean");
    }

    public TBLiveImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viv.a("TBLiveImageView");
    }
}
