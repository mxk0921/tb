package android.taobao.windvane.connect;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.HttpURLConnection;
import java.util.Map;
import tb.b8b;
import tb.h7b;
import tb.t2o;
import tb.v7b;
import tb.v7t;
import tb.zpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HttpConnector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_CONTROL = "cache-control";
    public static final String CONTENT_LENGTH = "content-length";
    public static final String CONTENT_TYPE = "content-type";
    public static final String DATE = "date";
    public static final String ETAG = "etag";
    public static final String EXPIRES = "expires";
    public static final String IF_MODIFY_SINCE = "If-Modified-Since";
    public static final String IF_NONE_MATCH = "If-None-Match";
    public static final String LAST_MODIFIED = "last-modified";
    public static final String REDIRECT_LOCATION = "location";
    public static final String RESPONSE_CODE = "response-code";
    public static final String SET_COOKIE = "Set-Cookie";
    public static final String URL = "url";
    public static final String c = "HttpConnector";

    /* renamed from: a  reason: collision with root package name */
    public int f1756a = 0;
    public h7b<b8b> b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class HttpOverFlowException extends Exception {
        static {
            t2o.a(989855804);
        }

        public HttpOverFlowException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class HttpsErrorException extends Exception {
        static {
            t2o.a(989855805);
        }

        public HttpsErrorException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class NetWorkErrorException extends Exception {
        static {
            t2o.a(989855806);
        }

        public NetWorkErrorException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class RedirectException extends Exception {
        static {
            t2o.a(989855807);
        }

        public RedirectException(String str) {
            super(str);
        }
    }

    public b8b d(v7b v7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8b) ipChange.ipc$dispatch("7ed55206", new Object[]{this, v7bVar});
        }
        return e(v7bVar, null);
    }

    public b8b e(v7b v7bVar, h7b<b8b> h7bVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8b) ipChange.ipc$dispatch("bee9762c", new Object[]{this, v7bVar, h7bVar});
        }
        if (v7bVar != null) {
            this.b = h7bVar;
            this.f1756a = 0;
            int f = v7bVar.f();
            String str = null;
            while (i < f) {
                try {
                    return a(v7bVar);
                } catch (HttpOverFlowException e) {
                    e.printStackTrace();
                    str = e.toString();
                } catch (HttpsErrorException e2) {
                    e2.printStackTrace();
                    str = e2.toString();
                } catch (NetWorkErrorException e3) {
                    e3.printStackTrace();
                    str = e3.toString();
                    i++;
                    try {
                        Thread.sleep(i * 2000);
                    } catch (InterruptedException unused) {
                        v7t.d(c, "HttpConnector retry Sleep has been interrupted, go ahead");
                    }
                } catch (RedirectException e4) {
                    e4.printStackTrace();
                    str = e4.toString();
                }
            }
            b8b b8bVar = new b8b();
            b8bVar.g(str);
            return b8bVar;
        }
        throw new NullPointerException("Http connect error, request is null");
    }

    public final void c(HttpURLConnection httpURLConnection, v7b v7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10ba028", new Object[]{this, httpURLConnection, v7bVar});
            return;
        }
        int f = v7bVar.f() + 1;
        httpURLConnection.setConnectTimeout(v7bVar.a() * f);
        httpURLConnection.setReadTimeout(v7bVar.e() * f);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty(HttpConstant.HOST, v7bVar.g().getHost());
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String a2 = zpw.a(httpURLConnection.getURL().toString());
        if (a2 != null) {
            httpURLConnection.setRequestProperty("Cookie", a2);
        }
        Map<String, String> b = v7bVar.b();
        if (b != null) {
            for (Map.Entry<String, String> entry : b.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnection.setUseCaches(false);
    }

    @Deprecated
    public b8b f(v7b v7bVar, h7b<b8b> h7bVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8b) ipChange.ipc$dispatch("dd1657e9", new Object[]{this, v7bVar, h7bVar});
        }
        if (v7bVar != null) {
            this.b = h7bVar;
            this.f1756a = 0;
            int f = v7bVar.f();
            String str = null;
            while (i < f) {
                try {
                    return b(v7bVar);
                } catch (HttpOverFlowException e) {
                    e.printStackTrace();
                    str = e.toString();
                } catch (HttpsErrorException e2) {
                    e2.printStackTrace();
                    str = e2.toString();
                } catch (NetWorkErrorException e3) {
                    e3.printStackTrace();
                    str = e3.toString();
                    i++;
                    try {
                        Thread.sleep(i * 2000);
                    } catch (InterruptedException unused) {
                        v7t.d(c, "HttpConnector retry Sleep has been interrupted, go ahead");
                    }
                } catch (RedirectException e4) {
                    e4.printStackTrace();
                    str = e4.toString();
                }
            }
            b8b b8bVar = new b8b();
            b8bVar.g(str);
            return b8bVar;
        }
        throw new NullPointerException("Http connect error, request is null");
    }

    static {
        t2o.a(989855803);
        System.setProperty("http.keepAlive", "false");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: ConstInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: -1
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
        	at jadx.core.dex.visitors.ConstInlineVisitor.needExplicitCast(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:248)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:166)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:107)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:53)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:45)
        */
    public final tb.b8b a(tb.v7b r18) throws android.taobao.windvane.connect.HttpConnector.NetWorkErrorException, android.taobao.windvane.connect.HttpConnector.HttpOverFlowException, android.taobao.windvane.connect.HttpConnector.RedirectException, android.taobao.windvane.connect.HttpConnector.HttpsErrorException {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.connect.HttpConnector.a(tb.v7b):tb.b8b");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: ConstInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: -1
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
        	at jadx.core.dex.visitors.ConstInlineVisitor.needExplicitCast(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:248)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:166)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:107)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:53)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:45)
        */
    public final tb.b8b b(tb.v7b r18) throws android.taobao.windvane.connect.HttpConnector.NetWorkErrorException, android.taobao.windvane.connect.HttpConnector.HttpOverFlowException, android.taobao.windvane.connect.HttpConnector.RedirectException, android.taobao.windvane.connect.HttpConnector.HttpsErrorException {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.connect.HttpConnector.b(tb.v7b):tb.b8b");
    }
}
