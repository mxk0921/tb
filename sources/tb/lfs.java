package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lfs extends vrp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final d.j c;

    static {
        t2o.a(468714327);
    }

    public lfs(d.j jVar) {
        this.c = jVar;
    }

    public static /* synthetic */ Object ipc$super(lfs lfsVar, String str, Object... objArr) {
        if (str.hashCode() == 965972421) {
            return new Boolean(super.b((lr9) objArr[0], objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/callback/TNodeCallback");
    }

    @Override // tb.vrp.a
    public boolean b(lr9 lr9Var, Object obj) {
        d.j jVar;
        d.k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("399391c5", new Object[]{this, lr9Var, obj})).booleanValue();
        }
        boolean b = super.b(lr9Var, obj);
        if (!(!b || (jVar = this.c) == null || (kVar = jVar.c) == null)) {
            kVar.a(jVar, obj);
        }
        return b;
    }
}
