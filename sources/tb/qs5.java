package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qs5 extends rw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TEMPLATEDATA = -1464634009013122078L;
    public static final int TYPE_CONSTANT = 0;
    public static final int TYPE_EXPR = 1;

    static {
        t2o.a(444596786);
    }

    public static DXLongSparseArray<fw5> d(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("fa24bf2d", new Object[]{dXWidgetNode});
        }
        DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
        if (queryRootWidgetNode == null) {
            return null;
        }
        if (queryRootWidgetNode.getCodeMap() != null) {
            DXWidgetNode parentWidget = queryRootWidgetNode.getParentWidget();
            if (!(parentWidget instanceof bi6)) {
                return queryRootWidgetNode.getCodeMap();
            }
            bi6 bi6Var = (bi6) parentWidget;
            if (!bi6Var.x() && TextUtils.isEmpty(bi6Var.B())) {
                return queryRootWidgetNode.getCodeMap();
            }
        }
        if (queryRootWidgetNode.getParentWidget() instanceof bi6) {
            return d(queryRootWidgetNode.getParentWidget());
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(qs5 qs5Var, String str, Object... objArr) {
        if (str.hashCode() == -858210922) {
            return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserTemplateDataOld");
    }

    @Override // tb.rw5
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8dd225a", new Object[]{this, dXRuntimeContext});
        }
        return e(dXRuntimeContext);
    }

    public final JSONObject e(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("80b84612", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode queryRootWidgetNode = dXRuntimeContext.W().queryRootWidgetNode();
        if (queryRootWidgetNode == null) {
            return null;
        }
        DXWidgetNode parentWidget = queryRootWidgetNode.getParentWidget();
        if (!(parentWidget instanceof bi6)) {
            return null;
        }
        bi6 bi6Var = (bi6) parentWidget;
        JSONObject z = bi6Var.z();
        if (z != null && !z.isEmpty()) {
            return z;
        }
        JSONObject I = bi6Var.I();
        if (I == null) {
            return null;
        }
        JSONObject f = f(I, parentWidget.getDXRuntimeContext());
        bi6Var.T(f);
        return f;
    }

    @Override // tb.rw5, tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        return super.evalWithArgs(objArr, dXRuntimeContext);
    }

    public final JSONObject f(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff55f9fd", new Object[]{this, jSONObject, dXRuntimeContext});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) value;
                if (1 == jSONObject3.getInteger("t").intValue()) {
                    long longValue = jSONObject3.getLongValue("v");
                    DXLongSparseArray<fw5> d = d(dXRuntimeContext.W());
                    String key = entry.getKey();
                    if (d == null) {
                        h36.c("key " + key + " mCodeMap 是null");
                    } else {
                        fw5 fw5Var = d.get(longValue);
                        if (fw5Var == null) {
                            h36.c("key " + key + " exprNode 是null");
                        } else {
                            jSONObject2.put(entry.getKey(), fw5Var.b(null, dXRuntimeContext));
                        }
                    }
                } else {
                    jSONObject2.put(entry.getKey(), jSONObject3.get("v"));
                }
            }
        }
        return jSONObject2;
    }
}
