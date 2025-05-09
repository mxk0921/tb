package com.alibaba.android.ultron.trade.event.model;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SimplePopupModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AsSelect asSelect;
    public JSONArray components;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class AsSelect implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String max;
        public String optional;
        public List<String> selectedIds;

        static {
            t2o.a(155189345);
        }

        public String getMax() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5f7c218b", new Object[]{this});
            }
            return this.max;
        }

        public String getOptional() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5d95a7e3", new Object[]{this});
            }
            return this.optional;
        }

        public List<String> getSelectedIds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("88a09699", new Object[]{this});
            }
            return this.selectedIds;
        }

        public void setMax(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e94f2b3", new Object[]{this, str});
            } else {
                this.max = str;
            }
        }

        public void setOptional(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dffcaef3", new Object[]{this, str});
            } else {
                this.optional = str;
            }
        }

        public void setSelectedIds(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43a98453", new Object[]{this, list});
            } else {
                this.selectedIds = list;
            }
        }
    }

    static {
        t2o.a(155189344);
    }

    public AsSelect getAsSelect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsSelect) ipChange.ipc$dispatch("53dbe977", new Object[]{this});
        }
        return this.asSelect;
    }

    public JSONArray getComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f16a4e4b", new Object[]{this});
        }
        return this.components;
    }

    public void setAsSelect(AsSelect asSelect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f1ac63", new Object[]{this, asSelect});
        } else {
            this.asSelect = asSelect;
        }
    }

    public void setComponents(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2c5ec7", new Object[]{this, jSONArray});
        } else {
            this.components = jSONArray;
        }
    }
}
