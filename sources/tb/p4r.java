package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p4r extends h9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final p18 l;

    static {
        t2o.a(786432073);
    }

    public p4r(JSONObject jSONObject) {
        super(jSONObject);
        if (this.h != null) {
            this.l = new p18(this.h);
            return;
        }
        this.l = new p18(this.g);
        this.g = vwf.f(this.g, "data", null);
    }

    public static /* synthetic */ Object ipc$super(p4r p4rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/pop/TAKDxPopParams");
    }

    @Override // tb.h9
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51290782", new Object[]{this});
        }
        DXTemplateItem d = this.l.d();
        return "https://dinamicx.taobao.com/v3?name=" + d.f7343a + "&version=" + d.b;
    }
}
