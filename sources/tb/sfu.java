package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.TriggerActionsModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sfu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TRIGGER_ACTION_KEY_BACK = "actionKeyBack";
    public static final String TRIGGER_APP_MODE_ADD = "appModeAdd";
    public static final String TRIGGER_AUTO_COUNT_DOWN = "autoCountDown";
    public static final String TRIGGER_EMBED_ADD = "embedAdd";
    public static final String TRIGGER_EXPOSE = "expose";
    public static final String TRIGGER_FOLD_ADD = "foldAdd";
    public static final String TRIGGER_PAD_ADD = "padAdd";

    static {
        t2o.a(790626431);
    }

    public static /* synthetic */ void c(oe8 oe8Var, boolean z, int i, String str, TriggerActionsModel triggerActionsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178db470", new Object[]{oe8Var, new Boolean(z), new Integer(i), str, triggerActionsModel});
        } else if (oe8Var.j() != null && oe8Var.j().B()) {
            wdm.d("TriggerActionHandler.executeCountDownTime.isEngineClosed", new Object[0]);
        } else if (!z || oe8Var.j().j() == i) {
            oe8Var.l(oe8Var.j().k(), str, triggerActionsModel.action, triggerActionsModel.actions);
        } else {
            wdm.d("TriggerActionHandler.executeCountDownTime.stateIndexChanged", new Object[0]);
        }
    }

    public static boolean b(final oe8 oe8Var, final String str, final boolean z, List<TriggerActionsModel> list) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd38a142", new Object[]{oe8Var, str, new Boolean(z), list})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        final TriggerActionsModel triggerActionsModel = null;
        if (list != null && !list.isEmpty()) {
            for (TriggerActionsModel triggerActionsModel2 : list) {
                if (triggerActionsModel2 != null && triggerActionsModel2.isValid() && (jSONObject = triggerActionsModel2.trigger) != null && str.equals(jSONObject.getString("type"))) {
                    triggerActionsModel = triggerActionsModel2;
                }
            }
        }
        if (triggerActionsModel == null) {
            return false;
        }
        if ("autoCountDown".equals(str)) {
            long longValue = triggerActionsModel.trigger.getLongValue("countDownTime");
            if (longValue > 0) {
                final int j = oe8Var.j().j();
                oe8Var.y(new Runnable() { // from class: tb.rfu
                    @Override // java.lang.Runnable
                    public final void run() {
                        sfu.c(oe8.this, z, j, str, triggerActionsModel);
                    }
                }, longValue);
            }
            return true;
        }
        oe8Var.l(oe8Var.j().k(), str, triggerActionsModel.action, triggerActionsModel.actions);
        return true;
    }

    public static boolean d(String str, List<TriggerActionsModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5ce2780", new Object[]{str, list})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TriggerActionsModel triggerActionsModel = null;
        if (list != null && !list.isEmpty()) {
            for (TriggerActionsModel triggerActionsModel2 : list) {
                if (triggerActionsModel2 != null && triggerActionsModel2.isValid() && str.equals(triggerActionsModel2.trigger.getString("type"))) {
                    triggerActionsModel = triggerActionsModel2;
                }
            }
        }
        return triggerActionsModel != null;
    }
}
