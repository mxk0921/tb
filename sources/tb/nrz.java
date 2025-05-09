package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class nrz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nrz INSTANCE = new nrz();

    /* renamed from: a */
    public static final brz f24915a;

    static {
        t2o.a(598737235);
        crz crzVar = new crz();
        f24915a = crzVar;
        jrz.INSTANCE.i(crzVar);
    }

    public static /* synthetic */ irz c(nrz nrzVar, String str, TemplateItem templateItem, byte b, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irz) ipChange.ipc$dispatch("3ea9994e", new Object[]{nrzVar, str, templateItem, new Byte(b), new Boolean(z), new Integer(i), obj});
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return nrzVar.b(str, templateItem, b, z);
    }

    public final boolean a(String str, TemplateItem templateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478ab9fa", new Object[]{this, str, templateItem})).booleanValue();
        }
        ckf.g(str, "businessId");
        ckf.g(templateItem, "templateMeta");
        brz brzVar = f24915a;
        if (brzVar == null) {
            return false;
        }
        return ((crz) brzVar).f(str, templateItem);
    }

    public final irz b(String str, TemplateItem templateItem, byte b, boolean z) {
        TemplateItem h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irz) ipChange.ipc$dispatch("ea1c1062", new Object[]{this, str, templateItem, new Byte(b), new Boolean(z)});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(templateItem, "templateItem");
        if (!z && (h = jrz.h(jrz.INSTANCE, str, templateItem.c(), templateItem.e(), false, 8, null)) != null) {
            return new irz(h, false);
        }
        if (hrz.d(b, hrz.b((byte) 2))) {
            return new irz(null, false);
        }
        l6z a2 = n6z.a(str, templateItem, b);
        boolean a3 = a2.a();
        TemplateItem b2 = a2.b();
        if (!a3) {
            return new irz(null, true);
        }
        return new irz(b2, true);
    }
}
