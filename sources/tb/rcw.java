package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rcw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENABLE_SMALL_WINDOW = "detail3EnableSmallWindow";

    static {
        t2o.a(912262872);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d15919e", new Object[]{str, str2});
        }
        if (str == null && str2 == null) {
            return null;
        }
        return str + "_" + str2;
    }

    public static boolean b(Context context, Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c816d63", new Object[]{context, feature})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean l = l(feature);
        boolean c = c(context);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "canAutoPlay(): " + (currentTimeMillis2 - currentTimeMillis));
        if (!c || !l) {
            return false;
        }
        return true;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90430fb0", new Object[]{context})).booleanValue();
        }
        if (n(context) || !e(context) || !d()) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9687e20e", new Object[0])).booleanValue();
        }
        if (!vbl.D0()) {
            return false;
        }
        boolean z = nj7.a().f26769a == 1;
        tgh.b("VideoUtils", "是否低端机=" + z);
        if (!z || !vbl.E0()) {
            return true;
        }
        tgh.b("VideoUtils", "低端机头图视频默认不播放");
        return false;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d3e5b8", new Object[]{context})).booleanValue();
        }
        return b5m.Q().a(context);
    }

    public static String g(nb4 nb4Var) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2572c874", new Object[]{nb4Var});
        }
        if (nb4Var == null || (f = nb4Var.f()) == null) {
            return null;
        }
        return f.getString("thumbnailUrl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap<String, String> h(bq6 bq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4dd99d6", new Object[]{bq6Var});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (bq6Var != null) {
            Item item = (Item) bq6Var.f(Item.class);
            if (item != null) {
                hashMap.put("item_id", item.getItemId());
            }
            hashMap.put("new_arch_unique_id", bq6Var.k("new_arch_unique_id"));
        }
        return hashMap;
    }

    public static String i(nb4 nb4Var) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("162c7d5b", new Object[]{nb4Var});
        }
        if (nb4Var == null || (f = nb4Var.f()) == null) {
            return null;
        }
        return f.getString("videoId");
    }

    public static String j(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d084b05a", new Object[]{nb4Var});
        }
        if (nb4Var == null) {
            return null;
        }
        return a(k(nb4Var), i(nb4Var));
    }

    public static String k(nb4 nb4Var) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b867b805", new Object[]{nb4Var});
        }
        if (nb4Var == null || (f = nb4Var.f()) == null) {
            return null;
        }
        return f.getString("videoUrl");
    }

    public static boolean l(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6271eaf3", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isDetail3VideoAutoPlay();
    }

    public static boolean m(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f169b73", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isDetail3EnableSmallWindow();
    }

    public static boolean o(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddedb2cf", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isDetail3VideoCompress();
    }

    public static boolean f(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c342f5", new Object[]{ze7Var})).booleanValue();
        }
        if (ze7Var == null) {
            return false;
        }
        Object c = ze7Var.i().c("play_btn_state");
        if (c instanceof Boolean) {
            return ((Boolean) c).booleanValue();
        }
        String g = lg7.g(mr7.d(), "play_btn_state");
        if (!TextUtils.isEmpty(g)) {
            return Boolean.parseBoolean(g);
        }
        return DataUtils.Y((Feature) ze7Var.e().f(Feature.class));
    }

    public static boolean n(Context context) {
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f23c677", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || (data = intent.getData()) == null) {
            return false;
        }
        return "taolive".equalsIgnoreCase(data.getQueryParameter("bizType"));
    }
}
