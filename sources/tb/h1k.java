package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h1k extends l2k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(734003227);
    }

    public h1k(Context context) {
        super(context, "tips1", null, new int[]{R.string.wl_Disagree, R.string.wl_Agree});
    }

    public static /* synthetic */ Object ipc$super(h1k h1kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/NewProvisionDialog2_1");
    }

    @Override // com.taobao.tao.welcome.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e60ebdf", new Object[]{this})).intValue();
        }
        return R.layout.new_provision_dialog2_1;
    }
}
