package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_FESTIVAL = 2628258857601624166L;

    static {
        t2o.a(473956366);
    }

    public static /* synthetic */ Object ipc$super(hk5 hk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/parser/DXDataParserFestival");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            try {
                String obj = objArr[0].toString();
                String obj2 = objArr[1].toString();
                if (objArr.length > 2) {
                    str = objArr[2].toString();
                } else {
                    str = null;
                }
                String l = FestivalMgr.i().l(obj, obj2);
                if (TextUtils.isEmpty(l)) {
                    return str;
                }
                return l;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
