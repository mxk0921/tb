package com.alibaba.security.client.smart.core.wukong.action;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.AbstractC1157eb;
import com.alibaba.security.ccrc.service.build.AbstractC1167i;
import com.alibaba.security.ccrc.service.build.AbstractC1189s;
import com.alibaba.security.ccrc.service.build.C1164h;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.ccrc.service.model.AbsWukongActionRiskResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseActionPerform";
    public String mCcrcCode;
    public CcrcService.Config mConfig;
    public Context mContext;
    public AbstractC1167i mHttp;
    public AbstractC1189s mOnCcrcLifeCallback;
    public AbstractC1157eb mServiceAbility;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(AbsWukongActionRiskResult absWukongActionRiskResult);
    }

    public BaseActionPerform(Context context) {
        this.mContext = context;
    }

    public static <T> T getSafely(JSONArray jSONArray, int i, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d40b90f9", new Object[]{jSONArray, new Integer(i), cls});
        }
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.size() > i) {
                return (T) jSONArray.getObject(i, cls);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private void reportActionPerform(final InferContext inferContext, final String str, final String str2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe5ef68", new Object[]{this, inferContext, str, str2, new Long(j)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.oq1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseActionPerform.this.a(inferContext, j, str, str2);
                }
            });
        }
    }

    public void accept(InferContext inferContext, String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdd141c", new Object[]{this, inferContext, str, str2, aVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        doAccept(inferContext, str, str2, aVar);
        reportActionPerform(inferContext, str, str2, currentTimeMillis);
    }

    public abstract String actionPerformCode();

    public void activate(String str, CcrcService.Config config, AbstractC1189s sVar, AbstractC1157eb ebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3f1fd9", new Object[]{this, str, config, sVar, ebVar});
            return;
        }
        this.mOnCcrcLifeCallback = sVar;
        this.mServiceAbility = ebVar;
        this.mConfig = config;
        this.mCcrcCode = str;
    }

    public abstract void doAccept(InferContext inferContext, String str, String str2, a aVar);

    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this});
        }
        return this.mCcrcCode;
    }

    public synchronized AbstractC1167i getHttpManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractC1167i) ipChange.ipc$dispatch("2f01aca9", new Object[]{this});
        }
        if (this.mHttp == null) {
            this.mHttp = new C1164h(this.mContext);
        }
        return this.mHttp;
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        return this.mConfig.getPid();
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InferContext inferContext, long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ed00fa", new Object[]{this, inferContext, new Long(j), str, str2});
            return;
        }
        TrackLog.Builder phase = TrackLog.newBuilder().setpId(getPid()).setCcrcCode(getCcrcCode()).setMetaId(inferContext.getMetaId()).setSampleId(inferContext.getSampleID()).setPhase("detect");
        StringBuilder a2 = Kb.a("action_");
        a2.append(actionPerformCode());
        TrackManager.track(phase.setOperation(a2.toString()).setStatus(0).addParam("context", JsonUtils.toJSONString(inferContext)).addParam("costTime", Long.valueOf(System.currentTimeMillis() - j)).addParam("params", str).addParam("sign", str2).build());
    }
}
