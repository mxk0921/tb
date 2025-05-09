package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ugj extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public float m;
    public float n;
    public String o;
    public String p;
    public String q;

    static {
        t2o.a(912262516);
    }

    public ugj(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(ugj ugjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/NBVideoModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        return TextUtils.isEmpty(this.l);
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        this.k = jSONObject.getString("thumbnail");
        this.l = jSONObject.getString("videoUrl");
        this.o = jSONObject.getString("videoId");
        this.p = jSONObject.getString("title");
        this.q = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            try {
                this.m = jSONObject2.getFloatValue("height");
                this.n = jSONObject2.getFloatValue("width");
            } catch (Exception unused) {
            }
        }
        if (this.m == 0.0f || this.n == 0.0f) {
            this.m = 9.0f;
            this.n = 16.0f;
        }
    }
}
