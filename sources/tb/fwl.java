package tb;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class fwl {
    public static final List<fwl> d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public Object f19580a;
    public gwq b;
    public fwl c;

    public fwl(Object obj, gwq gwqVar) {
        this.f19580a = obj;
        this.b = gwqVar;
    }

    public static fwl a(gwq gwqVar, Object obj) {
        List<fwl> list = d;
        synchronized (list) {
            try {
                int size = ((ArrayList) list).size();
                if (size <= 0) {
                    return new fwl(obj, gwqVar);
                }
                fwl fwlVar = (fwl) ((ArrayList) list).remove(size - 1);
                fwlVar.f19580a = obj;
                fwlVar.b = gwqVar;
                fwlVar.c = null;
                return fwlVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(fwl fwlVar) {
        fwlVar.f19580a = null;
        fwlVar.b = null;
        fwlVar.c = null;
        List<fwl> list = d;
        synchronized (list) {
            if (((ArrayList) list).size() < 10000) {
                ((ArrayList) list).add(fwlVar);
            }
        }
    }
}
