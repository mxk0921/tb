package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import tb.npp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class r54 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f27112a = new Handler(Looper.getMainLooper());
    public static final Handler b;
    public static final Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27113a;
        public final /* synthetic */ d1a<xhv> b;

        public a(String str, d1a<xhv> d1aVar) {
            this.f27113a = str;
            this.b = d1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ltt lttVar = new ltt();
            d1a<xhv> d1aVar = this.b;
            if (d1aVar != null) {
                try {
                    d1aVar.invoke();
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(kotlin.b.a(th));
                }
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
            npp.a aVar = npp.Companion;
            aVar.b("shopAsyncTask : " + ((Object) this.f27113a) + " , cost : " + lttVar.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ d1a f27114a;

        public b(d1a d1aVar) {
            this.f27114a = d1aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f27114a.invoke();
            }
        }
    }

    public static final void A(d1a<xhv> d1aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873bfd03", new Object[]{d1aVar, str});
        } else {
            b.post(new a(str, d1aVar));
        }
    }

    public static final void B(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{runnable});
            return;
        }
        Handler handler = f27112a;
        if (runnable != null) {
            handler.post(runnable);
        }
    }

    public static final void C(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fdbac1", new Object[]{d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        f27112a.post(new b(d1aVar));
    }

    public static final void D(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4d50ef", new Object[]{runnable, new Long(j)});
            return;
        }
        Handler handler = f27112a;
        if (runnable != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public static final void E(d1a<xhv> d1aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437a9a6", new Object[]{d1aVar, new Long(j)});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        f27112a.postDelayed(new b(d1aVar), j);
    }

    public static final void F(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27931e9f", new Object[]{d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        f27112a.postDelayed(new b(d1aVar), 32L);
    }

    public static final void G(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0fab94", new Object[]{d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        f27112a.postDelayed(new b(d1aVar), 300L);
    }

    public static final void H(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b3a4ec", new Object[]{d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        if (ckf.b(Looper.myLooper(), Looper.getMainLooper())) {
            d1aVar.invoke();
        } else {
            C(d1aVar);
        }
    }

    public static final float I(Number number, Number number2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3a6855f", new Object[]{number, number2})).floatValue();
        }
        ckf.g(number, "<this>");
        ckf.g(number2, "den");
        if (number2 instanceof Float) {
            i = Float.valueOf(0.0f);
        } else {
            i = 0;
        }
        if (!ckf.b(number2, i)) {
            return number.floatValue() / number2.floatValue();
        }
        npp.Companion.f("div 0");
        return 1.0f;
    }

    public static final <T> T J(ArrayList<T> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac214329", new Object[]{arrayList, new Integer(i)});
        }
        ckf.g(arrayList, "<this>");
        if (i < arrayList.size()) {
            return arrayList.get(i);
        }
        return null;
    }

    public static final String K(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f14cad4b", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, uj3.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final int L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab52a0ad", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static final long M(String str) {
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf82fc7", new Object[]{str})).longValue();
        }
        if (str == null || (o = ssq.o(str)) == null) {
            return 0L;
        }
        return o.longValue();
    }

    public static final Uri N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("94aeddae", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final void O(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384dd6e5", new Object[]{context, str, str2, str3});
            return;
        }
        ckf.g(context, "<this>");
        if (!f(str, str2) && (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString(str2, str3)) != null) {
            putString.apply();
        }
    }

    public static final void P(String str, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132f3ff0", new Object[]{str, d1aVar});
        } else {
            A(d1aVar, str);
        }
    }

    public static final void Q(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871358a7", new Object[]{d1aVar});
        } else {
            A(d1aVar, null);
        }
    }

    public static final void R(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf19d25", new Object[]{context, str});
            return;
        }
        ckf.g(context, "<this>");
        if (str != null) {
            Toast.makeText(context, str, 1).show();
        }
    }

    public static final void S(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc6b8f9", new Object[]{context, str});
            return;
        }
        ckf.g(context, "<this>");
        if (str != null) {
            Toast.makeText(context, str, 0).show();
        }
    }

    public static final <K, V> Map<String, String> T(Map<K, ? extends V> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e8c747b", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            String str2 = null;
            if (key == null) {
                str = null;
            } else {
                str = key.toString();
            }
            Object value = entry.getValue();
            if (value != null) {
                str2 = value.toString();
            }
            hashMap.put(str, str2);
        }
        return hashMap;
    }

    public static final <K, V> Map<String, String> U(Map<K, ? extends V> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8166c2a", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                String valueOf = String.valueOf(entry.getKey());
                Object value = entry.getValue();
                if (value == null) {
                    str = null;
                } else {
                    str = value.toString();
                }
                hashMap.put(valueOf, str);
            }
        }
        return hashMap;
    }

    public static final <K, V> Map<String, String> V(Map<K, ? extends V> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("689b7caa", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                String valueOf = String.valueOf(entry.getKey());
                Object value = entry.getValue();
                if (value == null) {
                    str = null;
                } else {
                    str = value.toString();
                }
                hashMap.put(valueOf, str);
            }
        }
        return hashMap;
    }

    public static final Bundle W(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("8d61fca5", new Object[]{map});
        }
        ckf.g(map, "<this>");
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static final <K, V> String X(Map<K, ? extends V> map) {
        Iterator<T> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9fb9e65", new Object[]{map});
        }
        ckf.g(map, "<this>");
        String str = "";
        try {
            while (map.entrySet().iterator().hasNext()) {
                str = str + " {" + ((Map.Entry) it.next()) + '}';
            }
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
        return str;
    }

    public static final void Y(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da92dc4", new Object[]{context, str});
            return;
        }
        ckf.g(context, "<this>");
        if (str != null && s()) {
            Toast.makeText(context, str, 0).show();
        }
    }

    public static final void Z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ac4d62", new Object[]{context});
            return;
        }
        ckf.g(context, "<this>");
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public static final void a(Uri.Builder builder, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71c9c59", new Object[]{builder, jSONObject});
            return;
        }
        ckf.g(builder, "<this>");
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    str = null;
                } else {
                    str = value.toString();
                }
                builder.appendQueryParameter(key, str);
            }
        }
    }

    public static final float a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("418af4d7", new Object[]{str})).floatValue();
        }
        try {
            ckf.d(str);
            return Float.parseFloat(str);
        } catch (Throwable th) {
            Throwable th2 = Result.m1111exceptionOrNullimpl(Result.m1108constructorimpl(kotlin.b.a(th)));
            if (th2 == null) {
                return 0.0f;
            }
            npp.Companion.c("catching block has error", th2);
            return 0.0f;
        }
    }

    public static final void b(Uri.Builder builder, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7cbe3ae", new Object[]{builder, map});
            return;
        }
        ckf.g(builder, "<this>");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static final float c(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d492436", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)})).floatValue();
        }
        double d = 2;
        return (float) Math.sqrt(((float) Math.pow(Math.abs(f - f3), d)) + ((float) Math.pow(Math.abs(f2 - f4), d)));
    }

    public static final boolean d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0a37906", new Object[]{activity})).booleanValue();
        }
        ckf.g(activity, "<this>");
        return activity.isDestroyed();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(androidx.fragment.app.Fragment r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.r54.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "59e933fd"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            java.lang.String r2 = "<this>"
            tb.ckf.g(r4, r2)
            boolean r2 = r4.isAdded()
            if (r2 != 0) goto L_0x0025
            return r0
        L_0x0025:
            androidx.fragment.app.FragmentManager r4 = r4.getChildFragmentManager()     // Catch: all -> 0x0031
            tb.xhv r2 = tb.xhv.INSTANCE     // Catch: all -> 0x002f
            kotlin.Result.m1108constructorimpl(r2)     // Catch: all -> 0x002f
            goto L_0x003a
        L_0x002f:
            r2 = move-exception
            goto L_0x0033
        L_0x0031:
            r2 = move-exception
            r4 = 0
        L_0x0033:
            java.lang.Object r2 = kotlin.b.a(r2)
            kotlin.Result.m1108constructorimpl(r2)
        L_0x003a:
            if (r4 == 0) goto L_0x003d
            return r1
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r54.e(androidx.fragment.app.Fragment):boolean");
    }

    public static final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6903d9db", new Object[0])).booleanValue();
        }
        return !h();
    }

    public static final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ded1f7e", new Object[0])).booleanValue();
        }
        return !ckf.b(Looper.getMainLooper(), Looper.myLooper());
    }

    public static final <K, V> HashMap<K, V> i(Map<K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cbcaea2b", new Object[]{map});
        }
        HashMap<K, V> hashMap = new HashMap<>();
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static final long j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90c5b9bb", new Object[]{new Long(j)})).longValue();
        }
        if (j > 0) {
            return j - (System.currentTimeMillis() - SystemClock.uptimeMillis());
        }
        return j;
    }

    public static final Map<String, String> k(Map<?, ?> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f06c5d6", new Object[]{map});
        }
        ckf.g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                String valueOf = String.valueOf(entry.getKey());
                Object value = entry.getValue();
                if (value == null) {
                    str = null;
                } else {
                    str = value.toString();
                }
                linkedHashMap.put(valueOf, str);
            }
        }
        return linkedHashMap;
    }

    public static final void l(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab464dd3", new Object[]{d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        c.post(new b(d1aVar));
    }

    public static final DisplayMetrics m(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("5cf546d0", new Object[]{activity});
        }
        ckf.g(activity, "<this>");
        Object systemService = activity.getSystemService(pg1.ATOM_EXT_window);
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static final int n(Context context, int i) {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37a458be", new Object[]{context, new Integer(i)})).intValue();
        }
        ckf.g(context, "<this>");
        if (Build.VERSION.SDK_INT < 28) {
            return i;
        }
        if (!(context instanceof Activity)) {
            return i;
        }
        Window window = ((Activity) context).getWindow();
        WindowInsets windowInsets = null;
        if (!(window == null || (decorView = window.getDecorView()) == null)) {
            windowInsets = decorView.getRootWindowInsets();
        }
        return nxq.g(context, windowInsets);
    }

    public static final Map<String, String> o(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cd4d8b0", new Object[]{uri});
        }
        ckf.g(uri, "<this>");
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (str != null) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final Map<String, String> p(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cc3c1155", new Object[]{uri});
        }
        ckf.g(uri, "<this>");
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (str != null) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final String q(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65134819", new Object[]{context, str, str2});
        }
        ckf.g(context, "<this>");
        if (!f(str, str2) && (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) != null) {
            return sharedPreferences.getString(str2, "");
        }
        return null;
    }

    public static final boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2736a4cf", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "<this>");
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing();
        }
        return false;
    }

    public static final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("673df0ec", new Object[0])).booleanValue();
        }
        try {
            Application application = Globals.getApplication();
            ckf.f(application, "getApplication()");
            if ((application.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        r4 = r4.getRootWindowInsets();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean t(android.app.Activity r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.r54.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "7e23a9bf"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x0019:
            java.lang.String r2 = "<this>"
            tb.ckf.g(r4, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x0041
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            android.view.View r4 = r4.getDecorView()
            if (r4 != 0) goto L_0x0032
            goto L_0x0041
        L_0x0032:
            android.view.WindowInsets r4 = tb.zop.a(r4)
            if (r4 != 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            android.view.DisplayCutout r4 = tb.sgx.a(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            return r1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r54.t(android.app.Activity):boolean");
    }

    public static final boolean u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "<this>");
        return TBDeviceUtils.p(context);
    }

    public static final boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c49fbd41", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "<this>");
        if (u(context) || w(context)) {
            return false;
        }
        return true;
    }

    public static final boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6030ef2b", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "<this>");
        return TBDeviceUtils.P(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Class<?> y(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.r54.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "4cd9e7ab"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L_0x0015:
            java.lang.String r0 = "className"
            tb.ckf.g(r4, r0)
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: all -> 0x0027
            tb.xhv r0 = tb.xhv.INSTANCE     // Catch: all -> 0x0025
            java.lang.Object r0 = kotlin.Result.m1108constructorimpl(r0)     // Catch: all -> 0x0025
            goto L_0x0031
        L_0x0025:
            r0 = move-exception
            goto L_0x0029
        L_0x0027:
            r0 = move-exception
            r4 = 0
        L_0x0029:
            java.lang.Object r0 = kotlin.b.a(r0)
            java.lang.Object r0 = kotlin.Result.m1108constructorimpl(r0)
        L_0x0031:
            java.lang.Throwable r0 = kotlin.Result.m1111exceptionOrNullimpl(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            java.lang.String r1 = "commonExt"
            java.lang.String r2 = "load class error : "
            android.util.Log.e(r1, r2, r0)
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r54.y(java.lang.String):java.lang.Class");
    }

    public static final void z(Uri.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60afb8a", new Object[]{builder, str});
            return;
        }
        ckf.g(builder, "<this>");
        if (str != null) {
            Uri build = builder.build();
            Set<String> queryParameterNames = build.getQueryParameterNames();
            if (queryParameterNames.contains(str)) {
                builder.clearQuery();
                for (String str2 : queryParameterNames) {
                    if (!ckf.b(str2, str)) {
                        builder.appendQueryParameter(str2, build.getQueryParameter(str2));
                    }
                }
            }
        }
    }

    public static final boolean f(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac8ea296", new Object[]{objArr})).booleanValue();
        }
        ckf.g(objArr, "objectArray");
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3512b294", new Object[]{context})).booleanValue();
        }
        ckf.g(context, "<this>");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                return (connectivityManager.getActiveNetworkInfo() == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) ? false : true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
            return false;
        }
    }

    static {
        t2o.a(766509489);
        HandlerThread handlerThread = new HandlerThread("shopAsyncTaskThread");
        handlerThread.start();
        b = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("jsApiThread");
        handlerThread2.start();
        c = new Handler(handlerThread2.getLooper());
    }
}
