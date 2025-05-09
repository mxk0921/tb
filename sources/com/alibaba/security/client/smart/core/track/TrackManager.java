package com.alibaba.security.client.smart.core.track;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.C1164h;
import com.alibaba.security.ccrc.service.build.C1171ja;
import com.alibaba.security.ccrc.service.build.C1178m;
import com.alibaba.security.ccrc.service.build.vb;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.easy.EasyTracker;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TrackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ITrack mTrack;

    public static Executor getExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[0]);
        }
        if (mTrack != null) {
            return mTrack.getExecutor();
        }
        return EasyTracker.getInstance(CcrcContextImpl.getContext()).getExecutor();
    }

    public static synchronized void init(Context context) {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
                return;
            }
            if (mTrack != null) {
                mTrack.init();
            } else {
                EasyTracker.getInstance(context).init();
            }
        }
    }

    public static synchronized void setTrack(ITrack iTrack) {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5a32f57", new Object[]{iTrack});
            } else {
                mTrack = iTrack;
            }
        }
    }

    public static synchronized void track(TrackLog trackLog) {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77eade78", new Object[]{trackLog});
                return;
            }
            if (vb.c().q()) {
                uploadLogByUT(trackLog);
            }
            if (vb.c().p()) {
                if (mTrack != null) {
                    mTrack.trace(trackLog);
                } else {
                    EasyTracker.getInstance(CcrcContextImpl.getContext()).trace(trackLog);
                }
            }
        }
    }

    public static void uploadLogByUT(TrackLog trackLog) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7683182a", new Object[]{trackLog});
        } else if (trackLog != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Ba.g, trackLog.pId);
            hashMap.put(InferContext.CCRC_RESULT_KEY_META_ID, trackLog.metaId);
            hashMap.put("sampleId", trackLog.sampleId);
            hashMap.put(InferContext.CCRC_RESULT_KEY_RISK_ID, trackLog.riskId);
            hashMap.put("ccrcCode", trackLog.ccrcCode);
            hashMap.put(TypedValues.CycleType.S_WAVE_PHASE, trackLog.phase);
            hashMap.put("operation", trackLog.operation);
            hashMap.put("status", String.valueOf(trackLog.status));
            hashMap.put("tag", trackLog.tag);
            hashMap.put("ts", String.valueOf(trackLog.ts));
            hashMap.put("ext", C1178m.a(JsonUtils.toJSONString(trackLog.ext).getBytes()));
            hashMap.put("params", C1178m.a(JsonUtils.toJSONString(trackLog.params).getBytes()));
            hashMap.put("appKey", CcrcContextImpl.getInstance().getAppKey());
            hashMap.put("clientInfo", C1178m.a(JsonUtils.toJSONString(C1171ja.a(CcrcContextImpl.getContext())).getBytes()));
            hashMap.put("utdid", UTDevice.getUtdid(CcrcContextImpl.getContext()));
            if (C1164h.a()) {
                str = "online";
            } else {
                str = "pre";
            }
            hashMap.put("env", str);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(Ba.i, 19997, "log", "", "", hashMap).build());
        }
    }

    public static synchronized void uploadOnce() {
        synchronized (TrackManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54595ba9", new Object[0]);
            } else {
                EasyTracker.getInstance(CcrcContextImpl.getContext()).doUploadOnce();
            }
        }
    }
}
