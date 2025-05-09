package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GET_FESTIVAL = 8374386162445244297L;

    static {
        t2o.a(713031777);
    }

    public static /* synthetic */ Object ipc$super(zk5 zk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/parser/DXDataParserGetFestival");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        lor.c("DXDataParserGetFestival", "evalWithArgs", "----");
        if (objArr != null && objArr.length >= 2) {
            try {
                String obj = objArr[0].toString();
                String obj2 = objArr[1].toString();
                String obj3 = objArr.length > 2 ? objArr[2].toString() : null;
                lor.c("DXDataParserGetFestival", "evalWithArgs", "module = " + obj + "   festivalKey = " + obj2);
                String l = FestivalMgr.i().l(obj, obj2);
                StringBuilder sb = new StringBuilder("festivalValue = ");
                sb.append(l);
                lor.c("DXDataParserGetFestival", "evalWithArgs", sb.toString());
                return TextUtils.isEmpty(l) ? obj3 : l;
            } catch (Throwable th) {
                lor.c("DXDataParserGetFestival", "evalWithArgs", th.toString());
            }
        }
        return null;
    }
}
