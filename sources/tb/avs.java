package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.app.OSType;
import com.taobao.uniinfra_kmp.common_utils.app.a;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class avs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final avs INSTANCE = new avs();

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16032a = mhr.e0().getBoolean("enableOrangeMultiPlatform", true);
    public static final boolean b = mhr.e0().getBoolean("LiveRoomOrangeCacheEnabled", true);
    public static final boolean c;
    public static final HashMap<String, String> d;

    static {
        t2o.a(1003487250);
        boolean z = true;
        if (a.d() != OSType.iOS) {
            z = false;
        }
        c = z;
        d = new HashMap<>();
    }

    public static /* synthetic */ String j(avs avsVar, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f01be55d", new Object[]{avsVar, str, str2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return avsVar.h(str, str2);
    }

    public static /* synthetic */ String l(avs avsVar, String str, String str2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0cd4b85", new Object[]{avsVar, str, str2, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return avsVar.k(str, str2, z);
    }

    public static final String m(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c74d0d3f", new Object[]{str, str2, str3});
        }
        return "group:" + str + " key:" + str2 + " value:" + str3 + " from localcache";
    }

    public static final String n(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9643a9e", new Object[]{str, str2, str3});
        }
        return "group:" + str + " key:" + str2 + " value:" + str3 + " from cache";
    }

    public static final String o(String str, String str2, Ref$ObjectRef ref$ObjectRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78d9c0a5", new Object[]{str, str2, ref$ObjectRef});
        }
        return "group:" + str + " key:" + str2 + " value:" + ((String) ref$ObjectRef.element) + " from orange";
    }

    public final boolean d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "key");
        return e("tblive", str, z);
    }

    public final boolean e(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cf8ad57", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        String l = l(this, str, str2, false, 4, null);
        iqu iquVar = iqu.INSTANCE;
        Boolean valueOf = Boolean.valueOf(z);
        Object obj = null;
        if (l != null) {
            wyf b2 = dun.b(Boolean.class);
            if (ckf.b(b2, dun.b(Integer.TYPE))) {
                obj = ssq.m(l.toString());
            } else if (ckf.b(b2, dun.b(Boolean.TYPE))) {
                obj = Boolean.valueOf(iquVar.a(l.toString()));
            } else if (ckf.b(b2, dun.b(Double.TYPE))) {
                obj = rsq.k(l.toString());
            } else if (ckf.b(b2, dun.b(Float.TYPE))) {
                obj = rsq.l(l.toString());
            } else if (ckf.b(b2, dun.b(Long.TYPE))) {
                obj = ssq.o(l.toString());
            } else if (ckf.b(b2, dun.b(String.class))) {
                obj = l.toString();
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            valueOf = bool;
        }
        return valueOf.booleanValue();
    }

    public final int f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        ckf.g(str, "key");
        return g("tblive", str, i);
    }

    public final int g(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7f3fb4e", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        String l = l(this, str, str2, false, 4, null);
        iqu iquVar = iqu.INSTANCE;
        Integer valueOf = Integer.valueOf(i);
        Object obj = null;
        if (l != null) {
            wyf b2 = dun.b(Integer.class);
            if (ckf.b(b2, dun.b(Integer.TYPE))) {
                obj = ssq.m(l.toString());
            } else if (ckf.b(b2, dun.b(Boolean.TYPE))) {
                obj = Boolean.valueOf(iquVar.a(l.toString()));
            } else if (ckf.b(b2, dun.b(Double.TYPE))) {
                obj = rsq.k(l.toString());
            } else if (ckf.b(b2, dun.b(Float.TYPE))) {
                obj = rsq.l(l.toString());
            } else if (ckf.b(b2, dun.b(Long.TYPE))) {
                obj = ssq.o(l.toString());
            } else if (ckf.b(b2, dun.b(String.class))) {
                obj = l.toString();
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            valueOf = num;
        }
        return valueOf.intValue();
    }

    public final String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        ckf.g(str, "key");
        ckf.g(str2, "defaultS");
        return i("tblive", str, str2);
    }

    public final String i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        ckf.g(str3, "default");
        String l = l(this, str, str2, false, 4, null);
        if (l == null) {
            return str3;
        }
        return l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.String] */
    public final String k(final String str, final String str2, boolean z) {
        String str3;
        final String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4c9dda2", new Object[]{this, str, str2, new Boolean(z)});
        }
        try {
            String str5 = str + '.' + str2;
            final String a2 = w5t.INSTANCE.a("orange", str5);
            if (a2 != null) {
                pus.INSTANCE.i(String.valueOf(((ns3) dun.b(avs.class)).getSimpleName()), null, new d1a() { // from class: tb.xus
                    @Override // tb.d1a
                    public final Object invoke() {
                        String m;
                        m = avs.m(str, str2, a2);
                        return m;
                    }
                });
                return a2;
            } else if (!z || !b || (str4 = d.get(str5)) == null) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (c && f16032a) {
                    if (hus.INSTANCE.a()) {
                        str3 = "Pad";
                    } else {
                        str3 = "Phone";
                    }
                    ref$ObjectRef.element = mhr.e0().F(str, str3 + "For" + str2);
                }
                if (ref$ObjectRef.element == 0) {
                    ref$ObjectRef.element = mhr.e0().F(str, str2);
                }
                T t = ref$ObjectRef.element;
                if (t != 0 && z && b) {
                    d.put(str5, t);
                }
                pus.INSTANCE.i(String.valueOf(((ns3) dun.b(avs.class)).getSimpleName()), null, new d1a() { // from class: tb.zus
                    @Override // tb.d1a
                    public final Object invoke() {
                        String o;
                        o = avs.o(str, str2, ref$ObjectRef);
                        return o;
                    }
                });
                return (String) ref$ObjectRef.element;
            } else {
                pus.INSTANCE.i(String.valueOf(((ns3) dun.b(avs.class)).getSimpleName()), null, new d1a() { // from class: tb.yus
                    @Override // tb.d1a
                    public final Object invoke() {
                        String n;
                        n = avs.n(str, str2, str4);
                        return n;
                    }
                });
                return str4;
            }
        } catch (Exception e) {
            pus.INSTANCE.g(String.valueOf(((ns3) dun.b(avs.class)).getSimpleName()), null, "group:" + str + " key:" + str2 + " exp:" + e);
            return null;
        }
    }

    public final void p(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b1374d", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        w5t.INSTANCE.b("orange", str + '.' + str2, str3);
    }
}
