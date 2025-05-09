package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.expo.O2OExpoCommitter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f22536a = new HashMap();
    public final String b;

    static {
        t2o.a(1019215900);
    }

    public kbk(String str) {
        this.b = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70abe22", new Object[]{this});
        }
        return new O2OExpoCommitter(this.b, this.f22536a).j();
    }

    public kbk b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kbk) ipChange.ipc$dispatch("9e9f99ea", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f22536a).put("namespace", str);
        }
        return this;
    }
}
