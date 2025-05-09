package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zes extends a9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(852492369);
    }

    public zes(bbs bbsVar) {
        super(bbsVar);
    }

    public static /* synthetic */ Object ipc$super(zes zesVar, String str, Object... objArr) {
        if (str.hashCode() == -2016635603) {
            super.a((lwd) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/TMSWidgetLauncher");
    }

    @Override // tb.a9s, tb.owd
    public void a(lwd lwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cc952d", new Object[]{this, lwdVar});
            return;
        }
        super.a(lwdVar);
        s8s s8sVar = new s8s(this.c, this);
        s8sVar.j(new acs(this.c, this)).j(new sbx(this.c, this)).j(new dcs(this.c, this));
        s8sVar.a();
    }
}
