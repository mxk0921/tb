package com.alibaba.android.umf.datamodel.protocol.ultron;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tb.ah;
import tb.ck;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Container extends BaseProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Container";
    @Deprecated
    public boolean cache;
    @Deprecated
    public List<ComponentView> data;
    @Deprecated
    public String id;
    private JSONObject mOriginData;
    @Deprecated
    public String version;

    static {
        t2o.a(80740662);
    }

    public Container() {
    }

    public static /* synthetic */ Object ipc$super(Container container, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/datamodel/protocol/ultron/Container");
    }

    public boolean getCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de5c1457", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.mOriginData;
        if (jSONObject == null) {
            return this.cache;
        }
        return jSONObject.getBoolean("cache").booleanValue();
    }

    public List<ComponentView> getData() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        if (this.data == null) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("data")) == null) {
                return null;
            }
            this.data = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.data.add(new ComponentView(jSONArray.getJSONObject(i)));
            }
        }
        return this.data;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.id)) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.id = jSONObject.getString("id");
        }
        return this.id;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.version)) {
            JSONObject jSONObject = this.mOriginData;
            if (jSONObject == null) {
                return null;
            }
            this.version = jSONObject.getString("version");
        }
        return this.version;
    }

    public Container(JSONObject jSONObject) {
        this.mOriginData = jSONObject;
    }

    public Container clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("c2964b4a", new Object[]{this});
        }
        Container container = (Container) super.clone();
        try {
            container.data = ah.c(getData());
        } catch (IOException e) {
            ck.g().b(TAG, "clone.IOException", e.getMessage());
        } catch (ClassNotFoundException e2) {
            ck.g().b(TAG, "clone.ClassNotFoundException", e2.getMessage());
        }
        return container;
    }
}
