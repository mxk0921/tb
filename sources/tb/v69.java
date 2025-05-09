package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class v69 extends NetConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            OrangeConfig.getInstance().getConfigs("image_search");
            agh.a("FestivalNetConfig", "on update");
            v69.a(v69.this);
        }
    }

    static {
        t2o.a(482344984);
    }

    public v69() {
        a aVar = new a();
        OrangeConfig.getInstance().getConfigs("image_search");
        OrangeConfig.getInstance().registerListener(new String[]{"image_search"}, aVar, true);
        b();
    }

    public static /* synthetic */ void a(v69 v69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae2a396", new Object[]{v69Var});
        } else {
            v69Var.b();
        }
    }

    public static /* synthetic */ Object ipc$super(v69 v69Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/nn/festival/FestivalNetConfig");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d064a7b1", new Object[]{this});
            return;
        }
        String e2 = lg4.e2("opt_detect_error_hint", "");
        try {
            if (!TextUtils.isEmpty(e2)) {
                JSONObject jSONObject = new JSONObject(e2);
                String string = jSONObject.getString("blur_ratio");
                if (!TextUtils.isEmpty(string)) {
                    Float.parseFloat(string);
                }
                String string2 = jSONObject.getString("blur_conf");
                if (!TextUtils.isEmpty(string2)) {
                    Float.parseFloat(string2);
                }
                String string3 = jSONObject.getString("undersize_ratio");
                if (!TextUtils.isEmpty(string3)) {
                    Float.parseFloat(string3);
                }
            }
        } catch (Exception e) {
            agh.c("FestivalNetConfig", "error: " + e.toString());
        }
    }
}
