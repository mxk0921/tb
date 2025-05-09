package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class yao<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31946a;
    public final String b;
    public final String c;
    public final T d;
    public Object e;
    public MtopResponse f;

    static {
        t2o.a(468713841);
    }

    public yao(boolean z, String str, String str2, T t) {
        this.f31946a = z;
        this.b = str;
        this.c = str2;
        this.d = t;
    }

    public static <T> yao<T> a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yao) ipChange.ipc$dispatch("9cc13395", new Object[]{str, str2, obj});
        }
        yao<T> yaoVar = new yao<>(false, str, str2, null);
        yaoVar.e = obj;
        if (obj instanceof MtopResponse) {
            yaoVar.f = (MtopResponse) obj;
        }
        return yaoVar;
    }

    public static <T> yao<T> h(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yao) ipChange.ipc$dispatch("c61eb6da", new Object[]{str, t});
        }
        return new yao<>(true, "-1", str, t);
    }

    public static <T> yao<T> i(String str, T t, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yao) ipChange.ipc$dispatch("46156d75", new Object[]{str, t, mtopResponse});
        }
        yao<T> yaoVar = new yao<>(true, "-1", str, t);
        yaoVar.f = mtopResponse;
        return yaoVar;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.b;
    }

    public T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.d;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7b6a079", new Object[]{this});
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof yao) || ((yao) obj).b != this.b) {
            return false;
        }
        return true;
    }

    public MtopResponse f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("5c6f0275", new Object[]{this});
        }
        return this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f31946a;
    }
}
