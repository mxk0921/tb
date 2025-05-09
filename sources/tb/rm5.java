package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIGHLIGHT_STRUCT_JSON_STR = -5424885194204731482L;

    static {
        t2o.a(779092675);
    }

    public static /* synthetic */ Object ipc$super(rm5 rm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/structLayout/utils/DXDataParserHighlight_struct_json_str");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject parseObject;
        Object obj;
        LiveTimemovingModel liveTimemovingModel;
        LiveItem.Ext ext;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0 || TextUtils.isEmpty(String.valueOf(objArr[0])) || (parseObject = JSON.parseObject(String.valueOf(objArr[0]))) == null)) {
            int j = zqq.j(parseObject.getString("selectedItemIndex"));
            JSONArray jSONArray = parseObject.getJSONObject("model").getJSONArray("timeMovingList");
            if (jSONArray != null && jSONArray.size() > j && (obj = jSONArray.get(j)) != null && (liveTimemovingModel = (LiveTimemovingModel) JSON.parseObject(JSON.toJSONString(obj), LiveTimemovingModel.class)) != null && (ext = liveTimemovingModel.extendVal) != null && (str = ext.timeMovingPlayInfo) != null) {
                return str;
            }
        }
        return null;
    }
}
