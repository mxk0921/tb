package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class b5h extends bmi {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(689963247);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final b5h a(Map<Object, ? extends Object> map, Map<Object, ? extends Object> map2, long j, String str, String str2, bmi.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b5h) ipChange.ipc$dispatch("1550dbe8", new Object[]{this, map, map2, new Long(j), str, str2, aVar});
            }
            ckf.g(str, "sender");
            ckf.g(str2, bmi.KEY_RECEIVER);
            vgh.c(this, "LiveTabMessage", "解析直播Tab消息实体，timestamp=" + j + "，sender=" + str + "，receiver=" + str2);
            if ((ckf.b(str, "Interact") && ckf.b(str2, "Interact")) || (!ckf.b(str, "Interact") && !ckf.b(str2, "Interact"))) {
                return null;
            }
            Object obj = map != null ? map.get("type") : null;
            if (TextUtils.isEmpty(String.valueOf(obj))) {
                vgh.c(this, "LiveTabMessage", "解析直播Tab消息实体，type为空，返回空");
                return null;
            }
            String str3 = "LIVEMSG_" + obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "msg", (String) map);
            if (map2 != null) {
                jSONObject.put((JSONObject) "params", (String) map2);
            }
            return new b5h(str3, jSONObject, j, str, str2, aVar, null);
        }
    }

    static {
        t2o.a(689963246);
    }

    public /* synthetic */ b5h(String str, JSONObject jSONObject, long j, String str2, String str3, bmi.a aVar, a07 a07Var) {
        this(str, jSONObject, j, str2, str3, aVar);
    }

    public b5h(String str, JSONObject jSONObject, long j, String str2, String str3, bmi.a aVar) {
        super(str, jSONObject, j, str2, str3, aVar);
    }
}
