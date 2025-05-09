package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28082a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ Map g;
        public final /* synthetic */ String h;

        public a(String str, String str2, String str3, String str4, String str5, String str6, Map map, String str7) {
            this.f28082a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = map;
            this.h = str7;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sj.f(this.c, this.d, this.e, this.f, this.f28082a, xk.c(this.f28082a, this.b), this.g, this.h);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends h15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(81789259);
        }

        public b(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("17e51f1e", new Object[]{str});
            }
            return new b("AURA", str, "26900-tracker", sj.a());
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/utils/AURAJsTackerUtils$AURACustomModel");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c extends p5j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(81789260);
        }

        public c(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/utils/AURAJsTackerUtils$AURAMtopModel");
        }

        public static c o(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("d9deb0cf", new Object[]{str, new Boolean(z)});
            }
            return new c("AURA", "26900-tracker", sj.a(), str, z);
        }
    }

    static {
        t2o.a(81789257);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return d();
    }

    public static void b(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f344f9", new Object[]{str, str2, str3, str4, str5, str6, map, str7});
        } else {
            dn.h(new a(str5, str6, str, str2, str3, str4, map, str7));
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa1d3759", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[0]);
        }
        if (yv6.a()) {
            return "http://taobao.com/jstracker/android/debug/aura.html";
        }
        return "http://taobao.com/jstracker/android/aura.html";
    }

    public static boolean e(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f2dc432", new Object[]{new Double(d)})).booleanValue();
        }
        if (new Random().nextInt(101) + 1 > d) {
            return true;
        }
        return false;
    }

    public static void f(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c0c95d", new Object[]{str, str2, str3, str4, str5, str6, map, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str2);
        hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str3);
        hashMap.put("code", str5);
        hashMap.put("sampling", str6);
        hashMap.put("collection_url", h1p.HTTP_PREFIX + str4);
        hashMap.put("name", str);
        hashMap.put("native", "1");
        if (map != null) {
            map.put("c1", JSON.toJSONString(hashMap));
        }
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("message", c(str7));
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(h1p.HTTP_PREFIX + str4, 19999, "/jstracker.3", "", "", hashMap).build());
    }

    public static void g(h15 h15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe607282", new Object[]{h15Var});
        } else if (h15Var instanceof b) {
            if (yv6.a()) {
                h15Var.sampling(1.0f);
            }
            f9v.p(h15Var);
        } else if (yv6.a()) {
            throw new IllegalArgumentException("model 必须为BuyCustomModel");
        }
    }

    public static void h(p5j p5jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b18522", new Object[]{p5jVar});
        } else if (p5jVar instanceof c) {
            if (yv6.a()) {
                p5jVar.sampling(1.0f);
            }
            f9v.r(p5jVar);
        } else if (yv6.a()) {
            throw new IllegalArgumentException("model 必须为BuyMtopModel");
        }
    }
}
