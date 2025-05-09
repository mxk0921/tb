package tb;

import android.content.Context;
import android.os.Build;
import com.alibaba.android.split.core.internal.FlexaClassLoader;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uql extends ClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIND_CLASS_IN_BASE = 0;
    public static final int FIND_CLASS_IN_FEATURE = 1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29563a;
    public final a e;
    public ClassLoader f;
    public final Context h;
    public final Reflector g = Reflector.n(ClassLoader.class).l("findClass", String.class);
    public final Reflector b = Reflector.n(ClassLoader.class).l("findResource", String.class);
    public final Reflector c = Reflector.n(ClassLoader.class).l("findResources", String.class);
    public final Reflector d = Reflector.n(ClassLoader.class).l("getPackage", String.class);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        int whereFindClass(String str);
    }

    static {
        t2o.a(677380194);
    }

    public uql(Context context, ClassLoader classLoader, boolean z, a aVar) throws Exception {
        super(classLoader);
        this.h = context;
        this.f29563a = z;
        this.e = aVar;
    }

    public static /* synthetic */ Object ipc$super(uql uqlVar, String str, Object... objArr) {
        if (str.hashCode() == 2052165949) {
            return super.findClass((String) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/plugin/ParentInterceptor");
    }

    public final Class<?> a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("73dd9773", new Object[]{this, classLoader, str});
        }
        try {
            return (Class) this.g.c(classLoader, str);
        } catch (Exception unused) {
            throw new ClassNotFoundException(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        if (!this.f29563a || this.e.whereFindClass(str) != 1) {
            return super.findClass(str);
        }
        ClassLoader classLoader = this.h.getClassLoader();
        this.f = classLoader;
        if (classLoader instanceof FlexaClassLoader) {
            return ((FlexaClassLoader) classLoader).findSelf(str);
        }
        if (Build.VERSION.SDK_INT < 27) {
            return null;
        }
        if (tql.a(classLoader)) {
            return a(this.f, str);
        }
        return super.findClass(str);
    }

    @Override // java.lang.ClassLoader
    public URL findResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("8e5461dd", new Object[]{this, str});
        }
        try {
            return (URL) this.b.c(null, str);
        } catch (Reflector.ReflectedException unused) {
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Enumeration) ipChange.ipc$dispatch("93b5f2e7", new Object[]{this, str});
        }
        try {
            return (Enumeration) this.c.c(null, str);
        } catch (Reflector.ReflectedException unused) {
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public Package getPackage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Package) ipChange.ipc$dispatch("7e0f8580", new Object[]{this, str});
        }
        try {
            return (Package) this.d.c(null, str);
        } catch (Reflector.ReflectedException unused) {
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("bd9c820", new Object[]{this, str});
        }
        throw null;
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Enumeration) ipChange.ipc$dispatch("c60ea16a", new Object[]{this, str});
        }
        throw null;
    }
}
