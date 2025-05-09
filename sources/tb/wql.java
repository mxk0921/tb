package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wql implements fsl<IDMComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465598);
        t2o.a(614465599);
    }

    /* renamed from: b */
    public Object a(String str, IDMComponent iDMComponent) {
        IDMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79ee77ce", new Object[]{this, str, iDMComponent});
        }
        if (!TextUtils.isEmpty(str) && (a2 = ur6.a(str, iDMComponent)) != null) {
            return a2.getKey();
        }
        return null;
    }
}
