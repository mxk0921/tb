package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class prj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26257a;
    public float b;
    public float c;
    public int d;
    public float e;
    public float f;

    static {
        t2o.a(502268307);
    }

    public prj() {
        this.d = 0;
        this.e = -1.0f;
        this.f = -1.0f;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        if (!this.f26257a) {
            return false;
        }
        if (this.e <= 0.0f) {
            return true;
        }
        if (this.f < 0.0f) {
            this.f = VideoControllerManager.i();
        }
        if (this.f >= this.e) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ABNetAbr{enable=" + this.f26257a + ", preLoadTime=" + this.b + ", ratio=" + this.c + ", netSpeedType=" + this.d + ", limitDeviceScore=" + this.e + '}';
    }

    public prj(boolean z, float f, int i, float f2, float f3, float f4) {
        this.f26257a = z;
        this.b = f2;
        this.c = f;
        this.d = i;
        this.e = f3;
        this.f = f4;
    }
}
