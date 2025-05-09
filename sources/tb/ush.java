package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newsetting.dx.MTBSettingSwitchEventHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ush extends MTBSettingSwitchEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_HANDLER_SWITCH_REVERSE = "eventhandler.mtb.widget.setting.switch.reverse";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(745537862);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(745537861);
    }

    public static /* synthetic */ Object ipc$super(ush ushVar, String str, Object... objArr) {
        if (str.hashCode() == 1011176498) {
            super.e((String) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/dx/general/MTBSettingSwitchReverseEventHandler");
    }

    @Override // com.taobao.mytaobao.newsetting.dx.MTBSettingSwitchEventHandler
    public void e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c455432", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ckf.h(str, "key");
        super.e(str, !z);
    }
}
