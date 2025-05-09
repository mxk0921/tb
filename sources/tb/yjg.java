package tb;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fkg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yjg implements ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fkg.c f32127a;
    public String b;

    static {
        t2o.a(511705536);
    }

    public void a(fkg.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2af14a0", new Object[]{this, cVar});
        } else {
            this.f32127a = cVar;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3594b389", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        fkg.c cVar = this.f32127a;
        if (cVar != null) {
            cVar.b(this.b);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        fkg.c cVar = this.f32127a;
        if (cVar != null) {
            cVar.a(i, this.b);
        }
    }
}
