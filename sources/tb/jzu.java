package tb;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f22313a;
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22314a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String[] d;

        public a(String str, String str2, int i, String[] strArr) {
            this.f22314a = str;
            this.b = str2;
            this.c = i;
            this.d = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                jzu.a(this.f22314a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a(String str, String str2, String... strArr);

        void b(Context context, Map<String, String> map);

        void c(String str, String str2, String str3, String str4);

        void d(String str, String... strArr);

        void e(String str, String str2, String... strArr);

        void f(String str, String str2, List<String> list);

        void g(String str, String str2, List<String> list, List<String> list2);

        void h(String str, String str2);

        void i(Context context, String str);

        void j(String str, String str2, Map<String, Double> map, Map<String, String> map2);

        void k(String str, String str2, int i, Map<String, String> map);
    }

    static {
        t2o.a(481296437);
    }

    public static /* synthetic */ void a(String str, String str2, int i, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71308ec7", new Object[]{str, str2, new Integer(i), strArr});
        } else {
            k(str, str2, i, strArr);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad60b1c", new Object[]{str, str2, str3, str4});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.c(str, str2, str3, str4);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20b45ef", new Object[]{str, str2});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.h(str, str2);
        }
    }

    public static void d(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f817dcbf", new Object[]{str, str2, map, map2});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.j(str, str2, map, map2);
        }
    }

    public static void e(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebb9d3c", new Object[]{str, strArr});
            return;
        }
        String[] h = h(strArr);
        b bVar = f22313a;
        if (bVar != null) {
            bVar.d(str, h);
        }
    }

    public static void f(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6b2205", new Object[]{str, str2, map});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.k(str, str2, 2101, map);
        }
    }

    public static void g(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68814b9f", new Object[]{str, str2, strArr});
        } else {
            n(str, str2, 2101, strArr);
        }
    }

    public static String[] h(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("563d825", new Object[]{strArr});
        }
        if (strArr.length % 2 != 0) {
            agh.d("UTAdapter", "event not paired", new IllegalArgumentException(Arrays.toString(strArr)));
        }
        String[] strArr2 = new String[strArr.length / 2];
        for (int i = 0; i < strArr.length / 2; i++) {
            int i2 = i * 2;
            String str = strArr[i2 + 1];
            if (str == null) {
                str = "";
            }
            strArr2[i] = strArr[i2] + "=" + str;
        }
        return strArr2;
    }

    public static void i(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832f4a3", new Object[]{str, str2, strArr});
            return;
        }
        String[] h = h(strArr);
        b bVar = f22313a;
        if (bVar != null) {
            bVar.a(str, str2, h);
        }
    }

    public static void j(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1154803d", new Object[]{str, str2, strArr});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.a(str, str2, strArr);
        }
    }

    public static void k(String str, String str2, int i, String... strArr) {
        ArrayMap arrayMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf56574a", new Object[]{str, str2, new Integer(i), strArr});
            return;
        }
        if (strArr == null || strArr.length <= 0) {
            arrayMap = null;
        } else if (strArr.length % 2 != 0) {
            agh.c("UTAdapter", "clickEventArgsError " + str2);
            return;
        } else {
            arrayMap = new ArrayMap();
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                arrayMap.put(strArr[i2], strArr[i2 + 1]);
            }
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.k(str, str2, i, arrayMap);
        }
    }

    public static void l(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79ed408", new Object[]{str, str2, list});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.f(str, str2, list);
        }
    }

    public static void m(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b450f9", new Object[]{str, str2, list, list2});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.g(str, str2, list, list2);
        }
    }

    public static void n(String str, String str2, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc62ec0a", new Object[]{str, str2, new Integer(i), strArr});
        } else if (b) {
            VExecutors.defaultSharedThreadPool().submit(new a(str, str2, i, strArr));
        } else {
            k(str, str2, i, strArr);
        }
    }

    public static void o(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3089d403", new Object[]{bVar});
        } else {
            f22313a = bVar;
        }
    }

    public static void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15799b54", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void q(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5faffb67", new Object[]{str, str2, strArr});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.e(str, str2, strArr);
        }
    }

    public static void r(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc21ca8", new Object[]{context, str});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.i(context, str);
        }
    }

    public static void s(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e60a0f", new Object[]{context, map});
            return;
        }
        b bVar = f22313a;
        if (bVar != null) {
            bVar.b(context, map);
        }
    }

    public static void t(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd51ea9", new Object[]{context, strArr});
            return;
        }
        HashMap hashMap = new HashMap();
        if (strArr != null && strArr.length > 0 && strArr.length % 2 == 0) {
            int length = strArr.length;
            for (int i = 0; i < length; i += 2) {
                hashMap.put(strArr[i], strArr[i + 1]);
            }
        }
        s(context, hashMap);
    }
}
