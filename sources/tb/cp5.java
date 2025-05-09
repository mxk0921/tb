package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_PARAMINPAGEURL = -4690200579901030266L;

    static {
        t2o.a(614465674);
    }

    public static /* synthetic */ Object ipc$super(cp5 cp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserParamInPageUrl");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0 || dXRuntimeContext == null || !(dXRuntimeContext.h() instanceof Activity) || (intent = ((Activity) dXRuntimeContext.h()).getIntent()) == null || intent.getData() == null)) {
            try {
                String queryParameter = intent.getData().getQueryParameter((String) objArr[0]);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return URLDecoder.decode(queryParameter, "UTF-8");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
