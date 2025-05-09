package com.ali.adapt.api;

import android.os.AsyncTask;
import android.util.Log;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.cart.api.ITBCartService;
import com.taobao.ma.api.ITBInsideService;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import tb.mvd;
import tb.qud;
import tb.rud;
import tb.yud;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AtlasServiceFinder implements AliServiceFinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile AtlasServiceFinder b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, Pair<String, String>> f1867a = new ConcurrentHashMap();

    public AtlasServiceFinder() {
        new ConcurrentHashMap();
        b = this;
        try {
            registerService(rud.class, "com.taobao.android.capsule", "com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl");
            registerService(qud.class, "com.taobao.android.capsule", "com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl");
            registerService(ITBCartService.class, "com.taobao.android.newtrade", "com.taobao.android.trade.cart.provider.TBCartServiceImpl");
            registerService(ITBInsideService.class, "com.taobao.android.capsule", "com.taobao.android.inside.plugin.AlipayInsideServiceImpl");
            registerService(yud.class, "com.taobao.taobao.home", "com.taobao.taobaoavsdk.services.LivePlayServiceImp");
            registerService(mvd.class, "com.taobao.android.capsule", "com.taobao.global.setting.TBSettingServiceImpl");
        } catch (Exception e) {
            Log.e("AtlasServiceFinder", e.getMessage(), e);
        }
    }

    public static AtlasServiceFinder getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtlasServiceFinder) ipChange.ipc$dispatch("2c41d482", new Object[0]);
        }
        if (b == null) {
            synchronized (AtlasServiceFinder.class) {
                try {
                    if (b == null) {
                        b = new AtlasServiceFinder();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final ClassLoader a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("ada1dc20", new Object[]{this, str});
        }
        a.a(str, null);
        return getClass().getClassLoader();
    }

    @Override // com.ali.adapt.api.AliServiceFinder
    public <T> T findServiceImpl(Class<T> cls) {
        Pair pair = (Pair) ((ConcurrentHashMap) this.f1867a).get(cls);
        if (pair == null) {
            Objects.toString(cls);
            return null;
        }
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        try {
            return (T) a(str).loadClass(str2).newInstance();
        } catch (ClassNotFoundException e) {
            Log.e("AtlasServiceFinder", "Unable to instantiate service " + str + " -> " + str2 + ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (IllegalAccessException e2) {
            throw new AliAdaptServiceNotFoundException("Unable to instantiate service " + str + " -> " + str2 + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            Log.e("AtlasServiceFinder", "Unable to instantiate service " + str2 + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
            return null;
        } catch (Exception e4) {
            Log.e("AtlasServiceFinder", e4.getMessage(), e4);
            return null;
        }
    }

    public <I, C extends I> void registerService(Class<I> cls, Class<C> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac48e979", new Object[]{this, cls, cls2});
        } else {
            registerService(cls, null, cls2.getName());
        }
    }

    public <I> void registerService(Class<I> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa8a158", new Object[]{this, cls, str, str2});
        } else if (cls == null) {
            throw new IllegalArgumentException("Illegal null serviceInterface argument");
        } else if (str2 != null) {
            ((ConcurrentHashMap) this.f1867a).put(cls, Pair.create(str, str2));
        } else {
            throw new IllegalArgumentException("Illegal null serviceImplementationClass argument");
        }
    }

    @Override // com.ali.adapt.api.AliServiceFinder
    public <T> void findServiceImpl(final Class<T> cls, final AliServiceFindedCallback<T> aliServiceFindedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd5ecf4", new Object[]{this, cls, aliServiceFindedCallback});
        } else if (aliServiceFindedCallback != null) {
            AsyncTask.execute(new Runnable() { // from class: com.ali.adapt.api.AtlasServiceFinder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aliServiceFindedCallback.onServiceFinded(AtlasServiceFinder.this.findServiceImpl(cls));
                    }
                }
            });
        } else {
            throw new IllegalArgumentException("Illegal null callback argument");
        }
    }
}
