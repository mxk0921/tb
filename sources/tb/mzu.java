package tb;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import tb.jzu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final jzu.b f24418a = new c(null);
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24419a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Map d;

        public a(String str, String str2, int i, Map map) {
            this.f24419a = str;
            this.b = str2;
            this.c = i;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mzu.a().k(this.f24419a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24420a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String[] d;

        public b(String str, String str2, int i, String[] strArr) {
            this.f24420a = str;
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
                mzu.b(this.f24420a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c implements jzu.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296443);
            t2o.a(481296439);
        }

        public c() {
        }

        @Override // tb.jzu.b
        public void a(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832f4a3", new Object[]{this, str, str2, strArr});
            } else {
                TBS.Adv.ctrlClicked(str, CT.Button, str2, mzu.c(strArr));
            }
        }

        @Override // tb.jzu.b
        public void b(Context context, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9e60a0f", new Object[]{this, context, map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
        }

        @Override // tb.jzu.b
        public void c(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ad60b1c", new Object[]{this, str, str2, str3, str4});
            }
        }

        @Override // tb.jzu.b
        public void d(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ebb9d3c", new Object[]{this, str, strArr});
            } else {
                TBS.Adv.ctrlClicked(CT.Button, str, mzu.c(strArr));
            }
        }

        @Override // tb.jzu.b
        public void e(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5faffb67", new Object[]{this, str, str2, strArr});
                return;
            }
            String[] d = mzu.d(strArr);
            ArrayMap arrayMap = new ArrayMap();
            if (d != null && d.length % 2 == 0) {
                String str3 = null;
                for (String str4 : d) {
                    if (str3 == null) {
                        if (str4 == null) {
                            str4 = "";
                        }
                        str3 = str4;
                    } else {
                        arrayMap.put(str3, str4);
                        str3 = null;
                    }
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_" + str2, "", "", arrayMap).build());
        }

        @Override // tb.jzu.b
        public void f(String str, String str2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c79ed408", new Object[]{this, str, str2, list});
            }
        }

        @Override // tb.jzu.b
        public void g(String str, String str2, List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7b450f9", new Object[]{this, str, str2, list, list2});
            }
        }

        @Override // tb.jzu.b
        public void h(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b20b45ef", new Object[]{this, str, str2});
            }
        }

        @Override // tb.jzu.b
        public void i(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc21ca8", new Object[]{this, context, str});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
            }
        }

        @Override // tb.jzu.b
        public void j(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f817dcbf", new Object[]{this, str, str2, map, map2});
            }
        }

        @Override // tb.jzu.b
        public void k(String str, String str2, int i, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f6baff0", new Object[]{this, str, str2, new Integer(i), map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            if (!map.containsKey("rainbow")) {
                map.put("rainbow", URLEncoder.encode(oen.j()));
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str + "_" + str2, "", "", map).build());
        }

        public void l(String str, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b6b2205", new Object[]{this, str, str2, map});
                return;
            }
            if (map == null) {
                map = new ArrayMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2101, str + "_" + str2, "", "", map).build());
        }

        public void m(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58b8f5cd", new Object[]{this, str, str2, map});
                return;
            }
            ArrayMap arrayMap = new ArrayMap();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    arrayMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_" + str2, "", "", arrayMap).build());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        t2o.a(481296440);
    }

    public static /* synthetic */ jzu.b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzu.b) ipChange.ipc$dispatch("135f263f", new Object[0]);
        }
        return f24418a;
    }

    public static /* synthetic */ void b(String str, String str2, int i, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584f9749", new Object[]{str, str2, new Integer(i), strArr});
        } else {
            l(str, str2, i, strArr);
        }
    }

    public static /* synthetic */ String[] c(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5e981234", new Object[]{strArr});
        }
        return e(strArr);
    }

    public static /* synthetic */ String[] d(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("21847b93", new Object[]{strArr});
        }
        return f(strArr);
    }

    public static void g(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ebb9d3c", new Object[]{str, strArr});
        } else {
            ((c) f24418a).d(str, strArr);
        }
    }

    public static void h(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6b2205", new Object[]{str, str2, map});
        } else {
            ((c) f24418a).l(str, str2, map);
        }
    }

    public static void i(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68814b9f", new Object[]{str, str2, strArr});
        } else {
            n(str, str2, 2101, strArr);
        }
    }

    public static void k(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832f4a3", new Object[]{str, str2, strArr});
        } else {
            ((c) f24418a).a(str, str2, strArr);
        }
    }

    public static void l(String str, String str2, int i, String... strArr) {
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
        ((c) f24418a).k(str, str2, i, arrayMap);
    }

    public static void m(String str, String str2, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6baff0", new Object[]{str, str2, new Integer(i), map});
        } else if (b) {
            VExecutors.defaultSharedThreadPool().submit(new a(str, str2, i, map));
        } else {
            ((c) f24418a).k(str, str2, i, map);
        }
    }

    public static void n(String str, String str2, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc62ec0a", new Object[]{str, str2, new Integer(i), strArr});
        } else if (b) {
            VExecutors.defaultSharedThreadPool().submit(new b(str, str2, i, strArr));
        } else {
            l(str, str2, i, strArr);
        }
    }

    public static void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15799b54", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void p(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b8f5cd", new Object[]{str, str2, map});
        } else {
            ((c) f24418a).m(str, str2, map);
        }
    }

    public static void q(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5faffb67", new Object[]{str, str2, strArr});
        } else {
            ((c) f24418a).e(str, str2, strArr);
        }
    }

    public static String[] e(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("48159bbc", new Object[]{strArr});
        }
        if (!j(strArr)) {
            if (strArr == null) {
                strArr = new String[1];
            } else {
                String[] strArr2 = new String[strArr.length + 1];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 1] = "rainbow=" + URLEncoder.encode(oen.j());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static String[] f(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("902d3759", new Object[]{strArr});
        }
        if (!j(strArr)) {
            if (strArr == null) {
                strArr = new String[2];
            } else {
                String[] strArr2 = new String[strArr.length + 2];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 2] = "rainbow";
                strArr[strArr.length - 1] = URLEncoder.encode(oen.j());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    public static boolean j(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("159c3c00", new Object[]{strArr})).booleanValue();
        }
        if (!(strArr == null || strArr.length == 0)) {
            for (String str : strArr) {
                if (str != null && str.contains("rainbow")) {
                    return true;
                }
            }
        }
        return false;
    }
}
