package tb;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class att {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pei f15999a;
    public final ImageView b;
    public volatile boolean c;

    static {
        t2o.a(481296481);
    }

    public att(pei peiVar, ImageView imageView) {
        ckf.g(peiVar, q0j.SCENE_MEDIA_PLAYER);
        ckf.g(imageView, f8v.KEY_TARGET_VIEW);
        this.f15999a = peiVar;
        this.b = imageView;
    }

    public final pei a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pei) ipChange.ipc$dispatch("f123bb68", new Object[]{this});
        }
        return this.f15999a;
    }

    public final ImageView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("3a37cc9d", new Object[]{this});
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f154f2", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
