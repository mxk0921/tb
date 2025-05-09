package tb;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.o2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class atx extends o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<o2.a> f16002a = new CopyOnWriteArrayList();

    public static void a() {
        Iterator it = ((CopyOnWriteArrayList) f16002a).iterator();
        while (it.hasNext()) {
            ((o2.a) it.next()).onFinish();
        }
    }
}
