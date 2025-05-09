package com.alibaba.android.umf.node.service.parse;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.service.parse.UMFParseIO;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderIO;
import com.alibaba.android.umf.node.service.parse.ParseProcess;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.axu;
import tb.b4e;
import tb.c4e;
import tb.cij;
import tb.dxu;
import tb.gz;
import tb.hz;
import tb.t2o;
import tb.txu;
import tb.x3e;
import tb.zwu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a extends gz<UMFParseIO, UMFRenderIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ParseProcess c;
    public final ParseProcess.c d;
    public hz<UMFRenderIO> e;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.umf.node.service.parse.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0081a implements ParseProcess.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0081a() {
        }

        @Override // com.alibaba.android.umf.node.service.parse.ParseProcess.c
        public void a(List<AURARenderComponent> list, List<Map<String, String>> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc86958a", new Object[]{this, list, list2});
            } else if (a.e(a.this) != null && list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Map<String, String> map : list2) {
                    if (map != null) {
                        for (String str : map.keySet()) {
                            arrayList.add(new zwu.a(str, map.get(str)));
                        }
                    }
                }
                zwu zwuVar = new zwu();
                zwuVar.b(arrayList);
                ((cij.a) a.e(a.this)).b(new UMFRenderIO(list, zwuVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements x3e<c4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMFParseIO f2399a;

        public b(a aVar, UMFParseIO uMFParseIO) {
            this.f2399a = uMFParseIO;
        }

        /* renamed from: b */
        public void a(c4e c4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b12c6e", new Object[]{this, c4eVar});
            } else {
                c4eVar.z0(this.f2399a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements x3e<c4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ txu f2400a;
        public final /* synthetic */ UMFParseIO b;

        public c(txu txuVar, UMFParseIO uMFParseIO) {
            this.f2400a = txuVar;
            this.b = uMFParseIO;
        }

        /* renamed from: b */
        public void a(c4e c4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b12c6e", new Object[]{this, c4eVar});
                return;
            }
            b4e a2 = dxu.a();
            a2.d("UMFParseService", "parse finish， bizCode=" + this.f2400a.a());
            if (this.b.dataProtocol != null) {
                a.f(a.this).l(this.b.dataProtocol, c4eVar);
                return;
            }
            throw new IllegalArgumentException("Input 参数【dataProtocol】为NULL");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements x3e<c4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMFRenderIO f2401a;

        public d(a aVar, UMFRenderIO uMFRenderIO) {
            this.f2401a = uMFRenderIO;
        }

        /* renamed from: b */
        public void a(c4e c4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b12c6e", new Object[]{this, c4eVar});
            } else {
                c4eVar.B0(this.f2401a);
            }
        }
    }

    static {
        t2o.a(80740703);
    }

    public a() {
        ParseProcess parseProcess = new ParseProcess();
        this.c = parseProcess;
        C0081a aVar = new C0081a();
        this.d = aVar;
        parseProcess.b(aVar);
    }

    public static /* synthetic */ hz e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hz) ipChange.ipc$dispatch("aa775c2d", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ ParseProcess f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParseProcess) ipChange.ipc$dispatch("af65f4c", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 846308095) {
            super.onAfterExecute((UMFBaseIO) objArr[0], (txu) objArr[1]);
            return null;
        } else if (hashCode == 1938185630) {
            super.onBeforeExecute((UMFBaseIO) objArr[0], (txu) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/umf/node/service/parse/UMFParseService");
        }
    }

    /* renamed from: g */
    public void onAfterExecute(UMFRenderIO uMFRenderIO, txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a15f3d", new Object[]{this, uMFRenderIO, txuVar});
            return;
        }
        super.onAfterExecute(uMFRenderIO, txuVar);
        a(c4e.class, new d(this, uMFRenderIO));
    }

    /* renamed from: h */
    public void onBeforeExecute(UMFParseIO uMFParseIO, txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3fcc94", new Object[]{this, uMFParseIO, txuVar});
            return;
        }
        super.onBeforeExecute(uMFParseIO, txuVar);
        a(c4e.class, new b(this, uMFParseIO));
    }

    /* renamed from: i */
    public void onExecute(UMFParseIO uMFParseIO, txu txuVar, hz<UMFRenderIO> hzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27e8411", new Object[]{this, uMFParseIO, txuVar, hzVar});
            return;
        }
        this.e = hzVar;
        List list = (List) a(c4e.class, new c(txuVar, uMFParseIO)).a();
        if (list == null || list.isEmpty()) {
            ((cij.a) hzVar).a(new axu("-1", "至少需要提供一个 IUMFParseAbility 的实现"));
        }
    }

    @Override // tb.gz, com.alibaba.android.umf.node.service.IUMFService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ParseProcess.c cVar = this.d;
        if (cVar != null) {
            this.c.s(cVar);
        }
        this.c.j();
    }
}
