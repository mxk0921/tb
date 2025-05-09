package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f28848a = new AtomicBoolean(false);

    static {
        t2o.a(775946354);
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e4ed3b", new Object[]{new Integer(i)});
        } else if (f28848a.compareAndSet(false, true)) {
            vxm.b.e().a(TBMainActivity.KEY_APM_MAIN_INDEX, Integer.valueOf(i));
        }
    }
}
