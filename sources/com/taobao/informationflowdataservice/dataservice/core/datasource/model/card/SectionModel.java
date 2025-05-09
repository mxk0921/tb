package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseStyleModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.i2b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SectionModel extends BaseSectionModel<UpdateRuleModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ItemModel mItemModel;
    private Boolean mSlimSection;
    private BaseStyleModel mStyleModel;
    private SubSectionModel mSubSectionModel;
    private TemplateModel mTemplateModel;
    private List<UpdateRuleModel> mUpdateRuleModels;
    private UtModel mUtModel;
    private boolean isRemote = true;
    private int mRealExposeIndex = -1;

    static {
        t2o.a(487587867);
    }

    public SectionModel() {
    }

    public static /* synthetic */ Object ipc$super(SectionModel sectionModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/informationflowdataservice/dataservice/core/datasource/model/card/SectionModel");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public BaseSectionModel createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject});
        }
        return new SectionModel(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return getJSONObject("args");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14011e6a", new Object[]{this});
        }
        return getJSONObject("content");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        JSONObject jSONObject = getJSONObject("ext");
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        put("ext", (Object) jSONObject2);
        return jSONObject2;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(getString("index"));
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public int getRealExposeIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ec0834", new Object[]{this})).intValue();
        }
        return this.mRealExposeIndex;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public String getSectionBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("275317a8", new Object[]{this});
        }
        return getString("sectionBizCode");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public BaseStyleModel getStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStyleModel) ipChange.ipc$dispatch("38b789a8", new Object[]{this});
        }
        if (this.mStyleModel == null) {
            JSONObject jSONObject = getJSONObject("style");
            if (jSONObject == null) {
                return null;
            }
            this.mStyleModel = new StyleModel(jSONObject);
        }
        return this.mStyleModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b2c84bc", new Object[]{this});
        }
        return getJSONObject("track");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public List<UpdateRuleModel> getUpdateRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef454f68", new Object[]{this});
        }
        if (this.mUpdateRuleModels == null) {
            JSONArray jSONArray = getJSONArray("updateRules");
            if (jSONArray == null || jSONArray.size() <= 0) {
                return null;
            }
            this.mUpdateRuleModels = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    this.mUpdateRuleModels.add(new UpdateRuleModel((JSONObject) next));
                }
            }
        }
        return this.mUpdateRuleModels;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public boolean isRemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[]{this})).booleanValue();
        }
        return this.isRemote;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public void setCustomSubSection(BaseSubSectionModel baseSubSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f59321", new Object[]{this, baseSubSectionModel});
        } else if (baseSubSectionModel != null && (baseSubSectionModel instanceof SubSectionModel)) {
            this.mSubSectionModel = (SubSectionModel) baseSubSectionModel;
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public void setRealExposeIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe8a1ee", new Object[]{this, new Integer(i)});
        } else {
            this.mRealExposeIndex = i;
        }
    }

    public void setRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21abce5", new Object[]{this, new Boolean(z)});
        } else {
            this.isRemote = z;
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f8765c9", new Object[]{this});
        }
        return this;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public SubItemModel createBaseSubItemModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubItemModel) ipChange.ipc$dispatch("27a612d1", new Object[]{this, jSONObject}) : new SubItemModel(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public UtModel getExposureParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtModel) ipChange.ipc$dispatch("26118e14", new Object[]{this});
        }
        if (this.mUtModel == null) {
            JSONObject jSONObject = getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
            if (jSONObject == null) {
                return null;
            }
            this.mUtModel = new UtModel(jSONObject);
        }
        return this.mUtModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public ItemModel getItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemModel) ipChange.ipc$dispatch("84ec3baf", new Object[]{this});
        }
        if (this.mItemModel == null) {
            JSONObject jSONObject = getJSONObject("item");
            if (jSONObject == null) {
                return null;
            }
            this.mItemModel = new ItemModel(jSONObject);
        }
        return this.mItemModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public SubSectionModel getSubSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubSectionModel) ipChange.ipc$dispatch("fde0f56f", new Object[]{this});
        }
        if (this.mSubSectionModel == null) {
            JSONObject jSONObject = getJSONObject("subSection");
            if (jSONObject == null) {
                return null;
            }
            this.mSubSectionModel = new SubSectionModel(jSONObject);
        }
        return this.mSubSectionModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public TemplateModel getTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateModel) ipChange.ipc$dispatch("c83bd38f", new Object[]{this});
        }
        if (this.mTemplateModel == null) {
            if (!slimSection()) {
                JSONObject jSONObject = getJSONObject("template");
                if (jSONObject == null) {
                    return null;
                }
                this.mTemplateModel = new TemplateModel(jSONObject);
            } else if (getStyle() == null || getStyle().getTemplate() == null) {
                return null;
            } else {
                this.mTemplateModel = (TemplateModel) getStyle().getTemplate();
            }
        }
        return this.mTemplateModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public boolean slimSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471d8f73", new Object[]{this})).booleanValue();
        }
        if (this.mSlimSection == null) {
            this.mSlimSection = getBoolean("slimSection");
        }
        Boolean bool = this.mSlimSection;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public SectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
