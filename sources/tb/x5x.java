package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexValue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x5x extends yio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WeexEventTarget d;
    public final /* synthetic */ String e;
    public final /* synthetic */ WeexValue f;
    public final /* synthetic */ u5x g;

    public x5x(u5x u5xVar, WeexEventTarget weexEventTarget, String str, WeexValue weexValue) {
        this.g = u5xVar;
        this.d = weexEventTarget;
        this.e = str;
        this.f = weexValue;
    }

    public static /* synthetic */ Object ipc$super(x5x x5xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceAsyncBuilderImpl$6");
    }

    @Override // tb.yio
    public void e() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4134b145", new Object[]{this});
        } else {
            u5x.d(this.g).dispatchEvent(this.d, this.e, this.f);
        }
    }
}
