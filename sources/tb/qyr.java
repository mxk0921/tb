package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.magic.RuntimeUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class qyr implements l8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f27008a = new AtomicBoolean(false);

    static {
        t2o.a(989855760);
        t2o.a(989855842);
    }

    @Override // tb.l8e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3582982", new Object[]{this})).booleanValue();
        }
        if (!f27008a.compareAndSet(false, true)) {
            return true;
        }
        try {
            return RuntimeUtils.a();
        } catch (Throwable unused) {
            return false;
        }
    }
}
