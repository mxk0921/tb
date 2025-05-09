package com.alibaba.android.nextrpc.stream.internal.mtop;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.util.ErrorConstant;
import tb.k7j;
import tb.l7j;
import tb.m7j;
import tb.rb;
import tb.vpq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StreamMtopRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtopBusiness f2226a;
    public Handler b = null;

    public StreamMtopRequestClient(MtopBusiness mtopBusiness) {
        this.f2226a = mtopBusiness;
        a(mtopBusiness);
    }

    public final void a(MtopBusiness mtopBusiness) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f68a1f3", new Object[]{this, mtopBusiness});
            return;
        }
        MtopNetworkProp mtopNetworkProp = mtopBusiness.mtopProp;
        if (mtopNetworkProp != null && (handler = mtopNetworkProp.handler) != null && handler.getLooper() != Looper.getMainLooper()) {
            this.b = new Handler(Looper.getMainLooper());
        }
    }

    public void b(IStreamMtopRequestCallback iStreamMtopRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd8fc5c", new Object[]{this, iStreamMtopRequestCallback});
            return;
        }
        StreamResponse streamResponse = new StreamResponse(iStreamMtopRequestCallback, this.b);
        MtopBusiness mtopBusiness = this.f2226a;
        if (mtopBusiness != null) {
            mtopBusiness.streamMode(true);
            this.f2226a.addListener((MtopListener) streamResponse).startRequest();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class StreamResponse implements IMtopStreamListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final IStreamMtopRequestCallback callback;
        private Handler mainHandler;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ StreamRemoteMainResponse f2227a;
            public final /* synthetic */ String b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;
            public final /* synthetic */ m7j e;
            public final /* synthetic */ BaseOutDo f;
            public final /* synthetic */ int g;
            public final /* synthetic */ Object h;

            public a(StreamRemoteMainResponse streamRemoteMainResponse, String str, long j, long j2, m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
                this.f2227a = streamRemoteMainResponse;
                this.b = str;
                this.c = j;
                this.d = j2;
                this.e = m7jVar;
                this.f = baseOutDo;
                this.g = i;
                this.h = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                vpq statistics = this.f2227a.getStatistics();
                statistics.j(this.b);
                statistics.i(this.c);
                statistics.h(this.d);
                statistics.l(this.d);
                statistics.k(currentTimeMillis);
                if (this.e.i != null) {
                    z = true;
                }
                statistics.g(z);
                StreamResponse.access$000(StreamResponse.this).onReceiveData(this.f2227a, this.f, this.g, this.h);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ k7j f2228a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Object c;

            public b(k7j k7jVar, int i, Object obj) {
                this.f2228a = k7jVar;
                this.b = i;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    StreamResponse.access$000(StreamResponse.this).onError(this.f2228a, this.b, this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l7j f2229a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Object c;

            public c(l7j l7jVar, int i, Object obj) {
                this.f2229a = l7jVar;
                this.b = i;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    StreamResponse.access$000(StreamResponse.this).onFinish(this.f2229a, this.b, this.c);
                }
            }
        }

        public StreamResponse(IStreamMtopRequestCallback iStreamMtopRequestCallback, Handler handler) {
            this.callback = iStreamMtopRequestCallback;
            this.mainHandler = handler;
        }

        public static /* synthetic */ IStreamMtopRequestCallback access$000(StreamResponse streamResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IStreamMtopRequestCallback) ipChange.ipc$dispatch("f026f499", new Object[]{streamResponse});
            }
            return streamResponse.callback;
        }

        private void postToMain(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baa2c919", new Object[]{this, runnable});
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                if (this.mainHandler == null) {
                    this.mainHandler = new Handler(Looper.getMainLooper());
                }
                this.mainHandler.post(runnable);
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onError(k7j k7jVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i), obj});
            } else {
                postToMain(new b(k7jVar, i, obj));
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onFinish(l7j l7jVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
            } else {
                postToMain(new c(l7jVar, i, obj));
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
                return;
            }
            String str = m7jVar.f;
            if (str == null) {
                str = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            StreamRemoteMainResponse streamRemoteMainResponse = new StreamRemoteMainResponse(i, m7jVar, baseOutDo, obj);
            streamRemoteMainResponse.setData(parse(m7jVar));
            streamRemoteMainResponse.parseBizSuccess(m7jVar.h);
            postToMain(new a(streamRemoteMainResponse, str, currentTimeMillis, System.currentTimeMillis(), m7jVar, baseOutDo, i, obj));
        }

        private JSONObject parse(m7j m7jVar) {
            String[] split;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("963e15f1", new Object[]{this, m7jVar});
            }
            JSONObject jSONObject = null;
            if (m7jVar.h == null) {
                byte[] bArr = m7jVar.e;
                if (bArr == null || bArr.length == 0) {
                    m7jVar.f23820a = ErrorConstant.ERRCODE_JSONDATA_BLANK;
                    m7jVar.b = ErrorConstant.ERRMSG_JSONDATA_BLANK;
                    return null;
                }
                try {
                    JSONObject jSONObject2 = m7jVar.i;
                    jSONObject = jSONObject2 == null ? (JSONObject) JSON.parseObject(bArr, JSONObject.class, new Feature[0]) : jSONObject2;
                    JSONArray jSONArray = jSONObject.getJSONArray(rb.RESULT_KEY);
                    if (jSONArray != null) {
                        int size = jSONArray.size();
                        String[] strArr = new String[size];
                        for (int i = 0; i < jSONArray.size(); i++) {
                            strArr[i] = String.valueOf(jSONArray.get(i));
                        }
                        m7jVar.h = strArr;
                        if (size > 0) {
                            String str = strArr[0];
                            if (StringUtils.isNotBlank(str) && (split = str.split("::")) != null && split.length > 1) {
                                m7jVar.f23820a = split[0];
                                m7jVar.b = split[1];
                            }
                        }
                    }
                } catch (Exception unused) {
                    m7jVar.f23820a = ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR;
                    m7jVar.b = ErrorConstant.ERRMSG_JSONDATA_PARSE_ERROR;
                }
                return jSONObject;
            }
            JSONObject jSONObject3 = m7jVar.i;
            if (jSONObject3 != null) {
                return jSONObject3;
            }
            return null;
        }
    }
}
