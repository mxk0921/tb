package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vsm extends z20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hnm f30225a;

    static {
        t2o.a(447741974);
    }

    public vsm(e7e e7eVar) {
        this.f30225a = new hnm(e7eVar);
    }

    public static /* synthetic */ Object ipc$super(vsm vsmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/dojo/ability/preload/PreloadServiceImpl");
    }

    @Override // com.taobao.dojo.ability.preload.protocol.IPreloadService
    public void a(xbd xbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9da59c", new Object[]{this, xbdVar});
        } else if (xbdVar != null) {
            this.f30225a.c(xbdVar);
        }
    }

    @Override // com.taobao.dojo.ability.preload.protocol.IPreloadService
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa168a2", new Object[]{this, str});
        }
    }

    @Override // com.taobao.dojo.ability.preload.protocol.IPreloadService
    public ybd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ybd) ipChange.ipc$dispatch("6b341907", new Object[]{this});
        }
        return this.f30225a;
    }
}
