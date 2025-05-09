package com.alibaba.evo.internal.downloader;

import android.content.Context;
import com.alibaba.evo.internal.event.ExperimentWhitelistDataV5;
import com.alibaba.evo.internal.request.MtopResponseOutDo;
import com.alibaba.ut.abtest.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Set;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import tb.bj8;
import tb.bqm;
import tb.lo8;
import tb.mcp;
import tb.n;
import tb.ogh;
import tb.t2o;
import tb.uwf;
import tb.ydt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExperimentIndexMtopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544233);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98431cb7", new Object[]{context});
        } else if (!n.j().a().i()) {
            ogh.i("ExperimentIndexMtopRequest", "isMtopIndexEnable=false");
        } else {
            long b = bqm.a().b("nextAvailableTime", -1L);
            if (b <= 0 || b <= mcp.a()) {
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName("mtop.tmall.ant.api.core.allocate");
                mtopRequest.setVersion("1.0");
                mtopRequest.setNeedEcode(false);
                HashMap hashMap = new HashMap();
                hashMap.put("configVersion", String.valueOf(n.j().e().n()));
                mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
                MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), mtopRequest);
                build.handler(ydt.a());
                build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.evo.internal.downloader.ExperimentIndexMtopRequest.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        MtopResponseOutDo mtopResponseOutDo;
                        lo8 lo8Var;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else if (mtopResponse != null && mtopResponse.getDataJsonObject() != null && (mtopResponseOutDo = (MtopResponseOutDo) uwf.a(mtopResponse.getDataJsonObject().toString(), MtopResponseOutDo.class)) != null && (lo8Var = mtopResponseOutDo.data) != null && lo8Var.nextAvailableTime > 0) {
                            bqm.a().e("nextAvailableTime", lo8Var.nextAvailableTime);
                            ogh.i("ExperimentIndexMtopRequest", "onError: msgCode=" + lo8Var.msgCode + " msgInfo=" + lo8Var.msgInfo + " nextAvailableTime=" + lo8Var.nextAvailableTime);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (baseOutDo == null) {
                            ogh.i("ExperimentIndexMtopRequest", "onSuccess: baseOutDo=null");
                        } else if (baseOutDo.getData() instanceof lo8) {
                            lo8 lo8Var = (lo8) baseOutDo.getData();
                            if (!lo8Var.success) {
                                ogh.i("ExperimentIndexMtopRequest", "onSuccess: responseData.success=false");
                                return;
                            }
                            if (lo8Var.experimentIndexData != null) {
                                n.j().g().a(new bj8(EventType.ExperimentV5Data, lo8Var.experimentIndexData, "mtop_allocate"));
                            }
                            if (lo8Var.experimentBetaIndexData != null) {
                                n.j().g().a(new bj8(EventType.BetaExperimentV5Data, lo8Var.experimentBetaIndexData, "mtop_allocate"));
                            }
                            ExperimentWhitelistDataV5 experimentWhitelistDataV5 = lo8Var.experimentWhitelistData;
                            Set<Long> set = experimentWhitelistDataV5 != null ? experimentWhitelistDataV5.groupIds : null;
                            ogh.i("ExperimentIndexMtopRequest", "【白名单数据】mtop: " + set);
                            n.j().d().k(set);
                            if (lo8Var.nextAvailableTime > 0) {
                                bqm.a().e("nextAvailableTime", lo8Var.nextAvailableTime);
                            }
                            ogh.i("ExperimentIndexMtopRequest", "onSuccess: ".concat(new String(mtopResponse.getBytedata())));
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        ogh.i("ExperimentIndexMtopRequest", "onSystemError: " + mtopResponse.toString());
                    }
                }).startRequest(MtopResponseOutDo.class);
                return;
            }
            ogh.i("ExperimentIndexMtopRequest", "checkIndex: nextAvailableTime limit. It can be executed after " + (mcp.a() - b) + "ms");
        }
    }
}
