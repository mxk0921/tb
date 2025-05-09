package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.taobao.windvane.extra.uc.prefetch.TNetCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.Globals;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bgq;
import tb.egq;
import tb.lcn;
import tb.mnf;
import tb.nnf;
import tb.t2o;
import tb.y71;
import tb.zeq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DowngradableSSRService implements nnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "DowngradableSSRService";
    private static final JSONObject args = new JSONObject();
    private final nnf mService = zeq.a();

    static {
        t2o.a(989856057);
    }

    public static /* synthetic */ JSONObject access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("42811697", new Object[0]);
        }
        return args;
    }

    @Override // tb.nnf
    public boolean asyncSend(bgq bgqVar, final mnf mnfVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac8307d5", new Object[]{this, bgqVar, mnfVar, handler})).booleanValue();
        }
        return this.mService.asyncSend(bgqVar, new mnf() { // from class: android.taobao.windvane.extra.uc.DowngradableSSRService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mnf
            public void onFinish(bgq bgqVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4d53f97", new Object[]{this, bgqVar2});
                    return;
                }
                mnf mnfVar2 = mnfVar;
                if (mnfVar2 != null) {
                    mnfVar2.onFinish(bgqVar2);
                }
                if (bgqVar2 != null) {
                    try {
                        y71.commitSuccess("mtopSSRFinish", bgqVar2.f16375a);
                    } catch (Exception unused) {
                        return;
                    }
                }
                lcn.a(RVLLevel.Error, DowngradableSSRService.MODULE).j("mtopSSRFinish").b(DowngradableSSRService.access$000()).f();
            }

            @Override // tb.mnf
            public void onReceiveData(bgq bgqVar2, byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("150b5e1a", new Object[]{this, bgqVar2, bArr});
                    return;
                }
                mnf mnfVar2 = mnfVar;
                if (mnfVar2 != null) {
                    mnfVar2.onReceiveData(bgqVar2, bArr);
                }
            }

            @Override // tb.mnf
            public void onResponse(bgq bgqVar2, int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1e09d3a7", new Object[]{this, bgqVar2, new Integer(i), map});
                    return;
                }
                mnf mnfVar2 = mnfVar;
                if (mnfVar2 != null) {
                    mnfVar2.onResponse(bgqVar2, i, map);
                }
                try {
                    DowngradableSSRService.access$000().put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, (Object) Integer.valueOf(i));
                } catch (Exception unused) {
                }
            }

            @Override // tb.mnf
            public void onError(final bgq bgqVar2, egq egqVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a95834", new Object[]{this, bgqVar2, egqVar});
                    return;
                }
                if (!(egqVar == null || bgqVar2 == null)) {
                    try {
                        DowngradableSSRService.access$000().put("errorCode", (Object) Integer.valueOf(egqVar.f18565a));
                        DowngradableSSRService.access$000().put("errorMsg", (Object) egqVar.c);
                        y71.commitFail("mtopSSRFinish", egqVar.f18565a, DowngradableSSRService.access$000().toJSONString(), bgqVar2.f16375a);
                    } catch (Exception unused) {
                    }
                }
                lcn.a(RVLLevel.Error, DowngradableSSRService.MODULE).j("mtopSSRFinish").b(DowngradableSSRService.access$000()).f();
                if (bgqVar2 == null || egqVar == null || egqVar.f18565a != 417) {
                    mnf mnfVar2 = mnfVar;
                    if (mnfVar2 != null) {
                        mnfVar2.onError(bgqVar2, egqVar);
                        return;
                    }
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) bgqVar2.f16375a);
                y71.commitSuccess("mtopSSRDowngrade", jSONObject.toJSONString());
                lcn.f(RVLLevel.Error, DowngradableSSRService.MODULE, "downgrade network to normal request");
                RequestImpl requestImpl = new RequestImpl(bgqVar2.f16375a);
                requestImpl.setFollowRedirects(false);
                requestImpl.setRetryTime(AliRequestAdapter.retryTimes);
                requestImpl.setConnectTimeout(AliRequestAdapter.connectTimeout);
                requestImpl.setReadTimeout(AliRequestAdapter.readTimeout);
                requestImpl.setCookieEnabled(WVUCWebView.isNeedCookie(bgqVar2.f16375a));
                requestImpl.setMethod(bgqVar2.b);
                Map<String, String> map = bgqVar2.c;
                if (map != null) {
                    for (Map.Entry entry : ((HashMap) map).entrySet()) {
                        requestImpl.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                new DegradableNetwork(Globals.getApplication()).asyncSend(requestImpl, bgqVar2.f16375a, null, new TNetCallBack() { // from class: android.taobao.windvane.extra.uc.DowngradableSSRService.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // anetwork.channel.NetworkCallBack.ProgressListener
                    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
                        mnf mnfVar3;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
                        } else if (progressEvent != null && (mnfVar3 = mnfVar) != null) {
                            mnfVar3.onReceiveData(bgqVar2, Arrays.copyOf(progressEvent.getBytedata(), progressEvent.getSize()));
                        }
                    }

                    @Override // anetwork.channel.NetworkCallBack.FinishListener
                    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                        } else if (finishEvent != null) {
                            int httpCode = finishEvent.getHttpCode();
                            if (httpCode < 0) {
                                String desc = finishEvent.getDesc();
                                RVLLevel rVLLevel = RVLLevel.Error;
                                lcn.f(rVLLevel, DowngradableSSRService.MODULE, "error code = " + httpCode + ", desc=" + desc + ", url = " + bgqVar2.f16375a);
                                mnf mnfVar3 = mnfVar;
                                if (mnfVar3 != null) {
                                    mnfVar3.onError(bgqVar2, new egq.b().b(httpCode).d(desc).a());
                                    return;
                                }
                                return;
                            }
                            mnf mnfVar4 = mnfVar;
                            if (mnfVar4 != null) {
                                mnfVar4.onFinish(bgqVar2);
                            }
                        }
                    }

                    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
                    public boolean onResponseCode(int i, Map<String, List<String>> map2, Object obj) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return ((Boolean) ipChange3.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map2, obj})).booleanValue();
                        }
                        mnf mnfVar3 = mnfVar;
                        if (mnfVar3 != null) {
                            mnfVar3.onResponse(bgqVar2, i, map2);
                        }
                        return false;
                    }
                });
            }
        }, handler);
    }

    @Override // tb.nnf
    public boolean cancel(bgq bgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("801a6ac3", new Object[]{this, bgqVar})).booleanValue();
        }
        return this.mService.cancel(bgqVar);
    }
}
