package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "content")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Content extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject commonUtParams;
    private final JSONObject extendParams;
    private final String seeIds;
    private final String title;

    static {
        t2o.a(912261665);
    }

    public Content(JSONObject jSONObject) {
        super(jSONObject);
        this.title = jSONObject.getString("title");
        this.seeIds = jSONObject.getString("seeIds");
        this.commonUtParams = jSONObject.getJSONObject("commonUtParams");
        this.extendParams = jSONObject.getJSONObject("extendParams");
    }

    public static /* synthetic */ Object ipc$super(Content content, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Content");
    }

    public JSONObject getCommonUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("762149ad", new Object[]{this});
        }
        return this.commonUtParams;
    }

    public JSONObject getExtendParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e7b2c5d", new Object[]{this});
        }
        return this.extendParams;
    }

    public String getSeeIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24f9c57e", new Object[]{this});
        }
        return this.seeIds;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }
}
