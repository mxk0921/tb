package tb;

import android.os.Handler;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.extra.uc.AliRequestAdapter;
import android.taobao.windvane.extra.uc.WVUCWebView;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ffs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements NetworkCallBack.FinishListener, NetworkCallBack.ResponseCodeListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RequestCallback f19259a;

        public a(ffs ffsVar, RequestCallback requestCallback) {
            this.f19259a = requestCallback;
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (progressEvent != null) {
                byte[] bytedata = progressEvent.getBytedata();
                int size = progressEvent.getSize();
                if (this.f19259a != null && bytedata != null) {
                    this.f19259a.onReceiveData(Arrays.copyOf(bytedata, size));
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else if (finishEvent != null) {
                int httpCode = finishEvent.getHttpCode();
                if (httpCode < 0) {
                    String desc = finishEvent.getDesc();
                    RequestCallback requestCallback = this.f19259a;
                    if (requestCallback != null) {
                        requestCallback.onError(httpCode, desc);
                        return;
                    }
                    return;
                }
                RequestCallback requestCallback2 = this.f19259a;
                if (requestCallback2 != null) {
                    requestCallback2.onFinish();
                }
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            RequestCallback requestCallback = this.f19259a;
            if (requestCallback != null) {
                requestCallback.onResponse(i, map);
                this.f19259a.onNetworkResponse(i, map);
            }
            return false;
        }
    }

    static {
        t2o.a(989855888);
        t2o.a(989855863);
    }

    public void a(Request request, RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71150c06", new Object[]{this, request, requestCallback, handler});
            return;
        }
        RequestImpl requestImpl = new RequestImpl(request.j());
        requestImpl.setFollowRedirects(false);
        requestImpl.setRetryTime(AliRequestAdapter.retryTimes);
        requestImpl.setConnectTimeout(AliRequestAdapter.connectTimeout);
        requestImpl.setReadTimeout(AliRequestAdapter.readTimeout);
        requestImpl.setCookieEnabled(WVUCWebView.isNeedCookie(request.j()));
        requestImpl.setMethod(request.e());
        if (request.c() != null) {
            for (Map.Entry<String, String> entry : request.c().entrySet()) {
                requestImpl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        new DegradableNetwork(Globals.getApplication()).asyncSend(requestImpl, request.j(), handler, new a(this, requestCallback));
    }
}
