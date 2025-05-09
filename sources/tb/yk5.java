package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.homepage.pop.model.pop.PopData;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETFEEDBACKPOPANCHORINFO = -6294951729487811469L;

    static {
        t2o.a(491782590);
    }

    public static /* synthetic */ Object ipc$super(yk5 yk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/pop/dx/parser/DXDataParserGetFeedbackPopAnchorInfo");
    }

    public final View b(bbd bbdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("10f18041", new Object[]{this, bbdVar, str});
        }
        if (TextUtils.isEmpty(str) || bbdVar == null) {
            vfm.f("DXDataParserGetFeedbackPopAnchorInfo", "error params");
            return null;
        }
        int a2 = bbdVar.a(str);
        if (a2 >= 0) {
            return bbdVar.findItemViewByPosition(a2);
        }
        vfm.f("DXDataParserGetFeedbackPopAnchorInfo", "getPosBySectionBizCode is invalid: " + str);
        return null;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context h = dXRuntimeContext.h();
        JSONObject jSONObject = new JSONObject();
        if (h == null || objArr == null || objArr.length == 0) {
            vfm.f("DXDataParserGetFeedbackPopAnchorInfo", "invalid params");
            return jSONObject;
        }
        e3b g = tcm.g(dXRuntimeContext);
        DinamicXEngine r = dXRuntimeContext.r();
        IPopData<?> f = tcm.f(dXRuntimeContext);
        if (g != null && (f instanceof PopData) && f.getPopConfig() != null) {
            return a(h, r, jSONObject, g, f, objArr);
        }
        vfm.f("DXDataParserGetFeedbackPopAnchorInfo", "engine or popData is null");
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:26|(1:28)(2:30|(9:32|34|45|35|(1:37)|39|(1:41)(1:42)|43|44)(1:33))|29|34|45|35|(0)|39|(0)(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
        tb.vfm.f("DXDataParserGetFeedbackPopAnchorInfo", "popHeight number format error");
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8 A[Catch: NumberFormatException -> 0x00f3, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00f3, blocks: (B:35:0x00e5, B:37:0x00e8), top: B:45:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject a(android.content.Context r10, com.taobao.android.dinamicx.DinamicXEngine r11, com.alibaba.fastjson.JSONObject r12, tb.e3b r13, com.taobao.homepage.pop.protocol.model.pop.IPopData<?> r14, java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yk5.a(android.content.Context, com.taobao.android.dinamicx.DinamicXEngine, com.alibaba.fastjson.JSONObject, tb.e3b, com.taobao.homepage.pop.protocol.model.pop.IPopData, java.lang.Object[]):com.alibaba.fastjson.JSONObject");
    }
}
