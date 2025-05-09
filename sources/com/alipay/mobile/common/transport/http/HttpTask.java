package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportCallback;
import com.alipay.mobile.common.transport.concurrent.ActThreadPoolExecutor;
import com.alipay.mobile.common.transport.concurrent.ZFutureTask;
import com.alipay.mobile.common.transport.h5.H5HttpWorker;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpTask extends ZFutureTask<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HttpWorker f4080a;

    public HttpTask(HttpWorker httpWorker, int i) {
        super(httpWorker, i);
        this.f4080a = httpWorker;
    }

    public static /* synthetic */ Object ipc$super(HttpTask httpTask, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1619161865) {
            return new Boolean(super.cancel(((Boolean) objArr[0]).booleanValue()));
        }
        if (hashCode == 1159927561) {
            super.done();
            return null;
        } else if (hashCode == 1548812690) {
            super.run();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/transport/http/HttpTask");
        }
    }

    @Override // com.alipay.mobile.common.transport.concurrent.ZFutureTask, java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        this.f4080a.getOriginRequest().cancel();
        return super.cancel(z);
    }

    public void cancelAll(Request request, TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf1a257", new Object[]{this, request, transportCallback});
            return;
        }
        request.cancel();
        if (!isCancelled() || !isDone()) {
            cancel(false);
        }
        transportCallback.onCancelled(request);
    }

    @Override // com.alipay.mobile.common.transport.concurrent.ZFutureTask, java.util.concurrent.FutureTask
    public void done() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45231709", new Object[]{this});
            return;
        }
        this.mTaskState = 4;
        this.mObservable.notifyObservers(this);
        HttpUrlRequest originRequest = this.f4080a.getOriginRequest();
        TransportCallback callback = originRequest.getCallback();
        if (callback == null) {
            super.done();
            return;
        }
        try {
            Response response = get();
            if (!isCancelled() && !originRequest.isCanceled()) {
                if (response != null) {
                    callback.onPostExecute(originRequest, response);
                }
            }
            cancelAll(originRequest, callback);
        } catch (InterruptedException e) {
            originRequest.setFailedException(e);
            callback.onFailed(originRequest, 7, e + "");
        } catch (CancellationException unused) {
            originRequest.cancel("CancellationException");
            callback.onCancelled(originRequest);
        } catch (ExecutionException e2) {
            LogCatUtil.error(HttpWorker.TAG, "====done ExecutionException====" + e2.toString(), e2);
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }

    @Override // com.alipay.mobile.common.transport.concurrent.ZFutureTask
    public void fail(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473a2070", new Object[]{this, th});
            return;
        }
        setException(th);
        HttpUrlRequest originRequest = this.f4080a.getOriginRequest();
        TransportCallback callback = originRequest.getCallback();
        if (callback != null) {
            originRequest.setFailedException(th);
            callback.onFailed(originRequest, 7, th.getMessage());
        }
    }

    public String getOperationType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76cb9a4e", new Object[]{this});
        }
        return this.f4080a.getOperationType();
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f4080a.getOriginRequest().getUrl();
    }

    public boolean isH5Task() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cc1c047", new Object[]{this})).booleanValue();
        }
        return this.f4080a instanceof H5HttpWorker;
    }

    @Override // com.alipay.mobile.common.transport.concurrent.ZFutureTask, java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            super.run();
        }
    }

    public void setCurrentThreadPoolExecutor(ActThreadPoolExecutor actThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b02243", new Object[]{this, actThreadPoolExecutor});
            return;
        }
        HttpWorker httpWorker = this.f4080a;
        if (httpWorker != null && actThreadPoolExecutor != null) {
            httpWorker.setCurrentThreadPoolExecutor(actThreadPoolExecutor);
        }
    }
}
