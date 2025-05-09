package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u49 extends mkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380212);
    }

    public u49(jcq jcqVar) {
        super(jcqVar);
        jcqVar.n();
    }

    public static /* synthetic */ Object ipc$super(u49 u49Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/splitcompat/FeatureUpdateNativeLibraryExtractor");
    }

    @Override // tb.mkj
    public Set g(Set<tjj> set, ocq ocqVar, ZipFile zipFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c57c5a54", new Object[]{this, set, ocqVar, zipFile});
        }
        HashSet hashSet = new HashSet();
        l(ocqVar, set, new ot8(hashSet, ocqVar, zipFile));
        return hashSet;
    }

    @Override // tb.mkj
    public final Set<File> h(ocq ocqVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2daf8a31", new Object[]{this, ocqVar});
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        d(ocqVar, new f4i(this, ocqVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    @Override // tb.mkj
    public Set<File> k(ocq ocqVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f54b8e59", new Object[]{this, ocqVar});
        }
        HashSet hashSet = new HashSet();
        d(ocqVar, new nt8(this, hashSet, ocqVar));
        for (File file : this.f24102a.w(ocqVar.b())) {
            if (!hashSet.contains(file)) {
                String absolutePath = file.getAbsolutePath();
                String b = ocqVar.b();
                String absolutePath2 = ocqVar.c().getAbsolutePath();
                Log.e(wnc.MODULE, "NativeLibraryExtractor: file '" + absolutePath + "' found in split '" + b + "' that is not in the split file '" + absolutePath2 + "'; removing");
                this.f24102a.f(file);
            }
        }
        return hashSet;
    }

    public final void l(ocq ocqVar, Set<tjj> set, e8q e8qVar) throws IOException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800c6325", new Object[]{this, ocqVar, set, e8qVar});
            return;
        }
        for (tjj tjjVar : set) {
            File D = this.f24102a.D(ocqVar.b(), tjjVar.f28749a);
            if (!D.exists() || D.length() != tjjVar.b.getSize()) {
                z = false;
            } else {
                z = true;
            }
            e8qVar.a(tjjVar, D, z);
        }
    }
}
