package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.api.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16395a;
    public final c.b b;
    public final c.a c;

    static {
        t2o.a(763363343);
    }

    public bhp(Context context, c.b bVar, c.a aVar) {
        this.f16395a = context;
        this.b = bVar;
        this.c = aVar;
    }

    public c.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("e8b0e1f9", new Object[]{this});
        }
        return this.c;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f16395a;
    }

    public c.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.b) ipChange.ipc$dispatch("7b10e291", new Object[]{this});
        }
        return this.b;
    }
}
