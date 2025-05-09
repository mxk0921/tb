package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oh5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f25390a;
    public String b;
    public final Map<Object, Object> c = new HashMap();

    static {
        t2o.a(444597502);
    }

    public boolean a(oh5 oh5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e69f0c1", new Object[]{this, oh5Var})).booleanValue();
        }
        if (oh5Var != null && !TextUtils.isEmpty(this.b) && this.b.equals(oh5Var.b) && this.f25390a == oh5Var.f25390a) {
            return true;
        }
        return false;
    }
}
