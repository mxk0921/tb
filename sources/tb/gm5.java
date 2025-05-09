package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gm5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HICONOVERLAYGETDATA = 8978819794289704064L;

    static {
        t2o.a(491782400);
    }

    public static /* synthetic */ Object ipc$super(gm5 gm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconoverlayservice/impl/DXDataParserHIconOverlayGetData");
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd935064", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject.containsKey(i2b.TRACK_EXPOSURE_PARAM)) {
            try {
                JSONObject jSONObject3 = (JSONObject) jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM).clone();
                JSONObject jSONObject4 = jSONObject3.getJSONObject("args");
                if (jSONObject4 == null) {
                    jSONObject3.put("args", (Object) jSONObject2);
                } else {
                    boolean equals = "1".equals(jSONObject2.getString("argsType"));
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        if (!equals) {
                            jSONObject4.put(entry.getKey(), entry.getValue());
                        } else if (!jSONObject4.containsKey(entry.getKey())) {
                            jSONObject4.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                vve.m(jSONObject3, null);
            } catch (Throwable th) {
                fve.c("DXDataParserHIconOverlayGetData", "AutoExposureUtils", th);
            }
        }
    }

    public final JSONObject b(BaseSectionModel<?> baseSectionModel, String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8082e577", new Object[]{this, baseSectionModel, str, jSONObject, new Integer(i)});
        }
        try {
            JSONObject c = c(baseSectionModel);
            if (c == null) {
                fve.e("DXDataParserHIconOverlayGetData", "no iconOverlay found!");
                return null;
            }
            JSONObject jSONObject2 = c.getJSONObject("item");
            if (jSONObject2 != null && jSONObject2.size() >= i) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(String.valueOf(i));
                return (jSONObject3 == null || TextUtils.equals(str, jSONObject3.getString("itemBizCode"))) ? d(i, jSONObject, jSONObject2, c.getJSONObject("ext").getInteger("itemCount").intValue()) : jSONObject3;
            }
            fve.e("DXDataParserHIconOverlayGetData", "no enough item!");
            return null;
        } catch (Throwable th) {
            fve.e("DXDataParserHIconOverlayGetData", "get item failed" + th.toString());
            return null;
        }
    }

    public final JSONObject c(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("292d34d0", new Object[]{this, baseSectionModel});
        }
        BaseSubSectionModel subSection = baseSectionModel.getSubSection();
        if (subSection != null && !subSection.isEmpty()) {
            return (JSONObject) subSection.get("iconOverlay");
        }
        fve.e("DXDataParserHIconOverlayGetData", "no subSection found!");
        return null;
    }

    public final JSONObject d(int i, JSONObject jSONObject, JSONObject jSONObject2, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d40c1163", new Object[]{this, new Integer(i), jSONObject, jSONObject2, new Integer(i2)});
        }
        int i4 = i + 1;
        if (i4 < i2) {
            i3 = i4;
        }
        jSONObject.put("currentIndex", (Object) Integer.valueOf(i3));
        return jSONObject2.getJSONObject(String.valueOf(i3));
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            String valueOf3 = objArr.length >= 3 ? String.valueOf(objArr[2]) : null;
            BaseSectionModel<?> e = j18.e(dXRuntimeContext);
            if (e == null || !TextUtils.equals(valueOf, e.getSectionBizCode())) {
                fve.e("DXDataParserHIconOverlayGetData", "not current widget!");
            } else {
                JSONObject jSONObject = e.getExt().getJSONObject("clientCache");
                if (jSONObject == null) {
                    e.getExt().put("clientCache", (Object) new JSONObject());
                }
                if (jSONObject.containsKey("currentIndex")) {
                    i = jSONObject.getInteger("currentIndex").intValue();
                }
                if (jSONObject.containsKey("beReplacedBiz")) {
                    str = jSONObject.getString("beReplacedBiz");
                } else {
                    str = "";
                }
                JSONObject b = b(e, str, jSONObject, i);
                if (b != null) {
                    jSONObject.put(valueOf2, (Object) b);
                }
                if (TextUtils.equals(valueOf3, "finish")) {
                    jSONObject.put("currentIndex", (Object) Integer.valueOf(i + 1));
                    a(b, e.getArgs());
                }
                return b;
            }
        }
        return null;
    }
}
