package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ir5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVIPADSCREENSIZE = 6916119436215133091L;

    static {
        t2o.a(310378533);
    }

    public static /* synthetic */ Object ipc$super(ir5 ir5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXDataParserTBLVIPadScreenSize");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(dXRuntimeContext == null || objArr == null || objArr.length == 0 || !(objArr[0] instanceof String) || !(dXRuntimeContext.h() instanceof Activity))) {
            String str = (String) objArr[0];
            if (lrq.a(str)) {
                return null;
            }
            if ("width".equals(str)) {
                return Float.valueOf(pb6.C(dXRuntimeContext.h(), TBAutoSizeConfig.x().H(dXRuntimeContext.h())));
            }
            if ("height".equals(str)) {
                int i = qw0.i((Activity) dXRuntimeContext.h());
                if (nvs.T()) {
                    i = qw0.i((Activity) dXRuntimeContext.h()) - sj7.c;
                }
                return Float.valueOf(pb6.C(dXRuntimeContext.h(), i));
            }
        }
        return null;
    }
}
