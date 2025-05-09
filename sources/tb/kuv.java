package tb;

import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kuv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, b> f22940a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f22941a;
        public final List<tb.a> b;

        static {
            t2o.a(335544332);
        }

        public b() {
            this.b = new ArrayList();
        }
    }

    static {
        t2o.a(335544330);
    }

    public static boolean a(tb.a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b73e72e6", new Object[]{aVar, bVar})).booleanValue();
        }
        if (aVar == null || bVar == null) {
            return false;
        }
        if (aVar.a() == 65536) {
            return true;
        }
        if (bVar.f22941a <= 0) {
            return false;
        }
        ArrayList arrayList = (ArrayList) bVar.b;
        if (arrayList.size() < 2) {
            return false;
        }
        tb.a aVar2 = (tb.a) arrayList.get(arrayList.size() - 2);
        if (aVar.a() == 0 && aVar2.a() == 0) {
            return true;
        }
        return false;
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157ea7da", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, str2, null, null, map).build());
        }
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a51144", new Object[]{str, str2, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, map).build());
        }
    }

    public static void d(tb.a aVar) {
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8e1426", new Object[]{aVar});
        } else if (aVar != null && (d = aVar.d()) != null) {
            String valueOf = String.valueOf(d.hashCode());
            HashMap hashMap = (HashMap) f22940a;
            b bVar = (b) hashMap.get(valueOf);
            if (bVar == null) {
                bVar = new b();
                hashMap.put(valueOf, bVar);
            }
            ((ArrayList) bVar.b).add(aVar);
            Map<String, String> b2 = aVar.b();
            if (aVar.a() == 32768) {
                Log.e("A11yUserTrackUtils", "focused");
                c("a11y_image", "image_recognition_focus", b2);
                bVar.f22941a = aVar.c();
            } else if (a(aVar, bVar)) {
                Log.e("A11yUserTrackUtils", "focus clear");
                long currentTimeMillis = System.currentTimeMillis() - bVar.f22941a;
                Log.e("A11yUserTrackUtils", "focused time is " + currentTimeMillis);
                b2.put("focus_time", String.valueOf(currentTimeMillis));
                b("a11y_image", "image_focus_time", b2);
                hashMap.remove(valueOf);
            }
        }
    }
}
