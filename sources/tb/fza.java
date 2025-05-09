package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.NewRangerOptions;
import java.util.Map;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19643a;

        public a(String str) {
            this.f19643a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qy8.b.i("home_um_ab", "rangerBuckets", this.f19643a);
            }
        }
    }

    static {
        t2o.a(729809139);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a12617d", new Object[0]);
        } else {
            nbq.b("HomePlatform", b());
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b42b47b", new Object[0]);
        }
        return qy8.b.e("home_um_ab", "rangerBuckets", "");
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68e7c08", new Object[]{str});
        } else {
            Coordinator.execute(new a(str));
        }
    }

    public static void d(Object obj, Map<String, Object> map, NewRangerOptions newRangerOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db68746", new Object[]{obj, map, newRangerOptions});
            return;
        }
        if (newRangerOptions == null) {
            try {
                newRangerOptions = new NewRangerOptions();
            } catch (Throwable unused) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject(map);
        String string = jSONObject.getString("rangerBucketsAlias");
        if (!TextUtils.isEmpty(string)) {
            newRangerOptions.rangerBucketsAlias = string;
        }
        String string2 = jSONObject.getString("trackGroup");
        if (!TextUtils.isEmpty(string2)) {
            newRangerOptions.trackGroup = string2;
        }
        String string3 = jSONObject.getString("bizName");
        if (!TextUtils.isEmpty(string3) && !"ranger".equals(string3)) {
            newRangerOptions.bizName = string3;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("commonParams");
        if (jSONObject2 != null) {
            newRangerOptions.commParams = jSONObject2;
        }
        String string4 = jSONObject.getString("ranger_buckets");
        if (!TextUtils.isEmpty(string4)) {
            eza.b().e(obj, string4, newRangerOptions);
            c(string4);
            vxm.b.e().a("home_ranger_buckets", string4);
        }
    }
}
