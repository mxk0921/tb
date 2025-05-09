package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nbs extends a9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(851443740);
    }

    public nbs(bbs bbsVar) {
        super(bbsVar);
    }

    public static /* synthetic */ Object ipc$super(nbs nbsVar, String str, Object... objArr) {
        if (str.hashCode() == -2016635603) {
            super.a((lwd) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/weex/solution/TMSLegacyWeexLauncher");
    }

    @Override // tb.a9s, tb.owd
    public void a(lwd lwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
            return;
        }
        super.a(lwdVar);
        new dcs(this.c, this).a();
    }
}
