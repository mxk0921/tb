package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ctz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<hhz> f17323a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737462);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final ctz a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ctz) ipChange.ipc$dispatch("7ddd55c6", new Object[]{this});
            }
            return new ctz(null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737461);
    }

    public /* synthetic */ ctz(a07 a07Var) {
        this();
    }

    public final void a(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8276abfe", new Object[]{this, hhzVar});
            return;
        }
        ckf.g(hhzVar, "variable");
        ((ArrayList) this.f17323a).add(hhzVar);
    }

    public final void b(List<? extends hhz> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6cbcb8", new Object[]{this, list});
            return;
        }
        ckf.g(list, "newVariables");
        ((ArrayList) this.f17323a).addAll(list);
    }

    public final hhz c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("47df81dc", new Object[]{this, new Integer(i)});
        }
        if (i >= ((ArrayList) this.f17323a).size()) {
            return hhz.Companion.m();
        }
        return (hhz) ((ArrayList) this.f17323a).get(i);
    }

    public final List<hhz> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5c741c5a", new Object[]{this});
        }
        return this.f17323a;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f17323a).size();
    }

    public ctz() {
        this.f17323a = new ArrayList();
    }
}
