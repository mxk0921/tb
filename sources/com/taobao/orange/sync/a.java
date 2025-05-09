package com.taobao.orange.sync;

import android.text.TextUtils;
import anet.channel.bytes.ByteArray;
import anet.channel.request.Request;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.sync.IndexUpdateHandler;
import com.taobao.orange.util.OLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import tb.cw0;
import tb.fck;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements Interceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_REQ_HEADER = "a-orange-q";
    public static final String ORANGE_RES_HEADER = "a-orange-p";
    public static final String TAG = "NetworkInterceptor";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.orange.sync.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0642a implements Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Interceptor.Chain f11403a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.orange.sync.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC0643a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f11404a;

            public RunnableC0643a(Map map) {
                this.f11404a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    cw0.i();
                    String b = a.b(this.f11404a, a.ORANGE_RES_HEADER);
                    com.taobao.orange.a.w = a.ORANGE_RES_HEADER;
                    IndexUpdateHandler.c(b, false);
                } catch (Throwable th) {
                    OLog.e(a.TAG, AURAPageEventStrategy.INTERCEPT, th, new Object[0]);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.orange.sync.a$a$b */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f11405a;

            public b(Map map) {
                this.f11405a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    cw0.i();
                    String b = a.b(this.f11405a, "a-orange-dp");
                    com.taobao.orange.a.w = "a-orange-dp";
                    IndexUpdateHandler.c(b, false);
                } catch (Throwable th) {
                    OLog.e(a.TAG, AURAPageEventStrategy.INTERCEPT, th, new Object[0]);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.orange.sync.a$a$c */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f11406a;

            public c(Map map) {
                this.f11406a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    cw0.i();
                    String b = a.b(this.f11406a, a.ORANGE_RES_HEADER);
                    com.taobao.orange.a.w = a.ORANGE_RES_HEADER;
                    IndexUpdateHandler.c(b, false);
                } catch (Throwable th) {
                    OLog.e(a.TAG, AURAPageEventStrategy.INTERCEPT, th, new Object[0]);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.orange.sync.a$a$d */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f11407a;

            public d(Map map) {
                this.f11407a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    cw0.i();
                    String b = a.b(this.f11407a, a.ORANGE_RES_HEADER);
                    com.taobao.orange.a.w = a.ORANGE_RES_HEADER;
                    IndexUpdateHandler.c(b, false);
                } catch (Throwable th) {
                    OLog.e(a.TAG, AURAPageEventStrategy.INTERCEPT, th, new Object[0]);
                }
            }
        }

        public C0642a(a aVar, Interceptor.Chain chain) {
            this.f11403a = chain;
        }

        @Override // anetwork.channel.interceptor.Callback
        public void onDataReceiveSize(int i, int i2, ByteArray byteArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d30133c3", new Object[]{this, new Integer(i), new Integer(i2), byteArray});
            } else {
                this.f11403a.callback().onDataReceiveSize(i, i2, byteArray);
            }
        }

        @Override // anetwork.channel.interceptor.Callback
        public void onFinish(DefaultFinishEvent defaultFinishEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1eb0dbf1", new Object[]{this, defaultFinishEvent});
            } else {
                this.f11403a.callback().onFinish(defaultFinishEvent);
            }
        }

        @Override // anetwork.channel.interceptor.Callback
        public void onResponseCode(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                return;
            }
            if (map != null) {
                if (com.taobao.orange.a.v > 0) {
                    if (com.taobao.orange.a.B && map.containsKey(a.ORANGE_RES_HEADER)) {
                        fck.c(new RunnableC0643a(map));
                    } else if (map.containsKey("a-orange-dp")) {
                        fck.c(new b(map));
                    } else if (map.containsKey(a.ORANGE_RES_HEADER)) {
                        fck.c(new c(map));
                    }
                } else if (map.containsKey(a.ORANGE_RES_HEADER)) {
                    fck.c(new d(map));
                }
            }
            this.f11403a.callback().onResponseCode(i, map);
        }
    }

    static {
        t2o.a(613417104);
        t2o.a(607126066);
    }

    public final Request.Builder a(Request.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request.Builder) ipChange.ipc$dispatch("405f60b2", new Object[]{this, builder});
        }
        if (com.taobao.orange.a.y) {
            if (OConstant.ENV.ONLINE == com.taobao.orange.a.C) {
                builder.addHeader("a-orange-env", "prod");
            } else if (OConstant.ENV.PREPARE == com.taobao.orange.a.C) {
                builder.addHeader("a-orange-env", "pre");
            } else if (OConstant.ENV.TEST == com.taobao.orange.a.C) {
                builder.addHeader("a-orange-env", "daily");
            }
        }
        return builder;
    }

    @Override // anetwork.channel.interceptor.Interceptor
    public Future intercept(Interceptor.Chain chain) {
        boolean z;
        Request.Builder builder;
        Request build;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("793d1164", new Object[]{this, chain});
        }
        Request request = chain.request();
        Callback callback = chain.callback();
        if (com.taobao.orange.a.s != OConstant.UPDMODE.O_EVENT && !TextUtils.isEmpty(request.getHost()) && !com.taobao.orange.a.r.isEmpty()) {
            for (String str : com.taobao.orange.a.r) {
                if (request.getHost().contains(str)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (com.taobao.orange.a.d && OConstant.SUB_PROCESS_INDEX_QUERY_HOSTS[com.taobao.orange.a.C.getEnvMode()].equals(request.getHost())) {
            z2 = true;
            z = true;
        }
        if (z) {
            if (com.taobao.orange.a.v > 0) {
                if (z2) {
                    builder = chain.request().newBuilder().setAllowRequestInBg(true);
                } else {
                    builder = chain.request().newBuilder();
                }
                Request.Builder a2 = a(builder);
                int i = com.taobao.orange.a.v;
                if (i == 1) {
                    if (!TextUtils.isEmpty(com.taobao.orange.a.n)) {
                        a2.addHeader(ORANGE_REQ_HEADER, com.taobao.orange.a.n);
                    }
                    if (!TextUtils.isEmpty(com.taobao.orange.a.o)) {
                        a2.addHeader("a-orange-dq", com.taobao.orange.a.o);
                    }
                    build = a2.build();
                } else if (i != 2) {
                    if (!TextUtils.isEmpty(com.taobao.orange.a.n)) {
                        a2.addHeader(ORANGE_REQ_HEADER, com.taobao.orange.a.n);
                    }
                    build = a2.build();
                } else {
                    if (!TextUtils.isEmpty(com.taobao.orange.a.o)) {
                        a2.addHeader("a-orange-dq", com.taobao.orange.a.o);
                    }
                    if (com.taobao.orange.a.B && !TextUtils.isEmpty(com.taobao.orange.a.n)) {
                        a2.addHeader(ORANGE_REQ_HEADER, com.taobao.orange.a.n);
                    }
                    build = a2.build();
                }
                request = build;
            } else if (!TextUtils.isEmpty(com.taobao.orange.a.n)) {
                Request.Builder a3 = a(chain.request().newBuilder());
                if (z2) {
                    request = a3.setAllowRequestInBg(true).addHeader(ORANGE_REQ_HEADER, com.taobao.orange.a.n).build();
                } else {
                    request = a3.addHeader(ORANGE_REQ_HEADER, com.taobao.orange.a.n).build();
                }
            }
            callback = new C0642a(this, chain);
        }
        return chain.proceed(request, callback);
    }

    public static String b(Map<String, List<String>> map, String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a523d909", new Object[]{map, str});
        }
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            Map.Entry<String, List<String>> next = it.next();
            if (str.equalsIgnoreCase(next.getKey())) {
                list = next.getValue();
                break;
            }
        }
        if (list == null || list.isEmpty()) {
            OLog.w(TAG, "getOrangeFromKey fail", "not exist a-orange-p");
            return null;
        }
        for (String str2 : list) {
            if (str2 != null && str2.startsWith(IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID)) {
                if (OLog.isPrintLog(1)) {
                    OLog.d(TAG, "getOrangeFromKey", "value", str2);
                }
                try {
                    return URLDecoder.decode(str2, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    OLog.w(TAG, "getOrangeFromKey", e, new Object[0]);
                    return null;
                }
            }
        }
        OLog.w(TAG, "getOrangeFromKey fail", "parseValue no resourceId");
        return null;
    }
}
