package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f32871a = new ArrayList();

    static {
        t2o.a(729810264);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5a6334", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", String.valueOf(str));
        tve.c("", null, "1.0", "DOJOAbility", null, hashMap);
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a9005723", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        String e = qy8.b.e("DOJOAbility", "preloadFirstChunkUrl", "");
        if (TextUtils.isEmpty(e)) {
            return arrayList;
        }
        List<String> asList = Arrays.asList(e.split(", "));
        return asList.size() > 30 ? asList.subList(asList.size() - 11, asList.size() - 1) : asList;
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3cdfeb", new Object[]{str});
            return;
        }
        f32871a.add(str);
        a(str);
        e();
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c93d8d", new Object[0]);
        } else {
            qy8.b.i("DOJOAbility", "preloadFirstChunkUrl", TextUtils.join(", ", f32871a));
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd3f170", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (f32871a.isEmpty()) {
            f32871a = b();
        }
        try {
            String a2 = oov.a(str, "spm", "scm", yj4.PARAM_UT_PARAMS, "itemIds", "businessId");
            bqa.d("PreLoadFirstChunkUtil", "targetUrl: " + a2);
            return f32871a.contains(a2);
        } catch (Exception e) {
            bqa.d("PreLoadFirstChunkUtil", "isTriggerPreLoad Exception: " + e);
            return false;
        }
    }
}
