package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iyo extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f21651a;
    public static final String PARSER_TAG = "xskuGetScrolled";
    public static final long DX_PARSER_ID = k06.a(PARSER_TAG);

    public iyo(Map<String, Integer> map) {
        this.f21651a = map;
        if (cjz.a()) {
            SkuLogUtils.x("ScrollInitOffset_init");
        }
    }

    public static /* synthetic */ Object ipc$super(iyo iyoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/dinamicx/parser/ScrollInitOffset");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map<String, Integer> map = this.f21651a;
        if (map == null || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || (num = map.get(obj.toString())) == null) {
            return -1;
        }
        return num;
    }

    static {
        t2o.a(442499173);
    }
}
