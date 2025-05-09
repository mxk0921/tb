package com.alibaba.security.realidentity.biz.start;

import android.text.TextUtils;
import com.alibaba.security.common.http.model.HttpResponse;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.start.model.StartExtraInfo;
import com.alibaba.security.realidentity.biz.start.model.StartStatusResult;
import com.alibaba.security.realidentity.biz.start.model.StepItem;
import com.alibaba.security.realidentity.biz.start.model.StepType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StartHttpResponse extends HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAIL_BIZ_LOGIN_OUT = "FAIL_BIZ_LOGIN_OUT";
    public static final String MTOP_VERIFY_FAIL_OVER_LIMIT = "FAIL_BIZ_VERIFY_FAIL_OVER_LIMIT";
    public ResultBean result;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Property implements Serializable {
        public boolean optional;
        public StepProperty property;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ResultBean implements Serializable {
        public String biz;
        public String bizConf;
        public String extraInfo;
        public String source;
        public List<StepItem> steps;
        public UploadToken uploadToken;
        public Map<String, String> verifyConf;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class StepProperty implements Serializable {
        public String code;
        public String name;
    }

    public static /* synthetic */ Object ipc$super(StartHttpResponse startHttpResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/biz/start/StartHttpResponse");
    }

    public StepItem getBiometricsStepItem() {
        List<StepItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StepItem) ipChange.ipc$dispatch("cea7d0fb", new Object[]{this});
        }
        ResultBean resultBean = this.result;
        if (!(resultBean == null || (list = resultBean.steps) == null || list.isEmpty())) {
            for (StepItem stepItem : this.result.steps) {
                StepType stepType = stepItem.stepType;
                if (stepType != null && "BIOMETRIC_CHECK".equals(stepType.name)) {
                    return stepItem;
                }
            }
        }
        return null;
    }

    public StartExtraInfo getExtraInfoBean() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StartExtraInfo) ipChange.ipc$dispatch("d38796", new Object[]{this});
        }
        ResultBean resultBean = this.result;
        if (resultBean != null) {
            str = resultBean.extraInfo;
        } else {
            str = "";
        }
        return (StartExtraInfo) b.b(str, StartExtraInfo.class);
    }

    public boolean isLimited() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1551199b", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.retCode, MTOP_VERIFY_FAIL_OVER_LIMIT);
    }

    public boolean isNeedLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4272ce74", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.retCode, FAIL_BIZ_LOGIN_OUT);
    }

    public boolean isRepeatedSubmitted() {
        StartExtraInfo extraInfoBean;
        StartStatusResult startStatusResult;
        StartStatusResult.AuditStatus auditStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acdf5fa2", new Object[]{this})).booleanValue();
        }
        if (this.result == null || (extraInfoBean = getExtraInfoBean()) == null || (startStatusResult = extraInfoBean.rpStatusResult) == null || (auditStatus = startStatusResult.rpAuditStatus) == null || auditStatus.code != 1) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.security.common.http.model.HttpResponse
    public boolean isSuccessful() {
        ResultBean resultBean;
        List<StepItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("349bd9ef", new Object[]{this})).booleanValue();
        }
        if (!isRepeatedSubmitted() && (resultBean = this.result) != null && (list = resultBean.steps) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Integer> obtainBioSteps(RPBizConfig rPBizConfig) {
        StepProperty stepProperty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("19456bc9", new Object[]{this, rPBizConfig});
        }
        StepItem biometricsStepItem = getBiometricsStepItem();
        if (biometricsStepItem == null) {
            return new ArrayList<>();
        }
        List<Property> list = biometricsStepItem.properties;
        if (list == null || list.size() == 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Property property : biometricsStepItem.properties) {
            if (this.result != null && rPBizConfig.getDegradeConfig().isDazzleBioOpen && (stepProperty = property.property) != null && "BIOMETRIC_COLORFUL".equals(stepProperty.name)) {
                arrayList.add(2);
            }
            StepProperty stepProperty2 = property.property;
            if (stepProperty2 != null && "Biometric".equals(stepProperty2.name)) {
                arrayList.add(1);
            }
        }
        return arrayList;
    }

    public String obtainDazzleConfig() {
        StepItem.JsonAssist jsonAssistBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8d7843c", new Object[]{this});
        }
        StepItem biometricsStepItem = getBiometricsStepItem();
        if (biometricsStepItem == null || (jsonAssistBean = biometricsStepItem.getJsonAssistBean()) == null) {
            return null;
        }
        return jsonAssistBean.bioColorfulConf;
    }
}
