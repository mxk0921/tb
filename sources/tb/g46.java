package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g46 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static dwb f19719a;
    public static final String b = "dinamicx_template_name";
    public static final String c = "dinamicx_template_version";
    public static final String d = "dinamicx_template_url";
    public static final String e = "dinamicx_template_isPreset";

    static {
        t2o.a(444596902);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fca958", new Object[]{str, obj});
            return;
        }
        dwb dwbVar = f19719a;
        if (dwbVar != null) {
            ((h46) dwbVar).a(str, obj);
        }
    }

    public static void b(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2be8f1b", new Object[]{dXTemplateItem});
            return;
        }
        try {
            if (zg5.H3() && dXTemplateItem != null) {
                a(b, dXTemplateItem.e());
                a(c, Long.valueOf(dXTemplateItem.h()));
                a(d, dXTemplateItem.c);
                a(e, Boolean.valueOf(dXTemplateItem.f));
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public static void c(dwb dwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6832555", new Object[]{dwbVar});
        } else if (zg5.H3()) {
            f19719a = dwbVar;
        }
    }
}
