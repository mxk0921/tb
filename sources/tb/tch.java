package tb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class tch<E> {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(tch.class, Object.class, "a");
    @Volatile

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f28632a;

    public tch(boolean z) {
        this.f28632a = new uch(8, z);
    }

    public final boolean a(E e) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            uch uchVar = (uch) atomicReferenceFieldUpdater.get(this);
            int a2 = uchVar.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                h30.a(atomicReferenceFieldUpdater, this, uchVar, uchVar.i());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            uch uchVar = (uch) atomicReferenceFieldUpdater.get(this);
            if (!uchVar.d()) {
                h30.a(atomicReferenceFieldUpdater, this, uchVar, uchVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((uch) b.get(this)).f();
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            uch uchVar = (uch) atomicReferenceFieldUpdater.get(this);
            E e = (E) uchVar.j();
            if (e != uch.REMOVE_FROZEN) {
                return e;
            }
            h30.a(atomicReferenceFieldUpdater, this, uchVar, uchVar.i());
        }
    }
}
