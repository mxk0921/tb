package tb;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u54 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286512);
    }

    public static /* synthetic */ Object ipc$super(u54 u54Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonHideKeyboardSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) b8vVar.e().getSystemService("input_method");
            Activity activity = (Activity) b8vVar.e();
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                activity.getCurrentFocus().clearFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
            UnifyLog.m(b8vVar.n().getBizName(), "CommonHideKeyboardSubscriber", "hide keyboard error", new String[0]);
        }
    }
}
