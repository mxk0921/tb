package com.alibaba.security.wukong.bx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.C1180n;
import com.alibaba.security.ccrc.service.build.I;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.ccrc.service.build.La;
import com.alibaba.security.ccrc.service.build.Qa;
import com.alibaba.security.ccrc.service.build.ThreadFactoryC1192ta;
import com.alibaba.security.ccrc.service.model.WukongActivateRiskResult;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CcrcBHService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BX_BROADCAST_ACTION = "BehaviX_WukongDetectNotification";
    public static final String BX_KEY_FEATURE = "feature";
    public static final int MAX_LIMIT_SIZE = 1;
    public static final String TAG = "CcrcBHService";
    public static final String UT_PAGE_CCRC_SEQ_RISK = "ccrc_seq_risk";
    public final String mCcrcCode;
    public final CcrcService mService;
    public final ThreadPoolExecutor mThreadPoolExecutor;
    public static final Map<String, CcrcBHService> SERVICE_MAP = new HashMap();
    public static final AtomicInteger mDetectCallCounter = new AtomicInteger(0);
    public final Queue<Object> mBxFeatureQueue = new ConcurrentLinkedQueue();
    public final La mBehaviorDataManager = new La();
    public final AtomicBoolean mIsReceiverRegistered = new AtomicBoolean(false);
    public final BroadcastReceiver mReceiver = new Qa(this);

    public CcrcBHService(String str) {
        this.mCcrcCode = str;
        this.mService = CcrcService.getService(str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1192ta(TAG));
        this.mThreadPoolExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.mService != null) {
            doActivate();
        }
    }

    public static /* synthetic */ void access$000(CcrcBHService ccrcBHService, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37350df7", new Object[]{ccrcBHService, obj});
        } else {
            ccrcBHService.enqueueAndDetect(obj);
        }
    }

    private void doActivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f59025", new Object[]{this});
            return;
        }
        CcrcService.Config.Builder builder = new CcrcService.Config.Builder();
        String uuid = UUID.randomUUID().toString();
        this.mService.activate(builder.setPid("BX_" + uuid).build(), new I() { // from class: tb.ag3
            @Override // com.alibaba.security.ccrc.service.build.I
            public final void a(WukongActivateRiskResult wukongActivateRiskResult) {
                CcrcBHService.this.a(wukongActivateRiskResult);
            }
        });
    }

    private synchronized void enqueueAndDetect(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcfd955", new Object[]{this, obj});
            return;
        }
        if (this.mBxFeatureQueue.size() >= 1) {
            this.mBxFeatureQueue.poll();
        }
        this.mBxFeatureQueue.offer(obj);
        triggerDetect();
    }

    public static synchronized CcrcBHService getBHService(String str) {
        synchronized (CcrcBHService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcBHService) ipChange.ipc$dispatch("89bfcff0", new Object[]{str});
            } else if (TextUtils.isEmpty(str)) {
                Logging.e(TAG, "ccrcCode is null");
                return null;
            } else if (CcrcContextImpl.getContext() == null) {
                Logging.e(TAG, "ccrc context is not init yet");
                return null;
            } else {
                Map<String, CcrcBHService> map = SERVICE_MAP;
                if (!map.containsKey(str) || map.get(str) == null) {
                    CcrcBHService ccrcBHService = new CcrcBHService(str);
                    map.put(str, ccrcBHService);
                    return ccrcBHService;
                }
                return map.get(str);
            }
        }
    }

    private boolean isSwitchClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed76af95", new Object[]{this})).booleanValue();
        }
        CcrcService ccrcService = this.mService;
        if (ccrcService == null) {
            return false;
        }
        return ccrcService.isSwitchClosed();
    }

    private void registerBxReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef98fef", new Object[]{this});
        } else if (!this.mIsReceiverRegistered.get()) {
            Context context = CcrcContextImpl.getContext();
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(BX_BROADCAST_ACTION);
                StringBuilder a2 = Kb.a("BehaviX_");
                a2.append(this.mCcrcCode);
                intentFilter.addAction(a2.toString());
                LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(this.mReceiver, intentFilter);
            }
            this.mIsReceiverRegistered.set(true);
        }
    }

    private void trackBhDetectLog(final Map<String, String> map, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ce5055", new Object[]{this, map, new Integer(i)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.dg3
                @Override // java.lang.Runnable
                public final void run() {
                    CcrcBHService.this.a(map, i);
                }
            });
        }
    }

    private void trackBhNotifyDetectLog(final Object obj, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60325d8a", new Object[]{this, obj, new Boolean(z)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.zf3
                @Override // java.lang.Runnable
                public final void run() {
                    CcrcBHService.this.a(obj, z);
                }
            });
        }
    }

    private void triggerDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b950d82", new Object[]{this});
            return;
        }
        CcrcService ccrcService = this.mService;
        if (ccrcService != null && ccrcService.isActivate()) {
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: tb.cg3
                @Override // java.lang.Runnable
                public final void run() {
                    CcrcBHService.this.c();
                }
            });
        }
    }

    private void triggerUtTracker(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1973dbd", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(UT_PAGE_CCRC_SEQ_RISK, 2101, this.mCcrcCode, "", "", map).build());
        }
    }

    private void unregisterBxReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cffb5c8", new Object[]{this});
        } else if (this.mIsReceiverRegistered.get()) {
            Context context = CcrcContextImpl.getContext();
            if (context != null) {
                LocalBroadcastManager.getInstance(context.getApplicationContext()).unregisterReceiver(this.mReceiver);
            }
            this.mIsReceiverRegistered.set(false);
        }
    }

    public void activate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b7a7fa", new Object[]{this});
        } else if (!isSwitchClosed() && CcrcContextImpl.getContext() != null) {
            registerBxReceiver();
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: tb.eg3
                @Override // java.lang.Runnable
                public final void run() {
                    CcrcBHService.this.a();
                }
            });
        }
    }

    public void deActivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d74f1b", new Object[]{this});
        } else if (!isSwitchClosed() && CcrcContextImpl.getContext() != null) {
            unregisterBxReceiver();
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: tb.bg3
                @Override // java.lang.Runnable
                public final void run() {
                    CcrcBHService.this.b();
                }
            });
        }
    }

    public void detect(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b23709b", new Object[]{this, map});
        } else if (!isSwitchClosed()) {
            AtomicInteger atomicInteger = mDetectCallCounter;
            trackBhDetectLog(map, atomicInteger.get());
            if (atomicInteger.getAndIncrement() % this.mService.getDetectFrequency() == 0) {
                triggerUtTracker(map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        CcrcService ccrcService = this.mService;
        if (ccrcService != null) {
            ccrcService.deActivate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.mBxFeatureQueue.isEmpty()) {
            doDetect();
        }
    }

    private void doDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93559895", new Object[]{this});
            return;
        }
        Object poll = this.mBxFeatureQueue.poll();
        trackBhNotifyDetectLog(poll, this.mService.isActivate());
        BehaviorRiskSample a2 = this.mBehaviorDataManager.a(this.mService.getCcrcServiceManager(), poll);
        if (a2 == null) {
            this.mBehaviorDataManager.b(this.mService.getPid(), this.mCcrcCode, -1, "risk sample is empty", JsonUtils.toJSONString(poll));
        } else {
            a2.detect(this.mService, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WukongActivateRiskResult wukongActivateRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41e362d", new Object[]{this, wukongActivateRiskResult});
        } else {
            triggerDetect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00a486", new Object[]{this, map, new Integer(i)});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(this.mService.getPid()).setCcrcCode(this.mCcrcCode).setPhase(C1174ka.b.e).setOperation(C1174ka.a.q).setStatus(0).addParam("input", JsonUtils.toJSONString(map)).addParam("detectCount", Integer.valueOf(i)).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        String jSONString = JsonUtils.toJSONString(obj);
        if (C1180n.a(jSONString)) {
            jSONString = "features over limit size";
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(this.mService.getPid()).setCcrcCode(this.mCcrcCode).setPhase(C1174ka.b.e).setOperation(C1174ka.a.r);
        if (TextUtils.isEmpty(jSONString)) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).addParam("features", jSONString).addParam("isActivate", Boolean.valueOf(z)).build());
    }
}
