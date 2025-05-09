package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.MUSValue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515943);
    }

    public static WeexValue[] a(MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue[]) ipChange.ipc$dispatch("c639079", new Object[]{mUSValueArr});
        }
        if (mUSValueArr == null) {
            return null;
        }
        WeexValue[] weexValueArr = new WeexValue[mUSValueArr.length];
        for (int i = 0; i < mUSValueArr.length; i++) {
            weexValueArr[i] = mUSValueArr[i].convertWeex();
        }
        return weexValueArr;
    }
}
