package com.taobao.tao.shop.fetcher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.shop.TBSRCtx;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.fetcher.a;
import com.taobao.tao.shop.fetcher.adapter.TBSRDownloadAdapter;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessNewRequest;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessRequest;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponse;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import com.taobao.tao.shop.track.IShopRouterMonitor;
import com.taobao.utils.Global;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c21;
import tb.ivr;
import tb.jvr;
import tb.kvr;
import tb.lvr;
import tb.mvr;
import tb.ovr;
import tb.pl4;
import tb.svr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBSRUrlProcessFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.tao.shop.fetcher.a f12772a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements TBSRDownloadAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TBSRUrlProcessFetcher tBSRUrlProcessFetcher) {
        }

        public void a(Object obj, TBSRDownloadAdapter.TBSRDownloadException tBSRDownloadException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("858707d5", new Object[]{this, obj, tBSRDownloadException});
            } else if (tBSRDownloadException != null) {
                int errorCode = tBSRDownloadException.getErrorCode();
                String errorMsg = tBSRDownloadException.getErrorMsg();
                TBSRCtx.safeMonitor(1005, new IShopRouterMonitor.MonitorException("" + errorCode, errorMsg));
            } else if (obj != null) {
                TBSRCtx.safeMonitor(1004, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements a.e<MtopTaobaoWirelessShopRouteProcessResponseData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12773a;
        public final /* synthetic */ svr b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public b(String str, svr svrVar, String str2, boolean z) {
            this.f12773a = str;
            this.b = svrVar;
            this.c = str2;
            this.d = z;
        }

        /* renamed from: a */
        public void b(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43b2cb62", new Object[]{this, mtopTaobaoWirelessShopRouteProcessResponseData});
                return;
            }
            if (mtopTaobaoWirelessShopRouteProcessResponseData != null && jvr.p().y() && mtopTaobaoWirelessShopRouteProcessResponseData.isMiniAppRenderStyle()) {
                mtopTaobaoWirelessShopRouteProcessResponseData = null;
            }
            if (mtopTaobaoWirelessShopRouteProcessResponseData != null) {
                TBSRCtx.safeMonitor(1000, null);
                mvr.c("[fetch callback] :  use cache - originUrl=" + this.f12773a + ", data=" + mtopTaobaoWirelessShopRouteProcessResponseData);
                ((kvr.a) this.b).c(this.f12773a, mtopTaobaoWirelessShopRouteProcessResponseData);
                return;
            }
            try {
                Intent intent = new Intent("SHOP_START_ROUTE");
                intent.putExtra("shopRouteUrl", this.f12773a);
                LocalBroadcastManager.getInstance(Global.getApplication()).sendBroadcast(intent);
            } catch (Throwable th) {
                mvr.b(th, "send shop route preload mini data broadcast failed");
            }
            mvr.c("[fetch callback] :  mtop send-> originUrl=" + this.f12773a + ", ruleSetName=" + this.c);
            TBSRUrlProcessFetcher.a(TBSRUrlProcessFetcher.this, this.f12773a, this.c, this.b, this.d);
        }
    }

    static {
        t2o.a(668991533);
    }

    public TBSRUrlProcessFetcher(Context context) {
        ivr ivrVar = new ivr(context);
        jvr p = jvr.p();
        TBSRDownloadAdapter tBSRDownloadAdapter = new TBSRDownloadAdapter();
        tBSRDownloadAdapter.c(new a(this));
        this.f12772a = new com.taobao.tao.shop.fetcher.a(context, ivrVar, p, tBSRDownloadAdapter);
    }

    public static /* synthetic */ void a(TBSRUrlProcessFetcher tBSRUrlProcessFetcher, String str, String str2, svr svrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660dacc9", new Object[]{tBSRUrlProcessFetcher, str, str2, svrVar, new Boolean(z)});
        } else {
            tBSRUrlProcessFetcher.h(str, str2, svrVar, z);
        }
    }

    public static /* synthetic */ com.taobao.tao.shop.fetcher.a b(TBSRUrlProcessFetcher tBSRUrlProcessFetcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.shop.fetcher.a) ipChange.ipc$dispatch("67b04680", new Object[]{tBSRUrlProcessFetcher});
        }
        return tBSRUrlProcessFetcher.f12772a;
    }

    public static String c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae77e29", new Object[]{str});
        }
        if (!TBDeviceUtils.p(Global.getApplication())) {
            return str;
        }
        if (!TBAutoSizeConfig.x().T(Global.getApplication())) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("foldDeviceStyle", str2).toString();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4549d972", new Object[0]);
        }
        try {
            if (!jvr.p().h()) {
                return null;
            }
            return BUFS.getFeature(new BUFS.QueryArgs(), "shop.request.fetch", "PageShop", ShopConstants.PAGE_SHOP);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        try {
            int i = c21.g().getInt("deviceLevel", -1);
            if (i == 0) {
                return 3;
            }
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                return 0;
            }
            return 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("fa909829", new Object[]{this, str});
        }
        return this.f12772a.f(str);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4b7a8c", new Object[]{this});
        } else {
            this.f12772a.g();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de4d3ef", new Object[]{this});
        } else {
            this.f12772a.j();
        }
    }

    public void j(String str, String str2, svr<MtopTaobaoWirelessShopRouteProcessResponseData> svrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6854eb6e", new Object[]{this, str, str2, svrVar, new Boolean(z)});
            return;
        }
        TBSRCtx.safeMonitor(1001, null);
        this.f12772a.e(str, str2, new b(str, svrVar, str2, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(String str, final String str2, final svr<MtopTaobaoWirelessShopRouteProcessResponseData> svrVar, boolean z) {
        MtopTaobaoWirelessShopRouteProcessRequest mtopTaobaoWirelessShopRouteProcessRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacf748", new Object[]{this, str, str2, svrVar, new Boolean(z)});
            return;
        }
        TBSRCtx.safeMonitor(1002, null);
        final String c = c(str);
        if (z) {
            Uri parse = Uri.parse(c);
            MtopTaobaoWirelessShopRouteProcessNewRequest mtopTaobaoWirelessShopRouteProcessNewRequest = new MtopTaobaoWirelessShopRouteProcessNewRequest();
            mtopTaobaoWirelessShopRouteProcessNewRequest.pageId = parse.getQueryParameter(pl4.KEY_PAGE_ID);
            mtopTaobaoWirelessShopRouteProcessNewRequest.pathInfo = parse.getQueryParameter("pathInfo");
            mtopTaobaoWirelessShopRouteProcessNewRequest.shopId = parse.getQueryParameter("shopId");
            mtopTaobaoWirelessShopRouteProcessNewRequest.sellerId = parse.getQueryParameter("sellerId");
            mvr.a(mtopTaobaoWirelessShopRouteProcessNewRequest.toString());
            mtopTaobaoWirelessShopRouteProcessRequest = mtopTaobaoWirelessShopRouteProcessNewRequest;
        } else {
            MtopTaobaoWirelessShopRouteProcessRequest mtopTaobaoWirelessShopRouteProcessRequest2 = new MtopTaobaoWirelessShopRouteProcessRequest();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceLevel", (Object) Integer.valueOf(e()));
            jSONObject.put("bxContext", (Object) d());
            mtopTaobaoWirelessShopRouteProcessRequest2.setExtParams(jSONObject.toJSONString());
            mtopTaobaoWirelessShopRouteProcessRequest2.setShopURL(c);
            mtopTaobaoWirelessShopRouteProcessRequest2.setMatchedRuleSetName(str2);
            if (jvr.p().y()) {
                mtopTaobaoWirelessShopRouteProcessRequest2.setMiniappDowngrade(true);
                mtopTaobaoWirelessShopRouteProcessRequest2.setVERSION("2.0");
                if (jvr.w(lvr.b)) {
                    mtopTaobaoWirelessShopRouteProcessRequest2.setAccessibility_downgrade(true);
                }
            }
            mtopTaobaoWirelessShopRouteProcessRequest = mtopTaobaoWirelessShopRouteProcessRequest2;
        }
        ovr.a(mtopTaobaoWirelessShopRouteProcessRequest, MtopTaobaoWirelessShopRouteProcessResponse.class, new IRemoteBaseListener() { // from class: com.taobao.tao.shop.fetcher.TBSRUrlProcessFetcher.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void performMonitorError(MtopResponse mtopResponse) {
                String str3;
                String str4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("62b2a1b", new Object[]{this, mtopResponse});
                    return;
                }
                if (mtopResponse != null) {
                    str4 = mtopResponse.getRetCode();
                    str3 = mtopResponse.getRetMsg();
                } else {
                    str4 = "-999";
                    str3 = "MtopResponse is null";
                }
                HashMap hashMap = new HashMap();
                hashMap.put(TBImageFlowMonitor.ERROR_ORIGIN_URL, c);
                hashMap.put("ruleSetName", str2);
                TBSRCtx.safeMonitor(1007, new IShopRouterMonitor.MonitorException(str4, str3, hashMap));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                TBSRCtx.safeMonitor(1003, null);
                if (!(baseOutDo instanceof MtopTaobaoWirelessShopRouteProcessResponse)) {
                    mvr.d("[fetch callback] : mtop ->  pojo == null or pojo can not cast to data");
                    ((kvr.a) svrVar).a(c, false);
                    return;
                }
                mvr.c("[fetch callback] : mtop ->  success with data=" + baseOutDo);
                MtopTaobaoWirelessShopRouteProcessResponseData data = ((MtopTaobaoWirelessShopRouteProcessResponse) baseOutDo).getData();
                if (jvr.p().i()) {
                    if (!(data == null || data.getShopTargetUrl() == null)) {
                        TBSRUrlProcessFetcher.b(TBSRUrlProcessFetcher.this).i(c, str2, data);
                    }
                } else if (data != null) {
                    TBSRUrlProcessFetcher.b(TBSRUrlProcessFetcher.this).i(c, str2, data);
                }
                ((kvr.a) svrVar).c(c, data);
                TBSRCtx.safeMonitor(1006, null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TBSRCtx.safeMonitor(1003, null);
                StringBuilder sb = new StringBuilder("[fetch callback] : mtop ->  business error   originUrl=");
                sb.append(c);
                sb.append(" error=");
                if (mtopResponse == null) {
                    str3 = "response == null";
                } else {
                    str3 = mtopResponse.getRetMsg();
                }
                sb.append(str3);
                mvr.a(sb.toString());
                ((kvr.a) svrVar).a(c, false);
                performMonitorError(mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TBSRCtx.safeMonitor(1003, null);
                StringBuilder sb = new StringBuilder("[fetch callback] : mtop ->  system error   originUrl=");
                sb.append(c);
                sb.append("  error=");
                if (mtopResponse == null) {
                    str3 = "response == null";
                } else {
                    str3 = mtopResponse.getRetMsg();
                }
                sb.append(str3);
                mvr.a(sb.toString());
                ((kvr.a) svrVar).a(c, true);
                performMonitorError(mtopResponse);
            }
        });
    }
}
