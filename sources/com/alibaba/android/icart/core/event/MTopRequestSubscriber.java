package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.be3;
import tb.lcu;
import tb.lmb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MTopRequestSubscriber extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199446);
    }

    public static /* synthetic */ Object ipc$super(MTopRequestSubscriber mTopRequestSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/MTopRequestSubscriber");
    }

    public static /* synthetic */ void p(MTopRequestSubscriber mTopRequestSubscriber, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bdb73a5", new Object[]{mTopRequestSubscriber, jSONObject, str});
        } else {
            mTopRequestSubscriber.q(jSONObject, str);
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject c = c();
        JSONObject jSONObject = c.getJSONObject("mtopConfig");
        if (jSONObject != null) {
            String string = jSONObject.getString("apiMethod");
            String string2 = jSONObject.getString("apiVersion");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            boolean booleanValue = jSONObject.getBooleanValue("isNeedWua");
            boolean booleanValue2 = jSONObject.getBooleanValue("usePost");
            String string3 = jSONObject.getString("unitStrategy");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName(string);
                mtopRequest.setVersion(string2);
                if (jSONObject2 != null) {
                    mtopRequest.setData(jSONObject2.toJSONString());
                }
                MtopBusiness build = MtopBusiness.build(mtopRequest);
                if (booleanValue2) {
                    methodEnum = MethodEnum.POST;
                } else {
                    methodEnum = MethodEnum.GET;
                }
                build.reqMethod(methodEnum);
                if (booleanValue) {
                    build.useWua();
                }
                if ("UNIT_GUIDE".equals(string3) || "UNIT_TRADE".equals(string3)) {
                    build.setUnitStrategy(string3);
                }
                final JSONObject jSONObject3 = c.getJSONObject("toastConfig");
                if (jSONObject3 != null) {
                    build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.MTopRequestSubscriber.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                MTopRequestSubscriber.p(MTopRequestSubscriber.this, jSONObject3, "error");
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            } else {
                                MTopRequestSubscriber.p(MTopRequestSubscriber.this, jSONObject3, "success");
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                MTopRequestSubscriber.p(MTopRequestSubscriber.this, jSONObject3, "error");
                            }
                        }
                    });
                }
                build.startRequest();
            }
        }
    }

    public final void q(JSONObject jSONObject, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1a4469", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null && (string = jSONObject.getString(str)) != null) {
            be3.c(this.b, string);
        }
    }
}
