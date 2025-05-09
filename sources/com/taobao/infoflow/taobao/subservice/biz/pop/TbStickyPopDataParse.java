package com.taobao.infoflow.taobao.subservice.biz.pop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TbStickyPopDataParse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f10783a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Position implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String bindName;
        public String sectionBizCode;

        static {
            t2o.a(491782573);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Position{sectionBizCode='" + this.sectionBizCode + "', bindName='" + this.bindName + "'}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TbStickyPopData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String popId;
        public List<Position> positions;
        public int stickyItemPosition = -1;
        public String stickySection;

        static {
            t2o.a(491782575);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "HomePageScrollPosition{popId='" + this.popId + "', positions=" + this.positions + ", stickyItemPosition=" + this.stickyItemPosition + ", stickySection='" + this.stickySection + "'}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10784a;
        public int b = -1;

        static {
            t2o.a(491782574);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[ stickySectionBizCode: " + this.f10784a + ", stickyItemPosition: " + this.b + " ]";
        }
    }

    static {
        t2o.a(491782572);
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
            if (TextUtils.equals(list.get(i).getSectionBizCode(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final String b(TbStickyPopData tbStickyPopData, List<BaseSectionModel<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d484516", new Object[]{this, tbStickyPopData, list});
        }
        if (!TextUtils.isEmpty(tbStickyPopData.popId) && tbStickyPopData.positions != null && list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < list.size(); i++) {
                BaseSectionModel<?> baseSectionModel = list.get(i);
                String sectionBizCode = baseSectionModel.getSectionBizCode();
                if (baseSectionModel.getExt() == null || !baseSectionModel.getExt().containsKey("bindName")) {
                    linkedHashMap.put(sectionBizCode, "");
                } else {
                    linkedHashMap.put(sectionBizCode, baseSectionModel.getExt().getString("bindName"));
                }
            }
            for (Position position : tbStickyPopData.positions) {
                if (linkedHashMap.containsKey(position.sectionBizCode) && (TextUtils.isEmpty(position.bindName) || TextUtils.equals(position.bindName, (CharSequence) linkedHashMap.get(position.sectionBizCode)))) {
                    return position.sectionBizCode;
                }
            }
        }
        return "";
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("33b5b082", new Object[]{this});
        }
        return this.f10783a;
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

    public final a e(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        JSONObject ext;
        TbStickyPopData tbStickyPopData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dca294dc", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<BaseSectionModel<?>> base = iContainerDataModel.getBase();
        if (base == null || (ext = base.getExt()) == null) {
            return null;
        }
        try {
            tbStickyPopData = (TbStickyPopData) ext.getObject("homePageScrollPosition", TbStickyPopData.class);
        } catch (Exception e) {
            fve.c("TbStickyPopDataParse", "TbStickyPopData error", e);
            tbStickyPopData = null;
        }
        if (tbStickyPopData == null) {
            return null;
        }
        String b = b(tbStickyPopData, iContainerDataModel.getTotalData());
        if (TextUtils.isEmpty(b)) {
            fve.e("TbStickyPopDataParse", "not found sticky bizCode");
            return null;
        }
        int a2 = a(b, iContainerDataModel.getTotalData());
        if (a2 < 0) {
            fve.e("TbStickyPopDataParse", "not found sticky position");
            return null;
        }
        a aVar = new a();
        aVar.f10784a = b;
        aVar.b = a2;
        return aVar;
    }

    public void f(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3a57b7", new Object[]{this, iContainerDataModel});
            return;
        }
        boolean d = d(iContainerDataModel);
        a aVar = this.f10783a;
        if (aVar == null || d || (!TextUtils.isEmpty(aVar.f10784a) && this.f10783a.b == -1)) {
            this.f10783a = e(iContainerDataModel);
            fve.e("TbStickyPopDataParse", "parse sticky data: " + this.f10783a);
        }
    }
}
