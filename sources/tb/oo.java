package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.render.scroll.userMotion")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class oo implements tcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nbb f25520a;
    public UserMotionConfig b;
    public JSONObject c;
    public fsv d;
    public List<gsv> e;

    static {
        t2o.a(81789218);
        t2o.a(80740553);
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f25520a = loVar.c();
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.b = (UserMotionConfig) aURAGlobalData.get("userMotionConfig", UserMotionConfig.class);
        this.c = (JSONObject) aURAGlobalData.get("userMotionCommonArgs", JSONObject.class);
        fsv fsvVar = (fsv) aURAGlobalData.get("userMotionRecorder", fsv.class);
        this.d = fsvVar;
        if (fsvVar == null) {
            fsv fsvVar2 = new fsv();
            this.d = fsvVar2;
            aURAGlobalData.update("userMotionRecorder", fsvVar2);
        }
        List<gsv> list = (List) aURAGlobalData.get("userMotionScrollDistancePeriodCache", List.class);
        this.e = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            aURAGlobalData.update("userMotionScrollDistancePeriodCache", arrayList);
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.tcb
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if (cw6.b()) {
            rbb g = ck.g();
            g.c("AURAUserMotionScrollExtension", "onScrollStateChanged", "newState:" + i);
        }
        if (i == 0) {
            r();
        }
    }

    public final void r() {
        hsv hsvVar;
        int i;
        int i2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbec39d", new Object[]{this});
            return;
        }
        List<gsv> list = this.e;
        if (list != null) {
            int i4 = 0;
            for (gsv gsvVar : list) {
                i2 += gsvVar.f20202a;
                i4 += gsvVar.b;
            }
            if (i2 != 0) {
                if (i2 > 0) {
                    i = 4;
                } else {
                    i = 3;
                }
                hsvVar = hsv.a(i, Math.abs(i2));
            } else if (i4 != 0) {
                if (i4 > 0) {
                    i3 = 2;
                }
                hsvVar = hsv.a(i3, Math.abs(i4));
            } else {
                hsvVar = null;
            }
            if (!(hsvVar == null || this.d == null)) {
                isv.d(this.f25520a, this.b, this.c, hsvVar.b());
                this.d.a(hsvVar);
            }
            this.e.clear();
        }
    }

    @Override // tb.tcb
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        if (cw6.b()) {
            rbb g = ck.g();
            g.c("AURAUserMotionScrollExtension", "onScrolled", "dx:" + i + ",dy:" + i2);
        }
        List<gsv> list = this.e;
        if (list != null) {
            if (list.isEmpty()) {
                this.e.add(new gsv(i, i2));
                return;
            }
            gsv gsvVar = this.e.get(this.e.size() - 1);
            gsv gsvVar2 = new gsv(i, i2);
            if (i != 0) {
                if (gsvVar.f20202a * i > 0) {
                    this.e.add(gsvVar2);
                    return;
                }
                r();
                this.e.add(gsvVar2);
            } else if (i2 == 0) {
            } else {
                if (gsvVar.b * i2 > 0) {
                    this.e.add(gsvVar2);
                    return;
                }
                r();
                this.e.add(gsvVar2);
            }
        }
    }
}
