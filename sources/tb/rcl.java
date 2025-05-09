package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.login4android.api.Login;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rcl INSTANCE = new rcl();

    /* renamed from: a */
    public static boolean f27277a = true;
    public static final List<String> b = yz3.l("waitConfirm", "waitSend", "all", "waitPay");

    public static /* synthetic */ void c(ViewEngine viewEngine, boolean z, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6c0094", new Object[]{viewEngine, new Boolean(z), jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        a(viewEngine, z, jSONObject);
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("910597f2", new Object[]{this});
        }
        m9v d = m9v.d("order_list");
        ckf.f(d, "UltronMMKV.get(\"order_list\")");
        String userId = Login.getUserId();
        if (userId != null) {
            Iterator<String> it = b.iterator();
            String str = null;
            while (it.hasNext()) {
                str = d.l(userId + it.next());
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
            }
            if (str != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject = JSON.parseObject(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (jSONObject != null) {
                    return jSONObject;
                }
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final void a(ViewEngine viewEngine, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        jo7 Q;
        s b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e9c0ce", new Object[]{viewEngine, new Boolean(z), jSONObject});
        } else if (f27277a && uel.l("preDownloadTemplates", true)) {
            hav.d("OrderDXPreDownloader", "preDownloadTemplates start");
            if (jSONObject == null) {
                jSONObject = INSTANCE.b();
            }
            if (jSONObject != null) {
                try {
                    jSONObject2 = jSONObject.getJSONObject("container");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray("data")) != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put((JSONObject) gbv.PARAM_KEY_IMMEDIATE_DX_DOWNLOAD_LIST, (String) jSONArray);
                    if (!(viewEngine == null || (Q = viewEngine.Q()) == null || (b2 = Q.b()) == null)) {
                        jSONObject3.put((JSONObject) gbv.PARAM_KEY_DX_ENGINE, (String) b2);
                    }
                    if (z) {
                        qbv.j().a(UltronTradeHybridStage.ON_CONTAINER_CREATE, "mytaobao", jSONObject3);
                    } else {
                        qbv.j().a(UltronTradeHybridStage.ON_NAV, "orderList", jSONObject3);
                    }
                    f27277a = false;
                    hav.d("OrderDXPreDownloader", "preDownloadTemplates end");
                }
            }
        }
    }

    static {
        t2o.a(614465731);
    }
}
