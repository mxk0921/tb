package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.HttpConnector;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cookie.CookieManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DegradeTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.DegradeTask";
    private RequestContext rc;
    private Request request;
    private volatile boolean isCanceled = false;
    public volatile Cancelable cancelable = null;
    private int contentLength = 0;
    private int dataChunkIndex = 0;

    static {
        t2o.a(607126116);
        t2o.a(607126132);
    }

    public DegradeTask(RequestContext requestContext) {
        this.rc = requestContext;
        this.request = requestContext.config.getAwcnRequest();
    }

    public static /* synthetic */ RequestContext access$000(DegradeTask degradeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestContext) ipChange.ipc$dispatch("28307c9c", new Object[]{degradeTask});
        }
        return degradeTask.rc;
    }

    public static /* synthetic */ int access$100(DegradeTask degradeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16c5520a", new Object[]{degradeTask})).intValue();
        }
        return degradeTask.contentLength;
    }

    public static /* synthetic */ int access$102(DegradeTask degradeTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47be367d", new Object[]{degradeTask, new Integer(i)})).intValue();
        }
        degradeTask.contentLength = i;
        return i;
    }

    public static /* synthetic */ int access$200(DegradeTask degradeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b166148b", new Object[]{degradeTask})).intValue();
        }
        return degradeTask.dataChunkIndex;
    }

    public static /* synthetic */ int access$208(DegradeTask degradeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db718a93", new Object[]{degradeTask})).intValue();
        }
        int i = degradeTask.dataChunkIndex;
        degradeTask.dataChunkIndex = 1 + i;
        return i;
    }

    public static /* synthetic */ Request access$300(DegradeTask degradeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("e269ef1c", new Object[]{degradeTask});
        }
        return degradeTask.request;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.isCanceled = true;
        if (this.cancelable != null) {
            this.cancelable.cancel();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.isCanceled) {
            if (this.rc.config.isRequestCookieEnabled()) {
                String cookie = CookieManager.getCookie(this.rc.config.getUrlString());
                if (!TextUtils.isEmpty(cookie)) {
                    Request.Builder newBuilder = this.request.newBuilder();
                    String str = this.request.getHeaders().get("Cookie");
                    if (!TextUtils.isEmpty(str)) {
                        cookie = StringUtils.concatString(str, "; ", cookie);
                    }
                    if (AwcnConfig.isHostInCookiePrintLogWhiteList(this.request.getHost())) {
                        RequestContext requestContext = this.rc;
                        CookieManager.printLog("DegradeTask", requestContext.seqNum, cookie, requestContext.config.getUrlString());
                    }
                    newBuilder.addHeader("Cookie", cookie);
                    this.request = newBuilder.build();
                }
            }
            this.request.rs.degraded = 2;
            this.request.rs.sendBeforeTime = System.currentTimeMillis() - this.request.rs.reqStart;
            HttpConnector.connect(this.request, new RequestCb() { // from class: anetwork.channel.unified.DegradeTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.RequestCb
                public void onDataReceive(ByteArray byteArray, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                    } else if (!DegradeTask.access$000(DegradeTask.this).isDone.get()) {
                        DegradeTask.access$208(DegradeTask.this);
                        if (DegradeTask.access$000(DegradeTask.this).callback != null) {
                            DegradeTask.access$000(DegradeTask.this).callback.onDataReceiveSize(DegradeTask.access$200(DegradeTask.this), DegradeTask.access$100(DegradeTask.this), byteArray);
                        }
                    }
                }

                @Override // anet.channel.RequestCb
                public void onResponseCode(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                    } else if (!DegradeTask.access$000(DegradeTask.this).isDone.get()) {
                        DegradeTask.access$000(DegradeTask.this).cancelTimeoutTask();
                        CookieManager.setCookie(DegradeTask.access$000(DegradeTask.this).config.getHost(), DegradeTask.access$000(DegradeTask.this).config.getUrlString(), map);
                        DegradeTask.access$102(DegradeTask.this, HttpHelper.parseContentLength(map));
                        if (DegradeTask.access$000(DegradeTask.this).callback != null) {
                            DegradeTask.access$000(DegradeTask.this).callback.onResponseCode(i, map);
                        }
                    }
                }

                @Override // anet.channel.RequestCb
                public void onFinish(int i, String str2, RequestStatistic requestStatistic) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str2, requestStatistic});
                    } else if (!DegradeTask.access$000(DegradeTask.this).isDone.getAndSet(true)) {
                        if (ALog.isPrintLog(2)) {
                            ALog.i(DegradeTask.TAG, "[onFinish]", DegradeTask.access$000(DegradeTask.this).seqNum, "code", Integer.valueOf(i), "msg", str2);
                        }
                        DegradeTask.access$000(DegradeTask.this).cancelTimeoutTask();
                        requestStatistic.isDone.set(true);
                        if (DegradeTask.access$000(DegradeTask.this).callback != null) {
                            DegradeTask.access$000(DegradeTask.this).callback.onFinish(new DefaultFinishEvent(i, str2, DegradeTask.access$300(DegradeTask.this)));
                        }
                    }
                }
            });
        }
    }
}
