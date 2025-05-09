package kotlinx.coroutines;

import kotlin.coroutines.d;
import tb.a07;
import tb.ckf;
import tb.en9;
import tb.upt;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class d extends kotlin.coroutines.a implements upt<String> {
    public static final a Key = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f15259a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements d.c<d> {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public d(long j) {
        super(Key);
        this.f15259a = j;
    }

    public final long N0() {
        return this.f15259a;
    }

    /* renamed from: O0 */
    public void g(kotlin.coroutines.d dVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: P0 */
    public String M0(kotlin.coroutines.d dVar) {
        e eVar = (e) dVar.get(e.Key);
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int e0 = wsq.e0(name, " @", 0, false, 6, null);
        if (e0 < 0) {
            e0 = name.length();
        }
        StringBuilder sb = new StringBuilder(e0 + 19);
        String substring = name.substring(0, e0);
        ckf.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @coroutine#");
        sb.append(this.f15259a);
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f15259a == ((d) obj).f15259a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return en9.a(this.f15259a);
    }

    public String toString() {
        return "CoroutineId(" + this.f15259a + ')';
    }
}
