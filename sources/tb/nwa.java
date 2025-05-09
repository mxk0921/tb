package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static nwa c;

    /* renamed from: a  reason: collision with root package name */
    public String f24989a = null;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(cba cbaVar, Object obj, String str);

        String b();

        void c(cba cbaVar, Object obj);

        void d(String str);

        void e(cba cbaVar, Object obj);

        boolean f(Context context);

        boolean g();

        String getLiveAndHomeMixSpm();

        void h(ux9 ux9Var, Object obj);

        void i(ux9 ux9Var, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap);

        void j(cba cbaVar);

        void showShare(Activity activity, boolean z, Map<String, String> map);
    }

    static {
        t2o.a(779092494);
    }

    public static nwa a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwa) ipChange.ipc$dispatch("240a6edb", new Object[]{ux9Var});
        }
        if (owa.b(ux9Var)) {
            return owa.a(ux9Var).a();
        }
        HashMap hashMap = new HashMap();
        if (ux9Var != null) {
            hashMap.put("frameContext", String.valueOf(ux9Var.hashCode()));
        }
        sbu.i(ux9Var, 19999, "highlight_adapter_refactor", hashMap);
        return b();
    }

    public static nwa b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwa) ipChange.ipc$dispatch("b74ba4a8", new Object[0]);
        }
        if (c == null) {
            synchronized (nwa.class) {
                try {
                    if (c == null) {
                        c = new nwa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("77a123cf", new Object[]{this});
        }
        return this.b;
    }

    public void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f63e59", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }
}
