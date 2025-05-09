package com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.HVideoAnimationView;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a5w;
import tb.ehw;
import tb.fve;
import tb.o8e;
import tb.r7t;
import tb.s9m;
import tb.t2o;
import tb.tcw;
import tb.tve;
import tb.wzi;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HVideoAnimationView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoAnimationView";
    private final ImageView mCoverImage;
    private String mCoverImageUrl;
    private String mLocalPath;
    private final TaoLiveVideoView mVideoView;
    private boolean mIsAttachedToWindow = false;
    private final List<o8e> listeners = new CopyOnWriteArrayList();
    private IMediaPlayer.OnInfoListener mOnInfoListener = new a();
    private final IMediaPlayer.OnErrorListener mErrorListener = new b();
    private final IMediaPlayer.OnCompletionListener mOnCompletionListener = new IMediaPlayer.OnCompletionListener() { // from class: tb.yqa
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public final void onCompletion(IMediaPlayer iMediaPlayer) {
            HVideoAnimationView.this.lambda$new$4(iMediaPlayer);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d00e4c0", new Object[]{this});
            } else {
                HVideoAnimationView.access$100(HVideoAnimationView.this).setAlpha(1.0f);
            }
        }

        public final /* synthetic */ void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cf2cd3f", new Object[]{this});
            } else {
                HVideoAnimationView.this.hideCoverImageView();
            }
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (j == 3) {
                fve.e(HVideoAnimationView.TAG, "MEDIA_INFO_VIDEO_RENDERING_START:");
                tve.c(a5w.VIDEO_ANIMATION, wzi.VIDEO_PLAY_SUCCESS, "", a5w.VIDEO_ANIMATION_BIZ_NAME, "", null);
                HVideoAnimationView.this.postDelayed(new Runnable() { // from class: tb.zqa
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVideoAnimationView.a.this.d();
                    }
                }, 1000L);
                HVideoAnimationView.this.postDelayed(new Runnable() { // from class: tb.ara
                    @Override // java.lang.Runnable
                    public final void run() {
                        HVideoAnimationView.a.this.c();
                    }
                }, 300L);
                for (o8e o8eVar : HVideoAnimationView.access$000(HVideoAnimationView.this)) {
                    o8eVar.onStart();
                }
            }
            return false;
        }
    }

    static {
        t2o.a(491782745);
    }

    public HVideoAnimationView(Context context) {
        super(context);
        TaoLiveVideoView initVideoView = initVideoView(context);
        this.mVideoView = initVideoView;
        ImageView initCoverImageView = initCoverImageView(context);
        this.mCoverImage = initCoverImageView;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(initVideoView, 0, layoutParams);
        addView(initCoverImageView, 1, layoutParams);
    }

    public static /* synthetic */ List access$000(HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc64aa50", new Object[]{hVideoAnimationView});
        }
        return hVideoAnimationView.listeners;
    }

    public static /* synthetic */ TaoLiveVideoView access$100(HVideoAnimationView hVideoAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveVideoView) ipChange.ipc$dispatch("9192b2b0", new Object[]{hVideoAnimationView});
        }
        return hVideoAnimationView.mVideoView;
    }

    private ImageView initCoverImageView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("20414ea8", new Object[]{this, context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-1);
        imageView.setVisibility(0);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    private TaoLiveVideoView initVideoView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveVideoView) ipChange.ipc$dispatch("8edd5257", new Object[]{this, context});
        }
        TaoLiveVideoView taoLiveVideoView = new TaoLiveVideoView(context);
        taoLiveVideoView.disableAutoPlayForBackground();
        taoLiveVideoView.setMuted(true);
        taoLiveVideoView.setAlpha(0.0f);
        r7t r7tVar = new r7t(s9m.LPM_BIZ_CODE);
        r7tVar.d = 2;
        r7tVar.e = 2;
        r7tVar.f = 3;
        taoLiveVideoView.setConfigAdapter(new tcw());
        taoLiveVideoView.initConfig(r7tVar);
        taoLiveVideoView.registerOnInfoListener(this.mOnInfoListener);
        taoLiveVideoView.registerOnErrorListener(this.mErrorListener);
        taoLiveVideoView.registerOnCompletionListener(this.mOnCompletionListener);
        return taoLiveVideoView;
    }

    public static /* synthetic */ Object ipc$super(HVideoAnimationView hVideoAnimationView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/taobao/subservice/biz/videocardanimationservice/impl/HVideoAnimationView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3f7bfc", new Object[]{this, iMediaPlayer});
            return;
        }
        for (o8e o8eVar : this.listeners) {
            o8eVar.onComplete();
        }
        fve.e(TAG, MessageID.onCompletion);
    }

    public void addVideoStateListener(o8e o8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a12637d5", new Object[]{this, o8eVar});
        } else if (o8eVar != null) {
            this.listeners.add(o8eVar);
        }
    }

    public void clearVideoStateListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a2e1de", new Object[]{this});
        } else {
            this.listeners.clear();
        }
    }

    public void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        fve.e(TAG, "hideCoverImageView");
        ehw.b(this.mCoverImage, 8);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null && taoLiveVideoView.isPlaying()) {
            fve.e(TAG, "pause video:");
            this.mVideoView.pause();
            for (o8e o8eVar : this.listeners) {
                o8eVar.onPause();
            }
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        if (this.mVideoView != null) {
            fve.e(TAG, "release video:");
            this.mVideoView.release();
        }
        for (o8e o8eVar : this.listeners) {
            o8eVar.onRelease();
        }
    }

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        this.mCoverImageUrl = str;
        fve.e(TAG, "setCoverImage:" + str);
        this.mCoverImage.setImageBitmap(BitmapFactory.decodeFile(str));
    }

    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setLooping(z);
        }
    }

    public void setVideoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
            return;
        }
        this.mLocalPath = str;
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setVideoPath(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IMediaPlayer.OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            fve.e(HVideoAnimationView.TAG, "onError");
            HashMap hashMap = new HashMap(2);
            hashMap.put("what", String.valueOf(i));
            hashMap.put("extra", String.valueOf(i2));
            tve.c(a5w.VIDEO_ANIMATION, wzi.VIDEO_PLAY_ERROR, "", a5w.VIDEO_ANIMATION_BIZ_NAME, "", hashMap);
            if (HVideoAnimationView.access$100(HVideoAnimationView.this) != null) {
                HVideoAnimationView.access$100(HVideoAnimationView.this).setVisibility(8);
            }
            HVideoAnimationView.this.pauseVideo();
            for (o8e o8eVar : HVideoAnimationView.access$000(HVideoAnimationView.this)) {
                o8eVar.onError();
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        fve.e(TAG, "onAttachedToWindow:");
        this.mIsAttachedToWindow = true;
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setRenderType(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        fve.e(TAG, "onDetachedFromWindow:");
        pauseVideo();
        release();
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        fve.e(TAG, "showCoverImageView");
        ehw.b(this.mCoverImage, 0);
    }

    public boolean playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4075d2b2", new Object[]{this})).booleanValue();
        }
        fve.e(TAG, "playVideo START:");
        tve.c(a5w.VIDEO_ANIMATION, wzi.VIDEO_PLAY_START, "", a5w.VIDEO_ANIMATION_BIZ_NAME, "", null);
        showCoverImageView();
        if (!this.mIsAttachedToWindow || TextUtils.isEmpty(this.mCoverImageUrl) || this.mVideoView == null || TextUtils.isEmpty(this.mLocalPath)) {
            fve.e(TAG, "playVideo error attachedToWindow:" + this.mIsAttachedToWindow + ",mCoverImageUrl:" + this.mCoverImageUrl + ",mVideoView is null:" + this.mVideoView + ",mLocalPath:" + this.mLocalPath);
            HashMap hashMap = new HashMap(2);
            String str = "notNull";
            hashMap.put("coverImage", TextUtils.isEmpty(this.mCoverImageUrl) ? "null" : str);
            if (TextUtils.isEmpty(this.mLocalPath)) {
                str = "null";
            }
            hashMap.put("videoPath", str);
            tve.c(a5w.VIDEO_ANIMATION, "videoPlayFail", "", a5w.VIDEO_ANIMATION_BIZ_NAME, "localResourceError", hashMap);
            return false;
        } else if (this.mVideoView.isPlaying()) {
            hideCoverImageView();
            fve.e(TAG, "playVideo isPlaying:");
            return true;
        } else {
            fve.e(TAG, "playVideo start:" + this.mLocalPath);
            this.mVideoView.start();
            return true;
        }
    }
}
