package com.taobao.taobaoavsdk.services;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.IAVObject;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import tb.n6t;
import tb.t2o;
import tb.yud;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LivePlayServiceImp implements IAVObject, yud, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnPreparedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private yud.a mListener;
    private TaoLiveVideoView mVideoView;

    static {
        t2o.a(774897946);
        t2o.a(774897845);
        t2o.a(774898019);
        t2o.a(774898020);
        t2o.a(774898025);
    }

    public int getCurrentPoistion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f624ccda", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            return taoLiveVideoView.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            return taoLiveVideoView.getDuration();
        }
        return 0;
    }

    public View getPlayView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8d911938", new Object[]{this});
        }
        return this.mVideoView;
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            return taoLiveVideoView.getCurrentState();
        }
        return 0;
    }

    public int getVideoHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            return taoLiveVideoView.getVideoHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            return taoLiveVideoView.getVideoWidth();
        }
        return 0;
    }

    public void initConfig(Context context, n6t n6tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34883743", new Object[]{this, context, n6tVar});
            return;
        }
        if (this.mVideoView != null) {
            release();
        }
        TaoLiveVideoView taoLiveVideoView = new TaoLiveVideoView(context);
        this.mVideoView = taoLiveVideoView;
        taoLiveVideoView.registerOnCompletionListener(this);
        this.mVideoView.registerOnErrorListener(this);
        this.mVideoView.registerOnPreparedListener(this);
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            return taoLiveVideoView.isPlaying();
        }
        return false;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05bf465", new Object[]{this, iMediaPlayer});
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.pause();
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.unregisterOnCompletionListener(this);
            this.mVideoView.unregisterOnErrorListener(this);
            this.mVideoView.unregisterOnPreparedListener(this);
            this.mVideoView.release();
            this.mVideoView = null;
        }
    }

    public void seedTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723c1e10", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.seekTo(i);
        }
    }

    public void setListener(yud.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba150eb", new Object[]{this, aVar});
        }
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setMuted(z);
        }
    }

    public void setScenarioType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557a670", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setScenarioType(i);
        }
    }

    public void setTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f41d", new Object[]{this, new Integer(i)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setTimeout(i);
        }
    }

    public void setVideoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f405b10f", new Object[]{this, str});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setVideoPath(str);
        }
    }

    public void setVolume(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef12afe3", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.setVolume(f, f2);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.mVideoView;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.start();
        }
    }
}
