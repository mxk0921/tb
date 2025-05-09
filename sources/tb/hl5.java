package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hl5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GET_STATUS_BAR_HEIGHT = -8012456084283088572L;

    /* renamed from: a  reason: collision with root package name */
    public int f20719a = 0;
    public int b = 0;

    static {
        t2o.a(713031778);
    }

    public static /* synthetic */ Object ipc$super(hl5 hl5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/parser/DXDataParserGetStatusBarHeight");
    }

    public final int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{this, context, new Float(f)})).intValue();
        }
        return (int) (f / context.getResources().getDisplayMetrics().density);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        lor.c("DXDataParserGetStatusBa", "evalWithArgs", "----");
        if (this.f20719a == 0) {
            this.b = SystemBarDecorator.getStatusBarHeight(dXRuntimeContext.h());
            this.f20719a = a(dXRuntimeContext.h(), this.b);
        }
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof String)) {
            lor.c("DXDataParserGetStatusBa", "evalWithArgs", "statusBarHeightDp = " + this.f20719a);
            return this.f20719a + "np";
        }
        int p = this.b + pb6.p(dXRuntimeContext.r(), dXRuntimeContext.h(), (String) objArr[0], 0);
        return a(dXRuntimeContext.h(), p) + "np";
    }
}
