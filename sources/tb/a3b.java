package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a3b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809147);
    }

    public static int a(DinamicXEngine dinamicXEngine, Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63648b8e", new Object[]{dinamicXEngine, context, new Float(f)})).intValue();
        }
        if (dinamicXEngine == null) {
            return pb6.c(context, f);
        }
        return pb6.d(dinamicXEngine, context, f);
    }

    public static float b(RecyclerView recyclerView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a44bf7dc", new Object[]{recyclerView, view, new Boolean(z)})).floatValue();
        }
        if (!(recyclerView == null || recyclerView.getAdapter() == null || recyclerView.getLayoutManager() == null || view == null)) {
            if (z) {
                view = recyclerView.getLayoutManager().findContainingItemView(view);
            }
            if (view != null && view.getHeight() > 0 && recyclerView.getHeight() > 0) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr);
                recyclerView.getLocationOnScreen(iArr2);
                float f = 1.0f;
                float abs = 1.0f - (((Math.abs(Math.min(0, iArr[1] - iArr2[1])) + Math.max(0, (iArr[1] + view.getHeight()) - (iArr2[1] + recyclerView.getHeight()))) * 1.0f) / view.getHeight());
                if (abs < 0.0f) {
                    abs = 0.0f;
                }
                if (abs <= 1.0f) {
                    f = abs;
                }
                bqa.d("HomePageUtility", "exposeRatio = " + f);
                return f;
            }
        }
        return -1.0f;
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e851326d", new Object[]{str})).longValue();
        }
        try {
            return Long.valueOf(qy8.b.e("homepage_common", "homeBaseCacheTime" + str, "0")).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee748e1", new Object[0]);
        }
        String c = b3b.c();
        if (c.equalsIgnoreCase("main")) {
            return z4a.HOME_MAIN.f32522a;
        }
        if (c.equalsIgnoreCase(i2b.HOMEPAGE_CTAO)) {
            return z4a.HOME_CUN.f32522a;
        }
        if (c.equalsIgnoreCase("old")) {
            return z4a.HOME_OLD.f32522a;
        }
        return z4a.HOME_INTL.f32522a;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e19ee0e", new Object[0]);
        }
        String c = b3b.c();
        if (c.equalsIgnoreCase("main")) {
            return z4a.HOME_MAIN.b;
        }
        if (c.equalsIgnoreCase(i2b.HOMEPAGE_CTAO)) {
            return z4a.HOME_CUN.b;
        }
        if (c.equalsIgnoreCase("old")) {
            return z4a.HOME_OLD.b;
        }
        return z4a.HOME_INTL.b;
    }

    public static float g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4d1036", new Object[]{new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float g = (f * 750.0f) / owo.g(Globals.getApplication());
        double d = g;
        if (d <= 0.005d || g >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public static String h(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65054c35", new Object[]{set});
        }
        String str = null;
        if (set == null || set.isEmpty()) {
            return null;
        }
        for (String str2 : set) {
            if (!TextUtils.equals(str2, yyj.e().f())) {
                if (str2 != null) {
                    return str2;
                }
                str = str2;
            }
        }
        return str;
    }

    public static f0b i(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f0b) ipChange.ipc$dispatch("c97b6886", new Object[]{set});
        }
        return f0b.j(h(set));
    }

    public static Object j(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (obj != null && !TextUtils.isEmpty(str)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt < jSONArray.size()) {
                        return jSONArray.get(parseInt);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static Object k(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc3c19a8", new Object[]{jSONObject, str});
        }
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        Object obj = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            obj = j(obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    public static View l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("84ffc450", new Object[]{layoutInflater, viewGroup});
        }
        try {
            f0b.i().s(f0b.HOME_CREATE_CONTAINER);
            h2b.a().e();
            phg.m("inflateRoot");
            View c = wbo.a().c(layoutInflater, viewGroup);
            phg.l("inflateRoot");
            f0b.i().f(f0b.HOME_CREATE_CONTAINER);
            return c;
        } catch (Throwable th) {
            uqa.b("Performance", "initViewContainer error", th.getMessage());
            String str = "initViewContainer error : " + uqa.c(th);
            bqa.b("HomePageUtility", str, th);
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.JAVA_ONLY).addHeaderInfo("initViewContainer", str);
            if (!cw6.b()) {
                return null;
            }
            throw th;
        }
    }

    public static boolean m(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc1fca09", new Object[]{awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData == null) {
            return true;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
        if (awesomeGetContainerInnerData != null) {
            return awesomeGetContainerInnerData.isCacheData;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = awesomeGetContainerData.delta;
        if (awesomeGetContainerInnerData2 != null) {
            return awesomeGetContainerInnerData2.isCacheData;
        }
        return true;
    }

    public static void n(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc44be65", new Object[]{new Long(j), str});
            return;
        }
        qy8.b.i("homepage_common", "homeBaseCacheTime" + str, j + "");
    }

    public static List<String> d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("55d903e7", new Object[]{new Boolean(z)});
        }
        List<String> e = s5a.e(f());
        if (!z && "main".equals(b3b.c()) && e.size() == 1) {
            e.add(z4a.REC_MAIN.f32522a);
        }
        return e;
    }

    public static boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d33a3002", new Object[]{str})).booleanValue();
        }
        if (str == "true") {
            return true;
        }
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 1) {
            char charAt = str.charAt(0);
            return charAt == 'Y' || charAt == 'y';
        } else if (length != 2) {
            if (length == 3) {
                char charAt2 = str.charAt(0);
                if (charAt2 == 'y') {
                    if (str.charAt(1) == 'e' || str.charAt(1) == 'E') {
                        return str.charAt(2) == 's' || str.charAt(2) == 'S';
                    }
                    return false;
                } else if (charAt2 == 'Y') {
                    if (str.charAt(1) == 'E' || str.charAt(1) == 'e') {
                        return str.charAt(2) == 'S' || str.charAt(2) == 's';
                    }
                    return false;
                }
            } else if (length != 4) {
                return false;
            }
            char charAt3 = str.charAt(0);
            if (charAt3 == 't') {
                if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
                    return false;
                }
                if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
                    return str.charAt(3) == 'e' || str.charAt(3) == 'E';
                }
                return false;
            } else if (charAt3 != 'T') {
                return false;
            } else {
                if (str.charAt(1) != 'R' && str.charAt(1) != 'r') {
                    return false;
                }
                if (str.charAt(2) == 'U' || str.charAt(2) == 'u') {
                    return str.charAt(3) == 'E' || str.charAt(3) == 'e';
                }
                return false;
            }
        } else {
            char charAt4 = str.charAt(0);
            char charAt5 = str.charAt(1);
            if (charAt4 == 'o' || charAt4 == 'O') {
                return charAt5 == 'n' || charAt5 == 'N';
            }
            return false;
        }
    }
}
