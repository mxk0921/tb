package tb;

import android.graphics.Bitmap;
import com.taobao.android.fcanvas.integration.FCanvasInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface gjd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void onFirstFrame();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f20041a;
        public int b;
        public float c;
        public FCanvasInstance.RenderMode d;
        public a e;
        public String f;
        public boolean g = false;
    }

    void a(int i, int i2, int i3, int i4);

    void b(boolean z);

    Bitmap c();

    void pause();

    void resume();
}
