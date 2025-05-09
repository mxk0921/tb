package tb;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import com.alipay.mobile.verifyidentity.utils.ProductDataHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class w7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public volatile int f30501a;
    public volatile String b;
    public volatile PhotoFrom c;
    public volatile Uri d;
    public volatile int e;
    public volatile Bitmap f;
    public volatile Bitmap g;
    public volatile String h;
    public volatile Map<String, String> i;
    public volatile Map<String, String> j;
    public Map<String, String> k;
    public volatile Map<String, String> l;
    public volatile Map<String, String> m;
    public volatile Map<String, String> n;
    public volatile String o;
    public volatile String p;
    public volatile AtomicReference<String> q = new AtomicReference<>();
    public volatile Boolean r;
    public volatile Size s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297345);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final w7m a(IrpDatasource irpDatasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w7m) ipChange.ipc$dispatch("5bb442ea", new Object[]{this, irpDatasource});
            }
            ckf.g(irpDatasource, "irpDatasource");
            w7m w7mVar = new w7m();
            w7mVar.D(irpDatasource.u());
            w7mVar.M(irpDatasource.y());
            w7mVar.L(irpDatasource.B());
            w7mVar.G(irpDatasource.K());
            w7mVar.F(irpDatasource.J());
            w7mVar.E(irpDatasource.H());
            w7mVar.H(kotlin.collections.a.r(irpDatasource.A()));
            return w7mVar;
        }

        public a() {
        }
    }

    static {
        t2o.a(481297344);
    }

    public w7m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ProductDataHelper.VAL_PRODUCT_FACE, "-1");
        linkedHashMap.put("faceCount", "-1");
        this.l = linkedHashMap;
    }

    public final void A(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99c858d", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.l = map;
    }

    public final void B(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7980997b", new Object[]{this, size});
        } else {
            this.s = size;
        }
    }

    public final void C(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cc87c6", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public final void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59f2159", new Object[]{this, new Integer(i)});
        } else {
            this.f30501a = i;
        }
    }

    public final void E(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b14365", new Object[]{this, bitmap});
        } else {
            this.f = bitmap;
        }
    }

    public final void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d669270e", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void G(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e876c44", new Object[]{this, uri});
        } else {
            this.d = uri;
        }
    }

    public final void H(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7d07c7", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public final void I(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae9b9a3", new Object[]{this, bitmap});
        } else {
            this.g = bitmap;
        }
    }

    public final void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675c3361", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public final void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8f45d", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public final void L(PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff88ba9", new Object[]{this, photoFrom});
        } else {
            this.c = photoFrom;
        }
    }

    public final void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02f78f1", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa730ac", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final void O(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d458d9", new Object[]{this, map});
        } else {
            this.n = map;
        }
    }

    public final void P(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595de750", new Object[]{this, map});
        } else {
            this.m = map;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = this.g;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e2beb467", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.l);
        Map<String, String> map = this.m;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Map<String, String> map2 = this.n;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        Map<String, String> map3 = this.j;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        Map<String, String> map4 = this.k;
        if (map4 != null) {
            linkedHashMap.putAll(map4);
        }
        return linkedHashMap;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d297a914", new Object[]{this});
        }
        Uri uri = this.d;
        if (uri == null) {
            return null;
        }
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        ckf.f(schemeSpecificPart, "innerUri.schemeSpecificPart");
        String substring = schemeSpecificPart.substring(2);
        ckf.f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4b3f6b49", new Object[]{this});
        }
        return this.j;
    }

    public final AtomicReference<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("62b299a", new Object[]{this});
        }
        return this.q;
    }

    public final Size f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("df09a667", new Object[]{this});
        }
        return this.s;
    }

    public final Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a641dc60", new Object[]{this});
        }
        return this.k;
    }

    public final Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b46e84bb", new Object[]{this});
        }
        return this.f;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6b82014", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final Uri j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("f5dcb48e", new Object[]{this});
        }
        return this.d;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6bfa225", new Object[]{this});
        }
        Map<String, String> map = this.i;
        if (map == null) {
            return "";
        }
        return map.get("pssource");
    }

    public final Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8545f2a7", new Object[]{this});
        }
        return this.i;
    }

    public final Bitmap m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b7c37c55", new Object[]{this});
        }
        return this.g;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eeca41d", new Object[]{this});
        }
        return this.o;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fccbf639", new Object[]{this});
        }
        return this.p;
    }

    public final PhotoFrom p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoFrom) ipChange.ipc$dispatch("22177411", new Object[]{this});
        }
        return this.c;
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b02a625", new Object[]{this});
        }
        return this.b;
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c4db972", new Object[]{this});
        }
        return this.h;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a47374", new Object[]{this})).booleanValue();
        }
        if (this.f30501a == 2) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c40d033", new Object[]{this})).booleanValue();
        }
        if (this.c == PhotoFrom.Values.TRANSLATE_TAKE || this.c == PhotoFrom.Values.TRANSLATE_ALBUM || this.c == PhotoFrom.Values.TRANSLATE_HISTORY) {
            return true;
        }
        return false;
    }

    public final void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf1a8fd", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb785f", new Object[]{this})).booleanValue();
        }
        Uri uri = this.d;
        if (uri == null) {
            return false;
        }
        return ckf.b("weex", uri.getScheme());
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb244b5", new Object[]{this})).booleanValue();
        }
        Uri uri = this.d;
        if (uri == null) {
            return false;
        }
        return ckf.b("plt", uri.getScheme());
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b6b77d", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.i;
        if (map == null) {
            return false;
        }
        return ckf.b(map.get(wxi.KEY_PHOTO_FROM), PhotoFrom.Values.PRODUCT_CODE.getValue());
    }

    public final boolean s() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("106aa695", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.m;
        if (map != null) {
            z = ckf.b("true", map.get("watermark"));
        }
        if (z) {
            return true;
        }
        Map<String, String> map2 = this.n;
        return map2 == null ? z : ckf.b("true", map2.get("watermark"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (tb.ckf.b("https", r2) != false) goto L_0x0052;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.w7m.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "4b9a58e5"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            java.lang.Boolean r2 = r4.r
            if (r2 == 0) goto L_0x0022
            boolean r0 = r2.booleanValue()
            return r0
        L_0x0022:
            android.net.Uri r2 = r4.d
            if (r2 == 0) goto L_0x0059
            android.net.Uri r2 = r4.d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0033
            goto L_0x0059
        L_0x0033:
            android.net.Uri r2 = r4.d     // Catch: Exception -> 0x0054
            tb.ckf.d(r2)     // Catch: Exception -> 0x0054
            java.lang.String r2 = r2.getScheme()     // Catch: Exception -> 0x0054
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = ""
        L_0x0040:
            java.lang.String r3 = "http"
            boolean r3 = tb.ckf.b(r3, r2)     // Catch: Exception -> 0x0054
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "https"
            boolean r2 = tb.ckf.b(r3, r2)     // Catch: Exception -> 0x0054
            if (r2 == 0) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            r1 = r0
        L_0x0054:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x005b
        L_0x0059:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x005b:
            r4.r = r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w7m.w():boolean");
    }
}
