package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadItem;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fnm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DISABLE_PARSE_DELIVER = "disableParseDeliver";
    public static final String KEY_ENABLE_SIMPLE_DELIVER = "enableSimpleDeliver";
    public static final String KEY_TARGET_PARAMS = "targetParams";
    public static final String KEY_TARGET_TYPE = "targetType";
    public static final String TARGET_TYPE_LITE_DETAIL = "liteDetail";
    public static final String TARGET_TYPE_MINI_APP = "miniApp";
    public static final String TARGET_TYPE_NEW_DETAIL = "newDetail";
    public static final String TARGET_TYPE_SINGLE_DRESS_UP = "dressup";

    static {
        t2o.a(491782427);
    }

    public static PreLoadModel d(List<? extends BaseSectionModel> list, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadModel) ipChange.ipc$dispatch("36301fd0", new Object[]{list, new Integer(i), str, str2});
        }
        if (ObjectUtils.c(list)) {
            fve.e("PreLoadModelCreator", "ParsePreLoadModel sectionModels is empty");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BaseSectionModel baseSectionModel : list) {
            String c = c(baseSectionModel, str);
            if (!TextUtils.isEmpty(c)) {
                PreLoadItem preLoadItem = new PreLoadItem();
                preLoadItem.setUrl(c);
                if (a(baseSectionModel)) {
                    preLoadItem.setCacheData(b(baseSectionModel));
                }
                arrayList.add(preLoadItem);
            }
        }
        if (arrayList.isEmpty()) {
            fve.e("PreLoadModelCreator", "ParsePreLoadModel 未找到卡片 : " + str);
            return null;
        }
        PreLoadModel preLoadModel = new PreLoadModel();
        preLoadModel.setItems(arrayList);
        preLoadModel.setSourceFrom(str2);
        preLoadModel.setPageIndex(String.valueOf(i));
        return preLoadModel;
    }

    public static JSONObject b(BaseSectionModel<?> baseSectionModel) {
        BaseItemModel item;
        BaseSubItemModel baseItemModel;
        JSONObject ext;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a3e57fd", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null || (item = baseSectionModel.getItem()) == null || (baseItemModel = item.getBaseItemModel(0)) == null || (ext = baseItemModel.getExt()) == null) {
            return null;
        }
        String string = ext.getString(KEY_TARGET_PARAMS);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(string);
        } catch (Exception e) {
            fve.c("PreLoadModelCreator", "findFirstTargetParams 解析异常", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("simpleDeliverData");
    }

    public static boolean a(BaseSectionModel<?> baseSectionModel) {
        BaseItemModel item;
        BaseSubItemModel baseItemModel;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("565aac4f", new Object[]{baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null || (item = baseSectionModel.getItem()) == null || (baseItemModel = item.getBaseItemModel(0)) == null || (ext = baseItemModel.getExt()) == null) {
            return false;
        }
        return "true".equals(ext.getString(KEY_ENABLE_SIMPLE_DELIVER)) && TextUtils.equals(ext.getString("targetType"), "newDetail") && !TextUtils.equals(ext.getString(KEY_DISABLE_PARSE_DELIVER), "true");
    }

    public static String c(BaseSectionModel<?> baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f70d1a0", new Object[]{baseSectionModel, str});
        }
        if (baseSectionModel == null) {
            return null;
        }
        BaseItemModel item = baseSectionModel.getItem();
        if (item == null) {
            fve.e("PreLoadModelCreator", "getTargetUrl baseItemModel is null");
            return null;
        }
        int itemCount = item.getItemCount();
        if (itemCount <= 0) {
            fve.e("PreLoadModelCreator", "getTargetUrl itemCount <= 0");
            return null;
        }
        for (int i = 0; i < itemCount; i++) {
            BaseSubItemModel baseItemModel = item.getBaseItemModel(i);
            if (baseItemModel != null && !ObjectUtils.c(baseItemModel.getExt()) && TextUtils.equals(str, baseItemModel.getExt().getString("targetType")) && ((TextUtils.equals(baseItemModel.getExt().getString("targetType"), "newDetail") && !TextUtils.equals(baseItemModel.getExt().getString(KEY_DISABLE_PARSE_DELIVER), "true")) || !TextUtils.equals("true", baseItemModel.getExt().getString(KEY_ENABLE_SIMPLE_DELIVER)))) {
                return baseItemModel.getTargetUrl();
            }
        }
        return null;
    }
}
