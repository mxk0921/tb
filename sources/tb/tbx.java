package tb;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tbx extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199455);
    }

    public static /* synthetic */ Object ipc$super(tbx tbxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/WidgetExposureSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (lcuVar != null) {
            try {
                IDMComponent a2 = lcuVar.a();
                gsb g = g();
                if (!(a2 == null || g == null || (fields = g.getFields()) == null)) {
                    String string = fields.getString("arg1");
                    ArrayMap<String, Object> extMap = a2.getExtMap();
                    String str = "_pre_" + string;
                    if (extMap != null) {
                        Object obj = extMap.get(str);
                        if (obj != null && (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue())) {
                            return;
                        }
                        this.j.g().h(this.j.g().d().l("cartUserTrack").k(lcuVar.c()).i(lcuVar.a()).q(lcuVar.g()));
                        extMap.put(str, Boolean.TRUE);
                    }
                }
            } catch (Throwable th) {
                UnifyLog.m("WidgetExposureSubscriber", "WidgetExposureSubscriber", "WidgetExposureSubscriber deal event exception.", th.getMessage());
            }
        }
    }
}
