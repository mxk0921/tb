package com.taobao.themis.inside.adapter;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import tb.a07;
import tb.arf;
import tb.ckf;
import tb.g1a;
import tb.ies;
import tb.ov2;
import tb.p8s;
import tb.t2o;
import tb.uj3;
import tb.wsq;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ{\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0007\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u009e\u0001\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00180\u001bH\u0016¢\u0006\u0004\b\u0019\u0010 ¨\u0006#"}, d2 = {"Lcom/taobao/themis/inside/adapter/MtopAdapterImpl;", "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter;", "<init>", "()V", "Lcom/taobao/themis/kernel/network/RequestParams;", "params", "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "requestSync", "(Lcom/taobao/themis/kernel/network/RequestParams;)Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "", "apiName", "apiVersion", "", "", "method", "", ICallService.KEY_NEED_LOGIN, ov2.ALIPAY_ACCOUNT_SITE, "headers", "traceId", "sourceUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$b;", DataReceiveMonitor.CB_LISTENER, "Ltb/xhv;", "requestAsync", "(Lcom/taobao/themis/kernel/network/RequestParams;Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$b;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "response", "callback", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ltb/g1a;)V", "Companion", "a", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class MtopAdapterImpl implements IMtopInnerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f13523a = CommonExtKt.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(837812264);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e6b99a31", new Object[]{this, str});
            }
            ckf.g(str, TBImageFlowMonitor.ERROR_ORIGIN_URL);
            Uri.Builder buildUpon = Uri.parse("https://m.duanqu.com").buildUpon();
            for (String str2 : b()) {
                if (buildUpon != null) {
                    buildUpon.appendQueryParameter(str2, ies.c(str, str2));
                }
            }
            String builder = buildUpon.toString();
            ckf.f(builder, "builder.toString()");
            return builder;
        }

        public final List<String> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("649d01a7", new Object[]{this});
            }
            try {
                String configByGroupAndName = ((IConfigAdapter) p8s.g(IConfigAdapter.class)).getConfigByGroupAndName("ariver_common_config", "xpageUrlParamsWitheList", "sellerId,shopId,isShop,_ariver_appid");
                ckf.f(configByGroupAndName, "config");
                return wsq.z0(configByGroupAndName, new String[]{","}, false, 0, 6, null);
            } catch (Exception e) {
                e.printStackTrace();
                return yz3.i();
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(837812263);
        t2o.a(839909849);
    }

    public static final /* synthetic */ IMtopInnerAdapter.Response access$buildResponse(MtopAdapterImpl mtopAdapterImpl, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("7c474e99", new Object[]{mtopAdapterImpl, mtopResponse});
        }
        return mtopAdapterImpl.b(mtopResponse);
    }

    public final MtopBusiness a(String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, String str5, Map<String, String> map2, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("aa8bf41a", new Object[]{this, str, str2, map, str3, new Boolean(z), str4, str5, map2, str6});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(JSON.toJSONString(map));
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(z);
        mtopRequest.setNeedSession(z);
        MtopBusiness build = MtopBusiness.build(c(str5), mtopRequest);
        if (map2 != null && !map2.isEmpty()) {
            build.headers(map2);
        }
        Locale locale = Locale.ROOT;
        ckf.f(locale, "ROOT");
        String upperCase = str3.toUpperCase(locale);
        ckf.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        build.reqMethod(MethodEnum.valueOf(upperCase));
        build.setBizId("60");
        build.setJsonType(JsonTypeEnum.ORIGINALJSON);
        if (TextUtils.isEmpty(str5) || ckf.b("taobao", str5)) {
            build.setCustomDomain(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, "");
        }
        if (str4 != null) {
            build.setPTraceId(str4);
        }
        build.handler(this.f13523a);
        a aVar = Companion;
        if (str6 == null) {
            str6 = "";
        }
        build.setPageUrl(aVar.a(str6));
        build.setPageName("");
        return build;
    }

    public final Mtop c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("c7b26d2b", new Object[]{this, str});
        }
        if (str == null) {
            str = "";
        }
        String instanceId = MtopAccountSiteUtils.getInstanceId(str);
        if (instanceId == null) {
            instanceId = Mtop.Id.INNER;
        }
        Mtop instance = Mtop.instance(instanceId, ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext());
        ckf.f(instance, "instance(\n            in…licationContext\n        )");
        return instance;
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public void requestAsync(RequestParams requestParams, IMtopInnerAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0df8a6e", new Object[]{this, requestParams, bVar});
            return;
        }
        ckf.g(requestParams, "params");
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        String str = requestParams.api;
        String str2 = str == null ? "" : str;
        String str3 = requestParams.version;
        requestAsync(str2, str3 == null ? "" : str3, requestParams.toMap(), requestParams.method, requestParams.needLogin, requestParams.accountSite, requestParams.headers, requestParams.traceId, requestParams.oriUrl, new MtopAdapterImpl$requestAsync$1(bVar));
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public IMtopInnerAdapter.Response requestSync(RequestParams requestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("4a28a221", new Object[]{this, requestParams});
        }
        ckf.g(requestParams, "params");
        String str = requestParams.api;
        String str2 = str == null ? "" : str;
        String str3 = requestParams.version;
        return requestSync(str2, str3 == null ? "" : str3, requestParams.toMap(), requestParams.method, requestParams.needLogin, requestParams.accountSite, requestParams.headers, requestParams.traceId, requestParams.oriUrl);
    }

    public final IMtopInnerAdapter.Response b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("568de334", new Object[]{this, mtopResponse});
        }
        IMtopInnerAdapter.Response response = new IMtopInnerAdapter.Response();
        if (mtopResponse == null) {
            response.setSuccess(false);
            response.setErrorCode("MTOP_RESPONSE_NULL");
            response.setErrorMsg("网络请求异常");
            return response;
        } else if (mtopResponse.getBytedata() == null) {
            TMSLogger.a("[mtop]", "response data is null");
            response.setSuccess(false);
            response.setErrorCode(mtopResponse.getRetCode());
            response.setErrorMsg(mtopResponse.getRetMsg());
            return response;
        } else {
            if (mtopResponse.isApiSuccess()) {
                response.setSuccess(true);
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.f(bytedata, "response.bytedata");
                response.setData(arf.i(new String(bytedata, uj3.UTF_8)));
                response.setRawData(mtopResponse.getBytedata());
            } else {
                response.setSuccess(false);
                response.setErrorCode(mtopResponse.getRetCode());
                response.setErrorMsg(mtopResponse.getRetMsg());
                byte[] bytedata2 = mtopResponse.getBytedata();
                ckf.f(bytedata2, "response.bytedata");
                response.setData(arf.i(new String(bytedata2, uj3.UTF_8)));
                response.setRawData(mtopResponse.getBytedata());
            }
            return response;
        }
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public void requestAsync(final String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, Map<String, String> map2, String str5, String str6, final g1a<? super IMtopInnerAdapter.Response, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0deb08", new Object[]{this, str, str2, map, str3, new Boolean(z), str4, map2, str5, str6, g1aVar});
            return;
        }
        ckf.g(str, "apiName");
        ckf.g(str2, "apiVersion");
        ckf.g(str3, "method");
        ckf.g(g1aVar, "callback");
        MtopBusiness a2 = a(str, str2, map, str3, z, str5, str4, map2, str6);
        final long currentTimeMillis = System.currentTimeMillis();
        TMSLogger.a("MtopAdapterImpl", "api " + str + " requestInnerASync start");
        a2.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.themis.inside.adapter.MtopAdapterImpl$requestAsync$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str7;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                StringBuilder sb = new StringBuilder("api ");
                sb.append(str);
                sb.append(" requestInnerASync failed, code:");
                String str8 = null;
                if (mtopResponse == null) {
                    str7 = null;
                } else {
                    str7 = mtopResponse.getRetCode();
                }
                sb.append((Object) str7);
                sb.append(", msg:");
                if (mtopResponse != null) {
                    str8 = mtopResponse.getRetMsg();
                }
                sb.append((Object) str8);
                sb.append(", duration: ");
                sb.append(currentTimeMillis - System.currentTimeMillis());
                TMSLogger.b("MtopAdapterImpl", sb.toString());
                g1aVar.invoke(MtopAdapterImpl.access$buildResponse(this, mtopResponse));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                g1aVar.invoke(MtopAdapterImpl.access$buildResponse(this, mtopResponse));
                TMSLogger.a("MtopAdapterImpl", "api " + str + " requestInnerASync success, duration: " + (currentTimeMillis - System.currentTimeMillis()));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }
        });
        a2.startRequest();
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public IMtopInnerAdapter.Response requestSync(String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, Map<String, String> map2, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("cc7ce31e", new Object[]{this, str, str2, map, str3, new Boolean(z), str4, map2, str5, str6});
        }
        ckf.g(str, "apiName");
        ckf.g(str2, "apiVersion");
        ckf.g(str3, "method");
        return b(a(str, str2, map, str3, z, str5, str4, map2, str6).syncRequest());
    }
}
