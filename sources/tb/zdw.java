package tb;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zdw extends MutableContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262111);
    }

    public zdw(Context context) {
        super(context.getApplicationContext());
        if (!jpt.a(context.getApplicationContext())) {
            context.getApplicationContext().setTheme(R.style.Theme_AppCompat_Wrapper);
        }
    }

    public static /* synthetic */ Object ipc$super(zdw zdwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/performance/ViewContext");
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93b0529", new Object[]{this, context});
        } else {
            setBaseContext(context);
        }
    }
}
