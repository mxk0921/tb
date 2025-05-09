package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ymm implements ucd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xbd f32201a;
    public WeakReference<e7e> b;
    public final cji c = new cji(Globals.getApplication(), "PageHome");

    static {
        t2o.a(729810255);
        t2o.a(447741984);
    }

    public ymm(xbd xbdVar) {
        this.f32201a = xbdVar;
    }

    @Override // tb.ucd
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce1a2d79", new Object[]{this});
        }
        return ((enm) this.f32201a).d();
    }

    @Override // tb.ucd
    public void c(e7e e7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defa2dcc", new Object[]{this, e7eVar});
        } else {
            this.b = new WeakReference<>(e7eVar);
        }
    }

    @Override // tb.ucd
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "preLoadChunk";
    }

    @Override // tb.ucd
    public int priority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8c08c1e", new Object[]{this})).intValue();
        }
        WeakReference<e7e> weakReference = this.b;
        if (weakReference == null) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "mScorerRef == null");
            return 0;
        }
        e7e e7eVar = weakReference.get();
        if (e7eVar == null) {
            return 0;
        }
        int a2 = e7eVar.a(this.f32201a);
        sdh.b(ModuleName.PRELOAD_ABILITY, "taskId: " + ((enm) this.f32201a).d() + ",priority: " + a2);
        return a2;
    }

    @Override // tb.ucd
    public int b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6ef43a6", new Object[]{this, map})).intValue();
        }
        String c = ((enm) this.f32201a).c();
        if (TextUtils.isEmpty(c)) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "url == null");
            return 0;
        }
        this.c.a(c);
        sdh.b(ModuleName.PRELOAD_ABILITY, "preloadFirstChunk:" + c);
        zmm.d(c);
        return 1;
    }
}
