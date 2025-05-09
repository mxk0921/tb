package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hnm implements ybd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ucd> f20767a = new ConcurrentHashMap();
    public final Map<String, ucd> b = new ConcurrentHashMap();
    public final e7e c;

    static {
        t2o.a(447741973);
        t2o.a(447741976);
    }

    public hnm(e7e e7eVar) {
        this.c = e7eVar;
    }

    @Override // tb.ybd
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de3fe63", new Object[]{this, str});
            return;
        }
        ((ConcurrentHashMap) this.f20767a).remove(str);
        pa8.c().a(str);
    }

    @Override // tb.ybd
    public void b(String str, ucd ucdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdefe7c", new Object[]{this, str, ucdVar});
            return;
        }
        if (((ConcurrentHashMap) this.f20767a).containsKey(str)) {
            sdh.a(ModuleName.PRELOAD_ABILITY, "registerRepeat", "重复注册，当前taskId: " + str);
        }
        ((ConcurrentHashMap) this.f20767a).put(str, ucdVar);
    }

    public void c(xbd xbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b09c07", new Object[]{this, xbdVar});
            return;
        }
        enm enmVar = (enm) xbdVar;
        String d = enmVar.d();
        if (((ConcurrentHashMap) this.b).containsKey(d)) {
            sdh.b(ModuleName.PRELOAD_ABILITY, "已经初始化过了");
            return;
        }
        ucd ucdVar = (ucd) ((ConcurrentHashMap) this.f20767a).get(d);
        if (ucdVar != null) {
            ucdVar.c(this.c);
            ((ConcurrentHashMap) this.b).put(enmVar.d(), ucdVar);
            pa8.c().c(new na8(ucdVar));
            sdh.b(ModuleName.PRELOAD_ABILITY, "初始化task");
        }
    }
}
