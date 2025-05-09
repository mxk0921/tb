package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dtf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Class<? extends chc>> f18054a = new HashMap();

    static {
        t2o.a(995098628);
    }

    public Class<? extends chc> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5f57021a", new Object[]{this, str});
        }
        return (Class) ((HashMap) this.f18054a).get(str);
    }

    public void b(String str, Class<? extends chc> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab2e4d3", new Object[]{this, str, cls});
        } else if (!TextUtils.isEmpty(str) && cls != null) {
            ((HashMap) this.f18054a).put(str, cls);
        }
    }
}
