package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f20769a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ANIM_TYPE_SLIDE = "slide";
        public static final String TRIGGER_TYPE_DISAPPEAR = "disappear";

        /* renamed from: a  reason: collision with root package name */
        public String f20770a;
        public String b;
        public boolean c;
        public String d;
        public String e;
        public int f = -1;
        public BaseSectionModel<?> g = null;

        static {
            t2o.a(486539714);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[ sectionBizCode: " + this.f20770a + ", stickyDataKey: " + this.b + ", stickyTriggerType: " + this.d + ", stickyAnimType: " + this.e + ", stickyItemPosition: " + this.f + "needDownload: " + this.c + " ]";
        }
    }

    static {
        t2o.a(486539713);
    }

    public final int a(String str, List<BaseSectionModel<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68315fc9", new Object[]{this, str, list})).intValue();
        }
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (e(list.get(i).getSectionBizCode(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final BaseSectionModel<?> b(int i, IContainerDataModel<BaseSectionModel<?>> iContainerDataModel, String str) {
        List<BaseSectionModel<?>> totalData;
        BaseSectionModel<?> baseSectionModel;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("861e97e5", new Object[]{this, new Integer(i), iContainerDataModel, str});
        }
        if (i < 0 || iContainerDataModel == null || (totalData = iContainerDataModel.getTotalData()) == null || i >= totalData.size() || (baseSectionModel = totalData.get(i)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return baseSectionModel;
        }
        IContainerInnerDataModel<BaseSectionModel<?>> base = iContainerDataModel.getBase();
        if (base == null) {
            jSONObject = null;
        } else {
            jSONObject = base.getExtSections();
        }
        if (jSONObject == null || jSONObject.isEmpty() || (jSONObject2 = jSONObject.getJSONObject(str)) == null) {
            return null;
        }
        return baseSectionModel.createBaseSectionModel(jSONObject2);
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("917a3371", new Object[]{this});
        }
        return this.f20769a;
    }

    public final boolean d(IContainerDataModel<?> iContainerDataModel) {
        IPageDataModel pageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcfe9c5c", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null || (pageParams = base.getPageParams()) == null || pageParams.getPageNum() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e97db6", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        if (TextUtils.equals(str + "_delta", str2)) {
            return true;
        }
        if (TextUtils.equals(str, str2 + "_delta")) {
            return true;
        }
        return false;
    }

    public void f(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3a57b7", new Object[]{this, iContainerDataModel});
            return;
        }
        boolean d = d(iContainerDataModel);
        a aVar = this.f20769a;
        if (aVar == null || d || (!TextUtils.isEmpty(aVar.f20770a) && this.f20769a.f == -1)) {
            this.f20769a = g(iContainerDataModel);
            fve.e("StickyDataParse", "parse sticky data: " + this.f20769a);
        }
    }

    public final a g(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        JSONObject ext;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("508d261f", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<BaseSectionModel<?>> base = iContainerDataModel.getBase();
        if (base == null || (ext = base.getExt()) == null) {
            return null;
        }
        String string = ext.getString("stickySectionBizCode");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        int a2 = a(string, iContainerDataModel.getTotalData());
        if (a2 < 0) {
            fve.e("StickyDataParse", "not found sticky position");
            return null;
        }
        BaseSectionModel<?> b = b(a2, iContainerDataModel, ext.getString("stickyDataKey"));
        if (b == null) {
            fve.e("StickyDataParse", "not found sticky section");
            return null;
        }
        a aVar = new a();
        aVar.f20770a = string;
        aVar.b = ext.getString("stickyDataKey");
        aVar.d = ext.getString("stickyTriggerType");
        aVar.e = ext.getString("stickyAnimType");
        aVar.f = a2;
        aVar.g = b;
        if (TextUtils.isEmpty(aVar.b) || aVar.g == null) {
            z = false;
        }
        aVar.c = z;
        return aVar;
    }
}
