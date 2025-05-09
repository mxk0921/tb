package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u16 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String b = "logic";
    private static final String c = "/config.json";
    private static final String d = "modules";
    private static final int e = 7;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<DXWidgetNode> f29070a;

    static {
        t2o.a(444597957);
    }

    public u16(WeakReference<DXWidgetNode> weakReference) {
        this.f29070a = weakReference;
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51b20bc", new Object[]{dXWidgetNode});
        } else if (dXWidgetNode.getDxv4Properties().k() == null) {
            jb6.r(new u16(new WeakReference(dXWidgetNode)));
        }
    }

    public static void b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89188cfd", new Object[]{dXWidgetNode});
        } else {
            new u16(new WeakReference(dXWidgetNode)).run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        DXTemplateItem p;
        xh6 xh6Var;
        String str;
        JSONObject i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            DXWidgetNode dXWidgetNode = this.f29070a.get();
            if (!(dXWidgetNode == null || (p = dXWidgetNode.getDXRuntimeContext().p()) == null || (xh6Var = p.k) == null)) {
                String substring = xh6Var.f31396a.substring(0, str.length() - 7);
                if (!TextUtils.isEmpty(substring)) {
                    String str2 = substring + b;
                    String str3 = str2 + c;
                    if (new File(str3).exists() && (i = dx5.d().i(str3, dXWidgetNode.getDXRuntimeContext())) != null) {
                        JSONArray jSONArray = i.getJSONArray("modules");
                        String string = i.getString("type");
                        h36.a(str2);
                        LinkedList linkedList = new LinkedList();
                        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                            Object obj = jSONArray.get(i2);
                            if (obj instanceof String) {
                                linkedList.add(new Pair((String) obj, dx5.d().g(str2 + wh6.DIR + obj + "." + string, dXWidgetNode.getDXRuntimeContext())));
                            }
                        }
                        dXWidgetNode.getDxv4Properties().C(linkedList);
                    }
                }
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }
}
