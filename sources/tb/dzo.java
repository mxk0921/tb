package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dzo extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public es7 l;

    static {
        t2o.a(912262530);
    }

    public dzo(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(dzo dzoVar, String str, Object... objArr) {
        if (str.hashCode() == -1620897669) {
            return super.i();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/ScrollableContainerModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        if (b() == null || b().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // tb.md7
    public es7 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (es7) ipChange.ipc$dispatch("9f63107b", new Object[]{this});
        }
        es7 i = super.i();
        this.l = i;
        return i;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
        } else {
            this.k = jSONObject.getString("extraText");
        }
    }
}
