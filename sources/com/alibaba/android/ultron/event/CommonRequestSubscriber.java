package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.android.ultron.engine.utils.ErrorConstants;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b8v;
import tb.fsb;
import tb.l6v;
import tb.lbq;
import tb.o5e;
import tb.t2o;
import tb.u55;
import tb.y6v;
import tb.yv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CommonRequestSubscriber extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = false;
    public static final String FIELDS_KEY_MTOP_CONFIG = "mtopConfig";
    public static final String TAG = "CommonRequestSubscriber";
    public String j = null;

    static {
        t2o.a(157286516);
    }

    public static /* synthetic */ Object ipc$super(CommonRequestSubscriber commonRequestSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonRequestSubscriber");
    }

    public static /* synthetic */ void x(CommonRequestSubscriber commonRequestSubscriber, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78248d93", new Object[]{commonRequestSubscriber, str});
        } else {
            commonRequestSubscriber.z(str);
        }
    }

    public static /* synthetic */ JSONObject y(CommonRequestSubscriber commonRequestSubscriber, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d7578b46", new Object[]{commonRequestSubscriber, jSONObject});
        }
        return commonRequestSubscriber.A(jSONObject);
    }

    public final JSONObject A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ddc442e", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return JSON.parseObject(jSONObject.toJSONString());
        }
        return null;
    }

    public final String B(fsb fsbVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f82af61d", new Object[]{this, fsbVar, iDMComponent});
        }
        if (!(fsbVar instanceof u55)) {
            return "";
        }
        u55 u55Var = (u55) fsbVar;
        return u55Var.v().a(u55Var, iDMComponent);
    }

    public JSONObject C(MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b44ffd84", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata()));
        } catch (Throwable th) {
            fsb fsbVar = this.d;
            if (fsbVar == null) {
                str = "Ultron";
            } else {
                str = fsbVar.getBizName();
            }
            lbq.c(str, "CommonRequestSubscriber.getMtopReturnData", th);
            return null;
        }
    }

    public final String D(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("548b4467", new Object[]{this, fsbVar});
        }
        if (!(fsbVar instanceof u55)) {
            return "";
        }
        u55 u55Var = (u55) fsbVar;
        return u55Var.v().t(u55Var);
    }

    public boolean E(MtopRequest mtopRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95dce3b7", new Object[]{this, mtopRequest, jSONObject})).booleanValue();
        }
        if (mtopRequest == null || jSONObject == null) {
            return false;
        }
        mtopRequest.setData(jSONObject.toJSONString());
        return true;
    }

    public CommonRequestSubscriber F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonRequestSubscriber) ipChange.ipc$dispatch("d17243fe", new Object[]{this, str});
        }
        this.j = str;
        return this;
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6909f25", new Object[]{this, str});
        } else if (yv6.b(this.b)) {
            Toast.makeText(this.b, str, 0).show();
        }
    }

    @Override // tb.l6v
    public void t(final b8v b8vVar) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        JSONObject fields = j().getFields();
        if (fields == null) {
            UnifyLog.m(this.d.getBizName(), TAG, "error: eventFields is null", new String[0]);
            String bizName = this.d.getBizName();
            ErrorConstants errorConstants = ErrorConstants.EVENT_FIELDS_NULL;
            lbq.b(bizName, TAG, errorConstants.errorCode(), errorConstants.errorMessage());
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject jSONObject = fields.getJSONObject("mtopConfig");
        final JSONObject jSONObject2 = fields.getJSONObject("next");
        final String string = fields.getString("subfilter");
        if (jSONObject == null) {
            UnifyLog.m(this.d.getBizName(), TAG, "error: mtopConfig is null", new String[0]);
            String bizName2 = this.d.getBizName();
            ErrorConstants errorConstants2 = ErrorConstants.EVENT_MTOP_CONFIG_NULL;
            lbq.b(bizName2, TAG, errorConstants2.errorCode(), errorConstants2.errorMessage());
            return;
        }
        final String string2 = jSONObject.getString("responseKey");
        String string3 = jSONObject.getString("apiMethod");
        String string4 = jSONObject.getString("apiVersion");
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        boolean equals = "true".equals(jSONObject.getString("isNeedWua"));
        boolean equals2 = "true".equals(jSONObject.getString("usePost"));
        String string5 = jSONObject.getString("unitStrategy");
        if ("UNIT_GUIDE".equals(string5) || "UNIT_TRADE".equals(string5)) {
            this.j = string5;
        }
        o5e n = b8vVar.n();
        String string6 = jSONObject.getString("requestType");
        HashMap hashMap = new HashMap();
        if (TextUtils.equals(string6, "async")) {
            hashMap.put("params", B(n.b(), b8vVar.d()));
        } else if (TextUtils.equals(string6, "submit")) {
            hashMap.put("params", D(n.b()));
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.putAll(hashMap);
        if (jSONObject3 != null) {
            jSONObject4.putAll(jSONObject3);
        }
        E(mtopRequest, jSONObject4);
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4)) {
            UnifyLog.m(this.d.getBizName(), TAG, "error: apiMethod or apiVersion is null", new String[0]);
            return;
        }
        JSONObject jSONObject5 = fields.getJSONObject("loadingConfig");
        if (jSONObject5 != null) {
            b8vVar.n().c(jSONObject5.getString("message"));
        }
        mtopRequest.setApiName(string3);
        mtopRequest.setVersion(string4);
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        if (equals2) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        build.reqMethod(methodEnum);
        if (equals) {
            build.useWua();
        }
        String str = this.j;
        if (str != null) {
            build.setUnitStrategy(str);
        }
        final IDMComponent d = b8vVar.d();
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.event.CommonRequestSubscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String bizName3 = CommonRequestSubscriber.this.d.getBizName();
                UnifyLog.m(bizName3, CommonRequestSubscriber.TAG, mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg(), new String[0]);
                o5e n2 = b8vVar.n();
                n2.hideLoading();
                JSONObject C = CommonRequestSubscriber.this.C(mtopResponse);
                if (d != null && (n2 instanceof a)) {
                    a aVar = (a) n2;
                    if (aVar.F() != null && aVar.F().o()) {
                        CommonRequestSubscriber.this.e = d;
                    }
                }
                if (y6v.e(n2.getBizName(), y6v.b.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("message", (Object) mtopResponse.getRetMsg());
                    CommonRequestSubscriber.this.p(jSONObject2.getJSONArray("fail"), mtopResponse, string2, C, mtopResponse, jSONObject6);
                } else {
                    CommonRequestSubscriber.this.o(jSONObject2.getJSONArray("fail"), mtopResponse, string2, C, mtopResponse);
                }
                CommonRequestSubscriber commonRequestSubscriber = CommonRequestSubscriber.this;
                CommonRequestSubscriber.x(commonRequestSubscriber, "onError:" + mtopResponse.getApi());
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
                if (r2.F().y() != false) goto L_0x007d;
             */
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSuccess(int r10, mtopsdk.mtop.domain.MtopResponse r11, mtopsdk.mtop.domain.BaseOutDo r12, java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 299
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.event.CommonRequestSubscriber.AnonymousClass1.onSuccess(int, mtopsdk.mtop.domain.MtopResponse, mtopsdk.mtop.domain.BaseOutDo, java.lang.Object):void");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String bizName3 = CommonRequestSubscriber.this.d.getBizName();
                UnifyLog.m(bizName3, CommonRequestSubscriber.TAG, mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg(), new String[0]);
                o5e n2 = b8vVar.n();
                n2.hideLoading();
                JSONObject C = CommonRequestSubscriber.this.C(mtopResponse);
                if (d != null && (n2 instanceof a)) {
                    a aVar = (a) n2;
                    if (aVar.F() != null && aVar.F().o()) {
                        CommonRequestSubscriber.this.e = d;
                    }
                }
                if (y6v.e(n2.getBizName(), y6v.b.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("message", (Object) mtopResponse.getRetMsg());
                    CommonRequestSubscriber.this.p(jSONObject2.getJSONArray("fail"), mtopResponse, string2, C, mtopResponse, jSONObject6);
                } else {
                    CommonRequestSubscriber.this.o(jSONObject2.getJSONArray("fail"), mtopResponse, string2, C, mtopResponse);
                }
                CommonRequestSubscriber commonRequestSubscriber = CommonRequestSubscriber.this;
                CommonRequestSubscriber.x(commonRequestSubscriber, "onSystemError:" + mtopResponse.getApi());
            }
        });
        String bizName3 = this.d.getBizName();
        UnifyLog.m(bizName3, TAG, "start execute: " + string3, new String[0]);
        build.startRequest();
    }
}
