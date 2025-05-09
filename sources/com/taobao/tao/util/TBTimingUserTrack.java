package com.taobao.tao.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBTimingUserTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENTTYPE_CLICK = "click";
    public static final String EVENTTYPE_LOAD = "load";
    private static final String TAG = "TBTimingUserTrack";
    private static TBTimingUserTrack s_TBTimingUserTrack;
    private HashMap<String, Long> mHash = new HashMap<>();

    static {
        t2o.a(775946443);
    }

    public static synchronized TBTimingUserTrack instance() {
        synchronized (TBTimingUserTrack.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBTimingUserTrack) ipChange.ipc$dispatch("eb390932", new Object[0]);
            }
            if (s_TBTimingUserTrack == null) {
                s_TBTimingUserTrack = new TBTimingUserTrack();
            }
            return s_TBTimingUserTrack;
        }
    }

    public void end(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6593f6", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "_" + str2;
            if (this.mHash.containsKey(str3)) {
                long longValue = this.mHash.get(str3).longValue();
                if (longValue != 0) {
                    long currentTimeMillis = System.currentTimeMillis() - longValue;
                    TBS.Ext.commitEvent(str, Constants.EventID_EVENT_TIME, str2, Long.valueOf(currentTimeMillis), "");
                    StringBuilder sb = new StringBuilder("[TimingEnd]:");
                    sb.append(str);
                    sb.append(" time:");
                    sb.append(currentTimeMillis);
                    this.mHash.remove(str3);
                }
            }
        }
    }

    public void start(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4e7c7d", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap<String, Long> hashMap = this.mHash;
            hashMap.put(str + "_" + str2, Long.valueOf(System.currentTimeMillis()));
            StringBuilder sb = new StringBuilder("[TimingStart]:");
            sb.append(str);
            sb.append(" tyep:");
            sb.append(str2);
        }
    }
}
