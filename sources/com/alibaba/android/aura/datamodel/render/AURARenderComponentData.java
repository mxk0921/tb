package com.alibaba.android.aura.datamodel.render;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARenderComponentData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> codePopupWindowMap;
    public AURARenderComponentContainer container;
    public final Map<String, List<Event>> events;
    public final Object features;
    public Map<String, Object> fields;
    public AURARenderComponentLayout layout;
    public Map<String, Object> localFields;
    public String status;
    public final String type;

    static {
        t2o.a(80740396);
    }

    public AURARenderComponentData() {
        this.type = null;
        this.fields = null;
        this.events = null;
        this.features = null;
        this.container = null;
    }

    public static AURARenderComponentData CreateEmptyUMFRenderComponentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentData) ipChange.ipc$dispatch("a8ab883c", new Object[0]);
        }
        return new AURARenderComponentData(null, null, null, null, null, null, null, null);
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.status) || !"disable".equals(this.status.toLowerCase())) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UMFRenderComponentData{, fields=" + this.fields + ", type='" + this.type + "', layoutInfo=" + this.layout + ", containerInfo=" + this.container + '}';
    }

    public AURARenderComponentData(String str, Map<String, Object> map, Map<String, List<Event>> map2, Object obj, AURARenderComponentContainer aURARenderComponentContainer, Map<String, Object> map3, Map<String, Object> map4, String str2) {
        this.type = str;
        this.fields = map;
        this.events = map2;
        this.features = obj;
        this.container = aURARenderComponentContainer;
        this.codePopupWindowMap = map3;
        this.localFields = map4;
        this.status = str2;
    }
}
