package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.func.ToolConfigManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ah4 extends mq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(615514185);
    }

    public ah4(int i, String str, int i2) {
        super(i, str, i2);
    }

    public static /* synthetic */ Object ipc$super(ah4 ah4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/scene/engine/action/ConfigToolAction");
    }

    @Override // tb.x80
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e70e4212", new Object[]{this});
        }
        return i90.ACTION_TOOL_CONFIG;
    }

    @Override // tb.x80
    public void c(tx8 tx8Var, cio cioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0ae2bf", new Object[]{this, tx8Var, cioVar});
        } else if (!TextUtils.isEmpty(this.c)) {
            ToolConfigManager.b(cioVar.e(), cioVar.h(), this.c);
        }
    }
}
