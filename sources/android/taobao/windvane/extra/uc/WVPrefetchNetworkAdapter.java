package android.taobao.windvane.extra.uc;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import tb.krw;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVPrefetchNetworkAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_TYPE_DEGRADABLE_NETWORK = 2;
    public static final int NETWORK_TYPE_HTTP_NETWORK = 0;
    public static final int NETWORK_TYPE_SPDY_NETWORK = 1;
    public static final int STATE_ADDED = 3;
    public static final int STATE_FAILED = 4;
    public static final int STATE_RECEIVED = 2;
    public static final int STATE_STARTED = 1;
    public static final int STATE_TIMEOUT = 5;
    private static final String TAG = "WVPrefetchNetworkAdapter";
    private Network mAliNetwork;
    private Context mContext;
    private int mNetworkType;
    private Request request;
    private long timeout;
    private String urlString;
    private int state = 0;
    private long startTime = System.currentTimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class CallableThread implements Callable<Response> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856096);
        }

        public CallableThread() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Response call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Response) ipChange.ipc$dispatch("9ebc4f27", new Object[]{this});
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Response syncSend = WVPrefetchNetworkAdapter.access$100(WVPrefetchNetworkAdapter.this).syncSend(WVPrefetchNetworkAdapter.access$000(WVPrefetchNetworkAdapter.this), null);
                y71.init();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                y71.commitPreloadMainHtmlInfo(WVPrefetchNetworkAdapter.access$200(WVPrefetchNetworkAdapter.this), currentTimeMillis2, (WVPrefetchNetworkAdapter.access$300(WVPrefetchNetworkAdapter.this) == 0 ? "short" : "long").concat(" netTime"));
                v7t.d(WVPrefetchNetworkAdapter.TAG, "WVPrefetch netTime=" + currentTimeMillis2);
                return syncSend;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    static {
        t2o.a(989856095);
    }

    public WVPrefetchNetworkAdapter(Context context, int i, long j, Request request) {
        this.mContext = context;
        this.mNetworkType = i;
        this.timeout = j;
        this.request = request;
        this.urlString = request.getUrlString();
        int i2 = this.mNetworkType;
        if (i2 == 0) {
            this.mAliNetwork = new HttpNetwork(context);
        } else if (i2 == 1 || i2 == 2) {
            this.mAliNetwork = new DegradableNetwork(context);
        }
    }

    public static /* synthetic */ Request access$000(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("f30450af", new Object[]{wVPrefetchNetworkAdapter});
        }
        return wVPrefetchNetworkAdapter.request;
    }

    public static /* synthetic */ Network access$100(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Network) ipChange.ipc$dispatch("1ee965b1", new Object[]{wVPrefetchNetworkAdapter});
        }
        return wVPrefetchNetworkAdapter.mAliNetwork;
    }

    public static /* synthetic */ String access$200(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c69e0ad", new Object[]{wVPrefetchNetworkAdapter});
        }
        return wVPrefetchNetworkAdapter.urlString;
    }

    public static /* synthetic */ int access$300(WVPrefetchNetworkAdapter wVPrefetchNetworkAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afb06c65", new Object[]{wVPrefetchNetworkAdapter})).intValue();
        }
        return wVPrefetchNetworkAdapter.mNetworkType;
    }

    public long getStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.startTime;
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.state;
    }

    public String getUrlString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bb9898f", new Object[]{this});
        }
        return this.urlString;
    }

    public boolean sendRequest() {
        Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fa6eaf2", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            this.state = 1;
            v7t.a(TAG, "url=" + this.request.getUrlString());
            FutureTask futureTask = new FutureTask(new CallableThread());
            new Thread(futureTask, TAG).start();
            try {
                vpw.b();
                response = (Response) futureTask.get(vpw.commonConfig.a0, TimeUnit.MILLISECONDS);
                v7t.a(TAG, "response get success:" + response);
            } catch (Exception e) {
                v7t.d(TAG, "task.get error");
                e.printStackTrace();
                response = null;
            }
            if (response == null) {
                this.state = 5;
                return false;
            }
            this.state = 2;
            Throwable error = response.getError();
            if (error != null) {
                this.state = 4;
                v7t.d(TAG, " failed " + error);
            } else {
                int statusCode = response.getStatusCode();
                v7t.a(TAG, "status code=" + statusCode);
                if (!(statusCode < 0 || statusCode == 301 || statusCode == 302 || statusCode == 303 || statusCode == 307)) {
                    long j = response.getStatisticData() != null ? response.getStatisticData().oneWayTime_ANet : 0L;
                    byte[] bytedata = response.getBytedata();
                    if (bytedata != null && bytedata.length > 0) {
                        krw.d().b(this.request.getUrlString(), response.getConnHeadFields(), bytedata, this.timeout, j);
                        this.state = 3;
                    }
                }
                v7t.a(TAG, BaseFBPlugin.VERIFY_STATUS.abort);
            }
            return true;
        }
    }
}
