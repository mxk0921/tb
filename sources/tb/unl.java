package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class unl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final String f29512a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public Window f;
    public final QueryPass g;
    public final boolean h;
    public final String i;
    public final List<String> j;
    public final JSONObject k;
    public final AppManifest.PageFallbackStrategy l;
    public final boolean m;

    static {
        t2o.a(839909500);
    }

    public unl() {
        this(null, null, null, null, false, null, null, false, null, null, null, null, false, 8191, null);
    }

    public static /* synthetic */ unl b(unl unlVar, String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List list, JSONObject jSONObject, AppManifest.PageFallbackStrategy pageFallbackStrategy, boolean z3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unl) ipChange.ipc$dispatch("ce120e2b", new Object[]{unlVar, str, str2, str3, str4, new Boolean(z), window, queryPass, new Boolean(z2), str5, list, jSONObject, pageFallbackStrategy, new Boolean(z3), new Integer(i), obj});
        }
        return unlVar.a((1 & i) != 0 ? unlVar.f29512a : str, (2 & i) != 0 ? unlVar.b : str2, (4 & i) != 0 ? unlVar.c : str3, (8 & i) != 0 ? unlVar.d : str4, (16 & i) != 0 ? unlVar.e : z, (i & 32) != 0 ? unlVar.f : window, (i & 64) != 0 ? unlVar.g : queryPass, (i & 128) != 0 ? unlVar.h : z2, (i & 256) != 0 ? unlVar.i : str5, (i & 512) != 0 ? unlVar.j : list, (i & 1024) != 0 ? unlVar.k : jSONObject, (i & 2048) != 0 ? unlVar.l : pageFallbackStrategy, (i & 4096) != 0 ? unlVar.m : z3);
    }

    public final unl a(String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List<String> list, JSONObject jSONObject, AppManifest.PageFallbackStrategy pageFallbackStrategy, boolean z3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (unl) ipChange.ipc$dispatch("a83f443c", new Object[]{this, str, str2, str3, str4, new Boolean(z), window, queryPass, new Boolean(z2), str5, list, jSONObject, pageFallbackStrategy, new Boolean(z3)}) : new unl(str, str2, str3, str4, z, window, queryPass, z2, str5, list, jSONObject, pageFallbackStrategy, z3);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65af80de", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        return this.j;
    }

    public final int e() {
        int i;
        List<String> list;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3991e81", new Object[]{this})).intValue();
        }
        try {
            jSONObject = this.k;
        } catch (Exception unused) {
        }
        if (jSONObject == null) {
            i = 0;
            list = this.j;
            if (list != null && i >= 0 && i < list.size()) {
                return i;
            }
            return 0;
        }
        i = jSONObject.getIntValue("defaultIndex");
        list = this.j;
        if (list != null) {
            return i;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unl)) {
            return false;
        }
        unl unlVar = (unl) obj;
        if (ckf.b(this.f29512a, unlVar.f29512a) && ckf.b(this.b, unlVar.b) && ckf.b(this.c, unlVar.c) && ckf.b(this.d, unlVar.d) && this.e == unlVar.e && ckf.b(this.f, unlVar.f) && ckf.b(this.g, unlVar.g) && this.h == unlVar.h && ckf.b(this.i, unlVar.i) && ckf.b(this.j, unlVar.j) && ckf.b(this.k, unlVar.k) && ckf.b(this.l, unlVar.l) && this.m == unlVar.m) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2adc9986", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f29512a;
    }

    @JSONField(deserialize = false, serialize = false)
    public final AppManifest.PageFallbackStrategy h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest.PageFallbackStrategy) ipChange.ipc$dispatch("e02552fd", new Object[]{this});
        }
        AppManifest.PageFallbackStrategy pageFallbackStrategy = this.l;
        if (pageFallbackStrategy == null) {
            return AppManifest.PageFallbackStrategy.Companion.b();
        }
        return pageFallbackStrategy;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f29512a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i12 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i13 = (i12 + i2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i14 = (i13 + i3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i15 = (i14 + i4) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i16 = z ? 1 : 0;
        int i17 = z ? 1 : 0;
        int i18 = (i15 + i16) * 31;
        Window window = this.f;
        if (window == null) {
            i5 = 0;
        } else {
            i5 = window.hashCode();
        }
        int i19 = (i18 + i5) * 31;
        QueryPass queryPass = this.g;
        if (queryPass == null) {
            i6 = 0;
        } else {
            i6 = queryPass.hashCode();
        }
        int i20 = (i19 + i6) * 31;
        boolean z2 = this.h;
        if (z2) {
            z2 = true;
        }
        int i21 = z2 ? 1 : 0;
        int i22 = z2 ? 1 : 0;
        int i23 = (i20 + i21) * 31;
        String str5 = this.i;
        if (str5 == null) {
            i7 = 0;
        } else {
            i7 = str5.hashCode();
        }
        int i24 = (i23 + i7) * 31;
        List<String> list = this.j;
        if (list == null) {
            i8 = 0;
        } else {
            i8 = list.hashCode();
        }
        int i25 = (i24 + i8) * 31;
        JSONObject jSONObject = this.k;
        if (jSONObject == null) {
            i9 = 0;
        } else {
            i9 = jSONObject.hashCode();
        }
        int i26 = (i25 + i9) * 31;
        AppManifest.PageFallbackStrategy pageFallbackStrategy = this.l;
        if (pageFallbackStrategy != null) {
            i10 = pageFallbackStrategy.hashCode();
        }
        int i27 = (i26 + i10) * 31;
        boolean z3 = this.m;
        if (!z3) {
            i11 = z3 ? 1 : 0;
        }
        return i27 + i11;
    }

    public final QueryPass i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QueryPass) ipChange.ipc$dispatch("41878722", new Object[]{this});
        }
        return this.g;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3570fe60", new Object[]{this});
        }
        return this.d;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.c;
    }

    public final Window m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("2b6b0304", new Object[]{this});
        }
        return this.f;
    }

    public final void p(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf5d10e", new Object[]{this, window});
        } else {
            this.f = window;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PageModel(id=" + ((Object) this.f29512a) + ", url=" + ((Object) this.b) + ", version=" + ((Object) this.c) + ", renderer=" + ((Object) this.d) + ", external=" + this.e + ", window=" + this.f + ", queryPass=" + this.g + ", autofocus=" + this.h + ", pageType=" + ((Object) this.i) + ", children=" + this.j + ", groupConfig=" + this.k + ", fallbackStrategy=" + this.l + ", enableFallback=" + this.m + ')';
    }

    public unl(String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List<String> list, JSONObject jSONObject, AppManifest.PageFallbackStrategy pageFallbackStrategy, boolean z3) {
        this.f29512a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = window;
        this.g = queryPass;
        this.h = z2;
        this.i = str5;
        this.j = list;
        this.k = jSONObject;
        this.l = pageFallbackStrategy;
        this.m = z3;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb84f7aa", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.k;
        if (jSONObject == null) {
            return false;
        }
        return hbs.b(jSONObject, "swiperEnable", false);
    }

    public final boolean o() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("425bb312", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.i, "swiper") && (list = this.j) != null && !list.isEmpty();
    }

    public /* synthetic */ unl(String str, String str2, String str3, String str4, boolean z, Window window, QueryPass queryPass, boolean z2, String str5, List list, JSONObject jSONObject, AppManifest.PageFallbackStrategy pageFallbackStrategy, boolean z3, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : window, (i & 64) != 0 ? null : queryPass, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : jSONObject, (i & 2048) == 0 ? pageFallbackStrategy : null, (i & 4096) == 0 ? z3 : false);
    }
}
