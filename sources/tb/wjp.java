package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30734a = false;
    public Pair<Integer, Integer> b;

    static {
        t2o.a(468714777);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fb653c", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableDestroySharePlayerDWInstance", true);
    }

    public Pair<Integer, Integer> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8fdab9a8", new Object[]{this});
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0ad2cc5", new Object[]{this})).booleanValue();
        }
        return this.f30734a;
    }

    public void d(Pair<Integer, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582c2748", new Object[]{this, pair});
        } else {
            this.b = pair;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1c35fb", new Object[]{this, new Boolean(z)});
        } else {
            this.f30734a = z;
        }
    }
}
