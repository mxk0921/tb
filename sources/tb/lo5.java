package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lo5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MTBFESTIVAL = 4282954739673014924L;

    /* renamed from: a  reason: collision with root package name */
    public String f23465a;
    public String b;
    public String c;
    public long d;

    static {
        t2o.a(745538089);
    }

    public static /* synthetic */ Object ipc$super(lo5 lo5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtbFestival");
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
                if (this.c != null && System.currentTimeMillis() - this.d <= 1000 && TextUtils.equals(this.f23465a, obj) && TextUtils.equals(this.b, obj2)) {
                    return this.c;
                }
                String l = FestivalMgr.i().l(obj, obj2);
                this.f23465a = obj;
                this.b = obj2;
                this.d = System.currentTimeMillis();
                if (TextUtils.isEmpty(l)) {
                    this.c = str;
                    return str;
                }
                this.c = l;
                return l;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
