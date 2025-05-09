package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fmn implements es6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587920);
        t2o.a(475004953);
    }

    @Override // tb.es6
    public Object a(List list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5df90a9b", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : list) {
            if (!(obj instanceof fak)) {
                if (obj == null) {
                    str = null;
                } else {
                    str = obj.toString();
                }
                if (!TextUtils.isEmpty(str)) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(str);
                }
            }
        }
        return stringBuffer.toString();
    }
}
