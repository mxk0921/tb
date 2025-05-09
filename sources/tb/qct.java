package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qct implements IDxItemClickService.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f26672a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(qct qctVar) {
        }
    }

    static {
        t2o.a(491782361);
        t2o.a(488636552);
    }

    public qct(cfc cfcVar) {
        this.f26672a = cfcVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.b
    public Map<String, String> a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9af0cc2", new Object[]{this, baseSectionModel, baseSubItemModel});
        }
        if (!TextUtils.equals("icon_and_miniapp_nomore_2019_v1", baseSectionModel.getSectionBizCode())) {
            return null;
        }
        String itemBizCode = baseSubItemModel.getItemBizCode();
        IIconService iIconService = (IIconService) this.f26672a.a(IIconService.class);
        if (iIconService == null) {
            fve.e("TargetUrlParamsCreatorImpl", "iconService == null");
            return null;
        }
        JSONObject popLayerData = iIconService.getPopLayerData(itemBizCode);
        if (popLayerData == null) {
            fve.e("TargetUrlParamsCreatorImpl", "passParamsData == null");
            return null;
        } else if (!c(iIconService, itemBizCode)) {
            fve.e("TargetUrlParamsCreatorImpl", "参数校验异常");
            iIconService.clearPopLayerData(itemBizCode);
            return null;
        } else {
            Map<String, String> b = b(popLayerData);
            iIconService.clearPopLayerData(itemBizCode);
            return b;
        }
    }

    public final Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dc1bab62", new Object[]{this, jSONObject});
        }
        try {
            return (Map) JSON.parseObject(jSONObject.toJSONString(), new a(this), new Feature[0]);
        } catch (Exception unused) {
            fve.e("TargetUrlParamsCreatorImpl", "解析参数异常");
            return null;
        }
    }

    public final boolean c(IIconService iIconService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fec8ea84", new Object[]{this, iIconService, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            fve.e("TargetUrlParamsCreatorImpl", "itemBizCode == null");
            return false;
        } else if (iIconService.isPassPopLayerDataAvailable(str)) {
            return true;
        } else {
            fve.e("TargetUrlParamsCreatorImpl", "参数已过期");
            return false;
        }
    }
}
