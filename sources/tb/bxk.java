package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class bxk extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AtomicBoolean e = new AtomicBoolean(false);

    public bxk(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(bxk bxkVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        if (hashCode == 1751478273) {
            return super.b();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/launcher/biz/task/OneTimeTask");
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (d) {
            return !this.e.get();
        }
        return d;
    }

    @Override // tb.mss
    /* renamed from: m */
    public Void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("68657001", new Object[]{this});
        }
        if (this.e.compareAndSet(false, true)) {
            return super.b();
        }
        return null;
    }

    @Override // tb.mss
    public abstract /* synthetic */ void p(Application application, HashMap hashMap);
}
