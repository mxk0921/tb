package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x15 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final o5e f31069a;
    public final Map<String, Object> b = new HashMap();

    static {
        t2o.a(157286538);
    }

    public x15(o5e o5eVar) {
        this.f31069a = o5eVar;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0e024c", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.b).put(str, obj);
        }
    }

    public <T> T b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("30d39637", new Object[]{this, str});
        }
        return (T) ((HashMap) this.b).get(str);
    }

    public o5e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5e) ipChange.ipc$dispatch("c060d81d", new Object[]{this});
        }
        return this.f31069a;
    }
}
