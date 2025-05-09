package com.taobao.mytaobao.ability;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ckf;
import tb.p3j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbMtopAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbMtopAbility INSTANCE = new MtbMtopAbility();

    static {
        t2o.a(745537544);
    }

    public final void a(final JSONObject jSONObject, final JSONObject jSONObject2, final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8909b077", new Object[]{this, jSONObject, jSONObject2, iRemoteBaseListener});
            return;
        }
        ckf.h(jSONObject, "mtopConfig");
        p3j.g(new Runnable() { // from class: com.taobao.mytaobao.ability.MtbMtopAbility$coreRequestMtop$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                JSONObject jSONObject3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String string = JSONObject.this.getString("api");
                if (string != null) {
                    String string2 = JSONObject.this.getString("version");
                    if (string2 == null) {
                        string2 = "1.0";
                    }
                    String string3 = JSONObject.this.getString("strategy");
                    String string4 = JSONObject.this.getString("params");
                    MtopRequest mtopRequest = new MtopRequest();
                    mtopRequest.setApiName(string);
                    mtopRequest.setVersion(string2);
                    if (string4 != null && jSONObject2 == null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("param", (Object) string4);
                        str = JSON.toJSONString(jSONObject4);
                    } else if (string4 == null && jSONObject2 == null) {
                        str = null;
                    } else {
                        if (string4 != null) {
                            jSONObject3 = JSON.parseObject(string4);
                        } else {
                            jSONObject3 = new JSONObject();
                        }
                        JSONObject jSONObject5 = jSONObject2;
                        if (jSONObject5 != null) {
                            jSONObject3.putAll(jSONObject5);
                        }
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("param", (Object) jSONObject3.toJSONString());
                        str = JSON.toJSONString(jSONObject6);
                    }
                    if (str != null) {
                        mtopRequest.setData(str);
                    }
                    MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
                    if (string3 == null) {
                        build.setUnitStrategy("UNIT_TRADE");
                    } else {
                        build.setUnitStrategy(string3);
                    }
                    build.reqMethod(MethodEnum.POST);
                    build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.ability.MtbMtopAbility$coreRequestMtop$1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                            if (iRemoteBaseListener2 != null) {
                                iRemoteBaseListener2.onError(i, mtopResponse, obj);
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                            if (iRemoteBaseListener2 != null) {
                                iRemoteBaseListener2.onSuccess(i, mtopResponse, baseOutDo, obj);
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                return;
                            }
                            IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                            if (iRemoteBaseListener2 != null) {
                                iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
                            }
                        }
                    });
                    build.startRequest();
                }
            }
        });
    }
}
