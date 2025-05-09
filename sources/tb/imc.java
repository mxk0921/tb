package tb;

import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface imc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        public static final int LIVE_PLAY_ERROR = 4;
        public static final int MEDIA_PLAY_CLOSE = 3;
        public static final int MEDIA_PLAY_ERROR = 2;
        public static final int MEDIA_PREPARE_ERROR = 1;

        void a(int i, String str);
    }

    void a(DXRuntimeContext dXRuntimeContext);

    void b(DXRuntimeContext dXRuntimeContext, xwg xwgVar);

    void c(a aVar);
}
