package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class puu extends nu1 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516086);
    }

    public puu(MUSDKInstance mUSDKInstance, int i) {
        super(mUSDKInstance, "click", i);
    }

    public static /* synthetic */ Object ipc$super(puu puuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/event/UIClickHandler");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            a();
        }
    }
}
