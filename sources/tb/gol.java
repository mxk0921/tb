package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.vb;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wetao.utils.TNodeUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.hqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG_SHORT_LINK = "page_guangguang";
    public static final String TAB2_VIDEO_LINK = "page_tab2video";

    /* renamed from: a  reason: collision with root package name */
    public static final String f20132a;
    public static final String b;
    public static final HashMap<String, a> c;
    public static String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f20133a = "weitao_switch";
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            t2o.a(503316952);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f20134a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;

        static {
            t2o.a(503316953);
        }

        public b(String str, String str2, String str3, boolean z) {
            this.f20134a = str;
            this.b = str2;
            this.c = str3;
            this.e = z;
            this.d = nwv.u0(str3);
        }

        public String a() {
            Uri parse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5b3b83bf", new Object[]{this});
            }
            String str = this.c;
            if (str == null || (parse = Uri.parse(str)) == null) {
                return null;
            }
            String queryParameter = parse.getQueryParameter(gl4.CONFIG_LOCAL_PATH);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
            return null;
        }

        public String b() {
            Uri parse;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe0ab176", new Object[]{this});
            }
            String str = this.c;
            if (str == null || (parse = Uri.parse(str)) == null) {
                return null;
            }
            String queryParameter = parse.getQueryParameter(gl4.CONFIG_LOCAL_VERSION);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
            return null;
        }
    }

    static {
        t2o.a(503316951);
        HashMap<String, a> hashMap = new HashMap<>();
        c = hashMap;
        try {
            ytn.c("injectShortLinkMap", TNodeUtils.class, HashMap.class).invoke(null, hashMap);
            f20132a = (String) ytn.d("ENGINE_VERSION", TNodeUtils.class);
            b = (String) ytn.d("PAD_VERSION", TNodeUtils.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("597e6fd5", new Object[]{str});
        }
        if (!akt.S1()) {
            return str;
        }
        t9b c2 = od0.D().c();
        String valueOf = String.valueOf(c2.a("tnodeandroid." + str + ".orangekey", str));
        tfs.g("TPU", "abKey:" + str + " abtest结果:" + valueOf);
        return valueOf;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a747d0b", new Object[]{str});
        }
        return "https://g.alicdn.com/tnode/tnodemapper/" + str + "@.json.json";
    }

    public static String d(String str, String str2, String str3, boolean z) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85e464b7", new Object[]{str, str2, str3, new Boolean(z)});
        }
        vfs g = vfs.g();
        if (str3 != null) {
            str4 = str3;
        } else {
            str4 = z ? b(str) : str;
        }
        String e = g.e(str2, str, str4);
        hqq.b a2 = hqq.a();
        a2.b("最终URL:").b(e).b("  ");
        a2.b("groupName:").b(str2).b("  ");
        a2.b("pageName:").b(str).b("  ");
        if (str3 != null) {
            a2.b("打底默认URL:").b(str3).b("  ");
        }
        if (z) {
            a2.b("兜底URL:").b(b(str));
        } else {
            a2.b("兜底URL:").b(str);
        }
        tfs.g("TPU", a2.toString());
        return e;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b04eca07", new Object[]{str});
        }
        if (str == null || !str.contains("?")) {
            return "?";
        }
        return "&";
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ceaa0204", new Object[0]);
        }
        for (Map.Entry<String, a> entry : c.entrySet()) {
            if (TextUtils.equals(entry.getKey(), TAB2_VIDEO_LINK)) {
                a value = entry.getValue();
                return d(a(value.c), value.f20133a, value.b, false);
            }
        }
        return null;
    }

    public static b h(Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b0f64acf", new Object[]{uri, str, new Boolean(z)});
        }
        return j(uri, str, z, false);
    }

    public static b i(Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4a7c2b37", new Object[]{uri, str, new Boolean(z)});
        }
        return j(uri, str, z, true);
    }

    public static void k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c696507", new Object[]{str, str2, str3});
            return;
        }
        a aVar = new a();
        aVar.b = str2;
        aVar.c = str + f20132a;
        aVar.e = str3;
        aVar.d = str3;
        c.put(str, aVar);
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c938158", new Object[]{str});
            return;
        }
        String str2 = d;
        if (str2 != null && str != null && TextUtils.equals(nwv.l(nwv.u0(str2)), nwv.l(nwv.u0(str)))) {
            d = null;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb77add6", new Object[]{str});
        }
        if (d == null) {
            synchronized (gol.class) {
                try {
                    if (d == null) {
                        String b2 = od0.D().w().b(str, GUANGGUANG_SHORT_LINK);
                        Iterator<Map.Entry<String, a>> it = c.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, a> next = it.next();
                            if (TextUtils.equals(next.getKey(), b2)) {
                                a value = next.getValue();
                                d = d(a(value.c), value.f20133a, value.b, false);
                                d = od0.D().w().c(d, str);
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static String f(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c002d0", new Object[]{uri, str, str2});
        }
        int indexOf = str.indexOf(f20132a);
        if (indexOf < 0) {
            indexOf = str.indexOf(b);
        }
        String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
        if (uri == null) {
            return str;
        }
        vfs g = vfs.g();
        String e = g.e(str2, substring + "_redirectkey", null);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        String queryParameter = uri.getQueryParameter(e);
        if (TextUtils.isEmpty(queryParameter)) {
            return str;
        }
        String replace = str.replace(substring, substring + "_" + queryParameter);
        tfs.g("TPU", "redirect:" + queryParameter + " 结果:" + replace);
        return replace;
    }

    public static b j(Uri uri, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        a aVar;
        String str5;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3d0556c4", new Object[]{uri, str, new Boolean(z), new Boolean(z2)});
        }
        if (TextUtils.isEmpty(str)) {
            return new b(str, str, str, false);
        }
        int indexOf = str.indexOf("?");
        String str8 = null;
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            if (TextUtils.equals(str2, GUANGGUANG_SHORT_LINK)) {
                str2 = od0.D().w().b(uri != null ? uri.toString() : null, str2);
            }
            str3 = str.substring(indexOf + 1);
        } else {
            str2 = str;
            str3 = null;
        }
        Iterator<Map.Entry<String, a>> it = c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str4 = "weitao_switch";
                aVar = null;
                str5 = null;
                str6 = str2;
                break;
            }
            Map.Entry<String, a> next = it.next();
            str5 = next.getKey();
            aVar = next.getValue();
            if (str5.equals(str2)) {
                str4 = aVar.f20133a;
                str6 = aVar.c;
                if (str6 == null) {
                    str6 = str5;
                }
            }
        }
        int indexOf2 = str6.indexOf("@");
        if (indexOf2 > 0 && indexOf2 < str6.length() - 1) {
            str4 = str6.substring(indexOf2 + 1) + vb.i;
            str6 = str6.substring(0, indexOf2);
        }
        String str9 = f20132a;
        if (!str6.endsWith(str9) && !str6.endsWith(b)) {
            str6 = str6 + str9;
        }
        String a2 = a(f(uri, str6, str4));
        if (aVar != null) {
            if (!TextUtils.equals(str5, GUANGGUANG_SHORT_LINK) && !TextUtils.equals(str5, TAB2_VIDEO_LINK)) {
                str7 = d(a2, str4, aVar.b, z);
            } else if (!z2 || !TextUtils.equals(str5, TAB2_VIDEO_LINK)) {
                if (uri != null) {
                    str8 = uri.toString();
                }
                str7 = c(str8);
            } else {
                str7 = g();
            }
            if (TextUtils.isEmpty(str7) || a2.equals(str7)) {
                tfs.g("TPU", "打底映射获取短链失败, 入参url:" + str + "  返回:" + str7);
                return new b(str2, a2, str, false);
            } else if (aVar.d != null && !str7.startsWith("null")) {
                str7 = str7 + e(str7) + "localPath=" + aVar.d + "&localVersion=" + aVar.e;
            }
        } else {
            str7 = d(a2, str4, null, z);
            if (TextUtils.isEmpty(str7) || a2.equals(str7)) {
                tfs.g("TPU", "获取短链失败, 入参url:" + str + "  返回:" + str7);
                return new b(str2, a2, str, false);
            }
        }
        if (str3 != null) {
            str7 = str7 + e(str7) + str3;
        }
        tfs.g("TPU", "获取短链成功, 入参url:" + str + "  返回:" + str7);
        return new b(str2, a2, str7, true);
    }
}
