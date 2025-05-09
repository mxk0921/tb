package tb;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837552);
    }

    public static void a(FragmentActivity fragmentActivity, List<rl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923832b7", new Object[]{fragmentActivity, list});
        } else if (list == null) {
            ck.g().e("cacheBuildData,protocolModels is null");
        } else {
            JSONObject b = list.remove(0).b();
            ArrayList arrayList = new ArrayList();
            for (rl rlVar : list) {
                JSONObject b2 = rlVar.b();
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            ck.g().f("cacheBuildData", ck.b.b().i("LightBuy/common").g("info", "cacheBuildData").a());
            cog.f().i(fragmentActivity);
            cog.f().a(fragmentActivity, b, arrayList);
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("403a52f1", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            return Boolean.parseBoolean(((Activity) context).getIntent().getStringExtra("needNativeContainer"));
        }
        return false;
    }
}
