package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETDATAFROMMODEL = 7444296532363656600L;

    static {
        t2o.a(729809038);
    }

    public static /* synthetic */ Object ipc$super(wk5 wk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserGetDataFromModel");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            imn c = yyj.e().c();
            if (c != null) {
                for (SectionModel sectionModel : c.H(z4a.NEW_FACE_PARENT.f32522a)) {
                    if (TextUtils.equals(str, sectionModel.getString("sectionBizCode"))) {
                        return sectionModel.get(str2);
                    }
                }
            }
        }
        return null;
    }
}
