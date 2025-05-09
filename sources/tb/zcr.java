package tb;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface zcr {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final View f32686a;
        public final List<Pair<View, String>> b;

        static {
            t2o.a(503316967);
        }

        public a(View view, List<Pair<View, String>> list) {
            this.f32686a = view;
            this.b = list;
        }
    }

    void h1();

    boolean pop();

    boolean t(String str, List<Pair<View, String>> list, Bundle bundle);
}
