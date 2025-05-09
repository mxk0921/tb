package com.flybird.deploy;

import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.jst;
import tb.pgh;
import tb.y0a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, HashSet<y0a<b, Void, Throwable>>> f4991a = new HashMap<>();

    /* compiled from: Taobao */
    /* renamed from: com.flybird.deploy.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class RunnableC0244a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4992a;

        public RunnableC0244a(String str) {
            this.f4992a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Exception e;
            HashSet<y0a<b, Void, Throwable>> remove;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b bVar = null;
            try {
                e = null;
                bVar = a.a(this.f4992a);
            } catch (Exception e2) {
                e = e2;
            }
            String str = this.f4992a;
            HashMap<String, HashSet<y0a<b, Void, Throwable>>> hashMap = a.f4991a;
            synchronized (hashMap) {
                remove = hashMap.remove(str);
            }
            if (remove != null) {
                Iterator<y0a<b, Void, Throwable>> it = remove.iterator();
                while (it.hasNext()) {
                    y0a<b, Void, Throwable> next = it.next();
                    if (next != null) {
                        if (e != null) {
                            try {
                                next.error(e);
                            } catch (Throwable th) {
                                pgh.g("error while executing CDNDownloader cb", th);
                            }
                        } else {
                            next.apply(bVar);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f4993a;
        public final int b;
        public final byte[] c;

        public b(String str, Map<String, List<String>> map, int i, byte[] bArr) {
            this.f4993a = str;
            this.b = i;
            this.c = bArr;
        }

        public String toString() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("<CdnHttpResponse of ");
            sb.append(this.f4993a);
            sb.append(", status = ");
            sb.append(this.b);
            sb.append(", response length = ");
            byte[] bArr = this.c;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = -1;
            }
            sb.append(i);
            sb.append(">");
            return sb.toString();
        }
    }

    public static b a(String str) throws Exception {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("21e80972", new Object[]{str});
        }
        pgh.i("FBCDNDownloader", "doHttpRequestSync: " + str);
        jst.a();
        IpChange ipChange2 = Platform.$ipChange;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (responseCode == 200) {
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 1024);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    bufferedInputStream.close();
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused3) {
                    }
                    b bVar = new b(str, headerFields, responseCode, byteArray);
                    pgh.i("FBCDNDownloader", "doHttpRequestSync: " + str + " success -> " + bVar);
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        pgh.f("FBCDNDownloader", "doHttpRequestSync: " + str + " failed", th);
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            } else if (httpURLConnection.getErrorStream() != null) {
                                httpURLConnection.getErrorStream().close();
                            }
                        } catch (Throwable unused4) {
                        }
                        throw th3;
                    }
                }
            } else {
                throw new RuntimeException("failed to request url" + str + " status code:" + responseCode);
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
        }
    }

    public static void b(String str, y0a<b, Void, Throwable> y0aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde5b064", new Object[]{str, y0aVar});
            return;
        }
        HashMap<String, HashSet<y0a<b, Void, Throwable>>> hashMap = f4991a;
        synchronized (hashMap) {
            HashSet<y0a<b, Void, Throwable>> hashSet = hashMap.get(str);
            if (hashSet != null) {
                hashSet.add(y0aVar);
                pgh.i("FBCDNDownloader", "doUniqueHttpRequestAsync: already has task running for url: " + str);
                return;
            }
            HashSet<y0a<b, Void, Throwable>> hashSet2 = new HashSet<>();
            hashSet2.add(y0aVar);
            hashMap.put(str, hashSet2);
            pgh.i("FBCDNDownloader", "doUniqueHttpRequestAsync: post " + str);
            jst.b.submit(new RunnableC0244a(str));
        }
    }
}
