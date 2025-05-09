package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v54 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286513);
    }

    public static /* synthetic */ Object ipc$super(v54 v54Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonHideLoadingSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        try {
            b8vVar.n().hideLoading();
        } catch (Throwable th) {
            UnifyLog.e("CommonLoadingSubscriber", th.toString());
            fsb fsbVar = this.d;
            if (fsbVar == null) {
                str = "Ultron";
            } else {
                str = fsbVar.getBizName();
            }
            lbq.c(str, "CommonLoadingSubscriber", th);
        }
    }
}
