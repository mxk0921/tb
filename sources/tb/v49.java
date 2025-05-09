package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v49 extends jcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String j;

    static {
        t2o.a(676331630);
    }

    public v49(Context context, String str) throws PackageManager.NameNotFoundException {
        super(context);
        this.j = str;
    }

    public static /* synthetic */ Object ipc$super(v49 v49Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1706791255) {
            return new Integer(super.m());
        }
        if (hashCode == 1687511176) {
            return new Boolean(super.q());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/split/logic/FeatureUpdateSplitFileLogic");
    }

    @Override // tb.jcq
    public final File B() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c24f33e4", new Object[]{this});
        }
        return jcq.A(new File(O(), "native-libraries"));
    }

    @Override // tb.jcq
    public final File J() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("8958320b", new Object[]{this});
        }
        return jcq.A(new File(O(), "status"));
    }

    @Override // tb.jcq
    public final File O() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("54bdba77", new Object[]{this});
        }
        return jcq.A(new File(R(), this.j));
    }

    public final File Q() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a282053d", new Object[]{this});
        }
        return jcq.A(new File(O(), "dex"));
    }

    public final File R() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("cae45ef2", new Object[]{this});
        }
        return jcq.A(new File(P(), "features-update"));
    }

    @Override // tb.jcq
    public final File c(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("930ae7b3", new Object[]{this, str});
        }
        return jcq.A(new File(Q(), str));
    }

    @Override // tb.jcq
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a446ea9", new Object[]{this})).intValue();
        }
        return super.m();
    }

    @Override // tb.jcq
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.jcq
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64956088", new Object[]{this})).booleanValue();
        }
        try {
            return new File(O(), CountValue.T_DEPRECATED).exists();
        } catch (Exception unused) {
            return super.q();
        }
    }

    public v49(Context context, boolean z, String str) throws PackageManager.NameNotFoundException {
        super(context, z);
        this.j = str;
    }
}
