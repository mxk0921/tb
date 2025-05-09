package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.a;
import com.taobao.tao.log.TLog;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x64 implements mio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(615514201);
        t2o.a(615514195);
    }

    public int b(lio lioVar, tx8 tx8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f60b99c", new Object[]{this, lioVar, tx8Var, str})).intValue();
        }
        if (lioVar == null) {
            return 0;
        }
        return a(lioVar, tx8Var, str);
    }

    public int a(lio lioVar, tx8 tx8Var, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1dc61b87", new Object[]{this, lioVar, tx8Var, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            idh.e("CommonRulesEngine", "The scene code is null");
            return 0;
        } else if (lioVar.isEmpty()) {
            idh.e("CommonRulesEngine", "No rules registered for " + str);
            return 0;
        } else {
            if (tx8Var == null) {
                tx8Var = new tx8();
            }
            tx8Var.b(a.f());
            tx8Var.e("fact_time_hh", Integer.valueOf(Calendar.getInstance().get(11)));
            Iterator<cio> it = lioVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                cio next = it.next();
                if (next != null && str.equals(next.g())) {
                    if (next.i()) {
                        idh.a("CommonRulesEngine", "The rule is out of date：" + next.toString());
                    } else if (!"scene_custom".equals(str) || (next.c() != null && next.c().equals(tx8Var.c("fact_biz_name")))) {
                        try {
                            z = next.a(tx8Var);
                        } catch (RuntimeException e) {
                            TLog.loge("Diagnose", "CommonRulesEngine", "Rule '" + next.toString() + "' evaluated with error", e);
                            z = false;
                        }
                        if (z) {
                            String cioVar = next.toString();
                            boolean j = next.j();
                            idh.b("CommonRulesEngine", "Execute rule " + cioVar + " form channel " + j);
                            i++;
                            try {
                                next.b(tx8Var);
                            } catch (Exception e2) {
                                TLog.loge("Diagnose", "CommonRulesEngine", "Rule '" + next.toString() + "' performed with error", e2);
                            }
                        }
                    }
                }
            }
            return i;
        }
    }
}
