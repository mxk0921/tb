package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tao.reactivex.d.h.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class nux<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f24964a;
    public Object[] b;
    public int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a<T> extends f4y<T> {
    }

    static {
        t2o.a(628097484);
    }

    public nux(int i) {
        Object[] objArr = new Object[i + 1];
        this.f24964a = objArr;
        this.b = objArr;
    }

    public void a(T t) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        int i2 = this.c;
        if (i2 == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
        } else {
            i = i2;
        }
        this.b[i] = t;
        this.c = i + 1;
    }

    public void b(a<? super T> aVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd7008a", new Object[]{this, aVar});
            return;
        }
        for (Object[] objArr2 = this.f24964a; objArr2 != null; objArr2 = objArr2[4]) {
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null && !((dyx) aVar).test(objArr); i++) {
            }
        }
    }

    public <U> boolean c(cyx<? super U> cyxVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fadd5560", new Object[]{this, cyxVar})).booleanValue();
        }
        for (Object[] objArr2 = this.f24964a; objArr2 != null; objArr2 = objArr2[4]) {
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                if (g.a(objArr, cyxVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public <U> boolean d(r9y<? super U> r9yVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aac18b30", new Object[]{this, r9yVar})).booleanValue();
        }
        for (Object[] objArr2 = this.f24964a; objArr2 != null; objArr2 = objArr2[4]) {
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                if (g.a(objArr, r9yVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
        } else {
            this.f24964a[0] = t;
        }
    }
}
