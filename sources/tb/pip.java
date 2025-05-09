package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pip extends pt1 {
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;
    public final int n;
    public final JSONObject o;

    static {
        t2o.a(352321541);
    }

    public pip(JSONObject jSONObject, Object obj) {
        super(obj);
        JSONObject jSONObject2;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("simpleShareItemModel")) != null) {
            this.e = jSONObject2.getString("imageUrl");
            this.f = jSONObject2.getString("businessId");
            this.g = jSONObject2.getString("desc");
            this.h = jSONObject2.getString("shareUrl");
            this.i = jSONObject2.getString("title");
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("mediaPublisher");
                if (jSONObject3 != null) {
                    this.j = jSONObject3.getString("nick");
                    this.k = jSONObject3.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR);
                }
                JSONObject jSONObject4 = jSONObject2.getJSONObject(yj4.PARAM_MEDIA_INFO);
                if (jSONObject4 != null) {
                    this.l = Integer.parseInt(jSONObject4.getString("type"));
                    this.n = Integer.parseInt(jSONObject4.getString("height"));
                    this.m = Integer.parseInt(jSONObject4.getString("width"));
                }
                this.o = jSONObject2.getJSONObject("templateParams");
            } catch (Exception e) {
                txj.f("new_detail异常", "share mediaInfo解析异常", e);
            }
        }
    }
}
