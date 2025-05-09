package tb;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.TBMainBaseFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fw3 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465541);
    }

    public static /* synthetic */ Object ipc$super(fw3 fw3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/ClosePageV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-5403145042909812304";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar.e() instanceof Activity) {
            Activity activity = (Activity) b8vVar.e();
            if ((activity instanceof FragmentActivity) && (activity instanceof wtd)) {
                ISupportFragment h = qxq.h(((FragmentActivity) activity).getSupportFragmentManager());
                if (h instanceof TBMainBaseFragment) {
                    ((TBMainBaseFragment) h).finish();
                    return;
                }
            }
            Boolean bool = E(b8vVar).getBoolean("animated");
            ((Activity) b8vVar.e()).finish();
            if (bool != null && !bool.booleanValue()) {
                ((Activity) b8vVar.e()).overridePendingTransition(0, 0);
            }
            mmi mmiVar = new mmi(b8vVar.e(), "closePage", null);
            JSONObject E = E(b8vVar);
            if (E != null && E.containsKey("message")) {
                mmiVar.d(E.get("message"));
            }
        }
    }
}
