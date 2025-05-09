package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.TriggerActionsModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class whx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRIGGER_AUTO_COUNT_DOWN = "autoCountDown";
    public static final String TRIGGER_CLOSE = "close";
    public static final String TRIGGER_EXPOSE = "expose";

    static {
        t2o.a(435159084);
    }

    public static void b(final oe8 oe8Var, final shx shxVar, final String str, List<TriggerActionsModel> list) {
        final TriggerActionsModel e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc245b1", new Object[]{oe8Var, shxVar, str, list});
        } else if (!TextUtils.isEmpty(str) && (e = e(str, list)) != null) {
            JSONObject jSONObject = e.trigger;
            if ("autoCountDown".equals(str)) {
                long longValue = jSONObject.getLongValue("countDownTime");
                if (longValue > 0) {
                    oe8Var.y(new Runnable() { // from class: tb.vhx
                        @Override // java.lang.Runnable
                        public final void run() {
                            whx.d(oe8.this, shxVar, str, e);
                        }
                    }, longValue);
                }
            } else if ("expose".equals(str)) {
                sex.n(oe8Var, shxVar, oe8Var.j().k(), str, e.action, e.actions);
            }
        }
    }

    public static boolean c(oe8 oe8Var, shx shxVar, List<TriggerActionsModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b64b42", new Object[]{oe8Var, shxVar, list})).booleanValue();
        }
        TriggerActionsModel e = e("close", list);
        if (e == null) {
            return false;
        }
        boolean booleanValue = e.trigger.getBooleanValue("interrupt");
        sex.n(oe8Var, shxVar, oe8Var.j().k(), "close", e.action, e.actions);
        return booleanValue;
    }

    public static /* synthetic */ void d(oe8 oe8Var, shx shxVar, String str, TriggerActionsModel triggerActionsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be023d9", new Object[]{oe8Var, shxVar, str, triggerActionsModel});
        } else if (oe8Var.j() == null || !oe8Var.j().B()) {
            sex.n(oe8Var, shxVar, oe8Var.j().k(), str, triggerActionsModel.action, triggerActionsModel.actions);
        }
    }

    public static TriggerActionsModel e(String str, List<TriggerActionsModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerActionsModel) ipChange.ipc$dispatch("2ffab1f2", new Object[]{str, list});
        }
        TriggerActionsModel triggerActionsModel = null;
        if (list != null && !list.isEmpty()) {
            for (TriggerActionsModel triggerActionsModel2 : list) {
                if (triggerActionsModel2 != null && triggerActionsModel2.isValid() && str.equals(triggerActionsModel2.trigger.getString("type"))) {
                    triggerActionsModel = triggerActionsModel2;
                }
            }
        }
        return triggerActionsModel;
    }
}
