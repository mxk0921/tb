package com.taobao.kirinvideoengine.feature.predownload.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PreDownloadConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PRELOAD_TIMEOUT = 5000;
    public int cancelTimeOut;
    public boolean enable;
    public boolean enableOpti;
    public boolean enableServerControl;
    public PreLoadHealthy mPreLoadHealthy;
    public float preDownloadSize;
    public int queueDepth;
    public boolean stopDownloadPlayingVideo;

    static {
        t2o.a(500170783);
    }

    public PreDownloadConfig() {
        this.enable = false;
        this.enableOpti = true;
        this.cancelTimeOut = 5000;
        this.queueDepth = 3;
        this.preDownloadSize = -1.0f;
        this.enableServerControl = false;
        this.stopDownloadPlayingVideo = false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreDownloadConfig{enable=" + this.enable + ", cancelTimeOut=" + this.cancelTimeOut + ", queueDepth=" + this.queueDepth + ", preDownloadSize=" + this.preDownloadSize + ", enableServerControl=" + this.enableServerControl + ", stopDownloadPlayingVideo=" + this.stopDownloadPlayingVideo + ", mPreLoadHealthy=" + this.mPreLoadHealthy + '}';
    }

    public PreDownloadConfig(boolean z, int i, float f) {
        this.enable = false;
        this.cancelTimeOut = 5000;
        this.enableServerControl = false;
        this.stopDownloadPlayingVideo = false;
        this.enableOpti = z;
        this.queueDepth = i;
        this.preDownloadSize = f;
        this.mPreLoadHealthy = new PreLoadHealthy();
    }

    public PreDownloadConfig(boolean z, int i, float f, float f2, float f3) {
        this.cancelTimeOut = 5000;
        this.enableServerControl = false;
        this.stopDownloadPlayingVideo = false;
        this.enable = true;
        this.enableOpti = z;
        this.queueDepth = i;
        this.preDownloadSize = f;
        this.mPreLoadHealthy = new PreLoadHealthy();
        PreLoadHealthy.healthBufferLevel = f2;
        PreLoadHealthy.poorBufferLevel = f3;
    }
}
