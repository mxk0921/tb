package com.taobao.android.litecreator.sdk.editor.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.odg;
import tb.ptc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Material implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECOMMENDED_FROM_FUN_SUFFIX = "_fromFun";
    public static final String RECOMMENDED_FROM_TEMPLATE_SUFFIX = "_fromTemplate";
    public static final String RECOMMENDED_TEXT = "recommendedText";
    public static final String RECOMMENDED_TITLE = "recommendedTitle";
    public static final String RECOMMENDED_TOPIC_INFO = "topicInfo";
    public List<MaterialNode> materialNodes = new ArrayList();

    static {
        t2o.a(511705429);
    }

    public static void clearFunRecommendsExtraInfoToUgcMedia(ptc ptcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2dc4608", new Object[]{ptcVar});
        } else if (ptcVar != null) {
            ptcVar.removeExtraInfoMeta("recommendedTitle_fromFun");
            ptcVar.removeExtraInfoMeta("recommendedText_fromFun");
            ptcVar.removeExtraInfoMeta("topicInfo_fromFun");
        }
    }

    public static void clearTemplateRecommendsExtraInfoToUgcMedia(ptc ptcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a162b23d", new Object[]{ptcVar});
        } else if (ptcVar != null) {
            ptcVar.removeExtraInfoMeta("recommendedTitle_fromTemplate");
            ptcVar.removeExtraInfoMeta("recommendedText_fromTemplate");
            ptcVar.removeExtraInfoMeta("topicInfo_fromTemplate");
        }
    }

    public static void addFunRecommendsExtraInfoToUgcMedia(ptc ptcVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a28a73c", new Object[]{ptcVar, jSONObject});
        } else if (ptcVar != null) {
            String string = jSONObject.getString(RECOMMENDED_TITLE);
            String string2 = jSONObject.getString(RECOMMENDED_TEXT);
            if (!TextUtils.isEmpty(string)) {
                ptcVar.addExtraInfoMeta("recommendedTitle_fromFun", string);
            } else {
                ptcVar.removeExtraInfoMeta("recommendedTitle_fromFun");
            }
            if (!TextUtils.isEmpty(string2)) {
                ptcVar.addExtraInfoMeta("recommendedText_fromFun", string2);
            } else {
                ptcVar.removeExtraInfoMeta("recommendedText_fromFun");
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(RECOMMENDED_TOPIC_INFO);
                if (jSONObject2 == null || jSONObject2.isEmpty()) {
                    ptcVar.removeExtraInfoMeta("topicInfo_fromFun");
                } else {
                    ptcVar.addExtraInfoMeta("topicInfo_fromFun", jSONObject2);
                }
            } catch (Exception e) {
                odg.c("addFunRecommendsExtraInfoToUgcMedia", e.getMessage());
            }
        }
    }

    public static void addTemplateRecommendsExtraInfoToUgcMedia(ptc ptcVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd5677f", new Object[]{ptcVar, jSONObject});
        } else if (ptcVar != null) {
            String string = jSONObject.getString(RECOMMENDED_TITLE);
            String string2 = jSONObject.getString(RECOMMENDED_TEXT);
            if (!TextUtils.isEmpty(string)) {
                ptcVar.addExtraInfoMeta("recommendedTitle_fromTemplate", string);
            } else {
                ptcVar.removeExtraInfoMeta("recommendedTitle_fromTemplate");
            }
            if (!TextUtils.isEmpty(string2)) {
                ptcVar.addExtraInfoMeta("recommendedText_fromTemplate", string2);
            } else {
                ptcVar.removeExtraInfoMeta("recommendedText_fromTemplate");
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(RECOMMENDED_TOPIC_INFO);
                if (jSONObject2 == null || jSONObject2.isEmpty()) {
                    ptcVar.removeExtraInfoMeta("topicInfo_fromTemplate");
                } else {
                    ptcVar.addExtraInfoMeta("topicInfo_fromTemplate", jSONObject2);
                }
            } catch (Exception e) {
                odg.c("addTemplateRecommendsExtraInfoToUgcMedia", e.getMessage());
            }
        }
    }
}
