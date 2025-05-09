package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n74 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286522);
    }

    public static /* synthetic */ Object ipc$super(n74 n74Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonToastSubscriber");
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
                String string = fields.getString("message");
                if (!TextUtils.isEmpty(string)) {
                    z4v.a(b8vVar.e(), string);
                }
            }
        } catch (Throwable th) {
            UnifyLog.e("ToastSubscriber", th.toString());
            fsb fsbVar = this.d;
            if (fsbVar == null) {
                str = "Ultron";
            } else {
                str = fsbVar.getBizName();
            }
            lbq.c(str, "CommonToastSubscriber.onHandleEvent", th);
        }
    }
}
