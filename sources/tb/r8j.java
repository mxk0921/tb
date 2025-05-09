package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class r8j implements rid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299779);
        t2o.a(589299774);
    }

    public abstract sih b(String str);

    public abstract boolean c(String str);

    public abstract boolean d(String str);

    public abstract void e(String str, iby ibyVar, boolean z);

    @Override // tb.rid
    @Deprecated
    public sih getLoginContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sih) ipChange.ipc$dispatch("a65acccd", new Object[]{this});
        }
        return b(null);
    }

    @Override // tb.rid
    @Deprecated
    public boolean isLogining() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0fde62e", new Object[]{this})).booleanValue();
        }
        return c(null);
    }

    @Override // tb.rid
    @Deprecated
    public boolean isSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
        }
        return d(null);
    }

    @Override // tb.rid
    @Deprecated
    public void login(iby ibyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf0ecd2", new Object[]{this, ibyVar, new Boolean(z)});
        } else {
            e(null, ibyVar, z);
        }
    }
}
