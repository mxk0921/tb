package com.taobao.unit.center.sync.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.unit.center.mtop.UnitCenterLayoutSyncModel;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;
import tb.a07;
import tb.ckf;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012,\b\u0002\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ-\u0010\u0012\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u0015\u001a\u00020\u00002,\b\u0002\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R5\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/taobao/unit/center/sync/model/LayoutResponse;", "", "groups", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "model", "Lcom/taobao/unit/center/mtop/UnitCenterLayoutSyncModel;", "resultJson", "Lorg/json/JSONObject;", "(Ljava/util/HashMap;Lcom/taobao/unit/center/mtop/UnitCenterLayoutSyncModel;Lorg/json/JSONObject;)V", "getGroups", "()Ljava/util/HashMap;", "getModel", "()Lcom/taobao/unit/center/mtop/UnitCenterLayoutSyncModel;", "getResultJson", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class LayoutResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final HashMap<String, Long> groups;
    private final UnitCenterLayoutSyncModel model;
    private final JSONObject resultJson;

    static {
        t2o.a(552599807);
    }

    public LayoutResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LayoutResponse copy$default(LayoutResponse layoutResponse, HashMap hashMap, UnitCenterLayoutSyncModel unitCenterLayoutSyncModel, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutResponse) ipChange.ipc$dispatch("f1f3abb4", new Object[]{layoutResponse, hashMap, unitCenterLayoutSyncModel, jSONObject, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            hashMap = layoutResponse.groups;
        }
        if ((i & 2) != 0) {
            unitCenterLayoutSyncModel = layoutResponse.model;
        }
        if ((i & 4) != 0) {
            jSONObject = layoutResponse.resultJson;
        }
        return layoutResponse.copy(hashMap, unitCenterLayoutSyncModel, jSONObject);
    }

    public final HashMap<String, Long> component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b0eb31fe", new Object[]{this});
        }
        return this.groups;
    }

    public final UnitCenterLayoutSyncModel component2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UnitCenterLayoutSyncModel) ipChange.ipc$dispatch("64efd1c7", new Object[]{this});
        }
        return this.model;
    }

    public final JSONObject component3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83944ccb", new Object[]{this});
        }
        return this.resultJson;
    }

    public final LayoutResponse copy(HashMap<String, Long> hashMap, UnitCenterLayoutSyncModel unitCenterLayoutSyncModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutResponse) ipChange.ipc$dispatch("ed29fca8", new Object[]{this, hashMap, unitCenterLayoutSyncModel, jSONObject});
        }
        return new LayoutResponse(hashMap, unitCenterLayoutSyncModel, jSONObject);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof LayoutResponse) {
                LayoutResponse layoutResponse = (LayoutResponse) obj;
                if (!ckf.b(this.groups, layoutResponse.groups) || !ckf.b(this.model, layoutResponse.model) || !ckf.b(this.resultJson, layoutResponse.resultJson)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HashMap<String, Long> getGroups() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("24042f74", new Object[]{this});
        }
        return this.groups;
    }

    public final UnitCenterLayoutSyncModel getModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UnitCenterLayoutSyncModel) ipChange.ipc$dispatch("cc5fcee5", new Object[]{this});
        }
        return this.model;
    }

    public final JSONObject getResultJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9fac9590", new Object[]{this});
        }
        return this.resultJson;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        HashMap<String, Long> hashMap = this.groups;
        if (hashMap != null) {
            i = hashMap.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        UnitCenterLayoutSyncModel unitCenterLayoutSyncModel = this.model;
        if (unitCenterLayoutSyncModel != null) {
            i2 = unitCenterLayoutSyncModel.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        JSONObject jSONObject = this.resultJson;
        if (jSONObject != null) {
            i3 = jSONObject.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LayoutResponse(groups=" + this.groups + ", model=" + this.model + ", resultJson=" + this.resultJson + f7l.BRACKET_END_STR;
    }

    public LayoutResponse(HashMap<String, Long> hashMap, UnitCenterLayoutSyncModel unitCenterLayoutSyncModel, JSONObject jSONObject) {
        this.groups = hashMap;
        this.model = unitCenterLayoutSyncModel;
        this.resultJson = jSONObject;
    }

    public /* synthetic */ LayoutResponse(HashMap hashMap, UnitCenterLayoutSyncModel unitCenterLayoutSyncModel, JSONObject jSONObject, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : hashMap, (i & 2) != 0 ? null : unitCenterLayoutSyncModel, (i & 4) != 0 ? null : jSONObject);
    }
}
