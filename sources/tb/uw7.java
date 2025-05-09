package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IDMComponent f29647a;
    public final IDMComponent b;
    public final List<IDMComponent> c;
    public final int d;
    public final int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<IDMComponent> f29648a;
        public int b;
        public int c;

        static {
            t2o.a(478151177);
        }

        public static /* synthetic */ List a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e1561ae4", new Object[]{aVar});
            }
            return aVar.f29648a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e3e7b9b7", new Object[]{aVar})).intValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa124278", new Object[]{aVar})).intValue();
            }
            return aVar.c;
        }

        public uw7 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uw7) ipChange.ipc$dispatch("d47397d9", new Object[]{this});
            }
            return new uw7(this);
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a32b4e97", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("23affe3e", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public a g(List<IDMComponent> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("874f5711", new Object[]{this, list});
            }
            this.f29648a = list;
            return this;
        }
    }

    static {
        t2o.a(478151176);
    }

    public uw7(a aVar) {
        List<IDMComponent> a2 = a.a(aVar);
        this.c = a2;
        int b = a.b(aVar);
        this.d = b;
        int c = a.c(aVar);
        this.e = c;
        this.f29647a = a2.get(b);
        this.b = a2.get(c);
    }

    public IDMComponent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("518fec7e", new Object[]{this});
        }
        return this.f29647a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2fceebf", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9527c2e6", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public IDMComponent d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("43513141", new Object[]{this});
        }
        return this.b;
    }

    public List<IDMComponent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("743853d3", new Object[]{this});
        }
        return this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DragSwapRequest{mDragComponent=" + this.f29647a + ", mTargetComponent=" + this.b + ", mFromAdapterPos=" + this.d + ", mTargetAdapterPos=" + this.e + '}';
    }
}
