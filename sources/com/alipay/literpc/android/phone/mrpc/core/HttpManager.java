package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpManager implements Transport {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HttpManager";
    public static HttpManager g;
    public static final ThreadFactory h = new ThreadFactory() { // from class: com.alipay.literpc.android.phone.mrpc.core.HttpManager.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f3848a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f3848a.getAndIncrement());
            thread.setPriority(4);
            return thread;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f3847a;
    public AndroidHttpClient b;
    public long c;
    public long d;
    public long e;
    public int f;
    public Context mContext;

    public HttpManager(Context context) {
        this.mContext = context;
        a();
    }

    public static final synchronized HttpManager c(Context context) {
        synchronized (HttpManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpManager) ipChange.ipc$dispatch("201b97b4", new Object[]{context});
            }
            HttpManager httpManager = g;
            if (httpManager != null) {
                return httpManager;
            }
            HttpManager httpManager2 = new HttpManager(context);
            g = httpManager2;
            return httpManager2;
        }
    }

    public static final HttpManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpManager) ipChange.ipc$dispatch("1f3f3313", new Object[]{context});
        }
        HttpManager httpManager = g;
        if (httpManager != null) {
            return httpManager;
        }
        return c(context);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.b = AndroidHttpClient.newInstance("android");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), h, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f3847a = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.mContext);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public void addConnectTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a5167", new Object[]{this, new Long(j)});
            return;
        }
        this.d += j;
        this.f++;
    }

    public void addDataSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab683011", new Object[]{this, new Long(j)});
        } else {
            this.c += j;
        }
    }

    public void addSocketTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623635c", new Object[]{this, new Long(j)});
        } else {
            this.e += j;
        }
    }

    public final FutureTask<Response> b(final HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("294047c9", new Object[]{this, httpWorker});
        }
        return new FutureTask<Response>(httpWorker) { // from class: com.alipay.literpc.android.phone.mrpc.core.HttpManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1159927561) {
                    super.done();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/literpc/android/phone/mrpc/core/HttpManager$1");
            }

            @Override // java.util.concurrent.FutureTask
            public void done() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("45231709", new Object[]{this});
                    return;
                }
                HttpUrlRequest request = httpWorker.getRequest();
                TransportCallback callback = request.getCallback();
                if (callback == null) {
                    super.done();
                    return;
                }
                try {
                    Response response = get();
                    if (!isCancelled() && !request.isCanceled()) {
                        if (response != null) {
                            callback.onPostExecute(request, response);
                            return;
                        }
                        return;
                    }
                    request.cancel();
                    if (!isCancelled() || !isDone()) {
                        cancel(false);
                    }
                    callback.onCancelled(request);
                } catch (InterruptedException e) {
                    callback.onFailed(request, 7, e + "");
                } catch (CancellationException unused) {
                    request.cancel();
                    callback.onCancelled(request);
                } catch (ExecutionException e2) {
                    if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                        callback.onFailed(request, 6, e2 + "");
                        return;
                    }
                    HttpException httpException = (HttpException) e2.getCause();
                    callback.onFailed(request, httpException.getCode(), httpException.getMsg());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occured while executing http request", th);
                }
            }
        };
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.f3847a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
            this.f3847a = null;
        }
        AndroidHttpClient androidHttpClient = this.b;
        if (androidHttpClient != null) {
            androidHttpClient.close();
        }
        this.b = null;
    }

    public String dumpPerf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5581c", new Object[]{this});
        }
        return String.format("HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.f3847a.getActiveCount()), Long.valueOf(this.f3847a.getCompletedTaskCount()), Long.valueOf(this.f3847a.getTaskCount()), Long.valueOf(getAverageSpeed()), Long.valueOf(getAverageConnectTime()), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f));
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.Transport
    public Future<Response> execute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("7fddfcbb", new Object[]{this, request});
        }
        if (request instanceof HttpUrlRequest) {
            if (MiscUtils.isDebugger(this.mContext)) {
                dumpPerf();
            }
            FutureTask<Response> b = b(generateWorker((HttpUrlRequest) request));
            this.f3847a.execute(b);
            return b;
        }
        throw new RuntimeException("request send error.");
    }

    public HttpWorker generateWorker(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpWorker) ipChange.ipc$dispatch("c877dd18", new Object[]{this, httpUrlRequest});
        }
        return new HttpWorker(this, httpUrlRequest);
    }

    public long getAverageConnectTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b2aeeb", new Object[]{this})).longValue();
        }
        int i = this.f;
        if (i == 0) {
            return 0L;
        }
        return this.d / i;
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue();
        }
        long j = this.e;
        if (j == 0) {
            return 0L;
        }
        return ((this.c * 1000) / j) >> 10;
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("3a43d37c", new Object[]{this});
        }
        return this.b;
    }
}
