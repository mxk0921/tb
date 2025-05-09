package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import tb.s16;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ew5 implements v16, cw5, td5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CALL_DATA_PARSER = 1;
    public static final int CALL_EVENT = 0;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, wvb> f18846a;
    public final zvb b;

    static {
        t2o.a(444596495);
        t2o.a(444596838);
        t2o.a(444596830);
        t2o.a(444596828);
    }

    public ew5(HashMap<String, wvb> hashMap, zvb zvbVar) {
        this.f18846a = hashMap;
        this.b = zvbVar;
    }

    public final DXRuntimeContext c(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("9b3c0e51", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        if (!(queryRootWidgetNode instanceof bi6) || ((bi6) queryRootWidgetNode).H() != 1) {
            return queryRootWidgetNode.getDXRuntimeContext();
        }
        return c(queryRootWidgetNode.getParentWidget());
    }

    public mw5 d(DXRuntimeContext dXRuntimeContext, String str) {
        HashMap<String, wvb> hashMap;
        wvb wvbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("241f91c4", new Object[]{this, dXRuntimeContext, str});
        }
        if (TextUtils.isEmpty(str) || (hashMap = this.f18846a) == null || hashMap.size() == 0 || (wvbVar = this.f18846a.get(str)) == null) {
            return null;
        }
        return mw5.J(wvbVar);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public mw5 a(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, long j, int i, int i2, mw5[] mw5VarArr) {
        Object obj;
        Object[] objArr;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("3d0ee42d", new Object[]{this, dXRuntimeContext, dXEvent, new Long(j), new Integer(i), new Integer(i2), mw5VarArr});
        }
        Object[] objArr2 = null;
        if (i == 0) {
            mvb w = dXRuntimeContext.w(j);
            if (w == null) {
                ic5.r(dXRuntimeContext, "DX_SCRIPT", "DX_SCRIPT_ERROR", f.DXSCRIPT_EVENT_NOTFOUND_2, "事件: " + j + "找不到");
                return null;
            }
            if (i2 < 0 || mw5VarArr == null || mw5VarArr.length != i2) {
                objArr = null;
            } else {
                objArr = new Object[i2];
                while (i3 < i2) {
                    objArr[i3] = mw5VarArr[i3].s();
                    i3++;
                }
            }
            if (dXEvent == null || !dXEvent.isPrepareBind()) {
                w.handleEvent(dXEvent, objArr, dXRuntimeContext.W().getDXRuntimeContext());
            } else {
                w.prepareBindEventWithArgs(objArr, dXRuntimeContext.W().getDXRuntimeContext());
            }
            return null;
        } else if (i == 1) {
            evb evbVar = dXRuntimeContext.G().get(j);
            if (evbVar == null) {
                ic5.r(dXRuntimeContext, "DX_SCRIPT", "DX_SCRIPT_ERROR", f.DXSCRIPT_DATAPARSER_NOTFOUND_2, "表达式: " + j + "找不到");
                return null;
            }
            if (i2 >= 0) {
                objArr2 = new Object[i2];
                while (i3 < i2) {
                    objArr2[i3] = mw5VarArr[i3].s();
                    i3++;
                }
            }
            if (evbVar instanceof dk5) {
                obj = ((dk5) evbVar).e(dXEvent, objArr2, dXRuntimeContext);
            } else {
                obj = evbVar.evalWithArgs(objArr2, dXRuntimeContext);
            }
            return mw5.d(obj);
        } else {
            ic5.r(dXRuntimeContext, "DX_SCRIPT", "DX_SCRIPT_ERROR", f.DXSCRIPT_CALLBACK_ERROR, "调用为不认识的type：  " + i);
            return null;
        }
    }

    public void b(DXRuntimeContext dXRuntimeContext, DXEvent dXEvent, String str, String str2, int i, mw5[] mw5VarArr) {
        s16.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f160a81c", new Object[]{this, dXRuntimeContext, dXEvent, str, str2, new Integer(i), mw5VarArr});
        } else if (this.b == null) {
            h36.g(h36.TAG, "call js 失败 idxjsEngine == null");
        } else if (dXEvent != null && dXEvent.isPrepareBind()) {
        } else {
            if (dXRuntimeContext == null) {
                h36.g(h36.TAG, "call js 失败 runtimeContext == null");
            } else if (dXRuntimeContext.W() == null) {
                h36.g(h36.TAG, "call js 失败 runtimeContext widgetNode == null");
            } else {
                DXRuntimeContext c = c(dXRuntimeContext.W());
                if (c == null) {
                    h36.g(h36.TAG, "call js 失败 rootRuntimeContext == null");
                    return;
                }
                if (c.C() <= 0) {
                    if (dXRuntimeContext.p() == null) {
                        h36.g(h36.TAG, "call js 失败 runtimeContext.getDxTemplateItem() == null");
                        return;
                    }
                    byte[] b = s16.c().b(dXRuntimeContext.p().d());
                    if (b == null) {
                        if (dXRuntimeContext.W().isChildWidgetNode()) {
                            aVar = new s16.a(dXRuntimeContext, false);
                        } else {
                            aVar = new s16.a(dXRuntimeContext, true);
                        }
                        aVar.run();
                        h36.t("主线程加载 " + dXRuntimeContext.p().d() + " 的js文件");
                        b = aVar.a();
                        if (b != null) {
                            s16.c().e(dXRuntimeContext.p().d(), aVar.a());
                        }
                    }
                    c.l0(this.b.b(dXRuntimeContext, b));
                }
                h36.a("开始调用js的函数  module: " + str + "  method:  " + str2);
                this.b.c(c.C(), dXRuntimeContext, str, str2, i, mw5VarArr);
            }
        }
    }
}
