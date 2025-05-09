package com.alibaba.security.realidentity;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;
import com.alibaba.security.realidentity.biz.bucket.BucketParams;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.biz.start.StartHttpRequest;
import com.alibaba.security.realidentity.biz.start.StartHttpResponse;
import com.alibaba.security.realidentity.biz.start.UploadToken;
import com.alibaba.security.realidentity.biz.start.model.StartExtraInfo;
import com.alibaba.security.realidentity.biz.start.model.StepItem;
import com.alibaba.security.realidentity.service.sensor.model.SensorInfo;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.GetSensorInfoApi;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v1 extends o1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public StartHttpResponse g;
    public SensorInfo h;
    public String i;
    public boolean l;
    public boolean m;
    public Map<String, String> r;
    public String s;
    public UploadToken j = new UploadToken();
    public boolean k = false;
    public int n = 0;
    public boolean o = true;
    public boolean p = false;
    public boolean q = false;

    public v1(Context context, RPBizConfig rPBizConfig) {
        super(context, rPBizConfig);
    }

    public static /* synthetic */ Object ipc$super(v1 v1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/v1");
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public boolean b(h1 h1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87f3572e", new Object[]{this, h1Var})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public BucketParams.ErrorCode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketParams.ErrorCode) ipChange.ipc$dispatch("838b0e76", new Object[]{this});
        }
        StartHttpResponse startHttpResponse = this.g;
        if (startHttpResponse == null) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.A), "start api fail", e2.A);
        }
        if (startHttpResponse.isSuccessful()) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_PASS, String.valueOf(0), "success", 0);
        }
        if (this.g.isRepeatedSubmitted()) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_PASS, String.valueOf(0), "the verification has passed", 0);
        }
        if (!TextUtils.isEmpty(this.g.retCode)) {
            return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.A), this.g.retMsg, e2.A);
        }
        return new BucketParams.ErrorCode(RPResult.AUDIT_NOT, String.valueOf((int) e2.A), b.a(this.g), e2.A);
    }

    public SensorInfo f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SensorInfo) ipChange.ipc$dispatch("727dbcfa", new Object[]{this});
        }
        return this.h;
    }

    public void a(SensorInfo sensorInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4c3cb5", new Object[]{this, sensorInfo});
        } else {
            this.h = sensorInfo;
        }
    }

    @Override // com.alibaba.security.realidentity.biz.bucket.BucketParams
    public HttpRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpRequest) ipChange.ipc$dispatch("1def818d", new Object[]{this});
        }
        String a2 = c.a(r.a().a(this.c, this.b));
        ClientInfo clientInfo = new ClientInfo(this.c);
        clientInfo.setVersionTag(a2);
        StartHttpRequest startHttpRequest = new StartHttpRequest(this.b, b.a(clientInfo));
        if (this.h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(GetSensorInfoApi.NAME_KEY_SENSOR_INFO, this.h);
            startHttpRequest.extendMap = b.a((Object) hashMap);
        }
        a(startHttpRequest);
        return startHttpRequest;
    }

    /* renamed from: c */
    public v1 a(HttpResponse httpResponse) {
        StepItem.JsonAssist jsonAssistBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v1) ipChange.ipc$dispatch("e846cd4e", new Object[]{this, httpResponse});
        }
        if (httpResponse instanceof StartHttpResponse) {
            StartHttpResponse startHttpResponse = (StartHttpResponse) httpResponse;
            this.g = startHttpResponse;
            StepItem biometricsStepItem = startHttpResponse.getBiometricsStepItem();
            if (!(biometricsStepItem == null || (jsonAssistBean = biometricsStepItem.getJsonAssistBean()) == null)) {
                this.o = jsonAssistBean.needActionImage;
                this.k = jsonAssistBean.onlyGaze;
                this.l = jsonAssistBean.showNav;
                this.p = jsonAssistBean.needGaze;
                this.q = jsonAssistBean.needOriginalImage;
            }
            StartHttpResponse.ResultBean resultBean = startHttpResponse.result;
            String str = null;
            this.r = resultBean == null ? null : resultBean.verifyConf;
            if (resultBean != null) {
                str = resultBean.bizConf;
            }
            this.s = str;
            StartExtraInfo extraInfoBean = startHttpResponse.getExtraInfoBean();
            if (extraInfoBean != null) {
                this.i = extraInfoBean.livenessConfig;
            }
            RPConfig rpConfig = this.d.getRpConfig();
            if (!(rpConfig == null || rpConfig.getBiometricsConfig() == null)) {
                this.m = rpConfig.getBiometricsConfig().isNeedFailResultPage();
            }
        }
        return this;
    }
}
