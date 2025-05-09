package tb;

import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class v1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29739a;
        public String b;
        public final ByteArrayOutputStream c = new ByteArrayOutputStream();
        public boolean d = false;

        static {
            t2o.a(989855893);
        }

        public synchronized WebResourceResponse a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WebResourceResponse) ipChange.ipc$dispatch("108754b5", new Object[]{this});
            } else if (this.d) {
                return null;
            } else {
                this.d = true;
                byte[] byteArray = this.c.toByteArray();
                try {
                    this.c.close();
                    return new WebResourceResponse(this.f29739a, this.b, new ByteArrayInputStream(byteArray, 0, byteArray.length));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("898277f2", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5d3c9357", new Object[]{this, str});
            }
            this.f29739a = str;
            return this;
        }

        public synchronized b d(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1fa088be", new Object[]{this, bArr});
            } else if (this.d) {
                return this;
            } else {
                try {
                    this.c.write(bArr);
                    return this;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static {
        t2o.a(989855891);
    }

    public static WebResourceResponse a(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("823f4abd", new Object[]{webView, str});
        }
        if ((webView instanceof WVUCWebView) && webView.getCurrentViewCoreType() != 3 && !TextUtils.isEmpty(str)) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            b bVar = new b();
            if (android.taobao.windvane.export.network.b.c(str, new a(bVar, countDownLatch), null)) {
                try {
                    boolean await = countDownLatch.await(10L, TimeUnit.SECONDS);
                    WebResourceResponse a2 = bVar.a();
                    if (await) {
                        return a2;
                    }
                    lcn.a(RVLLevel.Error, "Themis/Performance/RequestPrefetch").j("interceptTimeout").a("url", str).f();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a extends RequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f29738a;
        public final /* synthetic */ CountDownLatch b;

        public a(b bVar, CountDownLatch countDownLatch) {
            this.f29738a = bVar;
            this.b = countDownLatch;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/export/network/WebViewRequestInterceptor$1");
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
            } else {
                this.b.countDown();
            }
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                this.b.countDown();
            }
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onReceiveData(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
            } else {
                this.f29738a.d(bArr);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
            r3 = r5[1];
         */
        @Override // android.taobao.windvane.export.network.RequestCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onResponse(int r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) {
            /*
                r8 = this;
                r0 = 2
                r1 = 0
                r2 = 1
                com.android.alibaba.ip.runtime.IpChange r3 = tb.v1x.a.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001d
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r9)
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r9[r1] = r8
                r9[r2] = r4
                r9[r0] = r10
                java.lang.String r10 = "bb214fe9"
                r3.ipc$dispatch(r10, r9)
                return
            L_0x001d:
                java.util.Set r9 = r10.entrySet()
                java.util.Iterator r9 = r9.iterator()
            L_0x0025:
                boolean r10 = r9.hasNext()
                r3 = 0
                if (r10 == 0) goto L_0x008b
                java.lang.Object r10 = r9.next()
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                if (r10 != 0) goto L_0x0035
                goto L_0x0025
            L_0x0035:
                java.lang.Object r4 = r10.getKey()
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L_0x0025
                java.lang.String r5 = "Content-Type"
                boolean r4 = r4.equalsIgnoreCase(r5)
                if (r4 == 0) goto L_0x0025
                java.lang.Object r9 = r10.getValue()
                java.util.List r9 = (java.util.List) r9
                if (r9 == 0) goto L_0x008b
                int r10 = r9.size()
                if (r10 <= 0) goto L_0x008b
                java.lang.Object r9 = r9.get(r1)
                java.lang.String r9 = (java.lang.String) r9
                boolean r10 = android.text.TextUtils.isEmpty(r9)
                if (r10 == 0) goto L_0x0060
                goto L_0x008b
            L_0x0060:
                java.lang.String r10 = ";"
                java.lang.String[] r9 = r9.split(r10)     // Catch: Exception -> 0x008b
                r10 = r9[r1]     // Catch: Exception -> 0x008b
                r4 = 1
            L_0x0069:
                int r5 = r9.length     // Catch: Exception -> 0x008c
                if (r4 >= r5) goto L_0x008c
                r5 = r9[r4]     // Catch: Exception -> 0x008c
                java.lang.String r5 = r5.trim()     // Catch: Exception -> 0x008c
                java.lang.String r6 = "="
                java.lang.String[] r5 = r5.split(r6)     // Catch: Exception -> 0x008c
                int r6 = r5.length     // Catch: Exception -> 0x008c
                if (r6 != r0) goto L_0x0089
                r6 = r5[r1]     // Catch: Exception -> 0x008c
                java.lang.String r7 = "charset"
                boolean r6 = r6.equals(r7)     // Catch: Exception -> 0x008c
                if (r6 == 0) goto L_0x0089
                r3 = r5[r2]     // Catch: Exception -> 0x008c
                goto L_0x008c
            L_0x0089:
                int r4 = r4 + r2
                goto L_0x0069
            L_0x008b:
                r10 = r3
            L_0x008c:
                tb.v1x$b r9 = r8.f29738a
                r9.b(r3)
                tb.v1x$b r9 = r8.f29738a
                r9.c(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.v1x.a.onResponse(int, java.util.Map):void");
        }
    }
}
