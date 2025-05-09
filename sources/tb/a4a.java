package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a4a implements pr6<wua> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_header_pic";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f15532a;

    static {
        t2o.a(912261534);
        t2o.a(912261532);
    }

    public a4a(Context context, ze7 ze7Var) {
        this.f15532a = ze7Var;
    }

    /* renamed from: b */
    public wua a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wua) ipChange.ipc$dispatch("163c9229", new Object[]{this, jSONObject});
        }
        return c(DynamicMergeUtils.h(jSONObject));
    }

    public final wua c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wua) ipChange.ipc$dispatch("b03364ec", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("model")) == null || (jSONObject3 = jSONObject2.getJSONObject("headerPic")) == null) {
            return null;
        }
        if (vbl.i0() && DataUtils.b0(this.f15532a.e())) {
            try {
                DataUtils.a(jSONObject3);
            } catch (Throwable th) {
                tgh.b("DefaultParser", "extractHeaderPicData error=" + Log.getStackTraceString(th));
            }
        }
        return new wua(jSONObject3, this.f15532a.b().d());
    }
}
