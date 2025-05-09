package com.taobao.mrt.mtop;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import tb.k4j;
import tb.kgh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DataSender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static DataSender f11139a;

    static {
        t2o.a(577765391);
    }

    public static synchronized DataSender a() {
        synchronized (DataSender.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataSender) ipChange.ipc$dispatch("a768ef00", new Object[0]);
            }
            if (f11139a == null) {
                f11139a = new DataSender();
            }
            return f11139a;
        }
    }

    public void b(k4j k4jVar, Map<String, String> map, final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e41b13", new Object[]{this, k4jVar, map, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(k4jVar.f22395a);
        mtopRequest.setVersion(k4jVar.b);
        mtopRequest.setNeedEcode(k4jVar.d);
        mtopRequest.setNeedSession(k4jVar.c);
        if (map == null || map.isEmpty()) {
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(k4jVar.e));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            Map<String, String> map2 = k4jVar.e;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
        }
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        String str = MRT.f11137a;
        if (!TextUtils.isEmpty(str)) {
            build.ttid(str);
        } else {
            kgh.a("DataSender", "TTID为空！");
        }
        build.showLoginUI(k4jVar.g);
        build.reqMethod(k4jVar.f);
        ((MtopBusiness) build).requestContext = k4jVar;
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.mrt.mtop.DataSender.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onError(i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSuccess(i, mtopResponse, baseOutDo, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
                }
            }
        });
        build.startRequest();
    }
}
