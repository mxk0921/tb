package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aba extends ws1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final aba f15641a = new aba();

        static {
            t2o.a(1032847378);
        }

        public static /* synthetic */ aba a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aba) ipChange.ipc$dispatch("6604845c", new Object[0]);
            }
            return f15641a;
        }
    }

    static {
        t2o.a(1032847376);
    }

    public static aba g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aba) ipChange.ipc$dispatch("bd9f6477", new Object[0]);
        }
        return (aba) b.a().b();
    }

    public static /* synthetic */ Object ipc$super(aba abaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -366443726) {
            return super.d((Class) objArr[0]);
        }
        if (hashCode == 605395102) {
            return abaVar.e((Class) objArr[0], (String) objArr[1], (String) objArr[2]);
        }
        if (hashCode == 1816262639) {
            super.f((Class) objArr[0], objArr[1]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/edlp/kit/GlobalContainer");
    }

    @Override // tb.ws1
    public <T> T d(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{this, cls});
        }
        return (T) super.d(cls);
    }

    @Override // tb.ws1
    public <T> void f(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c41f7ef", new Object[]{this, cls, t});
        } else {
            super.f(cls, t);
        }
    }

    public aba() {
    }
}
