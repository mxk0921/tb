package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gzw implements i4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IDMComponent f20332a;
    public final ViewEngine b;

    static {
        t2o.a(157286764);
        t2o.a(967835664);
    }

    public gzw(ViewEngine viewEngine) {
        this.b = viewEngine;
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18997a4", new Object[]{this, iDMComponent});
        } else {
            this.f20332a = iDMComponent;
        }
    }

    @Override // tb.i4w
    public void u2(Map<String, Object> map, cbo cboVar) {
        qbe d0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef7dc0c", new Object[]{this, map, cboVar});
        } else if (this.b != null && map != null) {
            Object obj = map.get("method");
            if ((obj instanceof String) && (d0 = this.b.d0((String) obj)) != null) {
                d0.a(map, cboVar, this.f20332a);
            }
        }
    }
}
