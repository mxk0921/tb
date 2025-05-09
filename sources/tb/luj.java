package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class luj implements d0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile luj b;

    /* renamed from: a  reason: collision with root package name */
    public final List<d0d> f23574a = new ArrayList();

    public static luj c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (luj) ipChange.ipc$dispatch("8cc3eeb9", new Object[0]);
        }
        if (b == null) {
            synchronized (luj.class) {
                try {
                    if (b == null) {
                        b = new luj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // tb.d0d
    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4384fd91", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        Iterator it = ((ArrayList) this.f23574a).iterator();
        while (it.hasNext()) {
            d0d d0dVar = (d0d) it.next();
            if (d0dVar != null) {
                d0dVar.a(str, str2, z);
            }
        }
    }

    public luj b(d0d d0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (luj) ipChange.ipc$dispatch("c44a8f9e", new Object[]{this, d0dVar});
        }
        if (d0dVar != null) {
            ((ArrayList) this.f23574a).add(d0dVar);
        }
        return this;
    }

    public boolean d(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7321761", new Object[]{this, cls})).booleanValue();
        }
        if (cls != null) {
            Iterator it = ((ArrayList) this.f23574a).iterator();
            while (it.hasNext()) {
                d0d d0dVar = (d0d) it.next();
                if (d0dVar != null && d0dVar.getClass() == cls) {
                    it.remove();
                }
            }
        }
        return false;
    }
}
