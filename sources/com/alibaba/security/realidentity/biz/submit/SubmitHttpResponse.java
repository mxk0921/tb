package com.alibaba.security.realidentity.biz.submit;

import com.alibaba.security.common.http.model.HttpResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SubmitHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUDIT_PASS = 1;
    public Result result;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class AuditStatus implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int code;
        public String desc;
        public String name;
        public String subCode;

        public boolean isSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
            }
            if (this.code == 1) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class MaterialDetail implements Serializable {
        public String code;
        public String display;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class RPAuditDetail implements Serializable {
        public List<MaterialDetail> materialDetail;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class RPAuditResult implements Serializable {
        public AuditStatus auditStatus;
        public RPAuditDetail rpAuditDetails;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Result implements Serializable {
        public RPAuditResult rpAuditResult;
    }

    public static /* synthetic */ Object ipc$super(SubmitHttpResponse submitHttpResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/biz/submit/SubmitHttpResponse");
    }

    public String getDisplayMsg() {
        RPAuditResult rPAuditResult;
        RPAuditDetail rPAuditDetail;
        List<MaterialDetail> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f986c4", new Object[]{this});
        }
        Result result = this.result;
        if (result == null || (rPAuditResult = result.rpAuditResult) == null || (rPAuditDetail = rPAuditResult.rpAuditDetails) == null || (list = rPAuditDetail.materialDetail) == null || list.size() <= 0) {
            return null;
        }
        return this.result.rpAuditResult.rpAuditDetails.materialDetail.get(0).display;
    }

    public int getStatus() {
        RPAuditResult rPAuditResult;
        AuditStatus auditStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        Result result = this.result;
        if (result == null || (rPAuditResult = result.rpAuditResult) == null || (auditStatus = rPAuditResult.auditStatus) == null) {
            return -10000;
        }
        return auditStatus.code;
    }

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        RPAuditResult rPAuditResult;
        AuditStatus auditStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        Result result = this.result;
        if (result == null || (rPAuditResult = result.rpAuditResult) == null || (auditStatus = rPAuditResult.auditStatus) == null || !auditStatus.isSuccess()) {
            return false;
        }
        return true;
    }
}
