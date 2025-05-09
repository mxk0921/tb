package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class gus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gus INSTANCE = new gus();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f20247a = new HashMap<>();
    public static final boolean b = mhr.e0().getBoolean("LiveRoomABTestCacheEnabled", true);

    static {
        t2o.a(1003487234);
    }

    public static final String e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1dc5bb0", new Object[]{str, str2, str3, str4});
        }
        return "component:" + str + " module:" + str2 + " key:" + str3 + " value:" + str4 + " from cache";
    }

    public static final String f(String str, String str2, String str3, String str4, e0g e0gVar) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b86490e4", new Object[]{str, str2, str3, str4, e0gVar});
        }
        StringBuilder sb = new StringBuilder("component:");
        sb.append(str);
        sb.append(" module:");
        sb.append(str2);
        sb.append(" key:");
        sb.append(str3);
        sb.append(" value:");
        sb.append(str4);
        sb.append(" experimentId:");
        String str7 = null;
        if (e0gVar != null) {
            str5 = e0gVar.b();
        } else {
            str5 = null;
        }
        sb.append(str5);
        sb.append(" experimentReleaseId:");
        if (e0gVar != null) {
            str6 = e0gVar.c();
        } else {
            str6 = null;
        }
        sb.append(str6);
        sb.append(" experimentBucketId:");
        if (e0gVar != null) {
            str7 = e0gVar.a();
        }
        sb.append(str7);
        return sb.toString();
    }

    public static final String g(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("311cf68d", new Object[]{str, str2, str3, str4});
        }
        return "component:" + str + " module:" + str2 + " key:" + str3 + " value:" + str4;
    }

    public final void h(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717607d7", new Object[]{this, str, str2, str3, str4});
            return;
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        ckf.g(str3, "key");
        w5t.INSTANCE.b("abTest", str + '.' + str2 + '.' + str3, str4);
    }

    public final String d(final String str, final String str2, final String str3, String str4) {
        final e0g e0gVar;
        final String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90bdbddb", new Object[]{this, str, str2, str3, str4});
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        ckf.g(str3, "key");
        ckf.g(str4, "defValue");
        String str6 = str + '.' + str2 + '.' + str3;
        String a2 = w5t.INSTANCE.a("abTest", str6);
        if (a2 != null) {
            return a2;
        }
        boolean z = b;
        if (z && (str5 = f20247a.get(str6)) != null) {
            pus.INSTANCE.i(String.valueOf(((ns3) dun.b(gus.class)).getSimpleName()), null, new d1a() { // from class: tb.dus
                @Override // tb.d1a
                public final Object invoke() {
                    String e;
                    e = gus.e(str, str2, str3, str5);
                    return e;
                }
            });
            return str5;
        } else if (rwt.c()) {
            e0g n = mhr.s().n(str, str2, str3);
            if (n != null) {
                if (!(n.b() == null || n.c() == null || n.a() == null)) {
                    twt.e(a.j(jpu.a("experimentId", n.b()), jpu.a("experimentReleaseId", n.c()), jpu.a("experimentBucketId", n.a())));
                }
                e0gVar = n;
            } else {
                e0gVar = null;
            }
            final String d = e0gVar != null ? e0gVar.d() : null;
            if (d != null && z) {
                f20247a.put(str6, d);
            }
            pus.INSTANCE.i(String.valueOf(((ns3) dun.b(gus.class)).getSimpleName()), null, new d1a() { // from class: tb.eus
                @Override // tb.d1a
                public final Object invoke() {
                    String f;
                    f = gus.f(str, str2, str3, d, e0gVar);
                    return f;
                }
            });
            return d == null ? str4 : d;
        } else {
            final String J = mhr.s().J(str, str2, str3);
            if (J != null && z) {
                f20247a.put(str6, J);
            }
            pus.INSTANCE.i(String.valueOf(((ns3) dun.b(gus.class)).getSimpleName()), null, new d1a() { // from class: tb.fus
                @Override // tb.d1a
                public final Object invoke() {
                    String g;
                    g = gus.g(str, str2, str3, J);
                    return g;
                }
            });
            return J == null ? str4 : J;
        }
    }
}
