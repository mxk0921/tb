package com.taobao.mytaobao.pagev2.eventhandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ic1;
import tb.ob5;
import tb.p3j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DXMtbClickRecordHandler extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f11292a = "DXMtbClickRecord";

    static {
        t2o.a(745537946);
    }

    public static final /* synthetic */ String a(DXMtbClickRecordHandler dXMtbClickRecordHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41887231", new Object[]{dXMtbClickRecordHandler});
        }
        return dXMtbClickRecordHandler.f11292a;
    }

    public static /* synthetic */ Object ipc$super(DXMtbClickRecordHandler dXMtbClickRecordHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/eventhandler/DXMtbClickRecordHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        final String str = null;
        if (objArr != null) {
            obj = ic1.L(objArr, 1);
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            if (str2.length() > 0) {
                str = str2;
            }
            if (str != null) {
                p3j.g(new Runnable() { // from class: com.taobao.mytaobao.pagev2.eventhandler.DXMtbClickRecordHandler$handleEvent$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("param", (Object) str);
                        MtopRequest mtopRequest = new MtopRequest();
                        mtopRequest.setApiName("mtop.taobao.mclaren.click.info.record");
                        mtopRequest.setVersion("1.0");
                        mtopRequest.setData(JSON.toJSONString(jSONObject));
                        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
                        build.setUnitStrategy("UNIT_TRADE");
                        build.reqMethod(MethodEnum.POST);
                        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.pagev2.eventhandler.DXMtbClickRecordHandler$handleEvent$1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onError(int i, MtopResponse mtopResponse, Object obj2) {
                                String str3;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj2});
                                    return;
                                }
                                String a2 = DXMtbClickRecordHandler.a(DXMtbClickRecordHandler.this);
                                StringBuilder sb = new StringBuilder("click.info.record onError， code=");
                                String str4 = null;
                                if (mtopResponse != null) {
                                    str3 = mtopResponse.getRetCode();
                                } else {
                                    str3 = null;
                                }
                                sb.append(str3);
                                sb.append(" msg=");
                                if (mtopResponse != null) {
                                    str4 = mtopResponse.getRetMsg();
                                }
                                sb.append(str4);
                                TLog.loge(a2, sb.toString());
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteListener
                            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj2});
                                } else {
                                    TLog.loge(DXMtbClickRecordHandler.a(DXMtbClickRecordHandler.this), "click.info.record success");
                                }
                            }

                            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                            public void onSystemError(int i, MtopResponse mtopResponse, Object obj2) {
                                String str3;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj2});
                                    return;
                                }
                                String a2 = DXMtbClickRecordHandler.a(DXMtbClickRecordHandler.this);
                                StringBuilder sb = new StringBuilder("click.info.record onSystemError， code=");
                                String str4 = null;
                                if (mtopResponse != null) {
                                    str3 = mtopResponse.getRetCode();
                                } else {
                                    str3 = null;
                                }
                                sb.append(str3);
                                sb.append(" msg=");
                                if (mtopResponse != null) {
                                    str4 = mtopResponse.getRetMsg();
                                }
                                sb.append(str4);
                                TLog.loge(a2, sb.toString());
                            }
                        });
                        build.startRequest();
                    }
                });
            }
        }
    }
}
