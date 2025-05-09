package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cs7 extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLANK = 100;
    public static final int TYPE_NO_LINE_TEXT = 102;
    public static final int TYPE_TEXT = 101;
    public String k;
    public int l;
    public int m;
    public String n;

    static {
        t2o.a(912262506);
    }

    public cs7() {
        super(null);
        this.k = "#eeeeee";
        this.l = 9;
        this.m = 100;
    }

    public static /* synthetic */ Object ipc$super(cs7 cs7Var, String str, Object... objArr) {
        if (str.hashCode() == 896084260) {
            return super.d();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/DividerViewModel");
    }

    @Override // tb.md7
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        if (this.m == 100) {
            return this.d;
        }
        return super.d();
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
        if (jSONObject.containsKey("bgcolor")) {
            this.k = jSONObject.getString("bgcolor");
        } else {
            this.k = "#eeeeee";
        }
        if (jSONObject.containsKey("height")) {
            this.l = jSONObject.getIntValue("height");
        } else {
            this.l = 0;
        }
        if (jSONObject.containsKey("text")) {
            this.n = jSONObject.getString("text");
        }
        String string = jSONObject.getString("type");
        if (r4p.VALUE_CLICK_AREA_BLANK.equals(string)) {
            this.m = 100;
        } else if ("text".equals(string)) {
            this.m = 101;
        } else if ("noLineText".equals(string)) {
            this.m = 102;
        } else {
            this.m = 100;
        }
    }

    public cs7(ComponentModel componentModel) {
        super(componentModel);
    }
}
