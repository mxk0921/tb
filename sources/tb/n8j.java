package tb;

import android.net.Uri;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n8j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24570a = false;

    static {
        t2o.a(980418667);
    }

    public static DimensionValueSet a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("c19b201e", new Object[]{str});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("path", str);
        return create;
    }

    public static DimensionSet b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("d17e007d", new Object[0]);
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("path");
        return create;
    }

    public static MeasureValueSet c(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureValueSet) ipChange.ipc$dispatch("49fb9bfe", new Object[]{new Long(j), new Double(d)});
        }
        MeasureValueSet create = MeasureValueSet.create();
        create.setValue("download_wlm", d);
        create.setValue("full_time", j);
        return create;
    }

    public static MeasureSet d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureSet) ipChange.ipc$dispatch("6ddd767d", new Object[0]);
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("download_wlm");
        create.addMeasure("full_time");
        return create;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else if (!f24570a) {
            f24570a = true;
            AppMonitor.register("muise_asr_page", "page", d(), b(), true);
        }
    }

    public static void f(long j, double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55eb157f", new Object[]{new Long(j), new Double(d), str});
            return;
        }
        e();
        AppMonitor.Stat.commit("muise_asr_page", "page", a(str), c(j, d));
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fdab4f", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "MusError");
        hashMap.put("message", str2);
        hashMap.put("type", "error");
        hashMap.put("sampling", "1");
        hashMap.put("native", "1");
        try {
            String uri = Uri.parse(str).toString();
            int indexOf = uri.indexOf(63);
            if (indexOf < 0) {
                indexOf = uri.indexOf(35);
            }
            if (indexOf > 0) {
                uri = uri.substring(0, indexOf);
            }
            try {
                uri = URLEncoder.encode(uri, "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
            hashMap.put("url", uri + "/muise_page_error");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, "/jstracker.3", "", "", hashMap).build());
    }
}
