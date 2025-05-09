package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sql implements fsl<IDMComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465597);
        t2o.a(614465599);
    }

    /* renamed from: b */
    public Object a(String str, IDMComponent iDMComponent) {
        IDMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79ee77ce", new Object[]{this, str, iDMComponent});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.trim().split(",");
        if (split.length == 2 && !TextUtils.isEmpty(split[0]) && (a2 = ur6.a(split[0], iDMComponent)) != null) {
            return ur6.e(split[1], a2.getData());
        }
        return null;
    }
}
