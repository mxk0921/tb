package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.engine.action.UploadTLogAction;
import com.taobao.android.diagnose.scene.engine.reader.RuleDefine;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i90 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TLOG_UPLOAD = "ACTION_TLOG_UPLOAD";
    public static final String ACTION_TOOL_CONFIG = "ACTION_TOOL_CONFIG";

    static {
        t2o.a(615514183);
    }

    public static List<x80> a(List<RuleDefine.ActionDefine> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("37ba403d", new Object[]{list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (RuleDefine.ActionDefine actionDefine : list) {
            x80 b = b(actionDefine);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public static x80 b(RuleDefine.ActionDefine actionDefine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x80) ipChange.ipc$dispatch("9cb62e24", new Object[]{actionDefine});
        }
        if (actionDefine == null) {
            return null;
        }
        if (ACTION_TLOG_UPLOAD.equals(actionDefine.actionID)) {
            return new UploadTLogAction(actionDefine.actionLimit, actionDefine.actionData, actionDefine.sampling);
        }
        if (ACTION_TOOL_CONFIG.equals(actionDefine.actionID)) {
            return new ah4(actionDefine.actionLimit, actionDefine.actionData, actionDefine.sampling);
        }
        return null;
    }
}
