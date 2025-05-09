package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.action.WukongActionCode;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.C1146b;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.wukong.upload.AlgoResultUploadData;
import com.alibaba.security.wukong.upload.AlgoResultUploadModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.b  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1146b extends BaseActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<AlgoResultUploadModel> f2581a = new ArrayList();

    public C1146b(Context context) {
        super(context);
    }

    public static /* synthetic */ void a(C1146b bVar, boolean z, Object obj, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b3282c", new Object[]{bVar, new Boolean(z), obj, str, str2, str3});
        } else {
            bVar.a(z, obj, str, str2, str3);
        }
    }

    public static /* synthetic */ Object ipc$super(C1146b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/b");
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public String actionPerformCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7e06921", new Object[]{this});
        }
        return WukongActionCode.RISK_REPORT_ALGO_RESULT.getName();
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public void doAccept(InferContext inferContext, String str, String str2, BaseActionPerform.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c55191", new Object[]{this, inferContext, str, str2, aVar});
            return;
        }
        String sampleID = inferContext.getSampleID();
        String metaId = inferContext.getMetaId();
        JSONArray jSONArray = (JSONArray) JSON.parseArray(str, JSONArray.class).get(0);
        Integer num = (Integer) BaseActionPerform.getSafely(jSONArray, 4, Integer.class);
        AlgoResultUploadModel algoResultUploadModel = new AlgoResultUploadModel();
        algoResultUploadModel.sampleId = sampleID;
        algoResultUploadModel.riskId = inferContext.getRiskId();
        algoResultUploadModel.metaId = metaId;
        algoResultUploadModel.algoCode = (String) BaseActionPerform.getSafely(jSONArray, 2, String.class);
        algoResultUploadModel.actionCode = actionPerformCode();
        algoResultUploadModel.eventId = inferContext.eventId;
        algoResultUploadModel.timeStamp = System.currentTimeMillis();
        algoResultUploadModel.extras = inferContext.getExtras();
        algoResultUploadModel.params = str;
        algoResultUploadModel.sign = str2;
        this.f2581a.add(algoResultUploadModel);
        if (num != null && this.f2581a.size() >= num.intValue()) {
            a(sampleID, metaId, this.f2581a);
            this.f2581a.clear();
        }
        aVar.a(null);
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f2581a.clear();
        }
    }

    private void a(String str, String str2, List<AlgoResultUploadModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
            return;
        }
        AlgoResultUploadData algoResultUploadData = new AlgoResultUploadData(getCcrcCode());
        algoResultUploadData.algoResultList = JsonUtils.toJSONString(list);
        algoResultUploadData.encry = false;
        algoResultUploadData.ts = System.currentTimeMillis();
        algoResultUploadData.pId = getPid();
        getHttpManager().a(algoResultUploadData, new Taobao(this, str, str2));
    }

    private void a(final boolean z, final Object obj, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3494fc26", new Object[]{this, new Boolean(z), obj, str, str2, str3});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.luz
                @Override // java.lang.Runnable
                public final void run() {
                    C1146b.this.a(str3, str2, z, obj, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, boolean z, Object obj, String str3) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e672a37e", new Object[]{this, str, str2, new Boolean(z), obj, str3});
            return;
        }
        TrackLog.Builder phase = TrackLog.newBuilder().setpId(getPid()).setCcrcCode(getCcrcCode()).setMetaId(str).setSampleId(str2).setOperation(C1174ka.a.g).setPhase("detect");
        if (!z) {
            i = -1;
        }
        TrackManager.track(phase.setStatus(i).setTag("MTOP").addParam("response", obj).addParam("errorMsg", str3).build());
    }
}
