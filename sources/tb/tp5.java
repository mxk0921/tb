package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taobao.R;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class tp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_RATEUNITEXCHANGE = 1120268768613412447L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(tp5 tp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/parser/DXDataParserRateUnitExchange");
    }

    public final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a93c9aa7", new Object[]{this, new Integer(i)});
        }
        if (i > 100000) {
            return dx1.Companion.b(R.string.rate_over_100k);
        }
        if (10000 <= i && 100000 >= i) {
            return tsq.E(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(i / 10000)}, 1)) + dx1.Companion.b(R.string.rate_ten_thousand), ",", ".", false, 4, null);
        } else if (1000 > i || 9999 < i) {
            return String.valueOf(i);
        } else {
            return tsq.E(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(i / 1000)}, 1)) + dx1.Companion.b(R.string.rate_thousand), ",", ".", false, 4, null);
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        try {
            Object obj = objArr[0];
            if (obj instanceof String) {
                if (obj != null) {
                    return a(Integer.parseInt((String) obj));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } else if (!(obj instanceof Integer)) {
                return obj;
            } else {
                if (obj != null) {
                    return a(((Integer) obj).intValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        } catch (Throwable unused) {
            return objArr[0];
        }
    }
}
