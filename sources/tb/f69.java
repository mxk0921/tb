package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.FeedsData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f19046a;

    static {
        t2o.a(573571145);
    }

    public f69(nwi nwiVar) {
        this.f19046a = nwiVar;
    }

    public static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc7385d", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            jSONObject.put("sectionBizCode", "home_splash_linked_texiu");
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("ext", (Object) jSONObject2);
            }
            jSONObject2.put("isTopShowCard", "true");
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6d5399", new Object[]{this, new Integer(i)});
            return;
        }
        jgh.a("FeedsManager", "start insertSeekTimeToData currentSeekTime=" + i);
        JSONObject i2 = this.f19046a.d().i();
        if (i2 != null && b(i2)) {
            JSONObject jSONObject = i2.getJSONObject("ext");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                i2.put("ext", (Object) jSONObject);
            }
            jSONObject.put(FeedsData.KEY_VIDEO_CURRENT_POSITION, (Object) Integer.valueOf(i));
            jgh.a("FeedsManager", "end insertSeekTimeToData currentSeekTime=" + i);
        }
    }

    public final boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eed3ad0f", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("item");
        if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("0")) == null || (jSONObject3 = jSONObject2.getJSONObject("content")) == null || jSONObject3.getIntValue("isResumable") != 1) {
            return false;
        }
        return true;
    }
}
