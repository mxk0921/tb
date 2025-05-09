package com.taobao.alimama.utils;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.m;
import tb.t2o;
import tb.tzu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class UTAppBackgroundTimeoutDetector implements tzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static UTAppBackgroundTimeoutDetector sInstance = null;
    private boolean mShouldRewriteTpkCache = true;
    private long mSwitchBackgroundTimestamp;

    static {
        t2o.a(1018167410);
        t2o.a(962593305);
    }

    public static UTAppBackgroundTimeoutDetector getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTAppBackgroundTimeoutDetector) ipChange.ipc$dispatch("5e733492", new Object[0]);
        }
        if (sInstance == null) {
            sInstance = new UTAppBackgroundTimeoutDetector();
        }
        return sInstance;
    }

    @Override // tb.tzu
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        } else {
            this.mSwitchBackgroundTimestamp = SystemClock.elapsedRealtime();
        }
    }

    @Override // tb.tzu
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        if (0 != this.mSwitchBackgroundTimestamp && SystemClock.elapsedRealtime() - this.mSwitchBackgroundTimestamp > m.CONFIG_TRACK_1022_INTERVAL_TIME) {
            this.mShouldRewriteTpkCache = true;
        }
        this.mSwitchBackgroundTimestamp = 0L;
    }

    public void setShouldRewriteTpkCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf965e3", new Object[]{this, new Boolean(z)});
        } else {
            this.mShouldRewriteTpkCache = z;
        }
    }

    public boolean shouldRewriteTpkCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd5b3957", new Object[]{this})).booleanValue();
        }
        return this.mShouldRewriteTpkCache;
    }
}
