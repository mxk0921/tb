package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.onesearch.b;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m8x implements d3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b f23857a;

    static {
        t2o.a(815793718);
        t2o.a(815793697);
    }

    public m8x(b bVar) {
        this.f23857a = bVar;
    }

    @Override // tb.d3d
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc762f42", new Object[]{this});
        }
    }

    @Override // tb.d3d
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46f5fee", new Object[]{this});
        }
    }

    @Override // tb.d3d
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f09118", new Object[]{this});
        }
    }

    @Override // tb.d3d
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b77c5fb", new Object[]{this});
        } else {
            b(false);
        }
    }

    @Override // tb.d3d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c202c9", new Object[]{this});
        } else {
            b(true);
        }
    }

    public final void b(boolean z) {
        WXSDKInstance B2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
            return;
        }
        b bVar = this.f23857a;
        if (bVar != null && (B2 = bVar.B2()) != null) {
            if (z) {
                B2.onActivityResume();
            } else {
                B2.onActivityPause();
            }
        }
    }
}
