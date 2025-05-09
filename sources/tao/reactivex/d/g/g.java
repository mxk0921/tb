package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.b.e;
import tb.k4y;
import tb.oux;
import tb.sng;
import tb.tzx;
import tb.wxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum g implements tzx {
    CANCELLED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            oux.a(new e("Subscription already set!"));
        }
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/g/g");
    }

    public static g valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("c697693", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(g.class, str);
        }
        return (g) valueOf;
    }

    @Override // tb.tzx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public static boolean b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66fff", new Object[]{new Long(j)})).booleanValue();
        }
        if (j > 0) {
            return true;
        }
        oux.a(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    @Override // tb.tzx
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        }
    }

    public static void a(AtomicReference<tzx> atomicReference, AtomicLong atomicLong, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae575ae3", new Object[]{atomicReference, atomicLong, new Long(j)});
            return;
        }
        tzx tzxVar = atomicReference.get();
        if (tzxVar != null) {
            tzxVar.a(j);
        } else if (b(j)) {
            k4y.b(atomicLong, j);
            tzx tzxVar2 = atomicReference.get();
            if (tzxVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    tzxVar2.a(andSet);
                }
            }
        }
    }

    public static boolean a(AtomicReference<tzx> atomicReference) {
        tzx andSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd09be9", new Object[]{atomicReference})).booleanValue();
        }
        tzx tzxVar = atomicReference.get();
        g gVar = CANCELLED;
        if (tzxVar == gVar || (andSet = atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (andSet != null) {
            andSet.a();
        }
        return true;
    }

    public static boolean a(AtomicReference<tzx> atomicReference, AtomicLong atomicLong, tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb225986", new Object[]{atomicReference, atomicLong, tzxVar})).booleanValue();
        }
        if (!a(atomicReference, tzxVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet != 0) {
            tzxVar.a(andSet);
        }
        return true;
    }

    public static boolean a(AtomicReference<tzx> atomicReference, tzx tzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("225ae722", new Object[]{atomicReference, tzxVar})).booleanValue();
        }
        wxx.b(tzxVar, "s is null");
        if (sng.a(atomicReference, null, tzxVar)) {
            return true;
        }
        tzxVar.a();
        if (atomicReference.get() != CANCELLED) {
            b();
        }
        return false;
    }

    public static boolean a(tzx tzxVar, tzx tzxVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a25cd8c", new Object[]{tzxVar, tzxVar2})).booleanValue();
        }
        if (tzxVar2 == null) {
            oux.a(new NullPointerException("next is null"));
            return false;
        } else if (tzxVar == null) {
            return true;
        } else {
            tzxVar2.a();
            b();
            return false;
        }
    }
}
