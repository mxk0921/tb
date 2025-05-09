package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g74 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286520);
    }

    public static /* synthetic */ Object ipc$super(g74 g74Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonShowLoadingSubscriber");
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
            JSONObject fields = j().getFields();
            if (fields != null) {
                b8vVar.n().c(fields.getString("message"));
            }
        } catch (Throwable th) {
            UnifyLog.e("CommonLoadingSubscriber", th.toString());
            fsb fsbVar = this.d;
            if (fsbVar == null) {
                str = "Ultron";
            } else {
                str = fsbVar.getBizName();
            }
            lbq.c(str, "CommonShowLoadingSubscriber.onHandleEvent", th);
        }
    }
}
