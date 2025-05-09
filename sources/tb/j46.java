package tb;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.falco.n;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.mmad.render.dx.event.DXSwipeInteractEvent;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j46 extends ob5 implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MMTAP = 18615516725124L;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f21754a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(j46 j46Var) {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else if (errorResult != null) {
                jgh.a("DXMmTapEventHandler", "setItem error" + errorResult.getCode() + " msg  " + errorResult.getMsg());
            }
        }
    }

    static {
        t2o.a(573571190);
        t2o.a(144703491);
    }

    public j46(nwi nwiVar) {
        this.f21754a = nwiVar;
    }

    public static /* synthetic */ Object ipc$super(j46 j46Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/render/dx/event/DXMmTapEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95c9b8f", new Object[]{this, obj});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (!jSONObject.containsKey("megaStorage")) {
                jgh.a("DXMmTapEventHandler", "processArgs: args is null or not contains megaStorage");
                return;
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("megaStorage");
                Iterator<String> it = jSONObject2.keySet().iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    xii a2 = xii.a();
                    toh a3 = toh.a(next, jSONObject2.getJSONObject(next).toJSONString());
                    a3.f28843a = 20000L;
                    a3.d = true;
                    a2.d(a3, new a(this));
                }
            } catch (Throwable th) {
                jgh.a("DXMmTapEventHandler", "processArgs: meet exception " + th);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
        if (r9.equals(com.taobao.falco.n.LEAVE_TYPE_JUMP_NEXT_PAGE) == false) goto L_0x004f;
     */
    @Override // tb.hdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r9, tb.kdb r10, java.util.Map<java.lang.String, ?> r11, tb.vq r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j46.execute(java.lang.String, tb.kdb, java.util.Map, tb.vq):com.alibaba.ability.result.ExecuteResult");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        String str = "";
        String obj = (objArr == null || objArr.length <= 0) ? str : objArr[0].toString();
        String obj2 = (objArr == null || objArr.length <= 1) ? str : objArr[1].toString();
        String obj3 = (objArr == null || objArr.length <= 2) ? str : objArr[2].toString();
        if (objArr != null && objArr.length > 3) {
            str = objArr[3].toString();
        }
        if (objArr != null && objArr.length > 4) {
            objArr[4].toString();
        }
        if (objArr != null && objArr.length >= 3) {
            a(objArr[2]);
        }
        jgh.a("DXMmTapEventHandler", "handleDXEvent eventName: " + obj);
        BaseMmAdModel a2 = this.f21754a.d().a();
        if (dXEvent instanceof DXSwipeInteractEvent) {
            DXSwipeInteractEvent dXSwipeInteractEvent = (DXSwipeInteractEvent) dXEvent;
            jgh.a("DXMmTapEventHandler", "handleEvent DXSwipeInteractEvent=" + dXSwipeInteractEvent);
            ecj.c(this.f21754a, 8);
            if (!dXSwipeInteractEvent.isTriggerInteractSuccess()) {
                return;
            }
        } else {
            jgh.a("DXMmTapEventHandler", "handleEvent default click event.");
            ecj.c(this.f21754a, 7);
            i4v.t(this.f21754a);
        }
        jj8 c = ik8.c(this.f21754a);
        m0j.e(this.f21754a, obj);
        obj.hashCode();
        char c2 = 65535;
        switch (obj.hashCode()) {
            case -414047463:
                if (obj.equals("commonActionEvent")) {
                    c2 = 0;
                    break;
                }
                break;
            case 23457852:
                if (obj.equals(me0.EVENT_TYPE)) {
                    c2 = 1;
                    break;
                }
                break;
            case 958137415:
                if (obj.equals(DXTraceUtil.TYPE_EVENT_CHAIN_STRING)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1475693025:
                if (obj.equals("claimedCoupon")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1537694801:
                if (obj.equals("openVideo")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1980299888:
                if (obj.equals(n.LEAVE_TYPE_JUMP_NEXT_PAGE)) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.f21754a.f().b(obj, nj8.a(a2.actionResponse, c));
                break;
            case 1:
                this.f21754a.f().b(obj, nj8.a(new ne0(a2), c));
                break;
            case 2:
                ik8.b(dXEvent, obj2, dXRuntimeContext);
                break;
            case 3:
                this.f21754a.f().b(obj, nj8.a(new rln(a2), c));
                break;
            case 4:
                this.f21754a.f().b(obj, nj8.a(new u5l(obj2, obj3, str), c));
                break;
            case 5:
                nj8 f = this.f21754a.f();
                if (TextUtils.isEmpty(obj2)) {
                    obj2 = a2.getTargetUrl();
                }
                f.b(obj, nj8.a(obj2, c));
                break;
            default:
                jgh.a("DXMmTapEventHandler", "handleEvent not support event: ".concat(obj));
                break;
        }
        if (this.f21754a.g() != null && this.f21754a.g().b() != null) {
            this.f21754a.g().b().l("disableInteract", Boolean.TRUE);
        }
    }
}
