package tb;

import androidx.collection.ArraySet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ayl {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16077a = false;
    public final Set<a> b = new ArraySet();
    public final Map<String, jbi> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(float f);
    }

    public void a(String str, float f) {
        if (this.f16077a) {
            HashMap hashMap = (HashMap) this.c;
            jbi jbiVar = (jbi) hashMap.get(str);
            if (jbiVar == null) {
                jbiVar = new jbi();
                hashMap.put(str, jbiVar);
            }
            jbiVar.a(f);
            if (str.equals("__container")) {
                for (a aVar : this.b) {
                    aVar.a(f);
                }
            }
        }
    }

    public void b(boolean z) {
        this.f16077a = z;
    }
}
