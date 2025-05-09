package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAAdamAndroidPluginCenter;
import com.alibaba.android.aura.AURATmgFrontCashierPluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ck;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class um0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, nj> f29486a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29487a;
        public final /* synthetic */ String b;

        public a(boolean z, String str) {
            this.f29487a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vm0.a a2 = vm0.a.a("preInitAura");
            if (this.f29487a) {
                str = "命中aura预热实例";
            } else {
                str = "未命中aura预热实例";
            }
            h15 tag = a2.tag(str);
            if (TextUtils.isEmpty(this.b)) {
                str2 = "";
            } else {
                str2 = this.b;
            }
            vm0.d(tag.indicator("c1", str2).success(this.f29487a).sampling(0.001f));
        }
    }

    static {
        t2o.a(301990025);
    }

    public static nj b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nj) ipChange.ipc$dispatch("1d823b0a", new Object[]{str});
        }
        return (nj) ((HashMap) f29486a).get(str);
    }

    public static void c(String str, nj njVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4db971", new Object[]{str, njVar});
            return;
        }
        Map<String, nj> map = f29486a;
        if (!((HashMap) map).containsKey(str)) {
            ((HashMap) map).put(str, njVar);
        }
    }

    public static List<IAURAPluginCenter> d() {
        ArrayList arrayList = new ArrayList();
        try {
            IpChange ipChange = AURATmgFrontCashierPluginCenter.$ipChange;
            arrayList.add((IAURAPluginCenter) AURATmgFrontCashierPluginCenter.class.newInstance());
        } catch (Throwable th) {
            th.printStackTrace();
            ck.g().e("registerPluginCenter AURATmgFrontCashierPluginCenter failed");
        }
        try {
            IpChange ipChange2 = AURAAdamAndroidPluginCenter.$ipChange;
            arrayList.add((IAURAPluginCenter) AURAAdamAndroidPluginCenter.class.newInstance());
        } catch (Throwable th2) {
            th2.printStackTrace();
            ck.g().e("registerPluginCenter AURAAdamAndroidPluginCenter failed");
        }
        return arrayList;
    }

    public static mj a(Context context, String str, Map<String, Object> map) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj) ipChange.ipc$dispatch("29662bd6", new Object[]{context, str, map});
        }
        mj g = oj.c().g("purchase");
        if (g == null) {
            z = false;
        }
        if (z) {
            lo userContext = g.getUserContext();
            userContext.a(context);
            if (map != null) {
                userContext.i().putAll(map);
            }
        }
        rbb g2 = ck.g();
        if (z) {
            str2 = "[命中]aura预热实例";
        } else {
            str2 = "[未命中]aura预热实例";
        }
        g2.e(str2, ck.b.b().i("AURA/performance").a());
        pav.k(new a(z, str));
        return g;
    }
}
