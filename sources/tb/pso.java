package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeType;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final pso b;

    /* renamed from: a  reason: collision with root package name */
    public final Set<ScancodeType> f26275a = new LinkedHashSet();

    static {
        t2o.a(760217695);
        pso psoVar = new pso();
        b = psoVar;
        ScancodeType scancodeType = ScancodeType.QR;
        ScancodeType scancodeType2 = ScancodeType.GEN3;
        psoVar.b(ScancodeType.PRODUCT, scancodeType, ScancodeType.ANTI_FAKE, ScancodeType.EXPRESS, ScancodeType.MEDICINE, ScancodeType.TB_4G, scancodeType2);
        new pso().b(scancodeType, scancodeType2);
    }

    public boolean a(ScancodeType scancodeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12a0f9d1", new Object[]{this, scancodeType})).booleanValue();
        }
        if (scancodeType == null) {
            return false;
        }
        return this.f26275a.contains(scancodeType);
    }

    public void b(ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a88251", new Object[]{this, scancodeTypeArr});
        } else if (scancodeTypeArr != null && scancodeTypeArr.length > 0) {
            Collections.addAll(this.f26275a, scancodeTypeArr);
        }
    }

    public void c(ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7a1686", new Object[]{this, scancodeTypeArr});
        } else if (scancodeTypeArr != null && scancodeTypeArr.length > 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Collections.addAll(linkedHashSet, scancodeTypeArr);
            this.f26275a.removeAll(linkedHashSet);
        }
    }

    public Set<ScancodeType> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("40c1c0d8", new Object[]{this});
        }
        return this.f26275a;
    }
}
