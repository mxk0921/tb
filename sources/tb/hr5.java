package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.WindowInsets;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVIPADSCREENSIZE = 6916119436215133091L;

    static {
        t2o.a(806355433);
    }

    public static /* synthetic */ Object ipc$super(hr5 hr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/parser/DXDataParserTBLVIPadScreenSize");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        WindowInsets rootWindowInsets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(dXRuntimeContext == null || objArr == null || objArr.length == 0 || !(objArr[0] instanceof String) || !(dXRuntimeContext.h() instanceof Activity))) {
            String str = (String) objArr[0];
            if (arq.a(str)) {
                return null;
            }
            if ("width".equals(str)) {
                return Float.valueOf(pb6.C(dXRuntimeContext.h(), TBAutoSizeConfig.x().H(dXRuntimeContext.h())));
            }
            if ("height".equals(str)) {
                TBAutoSizeConfig.x().B(dXRuntimeContext.h());
                if (sj7.k(dXRuntimeContext.h())) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Context h = dXRuntimeContext.h();
                        rootWindowInsets = ((Activity) dXRuntimeContext.h()).getWindow().getDecorView().getRootWindowInsets();
                        if (sj7.n(h, rootWindowInsets)) {
                            i = sj7.g(dXRuntimeContext.h()) + sj7.i(dXRuntimeContext.h());
                        }
                    }
                    i = sj7.g(dXRuntimeContext.h());
                } else if (sj7.l(dXRuntimeContext.h())) {
                    i = sj7.e(dXRuntimeContext.h());
                } else {
                    i = sj7.g(dXRuntimeContext.h());
                }
                return Float.valueOf(pb6.C(dXRuntimeContext.h(), i));
            }
        }
        return null;
    }
}
