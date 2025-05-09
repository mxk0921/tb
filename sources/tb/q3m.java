package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.external.Config;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q3m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = q3m.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public Config f26489a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final q3m f26490a = new q3m();

        static {
            t2o.a(623902726);
        }
    }

    static {
        t2o.a(623902724);
    }

    public static q3m c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3m) ipChange.ipc$dispatch("8467f5ad", new Object[0]);
        }
        return b.f26490a;
    }

    public Config a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("9a597bdf", new Object[]{this});
        }
        if (this.f26489a == null) {
            this.f26489a = new Config.b().F();
        }
        return this.f26489a;
    }

    public ikq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ikq) ipChange.ipc$dispatch("9fa2779", new Object[]{this});
        }
        ikq a2 = tg8.b().a();
        if (a2 == null) {
            return new w67();
        }
        return a2;
    }

    public q3m d(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3m) ipChange.ipc$dispatch("4fc915e4", new Object[]{this, config});
        }
        this.f26489a = config;
        if (config != null) {
            config.getDefinitionMode();
        }
        return this;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546280fc", new Object[]{this, new Boolean(z)});
        }
    }

    public q3m() {
    }
}
