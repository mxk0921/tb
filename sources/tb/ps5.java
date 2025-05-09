package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.util.List;
import java.util.StringTokenizer;
import tb.qvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ps5 extends rw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TEMPLATEDATA = -1464634009013122078L;
    public static final int TYPE_CONSTANT = 0;
    public static final int TYPE_EXPR = 1;

    /* renamed from: a  reason: collision with root package name */
    public final qs5 f26269a = new qs5();

    static {
        t2o.a(444596785);
    }

    public static Object d(DXWidgetNode dXWidgetNode, long j, String str) {
        qvb.a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cfa9f60", new Object[]{dXWidgetNode, new Long(j), str});
        }
        DXWidgetNode e = e(dXWidgetNode);
        if (e == null) {
            h36.c("key " + str + " root 是null");
            return null;
        } else if (!e.isV4Node()) {
            DXLongSparseArray<fw5> codeMap = e.getCodeMap();
            if (codeMap == null) {
                h36.c("key " + str + " mCodeMap 是null");
                return null;
            }
            fw5 fw5Var = codeMap.get(j);
            if (fw5Var != null) {
                return fw5Var.b(null, dXWidgetNode.getDXRuntimeContext());
            }
            h36.c("key " + str + " exprNode 是null");
            return null;
        } else if (!e.isV4Node() || (b = e66.b(dXWidgetNode, (int) j)) == null || !b.f26952a) {
            return null;
        } else {
            return b.c.z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (android.text.TextUtils.isEmpty(r1.B()) != false) goto L_0x0043;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.dinamicx.widget.DXWidgetNode e(com.taobao.android.dinamicx.widget.DXWidgetNode r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ps5.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "abff88b4"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            com.taobao.android.dinamicx.widget.DXWidgetNode r4 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r4
            return r4
        L_0x0015:
            com.taobao.android.dinamicx.widget.DXWidgetNode r4 = r4.queryRootWidgetNode()
            r0 = 0
            if (r4 != 0) goto L_0x001d
            return r0
        L_0x001d:
            boolean r1 = r4.isV4Node()
            if (r1 != 0) goto L_0x0044
            com.taobao.android.dinamicx.model.DXLongSparseArray r1 = r4.getCodeMap()
            if (r1 == 0) goto L_0x0044
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r4.getParentWidget()
            boolean r2 = r1 instanceof tb.bi6
            if (r2 == 0) goto L_0x0043
            tb.bi6 r1 = (tb.bi6) r1
            boolean r2 = r1.x()
            if (r2 != 0) goto L_0x0076
            java.lang.String r1 = r1.B()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0076
        L_0x0043:
            return r4
        L_0x0044:
            boolean r1 = r4.isV4Node()
            if (r1 == 0) goto L_0x0076
            tb.sl6 r1 = r4.getDxv4Properties()
            android.util.SparseArray r1 = r1.i()
            if (r1 == 0) goto L_0x0076
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r4.getParentWidget()
            boolean r2 = r1 instanceof tb.bi6
            if (r2 == 0) goto L_0x006f
            tb.bi6 r1 = (tb.bi6) r1
            boolean r2 = r1.x()
            if (r2 != 0) goto L_0x0076
            java.lang.String r1 = r1.B()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0076
            return r4
        L_0x006f:
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r4.getParentWidget()
            if (r1 != 0) goto L_0x0076
            return r4
        L_0x0076:
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r4.getParentWidget()
            boolean r1 = r1 instanceof tb.bi6
            if (r1 == 0) goto L_0x0087
            com.taobao.android.dinamicx.widget.DXWidgetNode r4 = r4.getParentWidget()
            com.taobao.android.dinamicx.widget.DXWidgetNode r4 = e(r4)
            return r4
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ps5.e(com.taobao.android.dinamicx.widget.DXWidgetNode):com.taobao.android.dinamicx.widget.DXWidgetNode");
    }

    public static /* synthetic */ Object ipc$super(ps5 ps5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserTemplateData");
    }

    @Override // tb.rw5, tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!zg5.j5()) {
            return this.f26269a.evalWithArgs(objArr, dXRuntimeContext);
        }
        JSONObject jSONObject = null;
        if (objArr == null || objArr.length == 0) {
            return f(dXRuntimeContext, null);
        }
        if (objArr.length > 1) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        if (stringTokenizer.hasMoreTokens()) {
            jSONObject = f(dXRuntimeContext, stringTokenizer.nextToken());
        }
        return b(str, jSONObject, dXRuntimeContext);
    }

    public final JSONObject f(DXRuntimeContext dXRuntimeContext, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a671af5c", new Object[]{this, dXRuntimeContext, str});
        }
        DXWidgetNode W = dXRuntimeContext.W();
        DXWidgetNode queryRootWidgetNode = W.queryRootWidgetNode();
        if (queryRootWidgetNode == null) {
            return null;
        }
        if (W.isEnableButter()) {
            DXWidgetNode parentWidget = queryRootWidgetNode.getParentWidget();
            if (parentWidget == null) {
                DXRootView L = dXRuntimeContext.L();
                if (!(L instanceof DXButterRootView)) {
                    return null;
                }
                parentWidget = (DXWidgetNode) L.getTag(R.id.dinamicXTemplateNode);
            }
            if (!(parentWidget instanceof s4z)) {
                return null;
            }
            s4z s4zVar = (s4z) parentWidget;
            T t = s4zVar.t();
            if (!(t instanceof o56)) {
                return null;
            }
            o56 o56Var = (o56) t;
            JSONObject i = o56Var.i();
            if (i != null && !i.isEmpty() && i.containsKey(str)) {
                return i;
            }
            JSONObject j = o56Var.j();
            if (j == null) {
                return null;
            }
            JSONObject g = g(j, s4zVar.getDXRuntimeContext(), str);
            if (g != null) {
                if (i == null) {
                    i = new JSONObject();
                }
                i.putAll(g);
            }
            o56Var.l(i);
            return i;
        }
        DXWidgetNode parentWidget2 = queryRootWidgetNode.getParentWidget();
        if (!(parentWidget2 instanceof bi6)) {
            return null;
        }
        bi6 bi6Var = (bi6) parentWidget2;
        JSONObject z = bi6Var.z();
        List<String> y = bi6Var.y();
        if (z != null && !z.isEmpty() && z.containsKey(str)) {
            return z;
        }
        if (y == null || !y.contains(str)) {
            JSONObject I = bi6Var.I();
            if (I == null) {
                return null;
            }
            if (parentWidget2.isV4Node()) {
                jSONObject = h(I, parentWidget2, parentWidget2.getDXRuntimeContext(), str);
            } else {
                jSONObject = g(I, parentWidget2.getDXRuntimeContext(), str);
            }
            if (jSONObject != null) {
                if (z == null) {
                    z = new JSONObject();
                }
                z.putAll(jSONObject);
            }
            bi6Var.T(z);
        }
        return z;
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "templateData";
    }

    public final JSONObject g(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85905e87", new Object[]{this, jSONObject, dXRuntimeContext, str});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (1 == jSONObject2.getInteger("t").intValue()) {
            Object d = d(dXRuntimeContext.W(), jSONObject2.getLongValue("v"), str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str, d);
            return jSONObject3;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(str, jSONObject2.get("v"));
        return jSONObject4;
    }

    public final JSONObject h(JSONObject jSONObject, DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d596f3c", new Object[]{this, jSONObject, dXWidgetNode, dXRuntimeContext, str});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        int intValue = jSONObject2.getInteger("t").intValue();
        if (intValue == 0) {
            Object d = d(dXRuntimeContext.W(), jSONObject2.getInteger("v").intValue(), str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str, d);
            return jSONObject3;
        } else if (1 == intValue) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(str, dXWidgetNode.getDxv4Properties().c().get(jSONObject2.getInteger("v").intValue()));
            return jSONObject4;
        } else if (2 != intValue) {
            return null;
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(str, jSONObject2.get("v"));
            return jSONObject5;
        }
    }
}
