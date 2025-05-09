package io.unicorn.adapter;

import android.app.Application;
import tb.dwh;
import tb.es9;
import tb.fs9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class UnicornAdapterJNI {
    private static final String TAG = "UnicornAdapterJNI";
    private volatile boolean mHasLoaded;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final UnicornAdapterJNI f15164a = new UnicornAdapterJNI();

        static {
            t2o.a(945815610);
        }
    }

    static {
        t2o.a(945815608);
    }

    public static UnicornAdapterJNI instance() {
        return b.f15164a;
    }

    public void init2(Application application) {
        try {
            es9.b().a().g(application.getApplicationContext());
            this.mHasLoaded = true;
        } catch (Throwable th) {
            dwh.i(th);
        }
    }

    public boolean libraryLoaded() {
        return this.mHasLoaded;
    }

    public void preloadSo() {
        fs9.d();
    }

    private UnicornAdapterJNI() {
        this.mHasLoaded = false;
    }
}
