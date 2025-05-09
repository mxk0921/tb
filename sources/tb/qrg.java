package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qrg extends jhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public qrg(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(qrg qrgVar, String str, Object... objArr) {
        if (str.hashCode() == -1954782478) {
            super.B((Activity) objArr[0], (Map) objArr[1], ((Number) objArr[2]).longValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/processor/launcher/LinkManagerProcessor");
    }

    @Override // tb.jhg, tb.lb0.a
    public void B(Activity activity, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7c62f2", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        super.B(activity, map, j);
        Object obj = map.get("blackPage");
        if (obj != null && activity.getClass().getName().equals(obj.toString())) {
            this.c = null;
        }
        if (map.containsKey("isAfcColdContext")) {
            this.f.a("isAfcColdContext", map.get("isAfcColdContext"));
        }
    }

    public qrg(String str, long j) {
        super(str, j);
    }
}
