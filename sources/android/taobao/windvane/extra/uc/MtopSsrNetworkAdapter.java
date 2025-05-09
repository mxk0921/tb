package android.taobao.windvane.extra.uc;

import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import tb.bgq;
import tb.egq;
import tb.lcn;
import tb.nnf;
import tb.t2o;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopSsrNetworkAdapter implements INetwork {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXCEPTION_FAILED_CODE = 417;
    private static final String MODULE = "WindVane/NetworkSSR";
    private final INetwork mDowngradeNetwork;
    private MtopRequestListener mMtopRequestListener;
    private WVUCWebView mWebView;
    private long mRequestId = 0;
    private String mParentId = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface MtopRequestListener {
        void beforeRequest(long j, String str, Map<String, String> map);

        void onFinish(long j, String str, long j2, boolean z);

        void onResponse(long j, String str, int i, Map<String, List<String>> map);
    }

    static {
        t2o.a(989856067);
        t2o.a(989856159);
    }

    public MtopSsrNetworkAdapter(INetwork iNetwork, WVUCWebView wVUCWebView) {
        this.mDowngradeNetwork = iNetwork;
        this.mWebView = wVUCWebView;
        setRequestListener(new MtopRequestListener() { // from class: android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.MtopRequestListener
            public void beforeRequest(long j, String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fab35b0e", new Object[]{this, new Long(j), str, map});
                } else {
                    lcn.a(RVLLevel.Info, MtopSsrNetworkAdapter.MODULE).k("request", String.valueOf(j)).m(MtopSsrNetworkAdapter.access$000(MtopSsrNetworkAdapter.this)).a("url", str).a("header", map).f();
                }
            }

            @Override // android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.MtopRequestListener
            public void onFinish(long j, String str, long j2, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("59c46365", new Object[]{this, new Long(j), str, new Long(j2), new Boolean(z)});
                } else {
                    lcn.a(RVLLevel.Info, MtopSsrNetworkAdapter.MODULE).k("finish", String.valueOf(j)).m(MtopSsrNetworkAdapter.access$000(MtopSsrNetworkAdapter.this)).a("url", str).a("dataSize", Long.valueOf(j2)).a("isSuccess", Boolean.valueOf(z)).f();
                }
            }

            @Override // android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.MtopRequestListener
            public void onResponse(long j, String str, int i, Map<String, List<String>> map) {
                RVLLevel rVLLevel;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fe29489", new Object[]{this, new Long(j), str, new Integer(i), map});
                    return;
                }
                if (i < 200 || i > 300) {
                    rVLLevel = RVLLevel.Warn;
                } else {
                    rVLLevel = RVLLevel.Info;
                }
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if (entry.getValue() == null || entry.getValue().size() <= 0) {
                            jSONObject.put(entry.getKey(), (Object) entry.getValue());
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            for (String str2 : entry.getValue()) {
                                jSONArray.put(str2);
                            }
                            if (entry.getKey() != null) {
                                jSONObject.put(entry.getKey(), (Object) jSONArray);
                            }
                        }
                    }
                }
                lcn.a(rVLLevel, MtopSsrNetworkAdapter.MODULE).k("response", String.valueOf(j)).m(MtopSsrNetworkAdapter.access$000(MtopSsrNetworkAdapter.this)).a("url", str).a("statusCode", Integer.valueOf(i)).a("header", jSONObject).f();
            }
        });
    }

    public static /* synthetic */ String access$000(MtopSsrNetworkAdapter mtopSsrNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34c2ccc7", new Object[]{mtopSsrNetworkAdapter});
        }
        return mtopSsrNetworkAdapter.mParentId;
    }

    public static /* synthetic */ INetwork access$100(MtopSsrNetworkAdapter mtopSsrNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INetwork) ipChange.ipc$dispatch("e24952f", new Object[]{mtopSsrNetworkAdapter});
        }
        return mtopSsrNetworkAdapter.mDowngradeNetwork;
    }

    private void setRequestListener(MtopRequestListener mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f05f13", new Object[]{this, mtopRequestListener});
        } else {
            this.mMtopRequestListener = mtopRequestListener;
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public IRequest formatRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRequest) ipChange.ipc$dispatch("5c346fdd", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)});
        }
        return new MTopSSRRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public int getNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return "1.0";
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean requestURL(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85230ab7", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
        }
        return sendRequest(formatRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2));
    }

    public void setParentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3aaf138", new Object[]{this, str});
        } else {
            this.mParentId = str;
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean sendRequest(final IRequest iRequest) {
        bgq ssrRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f55a9b04", new Object[]{this, iRequest})).booleanValue();
        }
        if (!(iRequest instanceof MTopSSRRequest) || (ssrRequest = ((MTopSSRRequest) iRequest).getSsrRequest()) == null) {
            return false;
        }
        nnf createSsrService = MtopSsrServiceFactory.createSsrService();
        final EventHandler eventHandler = iRequest.getEventHandler();
        if (!(createSsrService == null || eventHandler == null)) {
            final long j = this.mRequestId + 1;
            this.mRequestId = j;
            final MtopRequestListener mtopRequestListener = this.mMtopRequestListener;
            if (mtopRequestListener != null) {
                mtopRequestListener.beforeRequest(j, ssrRequest.f16375a, ssrRequest.c);
            }
            return createSsrService.asyncSend(ssrRequest, new ChunkCacheRequestCallback() { // from class: android.taobao.windvane.extra.uc.MtopSsrNetworkAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private long mTotalSize = 0;

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
                public void onCustomCallback(int i, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
                    }
                }

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
                public void onError(bgq bgqVar, egq egqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a95834", new Object[]{this, bgqVar, egqVar});
                    } else if (bgqVar != null && egqVar != null) {
                        int i = egqVar.f18565a;
                        if (i == 417) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", (Object) bgqVar.f16375a);
                            y71.commitSuccess("mtopSSRDowngrade", jSONObject.toJSONString());
                            lcn.f(RVLLevel.Error, MtopSsrNetworkAdapter.MODULE, "downgrade network to normal request");
                            MtopSsrNetworkAdapter.access$100(MtopSsrNetworkAdapter.this).sendRequest(((MTopSSRRequest) iRequest).copyRequest(MtopSsrNetworkAdapter.access$100(MtopSsrNetworkAdapter.this)));
                            return;
                        }
                        eventHandler.error(i, egqVar.c);
                        lcn.a(RVLLevel.Error, MtopSsrNetworkAdapter.MODULE).j("ssr request").a("url", bgqVar.f16375a).g(egqVar.f18565a, egqVar.c).f();
                        MtopRequestListener mtopRequestListener2 = mtopRequestListener;
                        if (mtopRequestListener2 != null) {
                            mtopRequestListener2.onFinish(j, bgqVar.f16375a, this.mTotalSize, false);
                        }
                    }
                }

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
                public void onFinish(bgq bgqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4d53f97", new Object[]{this, bgqVar});
                        return;
                    }
                    eventHandler.endData();
                    MtopRequestListener mtopRequestListener2 = mtopRequestListener;
                    if (mtopRequestListener2 != null && bgqVar != null) {
                        mtopRequestListener2.onFinish(j, bgqVar.f16375a, this.mTotalSize, true);
                    }
                }

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
                public void onNetworkResponse(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
                    }
                }

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
                public void onReceiveData(bgq bgqVar, byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("150b5e1a", new Object[]{this, bgqVar, bArr});
                        return;
                    }
                    eventHandler.data(bArr, bArr.length);
                    this.mTotalSize += bArr.length;
                }

                @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
                public void onResponse(bgq bgqVar, int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1e09d3a7", new Object[]{this, bgqVar, new Integer(i), map});
                        return;
                    }
                    if (map.containsKey(HttpConstant.X_PROTOCOL) && map.get(HttpConstant.X_PROTOCOL).size() != 0) {
                        String str = map.get(HttpConstant.X_PROTOCOL).get(0);
                        if (str.equals("http") || str.equals("https")) {
                            eventHandler.status(0, 0, i, "");
                        } else {
                            eventHandler.status(2, 0, i, "");
                        }
                    } else if (map.containsKey(HttpConstant.STATUS)) {
                        eventHandler.status(2, 0, i, "");
                    } else {
                        eventHandler.status(0, 0, i, "");
                    }
                    eventHandler.headers(map);
                    MtopRequestListener mtopRequestListener2 = mtopRequestListener;
                    if (mtopRequestListener2 != null) {
                        mtopRequestListener2.onResponse(j, bgqVar != null ? bgqVar.f16375a : null, i, map);
                    }
                }
            }, null);
        }
        return false;
    }
}
