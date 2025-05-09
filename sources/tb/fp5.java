package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_POPANCHORFRAME = -5235842846943672669L;

    public static /* synthetic */ Object ipc$super(fp5 fp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/parser/DXDataParserPopAnchorFrame");
    }

    public View b(bbd bbdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("25df1edc", new Object[]{this, bbdVar, str});
        }
        if (TextUtils.isEmpty(str)) {
            vfm.f("DXDataParserPopAnchorFrame", "sectionBizCode is empty");
            return null;
        }
        int a2 = bbdVar.a(str);
        if (a2 >= 0) {
            return bbdVar.findItemViewByPosition(a2);
        }
        vfm.f("DXDataParserPopAnchorFrame", "no pos in feeds, sectionBizCode=" + str);
        return null;
    }

    public final JSONObject a(Context context, DinamicXEngine dinamicXEngine, e3b e3bVar, IPopData iPopData, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b023c45f", new Object[]{this, context, dinamicXEngine, e3bVar, iPopData, view, jSONObject});
        }
        jSONObject.put("width", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, view.getWidth())));
        jSONObject.put("height", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, view.getHeight())));
        View l = e3bVar.l(iPopData.getPopConfig() == null ? 1 : iPopData.getPopConfig().getHierarchy());
        if (l == null) {
            vfm.f("DXDataParserPopAnchorFrame", "popContainer is null");
            return jSONObject;
        }
        if ((l.getWidth() <= 0 || l.getHeight() <= 0) && l.getParent() != null) {
            l = (ViewGroup) l.getParent();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        l.getLocationOnScreen(iArr2);
        jSONObject.put("xInPopContainer", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, iArr[0] - iArr2[0])));
        jSONObject.put("yInPopContainer", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, iArr[1] - iArr2[1])));
        return jSONObject;
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        View view;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context h = dXRuntimeContext.h();
        DinamicXEngine r = dXRuntimeContext.r();
        if (h == null || r == null || objArr == null || objArr.length == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        e3b g = tcm.g(dXRuntimeContext);
        IPopData f = tcm.f(dXRuntimeContext);
        if (g == null || f == null) {
            vfm.f("DXDataParserPopAnchorFrame", "not found HomePopEngine");
            return jSONObject;
        }
        String obj = objArr[0].toString();
        if (TextUtils.isEmpty(obj)) {
            vfm.f("DXDataParserPopAnchorFrame", "sectionBizCode is empty");
            return jSONObject;
        }
        if (objArr.length > 1) {
            str = objArr[1].toString();
        } else {
            str = "";
        }
        if (objArr.length <= 2 || !Boolean.parseBoolean(objArr[2].toString())) {
            z = false;
        }
        if (z) {
            view = g.h().j(obj);
        } else {
            view = b(g.k(), obj);
        }
        vfm.f("DXDataParserPopAnchorFrame", "pop is main container: " + z);
        if (view == null) {
            vfm.f("DXDataParserPopAnchorFrame", "not found rootView sectionBizCode=" + obj);
            return jSONObject;
        }
        if (!TextUtils.isEmpty(str)) {
            View d = tcm.d(view, str);
            if (d != null) {
                view = d;
            } else {
                vfm.f("DXDataParserPopAnchorFrame", "not found childView itemBizCode=" + str);
            }
        }
        a(h, r, g, f, view, jSONObject);
        vfm.f("DXDataParserPopAnchorFrame", "popAnchorFrame: " + jSONObject.toJSONString());
        return jSONObject;
    }
}
