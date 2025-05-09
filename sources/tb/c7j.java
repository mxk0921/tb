package tb;

import android.os.Handler;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.extra.uc.APIContextHelper;
import android.taobao.windvane.extra.uc.ChunkCacheRequestCallback;
import android.taobao.windvane.extra.uc.MtopSsrServiceFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.bgq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class c7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements ChunkCacheRequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RequestCallback f16900a;

        public a(c7j c7jVar, RequestCallback requestCallback) {
            this.f16900a = requestCallback;
        }

        @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
        public void onCustomCallback(int i, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
                return;
            }
            RequestCallback requestCallback = this.f16900a;
            if (requestCallback != null) {
                requestCallback.onCustomCallback(i, objArr);
            }
        }

        @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
        public void onError(bgq bgqVar, egq egqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a95834", new Object[]{this, bgqVar, egqVar});
                return;
            }
            RequestCallback requestCallback = this.f16900a;
            if (requestCallback != null && egqVar != null) {
                requestCallback.onError(egqVar.f18565a, egqVar.c);
            }
        }

        @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
        public void onFinish(bgq bgqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d53f97", new Object[]{this, bgqVar});
                return;
            }
            RequestCallback requestCallback = this.f16900a;
            if (requestCallback != null) {
                requestCallback.onFinish();
            }
        }

        @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback
        public void onNetworkResponse(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
                return;
            }
            RequestCallback requestCallback = this.f16900a;
            if (requestCallback != null) {
                requestCallback.onNetworkResponse(i, map);
            }
        }

        @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
        public void onReceiveData(bgq bgqVar, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150b5e1a", new Object[]{this, bgqVar, bArr});
            } else if (bArr != null && this.f16900a != null) {
                this.f16900a.onReceiveData(Arrays.copyOf(bArr, bArr.length));
            }
        }

        @Override // android.taobao.windvane.extra.uc.ChunkCacheRequestCallback, tb.mnf
        public void onResponse(bgq bgqVar, int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e09d3a7", new Object[]{this, bgqVar, new Integer(i), map});
                return;
            }
            RequestCallback requestCallback = this.f16900a;
            if (requestCallback != null) {
                requestCallback.onResponse(i, map);
            }
        }
    }

    static {
        t2o.a(989855867);
        t2o.a(989855863);
    }

    public void a(Request request, RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71150c06", new Object[]{this, request, requestCallback, handler});
            return;
        }
        nnf createSsrService = MtopSsrServiceFactory.createSsrService();
        if (createSsrService == null) {
            lcn.f(RVLLevel.Error, "Themis/Performance/RequestPrefetch", "service is null");
            return;
        }
        wpw wpwVar = vpw.commonConfig;
        if (wpwVar.w1) {
            request.a("tb-client-context", x74.d());
            String aPICallRecords = APIContextHelper.getAPICallRecords(request.j());
            if (aPICallRecords != null) {
                if (wpwVar.X1) {
                    try {
                        aPICallRecords = URLEncoder.encode(aPICallRecords, "UTF-8");
                    } catch (Exception e) {
                        lcn.a(RVLLevel.Error, "Themis/Performance/RequestPrefetch").j("encodeAPIContext").a("msg", e.getMessage()).f();
                    }
                }
                request.a("api-context", aPICallRecords);
            }
        }
        createSsrService.asyncSend(new bgq.b().d(request.j()).b(request.c()).c(request.e()).a(), new a(this, requestCallback), handler);
    }
}
