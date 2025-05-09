package tb;

import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ugp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ugp f29364a;

    static {
        t2o.a(763363333);
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12511dce", new Object[]{new Boolean(z)})).booleanValue();
        }
        return rgp.f().g(z);
    }

    public static ugp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ugp) ipChange.ipc$dispatch("1b4a4b31", new Object[0]);
        }
        if (f29364a == null) {
            synchronized (ugp.class) {
                try {
                    if (f29364a == null) {
                        f29364a = new ugp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29364a;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b283daa", new Object[0])).booleanValue();
        }
        return rgp.f().h();
    }

    public boolean d(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b22920f", new Object[]{this, viewStub})).booleanValue();
        }
        return rgp.f().i(viewStub);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93503ee0", new Object[]{this});
        } else {
            rgp.f().j();
        }
    }
}
