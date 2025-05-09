package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w4m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f30451a;
    public String b;
    public String c;

    static {
        t2o.a(352321798);
    }

    public w4m(JSONObject jSONObject) {
        c(jSONObject);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2461cb13", new Object[]{this});
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.b;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38c006c", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            txj.e(txj.TAG_RENDER, "PlaceHolderComponent解析失败，root为空");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            this.f30451a = jSONObject2;
            if (jSONObject2 == null) {
                txj.e(txj.TAG_RENDER, "PlaceHolderComponent解析失败，root.data为空");
                return;
            }
            this.b = jSONObject2.getString("imageUrl");
            this.c = this.f30451a.getString("contentModeScene");
            this.f30451a.getString("imageRatio");
        }
    }
}
