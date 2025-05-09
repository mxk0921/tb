package com.taobao.android.dxv4common.logic.dex.bridge;

import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.DexClassLoader;
import java.util.List;
import tb.eb5;
import tb.h36;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeLogicLoader extends DexClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DXNativeLogicLoader";
    private String childName;
    private String childVersion;
    private List<DXNativeLogicLoader> dependenciesLoaderList;
    private String dexPath;
    private String name;
    private boolean needFind;
    private String parentLoaderName;
    private String parentLoaderVersion;
    private boolean reversedLoad;
    private String version;

    static {
        t2o.a(444597956);
    }

    public DXNativeLogicLoader(String str, boolean z) {
        this(str, z, null, null, DXNativeLogicEngine.class.getClassLoader(), "baseMain", "1", "null", "null", "default", "default");
    }

    private Class findDependenciesClass(String str) {
        Class<?> findClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("6461e9d4", new Object[]{this, str});
        }
        List<DXNativeLogicLoader> list = this.dependenciesLoaderList;
        if (!(list == null || list.size() == 0)) {
            for (DXNativeLogicLoader dXNativeLogicLoader : this.dependenciesLoaderList) {
                try {
                    findClass = dXNativeLogicLoader.findClass(str);
                } catch (ClassNotFoundException e) {
                    xv5.b(e);
                }
                if (findClass != null) {
                    return findClass;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(DXNativeLogicLoader dXNativeLogicLoader, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177425936) {
            return super.loadClass((String) objArr[0]);
        }
        if (hashCode == 2052165949) {
            return super.findClass((String) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dxv4common/logic/dex/bridge/DXNativeLogicLoader");
    }

    private Class loadDependenciesClass(String str) {
        Class<?> loadClass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2daecc07", new Object[]{this, str});
        }
        List<DXNativeLogicLoader> list = this.dependenciesLoaderList;
        if (!(list == null || list.size() == 0)) {
            for (DXNativeLogicLoader dXNativeLogicLoader : this.dependenciesLoaderList) {
                try {
                    loadClass = dXNativeLogicLoader.loadClass(str);
                } catch (ClassNotFoundException e) {
                    xv5.b(e);
                }
                if (loadClass != null) {
                    return loadClass;
                }
            }
        }
        return null;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a51913d", new Object[]{this, str});
        }
        Class<?> findDependenciesClass = findDependenciesClass(str);
        if (findDependenciesClass == null) {
            return super.findClass(str);
        }
        return findDependenciesClass;
    }

    public String getChildName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d448c88", new Object[]{this});
        }
        return this.childName;
    }

    public String getChildVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("128443a7", new Object[]{this});
        }
        return this.childVersion;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public String getParentLoaderName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2403fcbb", new Object[]{this});
        }
        return this.parentLoaderName;
    }

    public String getParentLoaderVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2660294", new Object[]{this});
        }
        return this.parentLoaderVersion;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.version;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b9d1e7f0", new Object[]{this, str});
        }
        Class<?> loadDependenciesClass = loadDependenciesClass(str);
        if (loadDependenciesClass == null) {
            return super.loadClass(str);
        }
        return loadDependenciesClass;
    }

    public void setDependenciesLoaderList(List<DXNativeLogicLoader> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c478bdd4", new Object[]{this, list});
        } else {
            this.dependenciesLoaderList = list;
        }
    }

    public void setNeedFind(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec377dc", new Object[]{this, new Boolean(z)});
        } else {
            this.needFind = z;
        }
    }

    public DXNativeLogicLoader(String str, boolean z, String str2, String str3, ClassLoader classLoader, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(str, Build.VERSION.SDK_INT <= 26 ? str : null, str3, classLoader);
        this.needFind = false;
        this.dexPath = str;
        this.reversedLoad = z;
        this.parentLoaderName = str4;
        this.parentLoaderVersion = str5;
        this.childName = str6;
        this.childVersion = str7;
        this.name = str8;
        this.version = str9;
        if (eb5.C()) {
            h36.v("shandian", " load  " + str + " thread " + Thread.currentThread().getName() + "  this " + hashCode());
        }
    }
}
