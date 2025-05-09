package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbwaitpay.impl.render.creator.freeNode.actionBar")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ezr extends bt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(725614617);
    }

    public static /* synthetic */ Object ipc$super(ezr ezrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/waitpay/extension/actionbar/TBWaitPayActionBarExtension");
    }

    @Override // tb.bt
    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        return "actionBar";
    }

    @Override // tb.bt
    public void m0(View view) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97812a3", new Object[]{this, view});
            return;
        }
        Context f = B().f();
        if ((f instanceof Activity) && (viewGroup = (ViewGroup) ((Activity) f).findViewById(R.id.tb_wait_pay_detail_custom_action_bar)) != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
    }
}
