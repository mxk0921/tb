package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qj3 extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public String m;

    static {
        t2o.a(912262499);
    }

    public qj3(ComponentModel componentModel) {
        super(componentModel);
        Color.parseColor("#333333");
        Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
    }

    public static /* synthetic */ Object ipc$super(qj3 qj3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/CharityrViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.k) || !TextUtils.isEmpty(this.l)) {
            return false;
        }
        return true;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        ComponentModel componentModel = this.i;
        if (!(componentModel == null || (jSONObject3 = componentModel.mapping) == null)) {
            try {
                this.m = jSONObject3.getString("icon");
                this.k = jSONObject3.getString("title");
                this.l = jSONObject3.getString("text");
                jSONObject3.getString(rg0.JUMP_URL);
                jSONObject3.getString("spm");
                jSONObject3.getJSONObject("utParams");
            } catch (Exception e) {
                tgh.c("CharityrViewModel", "fail to parse data", e);
            }
        }
        ComponentModel componentModel2 = this.i;
        if (componentModel2 != null && (jSONObject2 = componentModel2.otherMapping) != null) {
            try {
                String string = jSONObject2.getString("titleColor");
                String string2 = jSONObject2.getString("backgroundColor");
                Color.parseColor(string);
                Color.parseColor(string2);
            } catch (Exception e2) {
                tgh.c("CharityrViewModel", "fail to parse titleColor or backgroundColor", e2);
            }
        }
    }
}
