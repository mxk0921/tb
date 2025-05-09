package com.taobao.social.sdk.net;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.h8q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, RemoteBusiness> f11788a = new HashMap<>();
    public final AtomicInteger b = new AtomicInteger();

    static {
        t2o.a(817889345);
    }

    public RemoteBusiness createRemoteBusiness(MtopRequest mtopRequest, ISocialBusinessListener<?> iSocialBusinessListener, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("50dcf7fe", new Object[]{this, mtopRequest, iSocialBusinessListener, hashMap});
        }
        if (mtopRequest == null) {
            return null;
        }
        h8q h8qVar = new h8q();
        h8qVar.setRequestParams(hashMap);
        h8qVar.businessId = this.b.getAndIncrement();
        h8qVar.listener = iSocialBusinessListener;
        mtopRequest.setData(JSON.toJSONString(mtopRequest.dataParams));
        mtopRequest.dataParams = null;
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.reqMethod(MethodEnum.POST);
        build.retryTime(1);
        ((MtopBusiness) build).requestContext = h8qVar;
        this.f11788a.put(Integer.valueOf(h8qVar.businessId), build);
        return build;
    }

    public int getBusinessId(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e4ed30b", new Object[]{this, remoteBusiness})).intValue();
        }
        if (remoteBusiness == null) {
            return -1;
        }
        Object obj = ((MtopBusiness) remoteBusiness).requestContext;
        if (!(obj instanceof h8q)) {
            return -1;
        }
        return ((h8q) obj).businessId;
    }

    public <T> void notifyListener(Object obj, boolean z, MtopResponse mtopResponse, T t, String str, String str2) {
        ISocialBusinessListener<?> iSocialBusinessListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f70fc9", new Object[]{this, obj, new Boolean(z), mtopResponse, t, str, str2});
        } else if (obj instanceof h8q) {
            h8q h8qVar = (h8q) obj;
            if (this.f11788a.remove(Integer.valueOf(h8qVar.businessId)) != null && (iSocialBusinessListener = h8qVar.listener) != null) {
                if (z) {
                    iSocialBusinessListener.onSuccess(mtopResponse, t);
                } else {
                    iSocialBusinessListener.onError(ISocialBusinessListener.ErrorType.ERROR_OTHER, str, str2);
                }
            }
        }
    }
}
