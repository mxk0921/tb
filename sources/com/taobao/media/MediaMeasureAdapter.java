package com.taobao.media;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashSet;
import tb.lp0;
import tb.r7t;
import tb.t2o;
import tb.wrc;
import tb.z5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaMeasureAdapter implements wrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mBucketId;
    private long mExperienceId;
    private int mLastMeausreResult = -1;
    private long mLastMeausreTime;
    private long mReleaseId;

    static {
        t2o.a(774897682);
        t2o.a(774897759);
    }

    private int getRuntimeLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f9ec87c", new Object[]{this})).intValue();
        }
        try {
            if (System.currentTimeMillis() - this.mLastMeausreTime >= 7000 || this.mLastMeausreResult < 0) {
                this.mLastMeausreTime = System.currentTimeMillis();
                this.mLastMeausreResult = lp0.d().f().c;
            }
            return this.mLastMeausreResult;
        } catch (Throwable th) {
            AVSDKLog.d("MediaMeasureAdapter", " MediaMeasureAdapter isLowPerformance error:" + th.getMessage());
            return 1;
        }
    }

    public void addLowDeviceExpInfo(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9518e38", new Object[]{this, mediaPlayControlContext});
        } else if (mediaPlayControlContext != null) {
            HashSet<Long> hashSet = mediaPlayControlContext.mExperienceIdSet;
            if (hashSet != null) {
                long j = this.mExperienceId;
                if (j != 0) {
                    hashSet.add(Long.valueOf(j));
                }
            }
            HashSet<Long> hashSet2 = mediaPlayControlContext.mExperienceBucketIdSet;
            if (hashSet2 != null) {
                long j2 = this.mBucketId;
                if (j2 != 0) {
                    hashSet2.add(Long.valueOf(j2));
                }
            }
            HashSet<Long> hashSet3 = mediaPlayControlContext.mExperienceReleaseIdSet;
            if (hashSet3 != null) {
                long j3 = this.mReleaseId;
                if (j3 != 0) {
                    hashSet3.add(Long.valueOf(j3));
                }
            }
        }
    }

    @Override // tb.wrc
    public int getNetSpeedValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c422db2b", new Object[]{this})).intValue();
        }
        return z5r.l() * 8;
    }

    public boolean isLowPerformance(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f237c40", new Object[]{this, mediaPlayControlContext})).booleanValue();
        }
        int runtimeLevel = getRuntimeLevel();
        mediaPlayControlContext.mRuntimeLevel = runtimeLevel;
        return Build.VERSION.SDK_INT <= 27 && runtimeLevel > 2;
    }

    public boolean isLowPerformanceByAB(MediaPlayControlContext mediaPlayControlContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d0c3218", new Object[]{this, mediaPlayControlContext})).booleanValue();
        }
        return isLowPerformance(mediaPlayControlContext);
    }

    public boolean isLowPerformance(r7t r7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab5b4e1", new Object[]{this, r7tVar})).booleanValue();
        }
        int runtimeLevel = getRuntimeLevel();
        r7tVar.I = runtimeLevel;
        return Build.VERSION.SDK_INT <= 27 && runtimeLevel > 2;
    }
}
