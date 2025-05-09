package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.TemplateModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yp6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<?>> f32256a = new HashMap();
    public final List<String> b = new ArrayList();

    static {
        t2o.a(729810097);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (f4b.b("enableCheckPresetDta", false)) {
            ((HashMap) this.f32256a).clear();
            ((ArrayList) this.b).clear();
        }
    }

    public final void c(List<?> list, List<?> list2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe94fcb", new Object[]{this, list, list2, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object i3 = i(i2, list);
            Object i4 = i(i2, list2);
            if ((i3 instanceof SectionModel) && (i4 instanceof SectionModel)) {
                SectionModel sectionModel = (SectionModel) i4;
                if (h(sectionModel, (SectionModel) i3)) {
                    j(sectionModel);
                }
            }
        }
    }

    public final void d(String str, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da26cae2", new Object[]{this, str, iContainerDataModel});
            return;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            bqa.d("CacheDataValidatorUtil", str + ",Base model is null.");
            return;
        }
        List<?> sections = base.getSections();
        List<?> list = (List) ((HashMap) this.f32256a).get(str);
        if (sections == null || list == null) {
            bqa.d("CacheDataValidatorUtil", str + ",Either cold start data or cache data is null.");
        } else if (list.size() != sections.size()) {
            ddv.b(pl4.KEY_CACHE_DATA, "homepage", "1.0", null, null, str + "_DataSizeDiff", "预置数据和线上不一致");
            bqa.d("CacheDataValidatorUtil", str + ",Preset data is error.");
        } else {
            c(sections, list, sections.size());
        }
    }

    public final void e(String str, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e0bc65", new Object[]{this, str, iContainerDataModel});
            return;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            bqa.d("CacheDataValidatorUtil", str + ",Base model is null.");
            return;
        }
        List<?> sections = base.getSections();
        List<?> list = (List) ((HashMap) this.f32256a).get(str);
        if (sections == null || list == null) {
            bqa.d("CacheDataValidatorUtil", str + ",Either cold start data or cache data is null.");
            return;
        }
        int f = f(sections);
        if (f != f(list)) {
            ddv.b(pl4.KEY_CACHE_DATA, "homepage", "1.0", null, null, str + "_beforeSeparatorDataDiff", "分割线前的卡片数量不一样");
            return;
        }
        c(sections, list, f);
    }

    public final int f(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fd4e9f0", new Object[]{this, list})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if ((obj instanceof SectionModel) && TextUtils.equals(((SectionModel) obj).getSectionBizCode(), "mainAndSubSeparator")) {
                return i;
            }
        }
        return -1;
    }

    public final Object i(int i, List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f61f0d7", new Object[]{this, new Integer(i), list});
        }
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public final void j(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2eed9", new Object[]{this, sectionModel});
            return;
        }
        TemplateModel template = sectionModel.getTemplate();
        if (template != null && template.getUrl() != null) {
            bqa.d("CacheDataValidatorUtil", "当前数据不一致");
            ((ArrayList) this.b).add(template.getUrl());
        }
    }

    public void k(String str, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0798f1", new Object[]{this, str, iContainerDataModel});
        } else if (f4b.b("enableCheckPresetDta", false)) {
            IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
            if (base == null) {
                bqa.d("CacheDataValidatorUtil", str + " base == null");
                return;
            }
            List<?> sections = base.getSections();
            if (sections == null || sections.isEmpty()) {
                bqa.d("CacheDataValidatorUtil", str + " sections == null");
                return;
            }
            ((HashMap) this.f32256a).put(str, sections);
        }
    }

    public void a(String str, IContainerDataModel<?> iContainerDataModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0551f4", new Object[]{this, str, iContainerDataModel, new Integer(i)});
        } else if (f4b.b("enableCheckPresetDta", false)) {
            try {
                if (TextUtils.equals(str, z4a.NEW_FACE_PARENT.f32522a)) {
                    d(str, iContainerDataModel);
                } else {
                    e(str, iContainerDataModel);
                }
                if (((ArrayList) this.b).size() > i) {
                    ddv.b(pl4.KEY_CACHE_DATA, "homepage", "1.0", null, null, str + "_cacheDataExpired", "differentUrl: " + this.b);
                    bqa.d("CacheDataValidatorUtil", str + " Preset data has expired.");
                }
                ((HashMap) this.f32256a).remove(str);
                ((ArrayList) this.b).clear();
            } catch (Exception e) {
                bqa.d("CacheDataValidatorUtil", "出现异常： " + e);
            }
        }
    }

    public boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("965b3ffb", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            return Long.parseLong(str2) - Long.parseLong(str) >= ((long) f4b.i("needAlarmDiffTemplateSize", 20));
        } catch (Exception e) {
            bqa.d("CacheDataValidatorUtil", "解析模板版本号时出现异常：" + e);
            return false;
        }
    }

    public final boolean h(SectionModel sectionModel, SectionModel sectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e8569c0", new Object[]{this, sectionModel, sectionModel2})).booleanValue();
        }
        TemplateModel template = sectionModel.getTemplate();
        TemplateModel template2 = sectionModel2.getTemplate();
        if (template == null || template2 == null) {
            bqa.d("CacheDataValidatorUtil", "cacheTemplate == null || coldStartTemplate == null");
            return false;
        } else if (!TextUtils.equals(template.getName(), template2.getName())) {
            bqa.d("CacheDataValidatorUtil", "模版名不一样");
            return true;
        } else {
            String version = template.getVersion();
            String version2 = template2.getVersion();
            if (!TextUtils.isEmpty(version) && !TextUtils.isEmpty(version2)) {
                return g(version, version2);
            }
            bqa.d("CacheDataValidatorUtil", "版本号为空");
            return false;
        }
    }
}
