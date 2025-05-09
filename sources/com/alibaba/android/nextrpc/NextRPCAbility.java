package com.alibaba.android.nextrpc;

import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsNextRPCAbility;
import com.taobao.android.abilityidl.ability.NextRPCAttachedResponse;
import com.taobao.android.abilityidl.ability.NextRPCErrorInfo;
import com.taobao.android.abilityidl.ability.NextRPCFinishResult;
import com.taobao.android.abilityidl.ability.NextRPCMtopResponse;
import com.taobao.android.abilityidl.ability.NextRPCReceiveDataResult;
import com.taobao.android.abilityidl.ability.NextRPCRequest;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import mtopsdk.mtop.domain.MtopRequest;
import tb.a3o;
import tb.ckf;
import tb.dh1;
import tb.dxl;
import tb.fj9;
import tb.jdb;
import tb.kdb;
import tb.n0d;
import tb.n9u;
import tb.pg1;
import tb.q3o;
import tb.r2k;
import tb.r5o;
import tb.s2k;
import tb.szh;
import tb.t2k;
import tb.u2k;
import tb.v2k;
import tb.v3i;
import tb.xhv;
import tb.z0i;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0003¨\u0006\u0016"}, d2 = {"Lcom/alibaba/android/nextrpc/NextRPCAbility;", "Lcom/taobao/android/abilityidl/ability/AbsNextRPCAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/r2k;", "params", "Ltb/jdb;", "callback", "Ltb/xhv;", pg1.ATOM_EXT_bind, "(Ltb/kdb;Ltb/r2k;Ltb/jdb;)V", "Ltb/s2k;", "cancel", "(Ltb/kdb;Ltb/s2k;Ltb/jdb;)V", "Ltb/v2k;", "Ltb/n0d;", "request", "(Ltb/kdb;Ltb/v2k;Ltb/n0d;)V", "unbind", "onDestroy", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NextRPCAbility extends AbsNextRPCAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q3o f2219a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements r5o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ n0d b;
        public final /* synthetic */ Ref$ObjectRef c;
        public final /* synthetic */ v2k d;
        public final /* synthetic */ Ref$ObjectRef e;

        public a(n0d n0dVar, Ref$ObjectRef ref$ObjectRef, v2k v2kVar, Ref$ObjectRef ref$ObjectRef2) {
            this.b = n0dVar;
            this.c = ref$ObjectRef;
            this.d = v2kVar;
            this.e = ref$ObjectRef2;
        }

        @Override // tb.r5o
        public void a(z0i z0iVar, List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89132812", new Object[]{this, z0iVar, list, new Boolean(z)});
                return;
            }
            ckf.g(z0iVar, "mainResponse");
            ckf.g(list, "attachedResponses");
            NextRPCReceiveDataResult nextRPCReceiveDataResult = new NextRPCReceiveDataResult();
            nextRPCReceiveDataResult.mtopResponse = NextRPCAbility.access$getMtopResponse(NextRPCAbility.this, z0iVar, ((a3o) this.c.element).b());
            nextRPCReceiveDataResult.attachedResponses = NextRPCAbility.access$getAttachedResponses(NextRPCAbility.this, list, Boolean.valueOf(this.d.f29745a));
            ((dxl) this.e.element).a(z0iVar.h());
            this.b.S(nextRPCReceiveDataResult);
        }

        @Override // tb.r5o
        public void b(fj9 fj9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9ebfbe3", new Object[]{this, fj9Var});
                return;
            }
            ckf.g(fj9Var, "finishResult");
            NextRPCFinishResult nextRPCFinishResult = new NextRPCFinishResult();
            nextRPCFinishResult.errorType = fj9Var.a().name();
            nextRPCFinishResult.isSuccess = Boolean.valueOf(fj9Var.b());
            nextRPCFinishResult.performance = ((dxl) this.e.element).c();
            this.b.m0(nextRPCFinishResult);
        }

        @Override // tb.r5o
        public void c(szh szhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40186e18", new Object[]{this, szhVar});
                return;
            }
            ckf.g(szhVar, "errorResponse");
            NextRPCReceiveDataResult nextRPCReceiveDataResult = new NextRPCReceiveDataResult();
            NextRPCMtopResponse nextRPCMtopResponse = new NextRPCMtopResponse();
            NextRPCErrorInfo nextRPCErrorInfo = new NextRPCErrorInfo();
            nextRPCErrorInfo.errorMsg = szhVar.d();
            nextRPCErrorInfo.retCode = szhVar.c();
            nextRPCErrorInfo.responseCode = String.valueOf(szhVar.b());
            nextRPCErrorInfo.mappingCode = szhVar.a();
            xhv xhvVar = xhv.INSTANCE;
            nextRPCMtopResponse.errorInfo = nextRPCErrorInfo;
            nextRPCReceiveDataResult.mtopResponse = nextRPCMtopResponse;
            ((dxl) this.e.element).a(szhVar.e());
            this.b.G(nextRPCReceiveDataResult);
        }

        @Override // tb.r5o
        public void d(a3o a3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f01fd9d0", new Object[]{this, a3oVar});
                return;
            }
            ckf.g(a3oVar, "request");
            n0d n0dVar = this.b;
            NextRPCRequest nextRPCRequest = new NextRPCRequest();
            nextRPCRequest.requestID = a3oVar.f();
            xhv xhvVar = xhv.INSTANCE;
            n0dVar.t1(nextRPCRequest);
        }

        @Override // tb.r5o
        public void e(List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba18dfd3", new Object[]{this, list, new Boolean(z)});
                return;
            }
            ckf.g(list, "attachedResponses");
            NextRPCReceiveDataResult nextRPCReceiveDataResult = new NextRPCReceiveDataResult();
            nextRPCReceiveDataResult.attachedResponses = NextRPCAbility.access$getAttachedResponses(NextRPCAbility.this, list, Boolean.valueOf(this.d.f29745a));
            this.b.a0(nextRPCReceiveDataResult);
        }
    }

    public static final /* synthetic */ List access$getAttachedResponses(NextRPCAbility nextRPCAbility, List list, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("49a76083", new Object[]{nextRPCAbility, list, bool});
        }
        return nextRPCAbility.b(list, bool);
    }

    public static final /* synthetic */ MtopBusiness access$getMtopBusiness(NextRPCAbility nextRPCAbility, MtopRequest mtopRequest, v2k v2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("b3993a65", new Object[]{nextRPCAbility, mtopRequest, v2kVar});
        }
        return nextRPCAbility.c(mtopRequest, v2kVar);
    }

    public static final /* synthetic */ MtopRequest access$getMtopRequest(NextRPCAbility nextRPCAbility, v2k v2kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("7f3578ae", new Object[]{nextRPCAbility, v2kVar});
        }
        return nextRPCAbility.d(v2kVar);
    }

    public static final /* synthetic */ NextRPCMtopResponse access$getMtopResponse(NextRPCAbility nextRPCAbility, z0i z0iVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRPCMtopResponse) ipChange.ipc$dispatch("7cf7ef42", new Object[]{nextRPCAbility, z0iVar, bool});
        }
        return nextRPCAbility.e(z0iVar, bool);
    }

    public static /* synthetic */ Object ipc$super(NextRPCAbility nextRPCAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/NextRPCAbility");
    }

    public final Map<String, String> a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1cf484a", new Object[]{this, map});
        }
        Map t = kotlin.collections.a.t(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(v3i.e(t.size()));
        for (Map.Entry entry : ((LinkedHashMap) t).entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    public final List<NextRPCAttachedResponse> b(List<dh1> list, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f46a92a", new Object[]{this, list, bool});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (dh1 dh1Var : list) {
                NextRPCAttachedResponse nextRPCAttachedResponse = new NextRPCAttachedResponse();
                nextRPCAttachedResponse.header = dh1Var.c();
                if (ckf.b(bool, Boolean.TRUE)) {
                    nextRPCAttachedResponse.strBody = dh1Var.e();
                } else {
                    nextRPCAttachedResponse.body = dh1Var.b();
                }
                arrayList.add(nextRPCAttachedResponse);
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    public void bind(kdb kdbVar, r2k r2kVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee517", new Object[]{this, kdbVar, r2kVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(r2kVar, "params");
        ckf.g(jdbVar, "callback");
        if (this.f2219a == null) {
            n9u n9uVar = n9u.INSTANCE;
            TraceName traceName = TraceName.NEXTRPC_CREATE_CLIENT;
            n9uVar.a(traceName);
            this.f2219a = q3o.Companion.a(r2kVar.f27062a);
            n9uVar.b(traceName);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    public void cancel(kdb kdbVar, s2k s2kVar, jdb jdbVar) {
        q3o q3oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48927f7", new Object[]{this, kdbVar, s2kVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(s2kVar, "params");
        ckf.g(jdbVar, "callback");
        List<String> list = s2kVar.f27759a;
        if (list != null && (q3oVar = this.f2219a) != null) {
            q3oVar.b(list);
        }
    }

    public final MtopRequest d(v2k v2kVar) {
        String str;
        String str2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("38d49215", new Object[]{this, v2kVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        t2k t2kVar = v2kVar.b;
        Map<String, ? extends Object> map = null;
        if (t2kVar != null) {
            str = t2kVar.f28431a;
        } else {
            str = null;
        }
        mtopRequest.setApiName(str);
        t2k t2kVar2 = v2kVar.b;
        if (t2kVar2 != null) {
            str2 = t2kVar2.b;
        } else {
            str2 = null;
        }
        mtopRequest.setVersion(str2);
        t2k t2kVar3 = v2kVar.b;
        if (t2kVar3 != null) {
            z = t2kVar3.f;
        }
        mtopRequest.setNeedEcode(z);
        mtopRequest.setNeedSession(true);
        t2k t2kVar4 = v2kVar.b;
        if (t2kVar4 != null) {
            map = t2kVar4.c;
        }
        if (map != null) {
            mtopRequest.setData(map.toString());
        }
        return mtopRequest;
    }

    public final NextRPCMtopResponse e(z0i z0iVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRPCMtopResponse) ipChange.ipc$dispatch("2a832dbb", new Object[]{this, z0iVar, bool});
        }
        NextRPCMtopResponse nextRPCMtopResponse = new NextRPCMtopResponse();
        nextRPCMtopResponse.responseHeader = z0iVar.f();
        if (ckf.b(bool, Boolean.TRUE)) {
            nextRPCMtopResponse.strBody = z0iVar.i();
        } else {
            nextRPCMtopResponse.data = z0iVar.e();
        }
        nextRPCMtopResponse.currentId = z0iVar.g().f;
        return nextRPCMtopResponse;
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        q3o q3oVar = this.f2219a;
        if (q3oVar != null) {
            q3oVar.h();
        }
        u2k.b("NextRPCAbility", "NextRPC能力销毁了", 0L, null, 12, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, tb.dxl] */
    /* JADX WARN: Type inference failed for: r1v3, types: [tb.a3o, T] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void request(tb.kdb r9, tb.v2k r10, tb.n0d r11) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.nextrpc.NextRPCAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "98151b27"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            r3 = 1
            r2[r3] = r9
            r9 = 2
            r2[r9] = r10
            r9 = 3
            r2[r9] = r11
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = "context"
            tb.ckf.g(r9, r0)
            java.lang.String r9 = "params"
            tb.ckf.g(r10, r9)
            java.lang.String r9 = "callback"
            tb.ckf.g(r11, r9)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            tb.n9u r9 = tb.n9u.INSTANCE
            com.alibaba.android.nextrpc.streamv2.trace.TraceName r0 = com.alibaba.android.nextrpc.streamv2.trace.TraceName.NEXTRPC_CREATE_REQUEST
            r9.a(r0)
            tb.dxl r1 = new tb.dxl
            r1.<init>()
            r5.element = r1
            r1.b()
            com.alibaba.android.nextrpc.NextRPCAbility$request$$inlined$run$lambda$1 r1 = new com.alibaba.android.nextrpc.NextRPCAbility$request$$inlined$run$lambda$1
            r1.<init>(r8, r5, r10, r3)
            tb.a3o r1 = r1.invoke2()
            r3.element = r1
            r9.b(r0)
            tb.q3o r9 = r8.f2219a
            if (r9 == 0) goto L_0x0069
            T r0 = r3.element
            r6 = r0
            tb.a3o r6 = (tb.a3o) r6
            com.alibaba.android.nextrpc.NextRPCAbility$a r7 = new com.alibaba.android.nextrpc.NextRPCAbility$a
            r0 = r7
            r1 = r8
            r2 = r11
            r4 = r10
            r0.<init>(r2, r3, r4, r5)
            r9.d(r6, r7)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.nextrpc.NextRPCAbility.request(tb.kdb, tb.v2k, tb.n0d):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNextRPCAbility
    public void unbind(kdb kdbVar, r2k r2kVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f957de", new Object[]{this, kdbVar, r2kVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(r2kVar, "params");
        ckf.g(jdbVar, "callback");
        q3o q3oVar = this.f2219a;
        if (q3oVar != null) {
            q3oVar.h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
        if (tb.ckf.b(r0 != null ? r0.k : null, "originaljson") != false) goto L_0x00a2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.tao.remotebusiness.MtopBusiness c(mtopsdk.mtop.domain.MtopRequest r5, tb.v2k r6) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.android.nextrpc.NextRPCAbility.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "c99c0b4c"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            com.taobao.tao.remotebusiness.MtopBusiness r5 = (com.taobao.tao.remotebusiness.MtopBusiness) r5
            return r5
        L_0x001b:
            com.taobao.tao.remotebusiness.MtopBusiness r5 = com.taobao.tao.remotebusiness.MtopBusiness.build(r5)
            tb.t2k r1 = r6.b
            r2 = 0
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = r1.d
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            java.lang.String r3 = "POST"
            boolean r1 = tb.ckf.b(r1, r3)
            if (r1 == 0) goto L_0x0036
            mtopsdk.mtop.domain.MethodEnum r1 = mtopsdk.mtop.domain.MethodEnum.POST
            r5.reqMethod(r1)
            goto L_0x003b
        L_0x0036:
            mtopsdk.mtop.domain.MethodEnum r1 = mtopsdk.mtop.domain.MethodEnum.GET
            r5.reqMethod(r1)
        L_0x003b:
            tb.t2k r1 = r6.b
            if (r1 == 0) goto L_0x0042
            java.util.Map<java.lang.String, ? extends java.lang.Object> r3 = r1.h
            goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            if (r3 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x004c
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r1.h
            if (r1 == 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L_0x0051:
            java.util.Map r1 = r4.a(r1)
            r5.headers(r1)
        L_0x0058:
            tb.t2k r1 = r6.b
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r1.e
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            java.lang.String r3 = "UNIT_GUIDE"
            boolean r1 = tb.ckf.b(r1, r3)
            if (r1 == 0) goto L_0x006c
            r5.setUnitStrategy(r3)
            goto L_0x0071
        L_0x006c:
            java.lang.String r1 = "UNIT_TRADE"
            r5.setUnitStrategy(r1)
        L_0x0071:
            tb.t2k r1 = r6.b
            if (r1 == 0) goto L_0x007d
            java.lang.Boolean r1 = r1.m
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.booleanValue()
        L_0x007d:
            r5.upstreamCompress(r0)
            tb.t2k r0 = r6.b
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r0.k
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            java.lang.String r1 = "json"
            boolean r0 = tb.ckf.b(r0, r1)
            if (r0 != 0) goto L_0x00a2
            tb.t2k r0 = r6.b
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r0.k
            goto L_0x0099
        L_0x0098:
            r0 = r2
        L_0x0099:
            java.lang.String r1 = "originaljson"
            boolean r0 = tb.ckf.b(r0, r1)
            if (r0 == 0) goto L_0x00b2
        L_0x00a2:
            tb.t2k r0 = r6.b
            if (r0 == 0) goto L_0x00a8
            java.lang.String r2 = r0.k
        L_0x00a8:
            tb.ckf.d(r2)
            mtopsdk.mtop.domain.JsonTypeEnum r0 = mtopsdk.mtop.domain.JsonTypeEnum.valueOf(r2)
            r5.setJsonType(r0)
        L_0x00b2:
            tb.t2k r0 = r6.b
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r0.j
            if (r0 == 0) goto L_0x00bd
            r5.setBizTopic(r0)
        L_0x00bd:
            tb.t2k r6 = r6.b
            if (r6 == 0) goto L_0x00c8
            java.lang.String r6 = r6.l
            if (r6 == 0) goto L_0x00c8
            r5.setCustomDomain(r6)
        L_0x00c8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.nextrpc.NextRPCAbility.c(mtopsdk.mtop.domain.MtopRequest, tb.v2k):com.taobao.tao.remotebusiness.MtopBusiness");
    }
}
