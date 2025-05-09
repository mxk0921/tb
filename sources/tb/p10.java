package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.MegaPermissionAbility;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.zla;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class p10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements gjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f25804a;
        public final /* synthetic */ xla b;
        public final /* synthetic */ zla.a c;

        public a(Map map, xla xlaVar, zla.a aVar) {
            this.f25804a = map;
            this.b = xlaVar;
            this.c = aVar;
        }

        @Override // tb.gjb
        public void a(qzl qzlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
            } else {
                ((MegaPermissionAbility.a) this.c).a(p10.g(qzlVar, this.f25804a, this.b.b));
            }
        }
    }

    public static yla b(Context context, String str, String[] strArr, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("f6aedb5d", new Object[]{context, str, strArr, map});
        }
        return g(com.taobao.runtimepermission.a.d(context, str, f(map, strArr)), map, strArr);
    }

    public static void d(xla xlaVar, zla.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230bd9ae", new Object[]{xlaVar, aVar, map});
        } else {
            com.taobao.runtimepermission.a.c(xlaVar.f31453a, f(map, xlaVar.b)).x(xlaVar.e).B(xlaVar.f).w(xlaVar.d).t(xlaVar.c).y(xlaVar.g).u(new a(map, xlaVar, aVar)).m();
        }
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e9204ff", new Object[]{new Integer(i)});
        }
        if (i == -3) {
            return "ROLLBACK";
        }
        if (i == -2) {
            return "BIZ_DENIED";
        }
        if (i == -1) {
            return "DENIED";
        }
        if (i != 0) {
            return "UNSUPPORTED";
        }
        return "AUTHORIZED";
    }

    public static String[] f(Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("eb784fe", new Object[]{map, strArr});
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            String str2 = map.get(str);
            if (!linkedList.contains(str2)) {
                linkedList.add(str2);
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    public static yla g(qzl qzlVar, Map<String, String> map, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yla) ipChange.ipc$dispatch("9c0f8b50", new Object[]{qzlVar, map, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String str2 = map.get(str);
            if (str2 == null) {
                hashMap.put(str, "UNSUPPORTED");
            } else {
                int i = 0;
                while (true) {
                    String[] strArr2 = qzlVar.f27021a;
                    if (i >= strArr2.length) {
                        break;
                    } else if (str2.equals(strArr2[i])) {
                        hashMap.put(str, e(qzlVar.b[i]));
                        break;
                    } else {
                        i++;
                    }
                }
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, "UNSUPPORTED");
                }
            }
        }
        return new yla(true, hashMap, null, null);
    }

    public abstract yla a(Context context, String str, String[] strArr);

    public abstract void c(xla xlaVar, zla.a aVar);
}
