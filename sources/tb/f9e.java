package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoScreenType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface f9e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements f9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714536);
            t2o.a(468714535);
        }

        @Override // tb.f9e
        public void onLoopCompletion(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a263b7", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.f9e
        public void onPreCompletion(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b35d58", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.f9e
        public void onVideoClose(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b040494", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.f9e
        public void onVideoComplete(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8488480d", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.f9e
        public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.f9e
        public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            }
        }

        @Override // tb.f9e
        public void onVideoPause(uq9 uq9Var, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
            }
        }

        @Override // tb.f9e
        public void onVideoPlay(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.f9e
        public void onVideoPrepared(uq9 uq9Var, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
            }
        }

        @Override // tb.f9e
        public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.f9e
        public void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b0fc2b5", new Object[]{this, uq9Var, dWVideoScreenType});
            }
        }

        @Override // tb.f9e
        public void onVideoSeekTo(uq9 uq9Var, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i)});
            }
        }

        @Override // tb.f9e
        public void onVideoStart(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.f9e
        public void onVideoStateChanged(uq9 uq9Var, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b4492ac", new Object[]{this, uq9Var, new Integer(i)});
            }
        }
    }

    void onLoopCompletion(uq9 uq9Var);

    void onPreCompletion(uq9 uq9Var);

    void onVideoClose(uq9 uq9Var);

    void onVideoComplete(uq9 uq9Var);

    void onVideoError(uq9 uq9Var, Object obj, int i, int i2);

    void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2);

    void onVideoPause(uq9 uq9Var, boolean z);

    void onVideoPlay(uq9 uq9Var);

    void onVideoPrepared(uq9 uq9Var, Object obj);

    void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3);

    void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType);

    void onVideoSeekTo(uq9 uq9Var, int i);

    void onVideoStart(uq9 uq9Var);

    void onVideoStateChanged(uq9 uq9Var, int i);
}
