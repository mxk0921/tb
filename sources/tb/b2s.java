package tb;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b2s extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long PARSER_ID = k06.a("theme");
    public static final String PARSER_NAME = "theme";
    public static final String TYPE_COLOR = "color";
    public static final String TYPE_GRADIENT = "gradient";
    public static final String TYPE_SIZE = "size";
    public static final String TYPE_STRING = "string";

    /* renamed from: a  reason: collision with root package name */
    public final e2s f16148a;

    public b2s(e2s e2sVar) {
        this.f16148a = e2sVar;
    }

    public static /* synthetic */ Object ipc$super(b2s b2sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/dinamicX/parser/TDTheme");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception e) {
            UnifyLog.e("TDTheme", String.valueOf(objArr), e.toString(), String.valueOf(dXRuntimeContext));
            return null;
        }
    }

    static {
        t2o.a(301989919);
    }

    public final Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3364cdfb", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr != null && objArr.length >= 3) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            String valueOf3 = String.valueOf(objArr[2]);
            e2s e2sVar = this.f16148a;
            List<String> a2 = e2sVar != null ? e2sVar.a(valueOf2) : null;
            if ("gradient".equalsIgnoreCase(valueOf)) {
                GradientDrawable b = f2s.b(a2);
                if (b != null) {
                    return b;
                }
                if (!TextUtils.isEmpty(valueOf3)) {
                    return f2s.d(valueOf3.split(SymbolExpUtil.SYMBOL_VERTICALBAR));
                }
            } else if ("color".equalsIgnoreCase(valueOf)) {
                if (a2 != null && a2.size() > 0) {
                    str = a2.get(0);
                }
                return f2s.g(str, -1) != -1 ? str : valueOf3;
            } else if ("size".equalsIgnoreCase(valueOf)) {
                if (a2 == null || a2.size() <= 0) {
                    return valueOf3;
                }
                String str2 = a2.get(0);
                return (i0r.d() || f2s.f(str2)) ? f2s.a(str2) : valueOf3;
            } else if ("string".equalsIgnoreCase(valueOf)) {
                if (a2 != null && a2.size() > 0) {
                    str = a2.get(0);
                }
                return TextUtils.isEmpty(str) ? valueOf3 : str;
            }
        }
        return null;
    }
}
