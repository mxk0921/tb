package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bd8 extends sgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final jqk f16332a = new j47();

        public static /* synthetic */ jqk a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jqk) ipChange.ipc$dispatch("4aec8907", new Object[0]);
            }
            return f16332a;
        }
    }

    public bd8(vh4 vh4Var) {
        super(vh4Var);
    }

    public static /* synthetic */ Object ipc$super(bd8 bd8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/schedulers/EmptyScheduler");
    }

    @Override // tb.sgg
    public n35<String, Void> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("de4e5542", new Object[]{this});
        }
        return null;
    }

    @Override // tb.sgg
    public n35<String, Void> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n35) ipChange.ipc$dispatch("bd24f637", new Object[]{this});
        }
        return null;
    }

    @Override // tb.sgg
    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4532f39e", new Object[]{this});
        }
    }

    @Override // tb.sgg
    public jqk y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqk) ipChange.ipc$dispatch("5a18ef58", new Object[]{this});
        }
        return a.a();
    }
}
