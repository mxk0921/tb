package com.alipay.mobile.common.netsdkextdependapi;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class AbstraceExtBeanFactory<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, T> mBeanMap = null;
    public T defaultBean = null;
    public T backupBean = null;

    public T addBean(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("20b1abd4", new Object[]{this, str, t});
        }
        return getBeanMap().put(str, t);
    }

    public T getBackupBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6b71f203", new Object[]{this});
        }
        T t = this.backupBean;
        if (t != null) {
            return t;
        }
        synchronized (this) {
            try {
                T t2 = this.backupBean;
                if (t2 != null) {
                    return t2;
                }
                T newBackupBean = newBackupBean();
                this.backupBean = newBackupBean;
                return newBackupBean;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T getBean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c5d8f5db", new Object[]{this, str});
        }
        Map<String, T> map = this.mBeanMap;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.mBeanMap.get(str);
    }

    public Map<String, T> getBeanMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe462c52", new Object[]{this});
        }
        Map<String, T> map = this.mBeanMap;
        if (map != null) {
            return map;
        }
        synchronized (this) {
            try {
                Map<String, T> map2 = this.mBeanMap;
                if (map2 != null) {
                    return map2;
                }
                HashMap hashMap = new HashMap(2);
                this.mBeanMap = hashMap;
                return hashMap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public T getDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21488c10", new Object[]{this});
        }
        T t = this.defaultBean;
        if (t != null) {
            return t;
        }
        synchronized (AbstraceExtBeanFactory.class) {
            T t2 = this.defaultBean;
            if (t2 != null) {
                return t2;
            }
            T newDefaultBean = newDefaultBean();
            this.defaultBean = newDefaultBean;
            if (newDefaultBean != null) {
                return newDefaultBean;
            }
            return getBackupBean();
        }
    }

    public abstract T newBackupBean();

    public abstract T newDefaultBean();

    public T removeBean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7a2dbed", new Object[]{this, str});
        }
        Map<String, T> map = this.mBeanMap;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.mBeanMap.remove(str);
    }

    public void setDefaultBean(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3797bb32", new Object[]{this, t});
            return;
        }
        this.defaultBean = t;
        if (t != null) {
            Level level = Level.FINEST;
            InnerMiscUtil.log(level, "setDefaultBean, hash= " + t.hashCode() + ",class= " + t.getClass().getSimpleName());
        }
    }
}
