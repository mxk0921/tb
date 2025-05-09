package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class it4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, su> f21562a;
    public final su b = new ehq();

    static {
        t2o.a(993001771);
    }

    public it4() {
        HashMap hashMap = new HashMap();
        this.f21562a = hashMap;
        hashMap.put("standard", new ehq());
    }

    public su a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (su) ipChange.ipc$dispatch("fb0d5ab1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.b;
        }
        su suVar = (su) ((HashMap) this.f21562a).get(str);
        if (suVar == null) {
            return this.b;
        }
        return suVar;
    }

    public void b(String str, su suVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdf11a5", new Object[]{this, str, suVar});
        } else {
            ((HashMap) this.f21562a).put(str, suVar);
        }
    }
}
