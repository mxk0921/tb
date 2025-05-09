package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValueImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y5x extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ u5x f;

    public y5x(u5x u5xVar, String str, String str2) {
        this.f = u5xVar;
        this.d = str;
        this.e = str2;
    }

    public static /* synthetic */ Object ipc$super(y5x y5xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$7");
    }

    @Override // tb.yio
    public void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
        } else {
            u5x.d(this.f).updateInstanceEnv(this.d, WeexValueImpl.ofString(this.e));
        }
    }
}
