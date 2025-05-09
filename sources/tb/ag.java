package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ag {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_KEY_BIZ_CODE = "AURA-BizCode";
    public static final String ARG_KEY_BRANCH = "AURA-Branch";
    public static final String ARG_KEY_BRANCH_CONDITION = "AURA-Branch-Condition";
    public static final String ARG_KEY_DOMAIN = "AURA-Domain";
    public static final String ARG_KEY_EXTENSION = "AURA-Extension";
    public static final String ARG_KEY_EXTENSION_METHOD = "AURA-Extension-Method";
    public static final String ARG_KEY_FLOW = "AURA-Flow";
    public static final String ARG_KEY_SERVICE = "AURA-Service";
    public static final String ARG_KEY_TAG = "AURA-TAG";

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Object> f15720a = new HashMap<>();

    static {
        t2o.a(79691905);
        t2o.a(79691906);
    }

    public final void a(StringBuilder sb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7f896d", new Object[]{this, sb, str});
            return;
        }
        Object remove = this.f15720a.remove(str);
        if (remove != null) {
            sb.append("[");
            sb.append(remove);
            sb.append("]");
        }
    }

    public ag b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ag) ipChange.ipc$dispatch("bb62bc0d", new Object[]{this, str, obj});
        }
        if (!(str == null || obj == null)) {
            this.f15720a.put(str, obj);
        }
        return this;
    }

    public ag c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ag) ipChange.ipc$dispatch("4d6bebd0", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f15720a.put(ARG_KEY_DOMAIN, str);
        return this;
    }

    public ag d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ag) ipChange.ipc$dispatch("20da40c7", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f15720a.put(ARG_KEY_FLOW, str);
        return this;
    }

    public HashMap<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4aa26f3d", new Object[]{this});
        }
        return this.f15720a;
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37b458e0", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) this.f15720a.get(str);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return (String) this.f15720a.get(ARG_KEY_DOMAIN);
    }

    public ag h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ag) ipChange.ipc$dispatch("b818604e", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f15720a.put(ARG_KEY_SERVICE, str);
        return this;
    }

    public ag i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ag) ipChange.ipc$dispatch("f53895a6", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f15720a.put(ARG_KEY_TAG, str);
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (bh.b(this.f15720a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        a(sb, ARG_KEY_TAG);
        a(sb, ARG_KEY_BIZ_CODE);
        a(sb, ARG_KEY_DOMAIN);
        a(sb, ARG_KEY_BRANCH);
        a(sb, ARG_KEY_BRANCH_CONDITION);
        a(sb, ARG_KEY_FLOW);
        a(sb, ARG_KEY_SERVICE);
        a(sb, ARG_KEY_EXTENSION);
        a(sb, ARG_KEY_EXTENSION_METHOD);
        for (Map.Entry<String, Object> entry : this.f15720a.entrySet()) {
            sb.append("[");
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append("]");
        }
        return sb.toString();
    }
}
