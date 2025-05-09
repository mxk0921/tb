package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y16 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_KT_EVENT_EVENTCHAIN = 4767677960174347083L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f31782a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f31782a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                y16.this.b(this.f31782a, this.b, this.c, null);
            }
        }
    }

    static {
        t2o.a(444596687);
        new AtomicInteger(0);
    }

    public static /* synthetic */ Object ipc$super(y16 y16Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/eventchain/DXKtChainEventHandler");
    }

    public wx5 a(DXRuntimeContext dXRuntimeContext, String str) {
        Short sh;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wx5) ipChange.ipc$dispatch("348c1255", new Object[]{this, dXRuntimeContext, str});
        }
        g76 dxOriginTreeProperty = dXRuntimeContext.W().getDxOriginTreeProperty();
        if (dxOriginTreeProperty == null || dxOriginTreeProperty.c() == null || (sh = dxOriginTreeProperty.c().get(str)) == null) {
            return null;
        }
        return dXRuntimeContext.z(sh.shortValue());
    }

    public void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode) {
        uw5[] uw5VarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6221471", new Object[]{this, dXEvent, objArr, dXRuntimeContext, dXWidgetNode});
        } else if (objArr != null && objArr.length != 0 && !TextUtils.isEmpty(objArr[0].toString())) {
            if (dXRuntimeContext == null || dXRuntimeContext.s() == null || dXRuntimeContext.s().f() == null) {
                h36.g("dxKTEventHandler", "dx ktevnetchain handle error : Missing the necessary parameters(eventChainManage)");
                return;
            }
            tx5 I = dXRuntimeContext.r().I();
            String obj = objArr[0].toString();
            wx5 a2 = a(dXRuntimeContext, obj);
            if (a2 == null) {
                h36.g("dxKTEventHandler", "dx ktevnetchain handle error : 找不到对应的方法 " + obj);
                return;
            }
            if (objArr.length > 1) {
                uw5VarArr = new uw5[objArr.length - 1];
                for (int i = 1; i < objArr.length; i++) {
                    uw5VarArr[i - 1] = uw5.c(objArr[i]);
                }
            } else {
                uw5VarArr = null;
            }
            sx5 sx5Var = new sx5(dXRuntimeContext.x(), dXRuntimeContext.g(), 3, dXRuntimeContext);
            h36.n(" 开始调用事件链 ", obj);
            uw5 a3 = I.a(a2, uw5VarArr, sx5Var);
            if (a3 == null) {
                h36.n(" 事件链执行结果为 null");
            } else if (DinamicXEngine.j0()) {
                if (a3.I()) {
                    h36.n(" 事件链执行结果为 null");
                } else {
                    h36.n(" 事件链执行结果为 ", a3.toString());
                }
            }
        }
    }

    @Override // tb.ob5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "dxKTEventHandler";
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (ii6.a()) {
            b(dXEvent, objArr, dXRuntimeContext, null);
        } else {
            jb6.n(new a(dXEvent, objArr, dXRuntimeContext));
        }
    }
}
