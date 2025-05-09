package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class we0 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ADDPARAMTONDTARGETURL = 2642403046850745630L;

    static {
        t2o.a(491782319);
    }

    public static BaseSubItemModel a(BaseSectionModel<?> baseSectionModel) {
        BaseItemModel item;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubItemModel) ipChange.ipc$dispatch("2a4b65c3", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null || (item = baseSectionModel.getItem()) == null || item.getItemCount() <= 0) {
            return null;
        }
        return item.getBaseItemModel(0);
    }

    public static /* synthetic */ Object ipc$super(we0 we0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/containerflagservice/dx/AddParamToNDTargetUrlEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        String str = (String) j18.a(objArr, 0, String.class);
        String str2 = (String) j18.a(objArr, 1, String.class);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            fve.e("AddParamToNDTargetUrl", "paramValue or paramKey is null");
            return;
        }
        BaseSubItemModel a2 = a(j18.e(dXRuntimeContext));
        if (a2 != null) {
            String targetUrl = a2.getTargetUrl();
            if (!TextUtils.isEmpty(targetUrl) && !targetUrl.contains(str)) {
                Uri.Builder buildUpon = Uri.parse(targetUrl).buildUpon();
                buildUpon.appendQueryParameter(str, str2);
                a2.put("targetUrl", (Object) buildUpon.build().toString());
            }
        }
    }
}
