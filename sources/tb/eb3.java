package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class eb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199474);
    }

    public static final DXTemplateItem a(JSONObject jSONObject) {
        String string;
        String string2;
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("1afee352", new Object[]{jSONObject});
        }
        if (jSONObject == null || (string = jSONObject.getString("name")) == null || (string2 = jSONObject.getString("version")) == null || (o = ssq.o(string2)) == null) {
            return null;
        }
        long longValue = o.longValue();
        String string3 = jSONObject.getString("url");
        if (string3 == null) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = string;
        dXTemplateItem.b = longValue;
        dXTemplateItem.c = string3;
        return dXTemplateItem;
    }

    public static final <E> E b(Stack<E> stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("eb8f3308", new Object[]{stack});
        }
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return stack.peek();
    }
}
