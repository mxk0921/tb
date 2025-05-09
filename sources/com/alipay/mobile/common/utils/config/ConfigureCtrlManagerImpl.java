package com.alipay.mobile.common.utils.config;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.utils.config.fmk.ConfigureOperation;
import com.alipay.mobile.common.utils.config.fmk.ConfigureOperationImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConfigureCtrlManagerImpl extends ConfigureOperationImpl implements ConfigureCtrlManager, ConfigureOperation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ConfigureChangedObservable b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ConfigureChangedObservable extends Observable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ConfigureChangedObservable() {
        }

        public static /* synthetic */ Object ipc$super(ConfigureChangedObservable configureChangedObservable, String str, Object... objArr) {
            if (str.hashCode() == -310743881) {
                super.notifyObservers(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/utils/config/ConfigureCtrlManagerImpl$ConfigureChangedObservable");
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
                return;
            }
            setChanged();
            try {
                super.notifyObservers(obj);
            } catch (Exception e) {
                LogCatUtil.error("ConfigureCtrlManager", e);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ConfigureCtrlManagerImpl configureCtrlManagerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/utils/config/ConfigureCtrlManagerImpl");
    }

    @Override // com.alipay.mobile.common.utils.config.ConfigureCtrlManager
    public void addConfigureChangedListener(ConfigureChangedListener configureChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08cc276", new Object[]{this, configureChangedListener});
            return;
        }
        LogCatUtil.info("ConfigureCtrlManager", "addConfigureChangedListener.  observer=".concat(configureChangedListener.getClass().getName()));
        c().addObserver(configureChangedListener);
    }

    public final ConfigureChangedObservable c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigureChangedObservable) ipChange.ipc$dispatch("dc96c281", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new ConfigureChangedObservable();
        }
        return this.b;
    }

    public String getConfgureVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50f418fc", new Object[]{this});
        }
        return "-1";
    }

    public void notifyConfigureChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c0198a", new Object[]{this});
            return;
        }
        LogCatUtil.info("ConfigureCtrlManager", "notifyConfigureChangedEvent.  observer count=" + c().countObservers());
        c().notifyObservers();
    }

    @Override // com.alipay.mobile.common.utils.config.ConfigureCtrlManager
    public void removeConfigureChangedListener(ConfigureChangedListener configureChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732cc7d9", new Object[]{this, configureChangedListener});
        } else {
            c().deleteObserver(configureChangedListener);
        }
    }
}
