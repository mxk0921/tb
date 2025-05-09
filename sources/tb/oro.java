package tb;

import android.view.ScaleGestureDetector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oro extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750631);
    }

    public static /* synthetic */ Object ipc$super(oro oroVar, String str, Object... objArr) {
        if (str.hashCode() == -717469221) {
            super.onScaleEnd((ScaleGestureDetector) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/status/ScaleGestureObserver");
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
            return;
        }
        if (scaleGestureDetector.getScaleFactor() > 1.0f) {
            str = "out";
        } else {
            str = "in";
        }
        TBS.Ext.commitEvent("BehaviX", UtUtils.CHANGED_UPP_EVENT_ID, "bx_page_scale", t82.b(), null, "factor=".concat(str));
        super.onScaleEnd(scaleGestureDetector);
    }
}
