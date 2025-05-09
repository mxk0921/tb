package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yuu extends nu1 implements View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516087);
    }

    public yuu(MUSDKInstance mUSDKInstance, int i) {
        super(mUSDKInstance, "longtap", i);
    }

    public static /* synthetic */ Object ipc$super(yuu yuuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/event/UILongClickHandler");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        a();
        return true;
    }
}
