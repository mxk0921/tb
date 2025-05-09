package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, yl6> f16657a = new ConcurrentHashMap<>();

    static {
        t2o.a(444597881);
        t2o.a(444597882);
    }

    public yl6 a(String str) {
        yl6 yl6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("3a5243f1", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (yl6Var = this.f16657a.get(str)) != null) {
            return yl6Var;
        }
        return null;
    }
}
