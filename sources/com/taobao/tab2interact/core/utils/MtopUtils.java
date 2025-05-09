package com.taobao.tab2interact.core.utils;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.MtopUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MtopUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtopUtils INSTANCE = new MtopUtils();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(MtopResponse mtopResponse);

        void b(MtopResponse mtopResponse);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class b<Data> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(689963203);
        }

        public abstract String getApi();

        public abstract Data getData();

        public abstract Map<String, String> getHeaders();

        public abstract String getVersion();

        public abstract boolean isNeedSession();

        public abstract void setApi(String str);

        public abstract void setData(Data data);

        public abstract void setHeaders(Map<String, String> map);

        public abstract void setNeedSession(boolean z);

        public abstract void setVersion(String str);
    }

    static {
        t2o.a(689963201);
    }

    public static final /* synthetic */ void a(MtopUtils mtopUtils, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858f0cc5", new Object[]{mtopUtils, mtopResponse, aVar});
        } else {
            mtopUtils.c(mtopResponse, aVar);
        }
    }

    public static final /* synthetic */ void b(MtopUtils mtopUtils, MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8769e5d", new Object[]{mtopUtils, mtopResponse, aVar});
        } else {
            mtopUtils.d(mtopResponse, aVar);
        }
    }

    public final void c(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b265dfa", new Object[]{this, mtopResponse, aVar});
        } else {
            aVar.b(mtopResponse);
        }
    }

    public final void d(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a669312", new Object[]{this, mtopResponse, aVar});
        } else {
            aVar.a(mtopResponse);
        }
    }

    public final void e(b<?> bVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e08059b", new Object[]{this, bVar, aVar});
            return;
        }
        ckf.g(bVar, "requestParams");
        ckf.g(aVar, "onRequestListener");
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(bVar.getApi());
        mtopRequest.setVersion(bVar.getVersion());
        mtopRequest.setNeedSession(bVar.isNeedSession());
        mtopRequest.setData(JSON.toJSONString(bVar.getData()));
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.headers(bVar.getHeaders());
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tab2interact.core.utils.MtopUtils$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    MtopUtils.a(MtopUtils.INSTANCE, mtopResponse, MtopUtils.a.this);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    MtopUtils.b(MtopUtils.INSTANCE, mtopResponse, MtopUtils.a.this);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    MtopUtils.a(MtopUtils.INSTANCE, mtopResponse, MtopUtils.a.this);
                }
            }
        });
        build.startRequest();
    }
}
