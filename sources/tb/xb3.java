package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TMSEmbed.a f31263a;
    public a b;
    public final String c;
    public final long d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbb2708b", new Object[]{this, view});
            } else {
                ckf.g(view, "containerView");
            }
        }

        public abstract void b(View view);
    }

    public xb3(String str, long j) {
        ckf.g(str, "url");
        this.c = str;
        this.d = j;
    }

    public final a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("471cd065", new Object[]{this});
        }
        return this.b;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7035785", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public final TMSEmbed.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed.a) ipChange.ipc$dispatch("90ee846", new Object[]{this});
        }
        return this.f31263a;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.c;
    }

    public final void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccd671f", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public final void f(TMSEmbed.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8462839c", new Object[]{this, aVar});
        } else {
            this.f31263a = aVar;
        }
    }
}
