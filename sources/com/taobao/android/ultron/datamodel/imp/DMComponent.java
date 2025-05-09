package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import com.taobao.android.ultronx.node.RenderTemplate;
import com.taobao.android.ultronx.node.StatusNode;
import com.taobao.android.ultronx.protocol.UltronComponent;
import com.taobao.android.ultronx.protocol.UltronEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import tb.fsb;
import tb.gsb;
import tb.i9v;
import tb.kfo;
import tb.lmi;
import tb.q1w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DMComponent implements IDMComponent, Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPEND = "append";
    private static final String BOOL_TRUE_VALUE = "true";
    public static final String CARD_GROUP_TAG = "CardGroupTag";
    public static final String EXTEND_TYPE = "extendType";
    public static final String POSITION_TAG = "PositionTag";
    public static final String PREPEND = "prepend";
    public static final String RESET = "reset";
    private static final String STRING_UNDERLINE = "_";
    private static final String TAG = "DMComponent";
    private Map<String, DMComponent> codePopupWindowMap;
    public String componentKey;
    public JSONObject layout;
    public String mAdjustOperatorAction;
    public String mBizName;
    public JSONObject mContainerInfo;
    public String mContainerType;
    private IDMComponent.a mCustomValidate;
    public JSONObject mData;
    private String mDeltaOpType;
    private Map<String, List<gsb>> mEventMap;
    public JSONObject mEvents;
    public boolean mExtendBlock;
    public JSONObject mFeatures;
    public JSONObject mFields;
    public boolean mHasMore;
    public JSONObject mHidden;
    public String mID;
    public int mModifiedCount;
    public DMComponent mParent;
    private JSONObject mStashData;
    private StatusNode mStatusNode;
    public String mSubmit;
    public String mTag;
    public String mTriggerEvent;
    public String mType;
    private lmi messageChannel;
    public LinkageType mLinkageType = LinkageType.REFRESH;
    private List<IDMComponent> mChildren = new ArrayList();
    private ArrayMap<String, Object> mExtMap = new ArrayMap<>();
    private ConcurrentHashMap<String, Object> mSafeExtMap = new ConcurrentHashMap<>();
    private ArrayMap<String, Object> mOnceExtMap = new ArrayMap<>();
    private String extendType = "append";

    static {
        t2o.a(83886152);
        t2o.a(83886096);
    }

    public DMComponent(JSONObject jSONObject, String str, JSONObject jSONObject2, Map<String, List<gsb>> map) {
        this.mContainerType = "native";
        this.mContainerType = str;
        this.mContainerInfo = jSONObject2;
        this.mEventMap = map;
        loadData(jSONObject);
    }

    private gsb parseEvent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("a41e8109", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option"));
    }

    public void addChild(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950f8892", new Object[]{this, iDMComponent});
        } else {
            this.mChildren.add(iDMComponent);
        }
    }

    public void addChildren(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2141cd38", new Object[]{this, list});
        } else {
            this.mChildren.addAll(list);
        }
    }

    public void addCodePopupWindow(String str, DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe09e69", new Object[]{this, str, dMComponent});
        } else if (!TextUtils.isEmpty(str) && dMComponent != null) {
            if (this.codePopupWindowMap == null) {
                this.codePopupWindowMap = new HashMap();
            }
            this.codePopupWindowMap.put(str, dMComponent);
        }
    }

    public JSONObject adjustData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4e5700", new Object[]{this});
        }
        return this.mData;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public boolean clearOnceExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac073794", new Object[]{this})).booleanValue();
        }
        ArrayMap<String, Object> arrayMap = this.mOnceExtMap;
        if (arrayMap == null) {
            return false;
        }
        arrayMap.clear();
        return true;
    }

    public DMComponent deepClone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("4b066f50", new Object[]{this});
        }
        return new DMComponent(i9v.a(this.mData), this.mContainerType, i9v.a(this.mContainerInfo));
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getAdjustOperatorAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b50fe7a", new Object[]{this});
        }
        return this.mAdjustOperatorAction;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getCardGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b741200", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return "unknown";
        }
        return jSONObject.getString("cardGroup");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public List<IDMComponent> getChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        return this.mChildren;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public Map<String, DMComponent> getCodePopupWindowMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49b4a8ff", new Object[]{this});
        }
        return this.codePopupWindowMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getContainerInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("245b3440", new Object[]{this});
        }
        return this.mContainerInfo;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this});
        }
        return this.mContainerType;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.mData;
    }

    public String getDeltaOpType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6cd59dbc", new Object[]{this});
        }
        return this.mDeltaOpType;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public Map<String, List<gsb>> getEventMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("86199254", new Object[]{this});
        }
        return this.mEventMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78cabc36", new Object[]{this});
        }
        return this.mEvents;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ArrayMap<String, Object> getExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("c3dc8bf", new Object[]{this});
        }
        return this.mExtMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getExtendType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82c37cf", new Object[]{this});
        }
        return this.extendType;
    }

    public JSONObject getFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("51abd7da", new Object[]{this});
        }
        return this.mFeatures;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.mFields;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("23924447", new Object[]{this});
        }
        return this.mHidden;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return "unknown";
        }
        return jSONObject.getString("id");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.componentKey)) {
            return this.componentKey;
        }
        String tag = getTag();
        String id = getId();
        if (tag == null || id == null) {
            return null;
        }
        return tag + "_" + id;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2fbde1c7", new Object[]{this});
        }
        return this.layout;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getLayoutStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff3b1298", new Object[]{this});
        }
        JSONObject jSONObject = this.layout;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("style");
        }
        return null;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getLayoutType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208cadbf", new Object[]{this});
        }
        JSONObject jSONObject = this.layout;
        if (jSONObject != null) {
            return jSONObject.getString("type");
        }
        return "";
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public LinkageType getLinkageType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkageType) ipChange.ipc$dispatch("67b2f4b8", new Object[]{this});
        }
        return this.mLinkageType;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public lmi getMessageChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lmi) ipChange.ipc$dispatch("edd4b980", new Object[]{this});
        }
        return this.messageChannel;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public int getModifiedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a626c8a", new Object[]{this})).intValue();
        }
        return this.mModifiedCount;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ArrayMap<String, Object> getOnceExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("bed86dfe", new Object[]{this});
        }
        return this.mOnceExtMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public IDMComponent getParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("c56546ab", new Object[]{this});
        }
        return this.mParent;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return "unknown";
        }
        return jSONObject.getString("position");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ConcurrentHashMap<String, Object> getSafeExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("ffabd961", new Object[]{this});
        }
        return this.mSafeExtMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getStashData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("41d69a30", new Object[]{this});
        }
        return this.mStashData;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return "unknown";
        }
        return jSONObject.getString("tag");
    }

    public String getTriggerEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63efafc1", new Object[]{this});
        }
        return this.mTriggerEvent;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return "unknown";
        }
        return jSONObject.getString("type");
    }

    public boolean hasMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e35ca1a", new Object[]{this})).booleanValue();
        }
        return this.mHasMore;
    }

    public boolean isExtendBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1176a14", new Object[]{this})).booleanValue();
        }
        return this.mExtendBlock;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public boolean isNormalComponent() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff5283d7", new Object[]{this})).booleanValue();
        }
        if (getStatus() == 0 || (jSONObject = this.mFields) == null || jSONObject.isEmpty() || BundleLineComponent.COMPONENT_TAG.equals(getType())) {
            return false;
        }
        return true;
    }

    public void onReload(fsb fsbVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ecba437", new Object[]{this, fsbVar, jSONObject});
        } else {
            loadData(jSONObject);
        }
    }

    public void onReloadEvent(Map<String, List<gsb>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5b0fbc", new Object[]{this, map});
        } else {
            this.mEventMap = map;
        }
    }

    public Map<String, List<gsb>> parseEventMap(JSONObject jSONObject) {
        gsb parseEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7bbf1f69", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("events");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject2.size());
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (parseEvent = parseEvent((JSONObject) next)) != null) {
                        arrayList.add(parseEvent);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void record() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
            return;
        }
        this.mStashData = JSON.parseObject(this.mData.toJSONString());
        Map<String, List<gsb>> map = this.mEventMap;
        if (map != null) {
            kfo.a(map);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mStashData;
        if (jSONObject != null) {
            loadData(jSONObject);
            this.mStashData = null;
        }
        Map<String, List<gsb>> map = this.mEventMap;
        if (map != null) {
            kfo.b(map);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setAdjustOperatorAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c318793c", new Object[]{this, str});
        } else {
            this.mAdjustOperatorAction = str;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setComponentCardGroupTag(String str) {
        ArrayMap<String, Object> arrayMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c04f837", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (arrayMap = this.mExtMap) != null) {
            arrayMap.put("CardGroupTag", str);
        }
    }

    public void setComponentKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d3c135", new Object[]{this, str});
        } else {
            this.componentKey = str;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setComponentPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3f4095", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mExtMap.put("PositionTag", str);
        }
    }

    public void setContainerInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e327dc", new Object[]{this, jSONObject});
        } else {
            this.mContainerInfo = jSONObject;
        }
    }

    public void setContainerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4932fbea", new Object[]{this, str});
        } else {
            this.mContainerType = str;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setCustomValidate(IDMComponent.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6632b4a1", new Object[]{this, aVar});
        }
    }

    public void setDeltaOpType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459548a2", new Object[]{this, str});
        } else {
            this.mDeltaOpType = str;
        }
    }

    public void setEvents(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13ef00e", new Object[]{this, jSONObject});
        } else {
            this.mEvents = jSONObject;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setExtendType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4444987", new Object[]{this, str});
        } else {
            this.extendType = str;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setLayoutType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f29197", new Object[]{this, str});
            return;
        }
        if (this.layout == null) {
            this.layout = new JSONObject();
        }
        this.layout.put("type", (Object) str);
    }

    public void setLinkageType(LinkageType linkageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c782f6", new Object[]{this, linkageType});
        } else {
            this.mLinkageType = linkageType;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setMessageChannel(lmi lmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4c5108", new Object[]{this, lmiVar});
        } else {
            this.messageChannel = lmiVar;
        }
    }

    public void setParent(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c051975", new Object[]{this, dMComponent});
        } else {
            this.mParent = dMComponent;
        }
    }

    public void setTriggerEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa4bcd5", new Object[]{this, str});
        } else {
            this.mTriggerEvent = str;
        }
    }

    public JSONObject submitData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d0006289", new Object[]{this});
        }
        return this.mData;
    }

    public JSONObject toJsonInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8cfb9878", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.mID);
        jSONObject.put("tag", (Object) this.mTag);
        jSONObject.put("type", (Object) this.mType);
        JSONObject jSONObject2 = this.mData;
        String str = null;
        jSONObject.put("data", (Object) (jSONObject2 != null ? jSONObject2.toJSONString() : null));
        JSONObject jSONObject3 = this.mFields;
        jSONObject.put("fields", (Object) (jSONObject3 != null ? jSONObject3.toJSONString() : null));
        JSONObject jSONObject4 = this.mHidden;
        jSONObject.put("hidden", (Object) (jSONObject4 != null ? jSONObject4.toJSONString() : null));
        LinkageType linkageType = this.mLinkageType;
        jSONObject.put("linkageType", (Object) (linkageType != null ? linkageType.toString() : null));
        jSONObject.put("containerType", (Object) this.mContainerType);
        JSONObject jSONObject5 = this.mContainerInfo;
        jSONObject.put("containerInfo", (Object) (jSONObject5 != null ? jSONObject5.toJSONString() : null));
        jSONObject.put("submit", (Object) this.mSubmit);
        JSONObject jSONObject6 = this.mEvents;
        if (jSONObject6 != null) {
            str = jSONObject6.toJSONString();
        }
        jSONObject.put("events", (Object) str);
        jSONObject.put("extendBlock", (Object) Boolean.valueOf(this.mExtendBlock));
        jSONObject.put(EXTEND_TYPE, (Object) this.extendType);
        return jSONObject;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void updateModifiedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f37784", new Object[]{this});
        } else {
            this.mModifiedCount++;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackData(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac85edb", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            loadData(jSONObject);
            if (z) {
                postNotification();
            }
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackDataAndReloadEvent(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36db19a5", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            loadData(jSONObject);
            this.mEventMap = parseEventMap(jSONObject);
            if (z) {
                postNotification();
            }
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackFields(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e220c12a", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        this.mFields = jSONObject;
        if (z) {
            postNotification();
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeFields(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fac4fa5", new Object[]{this, str, obj});
        } else if (this.mFields != null && !TextUtils.isEmpty(str) && obj != null) {
            this.mFields.put(str, obj);
        }
    }

    private void loadData(JSONObject jSONObject) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5622b99", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.mData = jSONObject;
            this.mID = jSONObject.getString("id");
            this.mTag = jSONObject.getString("tag");
            this.mType = this.mData.getString("type");
            this.mSubmit = jSONObject.getString("submit");
            this.mBizName = jSONObject.getString("bizName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("fields", (Object) jSONObject2);
            }
            this.mFields = jSONObject2;
            if (this.mTag == null) {
                this.mTag = "";
                jSONObject.put("tag", "");
            }
            if (this.mType == null) {
                this.mType = "";
                jSONObject.put("type", "");
            }
            this.mHidden = this.mData.getJSONObject("hidden");
            this.mEvents = this.mData.getJSONObject("events");
            this.mFeatures = this.mData.getJSONObject("features");
            this.mExtendBlock = this.mData.containsKey("extendBlock") ? this.mData.getBoolean("extendBlock").booleanValue() : false;
            if (this.mData.containsKey("hasMore")) {
                z = this.mData.getBoolean("hasMore").booleanValue();
            }
            this.mHasMore = z;
            this.layout = this.mData.containsKey("layout") ? this.mData.getJSONObject("layout") : null;
            if (jSONObject.containsKey(EXTEND_TYPE)) {
                this.extendType = jSONObject.getString(EXTEND_TYPE);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private void postNotification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bef3cb2", new Object[]{this});
        } else if (this.messageChannel != null) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("postModel", this);
            this.messageChannel.e(hashMap);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setCornerTypeFields(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c844b252", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = this.mFields;
        if (jSONObject != null) {
            if (i == 1) {
                jSONObject.put("cornerType", (Object) "top");
            } else if (i == 16) {
                jSONObject.put("cornerType", (Object) "bottom");
            } else if (i == 17) {
                jSONObject.put("cornerType", (Object) CredentialRpcData.ACTION_BOTH);
            }
        }
    }

    public boolean shouldSubmit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29f3a6b6", new Object[]{this})).booleanValue();
        }
        String str = this.mSubmit;
        if (str != null) {
            return str.equalsIgnoreCase("true");
        }
        return false;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return 2;
        }
        String string = jSONObject.getString("status");
        if ("hidden".equals(string)) {
            return 0;
        }
        return "disable".equals(string) ? 1 : 2;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public q1w validate() {
        JSONObject jSONObject;
        int size;
        Pattern pattern;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q1w) ipChange.ipc$dispatch("fa232c9f", new Object[]{this});
        }
        q1w q1wVar = new q1w();
        JSONObject jSONObject2 = this.mData;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("validate")) == null) {
            return q1wVar;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fields");
        JSONArray jSONArray2 = jSONObject.getJSONArray("regex");
        JSONArray jSONArray3 = jSONObject.getJSONArray("msg");
        if (jSONArray != null && jSONArray2 != null && jSONArray3 != null && !jSONArray.isEmpty() && (size = jSONArray.size()) == jSONArray2.size() && size == jSONArray3.size()) {
            for (int i = 0; i < size; i++) {
                String string = this.mFields.getString(jSONArray.getString(i));
                if (string == null) {
                    string = "";
                }
                String string2 = jSONArray2.getString(i);
                String string3 = jSONArray3.getString(i);
                try {
                    pattern = Pattern.compile(string2);
                } catch (Exception unused) {
                    pattern = null;
                }
                if (pattern != null && !pattern.matcher(string).find()) {
                    q1wVar.c(false);
                    q1wVar.b(string3);
                    q1wVar.a(this);
                    return q1wVar;
                }
            }
        }
        return q1wVar;
    }

    public void writeBackDataAndReloadEvent(JSONObject jSONObject, Map<String, List<gsb>> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124d44fe", new Object[]{this, jSONObject, map, new Boolean(z)});
        } else if (jSONObject != null) {
            loadData(jSONObject);
            this.mEventMap = map;
            if (z) {
                postNotification();
            }
        }
    }

    public DMComponent(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        this.mContainerType = "native";
        this.mContainerType = str;
        this.mContainerInfo = jSONObject2;
        loadData(jSONObject);
        this.mEventMap = parseEventMap(jSONObject);
    }

    public DMComponent(StatusNode statusNode) {
        List<UltronEvent> list;
        this.mContainerType = "native";
        if (statusNode != null) {
            this.mStatusNode = statusNode;
            this.componentKey = statusNode.getName();
            RenderTemplate renderTemplate = statusNode.getRenderTemplate();
            if (renderTemplate != null) {
                String containerType = renderTemplate.getContainerType();
                this.mContainerType = containerType;
                if (TextUtils.isEmpty(containerType)) {
                    this.mContainerType = "native";
                }
                JSONObject jSONObject = new JSONObject();
                this.mContainerInfo = jSONObject;
                jSONObject.put("name", (Object) renderTemplate.getName());
                this.mContainerInfo.put("containerType", (Object) this.mContainerType);
                this.mContainerInfo.put("version", (Object) renderTemplate.getVersion());
                this.mContainerInfo.put("url", (Object) renderTemplate.getUrl());
            }
            UltronComponent ultronComponent = statusNode.getUltronComponent();
            if (ultronComponent != null) {
                this.mData = ultronComponent.getRaw();
                this.mFields = ultronComponent.getFields();
                this.mTag = ultronComponent.getTag();
                this.mEvents = this.mData.getJSONObject("events");
                this.mID = this.mData.getString("id");
                this.mType = this.mData.getString("type");
                this.mExtendBlock = TextUtils.equals(this.mData.getString("extendBlock"), "true");
                this.mHasMore = TextUtils.equals(this.mData.getString("hasMore"), "true");
                setComponentPosition(this.mData.getString("position"));
            }
            Map<String, List<UltronEvent>> ultronEvents = statusNode.getUltronEvents();
            if (!(ultronEvents == null || ultronEvents.isEmpty())) {
                this.mEventMap = new HashMap();
                for (String str : ultronEvents.keySet()) {
                    if (!TextUtils.isEmpty(str) && (list = ultronEvents.get(str)) != null && !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (UltronEvent ultronEvent : list) {
                            if (ultronEvent != null) {
                                arrayList.add(new DMEvent(ultronEvent));
                            }
                        }
                        this.mEventMap.put(str, arrayList);
                    }
                }
            }
        }
    }
}
