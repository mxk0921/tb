package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.HashSet;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e6b extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STYLE_RECT = 1;
    public static HashSet<Integer> p;
    public int k;
    public double l;
    public double m;
    public double n;
    public double o;

    static {
        t2o.a(912262512);
    }

    public e6b(ComponentModel componentModel) {
        super(componentModel);
        HashSet<Integer> hashSet = new HashSet<>();
        p = hashSet;
        hashSet.add(1);
    }

    public static /* synthetic */ Object ipc$super(e6b e6bVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.h());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/HotAreaViewModel");
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
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (p.contains(Integer.valueOf(this.k)) && this.m < this.o && this.l < this.n && this.i.actionModelList != null) {
            return super.h();
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
        String string = jSONObject.getString("position");
        String string2 = jSONObject.getString("type");
        JSONObject parseObject = JSON.parseObject(string);
        if (parseObject != null && !parseObject.isEmpty()) {
            try {
                this.l = Double.parseDouble(parseObject.getString("startX"));
            } catch (Exception unused) {
                this.l = -1.0d;
            }
            this.l = l(this.l);
            try {
                this.m = Double.parseDouble(parseObject.getString("startY"));
            } catch (Exception unused2) {
                this.m = -1.0d;
            }
            this.m = l(this.m);
            try {
                this.n = Double.parseDouble(parseObject.getString("endX"));
            } catch (Exception unused3) {
                this.n = -1.0d;
            }
            this.n = l(this.n);
            try {
                this.o = Double.parseDouble(parseObject.getString("endY"));
            } catch (Exception unused4) {
                this.o = -1.0d;
            }
            this.o = l(this.o);
        }
        if (!TextUtils.isEmpty(string2)) {
            try {
                this.k = Integer.parseInt(string2);
            } catch (Exception unused5) {
            }
        }
    }

    public double l(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba9874c5", new Object[]{this, new Double(d)})).doubleValue();
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        if (d < vu3.b.GEO_NOT_SUPPORT) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return d;
    }
}
