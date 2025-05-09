package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.packages.parser.PackageParseUtils;
import com.taobao.themis.open.packages.parser.ParseContext;
import com.taobao.themis.open.resource.PackageInfo;
import java.util.Map;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s8o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PackageInfo f27871a;
    public Map<String, ? extends c7o> b;
    public volatile boolean c;
    public volatile boolean d;
    public Long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(843055395);
    }

    public s8o(PackageInfo packageInfo) {
        ckf.g(packageInfo, "packageInfo");
        this.f27871a = packageInfo;
    }

    public final PackageInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("53cfe494", new Object[]{this});
        }
        return this.f27871a;
    }

    public c7o b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c7o) ipChange.ipc$dispatch("75badc70", new Object[]{this, str});
        }
        Map<String, ? extends c7o> map = this.b;
        if (map == null) {
            return null;
        }
        return (c7o) map.get(str);
    }

    public final Long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("28b7469e", new Object[]{this});
        }
        return this.e;
    }

    public boolean d() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e9953cd", new Object[]{this})).booleanValue();
        }
        if (this.c) {
            TMSLogger.b("ResourcePackage", "already prepared : " + this.d + " , " + this.f27871a);
            return this.d;
        }
        this.c = true;
        if (this.f27871a.a() == null) {
            TMSLogger.b("ResourcePackage", ckf.p("file path is null, ", this.f27871a));
            return false;
        }
        ParseContext parseContext = new ParseContext();
        parseContext.appId = this.f27871a.b();
        parseContext.packagePath = this.f27871a.a();
        parseContext.needVerify = false;
        try {
            Map<String, c7o> parsePackage = PackageParseUtils.parsePackage(parseContext, true);
            ckf.f(parsePackage, "mutableMap");
            this.b = kotlin.collections.a.r(parsePackage);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 == null) {
            this.e = Long.valueOf(parseContext.mainTarSize);
            this.d = true;
            return true;
        }
        TMSLogger.c("ResourcePackage", String.valueOf(a()), th2);
        return false;
    }
}
