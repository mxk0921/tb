package com.taobao.android.remoteso.resolver2;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.index.d;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.RemoteResolver;
import com.taobao.android.remoteso.resolver2.d;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import tb.a7o;
import tb.cgd;
import tb.obn;
import tb.rbn;
import tb.trq;
import tb.xan;
import tb.z6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> void a(Collection<T> collection, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0e6e4a", new Object[]{collection, t});
        } else if (t != null) {
            collection.add(t);
        }
    }

    public static z6o b(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6o) ipChange.ipc$dispatch("2240174d", new Object[]{dVar, str});
        }
        return z6o.i(str, dVar.f(str), dVar.e(str));
    }

    public static z6o c(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6o) ipChange.ipc$dispatch("147e8523", new Object[]{dVar, str});
        }
        SoIndexData.SoFileInfo g = dVar.g(str);
        if (g == null) {
            return null;
        }
        return z6o.i(str, g, dVar.e(str));
    }

    public static xan d(String str, SoIndexData.SoFileInfo soFileInfo, String str2, obn obnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xan) ipChange.ipc$dispatch("6bfc7ccd", new Object[]{str, soFileInfo, str2, obnVar});
        }
        z6o i = z6o.i(str, soFileInfo, null);
        String b = i.b();
        String g = i.g();
        String a2 = obnVar.a(i.j().provideStorageKey());
        String c = i.c();
        xan xanVar = new xan(b, g, a2, c, a2 + File.separator + c, i.d(), i.j().getLength());
        xanVar.l(trq.d("presettle", str2));
        return xanVar;
    }

    public static z6o e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6o) ipChange.ipc$dispatch("d7f7421", new Object[]{str});
        }
        SoIndexData.SoFileInfo soFileInfo = new SoIndexData.SoFileInfo();
        soFileInfo.setFrom("defaultApk");
        soFileInfo.setUri("");
        soFileInfo.setMd5("");
        soFileInfo.setLength(-1L);
        return z6o.i(str, soFileInfo, null);
    }

    public static a7o f(z6o z6oVar, RSoException rSoException, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("cbff876c", new Object[]{z6oVar, rSoException, str});
        }
        return a7o.a(z6oVar, str, rSoException);
    }

    public static z6o g(d dVar, String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6o) ipChange.ipc$dispatch("c0dd01c4", new Object[]{dVar, str, soIndexData});
        }
        return z6o.i(str, dVar.k(str, soIndexData), dVar.e(str));
    }

    public static a7o h(z6o z6oVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("df4829fe", new Object[]{z6oVar, str, str2});
        }
        return a7o.k(z6oVar, str, str2);
    }

    public static File j(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c8e96bc", new Object[]{str, new Long(j)});
        }
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (j == -1 || j == file.length()) {
            return file;
        }
        return null;
    }

    public static File k(String str, SoInfo2 soInfo2, SoIndexData.SoFileInfo soFileInfo, obn obnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("245b4880", new Object[]{str, soInfo2, soFileInfo, obnVar});
        }
        String c = z6o.i(str, soFileInfo, soInfo2).c();
        String provideStorageKey = soFileInfo.provideStorageKey();
        File j = j(obnVar.e(c, provideStorageKey), soFileInfo.getLength());
        if (j != null) {
            RSoLog.d("findDiffBaseFile, succ from rso, " + str);
            return j;
        }
        File j2 = j(l(str), soFileInfo.getLength());
        if (j2 != null) {
            RSoLog.d("findDiffBaseFile, succ from apk, " + str);
            return j2;
        }
        RSoLog.d("findDiffBaseFile, not found, lib=" + str + ", localFileName=" + c + ", baseFileStorageKey=" + provideStorageKey);
        return null;
    }

    public static String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd545255", new Object[]{str});
        }
        try {
            ClassLoader classLoader = j.class.getClassLoader();
            if (!(classLoader instanceof BaseDexClassLoader)) {
                return null;
            }
            String findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            if (!trq.e(findLibrary)) {
                return null;
            }
            RSoLog.d("findLibInClassLoader, found lib in classloader, file=" + findLibrary);
            return findLibrary;
        } catch (Throwable th) {
            RSoLog.h("findLibInClassLoader, failed found from classloader", th);
            return null;
        }
    }

    public static Collection<SoIndexData.SoFileInfo> m(SoInfo2 soInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("758bf84", new Object[]{soInfo2});
        }
        if (soInfo2 == null) {
            return Collections.emptyList();
        }
        RemoteResolver.RemoteAdvancedInfo n = n(soInfo2);
        if (n == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(4);
        a(arrayList, n.diffBase);
        a(arrayList, n.diffPatch);
        a(arrayList, n.compressedRemote);
        a(arrayList, n.compressedLocal);
        return arrayList;
    }

    public static RemoteResolver.RemoteAdvancedInfo n(SoInfo2 soInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteResolver.RemoteAdvancedInfo) ipChange.ipc$dispatch("ffadfb46", new Object[]{soInfo2});
        }
        String str = soInfo2.advancedInfo;
        if (str == null) {
            RSoLog.d("RemoteResolver -> findAdvancedInfo end: soInfo2.advancedInfo == null");
            return null;
        }
        try {
            return (RemoteResolver.RemoteAdvancedInfo) JSON.parseObject(str, RemoteResolver.RemoteAdvancedInfo.class);
        } catch (Throwable th) {
            rbn.g("RemoteResolver -> findAdvancedInfo parse err:", th);
            return null;
        }
    }

    public static boolean i(cgd cgdVar, z6o z6oVar, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6350960", new Object[]{cgdVar, z6oVar, aVar})).booleanValue();
        }
        if (!cgdVar.e("key_blacklist_on_demand_fetch_libs2").contains(z6oVar.b())) {
            return false;
        }
        RSoLog.a("fetchAsync -> failure , lib on demand download in config not allowed , libName=" + z6oVar.b());
        aVar.a(f(z6oVar, RSoException.error(5003), "download-disabled"));
        return true;
    }
}
