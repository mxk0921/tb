package tb;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MockResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wb extends i00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Network i;
    public final Network j;
    public final Network k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ htj f30576a;
        public final /* synthetic */ o9o b;

        public a(htj htjVar, o9o o9oVar) {
            this.f30576a = htjVar;
            this.b = o9oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f30576a.onResponse(wb.this, this.b);
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.ANetworkCallImpl", wb.e(wb.this), "[enqueue]call NetworkCallback.onResponse error.", e);
            }
        }
    }

    static {
        t2o.a(589300038);
    }

    public wb(h3o h3oVar, Context context) {
        super(h3oVar, context);
        if (!SwitchConfig.getInstance().isGlobalSpdySwitchOpen()) {
            if (this.j == null) {
                this.j = new HttpNetwork(context);
            }
            this.k = this.j;
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.ANetworkCallImpl", this.e, "mNetwork=HttpNetwork in ANetworkCallImpl");
                return;
            }
            return;
        }
        this.k = new DegradableNetwork(context);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.ANetworkCallImpl", this.e, "mNetwork=DegradableNetwork in ANetworkCallImpl");
        }
    }

    public static /* synthetic */ String e(wb wbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3273a0b2", new Object[]{wbVar});
        }
        return wbVar.e;
    }

    public static /* synthetic */ Object ipc$super(wb wbVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/network/impl/ANetworkCallImpl");
    }

    @Override // tb.zu2
    public void a(htj htjVar) {
        MockResponse mockResponse;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f3d5fd", new Object[]{this, htjVar});
            return;
        }
        h3o request = request();
        if (!i00.g || !i00.f) {
            mockResponse = null;
        } else {
            mockResponse = d(request.s);
            if (mockResponse != null) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.ANetworkCallImpl", this.e, "[enqueue]get MockResponse succeed.mockResponse=" + mockResponse);
                }
                o9o c = c(request, mockResponse.statusCode, null, mockResponse.headers, mockResponse.byteData, null);
                String str = this.e;
                if (str != null) {
                    i = str.hashCode();
                } else {
                    i = hashCode();
                }
                MtopSDKThreadPoolExecutorFactory.submitCallbackTask(i, new a(htjVar, c));
                return;
            }
        }
        if (mockResponse == null) {
            FullTraceHelper.beginSection("mtop_sendRequest", this.e);
            this.d = this.k.asyncSend(xb.b(request), request.r, null, new rtj(this, htjVar, request.e));
            FullTraceHelper.endSection();
        }
    }

    @Override // tb.bs8
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e7299db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == -200) {
            return true;
        }
        return false;
    }
}
