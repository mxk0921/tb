package tb;

import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uo2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f29524a;

    static {
        t2o.a(729808969);
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a59c18f", new Object[]{this});
        }
        if (f29524a == null) {
            f29524a = b();
        }
        return f29524a;
    }

    public final List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9444dd37", new Object[]{this});
        }
        return new ArrayList(Arrays.asList(f4b.h("bxFeatureWhiteList", Constant.KEY_PAGEBACK).split(",")));
    }
}
