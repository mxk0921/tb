package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f46 extends fw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18991a;
        public int b = 0;

        static {
            t2o.a(444596702);
        }
    }

    static {
        t2o.a(444596701);
    }

    public static /* synthetic */ Object ipc$super(f46 f46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/DXMethodNode");
    }

    @Override // tb.fw5
    public Object b(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        Throwable th;
        evb evbVar;
        boolean z;
        pb5 pb5Var;
        int i;
        Object obj;
        Object evalWithArgs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1f85463f", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        Object obj2 = null;
        try {
            if (this.b != 0) {
                evbVar = dXRuntimeContext.G().get(this.b);
            } else {
                evbVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (evbVar == null) {
            f.a aVar = new f.a("ASTNode", "ASTNode_METHOD_NODE", 100001);
            aVar.e = "exprId:" + this.b;
            ((ArrayList) dXRuntimeContext.m().c).add(aVar);
            return null;
        }
        if (evbVar instanceof pb5) {
            pb5Var = (pb5) evbVar;
            z = true;
        } else {
            pb5Var = null;
            z = false;
        }
        List<fw5> list = this.f19569a;
        if (list != null) {
            i = ((ArrayList) list).size();
        } else {
            i = 0;
        }
        a aVar2 = new a();
        Object[] objArr = new Object[i];
        int i2 = 0;
        while (i2 < i) {
            try {
                try {
                    objArr[i2] = ((fw5) ((ArrayList) this.f19569a).get(i2)).b(dXEvent, dXRuntimeContext);
                    if (z) {
                        obj = obj2;
                        try {
                            gw5.e().c(this, pb5Var, Arrays.copyOfRange(objArr, 0, i2 + 1), dXRuntimeContext);
                            obj2 = pb5Var.a(objArr, dXRuntimeContext, aVar2, i2);
                            gw5.e().a(this, obj2, dXRuntimeContext);
                            if (aVar2.f18991a) {
                                break;
                            }
                            int i3 = aVar2.b;
                            if (i3 > 0) {
                                i2 += i3;
                                aVar2.b = 0;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = obj;
                            if (dXRuntimeContext != null) {
                                f.a aVar3 = new f.a("ASTNode", "ASTNode_METHOD_NODE", 100002);
                                aVar3.e = xv5.a(th);
                                ((ArrayList) dXRuntimeContext.m().c).add(aVar3);
                            }
                            xv5.b(th);
                            return obj2;
                        }
                    }
                    i2++;
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (!z) {
            gw5.e().c(this, pb5Var, objArr, dXRuntimeContext);
            if (evbVar instanceof dk5) {
                evalWithArgs = ((dk5) evbVar).e(dXEvent, objArr, dXRuntimeContext);
            } else {
                evalWithArgs = evbVar.evalWithArgs(objArr, dXRuntimeContext);
            }
            obj2 = evalWithArgs;
            gw5.e().a(this, obj2, dXRuntimeContext);
        }
        return obj2;
    }
}
