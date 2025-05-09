package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ose extends erh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793730);
    }

    public static /* synthetic */ Object ipc$super(ose oseVar, String str, Object... objArr) {
        if (str.hashCode() == -1259098756) {
            return super.a((String) objArr[0], (View) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Number) objArr[3]).intValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/page/InShopBehaviorCreator");
    }

    @Override // tb.erh, tb.leq, tb.zib
    public kr1 a(String str, View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("b4f3ad7c", new Object[]{this, str, view, new Boolean(z), new Integer(i)});
        }
        ckf.g(str, "type");
        ckf.g(view, "view");
        if (ckf.b("topBar", str)) {
            return new gnq(view, z);
        }
        return super.a(str, view, z, i);
    }
}
