package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j4w extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public String m;
    public String n;
    public int o;
    public int p;
    public String q;
    public String r;

    static {
        t2o.a(912262537);
    }

    public j4w(ComponentModel componentModel) {
        super(componentModel);
        tgh.b("MyLog", "DescViewModelFactory--创建Vessel");
    }

    public static /* synthetic */ Object ipc$super(j4w j4wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/VesselViewModel");
    }

    @Override // tb.md7
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        return TextUtils.isEmpty(this.k);
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        this.l = jSONObject.getString("bizType");
        this.p = jSONObject.getIntValue("height");
        int intValue = jSONObject.getIntValue("loadMode");
        this.o = intValue;
        if (this.p < 0) {
            this.p = 0;
        }
        if (intValue < 0) {
            this.o = 0;
        }
        this.k = jSONObject.getString("url");
        this.m = jSONObject.getString("md5");
        this.n = jSONObject.getString("spm");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.q = jSONObject2.getString("itemId");
        this.r = jSONObject2.getString("sellerId");
    }
}
