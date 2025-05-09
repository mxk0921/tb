package com.taobao.weex.adapter;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.common.WXRequest;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultWXHttpAdapter implements IWXHttpAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final IEventReporterDelegate DEFAULT_DELEGATE = new NOPEventReportDelegate();
    private ExecutorService mExecutorService;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface IEventReporterDelegate {
        void httpExchangeFailed(IOException iOException);

        InputStream interpretResponseStream(InputStream inputStream);

        void postConnect();

        void preConnect(HttpURLConnection httpURLConnection, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class NOPEventReportDelegate implements IEventReporterDelegate {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(985661502);
            t2o.a(985661501);
        }

        private NOPEventReportDelegate() {
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public void httpExchangeFailed(IOException iOException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cce0c25", new Object[]{this, iOException});
            }
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public InputStream interpretResponseStream(InputStream inputStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("85dca6a1", new Object[]{this, inputStream});
            }
            return inputStream;
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public void postConnect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa9ce3b1", new Object[]{this});
            }
        }

        @Override // com.taobao.weex.adapter.DefaultWXHttpAdapter.IEventReporterDelegate
        public void preConnect(HttpURLConnection httpURLConnection, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2f62181", new Object[]{this, httpURLConnection, str});
            }
        }
    }

    static {
        t2o.a(985661498);
        t2o.a(985661517);
    }

    public static /* synthetic */ HttpURLConnection access$100(DefaultWXHttpAdapter defaultWXHttpAdapter, WXRequest wXRequest, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("79ed10d6", new Object[]{defaultWXHttpAdapter, wXRequest, onHttpListener});
        }
        return defaultWXHttpAdapter.openConnection(wXRequest, onHttpListener);
    }

    public static /* synthetic */ byte[] access$200(DefaultWXHttpAdapter defaultWXHttpAdapter, InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("11bd786e", new Object[]{defaultWXHttpAdapter, inputStream, onHttpListener});
        }
        return defaultWXHttpAdapter.readInputStreamAsBytes(inputStream, onHttpListener);
    }

    public static /* synthetic */ String access$300(DefaultWXHttpAdapter defaultWXHttpAdapter, InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bff11c50", new Object[]{defaultWXHttpAdapter, inputStream, onHttpListener});
        }
        return defaultWXHttpAdapter.readInputStream(inputStream, onHttpListener);
    }

    private void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        if (this.mExecutorService == null) {
            this.mExecutorService = new ThreadPoolExecutor(3, 3, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.weex.adapter.DefaultWXHttpAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable2});
                    }
                    return new Thread(runnable2, "WX-DefaultWXHttpAdapter-Executor");
                }
            });
        }
        ((ThreadPoolExecutor) this.mExecutorService).allowCoreThreadTimeOut(true);
        this.mExecutorService.execute(runnable);
    }

    private HttpURLConnection openConnection(WXRequest wXRequest, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("de989cbe", new Object[]{this, wXRequest, onHttpListener});
        }
        HttpURLConnection createConnection = createConnection(new URL(wXRequest.url));
        createConnection.setConnectTimeout(wXRequest.timeoutMs);
        createConnection.setReadTimeout(wXRequest.timeoutMs);
        createConnection.setUseCaches(false);
        createConnection.setDoInput(true);
        Map<String, String> map = wXRequest.paramMap;
        if (map != null) {
            for (String str : map.keySet()) {
                createConnection.addRequestProperty(str, wXRequest.paramMap.get(str));
            }
        }
        if ("POST".equals(wXRequest.method) || "PUT".equals(wXRequest.method) || "PATCH".equals(wXRequest.method)) {
            createConnection.setRequestMethod(wXRequest.method);
            if (wXRequest.body != null) {
                if (onHttpListener != null) {
                    onHttpListener.onHttpUploadProgress(0);
                }
                createConnection.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(createConnection.getOutputStream());
                dataOutputStream.write(wXRequest.body.getBytes());
                dataOutputStream.close();
                if (onHttpListener != null) {
                    onHttpListener.onHttpUploadProgress(100);
                }
            }
        } else if (!TextUtils.isEmpty(wXRequest.method)) {
            createConnection.setRequestMethod(wXRequest.method);
        } else {
            createConnection.setRequestMethod("GET");
        }
        return createConnection;
    }

    private String readInputStream(InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf757afe", new Object[]{this, inputStream, onHttpListener});
        }
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[2048];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
                if (onHttpListener != null) {
                    onHttpListener.onHttpResponseProgress(sb.length());
                }
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    private byte[] readInputStreamAsBytes(InputStream inputStream, IWXHttpAdapter.OnHttpListener onHttpListener) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9a4578a", new Object[]{this, inputStream, onHttpListener});
        }
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 2048);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                i += read;
                if (onHttpListener != null) {
                    onHttpListener.onHttpResponseProgress(i);
                }
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public HttpURLConnection createConnection(URL url) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("a9e1c93f", new Object[]{this, url});
        }
        return (HttpURLConnection) url.openConnection();
    }

    public IEventReporterDelegate getEventReporterDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEventReporterDelegate) ipChange.ipc$dispatch("9c30a347", new Object[]{this});
        }
        return DEFAULT_DELEGATE;
    }

    @Override // com.taobao.weex.adapter.IWXHttpAdapter
    public void sendRequest(final WXRequest wXRequest, final IWXHttpAdapter.OnHttpListener onHttpListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67369762", new Object[]{this, wXRequest, onHttpListener});
            return;
        }
        if (onHttpListener != null) {
            onHttpListener.onHttpStart();
        }
        execute(new Runnable() { // from class: com.taobao.weex.adapter.DefaultWXHttpAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r9 = this;
                    r0 = 0
                    r1 = 1
                    com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.weex.adapter.DefaultWXHttpAdapter.AnonymousClass2.$ipChange
                    boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r3 == 0) goto L_0x0012
                    java.lang.String r3 = "5c510192"
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r0] = r9
                    r2.ipc$dispatch(r3, r1)
                    return
                L_0x0012:
                    com.taobao.weex.WXSDKManager r2 = com.taobao.weex.WXSDKManager.getInstance()
                    java.util.Map r2 = r2.getAllInstanceMap()
                    com.taobao.weex.common.WXRequest r3 = r2
                    java.lang.String r3 = r3.instanceId
                    java.lang.Object r2 = r2.get(r3)
                    com.taobao.weex.WXSDKInstance r2 = (com.taobao.weex.WXSDKInstance) r2
                    if (r2 == 0) goto L_0x0033
                    boolean r3 = r2.i0()
                    if (r3 != 0) goto L_0x0033
                    tb.quw r3 = r2.E()
                    r3.c()
                L_0x0033:
                    com.taobao.weex.common.WXResponse r3 = new com.taobao.weex.common.WXResponse
                    r3.<init>()
                    com.taobao.weex.adapter.DefaultWXHttpAdapter r4 = com.taobao.weex.adapter.DefaultWXHttpAdapter.this
                    com.taobao.weex.adapter.DefaultWXHttpAdapter$IEventReporterDelegate r4 = r4.getEventReporterDelegate()
                    com.taobao.weex.adapter.DefaultWXHttpAdapter r5 = com.taobao.weex.adapter.DefaultWXHttpAdapter.this     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    com.taobao.weex.common.WXRequest r6 = r2     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    com.taobao.weex.adapter.IWXHttpAdapter$OnHttpListener r7 = r3     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    java.net.HttpURLConnection r5 = com.taobao.weex.adapter.DefaultWXHttpAdapter.access$100(r5, r6, r7)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    com.taobao.weex.common.WXRequest r6 = r2     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    java.lang.String r6 = r6.body     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    r4.preConnect(r5, r6)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    java.util.Map r6 = r5.getHeaderFields()     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    int r7 = r5.getResponseCode()     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    com.taobao.weex.adapter.IWXHttpAdapter$OnHttpListener r8 = r3     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    if (r8 == 0) goto L_0x0063
                    r8.onHeadersReceived(r7, r6)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    goto L_0x0063
                L_0x005f:
                    r1 = move-exception
                    goto L_0x009f
                L_0x0061:
                    r1 = move-exception
                    goto L_0x009f
                L_0x0063:
                    r4.postConnect()     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    r3.statusCode = r6     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    r6 = 200(0xc8, float:2.8E-43)
                    if (r7 < r6) goto L_0x0087
                    r6 = 299(0x12b, float:4.19E-43)
                    if (r7 > r6) goto L_0x0087
                    java.io.InputStream r5 = r5.getInputStream()     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    java.io.InputStream r5 = r4.interpretResponseStream(r5)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    com.taobao.weex.adapter.DefaultWXHttpAdapter r6 = com.taobao.weex.adapter.DefaultWXHttpAdapter.this     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    com.taobao.weex.adapter.IWXHttpAdapter$OnHttpListener r7 = r3     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    byte[] r5 = com.taobao.weex.adapter.DefaultWXHttpAdapter.access$200(r6, r5, r7)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    r3.originalData = r5     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    goto L_0x0096
                L_0x0087:
                    com.taobao.weex.adapter.DefaultWXHttpAdapter r1 = com.taobao.weex.adapter.DefaultWXHttpAdapter.this     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    java.io.InputStream r5 = r5.getErrorStream()     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    com.taobao.weex.adapter.IWXHttpAdapter$OnHttpListener r6 = r3     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    java.lang.String r1 = com.taobao.weex.adapter.DefaultWXHttpAdapter.access$300(r1, r5, r6)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    r3.errorMsg = r1     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    r1 = 0
                L_0x0096:
                    com.taobao.weex.adapter.IWXHttpAdapter$OnHttpListener r5 = r3     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                    if (r5 == 0) goto L_0x009d
                    r5.onHttpFinish(r3)     // Catch: IllegalArgumentException -> 0x005f, IOException -> 0x0061
                L_0x009d:
                    r0 = r1
                    goto L_0x00c3
                L_0x009f:
                    r1.printStackTrace()
                    java.lang.String r5 = "-1"
                    r3.statusCode = r5
                    r3.errorCode = r5
                    java.lang.String r5 = r1.getMessage()
                    r3.errorMsg = r5
                    com.taobao.weex.adapter.IWXHttpAdapter$OnHttpListener r5 = r3
                    if (r5 == 0) goto L_0x00b5
                    r5.onHttpFinish(r3)
                L_0x00b5:
                    boolean r3 = r1 instanceof java.io.IOException
                    if (r3 == 0) goto L_0x00c3
                    java.io.IOException r1 = (java.io.IOException) r1     // Catch: all -> 0x00bf
                    r4.httpExchangeFailed(r1)     // Catch: all -> 0x00bf
                    goto L_0x00c3
                L_0x00bf:
                    r1 = move-exception
                    r1.printStackTrace()
                L_0x00c3:
                    if (r2 == 0) goto L_0x00d3
                    boolean r1 = r2.i0()
                    if (r1 != 0) goto L_0x00d3
                    tb.quw r1 = r2.E()
                    r2 = 0
                    r1.d(r0, r2)
                L_0x00d3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.adapter.DefaultWXHttpAdapter.AnonymousClass2.run():void");
            }
        });
    }
}
