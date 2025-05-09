package com.alibaba.security.ccrc.manager;

import android.text.TextUtils;
import com.alibaba.security.ccrc.manager.WukongBcChannel;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.vb;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongBcChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WukongBcChannel";
    public static long mDispatchFuncAddr = -1;
    public static int mErrorCode = -1;

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("267e9d4", new Object[]{str, str2, str3, str4, str5, str6, str7, new Integer(i), new Long(j), new Integer(i2)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setCcrcCode(str).setpId(str2).setPhase("detect").setOperation(C1174ka.a.A);
        if (!TextUtils.isEmpty(str3)) {
            i3 = -1;
        }
        TrackManager.track(operation.setStatus(i3).addParam("errorMsg", str3).addParam("funcName", str4).addParam("feature", str5).addParam("args", str6).addParam("result", str7).addParam("errorCode", Integer.valueOf(i)).addParam("costTime", Long.valueOf(j)).setTag(String.valueOf(i2)).build());
    }

    public static long getDispatchFuncAddr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9aab0e0", new Object[0])).longValue();
        }
        return mDispatchFuncAddr;
    }

    public static int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[0])).intValue();
        }
        return mErrorCode;
    }

    public static void registerDispatchFunc(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d94b67", new Object[]{new Long(j), new Integer(i)});
        } else if (vb.c().n()) {
            mErrorCode = i;
            if (i != 0) {
                trackRegisterFailed(j, i);
            } else {
                mDispatchFuncAddr = j;
            }
        }
    }

    public static void trackFeatureProcess(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final int i, final int i2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1136b3", new Object[]{str, str2, str3, str4, str5, str6, str7, new Integer(i), new Integer(i2), new Long(j)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.sjx
                @Override // java.lang.Runnable
                public final void run() {
                    WukongBcChannel.a(str, str2, str7, str3, str4, str5, str6, i, j, i2);
                }
            });
        }
    }

    public static void trackRegisterFailed(final long j, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1133e31", new Object[]{new Long(j), new Integer(i)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.rjx
                @Override // java.lang.Runnable
                public final void run() {
                    WukongBcChannel.a(i, j);
                }
            });
        }
    }

    public static /* synthetic */ void a(int i, long j) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{new Integer(i), new Long(j)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setPhase(C1174ka.b.g).setOperation(C1174ka.a.z);
        if (i != 0) {
            i2 = -1;
        }
        TrackManager.track(operation.setStatus(i2).addParam("errorCode", Integer.valueOf(i)).addParam("funcPtr", Long.valueOf(j)).build());
    }
}
