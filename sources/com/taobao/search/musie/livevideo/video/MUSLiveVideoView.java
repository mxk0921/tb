package com.taobao.search.musie.livevideo.video;

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
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.MediaType;
import tb.asc;
import tb.dwh;
import tb.hcj;
import tb.ipc;
import tb.r4p;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSLiveVideoView extends ViewGroup implements asc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "mus-live-video";
    public static final String TAG_NAME = "mus-live-video";
    private boolean hidePoster = false;
    private ipc mCallback;
    private int mHeight;
    private MediaPlayCenter mMPC;
    private boolean mPlayed;
    private int mWidth;
    private UIImageDrawable posterDrawable;
    private boolean valid;
    private MusLiveVideo videoNode;

    static {
        t2o.a(815792743);
        t2o.a(774897787);
    }

    public MUSLiveVideoView(Context context) {
        super(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r4.equals(tb.pg1.ATOM_EXT_fill) == false) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.taobao.mediaplay.player.MediaAspectRatio getResizeMode(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.search.musie.livevideo.video.MUSLiveVideoView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "441bb214"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            com.taobao.mediaplay.player.MediaAspectRatio r4 = (com.taobao.mediaplay.player.MediaAspectRatio) r4
            return r4
        L_0x0015:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x001e
            com.taobao.mediaplay.player.MediaAspectRatio r4 = com.taobao.mediaplay.player.MediaAspectRatio.DW_FIT_CENTER
            return r4
        L_0x001e:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case 3143043: goto L_0x0041;
                case 94852023: goto L_0x0036;
                case 951526612: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "contain"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r0 = 2
            goto L_0x004a
        L_0x0036:
            java.lang.String r0 = "cover"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r0 = 1
            goto L_0x004a
        L_0x0041:
            java.lang.String r1 = "fill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0053;
                case 2: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            com.taobao.mediaplay.player.MediaAspectRatio r4 = com.taobao.mediaplay.player.MediaAspectRatio.DW_FIT_CENTER
            return r4
        L_0x0050:
            com.taobao.mediaplay.player.MediaAspectRatio r4 = com.taobao.mediaplay.player.MediaAspectRatio.DW_FIT_CENTER
            return r4
        L_0x0053:
            com.taobao.mediaplay.player.MediaAspectRatio r4 = com.taobao.mediaplay.player.MediaAspectRatio.DW_CENTER_CROP
            return r4
        L_0x0056:
            com.taobao.mediaplay.player.MediaAspectRatio r4 = com.taobao.mediaplay.player.MediaAspectRatio.DW_FIT_X_Y
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.livevideo.video.MUSLiveVideoView.getResizeMode(java.lang.String):com.taobao.mediaplay.player.MediaAspectRatio");
    }

    public static /* synthetic */ Object ipc$super(MUSLiveVideoView mUSLiveVideoView, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/livevideo/video/MUSLiveVideoView");
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
            this.posterDrawable.z(mUSDKInstance);
            this.posterDrawable.setCallback(null);
            this.posterDrawable = null;
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.mMPC != null && this.valid) {
            this.mPlayed = false;
            this.valid = false;
            removeAllViews();
            this.mMPC.release();
            this.mMPC.destroy();
            this.mMPC = null;
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
        if (uIImageDrawable != null && !this.hidePoster) {
            uIImageDrawable.draw(canvas);
        }
    }

    public void hidePoster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b45a236", new Object[]{this});
        } else if (!this.hidePoster) {
            this.hidePoster = true;
            invalidate();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.mute(z);
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

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            return;
        }
        ipc ipcVar = this.mCallback;
        if (ipcVar != null) {
            ipcVar.onVideoFinish();
            showPoster();
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            return;
        }
        dwh.f("mus-live-video", "video error: code " + iMediaPlayer + ", detail: " + i2);
        ipc ipcVar = this.mCallback;
        if (ipcVar != null) {
            ipcVar.onVideoFail();
        }
        showPoster();
    }

    @Override // tb.asc
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // tb.asc
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        ipc ipcVar = this.mCallback;
        if (ipcVar != null) {
            ipcVar.onVideoStop();
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        ipc ipcVar = this.mCallback;
        if (ipcVar != null) {
            ipcVar.onVideoStart();
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        } else if (dwh.r()) {
            dwh.b("mus-live-video", "video prepared");
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ipc ipcVar = this.mCallback;
        if (ipcVar != null) {
            ipcVar.onVideoProgressChanged(i, i3);
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        ipc ipcVar = this.mCallback;
        if (ipcVar != null) {
            ipcVar.onVideoStart();
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
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.pause();
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        tryLoadVideo();
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter != null) {
            this.mPlayed = true;
            mediaPlayCenter.start();
        }
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.mMPC;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.seekTo(i * 1000);
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
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.mMPC != null) {
            if (this.mPlayed) {
                reset();
                tryLoadVideo();
            }
            showPoster();
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
        this.mCallback = null;
        this.videoNode = null;
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
        } else if (!this.valid) {
            this.valid = true;
            addNewVideo(this.mCallback, (String) this.videoNode.getAttribute("src"), this.videoNode.isLoop(), this.videoNode.isMuted(), (String) this.videoNode.getAttribute("videoId"), this.mWidth, this.mHeight);
        }
    }

    public void mount(MusLiveVideo musLiveVideo, MUSDKInstance mUSDKInstance, ipc ipcVar, int i, int i2, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56c3d27", new Object[]{this, musLiveVideo, mUSDKInstance, ipcVar, new Integer(i), new Integer(i2), rect});
            return;
        }
        this.videoNode = musLiveVideo;
        reset();
        this.mPlayed = false;
        this.mWidth = i;
        this.mHeight = i2;
        this.mCallback = ipcVar;
        loadPoster(mUSDKInstance, (String) musLiveVideo.getAttribute("poster"), (String) musLiveVideo.getAttribute("objectFit"), i, i2, rect);
        this.valid = false;
        this.hidePoster = false;
        tryLoadVideo();
    }

    private void addNewVideo(ipc ipcVar, String str, boolean z, boolean z2, String str2, int i, int i2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aedbaf0e", new Object[]{this, ipcVar, str, new Boolean(z), new Boolean(z2), str2, new Integer(i), new Integer(i2)});
            return;
        }
        this.mCallback = ipcVar;
        hcj hcjVar = new hcj((String) this.videoNode.getAttribute("bizFrom"), (String) this.videoNode.getAttribute("contentId"), (JSONObject) this.videoNode.getAttribute("utParams"), (String) this.videoNode.getAttribute("objectFit"));
        hcjVar.f((Boolean) this.videoNode.getAttribute("controls"));
        hcjVar.e((Boolean) this.videoNode.getAttribute("showCenterPlayBtn"));
        hcjVar.g((Boolean) this.videoNode.getAttribute("showFullscreenBtn"));
        hcjVar.i((Boolean) this.videoNode.getAttribute("showPlayBtn"));
        hcjVar.h((Boolean) this.videoNode.getAttribute("showMuteBtn"));
        hcjVar.d((String) this.videoNode.getAttribute("playScenes"));
        if (this.mMPC == null) {
            MediaPlayCenter mediaPlayCenter = new MediaPlayCenter(getContext());
            this.mMPC = mediaPlayCenter;
            mediaPlayCenter.setMediaUrl(str);
            this.mMPC.setMediaType(MediaType.LIVE);
            this.mMPC.setConfigGroup("DW");
            this.mMPC.setNeedPlayControlView(false);
            this.mMPC.hiddenMiniProgressBar(true);
            this.mMPC.hideController();
            this.mMPC.setVideoLoop(z);
            this.mMPC.setMute(z2);
            this.mMPC.setMediaAspectRatio(getResizeMode(hcjVar.b()));
            MediaPlayCenter mediaPlayCenter2 = this.mMPC;
            if (TextUtils.isEmpty(hcjVar.a())) {
                str3 = r4p.DEFAULT_VIDEO_BIZ_CODE;
            } else {
                str3 = hcjVar.a();
            }
            mediaPlayCenter2.setBizCode(str3);
            MediaPlayCenter mediaPlayCenter3 = this.mMPC;
            if (TextUtils.isEmpty(hcjVar.c())) {
                str4 = r4p.DEFAULE_VIDEO_PLAY_SCENES;
            } else {
                str4 = hcjVar.c();
            }
            mediaPlayCenter3.setPlayScenes(str4);
            this.mMPC.setup();
            this.mMPC.setMediaLifecycleListener(this);
        }
        View view = this.mMPC.getView();
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            return;
        }
        throw new RuntimeException("IMUSVideoAdapter mustn't return null");
    }
}
