package tv.danmaku.ijk.media.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.taobao.mediaplay.player.a;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a7m;
import tb.c15;
import tb.cq;
import tb.feh;
import tb.gf4;
import tb.r7t;
import tb.t2o;
import tb.t7b;
import tb.tfb;
import tb.x3r;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class TaobaoAudioOnlyPlayer extends MonitorMediaPlayer implements a.AbstractC0594a {
    private static final int AUDIO_EDIA_BUFFERING_UPDATE = 3;
    public static final int AUDIO_ENABLE_ACCURATE_SEEK = 20131;
    public static final int AUDIO_INT64_COMPLETE_DONE_SEEK = 60004;
    public static final int AUDIO_INT64_ENABLE_SEEK_IN_PAUSE = 80006;
    public static final int AUDIO_INT64_START_ON_PREPARED = 11007;
    public static final int AUDIO_INT64_STATE_NOTIFY_GAP = 22902;
    private static final int AUDIO_MEDIA_ERROR = 100;
    private static final int AUDIO_MEDIA_INFO = 200;
    private static final int AUDIO_MEDIA_OUT_OF_BUFFERING = 300;
    private static final int AUDIO_MEDIA_PAUSE = 8;
    private static final int AUDIO_MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int AUDIO_MEDIA_PREPARED = 1;
    private static final int AUDIO_MEDIA_RESUME_BUFFERING = 301;
    private static final int AUDIO_MEDIA_SEEK_COMPLETE = 4;
    private static final int AUDIO_MEDIA_SEEK_START = 400;
    private static final int AUDIO_MEDIA_SET_VIDEO_SIZE = 5;
    private static final int AUDIO_MEDIA_START = 7;
    private static final int AUDIO_MEDIA_TIMED_TEXT = 99;
    private static final int AUDIO_MEDIA_WARMUP = 6;
    public static final int FFP_PROP_FLOAT_VOLUME = 12001;
    private static volatile boolean mIsAudioLibLoaded = false;
    private static ConcurrentHashMap<String, Boolean> mLoopmap = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Boolean> mPausemap = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Boolean> mPlayingmap = new ConcurrentHashMap<>();
    private a mActivityLifecycleCallbacks;
    private AudioEventHandler mEventHandler;
    private feh mLogContext;
    private long mNativeMediaPlayer;
    protected boolean mFetchFFMpegSoReadyInit = false;
    private boolean mRequestAudioFocus = false;
    private boolean mPauseInBackground = false;

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class AudioEventHandler extends Handler {
        private boolean bFirstFrameRendered = false;
        private WeakReference<TaobaoAudioOnlyPlayer> mWeakPlayer;

        static {
            t2o.a(774898042);
        }

        public AudioEventHandler(TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer, Looper looper) {
            super(looper);
            this.mWeakPlayer = new WeakReference<>(taobaoAudioOnlyPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            IMediaPlayer.OnAudioCompletionListener onAudioCompletionListener;
            TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer = this.mWeakPlayer.get();
            if (taobaoAudioOnlyPlayer != null && taobaoAudioOnlyPlayer.mNativeMediaPlayer != 0) {
                EventData eventData = (EventData) message.obj;
                if (eventData != null) {
                    feh logContext = taobaoAudioOnlyPlayer.getLogContext();
                    AVSDKLog.e(logContext, "handleMessage: what=" + message.what + ", arg1=" + eventData.arg1 + ", arg2=" + eventData.arg2 + ", arg3=" + eventData.arg3 + ", obj=" + ((String) eventData.obj));
                }
                String str = (String) eventData.obj;
                if (str.isEmpty()) {
                    AVSDKLog.e(taobaoAudioOnlyPlayer.getLogContext(), "token is empty");
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    IMediaPlayer.OnAudioPreparedListener onAudioPreparedListener = taobaoAudioOnlyPlayer.mOnAudioPreparedListener;
                    if (onAudioPreparedListener != null) {
                        onAudioPreparedListener.onPrepared(taobaoAudioOnlyPlayer, (String) eventData.obj);
                    }
                    List<IMediaPlayer.OnAudioPreparedListener> list = taobaoAudioOnlyPlayer.mOnAudioPreparedListeners;
                    if (list != null) {
                        for (IMediaPlayer.OnAudioPreparedListener onAudioPreparedListener2 : list) {
                            onAudioPreparedListener2.onPrepared(taobaoAudioOnlyPlayer, (String) eventData.obj);
                        }
                    }
                    taobaoAudioOnlyPlayer.pause((String) eventData.obj);
                } else if (i == 2) {
                    boolean z2 = false;
                    if (TaobaoAudioOnlyPlayer.mPausemap.containsKey(str)) {
                        z = ((Boolean) TaobaoAudioOnlyPlayer.mPausemap.get(str)).booleanValue();
                    } else {
                        z = false;
                    }
                    if (TaobaoAudioOnlyPlayer.mLoopmap.containsKey(str)) {
                        z2 = ((Boolean) TaobaoAudioOnlyPlayer.mLoopmap.get(str)).booleanValue();
                    }
                    List<IMediaPlayer.OnAudioPreCompletionListener> list2 = taobaoAudioOnlyPlayer.mOnAudioPreCompletionListeners;
                    if (list2 != null) {
                        for (IMediaPlayer.OnAudioPreCompletionListener onAudioPreCompletionListener : list2) {
                            onAudioPreCompletionListener.onPreCompletion(taobaoAudioOnlyPlayer, str);
                        }
                    }
                    if (z2) {
                        List<IMediaPlayer.OnAudioLoopCompletionListener> list3 = taobaoAudioOnlyPlayer.mOnAudioLoopCompletionListeners;
                        if (list3 != null) {
                            for (IMediaPlayer.OnAudioLoopCompletionListener onAudioLoopCompletionListener : list3) {
                                onAudioLoopCompletionListener.onLoopCompletion(taobaoAudioOnlyPlayer, str);
                            }
                        }
                        if (!taobaoAudioOnlyPlayer.bPauseInBackground || !z) {
                            taobaoAudioOnlyPlayer.start(str);
                        } else {
                            AVSDKLog.d("avsdk", "playback complete but in pause state");
                        }
                    } else {
                        TaobaoAudioOnlyPlayer.mPlayingmap.remove(str);
                        TaobaoAudioOnlyPlayer.mPausemap.put(str, Boolean.TRUE);
                        IMediaPlayer.OnAudioCompletionListener onAudioCompletionListener2 = taobaoAudioOnlyPlayer.mOnAudioCompletionListener;
                        if (onAudioCompletionListener2 != null) {
                            onAudioCompletionListener2.onCompletion(taobaoAudioOnlyPlayer, str);
                        }
                        List<IMediaPlayer.OnAudioCompletionListener> list4 = taobaoAudioOnlyPlayer.mOnAudioCompletionListeners;
                        if (list4 != null) {
                            for (IMediaPlayer.OnAudioCompletionListener onAudioCompletionListener3 : list4) {
                                onAudioCompletionListener3.onCompletion(taobaoAudioOnlyPlayer, str);
                            }
                        }
                    }
                } else if (i == 4) {
                    IMediaPlayer.OnAudioSeekCompletionListener onAudioSeekCompletionListener = taobaoAudioOnlyPlayer.mOnAudioSeekCompletionListener;
                    if (onAudioSeekCompletionListener != null) {
                        onAudioSeekCompletionListener.onSeekComplete(taobaoAudioOnlyPlayer, str);
                    }
                    List<IMediaPlayer.OnAudioSeekCompletionListener> list5 = taobaoAudioOnlyPlayer.mOnAudioSeekCompletionListeners;
                    if (list5 != null) {
                        for (IMediaPlayer.OnAudioSeekCompletionListener onAudioSeekCompletionListener2 : list5) {
                            onAudioSeekCompletionListener2.onSeekComplete(taobaoAudioOnlyPlayer, str);
                        }
                    }
                } else if (i == 100) {
                    IMediaPlayer.OnAudioErrorListener onAudioErrorListener = taobaoAudioOnlyPlayer.mOnAudioErrorListener;
                    if ((onAudioErrorListener == null || !onAudioErrorListener.onError(taobaoAudioOnlyPlayer, (int) eventData.arg1, (int) eventData.arg2, str)) && (onAudioCompletionListener = taobaoAudioOnlyPlayer.mOnAudioCompletionListener) != null) {
                        onAudioCompletionListener.onCompletion(taobaoAudioOnlyPlayer, str);
                    }
                    List<IMediaPlayer.OnAudioErrorListener> list6 = taobaoAudioOnlyPlayer.mOnAudioErrorListeners;
                    if (list6 != null) {
                        for (IMediaPlayer.OnAudioErrorListener onAudioErrorListener2 : list6) {
                            onAudioErrorListener2.onError(taobaoAudioOnlyPlayer, (int) eventData.arg1, (int) eventData.arg2, str);
                        }
                    }
                } else if (i == 200) {
                    feh logContext2 = taobaoAudioOnlyPlayer.getLogContext();
                    AVSDKLog.e(logContext2, "AUDIO_MEDIA_INFO is " + eventData.arg1);
                    long j = eventData.arg1;
                    if (j == 12160) {
                        IMediaPlayer.OnAudioInfoListener onAudioInfoListener = taobaoAudioOnlyPlayer.mOnAudioInfoListener;
                        if (onAudioInfoListener != null) {
                            onAudioInfoListener.onInfo(taobaoAudioOnlyPlayer, j, eventData.arg2, eventData.arg3, eventData.obj, str);
                        }
                        List<IMediaPlayer.OnAudioInfoListener> list7 = taobaoAudioOnlyPlayer.mOnAudioInfoListeners;
                        if (list7 != null) {
                            for (IMediaPlayer.OnAudioInfoListener onAudioInfoListener2 : list7) {
                                onAudioInfoListener2.onInfo(taobaoAudioOnlyPlayer, eventData.arg1, eventData.arg2, eventData.arg3, eventData.obj, str);
                            }
                        }
                    }
                } else if (i == 400) {
                    feh logContext3 = taobaoAudioOnlyPlayer.getLogContext();
                    AVSDKLog.e(logContext3, "AUDIO_MEDIA_SEEK_START is " + eventData.arg1);
                    IMediaPlayer.OnAudioSeekStartListener onAudioSeekStartListener = taobaoAudioOnlyPlayer.mOnAudioSeekStartListener;
                    if (onAudioSeekStartListener != null) {
                        onAudioSeekStartListener.onSeekStart(taobaoAudioOnlyPlayer, str);
                    }
                    List<IMediaPlayer.OnAudioSeekStartListener> list8 = taobaoAudioOnlyPlayer.mOnAudioSeekStartListeners;
                    if (list8 != null) {
                        for (IMediaPlayer.OnAudioSeekStartListener onAudioSeekStartListener2 : list8) {
                            onAudioSeekStartListener2.onSeekStart(taobaoAudioOnlyPlayer, str);
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(774898041);
        t2o.a(774897783);
    }

    public TaobaoAudioOnlyPlayer() {
        initPlayer(null);
    }

    private native float _audioGetCurCachePosition(String str);

    private native long _audioGetCurrentPosition(String str);

    private native long _audioGetDuration(String str);

    private native boolean _audioIsPlaying(String str);

    private native void _audioPause(String str) throws IllegalStateException;

    private native void _audioPrepareAsync(String str) throws IllegalStateException;

    private native void _audioSeekTo(String str, long j) throws IllegalStateException;

    private native void _audioSeekToPause(String str, long j, boolean z) throws IllegalStateException;

    private native void _audioStart(String str) throws IllegalStateException;

    private native void _audioStop(String str) throws IllegalStateException;

    private native void _audio_native_setup(Object obj);

    private native void _audiorRelease();

    private native void _setAudioDataSource(String str, String str2, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    private void initFetchSo() {
        this.mFetchFFMpegSoReadyInit = cq.b();
    }

    private void initPlayer(c15 c15Var) {
        Context context;
        this.mLogContext = new feh(toString(), "");
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            context = null;
        } else {
            context = weakReference.get();
        }
        AVSDKLog.e(this.mLogContext, "AUDIO initPlayer");
        loadAudioLibrariesOnce(c15Var);
        new r7t("AudioOnly");
        r7t r7tVar = new r7t("AudioOnly");
        r7tVar.Z = true;
        r7tVar.l0 = true;
        setConfig(r7tVar);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new AudioEventHandler(this, mainLooper);
        } else {
            this.mEventHandler = null;
        }
        if (context != null && this.mActivityLifecycleCallbacks == null) {
            this.mActivityLifecycleCallbacks = new a(this, (Application) context.getApplicationContext());
        }
        _audio_native_setup(new WeakReference(this));
    }

    public static boolean isAudioLibLoaded() {
        return mIsAudioLibLoaded;
    }

    public static void loadAudioLibrariesOnce(c15 c15Var) {
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "AUDIO loadAudioLibrariesOnce");
        synchronized (TaobaoMediaPlayer.class) {
            try {
                if (!mIsAudioLibLoaded) {
                    if (c15Var != null) {
                        c15Var.loadLibrary("c++_shared");
                        c15Var.loadLibrary("tbffmpeg");
                        c15Var.loadLibrary("taobaoplayer");
                    } else {
                        System.loadLibrary("c++_shared");
                        System.loadLibrary("tbffmpeg");
                        System.loadLibrary("taobaoplayer");
                    }
                    mIsAudioLibLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void postAudioEventFromNative(Object obj, int i, long j, long j2, long j3, Object obj2) {
        TaobaoAudioOnlyPlayer taobaoAudioOnlyPlayer;
        if (obj != null && (taobaoAudioOnlyPlayer = (TaobaoAudioOnlyPlayer) ((WeakReference) obj).get()) != null) {
            synchronized (TaobaoAudioOnlyPlayer.class) {
                try {
                    AudioEventHandler audioEventHandler = taobaoAudioOnlyPlayer.mEventHandler;
                    if (audioEventHandler != null) {
                        Message obtainMessage = audioEventHandler.obtainMessage(i);
                        EventData eventData = new EventData();
                        eventData.arg1 = j;
                        eventData.arg2 = j2;
                        eventData.arg3 = j3;
                        eventData.obj = obj2;
                        obtainMessage.obj = eventData;
                        if (i == 1) {
                            taobaoAudioOnlyPlayer.mEventHandler.sendMessageAtFrontOfQueue(obtainMessage);
                        } else {
                            taobaoAudioOnlyPlayer.mEventHandler.sendMessage(obtainMessage);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public native float _audioGetPropertyFloat(String str, int i, float f);

    public native long _audioGetPropertyLong(String str, int i, long j);

    public native String _audioGetPropertyString(String str, int i);

    public native void _audioSetPropertyFloat(String str, int i, float f);

    public native void _audioSetPropertyLong(String str, int i, long j);

    public native void _audioSetPropertyString(String str, int i, String str2);

    public float getCurCachePosition(String str) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO getCurCachePosition token is " + str);
        return _audioGetCurCachePosition(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public Map<String, String> getQos() {
        return null;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        return false;
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityPaused(Activity activity) {
        Context context;
        AVSDKLog.e(this.mLogContext, "AUDIO onActivityPaused");
        if (this.mPauseInBackground && !mPlayingmap.isEmpty()) {
            if (this.mRequestAudioFocus) {
                WeakReference<Context> weakReference = this.mContextRef;
                if (weakReference == null) {
                    context = null;
                } else {
                    context = weakReference.get();
                }
                x3r.j(context).k(null);
                this.mRequestAudioFocus = false;
            }
            String str = "";
            for (Map.Entry<String, Boolean> entry : mPlayingmap.entrySet()) {
                AVSDKLog.e(this.mLogContext, "AUDIO onActivityPaused" + str);
                str = entry.getKey();
                IMediaPlayer.OnAudioPauseListener onAudioPauseListener = this.mOnAudioPauseListener;
                if (onAudioPauseListener != null) {
                    onAudioPauseListener.onPause(str);
                }
                List<IMediaPlayer.OnAudioPauseListener> list = this.mOnAudioPauseListeners;
                if (list != null) {
                    for (IMediaPlayer.OnAudioPauseListener onAudioPauseListener2 : list) {
                        onAudioPauseListener2.onPause(str);
                    }
                }
                _audioPause(str);
            }
        }
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityResumed(Activity activity) {
        Context context;
        AVSDKLog.e(this.mLogContext, "AUDIO onActivityResumed");
        if (this.mPauseInBackground && !mPlayingmap.isEmpty()) {
            if (!this.mRequestAudioFocus) {
                WeakReference<Context> weakReference = this.mContextRef;
                if (weakReference == null) {
                    context = null;
                } else {
                    context = weakReference.get();
                }
                x3r.j(context).h(null, 1);
                this.mRequestAudioFocus = true;
            }
            String str = "";
            for (Map.Entry<String, Boolean> entry : mPlayingmap.entrySet()) {
                AVSDKLog.e(this.mLogContext, "AUDIO onActivityResumed" + str);
                str = entry.getKey();
                IMediaPlayer.OnAudioStartListener onAudioStartListener = this.mOnAudioStartListener;
                if (onAudioStartListener != null) {
                    onAudioStartListener.onStart(str);
                }
                List<IMediaPlayer.OnAudioStartListener> list = this.mOnAudioStartListeners;
                if (list != null) {
                    for (IMediaPlayer.OnAudioStartListener onAudioStartListener2 : list) {
                        onAudioStartListener2.onStart(str);
                    }
                }
                _audioStart(str);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        Context context;
        a aVar;
        AVSDKLog.e(this.mLogContext, "AUDIO release ");
        mLoopmap.clear();
        mPausemap.clear();
        mPlayingmap.clear();
        _audiorRelease();
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            context = null;
        } else {
            context = weakReference.get();
        }
        if (this.mRequestAudioFocus && mPlayingmap.isEmpty()) {
            x3r.j(context).k(null);
            this.mRequestAudioFocus = false;
        }
        if (context != null && (aVar = this.mActivityLifecycleCallbacks) != null) {
            aVar.b((Application) context.getApplicationContext());
            this.mActivityLifecycleCallbacks = null;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.MonitorMediaPlayer
    public int setConfig(r7t r7tVar) {
        super.setConfig(r7tVar);
        initFetchSo();
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    public void setLooping(String str, boolean z) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO setLooping token is" + str);
        if (z) {
            mLoopmap.put(str, Boolean.valueOf(z));
        } else {
            mLoopmap.remove(str);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setMuted(boolean z) {
    }

    public void setPauseInBackground(boolean z) {
        this.mPauseInBackground = z;
    }

    public void setStateChangeGap(String str, long j) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO setStateChangeGap token is " + str + "gap is " + j);
        _audioSetPropertyLong(str, 22902, j);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
    }

    public long getCurrentPosition(String str) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO getCurrentPosition token is " + str);
        return _audioGetCurrentPosition(str);
    }

    public long getDuration(String str) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO getDuration token is " + str);
        return _audioGetDuration(str);
    }

    public boolean isPlaying(String str) {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO isPlaying token is " + str);
        return _audioIsPlaying(str);
    }

    public void pause(String str) throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO pause token is " + str);
        if (!mPausemap.containsKey(str)) {
            IMediaPlayer.OnAudioPauseListener onAudioPauseListener = this.mOnAudioPauseListener;
            if (onAudioPauseListener != null) {
                onAudioPauseListener.onPause(str);
            }
            List<IMediaPlayer.OnAudioPauseListener> list = this.mOnAudioPauseListeners;
            if (list != null) {
                for (IMediaPlayer.OnAudioPauseListener onAudioPauseListener2 : list) {
                    onAudioPauseListener2.onPause(str);
                }
            }
        }
        mPausemap.put(str, Boolean.TRUE);
        mPlayingmap.remove(str);
        try {
            _audioPause(str);
        } catch (Throwable th) {
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "_audioPause fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
        if (this.mRequestAudioFocus && mPlayingmap.isEmpty()) {
            WeakReference<Context> weakReference = this.mContextRef;
            x3r.j(weakReference == null ? null : weakReference.get()).k(null);
            this.mRequestAudioFocus = false;
        }
    }

    public void prepareAsync(String str) throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO prepareAsync token is " + str);
        _audioSetPropertyLong(str, 20131, 1L);
        _audioSetPropertyLong(str, 11007, 1L);
        _audioSetPropertyLong(str, 60004, 1L);
        _audioSetPropertyLong(str, 80006, 1L);
        _audioPrepareAsync(str);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j, boolean z, boolean z2) throws IllegalStateException {
    }

    public String setDataSource(String str, String str2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        feh fehVar;
        if (!TextUtils.isEmpty(str) && (fehVar = this.mLogContext) != null) {
            fehVar.c(str);
        }
        AVSDKLog.e(this.mLogContext, "AUDIO setDataSource token is " + str + "pathis " + str2);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        AVSDKLog.e(this.mLogContext, "TaobaoAudioOnlyPlayer:setDataSource: " + str2);
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        r7t r7tVar = this.mConfig;
        if ((r7tVar != null && r7tVar.Z && r7tVar.l0 && str2.startsWith("http")) || str2.startsWith("https")) {
            String b = a7m.b(context, str2);
            AVSDKLog.e(this.mLogContext, "TaobaoAudioOnlyPlayer getCompleteCachePath : " + b);
            if (TextUtils.isEmpty(b)) {
                t7b d = a7m.d(context);
                if (d == null || !d.D()) {
                    AVSDKLog.e(this.mLogContext, "TaobaoAudioOnlyPlayer isCacheAvaiable : " + d.D());
                } else {
                    str2 = d.v(str2);
                    AVSDKLog.e(this.mLogContext, "TaobaoAudioOnlyPlayer isCacheAvaiable : " + d.D());
                }
            } else {
                str2 = b;
            }
        }
        AVSDKLog.e(this.mLogContext, "TaobaoAudioOnlyPlayer proxyUrl : " + str2);
        if (str.isEmpty()) {
            str = System.currentTimeMillis() + "_" + (Math.random() * 100000.0d);
        }
        _setAudioDataSource(str, str2, null, null);
        return str;
    }

    public void setMuted(String str, boolean z) {
        _audioSetPropertyLong(str, 21008, z ? 1L : 0L);
    }

    public void setVolume(String str, float f, float f2) {
        _audioSetPropertyFloat(str, 12001, f);
    }

    public void start(String str) throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO start token is " + str);
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        if (!mPlayingmap.containsKey(str)) {
            IMediaPlayer.OnAudioStartListener onAudioStartListener = this.mOnAudioStartListener;
            if (onAudioStartListener != null) {
                onAudioStartListener.onStart(str);
            }
            List<IMediaPlayer.OnAudioStartListener> list = this.mOnAudioStartListeners;
            if (list != null) {
                for (IMediaPlayer.OnAudioStartListener onAudioStartListener2 : list) {
                    onAudioStartListener2.onStart(str);
                }
            }
        }
        mPlayingmap.put(str, Boolean.TRUE);
        mPausemap.remove(str);
        if (!this.mRequestAudioFocus && !mPlayingmap.isEmpty()) {
            x3r.j(context).h(null, 1);
            this.mRequestAudioFocus = true;
        }
        try {
            _audioStart(str);
        } catch (Throwable th) {
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "_audioStart fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
    }

    public void stop(String str) throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO stop token is " + str);
        try {
            _audioPause(str);
            _audioStop(str);
        } catch (Throwable th) {
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "_audioStop fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
        mLoopmap.remove(str);
        mPausemap.remove(str);
        mPlayingmap.remove(str);
        if (this.mRequestAudioFocus && mPlayingmap.isEmpty()) {
            WeakReference<Context> weakReference = this.mContextRef;
            x3r.j(weakReference == null ? null : weakReference.get()).k(null);
            this.mRequestAudioFocus = false;
        }
    }

    public void seekTo(String str, long j) throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO seekTo token is " + str + "msec is" + j);
        try {
            _audioSeekTo(str, j);
        } catch (Throwable th) {
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "seekTo fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
    }

    public TaobaoAudioOnlyPlayer(Context context) {
        super(context);
        initPlayer(null);
    }

    public void seekTo(String str, long j, boolean z, boolean z2) throws IllegalStateException {
        feh fehVar = this.mLogContext;
        AVSDKLog.e(fehVar, "AUDIO seekTo token is " + str + "msec is" + j);
        try {
            _audioSeekToPause(str, j, z);
        } catch (Throwable th) {
            feh fehVar2 = this.mLogContext;
            AVSDKLog.e(fehVar2, "seekTo fail ---" + th.getMessage() + " " + th.getStackTrace());
        }
    }

    public TaobaoAudioOnlyPlayer(Context context, gf4 gf4Var) {
        super(context);
        initPlayer(null);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void releasePrefixInUIThread() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void instantSeekTo(long j) {
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityStopped(Activity activity) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayRate(float f) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.taobao.mediaplay.player.a.AbstractC0594a
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurfaceSize(int i, int i2) {
    }
}
