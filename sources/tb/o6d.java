package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface o6d {
    public static final int CREATED = 0;
    public static final int DESTROYED = 5;
    public static final int PAUSED = 3;
    public static final int RESUMED = 2;
    public static final int STARTED = 1;
    public static final int STOPED = 4;
    public static final int UNKNOWN = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements o6d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714446);
            t2o.a(468714445);
        }

        @Override // tb.o6d
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            }
        }

        @Override // tb.o6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.o6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            }
        }

        @Override // tb.o6d
        public void onRealStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e496e44c", new Object[]{this});
            }
        }

        @Override // tb.o6d
        public void onRealStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("274986c6", new Object[]{this});
            }
        }

        @Override // tb.o6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            }
        }

        @Override // tb.o6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.o6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }
    }

    void onCreate();

    void onDestroy();

    void onPause();

    void onRealStart();

    void onRealStop();

    void onResume();

    void onStart();

    void onStop();
}
