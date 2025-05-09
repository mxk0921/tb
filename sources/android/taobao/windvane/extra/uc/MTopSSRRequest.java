package android.taobao.windvane.extra.uc;

import android.taobao.windvane.extra.uc.interfaces.EventHandler;
import android.taobao.windvane.extra.uc.interfaces.INetwork;
import android.taobao.windvane.extra.uc.interfaces.IRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.net.URLEncoder;
import java.util.Map;
import tb.bgq;
import tb.lcn;
import tb.t2o;
import tb.vpw;
import tb.wpw;
import tb.x74;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MTopSSRRequest implements IRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindVaneMTopSSRRequest";
    private EventHandler mEventHandler;
    private final Map<String, String> mHeaders;
    private final boolean mIsUCProxyReq;
    public int mLoadType;
    private final String mMethod;
    public int mRequestType;
    private final bgq mSsrRequest;
    private final Map<String, String> mUcHeaders;
    public Map<String, byte[]> mUploadDataMap;
    public Map<String, String> mUploadFileMap;
    public long mUploadFileTotalLen;
    private final String mUrl;

    static {
        t2o.a(989856066);
        t2o.a(989856161);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public IRequest copyRequest(INetwork iNetwork) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRequest) ipChange.ipc$dispatch("5b0fbdb4", new Object[]{this, iNetwork});
        }
        return iNetwork.formatRequest(this.mEventHandler, this.mUrl, this.mMethod, this.mIsUCProxyReq, this.mHeaders, this.mUcHeaders, this.mUploadFileMap, this.mUploadDataMap, this.mUploadFileTotalLen, this.mRequestType, this.mLoadType);
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

    public bgq getSsrRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bgq) ipChange.ipc$dispatch("a9b928fa", new Object[]{this});
        }
        return this.mSsrRequest;
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

    @Override // android.taobao.windvane.extra.uc.interfaces.IRequest
    public void setEventHandler(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31cc001", new Object[]{this, eventHandler});
        } else {
            this.mEventHandler = eventHandler;
        }
    }

    public MTopSSRRequest(EventHandler eventHandler, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4, long j, int i, int i2) {
        wpw wpwVar = vpw.commonConfig;
        if (wpwVar.w1 && map != null) {
            map.put("tb-client-context", x74.d());
            String aPICallRecords = APIContextHelper.getAPICallRecords(str);
            if (aPICallRecords != null) {
                if (wpwVar.X1) {
                    try {
                        aPICallRecords = URLEncoder.encode(aPICallRecords, "UTF-8");
                    } catch (Exception e) {
                        lcn.a(RVLLevel.Error, TAG).j("encodeAPIContext").a("msg", e.getMessage()).f();
                    }
                }
                map.put("api-context", aPICallRecords);
            }
        }
        this.mEventHandler = eventHandler;
        this.mUrl = str;
        this.mMethod = str2;
        this.mIsUCProxyReq = z;
        this.mHeaders = map;
        this.mUcHeaders = map2;
        this.mUploadFileMap = map3;
        this.mUploadDataMap = map4;
        this.mUploadFileTotalLen = j;
        this.mRequestType = i;
        this.mLoadType = i2;
        this.mSsrRequest = new bgq.b().d(str).b(map).c(str2).a();
    }
}
