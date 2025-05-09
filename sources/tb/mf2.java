package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mf2 extends yg3<Component> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120465);
    }

    public mf2(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(mf2 mf2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/component/display/BlankViewHolder");
    }

    @Override // tb.yg3
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54838a8e", new Object[]{this});
        }
    }

    @Override // tb.yg3
    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f2361e7c", new Object[]{this});
        }
        return new View(this.b, null);
    }
}
