package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, DXTemplateItem> f24486a = new ConcurrentHashMap<>(8);
    public final s b;

    static {
        t2o.a(745537909);
    }

    public n3j(s sVar) {
        ckf.h(sVar, "dxEngineRouter");
        this.b = sVar;
    }

    public final void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390424b1", new Object[]{this, dXTemplateItem});
            return;
        }
        ckf.h(dXTemplateItem, "availableTemplateItem");
        ConcurrentHashMap<String, DXTemplateItem> concurrentHashMap = this.f24486a;
        String str = dXTemplateItem.f7343a;
        ckf.c(str, "availableTemplateItem.name");
        concurrentHashMap.put(str, dXTemplateItem);
    }

    public final DXTemplateItem b(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("45711de6", new Object[]{this, dXTemplateItem});
        }
        ckf.h(dXTemplateItem, "dstTemplateItem");
        DXTemplateItem dXTemplateItem2 = this.f24486a.get(dXTemplateItem.f7343a);
        if (dXTemplateItem2 != null) {
            return dXTemplateItem2;
        }
        DXTemplateItem i = this.b.i(dXTemplateItem);
        if (i != null) {
            ConcurrentHashMap<String, DXTemplateItem> concurrentHashMap = this.f24486a;
            String str = i.f7343a;
            ckf.c(str, "availableTemplate.name");
            concurrentHashMap.put(str, i);
        }
        return i;
    }
}
