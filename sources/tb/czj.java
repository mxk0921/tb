package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class czj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809833);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c442b8", new Object[0]);
        } else {
            yyj.e().n(Globals.getApplication(), yyj.l(), true);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e96b4e6", new Object[]{str});
        } else {
            yyj.e().B();
        }
    }

    public static void c(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4270be1c", new Object[]{tBLocationDTO});
        } else if (tBLocationDTO != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("location", (Object) tBLocationDTO);
            yyj.e().E(jSONObject);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ba37e1", new Object[0]);
        } else {
            yyj.e().S();
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf879859", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(czh.KEY_PREVIEW_PARAM, (Object) str);
            yyj.e().K(jSONObject);
        }
    }
}
