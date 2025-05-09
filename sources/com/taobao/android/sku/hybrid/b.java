package com.taobao.android.sku.hybrid;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.hybrid.a;
import java.util.Map;
import tb.g3q;
import tb.kxf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(442499202);
    }

    public final String a() {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("589b2ea6", new Object[]{this});
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(8, null);
        return "{\"success\":true}";
    }

    public final boolean b(String str) {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a5c6650", new Object[]{this, str})).booleanValue();
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return false;
        }
        g3qVar.a(5, kxf.a(str));
        a2.f9447a.a(1, null);
        return true;
    }

    public final String c() {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d249aa5", new Object[]{this});
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(9, null);
        return "{\"success\":true}";
    }

    public final String e() {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed839612", new Object[]{this});
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        return g3qVar.a(10, null);
    }

    public final String f() {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13b72ddb", new Object[]{this});
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return "{}";
        }
        return g3qVar.a(7, null);
    }

    public final String g(String str) {
        a.C0485a a2;
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa7a0e31", new Object[]{this, str});
        }
        Map<String, String> a3 = kxf.a(str);
        if (a3 == null || a3.isEmpty() || (a2 = a.a()) == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(5, a3);
        return "{\"success\":true}";
    }

    public final String h(String str) {
        a.C0485a a2;
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6127ce3b", new Object[]{this, str});
        }
        if (!"sku".equals(str) || (a2 = a.a()) == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(4, null);
        return "{\"success\":true}";
    }

    public final String i() {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ece53c0c", new Object[]{this});
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(2, null);
        return "{\"success\":true}";
    }

    public final String k() {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c7f260d", new Object[]{this});
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(3, null);
        return "{\"success\":true}";
    }

    public final String l(String str) {
        a.C0485a a2;
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d87d3118", new Object[]{this, str});
        }
        Map<String, String> a3 = kxf.a(str);
        if (a3 == null || a3.isEmpty() || (a2 = a.a()) == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(6, a3);
        return "{\"success\":true}";
    }

    public final String j() {
        g3q g3qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a74c8635", new Object[]{this});
        }
        a.C0485a a2 = a.a();
        if (a2 == null || (g3qVar = a2.f9447a) == null) {
            return "{\"success\":false}";
        }
        g3qVar.a(1, null);
        return "{\"success\":true}";
    }

    public boolean d(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("addParams".equals(str)) {
            wVCallBackContext.success(g(str2));
            return true;
        } else if ("closeView".equals(str)) {
            wVCallBackContext.success(h(str2));
            return true;
        } else if ("updateView".equals(str)) {
            wVCallBackContext.success(l(str2));
            return true;
        } else if ("doBuyNow".equals(str)) {
            wVCallBackContext.success(j());
            return true;
        } else if ("doAddCart".equals(str)) {
            wVCallBackContext.success(i());
            return true;
        } else if ("doConfirm".equals(str)) {
            wVCallBackContext.success(k());
            return true;
        } else if ("doBuy".equals(str)) {
            return b(str2);
        } else {
            if ("getInputData".equals(str)) {
                wVCallBackContext.success(f());
                return true;
            } else if ("clearParams".equals(str)) {
                wVCallBackContext.success(a());
                return true;
            } else if ("downgrade2Native".equals(str)) {
                wVCallBackContext.success(c());
                return true;
            } else {
                if ("getDetail".equals(str)) {
                    wVCallBackContext.success(e());
                    return true;
                }
                return false;
            }
        }
    }
}
