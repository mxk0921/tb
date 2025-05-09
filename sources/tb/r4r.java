package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r4r implements j8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CAN_ESCAPE = "canEscape";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_METHOD = "method";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_QUERY_PARAMS = "queryParams";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_POPLAYER = "PopLayer";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, khc> f27098a;

    static {
        t2o.a(786432055);
        t2o.a(336592914);
    }

    public r4r() {
        HashMap hashMap = new HashMap();
        this.f27098a = hashMap;
        hashMap.put("H5", new xxf());
        hashMap.put("Native", new byf());
        hashMap.put("PopLayer", new cyf());
        hashMap.put("Weex", new fyf());
    }

    @Override // tb.j8
    public c8 a(Context context, n8 n8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("12417a06", new Object[]{this, context, n8Var});
        }
        if (n8Var != null) {
            String i = n8Var.i("type");
            String i2 = n8Var.i("url");
            String i3 = n8Var.i("method");
            JSONObject g = n8Var.g("queryParams");
            String i4 = n8Var.i(KEY_CAN_ESCAPE);
            if (g != null) {
                i2 = hp6.b(i2, g);
            }
            JSONObject g2 = n8Var.g("params");
            if (TextUtils.isEmpty(i)) {
                i = "H5";
            }
            if (i2 == null) {
                return new b8(new a8(10006, "TAKOpenUrlAbilityImpl miss url"), false);
            }
            khc khcVar = (khc) ((HashMap) this.f27098a).get(i);
            if (khcVar != null) {
                khcVar.a(context, i2, g2, i3, i4);
            }
        }
        return new f8();
    }
}
