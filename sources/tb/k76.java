package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final oub f22444a;
    public final oub b;
    public oub c;
    public final Map<String, nmc> d = new HashMap();

    static {
        t2o.a(444597024);
    }

    public k76(boolean z) {
        if (!eb5.E()) {
            try {
                this.c = g.s().b().a();
            } catch (Exception unused) {
            }
        }
        if (z) {
            this.b = new ud5();
        }
        this.f22444a = new hd5();
    }

    public DXWidgetNode a(byte[] bArr, DXRuntimeContext dXRuntimeContext, DXTemplateItem dXTemplateItem, Context context) {
        DXWidgetNode dXWidgetNode;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("cc499105", new Object[]{this, bArr, dXRuntimeContext, dXTemplateItem, context});
        }
        if (bArr == null || bArr.length == 0) {
            la6.b(" createTree  bytes == null || bytes.length == 0");
            return null;
        }
        Map<String, String> map = dXTemplateItem.k.b;
        if (zg5.o5()) {
            if (bArr.length < 5) {
                uh6.v(dXRuntimeContext.c(), dXTemplateItem, "createTree  bytes.length < 5");
                ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_WIDGET_ERROR_70045));
                return null;
            } else if (!hd5.FILE_START_TAG.equals(new String(bArr, 0, 5))) {
                uh6.v(dXRuntimeContext.c(), dXTemplateItem, "createTree  !FILE_START_TAG.equals(tag)");
                ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_WIDGET_ERROR_70046));
                return null;
            }
        }
        byte b = bArr[5];
        if (b == 3) {
            if (dXRuntimeContext == null || !dXRuntimeContext.Z(dXRuntimeContext.c())) {
                dXWidgetNode = ((hd5) this.f22444a).b(bArr, dXRuntimeContext, context, true);
            } else {
                dXWidgetNode = ((hd5) this.b).b(bArr, dXRuntimeContext, context, true);
            }
        } else if (b == 4) {
            if (eb5.E()) {
                rn7.a();
                DinamicXEngine r = dXRuntimeContext.r();
                if (r != null) {
                    r.k0();
                }
                this.c = g.s().b().a();
            }
            dXWidgetNode = this.c.b(bArr, dXRuntimeContext, context, true);
        } else {
            dXWidgetNode = null;
        }
        if (dXWidgetNode == null) {
            la6.b("createTree widgetTree == null!");
            return null;
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().contains(LoggingSPCache.STORAGE_LANGUAGE)) {
                    z = true;
                }
                if (((HashMap) this.d).containsKey(entry.getKey())) {
                    ((nmc) ((HashMap) this.d).get(entry.getKey())).a(dXTemplateItem, dx5.d(), entry.getValue());
                }
            }
            if (z) {
                j26.a(dXWidgetNode);
            }
        }
        return dXWidgetNode;
    }

    public DXWidgetNode b(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("69344280", new Object[]{this, dXTemplateItem, dXRuntimeContext, context});
        }
        return d(dXTemplateItem, dXRuntimeContext, context);
    }

    public byte[] c(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext) {
        List<f.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5ee14f17", new Object[]{this, dXTemplateItem, dXRuntimeContext});
        }
        String str = dXTemplateItem.k.f31396a;
        if (TextUtils.isEmpty(str)) {
            la6.b("loadBytes TextUtils.isEmpty(mainBinaryPath)");
            return null;
        }
        byte[] g = dx5.d().g(str, dXRuntimeContext);
        if (g != null && g.length != 0) {
            return g;
        }
        if (!(dXRuntimeContext == null || dXRuntimeContext.m() == null || (list = dXRuntimeContext.m().c) == null)) {
            f.a aVar = new f.a("Template", "Template_Read", f.DX_TEMPLATE_LOAD_ERROR);
            if (g == null) {
                aVar.e = "DXPackageManager load  bytes == null " + str;
            } else {
                aVar.e = "DXPackageManager load  bytes.len == 0 " + str;
            }
            list.add(aVar);
            la6.b(aVar.e);
        }
        uh6.h().t(dXRuntimeContext.c(), dXTemplateItem);
        la6.b("removeTemplate " + dXTemplateItem.d());
        return null;
    }

    public final DXWidgetNode d(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d875770c", new Object[]{this, dXTemplateItem, dXRuntimeContext, context});
        }
        DXTraceUtil.b("loadBytes");
        byte[] c = c(dXTemplateItem, dXRuntimeContext);
        if (c == null) {
            la6.b(" loadNew bytes == null");
            return null;
        }
        DXTraceUtil.c();
        DXTraceUtil.b("createTree");
        DXWidgetNode a2 = a(c, dXRuntimeContext, dXTemplateItem, context);
        DXTraceUtil.c();
        return a2;
    }
}
