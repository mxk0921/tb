package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ot<LH extends a> implements h4e<LH> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740607);
        t2o.a(80740601);
    }

    @Override // tb.qcb
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        }
    }

    public String d(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4b649a9", new Object[]{this, map, str, str2});
        }
        if (map == null) {
            return str2;
        }
        Object obj = map.get(str);
        if (!(obj instanceof String)) {
            return String.valueOf(obj);
        }
        String str3 = (String) obj;
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str3;
    }
}
