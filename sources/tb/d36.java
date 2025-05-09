package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.f2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d36 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_LOCALIMAGE = -3536948596548552968L;

    public static /* synthetic */ Object ipc$super(d36 d36Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/parser/DXLocalImageParser");
    }

    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("409026f", new Object[]{this, context, str})).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
            } catch (Exception unused) {
                return 0;
            }
        }
        return context.getResources().getIdentifier(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Context x;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if ((obj instanceof String) && (a2 = a((x = DinamicXEngine.x()), (String) obj)) != 0) {
            return x.getDrawable(a2);
        }
        return null;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return f2.g;
    }
}
