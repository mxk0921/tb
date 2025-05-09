package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class af5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, rub> f15707a = new HashMap();

    static {
        t2o.a(156237921);
    }

    public rub a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rub) ipChange.ipc$dispatch("e9af7381", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "linear";
        }
        rub rubVar = (rub) ((HashMap) this.f15707a).get(str);
        if (rubVar == null) {
            return xe5.a(str);
        }
        return rubVar;
    }
}
