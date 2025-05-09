package tb;

import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.image.ExternalAdapterImageProvider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ts8 {

    /* renamed from: a  reason: collision with root package name */
    public ExternalAdapterImageProvider f28928a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final ts8 f28929a = new ts8();

        static {
            t2o.a(945815780);
        }
    }

    static {
        t2o.a(945815778);
    }

    public static ts8 c() {
        return b.f28929a;
    }

    public ExternalAdapterImageProvider a() {
        return this.f28928a;
    }

    public void b(ExternalAdapterImageProvider externalAdapterImageProvider) {
        if (externalAdapterImageProvider != null) {
            this.f28928a = externalAdapterImageProvider;
            FlutterJNI.nativeInstallFlutterExternalAdapterImageProvider();
        }
    }

    public ts8() {
        this.f28928a = null;
    }
}
