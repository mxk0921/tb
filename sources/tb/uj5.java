package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_DETAILSKUGETSCROLLED;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f29414a;

    static {
        t2o.a(912262662);
        long a2 = k06.a("detailSKUGetScrolled");
        DX_EVENT_ID = a2;
        DX_PARSER_DETAILSKUGETSCROLLED = a2;
    }

    public uj5(Map<String, Integer> map) {
        this.f29414a = map;
    }

    public static /* synthetic */ Object ipc$super(uj5 uj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/DXDataParserDetailSKUGetScrolled");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map<String, Integer> map = this.f29414a;
        int i = -1;
        if (map == null || map.isEmpty()) {
            return -1;
        }
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return -1;
        }
        Integer num = this.f29414a.get(obj.toString());
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }
}
