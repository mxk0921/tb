package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class m97 extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "defer";

    public m97(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(m97 m97Var, String str, Object... objArr) {
        if (str.hashCode() == 1751478273) {
            return super.b();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/task/DeferrableTask");
    }

    @Override // tb.mss
    /* renamed from: m */
    public Void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("68657001", new Object[]{this});
        }
        q8t.d(e, c());
        Void m = super.b();
        q8t.b(e, c());
        return m;
    }

    @Override // tb.mss
    public abstract /* synthetic */ void p(Application application, HashMap hashMap);
}
