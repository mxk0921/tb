package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class hwh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hwh INSTANCE = new hwh();

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedList<nx> f20927a = new LinkedList<>();

    static {
        t2o.a(993002164);
        new HashMap();
    }

    public final boolean b(Uri uri, zsm zsmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db1eb1ed", new Object[]{this, uri, zsmVar})).booleanValue();
        }
        ckf.g(uri, "data");
        ckf.g(zsmVar, "preloadTask");
        return mox.e().h(uri.toString(), zsmVar.a(), zsmVar.d(), zsmVar.b(), zsmVar.c(), null, false);
    }

    public final void c(nx nxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefb26db", new Object[]{this, nxVar});
            return;
        }
        ckf.g(nxVar, "handler");
        f20927a.add(nxVar);
    }

    public final boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("756b13b", new Object[]{this, uri})).booleanValue();
        }
        ckf.g(uri, "data");
        Iterator<nx> it = f20927a.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            nx next = it.next();
            ckf.f(next, "next(...)");
            nx nxVar = next;
            if (nxVar.g(uri)) {
                return b(uri, nxVar.d());
            }
        }
        return false;
    }
}
