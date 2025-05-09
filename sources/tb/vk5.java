package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vk5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETDATAFROMMODEL = 7444296532363656600L;

    static {
        t2o.a(486539377);
    }

    public static /* synthetic */ Object ipc$super(vk5 vk5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserGetDataFromModel");
    }

    public final Object a(String str, String str2, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("766d6394", new Object[]{this, str, str2, cfcVar});
        }
        List<BaseSectionModel<?>> b = b(cfcVar);
        if (b == null || b.isEmpty()) {
            fve.e("DXDataParserGetDataFromModel", "totalDataList == null");
            return null;
        }
        for (BaseSectionModel<?> baseSectionModel : b) {
            if (baseSectionModel.getSectionBizCode().equals(str)) {
                return baseSectionModel.get(str2);
            }
        }
        return null;
    }

    public final List<BaseSectionModel<?>> b(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c6d2be4", new Object[]{this, cfcVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("DXDataParserGetDataFromModel", "containerDataService == null");
            return Collections.emptyList();
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData != null) {
            return containerData.getTotalData();
        }
        fve.e("DXDataParserGetDataFromModel", "containerDataModel == null");
        return Collections.emptyList();
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        cfc c = j18.c(dXRuntimeContext);
        if (c != null) {
            return a((String) objArr[0], (String) objArr[1], c);
        }
        fve.e("DXDataParserGetDataFromModel", "infoFlowContext == null");
        return null;
    }
}
