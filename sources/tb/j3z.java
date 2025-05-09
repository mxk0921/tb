package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.edlp.windvane.TBEdlpWVPlugin;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j3z extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETTABLAYOUTLEFTICONINFO = -6118570526955472906L;

    static {
        t2o.a(729809537);
    }

    public static /* synthetic */ Object ipc$super(j3z j3zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/location/DXDataParserHGetTabLayoutLeftIconInfo");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        return h(g());
    }

    public final View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0ac536e", new Object[]{this});
        }
        z6d c = h2b.a().c();
        if (c == null) {
            return null;
        }
        return c.getRootView().findViewById(R.id.iv_left_top_icon);
    }

    public final JSONObject h(View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b191c782", new Object[]{this, view});
        }
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        Context context = view.getContext();
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        if (rect.width() == view.getWidth()) {
            z = true;
        }
        if (globalVisibleRect && z) {
            jSONObject.put(TBEdlpWVPlugin.KEY_LEFT_TOP_X_RPX, (Object) Integer.valueOf(trs.b(context, rect.left)));
            jSONObject.put(TBEdlpWVPlugin.KEY_LEFT_TOP_Y_RPX, (Object) Integer.valueOf(trs.b(context, rect.top)));
            jSONObject.put("rightBottomXRpx", (Object) Integer.valueOf(trs.b(context, rect.right)));
            jSONObject.put("rightBottomYRpx", (Object) Integer.valueOf(trs.b(context, rect.bottom)));
            jSONObject.put(TBEdlpWVPlugin.KEY_WIDTH_RPX, (Object) Integer.valueOf(trs.b(context, rect.right - rect.left)));
            jSONObject.put(TBEdlpWVPlugin.KEY_HEIGHT_RPX, (Object) Integer.valueOf(trs.b(context, rect.bottom - rect.top)));
            jSONObject.put(TBEdlpWVPlugin.KEY_CENTER_X_RPX, (Object) Integer.valueOf(trs.b(context, (rect.right + rect.left) >> 1)));
            jSONObject.put(TBEdlpWVPlugin.KEY_CENTER_Y_RPX, (Object) Integer.valueOf(trs.b(context, (rect.bottom + rect.top) >> 1)));
        }
        return jSONObject;
    }
}
