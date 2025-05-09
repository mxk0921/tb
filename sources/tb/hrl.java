package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714316);
    }

    public static MediaMixContentDetailResponse a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("b971fb69", new Object[]{jSONObject});
        }
        return hnn.b(jSONObject);
    }

    public static MediaMixContentDetailResponse b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("368dfdbe", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            return hnn.b(JSON.parseObject(new String(bArr)));
        } catch (Exception e) {
            ir9.b("ParseMediaMixContentDetailResponseUtil", "convertNewRecommendToDetailResponse error:" + e.getMessage());
            return null;
        }
    }
}
