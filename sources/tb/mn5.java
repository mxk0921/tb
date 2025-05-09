package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.rate.DetailRatePrefetchAbility;
import com.taobao.android.detail.ttdetail.handler.atomic.CallAblAbility;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_ITEMSUPPORT;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f24161a = uug.a(kqv.NAME, DetailRatePrefetchAbility.NAME, CallAblAbility.NAME);

    static {
        t2o.a(912261750);
        long a2 = k06.a("itemSupport");
        DX_EVENT_ID = a2;
        DX_PARSER_ITEMSUPPORT = a2;
    }

    public static /* synthetic */ Object ipc$super(mn5 mn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/DXDataParserItemSupport");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return Boolean.FALSE;
        }
        String str = (String) objArr[0];
        boolean contains = this.f24161a.contains(str);
        tgh.b("DXDataParserItemSupport", "dxAtomicName : " + str + " contains : " + contains);
        return Boolean.valueOf(contains);
    }
}
