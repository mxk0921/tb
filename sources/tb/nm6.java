package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nm6 implements gxb<exb> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_PLAYING_VIDEO = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f24823a;
    public final Set<Integer> b = new HashSet();

    static {
        t2o.a(444597108);
        t2o.a(444597090);
    }

    public nm6(int i) {
        this.f24823a = i;
    }

    /* renamed from: b */
    public boolean a(exb exbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1852ddf0", new Object[]{this, exbVar})).booleanValue();
        }
        return ((HashSet) this.b).contains(Integer.valueOf(exbVar.hashCode()));
    }

    /* renamed from: d */
    public void c(cxb<?, exb> cxbVar, exb exbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedecb54", new Object[]{this, cxbVar, exbVar, str});
        } else if (!((HashSet) this.b).contains(Integer.valueOf(exbVar.hashCode())) && ((HashSet) this.b).size() < this.f24823a) {
            ((HashSet) this.b).add(Integer.valueOf(exbVar.hashCode()));
            if (DinamicXEngine.j0()) {
                h36.g("DXVideoController", "notifyVideoPlay: " + exbVar);
            }
            exbVar.onCanPlay(cxbVar, str);
        }
    }

    /* renamed from: f */
    public void e(cxb<?, exb> cxbVar, exb exbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f80ddb46", new Object[]{this, cxbVar, exbVar, str});
        } else if (((HashSet) this.b).contains(Integer.valueOf(exbVar.hashCode()))) {
            h(exbVar);
            if (DinamicXEngine.j0()) {
                h36.g("DXVideoController", "notifyVideoStop: " + exbVar);
            }
            exbVar.onShouldStop(cxbVar, str);
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61266f64", new Object[]{this})).intValue();
        }
        return Math.max(0, this.f24823a - ((HashSet) this.b).size());
    }

    /* renamed from: i */
    public void h(exb exbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f42d58", new Object[]{this, exbVar});
        } else {
            ((HashSet) this.b).remove(Integer.valueOf(exbVar.hashCode()));
        }
    }
}
