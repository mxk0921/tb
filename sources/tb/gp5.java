package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_POPFETCHVIEWFRAME = 317648871599141328L;

    public static /* synthetic */ Object ipc$super(gp5 gp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/dx/parser/DXDataParserPopFetchViewFrame");
    }

    public final JSONObject b(Context context, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d7e53ec3", new Object[]{this, context, dinamicXEngine});
        }
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(16);
        jSONObject.put("screenW", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, pb6.s(context))));
        jSONObject.put("screenH", (Object) Double.valueOf(pb6.A(dinamicXEngine, context, pb6.r(context) + tcm.i(context)) + 0.5d));
        return jSONObject;
    }

    public View c(bbd bbdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("25df1edc", new Object[]{this, bbdVar, str});
        }
        if (TextUtils.isEmpty(str)) {
            vfm.f("PopFetchViewFrame ", "sectionBizCode is empty");
            return null;
        }
        int a2 = bbdVar.a(str);
        if (a2 >= 0) {
            return bbdVar.findItemViewByPosition(a2);
        }
        vfm.f("PopFetchViewFrame ", "no pos in feeds, sectionBizCode=" + str);
        return null;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25635ee6", new Object[]{this})).floatValue();
        }
        try {
            return Float.valueOf(qhm.b("default", PopConst.STATIC_KEY_ICON_SCROLL_OFFSET)).floatValue();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        View view;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context h = dXRuntimeContext.h();
        String str2 = dXRuntimeContext.p().f7343a;
        if (h == null) {
            return null;
        }
        DinamicXEngine r = dXRuntimeContext.r();
        JSONObject b = b(h, r);
        if (objArr == null || objArr.length < 1 || objArr[0] == null) {
            vfm.f("PopFetchViewFrame ", "operationList is empty, template=" + str2);
            return b;
        }
        e3b g = tcm.g(dXRuntimeContext);
        if (g == null) {
            vfm.f("PopFetchViewFrame ", "engine is null, template=" + str2);
            return b;
        }
        View c = c(g.k(), objArr[0].toString());
        if (c == null) {
            vfm.f("PopFetchViewFrame ", "rootView is null, template=" + str2);
            return b;
        }
        if (objArr.length <= 1 || (obj = objArr[1]) == null) {
            str = null;
            view = c;
        } else {
            String obj2 = obj.toString();
            view = tcm.d(c, obj2);
            str = obj2;
        }
        if (view == null) {
            vfm.f("PopFetchViewFrame ", "anchorView is null, itemBizCode=" + str + ", template=" + str2);
            return b;
        }
        JSONObject a2 = a(h, r, c, view, b);
        vfm.f("PopFetchViewFrame ", "frame info=" + a2.toJSONString());
        return a2;
    }

    public final JSONObject a(Context context, DinamicXEngine dinamicXEngine, View view, View view2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2cf43a96", new Object[]{this, context, dinamicXEngine, view, view2, jSONObject});
        }
        jSONObject.put("width", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, view2.getWidth())));
        jSONObject.put("height", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, view2.getHeight())));
        jSONObject.put("x", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, view2.getX())));
        jSONObject.put("y", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, view2.getY())));
        jSONObject.put("offsetX", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, d())));
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        jSONObject.put("xOnScreen", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, iArr[0])));
        jSONObject.put("yOnScreen", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, iArr[1])));
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        jSONObject.put("xInRootView", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, iArr[0] - iArr2[0])));
        jSONObject.put("yInRootView", (Object) Integer.valueOf(pb6.A(dinamicXEngine, context, iArr[1] - iArr2[1])));
        return jSONObject;
    }
}
