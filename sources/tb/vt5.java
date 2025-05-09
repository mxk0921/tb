package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUTO_CLEAR_VIDEO = "autoClearVideo";
    public static final String AUTO_HANDLE_APPLICATION_EVENT = "autoHandleApplicationEvent";
    public static final long DX_PARSER_VIDEOCONTROLCONFIG = -7801350391660369312L;
    public static final String LOOP_PLAY = "isLoop";
    public static final String MAX_PLATING_VIDEO = "maxParallelCount";
    public static final String ORDER = "order";
    public static final String PLAY_DELAY = "timeFactor";
    public static final String REFRESH_VIDEO_PLAY_CONTROL = "refreshVideoPlayControl";
    public static final String VIEW_AREA_PERCENT = "spaceFactor";
    public static final String WIDGET_CLASS = "widgetClass";

    static {
        t2o.a(444596799);
    }

    public static /* synthetic */ Object ipc$super(vt5 vt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserVideoControlConfig");
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "videoControlConfig";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr.length != 1) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (!jSONObject.containsKey(WIDGET_CLASS)) {
            return null;
        }
        DXVideoControlConfig<iew> n = DXVideoControlConfig.n();
        if (jSONObject.containsKey(VIEW_AREA_PERCENT)) {
            n.m(jSONObject.getFloatValue(VIEW_AREA_PERCENT));
        }
        if (jSONObject.containsKey(MAX_PLATING_VIDEO)) {
            n.d(jSONObject.getIntValue(MAX_PLATING_VIDEO));
        }
        if (jSONObject.containsKey(PLAY_DELAY)) {
            n.f(jSONObject.getLongValue(PLAY_DELAY));
        }
        if (jSONObject.containsKey(REFRESH_VIDEO_PLAY_CONTROL)) {
            n.i(jSONObject.getBooleanValue(REFRESH_VIDEO_PLAY_CONTROL));
        }
        if (jSONObject.containsKey(LOOP_PLAY)) {
            n.c(jSONObject.getBooleanValue(LOOP_PLAY));
        }
        if (jSONObject.containsKey("order")) {
            n.e(jSONObject.getIntValue("order"));
        }
        if (jSONObject.containsKey(AUTO_CLEAR_VIDEO)) {
            n.b(jSONObject.getBooleanValue(AUTO_CLEAR_VIDEO));
        }
        if (jSONObject.containsKey(AUTO_HANDLE_APPLICATION_EVENT)) {
            n.a(jSONObject.getBooleanValue(AUTO_HANDLE_APPLICATION_EVENT));
        }
        n.j(true);
        try {
            Object obj2 = jSONObject.get(WIDGET_CLASS);
            JSONArray jSONArray = new JSONArray();
            if (obj2 instanceof String) {
                jSONArray.add(obj2);
            }
            if (obj2 instanceof JSONArray) {
                jSONArray.addAll((JSONArray) obj2);
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                Class<?> cls = Class.forName(jSONArray.getString(i));
                if (DXWidgetNode.class.isAssignableFrom(cls)) {
                    n.l(cls);
                }
            }
            return n;
        } catch (Exception e) {
            xv5.b(e);
            return null;
        }
    }
}
