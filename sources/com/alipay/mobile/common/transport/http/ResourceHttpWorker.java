package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ResourceHttpWorker extends HttpWorker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ResourceHttpWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        super(httpManager, httpUrlRequest);
        this.mTransportContext.allowedRetryDuration = getAllowedRetryDuration();
    }

    public static /* synthetic */ Object ipc$super(ResourceHttpWorker resourceHttpWorker, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/http/ResourceHttpWorker");
    }

    public boolean canRetryByRunTimeAndRetries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7786aea3", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mTransportContext.startExecutionTime;
        if (currentTimeMillis > 0 && currentTimeMillis <= getAllowedRetryDuration()) {
            return true;
        }
        LogCatUtil.debug(HttpWorker.TAG, "[canRetryByRunTimeAndRetries] taskTimeCost not conditions, taskTimeCost = " + currentTimeMillis);
        return false;
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public boolean canRetryCurrTaskForSubBiz(Throwable th) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f3c485", new Object[]{this, th})).booleanValue();
        }
        if (this.mOriginRequest.isCanceled()) {
            LogCatUtil.debug(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] User cancelled.");
            return false;
        } else if ((th instanceof HttpException) && !((HttpException) th).isCanRetry()) {
            LogCatUtil.debug(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] HttpException can't retry.");
            return false;
        } else if (!ZHttpRequestRetryHandler.isCanRetryForStandardHttpRequest(getOriginRequest())) {
            LogCatUtil.debug(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] Can't retry for std http request.");
            return false;
        } else if (!canRetryByRunTimeAndRetries()) {
            LogCatUtil.debug(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] Can't retry for times.");
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
                try {
                    LogCatUtil.info(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] Network unavailable., sleep 1s. ");
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    LogCatUtil.warn(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] sleep exception: " + th.toString());
                }
                if (this.mOriginRequest.isCanceled()) {
                    LogCatUtil.debug(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] After 1 second the user canceled.");
                    return false;
                }
            } else {
                if (this.mRetryTimes > 15) {
                    i = 1000;
                } else {
                    i = 500;
                }
                try {
                    LogCatUtil.info(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] Network available, sleep 500ms. ");
                    Thread.sleep(i);
                } catch (InterruptedException unused2) {
                    LogCatUtil.warn(HttpWorker.TAG, "[canRetryCurrTaskForSubBiz] sleep exception: " + th.toString());
                }
            }
            return true;
        }
    }

    @Override // com.alipay.mobile.common.transport.http.HttpWorker
    public boolean canRetryForNetworkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38a49d7", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public int getAllowedRetryDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d2cf784", new Object[]{this})).intValue();
        }
        return 60000;
    }
}
