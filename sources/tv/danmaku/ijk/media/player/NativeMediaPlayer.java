package tv.danmaku.ijk.media.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import anet.channel.util.HttpConstant;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ew0;
import tb.gf4;
import tb.t2o;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NativeMediaPlayer extends MonitorMediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnSeekCompleteListener {
    private MediaPlayer mMediaPlayer;
    private boolean mOnError = false;

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnSeekCompleteListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer);
    }

    static {
        t2o.a(774898039);
    }

    public NativeMediaPlayer() {
        initPlayer();
    }

    private void initPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        this.mMediaPlayer.setOnCompletionListener(this);
        this.mMediaPlayer.setOnBufferingUpdateListener(this);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this);
        this.mMediaPlayer.setOnErrorListener(this);
        this.mMediaPlayer.setOnInfoListener(this);
        this.mMediaPlayer.setOnSeekCompleteListener(this);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public Map<String, String> getQos() {
        return null;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
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
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void instantSeekTo(long j) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            if (this.mVolume != 0.0f && !this.bInstantSeeked) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            }
            this.bInstantSeeked = true;
            monitorSeek();
            this.mMediaPlayer.seekTo((int) j);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                return mediaPlayer.isPlaying();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener = this.mOnBufferingUpdateListener;
        if (onBufferingUpdateListener != null) {
            onBufferingUpdateListener.onBufferingUpdate(this, i);
        }
        List<IMediaPlayer.OnBufferingUpdateListener> list = this.mOnBufferingUpdateListeners;
        if (list != null) {
            for (IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener2 : list) {
                onBufferingUpdateListener2.onBufferingUpdate(this, i);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        monitorComplete();
        List<IMediaPlayer.OnPreCompletionListener> list = this.mOnPreCompletionListeners;
        if (list != null) {
            for (IMediaPlayer.OnPreCompletionListener onPreCompletionListener : list) {
                onPreCompletionListener.onPreCompletion(this);
            }
        }
        if (this.bLooping) {
            this.bSeeked = true;
            List<IMediaPlayer.OnLoopCompletionListener> list2 = this.mOnLoopCompletionListeners;
            if (list2 != null) {
                for (IMediaPlayer.OnLoopCompletionListener onLoopCompletionListener : list2) {
                    onLoopCompletionListener.onLoopCompletion(this);
                }
            }
            start();
            return;
        }
        IMediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(this);
        }
        List<IMediaPlayer.OnCompletionListener> list3 = this.mOnCompletionListeners;
        if (list3 != null) {
            for (IMediaPlayer.OnCompletionListener onCompletionListener2 : list3) {
                onCompletionListener2.onCompletion(this);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean z;
        if (this.mOnError) {
            return true;
        }
        this.mOnError = true;
        monitorError(i, i2);
        monitorPlayExperience();
        IMediaPlayer.OnErrorListener onErrorListener = this.mOnErrorListener;
        if (onErrorListener != null) {
            z = onErrorListener.onError(this, i, i2);
        } else {
            z = false;
        }
        List<IMediaPlayer.OnErrorListener> list = this.mOnErrorListeners;
        if (list != null) {
            for (IMediaPlayer.OnErrorListener onErrorListener2 : list) {
                z = onErrorListener2.onError(this, i, i2);
            }
        }
        return z;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        boolean z;
        if (i == 701) {
            monitorBufferStart(System.currentTimeMillis());
        } else if (i == 702) {
            monitorBufferEnd(System.currentTimeMillis());
        } else if (i == 3) {
            monitorRenderStart(0L);
        }
        IMediaPlayer.OnInfoListener onInfoListener = this.mOnInfoListener;
        if (onInfoListener != null) {
            z = onInfoListener.onInfo(this, i, i2, 0L, null);
        } else {
            z = false;
        }
        List<IMediaPlayer.OnInfoListener> list = this.mOnInfoListeners;
        if (list != null) {
            for (IMediaPlayer.OnInfoListener onInfoListener2 : list) {
                z = onInfoListener2.onInfo(this, i, i2, 0L, null);
            }
        }
        return z;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        monitorPrepared(0L);
        IMediaPlayer.OnPreparedListener onPreparedListener = this.mOnPreparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this);
        }
        List<IMediaPlayer.OnPreparedListener> list = this.mOnPreparedListeners;
        if (list != null) {
            for (IMediaPlayer.OnPreparedListener onPreparedListener2 : list) {
                onPreparedListener2.onPrepared(this);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener = this.mOnSeekCompletionListener;
        if (onSeekCompletionListener != null) {
            onSeekCompletionListener.onSeekComplete(this);
        }
        List<IMediaPlayer.OnSeekCompletionListener> list = this.mOnSeekCompletionListeners;
        if (list != null) {
            for (IMediaPlayer.OnSeekCompletionListener onSeekCompletionListener2 : list) {
                onSeekCompletionListener2.onSeekComplete(this);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.mOnVideoSizeChangedListener;
        if (onVideoSizeChangedListener != null) {
            onVideoSizeChangedListener.onVideoSizeChanged(this, i, i2, 0, 0);
        }
        List<IMediaPlayer.OnVideoSizeChangedListener> list = this.mOnVideoSizeChangedListeners;
        if (list != null) {
            for (IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener2 : list) {
                onVideoSizeChangedListener2.onVideoSizeChanged(this, i, i2, 0, 0);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        if (this.mMediaPlayer != null) {
            monitorPause();
            this.mMediaPlayer.pause();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        if (this.mMediaPlayer != null) {
            this.mOnError = false;
            monitorPrepare();
            this.mMediaPlayer.prepareAsync();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
        if (this.mMediaPlayer != null) {
            monitorPlayExperience();
            monitorRelease();
            this.mMediaPlayer.release();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
        if (this.mMediaPlayer != null) {
            monitorPlayExperience();
            monitorReset();
            this.mMediaPlayer.reset();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            float f = this.mVolume;
            if (f != 0.0f && this.bInstantSeeked) {
                mediaPlayer.setVolume(f, f);
            }
            this.bInstantSeeked = false;
            monitorSeek();
            this.mMediaPlayer.seekTo((int) j);
        }
    }

    public void setAudioStreamType(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setAudioStreamType(i);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = weakReference == null ? null : weakReference.get();
        String monitorDataSource = monitorDataSource(str);
        if (this.mMediaPlayer != null && !TextUtils.isEmpty(monitorDataSource)) {
            if (monitorDataSource.startsWith("http")) {
                Uri parse = Uri.parse(monitorDataSource);
                HashMap hashMap = new HashMap();
                String l = ew0.l(context);
                if (!TextUtils.isEmpty(l)) {
                    hashMap.put(HttpConstant.USER_AGENT, l);
                }
                try {
                    if (!TextUtils.isEmpty(this.mCdnIp) && !isUseVideoCache()) {
                        String host = parse.getHost();
                        parse = Uri.parse(monitorDataSource.replaceFirst(host, this.mCdnIp));
                        hashMap.put(HttpConstant.HOST, host);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.mMediaPlayer.setDataSource(context, parse, hashMap);
            } else if (monitorDataSource.startsWith("content://")) {
                this.mMediaPlayer.setDataSource(context, Uri.parse(monitorDataSource));
            } else {
                this.mMediaPlayer.setDataSource(monitorDataSource);
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(surfaceHolder);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setMuted(boolean z) {
        float f;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = this.mVolume;
            }
            mediaPlayer.setVolume(f, f);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setScreenOnWhilePlaying(z);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurface(Surface surface) {
        this.mSurface = surface;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setSurface(surface);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            this.mVolume = f;
            mediaPlayer.setVolume(f, f2);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
        if (this.mMediaPlayer != null) {
            monitorStart();
            this.mMediaPlayer.start();
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public NativeMediaPlayer(Context context) {
        super(context);
        initPlayer();
    }

    public NativeMediaPlayer(Context context, gf4 gf4Var) {
        super(context, gf4Var);
        initPlayer();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j, boolean z, boolean z2) throws IllegalStateException {
        seekTo(j);
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void releasePrefixInUIThread() {
    }

    @Deprecated
    public final void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setPlayRate(float f) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setSurfaceSize(int i, int i2) {
    }
}
