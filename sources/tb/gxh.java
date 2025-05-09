package tb;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.util.Pair;
import anet.channel.util.HttpConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import com.taobao.zcache.Error;
import com.taobao.zcache.RequestType;
import com.taobao.zcache.ResourceResponse;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bxh;
import tb.gpc;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gxh implements rpc {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "[Template]";

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f20287a = vvh.m();
    public final Map<String, List<e>> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements rpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap f20288a;
        public final /* synthetic */ rpc.b b;
        public final /* synthetic */ AtomicInteger c;
        public final /* synthetic */ CountDownLatch d;

        public a(gxh gxhVar, ConcurrentHashMap concurrentHashMap, rpc.b bVar, AtomicInteger atomicInteger, CountDownLatch countDownLatch) {
            this.f20288a = concurrentHashMap;
            this.b = bVar;
            this.c = atomicInteger;
            this.d = countDownLatch;
        }

        @Override // tb.rpc.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            } else {
                this.d.countDown();
            }
        }

        @Override // tb.rpc.a
        public void b(rpc.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c8af2ef", new Object[]{this, cVar});
                return;
            }
            this.f20288a.put(this.b.f27530a, cVar);
            if (!cVar.h()) {
                this.c.incrementAndGet();
            }
            this.d.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends mqo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_framework.c f20289a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(com.taobao.android.weex_framework.c cVar, long j, String str, String str2) {
            this.f20289a = cVar;
            this.b = j;
            this.c = str;
            this.d = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alimuise/MUSTemplateManager$2");
        }

        @Override // tb.mqo
        public void a(ResourceResponse resourceResponse) {
            Error error;
            rpc.c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5b31fc5", new Object[]{this, resourceResponse});
            } else if (resourceResponse == null) {
                d("PARSE_02", "ZCache response null");
            } else {
                if (resourceResponse.getError() != null) {
                    d("PARSE_02", "ZCacheError(" + error.getCode() + "): " + error.getMessage());
                    return;
                }
                byte[] data = resourceResponse.getData();
                if (data == null || data.length == 0) {
                    d("PARSE_02", "ZCache response bytes empty");
                    return;
                }
                boolean isAllFromCache = resourceResponse.isAllFromCache();
                if (!isAllFromCache) {
                    MUSAppMonitor.j(this.f20289a, System.currentTimeMillis() - this.b);
                }
                if (TextUtils.isEmpty(this.c) || gxh.h(gxh.this) || TextUtils.equals(this.c, f.b(data))) {
                    String str = resourceResponse.getHeader().get("X-ZCache-Info");
                    if (dwh.r()) {
                        dwh.p(awh.TAG, "Http request by zcache success: " + this.d + ", isCache: " + isAllFromCache + ", zcacheInfo: " + str);
                    }
                    List<e> c = c();
                    if (isAllFromCache) {
                        cVar = rpc.c.b(data, this.d, "zcache", str);
                    } else {
                        cVar = rpc.c.c(data, this.d, jxh.b(), str);
                    }
                    for (e eVar : c) {
                        if (isAllFromCache) {
                            eVar.c().a(eVar.d(), this.d, eVar.b(), "zcache");
                        } else {
                            eVar.c().d(eVar.d(), this.d, eVar.b());
                        }
                        try {
                            eVar.a().b(cVar);
                        } catch (Throwable th) {
                            dwh.i(th);
                        }
                    }
                    return;
                }
                String str2 = "Http request finished success, but data md5 check failed, expect: " + this.c + ", url: " + this.d;
                dwh.f(awh.TAG, str2);
                for (e eVar2 : c()) {
                    eVar2.c().c(eVar2.d(), this.d, eVar2.b(), "md5 error, expect " + this.c);
                    try {
                        eVar2.a().a("PARSE_03", str2);
                    } catch (Throwable th2) {
                        dwh.i(th2);
                    }
                }
            }
        }

        public final List<e> c() {
            List<e> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f04357b0", new Object[]{this});
            }
            synchronized (gxh.this) {
                try {
                    list = (List) gxh.i(gxh.this).remove(this.d);
                    if (list != null) {
                        if (list.size() == 0) {
                        }
                    }
                    dwh.f(awh.TAG, "WTF, httpTasks is null or empty");
                    list = new ArrayList<>();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return list;
        }

        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            dwh.f(awh.TAG, "Http request failed, code: " + str + ", msg: " + str2);
            for (e eVar : c()) {
                eVar.c().b(eVar.d(), this.d, eVar.b(), str2);
                try {
                    eVar.a().a(str, str2);
                } catch (Throwable th) {
                    dwh.i(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements gpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.weex_framework.c f20290a;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public c(com.taobao.android.weex_framework.c cVar, long j, boolean z, String str, String str2) {
            this.f20290a = cVar;
            this.b = j;
            this.c = z;
            this.d = str;
            this.e = str2;
        }

        @Override // tb.gpc.a
        public void a(dxh dxhVar) {
            List j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebddd68c", new Object[]{this, dxhVar});
                return;
            }
            try {
                if ("200".equals(dxhVar.f18133a)) {
                    MUSAppMonitor.j(this.f20290a, System.currentTimeMillis() - this.b);
                    if (!this.c || !((j = gxh.j(gxh.this, dxhVar.f)) == null || j.size() == 0 || !c4x.e((String) j.get(0)))) {
                        byte[] bArr = dxhVar.b;
                        if (!(bArr == null || bArr.length == 0)) {
                            if (TextUtils.isEmpty(this.e) || gxh.h(gxh.this) || TextUtils.equals(this.e, f.b(bArr))) {
                                List<e> b = b();
                                rpc.c c = rpc.c.c(bArr, this.d, jxh.b(), "");
                                for (e eVar : b) {
                                    eVar.c().d(eVar.d(), this.d, eVar.b());
                                    eVar.a().b(c);
                                }
                                return;
                            }
                            String str = "Http request finished 200, but data md5 check failed, expect: " + this.e + ", url: " + this.d;
                            dwh.f(awh.TAG, str);
                            for (e eVar2 : b()) {
                                eVar2.c().c(eVar2.d(), this.d, eVar2.b(), "md5 error, expect " + this.e);
                                eVar2.a().a("PARSE_03", str);
                            }
                            return;
                        }
                        dwh.f(awh.TAG, "Http request finished 200, but data lost, url: " + this.d);
                        for (e eVar3 : b()) {
                            eVar3.c().b(eVar3.d(), this.d, eVar3.b(), "Http request finished 200, but data lost");
                            eVar3.a().a("PARSE_02", "Http code: 304, error msg: 304 but cache lost");
                        }
                        return;
                    }
                    dwh.f(awh.TAG, "Http request finished 200, but content type error, url: " + this.d);
                    for (e eVar4 : b()) {
                        eVar4.c().b(eVar4.d(), this.d, eVar4.b(), "Http request finished 200, but content type error");
                        eVar4.a().a("PARSE_02", "Http request finished 200, but content type error");
                    }
                    return;
                }
                String str2 = "Http code: " + dxhVar.f18133a + ", error msg: " + dxhVar.d;
                for (e eVar5 : b()) {
                    eVar5.c().b(eVar5.d(), this.d, eVar5.b(), str2);
                    eVar5.a().a("HTTP_" + dxhVar.f18133a, str2);
                }
            } catch (Throwable th) {
                dwh.g(gxh.LOG_TAG, "download finish exception", th);
            }
        }

        public final List<e> b() {
            List<e> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f04357b0", new Object[]{this});
            }
            synchronized (gxh.this) {
                try {
                    list = (List) gxh.i(gxh.this).remove(this.d);
                    if (list != null) {
                        if (list.size() == 0) {
                        }
                    }
                    dwh.f(awh.TAG, "WTF, httpTasks is null or empty");
                    list = new ArrayList<>();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return list;
        }

        @Override // tb.gpc.a
        public void onHeadersReceived(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6683fc51", new Object[]{this, new Integer(i), map});
            }
        }

        @Override // tb.gpc.a
        public void onHttpResponseProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1a5c7", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.gpc.a
        public void onHttpStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5005ca2", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gxh f20291a;

        static {
            t2o.a(982515720);
            try {
                h5x.o(WeexInstanceMode.SCRIPT);
            } catch (Throwable th) {
                dwh.h(gxh.LOG_TAG, th);
            }
            f20291a = new gxh();
        }

        public static /* synthetic */ gxh a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gxh) ipChange.ipc$dispatch("775889bf", new Object[0]);
            }
            return f20291a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f20292a;
        public final com.taobao.android.weex_framework.c b;
        public final g c;
        public final rpc.a d;

        static {
            t2o.a(982515721);
        }

        public e(String str, com.taobao.android.weex_framework.c cVar, g gVar, rpc.a aVar) {
            this.f20292a = str;
            this.b = cVar;
            this.c = gVar;
            this.d = aVar;
        }

        public rpc.a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rpc.a) ipChange.ipc$dispatch("d1aa66b5", new Object[]{this});
            }
            return this.d;
        }

        public com.taobao.android.weex_framework.c b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.c) ipChange.ipc$dispatch("7967eca1", new Object[]{this});
            }
            return this.b;
        }

        public g c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("ba5c6599", new Object[]{this});
            }
            return this.c;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18530d0e", new Object[]{this});
            }
            return this.f20292a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final char[] f20293a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        static {
            t2o.a(982515722);
        }

        public static byte[] a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("28a107c7", new Object[]{bArr});
            }
            if (bArr == null) {
                return null;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(bArr);
                return instance.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        }

        public static String b(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("514b15bf", new Object[]{bArr});
            }
            byte[] a2 = a(bArr);
            if (a2 != null) {
                return c(a2);
            }
            return EncryptUtils.IV_PARAMETER_SPEC;
        }

        public static String c(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ecf228e1", new Object[]{bArr});
            }
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte b : bArr) {
                char[] cArr = f20293a;
                sb.append(cArr[(b & 240) >>> 4]);
                sb.append(cArr[b & 15]);
            }
            return sb.toString();
        }
    }

    static {
        t2o.a(982515716);
        t2o.a(982516079);
    }

    public static /* synthetic */ boolean h(gxh gxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624fc8fd", new Object[]{gxhVar})).booleanValue();
        }
        return gxhVar.f20287a;
    }

    public static /* synthetic */ Map i(gxh gxhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e47fc2ef", new Object[]{gxhVar});
        }
        return gxhVar.b;
    }

    public static /* synthetic */ List j(gxh gxhVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8670465d", new Object[]{gxhVar, map});
        }
        return gxhVar.m(map);
    }

    public static rpc o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc) ipChange.ipc$dispatch("35392900", new Object[0]);
        }
        return d.a();
    }

    public static boolean p(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5843358", new Object[]{uri})).booleanValue();
        }
        String path = uri.getPath();
        if (path.endsWith(".wlm") || path.endsWith(".wlasm") || path.endsWith(".js")) {
            return true;
        }
        return false;
    }

    public static y8o t(String str, Pair<Uri, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y8o) ipChange.ipc$dispatch("39b8ede", new Object[]{str, pair});
        }
        y8o y8oVar = new y8o(str, new HashMap());
        y8oVar.g(RequestType.Weex);
        if (pair.second.intValue() == 1) {
            y8oVar.a().put(HttpRequest.HEADER_ACCEPT, "application/vnd.weex.v21,application/vnd.weex.v20");
        }
        y8oVar.a().put(HttpConstant.USER_AGENT, com.taobao.android.weex.b.d().getUserAgent());
        return y8oVar;
    }

    @Override // tb.rpc
    public rpc.d a(List<rpc.b> list, long j, com.taobao.android.weex_framework.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.d) ipChange.ipc$dispatch("f5b60580", new Object[]{this, list, new Long(j), cVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        rpc.d l = l(list, j, cVar, false);
        l.d = System.currentTimeMillis() - currentTimeMillis;
        return l;
    }

    @Override // tb.rpc
    public void b(String str, String str2, String str3, boolean z, com.taobao.android.weex_framework.c cVar, rpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9662aef", new Object[]{this, str, str2, str3, new Boolean(z), cVar, aVar});
        } else {
            k(str, str2, str3, z, true, cVar, aVar, new g(null), true);
        }
    }

    @Override // tb.rpc
    public rpc.c c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("69a5899d", new Object[]{this, str});
        }
        return r(v(str));
    }

    @Override // tb.rpc
    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a9e019d", new Object[]{this, str})).booleanValue();
        }
        if (r(v(str)) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.rpc
    public rpc.c e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("9a36b666", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.rpc
    public rpc.d f(List<rpc.b> list, long j, com.taobao.android.weex_framework.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.d) ipChange.ipc$dispatch("435b779", new Object[]{this, list, new Long(j), cVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        rpc.d l = l(list, j, cVar, true);
        l.d = System.currentTimeMillis() - currentTimeMillis;
        return l;
    }

    @Override // tb.rpc
    public void g(String str, String str2, String str3, boolean z, com.taobao.android.weex_framework.c cVar, rpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9f9658", new Object[]{this, str, str2, str3, new Boolean(z), cVar, aVar});
        } else {
            k(str, str2, str3, z, false, cVar, aVar, new g(null), false);
        }
    }

    public final boolean k(String str, String str2, String str3, boolean z, boolean z2, com.taobao.android.weex_framework.c cVar, rpc.a aVar, g gVar, boolean z3) {
        rpc.c cVar2;
        boolean z4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dfa8807", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2), cVar, aVar, gVar, new Boolean(z3)})).booleanValue();
        }
        boolean z5 = z3;
        Pair<Uri, Integer> v = v(str);
        if (v == null) {
            String str4 = "Url invalid: " + str;
            dwh.f(LOG_TAG, "Template request start error, url: " + str);
            gVar.b(str2, str, cVar, str4);
            aVar.a("PARSE_01", str4);
            return false;
        }
        String s = s(v.first);
        if (!z) {
            cVar2 = r(v);
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            if (dwh.r()) {
                dwh.p(LOG_TAG, "Template request skip, has cache, url: " + str);
            }
            gVar.a(str2, s, cVar, "filecache");
            aVar.b(cVar2);
            return false;
        }
        if (dwh.r()) {
            dwh.p(LOG_TAG, "Template request start, url: " + str);
        }
        if (z) {
            z5 = false;
        }
        if (!z2) {
            z5 = false;
        }
        if (!z2 || z) {
            z4 = true;
        } else {
            z4 = false;
        }
        u(str, str2, str3, cVar, s, v, aVar, gVar, z4, z, z5);
        return true;
    }

    public final List<String> m(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d48ecd46", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        String str = "Content-Type";
        if (!map.containsKey(str)) {
            str = str.toLowerCase();
        }
        return map.get(str);
    }

    public final gpc n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gpc) ipChange.ipc$dispatch("70680ac0", new Object[]{this});
        }
        return r3x.f();
    }

    public final rpc.c r(Pair<Uri, Integer> pair) {
        ResourceResponse h;
        byte[] data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("5da32f28", new Object[]{this, pair});
        }
        if (pair == null || r5x.a()) {
            return null;
        }
        String s = s(pair.first);
        if (pair.second.intValue() != 0 || (h = yox.h(t(pair.first.toString(), pair))) == null || h.getError() != null || (data = h.getData()) == null || data.length == 0) {
            return null;
        }
        return rpc.c.a(data, s, "zcache");
    }

    public String s(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51f6b75", new Object[]{this, uri});
        }
        return uri.toString();
    }

    public final void u(String str, String str2, String str3, com.taobao.android.weex_framework.c cVar, String str4, Pair<Uri, Integer> pair, rpc.a aVar, g gVar, boolean z, boolean z2, boolean z3) {
        Uri parse;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3996f581", new Object[]{this, str, str2, str3, cVar, str4, pair, aVar, gVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        synchronized (this) {
            try {
                List list = (List) ((HashMap) this.b).get(str);
                e eVar = new e(str2, cVar, gVar, aVar);
                if (list != null) {
                    if (dwh.r()) {
                        dwh.p(awh.TAG, "Http request, task merged: " + str);
                    }
                    list.add(eVar);
                    return;
                }
                LinkedList linkedList = new LinkedList();
                linkedList.add(eVar);
                ((HashMap) this.b).put(str, linkedList);
                long currentTimeMillis = System.currentTimeMillis();
                if (!z3 || r5x.a()) {
                    gpc n = n();
                    bxh bxhVar = new bxh();
                    bxhVar.c = str;
                    if (pair.second.intValue() == 1) {
                        try {
                            parse = Uri.parse(str);
                        } catch (Throwable unused) {
                        }
                        if (parse != null) {
                            if (!q(parse)) {
                                try {
                                    ((ConcurrentHashMap) bxhVar.b).put(HttpRequest.HEADER_ACCEPT, c4x.a());
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    ((ConcurrentHashMap) bxhVar.b).put("user-agent", vvh.d("system", "userAgent"));
                    ((ConcurrentHashMap) bxhVar.b).put("x-muise-bin-support", "true");
                    bxhVar.g = new bxh.a(NetworkResourceType.Document, cVar != null ? cVar.g() : -1);
                    if (vvh.m()) {
                        ((ConcurrentHashMap) bxhVar.b).put(aka.KEY_GREY, "true");
                    }
                    n.a(bxhVar, new c(cVar, currentTimeMillis, z4, str, str3));
                    return;
                }
                if (dwh.r()) {
                    dwh.p(awh.TAG, "Http request by zcache: " + str);
                }
                yox.i(t(str, pair), new b(cVar, currentTimeMillis, str3, str));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f20294a;
        public long b;

        static {
            t2o.a(982515723);
        }

        public g() {
            this.b = 0L;
        }

        public void a(String str, String str2, com.taobao.android.weex_framework.c cVar, String str3) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd5907ab", new Object[]{this, str, str2, cVar, str3});
                return;
            }
            synchronized (this) {
                z = this.f20294a;
            }
            if (z) {
                f(str, str2, cVar);
            } else {
                MUSAppMonitor.h(cVar, "2001", str3);
            }
        }

        public void b(String str, String str2, com.taobao.android.weex_framework.c cVar, String str3) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ecf353c", new Object[]{this, str, str2, cVar, str3});
                return;
            }
            synchronized (this) {
                z = this.f20294a;
            }
            if (z) {
                f(str, str2, cVar);
            } else {
                MUSAppMonitor.h(cVar, "2000", str3);
            }
        }

        public void c(String str, String str2, com.taobao.android.weex_framework.c cVar, String str3) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae2084a4", new Object[]{this, str, str2, cVar, str3});
                return;
            }
            synchronized (this) {
                z = this.f20294a;
            }
            if (z) {
                f(str, str2, cVar);
            } else {
                MUSAppMonitor.h(cVar, "2000", str3);
            }
        }

        public void d(String str, String str2, com.taobao.android.weex_framework.c cVar) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f48a7b3d", new Object[]{this, str, str2, cVar});
                return;
            }
            synchronized (this) {
                z = this.f20294a;
            }
            if (z) {
                f(str, str2, cVar);
            } else {
                MUSAppMonitor.i(cVar);
            }
        }

        public synchronized void e(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("863cf5db", new Object[]{this, new Long(j)});
                return;
            }
            this.f20294a = true;
            this.b = j;
        }

        public final void f(String str, String str2, com.taobao.android.weex_framework.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6d5d7be", new Object[]{this, str, str2, cVar});
                return;
            }
            MUSAppMonitor.h(cVar, "2000", "timeout in " + (this.b / 1000) + " seconds");
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static Pair<Uri, Integer> v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ac927249", new Object[]{str});
        }
        try {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getPath())) {
                dwh.f(LOG_TAG, "url parse error, path == null, url:" + str);
                return null;
            } else if (TextUtils.isEmpty(parse.getScheme())) {
                dwh.f(LOG_TAG, "url parse error, scheme == null, url:" + str);
                return null;
            } else if (TextUtils.isEmpty(parse.getHost())) {
                dwh.f(LOG_TAG, "url parse error, host == null, url:" + str);
                return null;
            } else if (p(parse)) {
                return Pair.create(parse.buildUpon().clearQuery().build(), 0);
            } else {
                return Pair.create(parse.buildUpon().clearQuery().build(), 1);
            }
        } catch (Exception e2) {
            dwh.g(LOG_TAG, "url parse error, url: " + str, e2);
            return null;
        }
    }

    public final boolean q(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94722a21", new Object[]{this, uri})).booleanValue();
        }
        String host = uri.getHost();
        return host.startsWith("mo.m.taobao.com") || host.startsWith("pre-mo.m.taobao.com");
    }

    public final rpc.d l(List<rpc.b> list, long j, com.taobao.android.weex_framework.c cVar, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.d) ipChange.ipc$dispatch("379500bc", new Object[]{this, list, new Long(j), cVar, new Boolean(z)});
        }
        if (list == null) {
            return new rpc.d();
        }
        g gVar = new g(null);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        AtomicInteger atomicInteger = new AtomicInteger();
        int i = 0;
        for (rpc.b bVar : list) {
            i += k(bVar.f27530a, bVar.b, bVar.c, false, true, new com.taobao.android.weex_framework.c(cVar, bVar.f27530a, bVar.b), new a(this, concurrentHashMap, bVar, atomicInteger, countDownLatch), gVar, true) ? 1 : 0;
            countDownLatch = countDownLatch;
            concurrentHashMap = concurrentHashMap;
        }
        if (z) {
            try {
                z2 = countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                dwh.x(LOG_TAG, "syncDownloadOrLoadCache: template download interrupted", e2);
                z2 = true;
            }
            if (!z2) {
                dwh.f(LOG_TAG, "[Download]: timeout in " + j + "ms");
                gVar.e(j);
            }
        }
        rpc.d dVar = new rpc.d();
        ((HashMap) dVar.f27532a).putAll(concurrentHashMap);
        dVar.c = atomicInteger.get();
        dVar.b = i;
        if (dwh.r()) {
            for (rpc.b bVar2 : list) {
                if (!TextUtils.isEmpty(bVar2.f27530a) && ((HashMap) dVar.f27532a).containsKey(bVar2.f27530a)) {
                    if (((rpc.c) ((HashMap) dVar.f27532a).get(bVar2.f27530a)).h()) {
                        dwh.p(LOG_TAG, "Template load cache success, tItemType: " + bVar2.b + ", url: " + bVar2.f27530a);
                    } else {
                        dwh.p(LOG_TAG, "Template download success, tItemType: " + bVar2.b + ", url: " + bVar2.f27530a);
                    }
                }
            }
        }
        return dVar;
    }
}
