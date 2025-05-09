package com.taobao.kirinvideoengine.feature.predownload.model;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PreLoadHealthy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_HEALTHY_GAP = 1.0f;
    public static final float DEFAULT_HEALTH_BUFFER_LEVEL = 3.5f;
    public static final float DEFAULT_POOR_BUFFER_LEVEL = 1.0f;
    public int bufferPercent;
    public int currentPosition;
    public long lastHealthyTime = 0;
    public int total;
    public static float healthBufferLevel = 3.5f;
    public static float poorBufferLevel = 1.0f;
    public static float healthGap = 1.0f;

    static {
        t2o.a(500170784);
    }

    public PreLoadHealthy() {
        healthBufferLevel = 3.5f;
        poorBufferLevel = 1.0f;
        healthGap = 1.0f;
    }

    public int getRemainDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d371e90", new Object[]{this})).intValue();
        }
        return ((int) (((this.bufferPercent * 1.0f) / 100.0f) * this.total)) - this.currentPosition;
    }

    public boolean isHealthy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4d541e", new Object[]{this})).booleanValue();
        }
        if (this.bufferPercent <= 95 && getRemainDuration() < healthBufferLevel * 1000.0f) {
            return false;
        }
        return true;
    }

    public boolean isHealthyWithGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487311a8", new Object[]{this})).booleanValue();
        }
        if (!isHealthy() || ((float) (SystemClock.elapsedRealtime() - this.lastHealthyTime)) <= healthGap * 1000.0f) {
            return false;
        }
        this.lastHealthyTime = SystemClock.elapsedRealtime();
        return true;
    }

    public boolean isPoor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6d4e2f7", new Object[]{this})).booleanValue();
        }
        if (this.bufferPercent <= 95 && getRemainDuration() <= poorBufferLevel * 1000.0f) {
            return true;
        }
        return false;
    }

    public void progressPreDownload(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d1bf1e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.currentPosition = i;
        this.total = i2;
        this.bufferPercent = i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreLoadHealthy{currentPosition=" + this.currentPosition + ", total=" + this.total + ", bufferPercent=" + this.bufferPercent + '}';
    }
}
