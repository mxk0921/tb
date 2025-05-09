package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hu9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ou9> f20903a = new CopyOnWriteArrayList();

    static {
        t2o.a(985661620);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5265d32", new Object[]{this, str, str2, str3});
            return;
        }
        synchronized (this) {
            try {
                Iterator it = ((CopyOnWriteArrayList) this.f20903a).iterator();
                while (it.hasNext()) {
                    ((ou9) it.next()).b(str, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924572f9", new Object[]{this, str, str2, str3});
            return;
        }
        synchronized (this) {
            try {
                Iterator it = ((CopyOnWriteArrayList) this.f20903a).iterator();
                while (it.hasNext()) {
                    ((ou9) it.next()).a(str, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
