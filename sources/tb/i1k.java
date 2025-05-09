package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i1k extends l2k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(734003228);
    }

    public i1k(Context context) {
        super(context, "tips1", new int[]{R.id.provision_negative_button_view_mode, R.id.provision_negative_button_exit_app, R.id.provision_positive_button}, new int[]{R.string.privacy_text_disagree_enter_view_mode, R.string.privacy_text_disagree_exit_app, R.string.privacy_text_agree_continue});
    }

    public static /* synthetic */ Object ipc$super(i1k i1kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/NewProvisionDialog2_2");
    }

    @Override // com.taobao.tao.welcome.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e60ebdf", new Object[]{this})).intValue();
        }
        return R.layout.new_provision_dialog2_2;
    }

    public i1k(Context context, int i, int i2, int[] iArr, int[] iArr2) {
        super(context, "tips1", i, i2, iArr, iArr2);
    }
}
