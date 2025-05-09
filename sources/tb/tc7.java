package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tc7 extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public String m;
    public float n;
    public float o;
    public JSONObject p;

    static {
        t2o.a(912262504);
    }

    public tc7(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(tc7 tc7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/DescGifViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.l)) {
            return true;
        }
        return false;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.k = jSONObject.getString("thumbnail");
            this.l = jSONObject.getString("videoUrl");
            this.m = jSONObject.getString("videoId");
            this.p = jSONObject.getJSONObject("utParams");
            JSONObject jSONObject2 = jSONObject.getJSONObject("size");
            if (jSONObject2 != null) {
                try {
                    this.n = jSONObject2.getFloatValue("height");
                    this.o = jSONObject2.getFloatValue("width");
                } catch (Exception unused) {
                }
            }
            if (this.n == 0.0f || this.o == 0.0f) {
                this.n = 480.0f;
                this.o = 640.0f;
            }
        }
    }
}
