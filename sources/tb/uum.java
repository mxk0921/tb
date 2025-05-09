package tb;

import android.content.Context;
import android.taobao.windvane.export.prerender.PrerenderType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class uum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29618a;
    public final String b;
    public final int c;

    static {
        t2o.a(989855897);
    }

    public uum(Context context, String str, @PrerenderType int i) {
        ckf.g(context, "context");
        ckf.g(str, "url");
        this.f29618a = context;
        this.b = str;
        this.c = i;
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f29618a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b15dc337", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof uum) {
                uum uumVar = (uum) obj;
                if (!ckf.b(this.f29618a, uumVar.f29618a) || !ckf.b(this.b, uumVar.b) || this.c != uumVar.c) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Context context = this.f29618a;
        if (context != null) {
            i = context.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i3 + i2) * 31) + this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PrerenderAcquireParams(context=" + this.f29618a + ", url=" + this.b + ", preRenderType=" + this.c + f7l.BRACKET_END_STR;
    }
}
