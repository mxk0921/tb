package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.executeAbility")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ui extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "executeAbility";
    public y7 e;
    public tab f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else if (!TextUtils.isEmpty(str) && ui.O0(ui.this) != null) {
                ui.O0(ui.this).d0(str, c8Var);
            }
        }
    }

    static {
        t2o.a(81789056);
    }

    public static /* synthetic */ tab O0(ui uiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tab) ipChange.ipc$dispatch("1750b0d3", new Object[]{uiVar});
        }
        return uiVar.f;
    }

    public static /* synthetic */ Object ipc$super(ui uiVar, String str, Object... objArr) {
        if (str.hashCode() == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/ability/AURAExecuteAbility");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
        } else {
            P0(aURAEventIO.getEventModel().c());
        }
    }

    public final void P0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d304137", new Object[]{this, jSONObject});
            return;
        }
        if (this.e == null) {
            this.e = new y7();
        }
        n9 n9Var = new n9();
        Context f = J0().f();
        n9Var.i(f);
        if (f instanceof Activity) {
            n9Var.m(((Activity) f).getWindow().getDecorView());
        }
        this.e.b(new n8(jSONObject), n9Var, new a());
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.f = (tab) yiVar.e(tab.class);
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
