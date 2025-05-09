package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface trc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements trc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714526);
            t2o.a(468714525);
        }

        @Override // tb.trc
        public void onDataUpdate(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.trc
        public void onPauseMedia(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.trc
        public void onRecyclePlayer(uq9 uq9Var, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            }
        }

        @Override // tb.trc
        public void onRequestMediaPlayer(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.trc
        public void onShowCover(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.trc
        public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
            }
        }

        @Override // tb.trc
        public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.trc
        public void onStopMedia(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
            }
        }

        @Override // tb.trc
        public void onUTPairsUpdate(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
            }
        }
    }

    void onDataUpdate(uq9 uq9Var);

    void onPauseMedia(uq9 uq9Var);

    void onRecyclePlayer(uq9 uq9Var, boolean z);

    void onRequestMediaPlayer(uq9 uq9Var);

    void onShowCover(uq9 uq9Var);

    void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str);

    void onStartMedia(uq9 uq9Var, boolean z, boolean z2);

    void onStopMedia(uq9 uq9Var);

    void onUTPairsUpdate(uq9 uq9Var);
}
