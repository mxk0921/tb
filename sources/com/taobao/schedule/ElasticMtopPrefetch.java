package com.taobao.schedule;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.MtopPrefetchStrategy;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.ja8;
import tb.la8;
import tb.pa8;
import tb.pxn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ElasticMtopPrefetch {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile MtopPrefetchStrategy b;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f11513a = false;
    public final Map<String, Long> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11514a;

        public a(String str) {
            this.f11514a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ElasticMtopPrefetch.a(ElasticMtopPrefetch.this, this.f11514a);
            } catch (Throwable th) {
                la8.b("elastic.MtopPrefetch", "[doNavProcess] error.", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11515a;

        public b(String str) {
            this.f11515a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ElasticMtopPrefetch.b(ElasticMtopPrefetch.this, this.f11515a);
            } catch (Throwable th) {
                la8.b("elastic.MtopPrefetch", "[doRegisterStrategy] error.", th, new Object[0]);
            }
        }
    }

    public static /* synthetic */ void a(ElasticMtopPrefetch elasticMtopPrefetch, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6784c065", new Object[]{elasticMtopPrefetch, str});
        } else {
            elasticMtopPrefetch.c(str);
        }
    }

    public static /* synthetic */ void b(ElasticMtopPrefetch elasticMtopPrefetch, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b44884", new Object[]{elasticMtopPrefetch, str});
        } else {
            elasticMtopPrefetch.d(str);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        String e = pxn.d().e();
        if (!TextUtils.isEmpty(e)) {
            ja8.a(new b(e));
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681f4bc0", new Object[]{this, str});
        } else if (this.f11513a) {
            ja8.a(new a(str));
        }
    }

    public final void g(MtopPrefetchStrategy.Content content) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f636c29", new Object[]{this, content});
        } else if (content != null) {
            la8.c("elastic.MtopPrefetch", "[sendPrefetch] called.", new Object[0]);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(content.requestAddress);
            mtopRequest.setVersion(content.requestVer);
            mtopRequest.setNeedEcode(content.needLogin);
            mtopRequest.setNeedSession(content.needSession);
            if (!TextUtils.isEmpty(content.requestParams)) {
                mtopRequest.setData(content.requestParams);
            }
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, pa8.a()), mtopRequest);
            if (content.needWua) {
                build.useWua();
            }
            if (!TextUtils.isEmpty(content.safeToken)) {
                HashMap hashMap = new HashMap();
                hashMap.put("asac", content.safeToken);
                build.headers((Map<String, String>) hashMap);
            }
            if (!TextUtils.isEmpty(content.requestMethod) && "POST".equals(content.requestMethod)) {
                build.reqMethod(MethodEnum.POST);
            }
            if (!TextUtils.isEmpty(content.dataType) && "originaljson".equals(content.dataType)) {
                build.setJsonType(JsonTypeEnum.ORIGINALJSON);
            }
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.schedule.ElasticMtopPrefetch.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        la8.c("elastic.MtopPrefetch", "onError", "api", mtopResponse.getApi(), "v", mtopResponse.getV(), "code", mtopResponse.getRetCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        la8.c("elastic.MtopPrefetch", "onSystemError", "api", mtopResponse.getApi(), "v", mtopResponse.getV(), "code", mtopResponse.getRetCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else {
                        la8.c("elastic.MtopPrefetch", "onSuccess", "api", mtopResponse.getApi(), "v", mtopResponse.getV(), "code", mtopResponse.getRetCode());
                    }
                }
            }).prefetch(content.expiredTime, (MtopPrefetch.IPrefetchCallback) new c(this)).startRequest();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(ElasticMtopPrefetch elasticMtopPrefetch) {
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
            } else {
                la8.c("elastic.MtopPrefetch", "onPrefetch", "type", str, "extra", hashMap);
            }
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c649e9b2", new Object[]{this, str});
            return;
        }
        la8.c("elastic.MtopPrefetch", "[doRegisterStrategy] called.", "strategy", str);
        this.b = (MtopPrefetchStrategy) JSON.parseObject(str, MtopPrefetchStrategy.class);
        if (this.b == null) {
            la8.c("elastic.MtopPrefetch", "[doRegisterStrategy] strategy is null.", new Object[0]);
        }
        this.f11513a = this.b.enable;
        la8.c("elastic.MtopPrefetch", "[doRegisterStrategy]", "enable", Boolean.valueOf(this.f11513a));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.schedule.ElasticMtopPrefetch.c(java.lang.String):void");
    }
}
