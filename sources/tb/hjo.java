package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static hjo f20685a;

    static {
        t2o.a(444596922);
    }

    public static hjo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hjo) ipChange.ipc$dispatch("9259977a", new Object[0]);
        }
        if (f20685a == null) {
            synchronized (hjo.class) {
                try {
                    if (f20685a == null) {
                        f20685a = new hjo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20685a;
    }

    public void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b987ae7", new Object[]{this, fVar, new Boolean(z)});
        }
    }

    public void b(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae81a7af", new Object[]{this, new Integer(i), str, str2, str3, dXTemplateItem, new Double(d)});
        }
    }

    public void d(vj8 vj8Var, wj8 wj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19852b8b", new Object[]{this, vj8Var, wj8Var});
        }
    }

    public void e(vj8 vj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90e73c7", new Object[]{this, vj8Var});
        }
    }
}
