package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.uob;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ou<C extends uob> implements bpb<C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public C f25652a;
    public final Map<String, C> b = new ConcurrentHashMap();

    static {
        t2o.a(912261465);
        t2o.a(912261467);
    }

    public ou(Context context) {
    }

    @Override // tb.bpb
    public C a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((uob) ipChange.ipc$dispatch("6aebeebf", new Object[]{this}));
        }
        return this.f25652a;
    }

    @Override // tb.bpb
    public C b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((uob) ipChange.ipc$dispatch("7356c714", new Object[]{this, str}));
        }
        if (str == null) {
            return null;
        }
        return (C) ((uob) ((ConcurrentHashMap) this.b).get(str));
    }

    @Override // tb.bpb
    public void c(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5940ee7c", new Object[]{this, c});
        } else {
            this.f25652a = c;
        }
    }

    @Override // tb.bpb
    public boolean d(String str, C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65c57811", new Object[]{this, str, c})).booleanValue();
        }
        if (str == null || c == null) {
            return false;
        }
        ((ConcurrentHashMap) this.b).put(str, c);
        return true;
    }
}
