package com.taobao.homepage.pop.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.bgm;
import tb.e3b;
import tb.tgm;
import tb.vfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopDataViewModel implements Serializable, IMTOPDataObject {
    private static final String TAG = "PopDataViewModel ";
    private Map<String, IPopData> businessId2Section = new ConcurrentHashMap(16);
    private Map<String, IPopData> oldRemovedData = new ConcurrentHashMap(16);

    private boolean insertListToMapWithRequestType(e3b e3bVar, List<JSONObject> list, String str, boolean z) {
        boolean z2;
        if (list == null || list.isEmpty()) {
            vfm.f(TAG, "no pop Data from server, requestType=" + str);
            return false;
        }
        boolean z3 = false;
        for (JSONObject jSONObject : list) {
            IPopData<PopSectionModel> a2 = tgm.a(jSONObject);
            if (a2 != null && (z || a2.isDeltaRefreshWhiteList(str))) {
                boolean processForceUpdateData = processForceUpdateData(a2);
                if (processForceUpdateData) {
                    IPopData iPopData = this.businessId2Section.get(a2.getBusinessID());
                    z2 = iPopData != null && iPopData.isAllowShow();
                } else {
                    z2 = processNewData(e3bVar, a2);
                    if ((TextUtils.equals("coldStart", str) || str == null) && !a2.isAllowShow()) {
                        a2.resetShowCount();
                        vfm.c(TAG, "reset popData, businessId=" + a2.getBusinessID());
                    }
                }
                vfm.c(TAG, "updatePopData, businessId=" + a2.getBusinessID() + ", userOld=" + processForceUpdateData + ", isUpdate=" + z2);
                z3 = z2;
            }
        }
        return z3;
    }

    private boolean processForceUpdateData(IPopData iPopData) {
        String businessID = iPopData.getBusinessID();
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig != null && popConfig.isForceUpdate()) {
            return false;
        }
        IPopData remove = this.oldRemovedData.remove(businessID);
        if (remove == null) {
            return true;
        }
        this.businessId2Section.put(businessID, remove);
        return true;
    }

    private boolean processNewData(e3b e3bVar, IPopData iPopData) {
        BasePopSectionModel fetchPopSection;
        bgm.b("MtopResponseHasPopData", iPopData);
        if (!iPopData.valid() || (fetchPopSection = iPopData.fetchPopSection()) == null) {
            return false;
        }
        String businessID = iPopData.getBusinessID();
        fetchPopSection.getExt().put("businessId", (Object) businessID);
        bgm.b("MtopPopDataValid", iPopData);
        this.businessId2Section.put(businessID, iPopData);
        return true;
    }

    public void destroy() {
        this.businessId2Section.clear();
    }

    public Map<String, IPopData> getAllPopData() {
        return this.businessId2Section;
    }

    public IPopData getPopDataByBusinessId(String str) {
        return this.businessId2Section.get(str);
    }

    public int getPopSize() {
        return this.businessId2Section.size();
    }

    public boolean insertCustomPopData(e3b e3bVar, IPopData iPopData) {
        if (iPopData == null || !iPopData.valid()) {
            return false;
        }
        this.businessId2Section.put(iPopData.getBusinessID(), iPopData);
        return true;
    }

    public boolean updateViewModel(e3b e3bVar, List<JSONObject> list, boolean z, String str) {
        this.oldRemovedData = this.businessId2Section;
        this.businessId2Section = new ConcurrentHashMap(16);
        boolean insertListToMapWithRequestType = insertListToMapWithRequestType(e3bVar, list, str, z);
        processKeepData(z, str);
        if (insertListToMapWithRequestType || !this.oldRemovedData.isEmpty()) {
            return true;
        }
        return false;
    }

    private void processKeepData(boolean z, String str) {
        if (!z && !this.oldRemovedData.isEmpty()) {
            Iterator<IPopData> it = this.oldRemovedData.values().iterator();
            while (it.hasNext()) {
                IPopData next = it.next();
                if (!next.isDeltaRefreshWhiteList(str)) {
                    it.remove();
                    this.businessId2Section.put(next.getBusinessID(), next);
                    vfm.f(TAG, "keep old pop, businessId=" + next.getBusinessID());
                }
            }
        }
    }
}
