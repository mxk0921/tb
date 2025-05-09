package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20254a;
    public final Map<String, wc5> b;

    static {
        t2o.a(444596672);
    }

    public gv5(String str, int i) {
        this.f20254a = str;
        this.b = new HashMap(i);
    }

    public void a(String str, wc5 wc5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a207a4e8", new Object[]{this, str, wc5Var});
        } else {
            ((HashMap) this.b).put(str, wc5Var);
        }
    }

    public wc5 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wc5) ipChange.ipc$dispatch("5da0c533", new Object[]{this, str});
        }
        return (wc5) ((HashMap) this.b).get(str);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f20254a;
    }
}
