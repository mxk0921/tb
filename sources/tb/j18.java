package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j18 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AFTER_BUY_DX_MODULE = "afterBuyGuess";
    public static final int GUESS_BIZ_ID = 53;
    public static final String GUESS_BIZ_NAME = "guess";
    public static final String HOMEPAGE_DX_MODULE = "informationFlow";

    static {
        t2o.a(486539395);
    }

    public static <T> T a(Object[] objArr, int i, Class<T> cls) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f264cf6e", new Object[]{objArr, new Integer(i), cls});
        }
        if (objArr.length > i && (obj = objArr[i]) != null && obj.getClass().equals(cls)) {
            return (T) objArr[i];
        }
        return null;
    }

    public static String b(BaseSectionModel<?> baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4a6c786", new Object[]{baseSectionModel, str});
        }
        if (str == null) {
            return null;
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            ext = new JSONObject();
            baseSectionModel.put("ext", (Object) ext);
        }
        JSONObject jSONObject = ext.getJSONObject("clientCache");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            ext.put("clientCache", (Object) jSONObject);
        }
        return jSONObject.getString(str);
    }

    public static cfc c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("87c18a45", new Object[]{dXRuntimeContext});
        }
        InfoFlowDxUserContext d = d(dXRuntimeContext);
        if (d == null) {
            return null;
        }
        return d.getInfoFlowContext();
    }

    public static InfoFlowDxUserContext d(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowDxUserContext) ipChange.ipc$dispatch("89374a93", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        fl6 S = dXRuntimeContext.S();
        if (!(S instanceof InfoFlowDxUserContext)) {
            return null;
        }
        return (InfoFlowDxUserContext) S;
    }

    public static BaseSectionModel<?> e(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("9f93a8ac", new Object[]{dXRuntimeContext});
        }
        InfoFlowDxUserContext d = d(dXRuntimeContext);
        if (d == null) {
            return null;
        }
        return d.getBaseSectionModel();
    }

    public static void f(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7aa2918", new Object[]{baseSectionModel, str, str2});
        } else if (str != null && str2 != null) {
            JSONObject ext = baseSectionModel.getExt();
            if (ext == null) {
                ext = new JSONObject();
                baseSectionModel.put("ext", (Object) ext);
            }
            JSONObject jSONObject = ext.getJSONObject("clientCache");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                ext.put("clientCache", (Object) jSONObject);
            }
            jSONObject.put(str, (Object) str2);
        }
    }
}
