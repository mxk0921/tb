package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class a9s extends qt6 implements owd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final bbs c;
    public lwd d;

    static {
        t2o.a(839909719);
        t2o.a(839909718);
    }

    public a9s(bbs bbsVar) {
        this.c = bbsVar;
    }

    public static /* synthetic */ Object ipc$super(a9s a9sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/TMSBaseLauncher");
    }

    public void a(lwd lwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
        } else {
            this.d = lwdVar;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public lwd m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lwd) ipChange.ipc$dispatch("b0d9dcc9", new Object[]{this});
        }
        return this.d;
    }
}
