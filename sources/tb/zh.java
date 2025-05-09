package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.annotation.AURAInputField;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.dismissFloat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zh extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "dismissFloat";
    @AURAInputField(name = "floatView", required = false)
    public fyc e;

    static {
        t2o.a(81789196);
    }

    public static /* synthetic */ Object ipc$super(zh zhVar, String str, Object... objArr) {
        if (str.hashCode() == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/popupWindow/AURADismissFloatEvent");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        O0();
        fyc fycVar = (fyc) x().d(this, "floatView", fyc.class);
        this.e = fycVar;
        if (fycVar == null) {
            ck.g().b("AURADismissFloatEvent", "innerHandleEvent", "没有注入floatView参数");
        } else {
            fycVar.dismiss();
        }
    }

    public final void O0() {
        NUTFloatViewManager nUTFloatViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133a2ad8", new Object[]{this});
            return;
        }
        AURAGlobalData B = B();
        if (B != null && (nUTFloatViewManager = (NUTFloatViewManager) B.get("auraFloatViewManager", NUTFloatViewManager.class)) != null) {
            nUTFloatViewManager.dismiss();
        }
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return EVENT_TYPE;
    }
}
