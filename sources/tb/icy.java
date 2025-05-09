package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorCommitResult;
import com.tanx.exposer.achieve.AdMonitorType;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class icy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile icy f21249a = new icy((byte) 0);

        static {
            t2o.a(283115557);
        }
    }

    static {
        t2o.a(283115556);
    }

    public /* synthetic */ icy(byte b) {
        this();
    }

    public AdMonitorCommitResult a(AdMonitorType adMonitorType, List<String> list, bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("21a3e549", new Object[]{this, adMonitorType, list, bd0Var});
        }
        try {
            if (qgh.f26737a && bd0Var != null) {
                qgh.d("utArgs", bd0Var.toString());
            }
            if (list != null && !list.isEmpty()) {
                ocy.d(bd0Var, adMonitorType);
                if (adMonitorType == AdMonitorType.EXPOSE) {
                    return new qcy(adMonitorType, list, bd0Var).a();
                }
                return new gcy(adMonitorType, list, bd0Var).a();
            }
            ocy.e(bd0Var, adMonitorType, "urls is empty");
            return AdMonitorCommitResult.PARAMS_ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            ocy.e(bd0Var, adMonitorType, e.getMessage());
            return AdMonitorCommitResult.INTERNAL_ERROR;
        }
    }

    public icy() {
    }
}
