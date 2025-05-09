package com.taobao.android.mediapick;

import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.Media;
import java.util.List;
import tb.a9d;
import tb.g1e;
import tb.sjc;
import tb.t2o;
import tb.xnc;
import tb.zkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IMediaPickClient {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum PickMode {
        SINGLE,
        MULTIP_REPEAT,
        MULTIP;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PickMode pickMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/IMediaPickClient$PickMode");
        }

        public static PickMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PickMode) ipChange.ipc$dispatch("b6e07ca8", new Object[]{str});
            }
            return (PickMode) Enum.valueOf(PickMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(Media media, int i);

        void b(Media media, int i);

        void c(Media media, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Cloneable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DEFAULT_COLUMNS = 4;
        public static final int DEFAULT_GAY_COLOR = -1;
        public static final int DEFAULT_GAY_WIDTH = 5;
        public static final int DEFAULT_THEME_COLOR = Color.parseColor("#FFDD00");
        public static final b g = new b();

        /* renamed from: a  reason: collision with root package name */
        public int f8888a = 4;
        public int b = -1;
        public int c = 5;
        public boolean d = true;
        public boolean e = false;
        public String f = "";

        static {
            t2o.a(519045133);
        }

        public Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
            }
            return super.clone();
        }
    }

    <T extends Media> boolean a(T t, int i);

    List<Media> b();

    void c();

    boolean d(zkp zkpVar);

    void e(int i);

    @Deprecated
    void f(b bVar);

    void g(a aVar);

    com.taobao.android.mediapick.b getDataSource();

    View getView();

    void h(int i);

    void i(com.taobao.android.mediapick.b bVar);

    void j(PickMode pickMode);

    void k(xnc xncVar);

    void l(b bVar);

    void m(a9d a9dVar);

    void n(Class<? extends com.taobao.android.mediapick.a> cls);

    <T extends Media> boolean o(T t, int i);

    void p(sjc sjcVar);

    void q(g1e g1eVar);
}
