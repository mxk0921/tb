package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s9v extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286526);
    }

    public static /* synthetic */ Object ipc$super(s9v s9vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/UltronOpenPopSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        gsb j = j();
        if (j != null && j.getFields() != null) {
            JSONObject fields = j.getFields();
            y7 y7Var = new y7();
            Object g = g("triggerView");
            Context e = b8vVar.e();
            n9 n9Var = new n9();
            n9Var.i(e);
            if (g instanceof View) {
                n9Var.m((View) g);
                y7Var.b(new n8(fields), n9Var, null);
                return;
            }
            if (e instanceof Activity) {
                Activity activity = (Activity) e;
                if (activity.getWindow() != null) {
                    n9Var.m(activity.getWindow().getDecorView());
                    y7Var.b(new n8(fields), n9Var, null);
                    return;
                }
            }
            Log.e("UltronOpenPopSubscriber", "view is null");
        }
    }
}
