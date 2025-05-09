package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782853);
    }

    public static boolean a(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c650dfb", new Object[]{baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null || (args = baseSectionModel.getArgs()) == null) {
            return false;
        }
        return TextUtils.equals("1", args.getString(jtv.S_ARGS_IS_CLIENT_CACHE));
    }

    public static boolean b(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("197525ad", new Object[]{iMainFeedsViewService})).booleanValue();
        }
        if (iMainFeedsViewService == null) {
            return false;
        }
        return a(iMainFeedsViewService.findItemDataByPosition(0));
    }
}
