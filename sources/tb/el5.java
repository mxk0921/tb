package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class el5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETPAGEURL = -1385689482872492294L;

    static {
        t2o.a(614465667);
    }

    public static /* synthetic */ Object ipc$super(el5 el5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserGetPageUrl");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || !(dXRuntimeContext.h() instanceof Activity) || (intent = ((Activity) dXRuntimeContext.h()).getIntent()) == null || intent.getData() == null) {
            return null;
        }
        return intent.getData().toString();
    }
}
