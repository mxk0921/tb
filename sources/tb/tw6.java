package tb;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tw6 extends yu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public nmd e;

    static {
        t2o.a(760217723);
    }

    public tw6(hvm hvmVar, FragmentActivity fragmentActivity, Intent intent, boolean z, nmd nmdVar) {
        super(hvmVar, fragmentActivity, intent, z);
        this.e = nmdVar;
    }

    public static /* synthetic */ Object ipc$super(tw6 tw6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/util/DecodeResultDefaultProcesser");
    }

    public boolean a(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6aa52c3", new Object[]{this, maResult})).booleanValue();
        }
        try {
            this.c.putExtra("type", maResult.getType());
            this.c.putExtra("strCode", maResult.getText());
            this.b.startActivity(this.c);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
