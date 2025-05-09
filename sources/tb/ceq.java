package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ceq {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Object> f17017a;

    public ceq(int i) {
        this.f17017a = new ArrayList<>(i);
    }

    public void a(Object obj) {
        this.f17017a.add(obj);
    }

    public void b(Object obj) {
        if (obj != null) {
            boolean z = obj instanceof Object[];
            ArrayList<Object> arrayList = this.f17017a;
            if (z) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                }
            } else if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    arrayList.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public int c() {
        return this.f17017a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f17017a.toArray(objArr);
    }
}
