package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zm8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1022362004);
    }

    public static final Map<?, ?> a(Object obj) {
        ExecuteResult executeResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d569c42", new Object[]{obj});
        }
        ckf.g(obj, "<this>");
        if (obj instanceof ExecuteResult) {
            executeResult = (ExecuteResult) obj;
        } else {
            executeResult = null;
        }
        if (executeResult != null) {
            return executeResult.getData();
        }
        return null;
    }

    public static final void b(Object obj, u1a<? super String, ? super Map<?, ?>, xhv> u1aVar, g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc44b6", new Object[]{obj, u1aVar, g1aVar});
            return;
        }
        ckf.g(obj, "<this>");
        String str = null;
        ExecuteResult executeResult = obj instanceof ExecuteResult ? (ExecuteResult) obj : null;
        if (executeResult != null && !executeResult.isNone()) {
            String str2 = "";
            if (executeResult.isSuccess()) {
                Map<String, Object> data = executeResult.getData();
                if (data == null) {
                    data = a.h();
                }
                String modType = executeResult.getModType();
                if (modType != null) {
                    str2 = modType;
                }
                if (u1aVar != null) {
                    u1aVar.invoke(str2, data);
                }
            } else if (executeResult.isFailure()) {
                Map<String, Object> formattedData = executeResult.toFormattedData();
                ckf.f(formattedData, "toFormattedData(...)");
                Object obj2 = formattedData.get("code");
                String str3 = obj2 instanceof String ? (String) obj2 : null;
                if (str3 == null) {
                    str3 = str2;
                }
                Object obj3 = formattedData.get("msg");
                if (obj3 instanceof String) {
                    str = (String) obj3;
                }
                if (str != null) {
                    str2 = str;
                }
                if (g1aVar != null) {
                    g1aVar.invoke(new bi8(str3, str2));
                }
            }
        }
    }

    public static /* synthetic */ void c(Object obj, u1a u1aVar, g1a g1aVar, int i, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb78aac", new Object[]{obj, u1aVar, g1aVar, new Integer(i), obj2});
            return;
        }
        if ((i & 1) != 0) {
            u1aVar = null;
        }
        if ((i & 2) != 0) {
            g1aVar = null;
        }
        b(obj, u1aVar, g1aVar);
    }
}
