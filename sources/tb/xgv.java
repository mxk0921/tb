package tb;

import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.RequestCallback;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IWeexAdapter;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31389a;
    public boolean b;
    public boolean c;
    public boolean d;
    public ByteArrayOutputStream e;
    public a f;
    public final ygv g = new ygv();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {

        /* compiled from: Taobao */
        /* renamed from: tb.xgv$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C1100a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(848298011);
            }

            public static void a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea6152d4", new Object[]{aVar});
                } else {
                    ckf.g(aVar, "this");
                }
            }

            public static void b(a aVar, int i, Map<String, List<String>> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9077d38", new Object[]{aVar, new Integer(i), map});
                } else {
                    ckf.g(aVar, "this");
                }
            }
        }

        void a(ygv ygvVar);

        void b(int i, Map<String, List<String>> map);

        void c();

        void onError(int i, String str);

        void onResponse(int i, Map<String, List<String>> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements ikd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31391a;

        public c(String str) {
            this.f31391a = str;
        }

        @Override // tb.ikd
        public final boolean a(Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e575c1f0", new Object[]{this, map})).booleanValue();
            }
            if (this.f31391a == null || (str = map.get("x-page-version")) == null) {
                return true;
            }
            return ckf.b(this.f31391a, str);
        }
    }

    static {
        t2o.a(848298009);
    }

    public static final /* synthetic */ a a(xgv xgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ebecdda5", new Object[]{xgvVar});
        }
        return xgvVar.f;
    }

    public static final /* synthetic */ boolean b(xgv xgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15811e74", new Object[]{xgvVar})).booleanValue();
        }
        return xgvVar.b;
    }

    public static final /* synthetic */ ygv c(xgv xgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ygv) ipChange.ipc$dispatch("9c8e7816", new Object[]{xgvVar});
        }
        return xgvVar.g;
    }

    public static final /* synthetic */ ByteArrayOutputStream d(xgv xgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("63065d99", new Object[]{xgvVar});
        }
        return xgvVar.e;
    }

    public static final /* synthetic */ boolean e(xgv xgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4dcd6e5", new Object[]{xgvVar})).booleanValue();
        }
        return xgvVar.f31389a;
    }

    public static final /* synthetic */ void f(xgv xgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e59fc3", new Object[]{xgvVar});
        } else {
            xgvVar.k();
        }
    }

    public static final /* synthetic */ void g(xgv xgvVar, ByteArrayOutputStream byteArrayOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e331a79", new Object[]{xgvVar, byteArrayOutputStream});
        } else {
            xgvVar.e = byteArrayOutputStream;
        }
    }

    public static final /* synthetic */ void h(xgv xgvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b587e5b", new Object[]{xgvVar, new Boolean(z)});
        } else {
            xgvVar.f31389a = z;
        }
    }

    public static final /* synthetic */ void i(xgv xgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cba1a0", new Object[]{xgvVar});
        } else {
            xgvVar.o();
        }
    }

    public static /* synthetic */ void m(xgv xgvVar, String str, String str2, Map map, String str3, boolean z, boolean z2, Boolean bool, a aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7716dad1", new Object[]{xgvVar, str, str2, map, str3, new Boolean(z), new Boolean(z2), bool, aVar, new Integer(i), obj});
        } else {
            xgvVar.l(str, (2 & i) != 0 ? null : str2, (4 & i) != 0 ? null : map, (8 & i) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? Boolean.FALSE : bool, aVar);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71da2fe", new Object[]{this});
            return;
        }
        this.b = true;
        this.g.c(null);
        Integer b2 = this.g.b();
        if (b2 != null) {
            android.taobao.windvane.export.network.b.j(b2.intValue());
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else if (!this.d) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.g);
            }
            this.d = true;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cef236", new Object[]{this});
        } else if (this.f31389a) {
            k();
        }
    }

    public final void l(String str, String str2, Map<String, String> map, String str3, boolean z, boolean z2, Boolean bool, a aVar) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac45eb5", new Object[]{this, str, str2, map, str3, new Boolean(z), new Boolean(z2), bool, aVar});
            return;
        }
        ckf.g(str, "url");
        ckf.g(aVar, "callback");
        this.f = aVar;
        String str5 = null;
        Map<String, String> t = map == null ? null : kotlin.collections.a.t(map);
        if (t == null) {
            t = new LinkedHashMap<>();
        }
        if (z2) {
            t.put("x-manifest-preset", "true");
        }
        if (str2 != null) {
            t.put("x-page-version", str2);
        }
        if (ckf.b(bool, Boolean.TRUE)) {
            t.put("x-wh-extend-fields", "uniapp-rapid-mode=true");
        }
        if (str3 == null || ckf.b(str3, "weex")) {
            IpChange ipChange2 = TMSAssertUtils.$ipChange;
            IWeexAdapter iWeexAdapter = (IWeexAdapter) p8s.b(IWeexAdapter.class);
            if (iWeexAdapter != null) {
                str5 = iWeexAdapter.getHttpAcceptHeader();
            }
            str4 = ckf.p(str5, ",");
        } else {
            str4 = "";
        }
        t.put(HttpRequest.HEADER_ACCEPT, ckf.p(str4, android.taobao.windvane.export.network.a.ACCEPTSTR));
        if (ckf.b(str3, "web")) {
            this.f31389a = true;
        }
        if (!this.b) {
            this.c = true;
            this.g.d(Integer.valueOf(android.taobao.windvane.export.network.b.g(new Request.b().l(str).g(t).i("GET").k(new c(str2)).f(), new b(aVar, this))));
            this.g.e(this.f31389a);
            if (z || this.f31389a) {
                k();
            }
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c2816", new Object[]{this, str});
            return;
        }
        ckf.g(str, "renderer");
        if (ckf.b("web", str)) {
            this.f31389a = true;
            if (this.c) {
                o();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b extends RequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f31390a;
        public final /* synthetic */ xgv b;

        public b(a aVar, xgv xgvVar) {
            this.f31390a = aVar;
            this.b = xgvVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1831398055:
                    super.onNetworkResponse(((Number) objArr[0]).intValue(), (Map) objArr[1]);
                    return null;
                case -1155444759:
                    super.onResponse(((Number) objArr[0]).intValue(), (Map) objArr[1]);
                    return null;
                case -229894436:
                    super.onReceiveData((byte[]) objArr[0]);
                    return null;
                case 195948249:
                    super.onFinish();
                    return null;
                case 2053577885:
                    super.onError(((Number) objArr[0]).intValue(), (String) objArr[1]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/UniAppDocumentClient$request$fetchId$1");
            }
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            super.onError(i, str);
            this.f31390a.onError(i, str);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            super.onFinish();
            if (xgv.d(this.b) != null && !xgv.e(this.b)) {
                ygv c = xgv.c(this.b);
                ByteArrayOutputStream d = xgv.d(this.b);
                ckf.d(d);
                c.c(d.toByteArray());
            }
            a a2 = xgv.a(this.b);
            if (a2 != null) {
                a2.c();
            }
            xgv.f(this.b);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onReceiveData(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
                return;
            }
            super.onReceiveData(bArr);
            if (!xgv.e(this.b) && !xgv.b(this.b)) {
                if (xgv.d(this.b) == null) {
                    xgv.g(this.b, new ByteArrayOutputStream());
                }
                ByteArrayOutputStream d = xgv.d(this.b);
                ckf.d(d);
                d.write(bArr);
            }
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onResponse(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
                return;
            }
            super.onResponse(i, map);
            this.f31390a.onResponse(i, map);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onNetworkResponse(int i, Map<String, List<String>> map) {
            String str;
            List<String> value;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
                return;
            }
            super.onNetworkResponse(i, map);
            if (map != null) {
                xgv xgvVar = this.b;
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key == null) {
                        str = null;
                    } else {
                        Locale locale = Locale.ROOT;
                        ckf.f(locale, "ROOT");
                        str = key.toLowerCase(locale);
                        ckf.f(str, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (ckf.b(str, "content-type") && (value = entry.getValue()) != null && (str2 = (String) i04.d0(value, 0)) != null && wsq.O(str2, "text/html", false, 2, null)) {
                        xgv.h(xgvVar, true);
                    }
                }
            }
            this.f31390a.b(i, map);
            xgv.i(this.b);
        }
    }
}
