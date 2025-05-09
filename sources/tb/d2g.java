package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fic;
import tb.h2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d2g<T extends fic, C extends h2g<C>> extends f2g<C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f17522a;

    static {
        t2o.a(1002438665);
        t2o.a(1002438658);
    }

    public d2g(C c) {
        super(c);
    }

    public static /* synthetic */ Object ipc$super(d2g d2gVar, String str, Object... objArr) {
        if (str.hashCode() == 2024047597) {
            super.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/arch/kernel/component/behavior/KernelBehaviorComponent");
    }

    @Override // tb.f2g
    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcab972", new Object[]{this, c});
        }
    }

    @Override // tb.f2g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        } else {
            super.f();
        }
    }

    public final T e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((fic) ipChange.ipc$dispatch("20b7c034", new Object[]{this}));
        }
        return this.f17522a;
    }

    @Override // tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        this.f17522a = null;
        super.f();
    }

    public final void g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66152298", new Object[]{this, t});
        } else {
            this.f17522a = t;
        }
    }
}
