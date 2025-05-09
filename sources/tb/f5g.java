package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f5g implements btb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qic f19024a;
    public final i5g b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements k5g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final zxc f19025a;

        static {
            t2o.a(352321653);
            t2o.a(500170813);
        }

        public a(zxc zxcVar) {
            this.f19025a = zxcVar;
        }

        @Override // tb.k5g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f118b844", new Object[]{this, str});
            }
        }

        @Override // tb.k5g
        public void b(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b4505ee", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            } else {
                this.f19025a.onVideoInfo(obj, j, j2, j3, obj2);
            }
        }

        @Override // tb.k5g
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                this.f19025a.onVideoClose();
            }
        }

        @Override // tb.k5g
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                this.f19025a.onVideoComplete();
            }
        }

        @Override // tb.k5g
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else {
                this.f19025a.onVideoError(obj, i, i2);
            }
        }

        @Override // tb.k5g
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                this.f19025a.onVideoPause(z);
            }
        }

        @Override // tb.k5g
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else {
                this.f19025a.onVideoPlay();
            }
        }

        @Override // tb.k5g
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else {
                this.f19025a.onVideoPrepared(obj);
            }
        }

        @Override // tb.k5g
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f19025a.onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // tb.k5g
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            } else {
                this.f19025a.onVideoScreenChanged(dWVideoScreenType);
            }
        }

        @Override // tb.k5g
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else {
                this.f19025a.onVideoSeekTo(i);
            }
        }

        @Override // tb.k5g
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else {
                this.f19025a.onVideoStart();
            }
        }
    }

    static {
        t2o.a(352321652);
        t2o.a(352321648);
    }

    public f5g(qic qicVar, i5g i5gVar) {
        this.f19024a = qicVar;
        this.b = i5gVar;
    }

    @Override // tb.btb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
        } else {
            this.f19024a.close();
        }
    }

    @Override // tb.btb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
        } else {
            this.f19024a.b();
        }
    }

    @Override // tb.btb
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ad02c0", new Object[]{this, hashMap});
        } else {
            this.f19024a.c(hashMap);
        }
    }

    @Override // tb.btb
    public void d(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
        } else {
            this.f19024a.d(qtbVar);
        }
    }

    @Override // tb.btb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f19024a.destroy();
        txj.e(txj.TAG_MEDIA_CONTROLLER, "NdVideoRec:dw-destroy destroy(KirinInstanceProxy) hCode:" + hashCode());
    }

    @Override // tb.btb
    public void e(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
        } else {
            this.f19024a.e(hashMap);
        }
    }

    @Override // tb.btb
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f19024a.C(i, i2);
        }
    }

    @Override // tb.btb
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.f19024a.getVideoState();
    }

    @Override // tb.btb
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f19024a.a();
    }

    @Override // tb.btb
    public void i(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
        } else {
            this.f19024a.i(dWInstanceType);
        }
    }

    @Override // tb.btb
    public void j(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
        } else {
            this.f19024a.j(aubVar);
        }
    }

    @Override // tb.btb
    public void l(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
        } else {
            this.f19024a.l(nj9Var);
        }
    }

    @Override // tb.btb
    public void m(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            this.f19024a.m(f, f2, i, i2);
        }
    }

    @Override // tb.btb
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.f19024a.setMute(z);
        }
    }

    @Override // tb.btb
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
        } else {
            this.f19024a.n(z);
        }
    }

    @Override // tb.btb
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.f19024a.pause();
        }
    }

    @Override // tb.btb
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.f19024a.play();
        }
    }

    @Override // tb.btb
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else {
            this.f19024a.prepareToFirstFrame();
        }
    }

    @Override // tb.btb
    public void r(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34cbf4", new Object[]{this, hashMap});
        } else if (hashMap != null) {
            this.f19024a.r(hashMap);
        }
    }

    @Override // tb.btb
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else {
            this.f19024a.seekTo(i);
        }
    }

    @Override // tb.btb
    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
        } else {
            this.f19024a.D(f);
        }
    }

    @Override // tb.btb
    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.f19024a.setLooping(z);
        }
    }

    @Override // tb.btb
    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        } else {
            this.f19024a.setVolume(f);
        }
    }

    @Override // tb.btb
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f19024a.start();
        }
    }

    @Override // tb.btb
    public void w(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d03a66", new Object[]{this, hashMap});
        } else {
            this.f19024a.w(hashMap);
        }
    }

    @Override // tb.btb
    public void x(zxc zxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439e717b", new Object[]{this, zxcVar});
        } else if (zxcVar != null) {
            this.b.o(new a(zxcVar));
        }
    }
}
