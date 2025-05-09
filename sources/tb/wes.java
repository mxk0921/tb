package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wes {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wes INSTANCE = new wes();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f30660a;
        public final WeexRenderType b;
        public final WeexInstanceMode c;
        public final WeexInstanceConfig d;

        static {
            t2o.a(851443717);
        }

        public a(String str, WeexRenderType weexRenderType, WeexInstanceMode weexInstanceMode, WeexInstanceConfig weexInstanceConfig) {
            ckf.g(str, "bundleUrl");
            ckf.g(weexRenderType, "weexRenderType");
            ckf.g(weexInstanceMode, "instanceMode");
            ckf.g(weexInstanceConfig, "instanceConfig");
            this.f30660a = str;
            this.b = weexRenderType;
            this.c = weexInstanceMode;
            this.d = weexInstanceConfig;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
            }
            return this.f30660a;
        }

        public final WeexInstanceConfig b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstanceConfig) ipChange.ipc$dispatch("88015c7b", new Object[]{this});
            }
            return this.d;
        }

        public final WeexInstanceMode c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexInstanceMode) ipChange.ipc$dispatch("1872515c", new Object[]{this});
            }
            return this.c;
        }

        public final WeexRenderType d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeexRenderType) ipChange.ipc$dispatch("57000f6b", new Object[]{this});
            }
            return this.b;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (ckf.b(this.f30660a, aVar.f30660a) && this.b == aVar.b && this.c == aVar.c && ckf.b(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (((((this.f30660a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "WeexInstanceParams(bundleUrl=" + this.f30660a + ", weexRenderType=" + this.b + ", instanceMode=" + this.c + ", instanceConfig=" + this.d + ')';
        }
    }

    static {
        t2o.a(851443716);
    }

    @JvmStatic
    public static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bd62f6f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri g = ies.g(str);
        return (!g.isHierarchical() || !ckf.b(g.getQueryParameter("afc_tms_weex"), "true")) ? str : g.buildUpon().appendQueryParameter("wh_weex", "true").appendQueryParameter(h8x.KEY_WEEX_MODE, "dom").build().toString();
    }

    @JvmStatic
    public static final String c(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6cb1fd9", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "instance");
        String g = vvh.g("userAgent");
        return g + ' ' + TMSInstanceExtKt.o(bbsVar);
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8023bbe", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null) || !tsq.I(str2, h1p.HTTPS_PREFIX, false, 2, null)) {
            return wsq.O(str, str2, false, 2, null);
        }
        Uri g = ies.g(str);
        Uri g2 = ies.g(str2);
        if (g == null || g2 == null || !TextUtils.equals(g.getHost(), g2.getHost()) || !TextUtils.equals(g.getPath(), g2.getPath())) {
            return false;
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements bde {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.bde
        public final boolean a(String str) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7e6ba16", new Object[]{this, str})).booleanValue();
            }
            List<String> split = new Regex(",").split(q9s.M3(), 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = i04.v0(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = yz3.i();
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    i++;
                    if (ckf.b(str, str2)) {
                        return true;
                    }
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
        if (r1 != false) goto L_0x00db;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final tb.wes.a d(java.lang.String r12, com.taobao.themis.external.embed.Weex2StartParams r13, com.taobao.themis.kernel.solution.TMSSolutionType r14) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wes.d(java.lang.String, com.taobao.themis.external.embed.Weex2StartParams, com.taobao.themis.kernel.solution.TMSSolutionType):tb.wes$a");
    }

    public final boolean e(String str, String str2) {
        List list;
        Object[] array;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f916b09", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            List<String> split = new Regex(",").split(str2, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = i04.v0(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = yz3.i();
            array = list.toArray(new String[0]);
        } catch (Exception e) {
            dwh.g("LayoutNG", "isMatchTargetList exception: ", e);
        }
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str3 = strArr[i];
                i++;
                if (b(str, str3)) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
