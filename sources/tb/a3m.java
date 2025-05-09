package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a3m extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public String m;

    static {
        t2o.a(912262523);
    }

    public a3m(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(a3m a3mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/PictureJumperViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        this.k = jSONObject.getString("actPicUrl");
        jSONObject.getString(rg0.JUMP_URL);
        this.m = jSONObject.getString("widthRatio");
        this.l = jSONObject.getString(hij.KEY_HEIGHT_RATIO);
    }
}
