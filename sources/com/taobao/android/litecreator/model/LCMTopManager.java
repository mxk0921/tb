package com.taobao.android.litecreator.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.Mtop;
import tb.ckf;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LCMTopManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final LCMTopManager INSTANCE = new LCMTopManager();

    /* renamed from: a  reason: collision with root package name */
    public static final String f8273a = "LCMTopManager";
    public static final MethodEnum b = MethodEnum.POST;

    static {
        t2o.a(511705234);
    }

    public static final /* synthetic */ String a(LCMTopManager lCMTopManager, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e845c850", new Object[]{lCMTopManager, str, mtopResponse});
        }
        return lCMTopManager.c(str, mtopResponse);
    }

    public static final /* synthetic */ String b(LCMTopManager lCMTopManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75df513e", new Object[]{lCMTopManager});
        }
        return f8273a;
    }

    public final String c(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f30e45b", new Object[]{this, str, mtopResponse});
        }
        if (mtopResponse instanceof MtopResponse) {
            StringBuilder sb = new StringBuilder("api = ");
            String retMsg = mtopResponse.getRetMsg();
            ckf.f(retMsg, "mtopResponse.retMsg");
            String retCode = mtopResponse.getRetCode();
            ckf.f(retCode, "mtopResponse.retCode");
            sb.append(str);
            sb.append(" , retMsg=");
            sb.append(retMsg);
            sb.append(" , retCode=");
            sb.append(retCode);
            String sb2 = sb.toString();
            ckf.f(sb2, "sb.toString()");
            return sb2;
        }
        return "api = " + str;
    }

    public final void d(LCMTopRequest lCMTopRequest, ILcMTopListener iLcMTopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b425c13c", new Object[]{this, lCMTopRequest, iLcMTopListener});
            return;
        }
        ckf.g(lCMTopRequest, "request");
        ckf.g(iLcMTopListener, "callback");
        e(null, b, lCMTopRequest, null, iLcMTopListener);
    }

    public final void e(String str, MethodEnum methodEnum, final LCMTopRequest lCMTopRequest, LCMTopResponse lCMTopResponse, final ILcMTopListener iLcMTopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f08abff", new Object[]{this, str, methodEnum, lCMTopRequest, lCMTopResponse, iLcMTopListener});
            return;
        }
        ckf.g(methodEnum, "requestType");
        ckf.g(lCMTopRequest, "request");
        ckf.g(iLcMTopListener, "callback");
        MtopBusiness build = MtopBusiness.build(Mtop.instance(str, Globals.getApplication()), (MtopRequest) lCMTopRequest);
        if (lCMTopRequest.getVersion() == null) {
            lCMTopRequest.setVersion("1.0");
        }
        if (lCMTopRequest.isLegalRequest()) {
            String str2 = f8273a;
            odg.c(str2, "request: isLegalRequest: " + lCMTopRequest);
        }
        if (lCMTopRequest.getExtraHeaders() != null) {
            build.headers(lCMTopRequest.getExtraHeaders());
        }
        if (lCMTopRequest.isHttps()) {
            build.protocol(ProtocolEnum.HTTPSECURE);
        }
        if (lCMTopRequest.getBizId() != null) {
            build.setBizId(lCMTopRequest.getBizId());
        }
        if (lCMTopRequest.getTopic() != null) {
            build.setBizTopic(lCMTopRequest.getTopic());
        }
        if (lCMTopRequest.getPageIndex() != null) {
            Integer pageIndex = lCMTopRequest.getPageIndex();
            ckf.d(pageIndex);
            build.setPageIndex(pageIndex.intValue());
        }
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.model.LCMTopManager$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String b2 = LCMTopManager.b(LCMTopManager.INSTANCE);
                odg.c(b2, "loading onSuccess, api = " + LCMTopRequest.this.getApiName());
                iLcMTopListener.onSuccess(i, mtopResponse, baseOutDo, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                LCMTopManager lCMTopManager = LCMTopManager.INSTANCE;
                String b2 = LCMTopManager.b(lCMTopManager);
                StringBuilder sb = new StringBuilder("loading onError, ");
                String apiName = LCMTopRequest.this.getApiName();
                ckf.f(apiName, "request.apiName");
                sb.append(LCMTopManager.a(lCMTopManager, apiName, mtopResponse));
                odg.c(b2, sb.toString());
                iLcMTopListener.onError(i, mtopResponse, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    mtopResponse.getApi();
                }
                if (mtopResponse != null) {
                    mtopResponse.getRetMsg();
                }
                if (mtopResponse != null) {
                    mtopResponse.getRetCode();
                }
                LCMTopManager lCMTopManager = LCMTopManager.INSTANCE;
                String b2 = LCMTopManager.b(lCMTopManager);
                StringBuilder sb = new StringBuilder("loading onSystemError, ");
                String apiName = LCMTopRequest.this.getApiName();
                ckf.f(apiName, "request.apiName");
                sb.append(LCMTopManager.a(lCMTopManager, apiName, mtopResponse));
                odg.c(b2, sb.toString());
                iLcMTopListener.onSystemError(i, mtopResponse, obj);
            }
        });
        build.reqMethod(methodEnum);
        if (lCMTopResponse != null) {
            build.startRequest(LCMTopResponse.class);
        } else {
            build.startRequest();
        }
    }
}
