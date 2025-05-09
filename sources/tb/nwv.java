package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nwv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG = "guangguang";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f25010a = null;
    public static Handler b;
    public static String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a<T> {
    }

    static {
        t2o.a(503316530);
    }

    public static int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75f953d2", new Object[0])).intValue();
        }
        return View.generateViewId();
    }

    public static void A0(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ac8fa9", new Object[]{runnable, new Long(j)});
            return;
        }
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.postDelayed(runnable, j);
    }

    public static String B(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aedd080e", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = String.valueOf(obj);
        }
        if (TextUtils.isEmpty(str) || str.equals("null")) {
            return null;
        }
        return str;
    }

    public static void B0(n nVar, boolean z, String str, String str2, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed989449", new Object[]{nVar, new Boolean(z), str, str2, drawable});
        } else if (z) {
            if (!TextUtils.isEmpty(I(nVar.H("onloadsuccess"), null))) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", str);
                hashMap.put("finalUrl", str2);
                if (drawable != null) {
                    hashMap.put("width", Integer.valueOf(drawable.getIntrinsicWidth()));
                    hashMap.put("height", Integer.valueOf(drawable.getIntrinsicHeight()));
                }
                nVar.P().o1(0, nVar, "onloadsuccess", null, hashMap, null);
            }
        } else if (!TextUtils.isEmpty(I(nVar.H("onloadfail"), null))) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("url", str);
            hashMap2.put("finalUrl", str2);
            nVar.P().o1(0, nVar, "onloadfail", null, hashMap2, null);
        }
    }

    public static Map C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c44d1918", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
        }
        return hashMap;
    }

    public static Map C0(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e2892340", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        return hashMap;
    }

    public static int D(String str) {
        int indexOf;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77bc6764", new Object[]{str})).intValue();
        }
        int length = str.length();
        while (true) {
            indexOf = str.indexOf("?", i);
            if (indexOf == -1) {
                return -1;
            }
            int i2 = indexOf + 1;
            if (i2 >= length || str.charAt(i2) != '?') {
                break;
            }
            i = indexOf + 2;
        }
        return indexOf;
    }

    public static void D0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df70bf1d", new Object[]{view});
            return;
        }
        try {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        } catch (Exception e) {
            tfs.d(e.getMessage());
        }
    }

    public static String E(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ac47aa", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (indexOf = str.indexOf("?")) != -1 && indexOf < str.length() - 1) {
            for (String str3 : str.substring(indexOf + 1).split("&")) {
                String[] split = str3.split("=");
                if (split.length == 2 && str2.equals(split[0])) {
                    return split[1];
                }
            }
        }
        return null;
    }

    public static String E0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4f52e35", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if ("null".equalsIgnoreCase(valueOf)) {
            return null;
        }
        return valueOf;
    }

    public static Rect F(Object obj, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("a1c4fec5", new Object[]{obj, rect});
        }
        if (obj instanceof String) {
            try {
                String[] split = ((String) obj).split(",");
                return new Rect(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
            } catch (Exception unused) {
            }
        }
        return rect;
    }

    public static String F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e37792a9", new Object[]{str});
        }
        return "asset://" + str;
    }

    public static String[] G(String str, char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3fc72e27", new Object[]{str, new Character(c2)});
        }
        List<String> H = H(str, c2);
        return (String[]) H.toArray(new String[H.size()]);
    }

    public static String G0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83fbb03a", new Object[]{new Integer(i)});
        }
        return "res://" + i;
    }

    public static List<String> H(String str, char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("601d1f08", new Object[]{str, new Character(c2)});
        }
        ArrayList arrayList = new ArrayList(5);
        int i = -1;
        boolean z = true;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c2) {
                if (i2 == 0) {
                    arrayList.add("");
                }
                if (!z) {
                    arrayList.add(str.substring(i, i2));
                    z = true;
                }
            } else {
                if (z) {
                    i = i2;
                }
                if (i2 == str.length() - 1) {
                    arrayList.add(str.substring(i, i2 + 1));
                }
                z = false;
            }
        }
        return arrayList;
    }

    public static String I(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cf3bb6c", new Object[]{obj, str});
        }
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }

    public static String[] J(Object obj, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fcffb999", new Object[]{obj, strArr});
        }
        if (obj instanceof String) {
            return new String[]{(String) obj};
        }
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return strArr;
    }

    public static String K(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fabd254", new Object[]{context});
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.get(0) == null)) {
                    componentName = runningTasks.get(0).topActivity;
                    if (componentName != null) {
                        componentName2 = runningTasks.get(0).topActivity;
                        return componentName2.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object L(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f31a2c40", new Object[]{obj, str});
        }
        List<String> H = H(str, '.');
        int size = H.size();
        for (int i = 0; i < size && obj != null; i++) {
            String str2 = H.get(i);
            Object obj2 = null;
            if (str2.contains("[")) {
                List<String> H2 = H(str2, '[');
                if (obj instanceof Map) {
                    List list = (List) ((Map) obj).get(str2.substring(0, str2.indexOf(91)));
                    for (int i2 = 1; i2 < H2.size(); i2++) {
                        int parseInt = Integer.parseInt(H2.get(i2).substring(0, H2.get(i2).length() - 1));
                        if (list == null || list.isEmpty() || parseInt >= list.size()) {
                            return null;
                        }
                        obj = list.get(parseInt);
                    }
                    obj2 = obj;
                }
            } else if (obj instanceof Map) {
                obj = ((Map) obj).get(str2);
            }
            obj = obj2;
        }
        return obj;
    }

    public static String M(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{context});
        }
        if (c == null) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                str = "";
            }
            c = str;
        }
        return c;
    }

    public static boolean N(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8264b6b0", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            return true;
        }
        return false;
    }

    public static void O(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20340718", new Object[]{context});
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            View currentFocus = ((Activity) context).getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            } else {
                inputMethodManager.hideSoftInputFromWindow(((Activity) context).getWindow().getDecorView().getWindowToken(), 2);
            }
        } catch (Exception e) {
            tfs.d(e.getMessage());
        }
    }

    public static boolean P(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77f4ae6", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.get(0) == null)) {
                    componentName = runningTasks.get(0).topActivity;
                    if (componentName != null) {
                        componentName2 = runningTasks.get(0).topActivity;
                        return TextUtils.equals(componentName2.getPackageName(), context.getPackageName());
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean Q(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f375a1b6", new Object[]{context, windowInsets})).booleanValue();
        }
        return oxq.q(context, windowInsets);
    }

    public static boolean R(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        if (context == null || (context.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74f3c91a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || "''".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6a244f8", new Object[]{str})).booleanValue();
        }
        return S(str);
    }

    public static boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5329127b", new Object[0])).booleanValue();
        }
        String string = o.J().getString(o.J().getResources().getIdentifier("ttid", "string", "com.taobao.taobao"));
        return TextUtils.equals(string, "212200") || TextUtils.equals(string, "36400112278902");
    }

    public static boolean V(o.y yVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72fdcdee", new Object[]{yVar})).booleanValue();
        }
        if (yVar == null || (str = yVar.d) == null) {
            return false;
        }
        if (str.contains("guangguang") || f.k(str)) {
            return true;
        }
        return false;
    }

    public static boolean W(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6230eb63", new Object[]{oVar})).booleanValue();
        }
        if (oVar == null || oVar.d0() == null) {
            return false;
        }
        return V(oVar.d0().c0());
    }

    public static boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean Y(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("870a25f7", new Object[]{nVar})).booleanValue();
        }
        while (nVar != null) {
            n Y = nVar.Y();
            if (Y == null) {
                break;
            } else if ((Y.w0() instanceof ViewPager) && Y.i0(((ViewPager) Y.w0()).getCurrentItem()) != nVar) {
                return false;
            } else {
                nVar = Y;
            }
        }
        return true;
    }

    public static boolean Z(View view) {
        View view2;
        Object instantiateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e09d2c4", new Object[]{view})).booleanValue();
        }
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                int currentItem = viewPager.getCurrentItem();
                PagerAdapter adapter = viewPager.getAdapter();
                if (adapter instanceof TabBarControllerComponent.TabBarControllerPageAdapter) {
                    view2 = ((TabBarControllerComponent.TabBarControllerPageAdapter) adapter).k((ViewGroup) parent, currentItem);
                } else {
                    try {
                        instantiateItem = adapter.instantiateItem((ViewGroup) parent, currentItem);
                    } catch (Exception e) {
                        tfs.d("TabbarController isPrimaryItemAppear:" + e.getMessage());
                    }
                    if (instantiateItem instanceof View) {
                        view2 = (View) instantiateItem;
                    } else {
                        if (instantiateItem instanceof Fragment) {
                            view2 = ((Fragment) instantiateItem).getView();
                        }
                        view2 = null;
                    }
                }
                if (view2 != view) {
                    return false;
                }
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return true;
    }

    public static Uri a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("1a2f94cd", new Object[]{uri, str, str2});
        }
        if (uri == null) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            tfs.f("addUriParameter failed, already has key :" + str + "  value:" + queryParameter);
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter(str, str2);
        Uri build = buildUpon.build();
        tfs.f("addUriParameter success, key :" + str + "  value:" + str2);
        return build;
    }

    public static boolean a0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f71b5ad6", new Object[]{view})).booleanValue();
        }
        if (view != null) {
            return view.getLocalVisibleRect(new Rect());
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9bbef52", new Object[]{str, str2})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str2 == null) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length < split2.length) {
            i = split.length;
        } else {
            i = split2.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (Integer.parseInt(split2[i2]) < Integer.parseInt(split[i2])) {
                return true;
            }
            if (Integer.parseInt(split2[i2]) > Integer.parseInt(split[i2])) {
                return false;
            }
        }
        if (split.length >= split2.length) {
            return true;
        }
        return false;
    }

    public static boolean b0() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfaea77", new Object[0])).booleanValue();
        }
        if (f25010a == null) {
            String e = e();
            if (TextUtils.equals(e, "x86") || TextUtils.equals(e, "x86_64")) {
                z = true;
            }
            f25010a = Boolean.valueOf(z);
        }
        return f25010a.booleanValue();
    }

    public static HashMap<String, String> c(Map map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d6e21fd2", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                str = value.toString();
            } else {
                str = null;
            }
            if (str != null) {
                hashMap.put(entry.getKey().toString(), str);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c0(String str, String str2, a aVar) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c9918a", new Object[]{str, str2, aVar});
            return;
        }
        try {
            try {
                cls = Class.forName(str2, true, nwv.class.getClassLoader());
            } catch (ClassNotFoundException e) {
                tfs.d("loadClass not found:" + e.getMessage());
                cls = null;
            }
            if (aVar != null) {
                ((o.l) aVar).a(cls);
            }
        } catch (Exception e2) {
            tfs.d(e2.getMessage());
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be979674", new Object[]{str});
        }
        if (str != null) {
            return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;");
        }
        return str;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8f6d337", new Object[0]);
        }
        String str = Build.CPU_ABI;
        if (str == null || str.length() == 0 || str.equals("Unknown")) {
            str = "armeabi";
        }
        return str.toLowerCase();
    }

    public static byte[] e0(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("52948315", new Object[]{str, context});
        }
        try {
            return f0(AssetsDelegate.proxy_open(context.getAssets(), str));
        } catch (IOException e) {
            tfs.d("loadFileContent: " + e.getMessage());
            return null;
        }
    }

    public static Map f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d4f33", new Object[]{obj});
        }
        return JSON.parseObject(JSON.toJSONString(obj));
    }

    public static byte[] f0(InputStream inputStream) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b2c68415", new Object[]{inputStream});
        }
        byte[] bArr = null;
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e = e;
                    sb = new StringBuilder("loadInputStream: ");
                    sb.append(e.getMessage());
                    tfs.d(sb.toString());
                    return bArr;
                }
            } catch (IOException e2) {
                tfs.d("loadInputStream: " + e2.getMessage());
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder("loadInputStream: ");
                    sb.append(e.getMessage());
                    tfs.d(sb.toString());
                    return bArr;
                }
            }
            return bArr;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                tfs.d("loadInputStream: " + e4.getMessage());
            }
            throw th;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e04b7a1", new Object[0])).booleanValue();
        }
        return !U();
    }

    public static boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bab82d24", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e3c8781", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static boolean h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beed8cb", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean i(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static Uri i0(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6da7f37", new Object[]{uri, map});
        }
        if (map == null || map.isEmpty()) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!(key == null || value == null)) {
                hashMap.put(key, value);
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return clearQuery.build();
    }

    public static boolean j(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0dd42f8", new Object[]{str, context})).booleanValue();
        }
        try {
            if (AssetsDelegate.proxy_open(context.getAssets(), str) != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            tfs.d("loadFileContent: " + e.getMessage());
            return false;
        }
    }

    public static Map j0(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42ad0ba0", new Object[]{map, map2});
        }
        if (map2 == null) {
            return map;
        }
        if (map == null) {
            return map2;
        }
        map.putAll(map2);
        return map;
    }

    public static Activity k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b8aa660f", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return k(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static Uri k0(Uri uri, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3a9b860b", new Object[]{uri, map});
        }
        tfs.f("mergeUriEncodedParameter ");
        if (uri == null || map == null || map.isEmpty()) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(Uri.encode(str), Uri.encode(uri.getQueryParameter(str)));
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key == null || value == null)) {
                hashMap.put(key.toString(), value.toString());
            }
        }
        String str2 = "";
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (!Utils.isEmpty(key2) && !Utils.isEmpty(value2)) {
                if (Utils.isNotEmpty(str2)) {
                    str2 = str2 + "&";
                }
                str2 = str2 + key2.toString() + "=" + value2.toString();
            }
        }
        return uri.buildUpon().encodedQuery(str2).build();
    }

    public static String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7291e70f", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replaceAll("^((?i)https:)?//", h1p.HTTP_PREFIX);
    }

    public static Uri l0(Uri uri, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("eb286291", new Object[]{uri, map});
        }
        if (akt.r1()) {
            return k0(uri, map);
        }
        if (map == null || map.isEmpty()) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key == null || value == null)) {
                hashMap.put(key.toString(), Uri.decode(value.toString()));
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return clearQuery.build();
    }

    public static JSONArray m(Object obj, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a7de650", new Object[]{obj, jSONArray});
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof String) {
            try {
                return JSON.parseArray((String) obj);
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public static boolean m0(List list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86669eed", new Object[]{list, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (list.size() <= 1 || i < 0 || i2 < 0 || i == i2 || list.size() <= i || list.size() <= i2) {
            return false;
        }
        list.add(i2, list.remove(i));
        return true;
    }

    public static InputStream n(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("2c083445", new Object[]{str, context});
        }
        try {
            return AssetsDelegate.proxy_open(context.getAssets(), str);
        } catch (IOException e) {
            tfs.d("loadFileContent: " + e.getMessage());
            return null;
        }
    }

    public static boolean n0(Context context, String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb286590", new Object[]{context, str, file})).booleanValue();
        }
        InputStream n = n(str, context);
        if (n != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = n.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        n.close();
                        return true;
                    }
                }
            } catch (FileNotFoundException e) {
                tfs.d("moveAssetToFile， path" + str + " " + e.getMessage());
            } catch (IOException e2) {
                tfs.d("moveAssetToFile， path" + str + " " + e2.getMessage());
            }
        }
        return false;
    }

    public static String[] o0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3cc5be6a", new Object[]{str});
        }
        String[] strArr = new String[2];
        String[] G = G(str, f7l.CONDITION_IF_MIDDLE);
        if (G.length > 1) {
            strArr[0] = G[0];
            strArr[1] = G[1];
        } else {
            strArr[0] = null;
            strArr[1] = str;
        }
        return strArr;
    }

    public static double p(Object obj, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df6625bf", new Object[]{obj, new Double(d)})).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public static Rect p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("e8c9f9d1", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return new Rect();
        }
        String[] split = str.split(",");
        if (split == null || split.length != 4) {
            return new Rect();
        }
        return new Rect(t(split[0], 0), t(split[1], 0), t(split[2], 0), t(split[3], 0));
    }

    public static float q(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d175e2a2", new Object[]{obj, new Float(f)})).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public static HashMap q0(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("14024320", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri != null) {
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static float r(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d175ede5", new Object[]{obj, new Integer(i)})).floatValue();
        }
        return q(obj, i);
    }

    public static String r0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b4ecf6a", new Object[]{str});
        }
        if (str != null) {
            return str.replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&").replace("&apos;", "'").replace("&quot;", "\"").replace("&nbsp;", " ").replace("<br/>", "\n");
        }
        return str;
    }

    public static int s(List list, Object obj, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f455b4ff", new Object[]{list, obj, new Boolean(z)})).intValue();
        }
        if (list == null) {
            return -1;
        }
        if (z) {
            for (Object obj2 : list) {
                if (obj == obj2) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        ArrayList arrayList = new ArrayList(1);
        int i2 = 0;
        for (Object obj3 : list) {
            if (obj == null) {
                if (obj3 == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } else if (obj.equals(obj3)) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        int size = arrayList.size();
        if (size == 0) {
            return -1;
        }
        if (size == 1) {
            return ((Integer) arrayList.get(0)).intValue();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (list.get(intValue) == obj) {
                return intValue;
            }
        }
        return ((Integer) arrayList.get(0)).intValue();
    }

    public static boolean s0(List list, n.e<Object> eVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e33beaa", new Object[]{list, eVar})).booleanValue();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (eVar.a(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static int t(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cabe637b", new Object[]{obj, new Integer(i)})).intValue();
        }
        try {
            return u(obj);
        } catch (Exception unused) {
            return i;
        }
    }

    public static Map t0(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("518c121f", new Object[]{map});
        }
        if (map != null) {
            map.remove(null);
            Set<Map.Entry> entrySet = map.entrySet();
            if (entrySet != null) {
                for (Map.Entry entry : entrySet) {
                    if (entry.getValue() instanceof Map) {
                        t0((Map) entry.getValue());
                    }
                }
            }
        }
        return map;
    }

    public static int u(Object obj) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("974020af", new Object[]{obj})).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        throw new IllegalArgumentException("" + obj + " is invalid Integer");
    }

    public static String u0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6b5f1c6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int D = D(str);
        if (D != -1) {
            return str.substring(0, D);
        }
        if (str.indexOf("#") > 0) {
            return str.substring(0, str.indexOf("#"));
        }
        return str;
    }

    public static List v(Object obj, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28dfbb9f", new Object[]{obj, list});
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj instanceof String) {
            try {
                return JSON.parseArray((String) obj);
            } catch (Exception unused) {
            }
        }
        return list;
    }

    public static Uri v0(Uri uri, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ba707c27", new Object[]{uri, list});
        }
        if (sz3.a(list)) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : queryParameterNames) {
            if (!list.contains(str)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return clearQuery.build();
    }

    public static String w(Context context, String str, boolean z) {
        int q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50f31e61", new Object[]{context, str, new Boolean(z)});
        }
        if (j(str.substring(2), context)) {
            return F0(str.substring(2));
        }
        if (!z || (q = s6o.q(context, str)) == 0) {
            return null;
        }
        return G0(q);
    }

    public static Uri w0(Uri uri, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("87e48c9a", new Object[]{uri, str, str2});
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str4 : queryParameterNames) {
            if (str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = uri.getQueryParameter(str4);
            }
            clearQuery.appendQueryParameter(str4, str3);
        }
        return clearQuery.build();
    }

    public static Rect x(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f941cc34", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    public static Uri x0(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d729a7a4", new Object[]{uri, str});
        }
        if (TextUtils.isEmpty(str) || uri == null) {
            return uri;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (!TextUtils.isEmpty(encodedQuery)) {
            str = str + "?" + encodedQuery;
        }
        return Uri.parse(str);
    }

    public static long y(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb4d2df6", new Object[]{obj, new Long(j)})).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public static void y0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b65512", new Object[]{runnable});
            return;
        }
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.post(runnable);
    }

    public static Map z(Object obj, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4978fb51", new Object[]{obj, map});
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof String) {
            try {
                return JSON.parseObject((String) obj);
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static void z0(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f150002", new Object[]{runnable, new Boolean(z)});
        } else if (!z || !X()) {
            if (b == null) {
                b = new Handler(Looper.getMainLooper());
            }
            b.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void H0(File file, String str) {
        Throwable th;
        IOException e;
        StringBuilder sb;
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488be80f", new Object[]{file, str});
            return;
        }
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file, false);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            fileWriter.write(str);
            fileWriter.flush();
            try {
                fileWriter.close();
            } catch (IOException e3) {
                e = e3;
                sb = new StringBuilder("writeStringToFile");
                sb.append(e.getMessage());
                tfs.d(sb.toString());
            }
        } catch (IOException e4) {
            e = e4;
            fileWriter2 = fileWriter;
            tfs.d(e.getMessage());
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException e5) {
                    e = e5;
                    sb = new StringBuilder("writeStringToFile");
                    sb.append(e.getMessage());
                    tfs.d(sb.toString());
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException e6) {
                    tfs.d("writeStringToFile" + e6.getMessage());
                }
            }
            throw th;
        }
    }

    public static String d0(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d80099c0", new Object[]{str, context});
        }
        byte[] e0 = e0(str, context);
        if (e0 == null) {
            return "";
        }
        try {
            return new String(e0, 0, e0.length, "utf-8");
        } catch (UnsupportedEncodingException e) {
            tfs.f("failed to loadFileContent path: " + str + " " + e.getMessage());
            return "";
        }
    }

    public static boolean o(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40eb4e63", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.equalsIgnoreCase("true")) {
                return true;
            }
            if (str.equalsIgnoreCase("false")) {
                return false;
            }
            try {
                return Float.parseFloat((String) obj) > 0.0f;
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return ((Number) obj).floatValue() > 0.0f;
        } else {
            if (obj instanceof List) {
                return ((List) obj).size() > 0;
            }
            if (obj instanceof Map) {
                return ((Map) obj).size() > 0;
            }
        }
        return z;
    }
}
