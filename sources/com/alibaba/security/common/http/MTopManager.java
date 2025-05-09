package com.alibaba.security.common.http;

import android.content.Context;
import com.alibaba.security.common.http.interfaces.IHttpRequest;
import com.alibaba.security.common.http.interfaces.OnHttpCallBack;
import com.alibaba.security.common.http.model.HttpRequest;
import com.alibaba.security.common.http.model.HttpResponse;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.c4;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ReflectUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MTopManager implements IHttpRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String MTOP_INSTANCE_ID;
    public static c4 mTackLog;
    public final Context mContext;
    public final Mtop mMtopInstant;

    public MTopManager(Context context) {
        this.mContext = context;
        this.mMtopInstant = getMtopInstance(context.getApplicationContext());
    }

    public static /* synthetic */ boolean access$000(MTopManager mTopManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f462b1c0", new Object[]{mTopManager, str})).booleanValue();
        }
        return mTopManager.isWhite(str);
    }

    public static /* synthetic */ c4 access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4) ipChange.ipc$dispatch("9e54a4f7", new Object[0]);
        }
        return mTackLog;
    }

    public static /* synthetic */ HttpResponse access$200(MTopManager mTopManager, String str, Class cls) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("9fa17b10", new Object[]{mTopManager, str, cls});
        }
        return mTopManager.parseResponse(str, cls);
    }

    public static /* synthetic */ HttpResponse access$300(MTopManager mTopManager, MtopResponse mtopResponse, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("a3a0554", new Object[]{mTopManager, mtopResponse, cls});
        }
        return mTopManager.buildResponse(mtopResponse, cls);
    }

    private <T extends HttpResponse> T buildResponse(MtopResponse mtopResponse, Class<T> cls) {
        try {
            T newInstance = cls.newInstance();
            newInstance.retCode = mtopResponse.getRetCode();
            newInstance.retMsg = mtopResponse.getRetMsg();
            return newInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    private void callMtopAsync(String str, String str2, boolean z, String str3, MtopCallback.MtopFinishListener mtopFinishListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d315c8", new Object[]{this, str, str2, new Boolean(z), str3, mtopFinishListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setData(str3);
        MtopBuilder build = this.mMtopInstant.build(mtopRequest, f2.f2699a);
        if (z) {
            build.useWua();
        }
        build.addListener(mtopFinishListener);
        build.reqMethod(MethodEnum.POST).asyncRequest();
    }

    private MtopResponse callMtopSync(String str, String str2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("24ec2cae", new Object[]{this, str, str2, new Boolean(z), map});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
        MtopBuilder build = this.mMtopInstant.build(mtopRequest, f2.f2699a);
        if (z) {
            build.useWua();
        }
        return build.reqMethod(MethodEnum.POST).syncRequest();
    }

    private Mtop getMtopInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("5c619821", new Object[]{this, context});
        }
        String str = MTOP_INSTANCE_ID;
        if (str == null) {
            return Mtop.instance(context.getApplicationContext());
        }
        return Mtop.instance(str, context.getApplicationContext());
    }

    private <T extends HttpResponse> T parseResponse(String str, Class<T> cls) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((HttpResponse) ipChange.ipc$dispatch("cf0f009", new Object[]{this, str, cls}));
        }
        try {
            if (((HttpResponse) b.b(str, cls)) == null) {
                return null;
            }
            return (T) ((HttpResponse) b.b(str, cls));
        } catch (Exception unused) {
            throw new Exception("数据解析错误");
        }
    }

    public static void setMtopInstanceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd2148b", new Object[]{str});
        } else {
            MTOP_INSTANCE_ID = str;
        }
    }

    public static void setTrackLog(c4 c4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fa5f9b", new Object[]{c4Var});
        } else {
            mTackLog = c4Var;
        }
    }

    @Override // com.alibaba.security.common.http.interfaces.IHttpRequest
    public void asyncRequest(final HttpRequest httpRequest, final OnHttpCallBack onHttpCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46174018", new Object[]{this, httpRequest, onHttpCallBack});
            return;
        }
        final String apiName = httpRequest.apiName();
        String body = httpRequest.body();
        final long currentTimeMillis = System.currentTimeMillis();
        callMtopAsync(apiName, "1.0", true, body, new MtopCallback.MtopFinishListener() { // from class: com.alibaba.security.common.http.MTopManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
            public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                    return;
                }
                MtopResponse mtopResponse = mtopFinishEvent.mtopResponse;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (MTopManager.access$000(MTopManager.this, apiName)) {
                    String str2 = apiName;
                    if (mtopResponse == null) {
                        str = "";
                    } else {
                        str = mtopResponse.getRetCode();
                    }
                    TrackLog createNetWorkCostMonitor = TrackLog.createNetWorkCostMonitor(str2, currentTimeMillis2, str);
                    if (MTopManager.access$100() != null) {
                        MTopManager.access$100().a(httpRequest.verifyToken, createNetWorkCostMonitor);
                    }
                }
                OnHttpCallBack onHttpCallBack2 = onHttpCallBack;
                if (onHttpCallBack2 != null) {
                    if (mtopResponse == null) {
                        onHttpCallBack2.onFail(httpRequest, new IOException("response is null"));
                    } else if (!mtopResponse.isApiSuccess() || mtopResponse.getDataJsonObject() == null) {
                        OnHttpCallBack onHttpCallBack3 = onHttpCallBack;
                        HttpRequest httpRequest2 = httpRequest;
                        onHttpCallBack3.onSuccess(httpRequest2, MTopManager.access$300(MTopManager.this, mtopResponse, httpRequest2.classType()));
                    } else {
                        try {
                            onHttpCallBack.onSuccess(httpRequest, MTopManager.access$200(MTopManager.this, mtopResponse.getDataJsonObject().toString(), httpRequest.classType()));
                        } catch (Exception unused) {
                            onHttpCallBack.onSuccess(httpRequest, null);
                        }
                    }
                }
            }
        });
    }

    private boolean isWhite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df728274", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("mtop.verifycenter.rp.getwirelessconf");
        arrayList.add("mtop.verifycenter.rp.start");
        arrayList.add("mtop.verifycenter.rp.upload");
        arrayList.add("mtop.verifycenter.rp.submit");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    private MtopResponse callMtopSync(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("29b32f99", new Object[]{this, str, str2, new Boolean(z), str3});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setData(str3);
        MtopBuilder build = this.mMtopInstant.build(mtopRequest, f2.f2699a);
        if (z) {
            build.useWua();
        }
        return build.reqMethod(MethodEnum.POST).syncRequest();
    }
}
