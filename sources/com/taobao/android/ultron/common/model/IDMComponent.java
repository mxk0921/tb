package com.taobao.android.ultron.common.model;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.gsb;
import tb.lmi;
import tb.q1w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface IDMComponent extends Serializable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    boolean clearOnceExtMap();

    String getAdjustOperatorAction();

    String getCardGroup();

    List<IDMComponent> getChildren();

    Map<String, DMComponent> getCodePopupWindowMap();

    JSONObject getContainerInfo();

    String getContainerType();

    JSONObject getData();

    Map<String, List<gsb>> getEventMap();

    JSONObject getEvents();

    ArrayMap<String, Object> getExtMap();

    String getExtendType();

    JSONObject getFields();

    JSONObject getHidden();

    String getId();

    String getKey();

    JSONObject getLayout();

    JSONObject getLayoutStyle();

    String getLayoutType();

    LinkageType getLinkageType();

    lmi getMessageChannel();

    int getModifiedCount();

    ArrayMap<String, Object> getOnceExtMap();

    IDMComponent getParent();

    String getPosition();

    ConcurrentHashMap<String, Object> getSafeExtMap();

    JSONObject getStashData();

    int getStatus();

    String getTag();

    String getType();

    boolean isNormalComponent();

    void record();

    void rollBack();

    void setAdjustOperatorAction(String str);

    void setComponentCardGroupTag(String str);

    void setComponentPosition(String str);

    void setCornerTypeFields(int i);

    void setCustomValidate(a aVar);

    void setExtendType(String str);

    void setLayoutType(String str);

    void setMessageChannel(lmi lmiVar);

    void updateModifiedCount();

    q1w validate();

    void writeBackData(JSONObject jSONObject, boolean z);

    void writeBackDataAndReloadEvent(JSONObject jSONObject, boolean z);

    void writeBackFields(JSONObject jSONObject, boolean z);

    void writeFields(String str, Object obj);
}
