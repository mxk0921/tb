package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.os.SystemClock;
import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.export.network.b;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.esd;
import tb.jfq;
import tb.qqm;
import tb.t2o;
import tb.urb;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliNetworkAdapterNew implements INetwork, urb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AliNetworkAdapter mAliNetworkAdapter;
    private final MtopSsrNetworkAdapter mMtopSsrNetworkAdapter;
    private WVUCWebView mWebView;

    static {
        t2o.a(989856042);
        t2o.a(989856159);
        t2o.a(989856196);
    }

    public AliNetworkAdapterNew(Context context, String str) {
        AliNetworkAdapter aliNetworkAdapter = new AliNetworkAdapter(context, 2, str);
        this.mAliNetworkAdapter = aliNetworkAdapter;
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(aliNetworkAdapter, null);
    }

    public static /* synthetic */ WVUCWebView access$000(AliNetworkAdapterNew aliNetworkAdapterNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("5ef11a6c", new Object[]{aliNetworkAdapterNew});
        }
        return aliNetworkAdapterNew.mWebView;
    }

    private boolean consumePrefetchRequest(IRequest iRequest) {
        WVUCWebView wVUCWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e5edd9", new Object[]{this, iRequest})).booleanValue();
        }
        if (iRequest == null || (wVUCWebView = this.mWebView) == null) {
            return false;
        }
        qqm prefetchInfo = wVUCWebView.getPrefetchInfo();
        String url = iRequest.getUrl();
        final EventHandler eventHandler = iRequest.getEventHandler();
        RequestCallback requestCallback = new RequestCallback() { // from class: android.taobao.windvane.extra.uc.AliNetworkAdapterNew.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/AliNetworkAdapterNew$1");
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onCustomCallback(int i, Object... objArr) {
                WVUCWebView access$000;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
                } else if (i == 0) {
                    if (objArr != null && objArr.length == 1) {
                        Object obj = objArr[0];
                        WVUCWebView access$0002 = AliNetworkAdapterNew.access$000(AliNetworkAdapterNew.this);
                        if ((obj instanceof Integer) && access$0002 != null) {
                            access$0002.getWebViewContext().getWebViewPageModel().onPropertyIfAbsent("H5_snapshotMatchType", obj);
                        }
                    }
                } else if (i == 1) {
                    if (objArr != null && objArr.length == 1) {
                        Object obj2 = objArr[0];
                        WVUCWebView access$0003 = AliNetworkAdapterNew.access$000(AliNetworkAdapterNew.this);
                        if ((obj2 instanceof Boolean) && access$0003 != null) {
                            access$0003.getWebViewContext().setHitSnapshot(((Boolean) obj2).booleanValue());
                        }
                    }
                } else if (i == 2 && vpw.commonConfig.I2 && (access$000 = AliNetworkAdapterNew.access$000(AliNetworkAdapterNew.this)) != null) {
                    access$000.getWebViewContext().getWebViewPageModel().onStageIfAbsent("H5_firstChunkReceived", SystemClock.uptimeMillis());
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onError(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                } else {
                    eventHandler.error(i, str);
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                } else {
                    eventHandler.endData();
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onReceiveData(byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
                } else {
                    eventHandler.data(bArr, bArr.length);
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onResponse(int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
                    return;
                }
                if (map != null) {
                    if (map.containsKey(HttpConstant.X_PROTOCOL)) {
                        List<String> list = map.get(HttpConstant.X_PROTOCOL);
                        if (list != null && list.size() > 0) {
                            String str = list.get(0);
                            if ("http".equals(str) || "https".equals(str)) {
                                eventHandler.status(0, 0, i, "");
                            } else {
                                eventHandler.status(2, 0, i, "");
                            }
                        }
                    } else if (map.containsKey(HttpConstant.STATUS)) {
                        eventHandler.status(2, 0, i, "");
                    } else {
                        eventHandler.status(0, 0, i, "");
                    }
                }
                eventHandler.headers(map);
            }
        };
        esd stageRecorder = getStageRecorder();
        if (prefetchInfo == null || eventHandler == null || TextUtils.isEmpty(url) || !TextUtils.equals(url, prefetchInfo.f26884a) || !b.b(prefetchInfo.b, requestCallback, stageRecorder)) {
            return b.c(url, requestCallback, stageRecorder);
        }
        return true;
    }

    private esd getStageRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esd) ipChange.ipc$dispatch("6bf33f73", new Object[]{this});
        }
        final WVUCWebView wVUCWebView = this.mWebView;
        return new esd() { // from class: android.taobao.windvane.extra.uc.AliNetworkAdapterNew.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.esd
            public void recordProperty(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d2bd161", new Object[]{this, str, str2});
                    return;
                }
                WVUCWebView wVUCWebView2 = wVUCWebView;
                if (wVUCWebView2 != null) {
                    wVUCWebView2.getWebViewContext().getWebViewPageModel().onPropertyIfAbsent(str, str2);
                }
            }

            @Override // tb.esd
            public void recordStage(String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a661a86", new Object[]{this, str, new Long(j)});
                    return;
                }
                WVUCWebView wVUCWebView2 = wVUCWebView;
                if (wVUCWebView2 != null) {
                    wVUCWebView2.getWebViewContext().getWebViewPageModel().onStage(str, j);
                }
            }
        };
    }

    public void destoryWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78625e6c", new Object[]{this});
        } else {
            this.mAliNetworkAdapter.destoryWebView();
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public IRequest formatRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRequest) ipChange.ipc$dispatch("5c346fdd", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)});
        }
        if (!vpw.commonConfig.n1 || !jfq.a(str)) {
            return this.mAliNetworkAdapter.formatRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
        }
        return this.mMtopSsrNetworkAdapter.formatRequest(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
    }

    @Override // tb.urb
    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return this.mAliNetworkAdapter.getCurId();
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public int getNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[]{this})).intValue();
        }
        return this.mAliNetworkAdapter.getNetworkType();
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this});
        }
        return this.mAliNetworkAdapter.getPId();
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.mAliNetworkAdapter.getVersion();
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean requestURL(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85230ab7", new Object[]{this, eventHandler, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!vpw.commonConfig.n1 || !jfq.a(str)) {
            return this.mAliNetworkAdapter.requestURL(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
        }
        return this.mMtopSsrNetworkAdapter.requestURL(eventHandler, str, str2, z, map, map2, map3, map4, j, i, i2);
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.mAliNetworkAdapter.setBizCode(str);
        }
    }

    public void setId(urb urbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f6d32", new Object[]{this, urbVar});
        } else {
            this.mAliNetworkAdapter.setId(urbVar);
        }
    }

    public void updateCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ea03b9", new Object[]{this});
        } else {
            this.mAliNetworkAdapter.updateCurId();
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetwork
    public boolean sendRequest(IRequest iRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f55a9b04", new Object[]{this, iRequest})).booleanValue();
        }
        if (consumePrefetchRequest(iRequest)) {
            try {
                WVUCWebView wVUCWebView = this.mWebView;
                if (wVUCWebView != null) {
                    wVUCWebView.getWebViewContext().getWebViewPageModel().onProperty("documentPrefetchHit", Boolean.TRUE);
                }
            } catch (Exception unused) {
            }
            return true;
        } else if (iRequest instanceof MTopSSRRequest) {
            return this.mMtopSsrNetworkAdapter.sendRequest(iRequest);
        } else {
            return this.mAliNetworkAdapter.sendRequest(iRequest);
        }
    }

    public AliNetworkAdapterNew(Context context, String str, WVUCWebView wVUCWebView) {
        AliNetworkAdapter aliNetworkAdapter = new AliNetworkAdapter(context, str, wVUCWebView);
        this.mAliNetworkAdapter = aliNetworkAdapter;
        MtopSsrNetworkAdapter mtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(aliNetworkAdapter, wVUCWebView);
        this.mMtopSsrNetworkAdapter = mtopSsrNetworkAdapter;
        this.mWebView = wVUCWebView;
        if (vpw.commonConfig.n1 && wVUCWebView != null) {
            mtopSsrNetworkAdapter.setParentId(wVUCWebView.pageTracker.getPageIdentifier());
        }
    }

    public AliNetworkAdapterNew(Context context, int i) {
        AliNetworkAdapter aliNetworkAdapter = new AliNetworkAdapter(context, i);
        this.mAliNetworkAdapter = aliNetworkAdapter;
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(aliNetworkAdapter, null);
    }

    public AliNetworkAdapterNew(Context context) {
        AliNetworkAdapter aliNetworkAdapter = new AliNetworkAdapter(context);
        this.mAliNetworkAdapter = aliNetworkAdapter;
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(aliNetworkAdapter, null);
    }

    public AliNetworkAdapterNew(Context context, int i, String str) {
        AliNetworkAdapter aliNetworkAdapter = new AliNetworkAdapter(context, i, str);
        this.mAliNetworkAdapter = aliNetworkAdapter;
        this.mMtopSsrNetworkAdapter = new MtopSsrNetworkAdapter(aliNetworkAdapter, null);
    }
}
