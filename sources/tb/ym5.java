package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend4.manager.a;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ym5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INFOFLOWCARDWIDTH = -8936854687533104177L;

    static {
        t2o.a(729809049);
    }

    public static /* synthetic */ Object ipc$super(ym5 ym5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserInfoFlowCardWidthAfterBuy");
    }

    public final int a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d90ad48", new Object[]{this, aVar})).intValue();
        }
        JSONObject ext = aVar.getExt();
        if (ext == null) {
            return 0;
        }
        try {
            return ext.getIntValue("cardSpace");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final a b(fl6 fl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("69e23e50", new Object[]{this, fl6Var});
        }
        if (!(fl6Var instanceof RecommendDxUserContext)) {
            return null;
        }
        Object object = ((RecommendDxUserContext) fl6Var).getObject("rmd_container");
        if (!(object instanceof WeakReference)) {
            return null;
        }
        Object obj = ((WeakReference) object).get();
        if (!(obj instanceof a)) {
            return null;
        }
        return (a) obj;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.r() == null) {
            return Integer.valueOf(pb6.c(Globals.getApplication(), 171.0f));
        }
        Context h = dXRuntimeContext.h();
        DinamicXEngine r = dXRuntimeContext.r();
        int c = unn.c(r);
        if (c != -1) {
            return Integer.valueOf(c);
        }
        a b = b(dXRuntimeContext.S());
        if (b == null) {
            bqa.d("DXDataParserInfoFlowCardWidthAfterBuy", "can't get container");
            return Integer.valueOf(pb6.d(r, h, 171.0f));
        }
        int H = TBAutoSizeConfig.x().H(h);
        int k = b.k();
        if (k > 0) {
            H = k;
        }
        JSONObject i = dXRuntimeContext.i();
        int d = (i == null || (jSONObject = i.getJSONObject("ext")) == null) ? 0 : pb6.d(r, h, jSONObject.getIntValue("marginSide") / 2);
        int g = b.g();
        if (g <= 0) {
            bqa.d("DXDataParserInfoFlowCardWidthAfterBuy", "column error");
            return Integer.valueOf(pb6.d(r, h, 171.0f));
        }
        int d2 = pb6.d(r, h, a(b) / 2);
        if (d2 <= 0) {
            return Integer.valueOf(pb6.d(r, h, 171.0f));
        }
        int max = Math.max(Math.round(((H - (d * 2)) - ((g - 1) * d2)) / g), 0);
        unn.a(r, max);
        bqa.d("DXDataParserInfoFlowCardWidthAfterBuy", "info flow card width: " + max + " screenWidth: " + H + " marginSide: " + d + " column: " + g + " space: " + d2);
        return Integer.valueOf(max);
    }
}
