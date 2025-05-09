package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kbz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f22554a;

    static {
        t2o.a(729809551);
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d13a6b8", new Object[]{new Long(j)});
        } else {
            slp.g("locationPopLastShowTime", j);
        }
    }

    public static void b(jbz jbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f065a8", new Object[]{jbzVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lastShowTime", (Object) Long.valueOf(jbzVar.f21908a));
        jSONObject.put("count", (Object) Integer.valueOf(jbzVar.b + 1));
        slp.e("locationLastShowInfo", jSONObject.toJSONString());
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb38efad", new Object[0]);
        }
        return slp.c("locationLastShowInfo", "");
    }

    public static jbz d(long j, jbz jbzVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jbz) ipChange.ipc$dispatch("6cfd9ff7", new Object[]{new Long(j), jbzVar});
        }
        if (System.currentTimeMillis() - slp.f("locationPopLastShowTime", 0L) <= j) {
            z = false;
        }
        jbzVar.d = z;
        return jbzVar;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1bdd62b", new Object[0])).booleanValue();
        }
        if (f22554a == null) {
            f22554a = Boolean.valueOf(f4b.b("openNewChangeLocationSite", true));
            sfh.d("LocationSwitcherUtils", " getOpenNewChangeLocationSiteSwitch  " + f22554a);
        }
        return f22554a.booleanValue();
    }
}
