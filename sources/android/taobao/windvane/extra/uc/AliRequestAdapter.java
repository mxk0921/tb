package android.taobao.windvane.extra.uc;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import android.text.TextUtils;
import anetwork.channel.Header;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import tb.t2o;
import tb.trw;
import tb.v7t;
import tb.vpw;
import tb.x74;
import tb.yvj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliRequestAdapter implements IRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PHASE_ENDDATA = "enddata";
    private static final String PHASE_NORMAL = "normal";
    public static final String PHASE_RELOAD = "reload";
    public static final String PHASE_STOP = "stop";
    private String bizCode;
    private Context mContext;
    private EventHandler mEventHandler;
    public Future<Response> mFutureResponse;
    private Map<String, String> mHeaders;
    private boolean mIsUCProxy;
    private boolean mIsUseWebP;
    private int mLoadType;
    private String mMethod;
    private int mRequestType;
    private Map<String, String> mUCHeaders;
    private Map<String, byte[]> mUploadDataMap;
    private Map<String, String> mUploadFileMap;
    private long mUploadFileTotalLen;
    private String mUrl;
    public String originalUrl;
    public static int retryTimes = 1;
    public static int connectTimeout = 10000;
    public static int readTimeout = 10000;
    public String TAG = "alinetwork";
    private String mCurId = "";
    private String mParentId = "";
    private final Object mClientResource = new Object();
    private final ExtImgDecoder extImgDecoder = ExtImgDecoder.getInstance();
    public String cancelPhase = "normal";
    public Request mAliRequest = formatAliRequest();

    static {
        t2o.a(989856055);
        t2o.a(989856161);
    }

    public AliRequestAdapter(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2, boolean z2, String str3, Context context) {
        this.mMethod = "GET";
        this.mIsUseWebP = z2;
        this.mEventHandler = eventHandler;
        this.mUrl = str;
        this.mMethod = str2;
        this.mIsUCProxy = z;
        this.mHeaders = map;
        this.mUCHeaders = map2;
        this.mUploadFileMap = map3;
        this.mUploadDataMap = map4;
        this.mUploadFileTotalLen = j;
        this.mRequestType = i;
        this.mLoadType = i2;
        this.bizCode = str3;
        Context context2 = context;
        this.mContext = !(context2 instanceof Application) ? context.getApplicationContext() : context2;
    }

    private boolean bizCodeLimit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d8be50", new Object[]{this, str})).booleanValue();
        }
        if (!vpw.commonConfig.R0 && !str.contains("-yinhe.")) {
            return false;
        }
        return true;
    }

    private Request formatAliRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("4b92ef15", new Object[]{this}) : formatAliRequest(this.mUrl, this.mMethod, this.mIsUCProxy, this.mHeaders, this.mUCHeaders, this.mUploadFileMap, this.mUploadDataMap, this.mUploadFileTotalLen, this.mRequestType, this.mLoadType, this.mIsUseWebP);
    }

    public Request createRequest(String str, String str2, List<Header> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("8f97e605", new Object[]{this, str, str2, list});
        }
        Request createRequest = createRequest(str, str2);
        if (createRequest == null) {
            return null;
        }
        if (list != null) {
            createRequest.setHeaders(list);
        }
        return createRequest;
    }

    public Request getAliRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("1a01dad6", new Object[]{this});
        }
        return this.mAliRequest;
    }

    public String getCurId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24aaca54", new Object[]{this});
        }
        return this.mCurId;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public EventHandler getEventHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventHandler) ipChange.ipc$dispatch("ccb6ed91", new Object[]{this});
        }
        return this.mEventHandler;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.mHeaders;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public String getMethod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.mMethod;
    }

    public String getPId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc67dba4", new Object[]{this});
        }
        return this.mParentId;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, byte[]> getUploadDataMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e57f3617", new Object[]{this});
        }
        return this.mUploadDataMap;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public Map<String, String> getUploadFileMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96766785", new Object[]{this});
        }
        return this.mUploadFileMap;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public long getUploadFileTotalLen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6542f2df", new Object[]{this})).longValue();
        }
        return this.mUploadFileTotalLen;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.mUrl;
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        this.bizCode = str;
        Request request = this.mAliRequest;
        if (request != null) {
            request.setBizId(str);
        }
    }

    public void setCurId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d87160a", new Object[]{this, str});
        } else {
            this.mCurId = str;
        }
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void setEventHandler(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cc001", new Object[]{this, eventHandler});
        } else {
            this.mEventHandler = eventHandler;
        }
    }

    public void setFutureResponse(Future<Response> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc7f4d9", new Object[]{this, future});
        } else {
            this.mFutureResponse = future;
        }
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
            return;
        }
        this.mParentId = str;
        this.mAliRequest.setExtProperty(RequestConstant.KEY_PARENT_TRACE_ID, str);
    }

    private Request formatAliRequest(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2, boolean z2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("c74a03a3", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4, new Long(j), new Integer(i), new Integer(i2), new Boolean(z2)});
        }
        try {
            this.originalUrl = null;
            boolean canExtImgDecoder = this.extImgDecoder.canExtImgDecoder();
            if (z2 && x74.m(str)) {
                if (yvj.a(map)) {
                    String str4 = this.TAG;
                    v7t.i(str4, str + " is main document request, skip request modification");
                } else {
                    if (!canExtImgDecoder || !this.extImgDecoder.isExchangeImgUrlEnable() || !bizCodeLimit(str)) {
                        str3 = ImageStrategyDecider.justConvergeAndWebP(str);
                    } else if (vpw.commonConfig.S0) {
                        str3 = ImageStrategyDecider.convergeAndHeif(str);
                    } else {
                        str3 = ImageStrategyDecider.decideUrl(str, -1, -1, null);
                    }
                    if (!TextUtils.isEmpty(str3) && !str3.equals(str)) {
                        String str5 = this.TAG;
                        v7t.i(str5, str + " decideUrl to : " + str3);
                        this.originalUrl = str;
                        str = str3;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        Request createRequest = createRequest(str, str2, map);
        if (createRequest == null) {
            return null;
        }
        if (trw.getPerformanceMonitor() != null) {
            trw.getPerformanceMonitor().didResourceStartLoadAtTime(this.mUrl, System.currentTimeMillis());
        }
        return createRequest;
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void cancel() {
        Future<Response> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        if (WVUCWebView.isStop) {
            this.cancelPhase = "stop";
        }
        String str = this.TAG;
        v7t.d(str, "cancel id= " + this.mEventHandler.hashCode() + ", phase:[" + this.cancelPhase + "]");
        try {
            if (!(!v7t.h() || (future = this.mFutureResponse) == null || future.get() == null)) {
                String str2 = this.TAG;
                v7t.a(str2, "AliRequestAdapter cancel desc url=" + this.mFutureResponse.get().getDesc());
            }
            complete();
        } catch (InterruptedException e) {
            e.printStackTrace();
            String str3 = this.TAG;
            v7t.a(str3, "AliRequestAdapter cancel =" + e.getMessage());
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            String str4 = this.TAG;
            v7t.a(str4, "AliRequestAdapter cancel =" + e2.getMessage());
        }
        Future<Response> future2 = this.mFutureResponse;
        if (future2 != null) {
            future2.cancel(true);
        }
    }

    public void complete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77d7140", new Object[]{this});
            return;
        }
        WVUCWebView.isStop = false;
        if (this.mEventHandler.isSynchronous()) {
            synchronized (this.mClientResource) {
                v7t.a(this.TAG, "AliRequestAdapter complete will notify");
                this.mClientResource.notifyAll();
            }
        }
    }

    private Request createRequest(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("6ce155d6", new Object[]{this, str, str2});
        }
        try {
            RequestImpl requestImpl = new RequestImpl(str);
            requestImpl.setFollowRedirects(false);
            requestImpl.setBizId(this.bizCode);
            requestImpl.setRetryTime(retryTimes);
            requestImpl.setConnectTimeout(connectTimeout);
            requestImpl.setReadTimeout(readTimeout);
            requestImpl.setCookieEnabled(WVUCWebView.isNeedCookie(str));
            requestImpl.setMethod(str2);
            return requestImpl;
        } catch (Exception e) {
            String str3 = this.TAG;
            v7t.d(str3, " AliRequestAdapter formatAliRequest Exception" + e.getMessage());
            return null;
        }
    }

    private static boolean shouldModifyAcceptHeader(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f122c3b7", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.contains("/O1CN")) {
            return true;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (!TextUtils.equals("gw.alicdn.com", host)) {
                    if (TextUtils.equals("img.alicdn.com", host)) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public Request createRequest(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("b2210a4d", new Object[]{this, str, str2, map});
        }
        Request createRequest = createRequest(str, str2);
        if (createRequest == null) {
            return null;
        }
        if (map != null) {
            createRequest.addHeader("f-refer", "wv_h5");
            UCNetworkDelegate.getInstance().onSendRequest(map, str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                createRequest.addHeader(key, value);
                String str3 = this.TAG;
                v7t.a(str3, "AliRequestAdapter from uc header key=" + key + ",value=" + value);
            }
        }
        return createRequest;
    }
}
