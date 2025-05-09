package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.di6;
import tb.ef5;
import tb.zwu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hxu implements f4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f8v f20949a;
    public s b;
    public final Map<String, g4e> c = new HashMap();
    public final Map<String, g4e> d = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements y3e<String, g4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f20950a;

        public a(hxu hxuVar, Map map) {
            this.f20950a = map;
        }

        /* renamed from: b */
        public void a(String str, g4e g4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc3af58", new Object[]{this, str, g4eVar});
            } else {
                this.f20950a.put(str, g4eVar.r());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements y3e<AURARenderComponent, zwu.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20951a;

        public b(Context context) {
            this.f20951a = context;
        }

        /* renamed from: b */
        public void a(AURARenderComponent aURARenderComponent, zwu.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1373bd4", new Object[]{this, aURARenderComponent, aVar});
                return;
            }
            g4e c = hxu.c(hxu.this, aVar);
            c.m0(hxu.e(hxu.this));
            c.G2(this.f20951a, aURARenderComponent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements y3e<String, g4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d4e f20952a;

        public c(hxu hxuVar, d4e d4eVar) {
            this.f20952a = d4eVar;
        }

        /* renamed from: b */
        public void a(String str, g4e g4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc3af58", new Object[]{this, str, g4eVar});
            } else {
                g4eVar.x(this.f20952a);
            }
        }
    }

    static {
        t2o.a(80740756);
        t2o.a(80740750);
    }

    public static /* synthetic */ g4e c(hxu hxuVar, zwu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g4e) ipChange.ipc$dispatch("89e6ef04", new Object[]{hxuVar, aVar});
        }
        return hxuVar.h(aVar);
    }

    public static /* synthetic */ s e(hxu hxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("d2306e2e", new Object[]{hxuVar});
        }
        return hxuVar.b;
    }

    @Override // tb.f4e
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54838a8e", new Object[]{this});
        } else {
            j(new ixu(this));
        }
    }

    @Override // tb.f4e
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99da7ea", new Object[]{this});
        } else {
            j(new jxu(this));
        }
    }

    @Override // tb.f4e
    @Deprecated
    public void M(UMFRenderIO uMFRenderIO, txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c314a5", new Object[]{this, uMFRenderIO, txuVar});
            return;
        }
        ((HashMap) this.d).clear();
        txuVar.f("eventHandler", o(txuVar.a(), txuVar.b()));
        txuVar.f("dinamicXEngineRouter", n(txuVar.a(), (s) txuVar.c("dinamicXEngineRouter", s.class), (Map) txuVar.c("dxWidgetMap", Map.class), (Map) txuVar.c("dxDataParserMap", Map.class)));
        p(txuVar.b(), uMFRenderIO);
    }

    @Override // tb.f4e
    public void N(u3e u3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f10030", new Object[]{this, u3eVar});
            return;
        }
        f8v f8vVar = this.f20949a;
        if (f8vVar != null && (u3eVar instanceof cz)) {
            f8vVar.d(((qwu) u3eVar).h(), (rtd) u3eVar);
        }
    }

    public final g4e h(zwu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g4e) ipChange.ipc$dispatch("9286fce8", new Object[]{this, aVar});
        }
        String b2 = aVar.b();
        g4e g4eVar = (g4e) ((HashMap) this.c).get(b2);
        if (g4eVar == null) {
            g4eVar = q();
            ((HashMap) this.c).put(b2, g4eVar);
        }
        ((HashMap) this.d).put(b2, g4eVar);
        return g4eVar;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826f676b", new Object[]{this});
        } else if (((HashMap) this.d).isEmpty()) {
            dxu.a().e("UMFRenderContainerExtension", "initContainerExtension#没有可用的Container渲染，确保传入的数据正确（确保dirtyMap中的type和key正确）");
        }
    }

    public final void j(y3e<String, g4e> y3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663052ef", new Object[]{this, y3eVar});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            y3eVar.a(entry.getKey(), entry.getValue());
        }
    }

    public final void k(UMFRenderIO uMFRenderIO, y3e<AURARenderComponent, zwu.a> y3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c07d44", new Object[]{this, uMFRenderIO, y3eVar});
            return;
        }
        zwu dirtyMap = uMFRenderIO.getDirtyMap();
        if (dirtyMap == null) {
            dxu.a().e("UMFRenderContainerExtension", "execute#dirtyRoot is null");
            return;
        }
        List<zwu.a> a2 = dirtyMap.a();
        if (a2 == null || a2.isEmpty()) {
            dxu.a().e("UMFRenderContainerExtension", "execute#dirtyRoot is is empty");
            return;
        }
        List<AURARenderComponent> renderTreeList = uMFRenderIO.getRenderTreeList();
        if (!(renderTreeList == null || renderTreeList.isEmpty())) {
            for (zwu.a aVar : a2) {
                String a3 = aVar.a();
                if (!TextUtils.isEmpty(a3)) {
                    for (AURARenderComponent aURARenderComponent : renderTreeList) {
                        if (a3.equals(aURARenderComponent.key)) {
                            y3eVar.a(aURARenderComponent, aVar);
                        }
                    }
                }
            }
        }
    }

    public final s n(String str, s sVar, Map<Long, qub> map, Map<Long, evb> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("22c95d1b", new Object[]{this, str, sVar, map, map2});
        }
        if (sVar == null) {
            s sVar2 = new s(new DXEngineConfig.b(str).Q(2).F());
            this.b = sVar2;
            sVar2.s(1544903441687469454L, new xwu());
            this.b.s(38447420286L, new xwu());
            this.b.s(7023701163946200378L, new wwu());
            this.b.u(ef5.DXCALENDARVIEW_CALENDARVIEW, new ef5.e());
            this.b.u(di6.DXTEXTINPUTVIEW_TEXTINPUTVIEW, new di6.d());
            if (map != null) {
                for (Map.Entry<Long, qub> entry : map.entrySet()) {
                    this.b.u(entry.getKey().longValue(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<Long, evb> entry2 : map2.entrySet()) {
                    this.b.r(entry2.getKey().longValue(), entry2.getValue());
                }
            }
        } else {
            this.b = sVar;
        }
        return this.b;
    }

    public final f8v o(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8v) ipChange.ipc$dispatch("29050941", new Object[]{this, str, context});
        }
        if (this.f20949a == null) {
            try {
                this.f20949a = new f8v(com.alibaba.android.ultron.vfw.instance.a.q(new UltronInstanceConfig().z(str), context));
            } catch (Throwable th) {
                b4e a2 = dxu.a();
                a2.e("UMFRenderContainerExtension", "initEventHandler#init event handler exception," + th.getMessage());
            }
        }
        return this.f20949a;
    }

    public final void p(Context context, UMFRenderIO uMFRenderIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed225da5", new Object[]{this, context, uMFRenderIO});
            return;
        }
        k(uMFRenderIO, new b(context));
        i();
    }

    public final g4e q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g4e) ipChange.ipc$dispatch("6369007e", new Object[]{this});
        }
        return new mxu();
    }

    @Override // tb.f4e
    @Deprecated
    public Map<String, View> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4085fa99", new Object[]{this});
        }
        Map<String, g4e> map = this.d;
        if (map == null || ((HashMap) map).isEmpty()) {
            dxu.a().e("UMFRenderContainerExtension", "provideContentView#there is no active container extension delegate");
            return null;
        }
        HashMap hashMap = new HashMap();
        j(new a(this, hashMap));
        return hashMap;
    }

    @Override // tb.f4e
    public void x(d4e d4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd1eabc", new Object[]{this, d4eVar});
        } else {
            j(new c(this, d4eVar));
        }
    }
}
