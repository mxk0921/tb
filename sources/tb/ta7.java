package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ta7<T, R> extends vct<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final vct<T, R> e;

    public ta7(vct<T, R> vctVar) {
        this.e = vctVar;
    }

    public static /* synthetic */ Object ipc$super(ta7 ta7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/job/core/task/DelegateTask");
    }

    @Override // tb.vct
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f0f1f4", new Object[]{this})).booleanValue();
        }
        return this.e.a();
    }

    @Override // tb.vct
    public T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8f1d7b1a", new Object[]{this});
        }
        return this.e.c();
    }

    @Override // tb.vct
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda99ef4", new Object[]{this, new Boolean(z)});
        } else {
            this.e.e(z);
        }
    }

    @Override // tb.vct
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c1ff22", new Object[]{this, new Boolean(z)});
        } else {
            this.e.f(z);
        }
    }

    @Override // tb.vct
    public void g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c136d200", new Object[]{this, t});
        } else {
            this.e.g(t);
        }
    }

    @Override // tb.vct
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("603f5807", new Object[]{this})).booleanValue();
        }
        return this.e.h();
    }

    @Override // tb.vct
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c79391", new Object[]{this})).booleanValue();
        }
        return this.e.j();
    }

    public vct<T, R> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vct) ipChange.ipc$dispatch("38827900", new Object[]{this});
        }
        return this.e;
    }
}
