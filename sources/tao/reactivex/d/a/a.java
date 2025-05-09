package tao.reactivex.d.a;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.b.e;
import tb.oux;
import tb.sng;
import tb.sxx;
import tb.wxx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum a implements sxx {
    DISPOSED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(AtomicReference<sxx> atomicReference) {
        sxx andSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd09be9", new Object[]{atomicReference})).booleanValue();
        }
        sxx sxxVar = atomicReference.get();
        a aVar = DISPOSED;
        if (sxxVar == aVar || (andSet = atomicReference.getAndSet(aVar)) == aVar) {
            return false;
        }
        if (andSet != null) {
            andSet.b_();
        }
        return true;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            oux.a(new e("Disposable already set!"));
        }
    }

    public static boolean d(AtomicReference<sxx> atomicReference, sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec120d8c", new Object[]{atomicReference, sxxVar})).booleanValue();
        }
        if (sng.a(atomicReference, null, sxxVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            sxxVar.b_();
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/a/a");
    }

    public static a valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("c66bb9f", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(a.class, str);
        }
        return (a) valueOf;
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        }
    }

    public static boolean a(AtomicReference<sxx> atomicReference, sxx sxxVar) {
        sxx sxxVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("181d5f09", new Object[]{atomicReference, sxxVar})).booleanValue();
        }
        do {
            sxxVar2 = atomicReference.get();
            if (sxxVar2 == DISPOSED) {
                if (sxxVar != null) {
                    sxxVar.b_();
                }
                return false;
            }
        } while (!sng.a(atomicReference, sxxVar2, sxxVar));
        if (sxxVar2 != null) {
            sxxVar2.b_();
        }
        return true;
    }

    public static boolean b(AtomicReference<sxx> atomicReference, sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96eee8a", new Object[]{atomicReference, sxxVar})).booleanValue();
        }
        wxx.b(sxxVar, "d is null");
        if (sng.a(atomicReference, null, sxxVar)) {
            return true;
        }
        sxxVar.b_();
        if (atomicReference.get() != DISPOSED) {
            c();
        }
        return false;
    }

    public static boolean c(AtomicReference<sxx> atomicReference, sxx sxxVar) {
        sxx sxxVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fac07e0b", new Object[]{atomicReference, sxxVar})).booleanValue();
        }
        do {
            sxxVar2 = atomicReference.get();
            if (sxxVar2 == DISPOSED) {
                if (sxxVar != null) {
                    sxxVar.b_();
                }
                return false;
            }
        } while (!sng.a(atomicReference, sxxVar2, sxxVar));
        return true;
    }

    public static boolean a(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0a041a6", new Object[]{sxxVar})).booleanValue() : sxxVar == DISPOSED;
    }

    public static boolean a(sxx sxxVar, sxx sxxVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc94de2c", new Object[]{sxxVar, sxxVar2})).booleanValue();
        }
        if (sxxVar2 == null) {
            oux.a(new NullPointerException("next is null"));
            return false;
        } else if (sxxVar == null) {
            return true;
        } else {
            sxxVar2.b_();
            c();
            return false;
        }
    }
}
