package com.android.alibaba.ip.runtime;

import android.text.TextUtils;
import com.android.alibaba.ip.common.Log;
import com.android.alibaba.ip.common.PatchClassHolder;
import com.android.alibaba.ip.runtime.PatchesLoader;
import com.android.alibaba.ip.server.Logging;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import mtopsdk.common.util.SymbolExpUtil;
import tb.mcq;
import tb.o49;
import tb.t2o;
import tb.y49;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class AbstractPatchesLoaderImpl implements PatchesLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE_FEATURE = "BASE_FEATURE";
    private static final String IPCHANGE = "$ipChange";
    private static final String IPREPLACE = "$ipReplace";
    private static volatile Map<Class, Boolean> obsoletedMap = new ConcurrentHashMap();
    private PatchesLoader.ClassLoaderListener classLoaderListener;

    static {
        t2o.a(493879311);
        t2o.a(493879319);
    }

    public static /* synthetic */ boolean access$000(AbstractPatchesLoaderImpl abstractPatchesLoaderImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("791ed06b", new Object[]{abstractPatchesLoaderImpl, str})).booleanValue();
        }
        return abstractPatchesLoaderImpl.fixBaseFeatureClazz(str);
    }

    private boolean fixBaseFeatureClazz(String str) {
        String str2;
        String[] strArr;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            if (str.indexOf("|") != -1) {
                str2 = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR)[0];
                strArr = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            } else {
                str2 = str;
                strArr = null;
            }
            PatchesLoader.ClassLoaderListener classLoaderListener = this.classLoaderListener;
            if (classLoaderListener == null || classLoaderListener.onPrePareLoad(str2)) {
                Object newInstance = classLoader.loadClass(str2 + IPREPLACE).newInstance();
                Class<?> loadClass = classLoader.loadClass(str2);
                if (strArr != null) {
                    for (int i = 1; i < strArr.length; i++) {
                        if (!TextUtils.isEmpty(strArr[i])) {
                            replaceField(loadClass, "$ipChange$" + strArr[i].hashCode(), newInstance);
                        }
                    }
                } else {
                    replaceField(loadClass, IPCHANGE, newInstance);
                }
                Log.Logging logging = Log.logging;
                if (logging != null) {
                    Level level = Level.FINE;
                    if (logging.isLoggable(level)) {
                        Log.logging.log(level, "patched " + str2);
                    }
                }
                PatchesLoader.ClassLoaderListener classLoaderListener2 = this.classLoaderListener;
                if (classLoaderListener2 != null) {
                    classLoaderListener2.onLoadResult(str, true, null);
                }
                return true;
            }
            android.util.Log.e(Logging.LOG_TAG, "skip patch clazz:" + str2);
            return true;
        } catch (Exception e) {
            Log.Logging logging2 = Log.logging;
            if (logging2 != null) {
                logging2.log(Level.SEVERE, "Exception while patching foo.bar", e);
            }
            PatchesLoader.ClassLoaderListener classLoaderListener3 = this.classLoaderListener;
            if (classLoaderListener3 != null) {
                classLoaderListener3.onLoadResult(str, false, e);
            }
            return false;
        }
    }

    private boolean fixDynamicFeatureClazz(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df00eab", new Object[]{this, str, str2})).booleanValue();
        }
        android.util.Log.e(Logging.LOG_TAG, "fixDynamicFeatureClazz:" + str + " in feature:" + str2);
        if (mcq.a() != null && mcq.a().a() != null && mcq.a().a().contains(str2)) {
            return fixBaseFeatureClazz(str);
        }
        o49.b().d(str2, new y49.a() { // from class: com.android.alibaba.ip.runtime.AbstractPatchesLoaderImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.y49.a
            public void onFeatureStatusChange(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acce9b03", new Object[]{this, new Integer(i)});
                    return;
                }
                String str3 = str2;
                android.util.Log.e(Logging.LOG_TAG, "onFeatureStatusChange:" + str3 + ":" + i);
                if (i == 3) {
                    String str4 = str;
                    String str5 = str2;
                    android.util.Log.e(Logging.LOG_TAG, "start fixDynamicFeatureClazz:" + str4 + " in feature:" + str5);
                    if (AbstractPatchesLoaderImpl.access$000(AbstractPatchesLoaderImpl.this, str)) {
                        String str6 = str;
                        String str7 = str2;
                        android.util.Log.e(Logging.LOG_TAG, "fixDynamicFeatureClazz:" + str6 + " in feature:" + str7 + " success");
                    } else {
                        String str8 = str;
                        String str9 = str2;
                        android.util.Log.e(Logging.LOG_TAG, "fixDynamicFeatureClazz:" + str8 + " in feature:" + str9 + " failed");
                    }
                    o49.b().f(this);
                }
            }
        }, null);
        return true;
    }

    private boolean isBaseFeatureClazz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7a2e92", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.equals(BASE_FEATURE)) {
            return true;
        }
        return false;
    }

    private void obsoleted(Object obj) throws Exception {
        Field declaredField;
        if (obj == null) {
            return;
        }
        if ((!obsoletedMap.containsKey(obj.getClass()) || !obsoletedMap.get(obj.getClass()).booleanValue()) && (declaredField = obj.getClass().getDeclaredField("$ipObsolete")) != null) {
            Boolean bool = Boolean.TRUE;
            declaredField.set(null, bool);
            obsoletedMap.put(obj.getClass(), bool);
        }
    }

    private void replaceField(Class cls, String str, Object obj) throws Exception {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        obsoleted(declaredField.get(null));
        declaredField.set(null, obj);
    }

    @Override // com.android.alibaba.ip.runtime.PatchesLoader
    public void addClassLoadListener(PatchesLoader.ClassLoaderListener classLoaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd61ab41", new Object[]{this, classLoaderListener});
        } else {
            this.classLoaderListener = classLoaderListener;
        }
    }

    public abstract List<PatchClassHolder> getPatchedClasses();

    @Override // com.android.alibaba.ip.runtime.PatchesLoader
    public boolean load() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6def6671", new Object[]{this})).booleanValue();
        }
        for (PatchClassHolder patchClassHolder : getPatchedClasses()) {
            if (isBaseFeatureClazz(patchClassHolder.featureName)) {
                z = fixBaseFeatureClazz(patchClassHolder.className);
                continue;
            } else {
                z = fixDynamicFeatureClazz(patchClassHolder.className, patchClassHolder.featureName);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
