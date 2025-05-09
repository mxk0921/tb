package tb;

import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class nzh {
    public static final nzh INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f25046a = o3r.f("kotlinx.coroutines.fast.service.loader", true);
    public static final fzh dispatcher;

    static {
        nzh nzhVar = new nzh();
        INSTANCE = nzhVar;
        dispatcher = nzhVar.a();
    }

    public final fzh a() {
        List<lzh> list;
        Object obj;
        try {
            if (f25046a) {
                list = j19.INSTANCE.c();
            } else {
                list = dcp.y(acp.d(mzh.a()));
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    ((lzh) obj).getClass();
                    do {
                        ((lzh) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            lzh lzhVar = (lzh) obj;
            if (lzhVar != null) {
                return ozh.e(lzhVar, list);
            }
            return ozh.b(null, null, 3, null);
        } catch (Throwable th) {
            return ozh.b(th, null, 2, null);
        }
    }
}
