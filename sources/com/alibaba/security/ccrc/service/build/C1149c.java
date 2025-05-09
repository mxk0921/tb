package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.action.WukongActionCode;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.c  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1149c extends BaseActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RiskShowCustomizedAction";

    public C1149c(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(C1149c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/c");
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public String actionPerformCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7e06921", new Object[]{this});
        }
        return WukongActionCode.RISK_BLOCKING_PAGE.getName();
    }

    @Override // com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform
    public void doAccept(InferContext inferContext, String str, String str2, BaseActionPerform.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c55191", new Object[]{this, inferContext, str, str2, aVar});
        } else {
            aVar.a(a(inferContext, str));
        }
    }

    public J a(InferContext inferContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (J) ipChange.ipc$dispatch("92c127a", new Object[]{this, inferContext, str});
        }
        J j = new J();
        j.pid = this.mConfig.getPid();
        j.ccrcCode = this.mCcrcCode;
        j.sampleID = inferContext.getSampleID();
        j.metaId = inferContext.getMetaId();
        j.actionCode = WukongActionCode.RISK_BLOCKING_PAGE;
        j.algoResults = inferContext.getAlgoResults();
        List<JSONArray> parseArray = JSON.parseArray(str, JSONArray.class);
        String str3 = null;
        if (parseArray != null && !parseArray.isEmpty()) {
            for (JSONArray jSONArray : parseArray) {
                str3 = (String) BaseActionPerform.getSafely(jSONArray, 1, String.class);
            }
        }
        if (TextUtils.isEmpty(str3)) {
            str2 = "url is empty";
        } else {
            str2 = "";
        }
        j.errorMsg = str2;
        j.success = !TextUtils.isEmpty(str3);
        j.f2559a = str3;
        return j;
    }
}
