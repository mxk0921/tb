package com.taobao.themis.external.embed;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/themis/external/embed/WebStartParams;", "Lcom/taobao/themis/external/embed/SinglePageStartParams;", "Ljava/io/Serializable;", "()V", "initData", "Lcom/alibaba/fastjson/JSONObject;", "getInitData", "()Lcom/alibaba/fastjson/JSONObject;", "setInitData", "(Lcom/alibaba/fastjson/JSONObject;)V", "themis_web_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WebStartParams extends SinglePageStartParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject initData;

    static {
        t2o.a(850395137);
    }

    public static /* synthetic */ Object ipc$super(WebStartParams webStartParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/external/embed/WebStartParams");
    }

    public final JSONObject getInitData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("312669f7", new Object[]{this});
        }
        return this.initData;
    }

    public final void setInitData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ded6d", new Object[]{this, jSONObject});
        } else {
            this.initData = jSONObject;
        }
    }
}
