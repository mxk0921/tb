package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;
import tb.uf7;
import tb.xka;
import tb.zf8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RuleModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> actions;
    public JSONArray children;
    public String filter;
    public String locatorId;
    public String mapping;
    public JSONObject root;
    public String style;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(RuleModel ruleModel) {
        }

        /* renamed from: b */
        public String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be839d4a", new Object[]{this, obj});
            }
            return (String) obj;
        }
    }

    static {
        t2o.a(912262492);
    }

    public RuleModel(JSONObject jSONObject) {
        this.root = jSONObject;
        this.filter = jSONObject.getString("filter");
        String string = jSONObject.getString("payload");
        this.mapping = string;
        if (TextUtils.isEmpty(string)) {
            this.mapping = jSONObject.getString("model");
        }
        this.locatorId = jSONObject.getString(xka.KEY_LOCATOR_ID);
        this.type = jSONObject.getString("type");
        this.actions = initAction(jSONObject.getJSONArray("actions"));
        this.style = uf7.c(jSONObject.getString("style"));
        this.children = jSONObject.getJSONArray("children");
    }

    private List<String> initAction(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("919dbb92", new Object[]{this, jSONArray});
        }
        return uf7.a(jSONArray, new a(this));
    }
}
