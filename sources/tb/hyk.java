package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.InputData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.LiveDetailResponseData;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.jzk;
import tb.toy;
import tb.voy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hyk extends k2g<fyk> implements mky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fyk f20970a;
    public wt4 b = new wt4();

    static {
        t2o.a(1004535828);
        t2o.a(1003487263);
    }

    public hyk(fyk fykVar) {
        super(fykVar);
        this.f20970a = fykVar;
    }

    public static /* synthetic */ Object ipc$super(hyk hykVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -683216384) {
            super.b();
            return null;
        } else if (hashCode == 2024047597) {
            super.f();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/kmp/nexus/arch/openArch/component/OpenArchDataComponent");
        }
    }

    @Override // tb.f2g
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        } else {
            super.b();
        }
    }

    public final void e(Object obj) {
        InputData inputData;
        Map<String, ? extends Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f2f704", new Object[]{this, obj});
            return;
        }
        wt4 wt4Var = this.b;
        if (wt4Var != null && obj != null && (inputData = (InputData) KMPJSONUtils_androidKt.decodeFromJsonObject(a.Companion, new KMPJsonObject(obj), dun.b(InputData.class))) != null) {
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            inputData.setRawData(map);
            wt4Var.G(inputData);
        }
    }

    @Override // tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        this.b = null;
        super.f();
    }

    public final void h(Object obj) {
        x4j D;
        LiveDetailResponseData liveDetailResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c537abfc", new Object[]{this, obj});
            return;
        }
        wt4 wt4Var = this.b;
        if (wt4Var != null && (D = wt4Var.D()) != null && obj != null && (liveDetailResponseData = (LiveDetailResponseData) KMPJSONUtils_androidKt.decodeFromJsonObject(a.Companion, new KMPJsonObject(obj), dun.b(LiveDetailResponseData.class))) != null) {
            D.b(liveDetailResponseData);
        }
    }

    public final void j(Object obj) {
        Map map;
        Map map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359d2ee5", new Object[]{this, obj});
            return;
        }
        wt4 wt4Var = this.b;
        if (wt4Var != null && obj != null) {
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                map2 = kotlin.collections.a.t(map);
            } else {
                map2 = new LinkedHashMap();
            }
            wt4Var.H(new okj(map2));
        }
    }

    public final void k() {
        String str;
        n1l N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54316ee", new Object[]{this});
            return;
        }
        wt4 wt4Var = this.b;
        if (wt4Var != null) {
            wt4Var.b();
        }
        fyk l = l();
        if (l != null) {
            str = l.k();
        } else {
            str = null;
        }
        oyk g = a2l.INSTANCE.g(str);
        if (g != null && (N = g.N()) != null) {
            N.j(new k1l(Boolean.FALSE));
        }
    }

    public fyk l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyk) ipChange.ipc$dispatch("72b44af0", new Object[]{this});
        }
        return this.f20970a;
    }

    public final wt4 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wt4) ipChange.ipc$dispatch("fe7de551", new Object[]{this});
        }
        return this.b;
    }

    /* renamed from: q */
    public void a(fyk fykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2db284e", new Object[]{this, fykVar});
        } else {
            this.f20970a = fykVar;
        }
    }

    @Override // tb.mky
    public void s(Object obj) {
        okj E;
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddb157c", new Object[]{this, obj});
            return;
        }
        wt4 wt4Var = this.b;
        if (wt4Var != null && (E = wt4Var.E()) != null && obj != null) {
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                E.i(kotlin.collections.a.t(map));
            }
        }
    }

    public final void g(LiveDetailResponseData liveDetailResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7b29c", new Object[]{this, liveDetailResponseData});
            return;
        }
        ckf.g(liveDetailResponseData, "liveDetailInfoModel");
        pus.INSTANCE.k("LiveEngine", "", "assembleLiveDetailCoreData ");
        wt4 wt4Var = this.b;
        if (wt4Var != null) {
            x4j D = wt4Var.D();
            if (D != null) {
                D.b(liveDetailResponseData);
            }
            wt4Var.C().setLiveDetailReqSuccess(true);
        }
    }

    public final void o() {
        xyk j;
        x4j D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f7c9ba", new Object[]{this});
            return;
        }
        fyk l = l();
        Long l2 = null;
        oyk g = a2l.INSTANCE.g(l != null ? l.k() : null);
        wt4 wt4Var = this.b;
        LiveDetailResponseData a2 = (wt4Var == null || (D = wt4Var.D()) == null) ? null : D.a();
        pus pusVar = pus.INSTANCE;
        StringBuilder sb = new StringBuilder("postBizComponentDidAppearEvent ");
        if (a2 != null) {
            l2 = a2.getLiveId();
        }
        sb.append(l2);
        pusVar.k("LiveEngine", "", sb.toString());
        if (a2 != null) {
            Map k = kotlin.collections.a.k(jpu.a("liveDetailResponseModel", a2));
            voy.a aVar = voy.Companion;
            jzk.a aVar2 = jzk.Companion;
            String a3 = aVar.a(aVar2.b());
            q2g a4 = q2g.Companion.a(a3);
            StringBuilder sb2 = new StringBuilder("postBizComponentDidAppearEvent inner: ");
            sb2.append(a4);
            sb2.append(' ');
            sb2.append(a3);
            sb2.append(' ');
            toy.a aVar3 = toy.Companion;
            sb2.append(aVar3.a());
            pusVar.k("LiveEngine", "", sb2.toString());
            if (g != null && (j = g.j()) != null) {
                j.e(aVar3.a(), a4, new kzk(new r2g(aVar2.b(), k), g.k(), null, 4, null));
            }
        }
    }
}
