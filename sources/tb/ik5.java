package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ik5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_FETCHICONLINE = 7208901696738191400L;

    static {
        t2o.a(491782589);
    }

    public static /* synthetic */ Object ipc$super(ik5 ik5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/pop/dx/parser/DXDataParserFetchIconLine");
    }

    public final int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a74ef70d", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (Throwable th) {
            vfm.d("getIntegerValue error", th);
            return -1;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 1) {
            vfm.f("FetchIconLine ", "operationList is empty");
            return null;
        }
        Object obj = objArr[0];
        String obj2 = obj == null ? null : obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            vfm.f("FetchIconLine ", "itemBizCode is empty");
            return null;
        }
        BaseSectionModel<?> e = j18.e(dXRuntimeContext);
        BaseSubSectionModel subSection = e == null ? null : e.getSubSection();
        if (subSection == null) {
            return null;
        }
        Iterator<String> it = subSection.keySet().iterator();
        int i = -1;
        int i2 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject2 = subSection.getJSONObject(next);
            if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("item")) == null)) {
                Iterator<String> it2 = jSONObject.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next2 = it2.next();
                    JSONObject jSONObject3 = jSONObject.getJSONObject(next2);
                    if (jSONObject3 != null && TextUtils.equals(obj2, jSONObject3.getString("itemBizCode"))) {
                        i2 = a(next2);
                        break;
                    }
                }
                if (i2 >= 0) {
                    i = a(next);
                    break;
                }
            }
        }
        if (i2 < 0 || i < 0) {
            return null;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(pg1.ATOM_EXT_row, (Object) Integer.valueOf(i2));
        jSONObject4.put(pg1.ATOM_EXT_column, (Object) Integer.valueOf(i));
        return jSONObject4;
    }
}
