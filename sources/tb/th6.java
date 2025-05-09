package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class th6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28717a;
    public final Map<String, Integer> b = new HashMap();

    static {
        t2o.a(444596960);
    }

    public th6(int i) {
        this.f28717a = i;
    }

    public DXTemplateItem a(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("42796396", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        return uh6.h().j(str, j, dXTemplateItem);
    }

    public DXTemplateItem b(String str, long j, DXTemplateItem dXTemplateItem) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("be9468d7", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (this.f28717a == 1) {
            return uh6.h().k(str, j, dXTemplateItem);
        }
        Integer num = (Integer) ((HashMap) this.b).get(dXTemplateItem.f7343a);
        if (num != null) {
            i = num.intValue();
        }
        if (i >= this.f28717a) {
            return uh6.h().k(str, j, dXTemplateItem);
        }
        return uh6.h().g(str, j, dXTemplateItem);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0d5cfb", new Object[]{this, new Integer(i)});
        } else {
            this.f28717a = i;
        }
    }

    public void d(String str, long j, DXTemplateItem dXTemplateItem) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0007e7", new Object[]{this, str, new Long(j), dXTemplateItem});
            return;
        }
        Integer num = (Integer) ((HashMap) this.b).get(dXTemplateItem.f7343a);
        if (num != null) {
            i = num.intValue();
        }
        int a2 = uh6.h().a(str, j, dXTemplateItem);
        if (a2 == 1) {
            ((HashMap) this.b).put(dXTemplateItem.f7343a, Integer.valueOf(i + 1));
        } else if (a2 == 2) {
            ((HashMap) this.b).put(dXTemplateItem.f7343a, Integer.valueOf(this.f28717a));
        }
    }
}
