package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.config.RSoConfig;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class bbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f16300a;
    public final kgd b;
    public final hgd c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16301a;
        public final /* synthetic */ b b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ SoIndexData.SoFileInfo e;

        public a(String str, b bVar, String str2, String str3, SoIndexData.SoFileInfo soFileInfo) {
            this.f16301a = str;
            this.b = bVar;
            this.c = str2;
            this.d = str3;
            this.e = soFileInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RSoLog.d("RSoExtractor, ready to extract " + this.f16301a + ", callback=" + this.b);
            kt8 kt8Var = new kt8(this.b);
            abn abnVar = null;
            try {
                th = null;
                abnVar = bbn.a(bbn.this, this.f16301a, this.c, this.d, this.e, false);
            } catch (Throwable th2) {
                th = th2;
                rbn.f("extractAsync,error", this.f16301a, th);
            }
            if (abnVar == null || !abnVar.g()) {
                RSoLog.d("RSoExtractor, retry extract " + this.f16301a + ", callback=" + this.b);
                try {
                    abnVar = bbn.a(bbn.this, this.f16301a, this.c, this.d, this.e, true);
                } catch (Throwable th3) {
                    th = th3;
                    rbn.f("extractAsync,error2", this.f16301a, th);
                }
            }
            if (abnVar == null) {
                abnVar = new abn(this.f16301a, "", "", unq.EMPTY, RSoException.error(6094, th));
            }
            RSoLog.d("RSoExtractor, extract finish " + this.f16301a + ", callback=" + this.b);
            kt8Var.a(abnVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(abn abnVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f16302a;
        public final boolean b;

        public /* synthetic */ c(String str, boolean z, a aVar) {
            this(str, z);
        }

        public static /* synthetic */ String a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("487dabe4", new Object[]{cVar});
            }
            return cVar.f16302a;
        }

        public static /* synthetic */ boolean b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ad39ae1f", new Object[]{cVar})).booleanValue();
            }
            return cVar.b;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ExtractParam{compressedFilePath='" + this.f16302a + "', deleteCompressedFile=" + this.b + '}';
        }

        public c(String str, boolean z) {
            this.f16302a = str;
            this.b = z;
        }
    }

    public bbn(Application application, kgd kgdVar, hgd hgdVar) {
        this.f16300a = application;
        this.b = kgdVar;
        this.c = hgdVar;
    }

    public static /* synthetic */ abn a(bbn bbnVar, String str, String str2, String str3, SoIndexData.SoFileInfo soFileInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abn) ipChange.ipc$dispatch("bc808423", new Object[]{bbnVar, str, str2, str3, soFileInfo, new Boolean(z)});
        }
        return bbnVar.c(str, str2, str3, soFileInfo, z);
    }

    public final c b(SoIndexData.SoFileInfo soFileInfo, String str) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("88417f9d", new Object[]{this, soFileInfo, str});
        }
        if (soFileInfo.isAssetsUri()) {
            String uri = soFileInfo.getUri();
            str2 = str + File.separator + uri.hashCode();
            RSoLog.a("extractor ->   libPathInAssets=" + uri + " compressedFilePath=" + str2 + " copyCompressedSoFile = " + kd1.a(this.f16300a, uri, new File(str2)));
        } else if (soFileInfo.isLibUri()) {
            str2 = this.f16300a.getApplicationInfo().nativeLibraryDir + File.separator + soFileInfo.getUri();
            RSoLog.a("extractor ->   soLibDir=" + this.f16300a.getApplicationInfo().nativeLibraryDir + " compressedFilePath=" + str2);
            z = false;
        } else if ("Compressed-Remote".equalsIgnoreCase(soFileInfo.getFrom())) {
            str2 = soFileInfo.getUri();
            RSoLog.a("extractor -> FROM_COMPRESSED_REMOTE, compressedFilePath = " + str2);
        } else {
            throw RSoException.error(2005, soFileInfo.getUri());
        }
        return new c(str2, z, null);
    }

    public void d(String str, String str2, String str3, SoIndexData.SoFileInfo soFileInfo, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52880bd8", new Object[]{this, str, str2, str3, soFileInfo, bVar});
        } else {
            qbn.d(new a(str, bVar, str2, str3, soFileInfo));
        }
    }

    public final abn c(String str, String str2, String str3, SoIndexData.SoFileInfo soFileInfo, boolean z) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abn) ipChange.ipc$dispatch("67973068", new Object[]{this, str, str2, str3, soFileInfo, new Boolean(z)});
        }
        unq unqVar = new unq(t49.ARG_EXTRAT);
        unqVar.c("start");
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        String str4 = File.separator;
        sb.append(str4);
        sb.append(RSoConfig.TYPE_COMPRESSED);
        String str5 = str3 + str4 + "extracted";
        c b2 = b(soFileInfo, sb.toString());
        unqVar.d("lib_ready", "start");
        try {
            if (z) {
                RSoLog.d("RSoExtractor,extractCore.extractPro " + b2);
                ((lt8) this.c).b(this.f16300a, c.a(b2), str5, false);
            } else {
                RSoLog.d("RSoExtractor,extractCore.extract " + b2);
                ((lt8) this.c).a(this.f16300a, c.a(b2), str5, false);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            rbn.f("extractAsync-inner-core-error", str, th);
        }
        if (c.b(b2)) {
            uos.e(new File(c.a(b2)));
        }
        unqVar.d("stop", "start");
        if (th != null) {
            return new abn(str, c.a(b2), null, unqVar, RSoException.error(6096, th));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str5);
        String str6 = File.separator;
        sb2.append(str6);
        sb2.append(str2);
        String sb3 = sb2.toString();
        if (!this.b.a(soFileInfo.getMd5(), sb3)) {
            return new abn(str, c.a(b2), null, unqVar, RSoException.error(6095, ", extractedLibPath=" + sb3 + ", param=" + b2));
        }
        String str7 = str3 + str6 + str2;
        File file = new File(str7);
        jg9.f(file);
        if (new File(sb3).renameTo(file)) {
            return new abn(str, c.a(b2), str7, unqVar, null);
        }
        return new abn(str, c.a(b2), null, unqVar, RSoException.error(6095, "rename dest failed, extractedLibPath=" + sb3 + ", targetLibPath=" + str7));
    }
}
