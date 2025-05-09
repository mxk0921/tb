package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mot implements moc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488973);
        t2o.a(467664919);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return Login.getUserId();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return TFCCommonUtils.q(AfcCustomSdk.h().f10563a);
    }
}
