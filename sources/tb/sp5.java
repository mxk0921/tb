package tb;

import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.detail.rate.RateFeedsFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RATELISTUSERHEADPIC = 1177035568722277000L;

    public static /* synthetic */ Object ipc$super(sp5 sp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateListUserHeadPic");
    }

    public final String a(Object obj, Object obj2, DXRuntimeContext dXRuntimeContext) {
        RateFeedsFragment d;
        pg7 E2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6d1dbab", new Object[]{this, obj, obj2, dXRuntimeContext});
        }
        if (!(obj instanceof String) || !(obj2 instanceof String) || dXRuntimeContext == null) {
            return "";
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        if (!(dXRuntimeContext.h() instanceof FragmentActivity) || (d = i6v.INSTANCE.d((FragmentActivity) dXRuntimeContext.h(), dXRuntimeContext.r().v())) == null || d.D2() == null || (E2 = d.E2()) == null) {
            return str;
        }
        return E2.g(str, str2);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        if (objArr.length == 1) {
            return objArr[0];
        }
        if (!xgn.INSTANCE.m()) {
            return objArr[0];
        }
        return a(objArr[0], objArr[1], dXRuntimeContext);
    }
}
