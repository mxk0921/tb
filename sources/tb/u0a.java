package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u0a extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String k;
    public String l;
    public String m;
    public int n;
    public int o;
    public int p;

    static {
        t2o.a(912262508);
    }

    public u0a(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(u0a u0aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/FullTextViewModel");
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
    public es7 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (es7) ipChange.ipc$dispatch("9f63107b", new Object[]{this});
        }
        return null;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        this.k = jSONObject.getString("textColor");
        this.l = jSONObject.getString("text");
        this.m = jSONObject.getString(vaj.KEY_BG_COLOR);
        jSONObject.getString("fontName");
        jSONObject.getBoolean("hasDoubleLine").booleanValue();
        int intValue = jSONObject.getInteger("textHeight").intValue();
        this.p = intValue;
        if (intValue > 0) {
            this.p = mr7.a(intValue);
        }
        if (jSONObject.containsKey("alignment")) {
            try {
                this.n = Integer.parseInt(jSONObject.getString("alignment"));
            } catch (Throwable unused) {
                this.n = 0;
            }
        }
        if (jSONObject.containsKey("fontSize")) {
            try {
                this.o = Integer.parseInt(jSONObject.getString("fontSize"));
            } catch (Throwable unused2) {
                this.o = 14;
            }
        }
        int i = this.o;
        if (i > 0) {
            this.o = mr7.a(i);
        }
    }
}
