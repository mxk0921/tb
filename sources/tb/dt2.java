package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.TemplateModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810119);
    }

    public static SectionModel a(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("ffbc9430", new Object[]{sectionModel});
        }
        SectionModel sectionModel2 = new SectionModel(JSON.parseObject(sectionModel.toJSONString()));
        Object b = kr8.b("subSection.1.subSection", sectionModel2);
        if (!(b instanceof JSONObject)) {
            fve.e("CachePerformance", "未找到二屏内容");
            return null;
        }
        JSONObject jSONObject = (JSONObject) b;
        Object obj = jSONObject.get("0");
        if (obj == null) {
            fve.e("CachePerformance", "未找到二屏内容的首个icon");
            return null;
        }
        jSONObject.clear();
        jSONObject.put("0", obj);
        return sectionModel2;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13778a4a", new Object[]{str})).booleanValue();
        }
        if (!vxl.b().l() || !TextUtils.equals(str, z4a.NEW_FACE_CHILD.f32522a)) {
            return false;
        }
        return true;
    }

    public static boolean c(TemplateModel templateModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("481605ac", new Object[]{templateModel})).booleanValue();
        }
        return TextUtils.equals("recommend_m_h_v5_slider_icons_tag_bindingx_d3", templateModel.getName());
    }

    public static SectionModel d(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("bdac3832", new Object[]{sectionModel});
        }
        if (c(sectionModel.getTemplate())) {
            return a(sectionModel);
        }
        return null;
    }

    public static byte[] e(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ff9d592c", new Object[]{str, awesomeGetContainerInnerData});
        }
        List<SectionModel> list = awesomeGetContainerInnerData.sections;
        if (!b(str) || ObjectUtils.c(list)) {
            fve.e("CachePerformance", "不允许替换，直接返回");
            return JSON.toJSONBytes(awesomeGetContainerInnerData, new SerializerFeature[0]);
        }
        AwesomeGetContainerInnerData clone = awesomeGetContainerInnerData.clone();
        ListIterator<SectionModel> listIterator = clone.sections.listIterator();
        while (listIterator.hasNext()) {
            SectionModel d = d(listIterator.next());
            if (d != null) {
                listIterator.set(d);
            }
        }
        return JSON.toJSONBytes(clone, new SerializerFeature[0]);
    }
}
