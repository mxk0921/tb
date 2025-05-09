package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class fzn implements r1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<r1r> f19647a = new AtomicReference<>(null);
    public final Map<String, Boolean> b = new ConcurrentHashMap();

    @Override // tb.r1r
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb13d969", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        d(context);
        this.f19647a.get().a(context, str, z);
    }

    @Override // tb.r1r
    public void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ec839", new Object[]{this, context, map});
            return;
        }
        d(context);
        this.f19647a.get().b(context, map);
    }

    @Override // tb.r1r
    public Map<String, tij> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d448ddf", new Object[]{this, context});
        }
        d(context);
        return this.f19647a.get().c(context);
    }

    @Override // tb.r1r
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cf9289", new Object[]{this, context});
        } else if (this.f19647a.get() == null && sng.a(this.f19647a, null, g(context))) {
            this.f19647a.get().d(context);
        }
    }

    @Override // tb.r1r
    public Boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ed4b7600", new Object[]{this, context, str});
        }
        d(context);
        Boolean bool = (Boolean) ((ConcurrentHashMap) this.b).get(str);
        if (bool != null) {
            return bool;
        }
        Boolean e = this.f19647a.get().e(context, str);
        if (e != null) {
            ((ConcurrentHashMap) this.b).put(str, e);
        }
        return e;
    }

    @Override // tb.r1r
    public r2w f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{this, context});
        }
        d(context);
        return this.f19647a.get().f(context);
    }

    public abstract r1r g(Context context);
}
