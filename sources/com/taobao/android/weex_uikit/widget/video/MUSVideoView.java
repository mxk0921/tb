package com.taobao.android.weex_uikit.widget.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import tb.paw;
import tb.spc;
import tb.t2o;
import tb.tpc;
import tb.upc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSVideoView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isLoop;
    private boolean isMute;
    private tpc mCallback;
    private upc mCreator;
    private int mHeight;
    private boolean mPlayed;
    private View mPosterContainer;
    private int mWidth;
    private UIImageDrawable posterDrawable;
    private boolean valid;
    private spc videoAdapter;
    private UINode videoNode;
    private boolean hidePoster = false;
    private boolean posterContained = false;

    static {
        t2o.a(986710282);
    }

    public MUSVideoView(Context context) {
        super(context);
    }

    private void fireEvent(UINode uINode, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c3ee9", new Object[]{this, uINode, str, jSONObject});
        } else if (uINode.getInstance() != null && !uINode.getInstance().isDestroyed() && !TextUtils.isEmpty(str)) {
            uINode.getInstance().fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(MUSVideoView mUSVideoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1944670684:
                super.invalidateDrawable((Drawable) objArr[0]);
                return null;
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1289754646:
                super.setPadding(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/video/MUSVideoView");
        }
    }

    private void loadPoster(MUSDKInstance mUSDKInstance, String str, String str2, int i, int i2, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c374c9", new Object[]{this, mUSDKInstance, str, str2, new Integer(i), new Integer(i2), rect});
        } else if (TextUtils.isEmpty(str)) {
            releasePoster(mUSDKInstance);
        } else {
            UIImageDrawable uIImageDrawable = new UIImageDrawable();
            this.posterDrawable = uIImageDrawable;
            uIImageDrawable.n(rect);
            this.posterDrawable.setBounds(0, 0, i, i2);
            this.posterDrawable.setCallback(this);
            this.posterDrawable.y(null, mUSDKInstance, str, "", str2, i, i2, MUSImageQuality.AUTO);
        }
    }

    private void releasePoster(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433ec9b", new Object[]{this, mUSDKInstance});
        } else if (this.posterDrawable != null) {
            invalidate();
            View view = this.mPosterContainer;
            if (view != null) {
                view.invalidate();
            }
            this.posterDrawable.z(mUSDKInstance);
            this.posterDrawable.setCallback(null);
            this.posterDrawable = null;
            this.posterContained = false;
            this.mPosterContainer = null;
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.videoAdapter != null && this.valid) {
            this.mPlayed = false;
            this.valid = false;
            this.mPosterContainer = null;
            this.posterContained = false;
            removeAllViews();
            this.videoAdapter.e();
            this.videoAdapter.c(null);
            this.videoAdapter = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable != null && !this.hidePoster && !this.posterContained) {
            uIImageDrawable.draw(canvas);
        }
    }

    public JSONObject getFov() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24f3d1be", new Object[]{this});
        }
        spc spcVar = this.videoAdapter;
        if (spcVar == null) {
            return null;
        }
        return spcVar.d();
    }

    public void hidePoster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b45a236", new Object[]{this});
        } else if (!this.hidePoster) {
            this.hidePoster = true;
            invalidate();
            View view = this.mPosterContainer;
            if (view != null) {
                view.setVisibility(4);
                this.mPosterContainer.invalidate();
            }
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
            return;
        }
        super.invalidateDrawable(drawable);
        View view = this.mPosterContainer;
        if (view != null) {
            view.invalidate();
        }
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        spc spcVar = this.videoAdapter;
        if (spcVar != null) {
            this.isMute = z;
            spcVar.mute(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getChildCount() != 0) {
            getChildAt(0).layout(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (getChildCount() != 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    public void onPlayed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4331dd19", new Object[]{this});
        } else {
            this.mPlayed = true;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable != null) {
            uIImageDrawable.setBounds(0, 0, i, i2);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        spc spcVar = this.videoAdapter;
        if (spcVar != null) {
            spcVar.pause();
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        tryLoadVideo();
        spc spcVar = this.videoAdapter;
        if (spcVar != null) {
            this.mPlayed = true;
            spcVar.play();
        }
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        spc spcVar = this.videoAdapter;
        if (spcVar != null) {
            spcVar.seekTo(i);
        }
    }

    public void setFov(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97af191e", new Object[]{this, jSONObject});
            return;
        }
        spc spcVar = this.videoAdapter;
        if (spcVar != null && jSONObject != null) {
            spcVar.f(jSONObject);
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.setPadding(i, i2, i3, i4);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable != null) {
            uIImageDrawable.n(new Rect(i, i2, i3, i4));
        }
    }

    public void showPoster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de00f231", new Object[]{this});
        } else if (this.hidePoster) {
            this.hidePoster = false;
            invalidate();
            View view = this.mPosterContainer;
            if (view != null) {
                view.setVisibility(0);
                this.mPosterContainer.invalidate();
            }
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.videoAdapter != null) {
            if (this.mPlayed) {
                reset();
                tryLoadVideo();
            }
            showPoster();
        }
    }

    public void toggleFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2dab56", new Object[]{this});
            return;
        }
        spc spcVar = this.videoAdapter;
        if (spcVar != null) {
            spcVar.a();
        }
    }

    public void unmount(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637732f", new Object[]{this, mUSDKInstance});
            return;
        }
        this.mWidth = 0;
        this.mHeight = 0;
        this.mCreator = null;
        this.mCallback = null;
        this.videoNode = null;
        this.mPosterContainer = null;
        reset();
        releasePoster(mUSDKInstance);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (drawable == this.posterDrawable) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    private void tryLoadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb9b741", new Object[]{this});
            return;
        }
        upc upcVar = this.mCreator;
        if (upcVar != null && !this.valid) {
            this.valid = true;
            addNewVideo(upcVar, this.mCallback, (String) this.videoNode.getAttribute("src"), this.isLoop, this.isMute, (String) this.videoNode.getAttribute("videoId"), this.mWidth, this.mHeight);
        }
    }

    private void addNewVideo(upc upcVar, tpc tpcVar, String str, boolean z, boolean z2, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5054d4b", new Object[]{this, upcVar, tpcVar, str, new Boolean(z), new Boolean(z2), str2, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.videoAdapter == null) {
            this.videoAdapter = upcVar.a(getContext());
        }
        this.videoAdapter.c(tpcVar);
        paw pawVar = new paw((String) this.videoNode.getAttribute("bizFrom"), (String) this.videoNode.getAttribute("contentId"), (JSONObject) this.videoNode.getAttribute("utParams"), (String) this.videoNode.getAttribute("objectFit"), (String) this.videoNode.getAttribute(c.ATTR_PANO_TYPE));
        pawVar.u((String) this.videoNode.getAttribute("videoSource"));
        pawVar.p((Boolean) this.videoNode.getAttribute("controls"));
        pawVar.o((Boolean) this.videoNode.getAttribute("showCenterPlayBtn"));
        pawVar.q((Boolean) this.videoNode.getAttribute("showFullscreenBtn"));
        pawVar.s((Boolean) this.videoNode.getAttribute("showPlayBtn"));
        pawVar.r((Boolean) this.videoNode.getAttribute("showMuteBtn"));
        pawVar.t((Boolean) this.videoNode.getAttribute(c.ATTR_SHOW_PLAY_RATE_BTN));
        pawVar.m((Boolean) this.videoNode.getAttribute(c.ATTR_ENABLE_PAN));
        pawVar.n((String) this.videoNode.getAttribute("playScenes"));
        this.videoAdapter.b(str, z, z2, str2, pawVar, i, i2);
        View view = this.videoAdapter.getView();
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            View findViewWithTag = view.findViewWithTag(Boolean.TRUE);
            this.mPosterContainer = findViewWithTag;
            if (findViewWithTag != null) {
                findViewWithTag.setBackgroundDrawable(this.posterDrawable);
                this.posterContained = true;
                return;
            }
            return;
        }
        throw new RuntimeException("IMUSVideoAdapter mustn't return null");
    }

    public void mount(UINode uINode, MUSDKInstance mUSDKInstance, upc upcVar, tpc tpcVar, int i, int i2, Rect rect, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d13cd", new Object[]{this, uINode, mUSDKInstance, upcVar, tpcVar, new Integer(i), new Integer(i2), rect, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.isLoop = z;
        this.isMute = z2;
        this.videoNode = uINode;
        reset();
        this.mPlayed = false;
        this.mCreator = upcVar;
        this.mWidth = i;
        this.mHeight = i2;
        this.mCallback = tpcVar;
        loadPoster(mUSDKInstance, (String) uINode.getAttribute("poster"), (String) uINode.getAttribute("objectFit"), i, i2, rect);
        this.valid = false;
        this.hidePoster = false;
        this.posterContained = false;
        tryLoadVideo();
    }
}
