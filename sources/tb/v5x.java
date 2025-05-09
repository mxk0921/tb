package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v5x extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WeexValue d;
    public final /* synthetic */ u5x e;

    public v5x(u5x u5xVar, WeexValue weexValue) {
        this.e = u5xVar;
        this.d = weexValue;
    }

    public static /* synthetic */ Object ipc$super(v5x v5xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$12");
    }

    @Override // tb.yio
    public void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
        } else {
            u5x.d(this.e).setInstanceData(this.d);
        }
    }
}
