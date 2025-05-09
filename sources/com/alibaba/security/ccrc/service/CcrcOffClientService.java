package com.alibaba.security.ccrc.service;

import android.util.Pair;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.CcrcOffClientService;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.E;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.ccrc.service.build.RunnableC1196va;
import com.alibaba.security.ccrc.service.build.ThreadFactoryC1192ta;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CcrcOffClientService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CCRC_TAOBAO_OFF_CLIENT_RISK = "ccrc_taobao_off_client_risk";
    public static final String TAG = "CcrcOffClientService";
    public final CcrcService.Config mActivateConfig;
    public final CcrcService mCcrcService;
    public final ThreadPoolExecutor mThreadPoolExecutor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final CcrcOffClientService f2538a = new CcrcOffClientService();

        public static /* synthetic */ CcrcOffClientService a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcOffClientService) ipChange.ipc$dispatch("12e96e27", new Object[0]);
            }
            return f2538a;
        }
    }

    public static synchronized CcrcOffClientService getService() {
        synchronized (CcrcOffClientService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcOffClientService) ipChange.ipc$dispatch("1c410149", new Object[0]);
            }
            return a.f2538a;
        }
    }

    private void trackDetect(final String str, final Pair<RiskShowCustomizedResult, Boolean> pair, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665c4f8a", new Object[]{this, str, pair, map});
        } else {
            this.mThreadPoolExecutor.submit(new Runnable() { // from class: tb.fg3
                @Override // java.lang.Runnable
                public final void run() {
                    CcrcOffClientService.a(str, pair, map);
                }
            });
        }
    }

    public RiskShowCustomizedResult detectWithActivate(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RiskShowCustomizedResult) ipChange.ipc$dispatch("bc4642ef", new Object[]{this, map});
        }
        if (this.mCcrcService == null) {
            return E.a("CCRC service instance is null");
        }
        if (map == null || map.isEmpty()) {
            return E.a("CCRC params error");
        }
        RunnableC1196va vaVar = new RunnableC1196va(this.mCcrcService, this.mActivateConfig, map);
        this.mThreadPoolExecutor.execute(vaVar);
        Pair<RiskShowCustomizedResult, Boolean> a2 = vaVar.a(20L);
        trackDetect(this.mCcrcService.getCcrcServiceManager().d(), a2, map);
        return (RiskShowCustomizedResult) a2.first;
    }

    public CcrcOffClientService() {
        this.mCcrcService = CcrcService.getService(CCRC_TAOBAO_OFF_CLIENT_RISK);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1192ta("wukong_off_client"));
        this.mThreadPoolExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(false);
        CcrcService.Config.Builder builder = new CcrcService.Config.Builder();
        StringBuilder a2 = Kb.a("PID_OC_");
        a2.append(UUID.randomUUID().toString());
        this.mActivateConfig = builder.setPid(a2.toString()).build();
    }

    public static /* synthetic */ void a(String str, Pair pair, Map map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5bdb1d", new Object[]{str, pair, map});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(CCRC_TAOBAO_OFF_CLIENT_RISK).setPhase(C1174ka.b.e).setOperation(C1174ka.a.s);
        if (!((Boolean) pair.second).booleanValue()) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).addParam("inputParams", JsonUtils.toJSONString(map)).addParam("isSuccess", Boolean.valueOf(((RiskShowCustomizedResult) pair.first).isSuccess())).addParam("errorMsg", ((RiskShowCustomizedResult) pair.first).getErrorMsg()).build());
        TrackManager.uploadOnce();
    }
}
