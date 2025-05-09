package com.taobao.tao.timestamp;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopConvert;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TimeStampManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GAP_TIME = "TimeStampManager.GapTime";
    private static final String SP_NAME = "TimeStampManager.SP";
    public static final int TIME_FLAG_ERROR = -1;
    public static final int TIME_FLAG_LOADED = 1;
    public static final int TIME_FLAG_LOADING = 0;
    private long baseGapTime;
    public String TAG = "TimeStampManager";
    private AtomicInteger timeFlag = new AtomicInteger(-1);
    private long baseTimeElapsed = SystemClock.elapsedRealtime();
    private long baseServerTimeStamp = new Date().getTime();
    private ApiID apiID = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TimeStampManager f12798a = new TimeStampManager();

        static {
            t2o.a(775946409);
        }

        public static /* synthetic */ TimeStampManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TimeStampManager) ipChange.ipc$dispatch("28278a18", new Object[0]);
            }
            return f12798a;
        }
    }

    static {
        t2o.a(775946407);
    }

    public TimeStampManager() {
        this.baseGapTime = 0L;
        long j = Globals.getApplication().getSharedPreferences(SP_NAME, 0).getLong(GAP_TIME, 0L);
        this.baseGapTime = j;
        this.baseServerTimeStamp += j;
    }

    public static /* synthetic */ AtomicInteger access$100(TimeStampManager timeStampManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("efdd9923", new Object[]{timeStampManager});
        }
        return timeStampManager.timeFlag;
    }

    public static /* synthetic */ void access$200(TimeStampManager timeStampManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dec62c", new Object[]{timeStampManager, new Long(j)});
        } else {
            timeStampManager.updateTimeStamp(j);
        }
    }

    public static TimeStampManager instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeStampManager) ipChange.ipc$dispatch("dc9d8afd", new Object[0]);
        }
        return a.a();
    }

    public long getCurrentTimeStamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c918edee", new Object[]{this})).longValue();
        }
        long elapsedRealtime = (this.baseServerTimeStamp + SystemClock.elapsedRealtime()) - this.baseTimeElapsed;
        pullTimeStampIfNeeded();
        return elapsedRealtime;
    }

    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
        } else {
            pullTimeStampIfNeeded();
        }
    }

    public void onStop() {
        ApiID apiID;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (this.timeFlag.intValue() == 0 && (apiID = this.apiID) != null) {
            apiID.cancelApiCall();
        }
    }

    public boolean pullTimeStampIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c8cd8e", new Object[]{this})).booleanValue();
        }
        if (this.timeFlag.intValue() == -1) {
            return pullTimeStamp(false);
        }
        return false;
    }

    private void updateTimeStamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cbe510", new Object[]{this, new Long(j)});
            return;
        }
        this.baseTimeElapsed = SystemClock.elapsedRealtime();
        this.baseServerTimeStamp = j;
        this.baseGapTime = j - new Date().getTime();
        SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences(SP_NAME, 0).edit();
        edit.putLong(GAP_TIME, this.baseGapTime);
        edit.apply();
        StringBuilder sb = new StringBuilder("update baseServerTimeStamp: ");
        sb.append(this.baseServerTimeStamp);
        sb.append(" | update baseTimeElapsed: ");
        sb.append(this.baseTimeElapsed);
    }

    public boolean pullTimeStamp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebd74da0", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.timeFlag.intValue() == 0) {
            if (!z) {
                return false;
            }
            ApiID apiID = this.apiID;
            if (apiID != null) {
                apiID.cancelApiCall();
            }
        }
        this.timeFlag.set(0);
        this.apiID = Mtop.instance(Globals.getApplication()).build((IMTOPDataObject) new GetTimestampRequest(), TaoPackageInfo.getTTID()).addListener(new MtopCallback.MtopFinishListener() { // from class: com.taobao.tao.timestamp.TimeStampManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
            public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                    return;
                }
                TimeStampManager.access$100(TimeStampManager.this).set(-1);
                MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
                if (mtopResponse.isApiSuccess()) {
                    try {
                        String t = ((GetTimestampResponseData) MtopConvert.jsonToOutputDO(mtopResponse.getBytedata(), GetTimestampResponse.class).getData()).getT();
                        TimeStampManager.access$200(TimeStampManager.this, Long.parseLong(t));
                        TimeStampManager.access$100(TimeStampManager.this).set(1);
                        String str = TimeStampManager.this.TAG;
                        new StringBuilder("get service time stamp success ,t:").append(t);
                    } catch (Exception unused) {
                        TimeStampManager.access$100(TimeStampManager.this).set(-1);
                    }
                }
            }
        }).asyncRequest();
        return true;
    }
}
