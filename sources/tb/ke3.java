package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngine;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ke3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ke3 INSTANCE = new ke3();

    /* renamed from: a  reason: collision with root package name */
    public static final String f22609a = "CartWVProcessor";
    public static final Stack<CartVEngine> b = new Stack<>();
    public static final Map<String, Class<? extends mmb>> c;

    @JvmStatic
    public static final boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        CartVEngine cartVEngine;
        kmb g;
        ckf.g(wVCallBackContext, "callback");
        if (str != null && !wsq.a0(str) && str2 != null && !wsq.a0(str2)) {
            String str3 = f22609a;
            try {
                JSONObject parseObject = JSON.parseObject(str2);
                String string = parseObject.getString("type");
                if (string != null) {
                    Map<String, Class<? extends mmb>> map = c;
                    Class cls = (Class) ((LinkedHashMap) map).get(str + '#' + string);
                    if (!(cls == null || (cartVEngine = (CartVEngine) eb3.b(b)) == null || (g = cartVEngine.g()) == null)) {
                        hav.d(str3, "process#".concat(string));
                        String string2 = parseObject.getString("filterItem");
                        if (string2 == null) {
                            string2 = "";
                        }
                        zxb P = g.d();
                        if (P != null) {
                            P.V(string2);
                        }
                        mmb mmbVar = (mmb) cls.newInstance();
                        if (mmbVar != null) {
                            return mmbVar.a(g, parseObject, wVCallBackContext);
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                hav.a(str3, th.getMessage());
            }
        }
        return false;
    }

    @JvmStatic
    public static final void b(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fa2113", new Object[]{cartVEngine});
            return;
        }
        ckf.g(cartVEngine, "engine");
        b.push(cartVEngine);
    }

    @JvmStatic
    public static final void c(CartVEngine cartVEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f0a49a", new Object[]{cartVEngine});
            return;
        }
        ckf.g(cartVEngine, "engine");
        b.remove(cartVEngine);
    }

    static {
        t2o.a(478150683);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c = linkedHashMap;
        linkedHashMap.put(le3.actionType, le3.class);
        linkedHashMap.put(me3.actionType, me3.class);
    }
}
