package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class am extends nt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740593);
    }

    public am(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
    }

    public static /* synthetic */ Object ipc$super(am amVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/aura/impl/AURARenderColumnLayoutDelegate");
    }

    @Override // tb.qcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
        }
        return pg1.ATOM_EXT_column;
    }

    @Override // tb.nt
    public boolean e(nt ntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bce4b8f2", new Object[]{this, ntVar})).booleanValue();
        }
        return false;
    }

    public final float[] x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("6e5e92ca", new Object[]{this});
        }
        int l = l();
        float[] fArr = new float[l];
        float f = 100.0f / l;
        for (int i = 0; i < l; i++) {
            fArr[i] = f;
        }
        return fArr;
    }

    public final Map<String, Object> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b5172a2", new Object[]{this});
        }
        AURARenderComponentData aURARenderComponentData = q().data;
        if (aURARenderComponentData == null) {
            return null;
        }
        return aURARenderComponentData.fields;
    }

    public final int z(Map<String, Object> map, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1de4612a", new Object[]{this, map, str, new Integer(i)})).intValue();
        }
        if (map == null) {
            return i;
        }
        String str2 = (String) fk.b(map, str, String.class, String.valueOf(i));
        if (yn.a(str2)) {
            return i;
        }
        try {
            return ai.a(Integer.parseInt(str2));
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // tb.nt
    public a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5a762bd4", new Object[]{this});
        }
        ch chVar = new ch(l());
        chVar.m0(A());
        Map<String, Object> y = y();
        chVar.M(z(y, "marginLeft", 0));
        chVar.N(z(y, "marginRight", 0));
        chVar.O(z(y, "marginTop", 0));
        chVar.L(z(y, "marginBottom", 0));
        chVar.l0(z(y, "divisionWidth", 0));
        return chVar;
    }

    public final float[] A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("7f0e7795", new Object[]{this});
        }
        Map<String, Object> y = y();
        if (y == null) {
            return x();
        }
        Object obj = y.get("weights");
        if (!(obj instanceof String)) {
            return x();
        }
        String[] split = ((String) obj).split(":");
        int l = l();
        float[] fArr = new float[l];
        for (int i = 0; i < l; i++) {
            fArr[i] = 0.0f;
        }
        int min = Math.min(split.length, l);
        float f = 0.0f;
        for (int i2 = 0; i2 < min; i2++) {
            try {
                float max = Math.max(Float.parseFloat(split[i2]), 0.0f);
                fArr[i2] = max;
                f += max;
            } catch (Exception unused) {
                return x();
            }
        }
        if (f <= 0.0f) {
            return x();
        }
        for (int i3 = 0; i3 < l; i3++) {
            fArr[i3] = (fArr[i3] / f) * 100.0f;
        }
        return fArr;
    }
}
