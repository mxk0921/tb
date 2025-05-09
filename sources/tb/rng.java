package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.IBothWayJudge;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import com.taobao.android.litecreator.base.workflow.annotation.WorkflowNode;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class rng {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FORWARD_REQUEST_CODE = 199;
    public static final String KEY_BOTH_WAY_FLAG = "BOTH_WAY_WORKFLOW_NODE";

    static {
        t2o.a(511705159);
    }

    public static void a(nee<?> neeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1210c3b4", new Object[]{neeVar});
        } else if ((neeVar instanceof Activity) && f(((Activity) neeVar).getIntent(), neeVar.getClass())) {
            odg.d("LifecycleHooker", i(neeVar) + ":out (finish).");
            Intent intent = new Intent();
            intent.putExtra(IWorkflowData.KEY, neeVar.out());
            ((Activity) neeVar).setResult(199, intent);
        }
    }

    public static <T extends IWorkflowData> void b(nee<T> neeVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ab1d1c", new Object[]{neeVar, intent});
            return;
        }
        IWorkflowData iWorkflowData = (IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY);
        if (iWorkflowData != null) {
            odg.d("LifecycleHooker", i(neeVar) + ":update (newIntent).");
            neeVar.update(iWorkflowData);
        }
    }

    public static <T extends IWorkflowData> void c(nee<T> neeVar, int i, int i2, Intent intent) {
        IWorkflowData iWorkflowData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33dfd49", new Object[]{neeVar, new Integer(i), new Integer(i2), intent});
        } else if (intent != null && (iWorkflowData = (IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY)) != null) {
            odg.d("LifecycleHooker", i(neeVar) + ":update (onActivityResult).");
            neeVar.update(iWorkflowData);
        }
    }

    public static <T extends IWorkflowData> void d(nee<T> neeVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4dac6d9", new Object[]{neeVar, intent});
        } else if (intent != null) {
            odg.d("LifecycleHooker", i(neeVar) + ":in.");
            neeVar.in((IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY));
        }
    }

    public static boolean f(Intent intent, Class<?> cls) {
        if (cls == null) {
            return true;
        }
        if (intent != null && intent.getExtras() != null && intent.getExtras().getBoolean(KEY_BOTH_WAY_FLAG, false)) {
            return true;
        }
        WorkflowNode workflowNode = (WorkflowNode) cls.getAnnotation(WorkflowNode.class);
        if (workflowNode == null) {
            return false;
        }
        String bothWayJudge = workflowNode.bothWayJudge();
        if (TextUtils.isEmpty(bothWayJudge)) {
            return workflowNode.bothWay();
        }
        try {
            return ((IBothWayJudge) Class.forName(bothWayJudge).newInstance()).isBothWayNode(intent);
        } catch (Throwable unused) {
            return workflowNode.bothWay();
        }
    }

    public static <T extends IWorkflowData> boolean g(nee<T> neeVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba56b9e6", new Object[]{neeVar, intent})).booleanValue();
        }
        boolean h = h(neeVar, intent);
        if (!h && (neeVar instanceof Activity)) {
            ebg.k(((Activity) neeVar).getApplication(), Localization.q(R.string.gg_pub_data_exception_retry));
            odg.c("LifecycleHooker", i(neeVar) + ":isInterruptActivityOnCreate invalid data. plz check.");
        }
        return !h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends IWorkflowData> boolean h(nee<T> neeVar, Intent intent) {
        WorkflowNode workflowNode = (WorkflowNode) neeVar.getClass().getAnnotation(WorkflowNode.class);
        if (workflowNode == null) {
            return true;
        }
        String checkerClassName = workflowNode.checkerClassName();
        if (!TextUtils.isEmpty(checkerClassName)) {
            try {
                return ((lee) Class.forName(checkerClassName).newInstance()).check((IWorkflowData) intent.getSerializableExtra(IWorkflowData.KEY));
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static String i(nee<?> neeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d03e611", new Object[]{neeVar});
        }
        return neeVar.getClass().getSimpleName() + f7l.BRACKET_START_STR + neeVar.hashCode() + f7l.BRACKET_END_STR;
    }

    public static int e(nee<?> neeVar, Intent intent, int i, Bundle bundle) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a186535", new Object[]{neeVar, intent, new Integer(i), bundle})).intValue();
        }
        ResolveInfo resolveActivity = Globals.getApplication().getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            return i;
        }
        try {
            String stringExtra = intent.getStringExtra("std_pop_origin_component_cls_name");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = resolveActivity.activityInfo.name;
            }
            cls = Class.forName(stringExtra);
        } catch (Throwable unused) {
            cls = null;
        }
        boolean z = cls != null;
        if (z) {
            intent.putExtra(IWorkflowData.KEY, neeVar.out());
        }
        boolean f = f(intent, cls);
        if (z) {
            odg.d("LifecycleHooker", i(neeVar) + ":out (startActivity)." + cls.getSimpleName() + ".isBothWayNode:" + f);
        } else {
            odg.d("LifecycleHooker", i(neeVar) + ":out (startActivity).");
        }
        if (i != -1 || !f) {
            return i;
        }
        return 199;
    }
}
