package com.ali.user.mobile.common.api;

import com.ali.user.mobile.app.dataprovider.BooleanOrangeResult;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.ui.widget.WidgetExtension;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginApprearanceExtensions extends WidgetExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Class mABHelper;
    public Class mDialogHelper;
    public Class mNavHelper;
    public Class mScaleHelper;
    public Class mUccHelper;
    public boolean needCountryModule = true;
    public boolean needRegister = true;
    public boolean needToolbar = true;
    public boolean needDarkStatusBarMode = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface AsoLoginCallback {
        void onNeedSwitch(String str, DataCallback<Boolean> dataCallback);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class AsoLoginFlow {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static AsoLoginCallback mAsoLoginCallback;

        static {
            t2o.a(68157473);
        }

        public static AsoLoginCallback getAsoLoginCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AsoLoginCallback) ipChange.ipc$dispatch("f66ad412", new Object[0]);
            }
            return mAsoLoginCallback;
        }

        public static void setAsoLoginCallback(AsoLoginCallback asoLoginCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2137764", new Object[]{asoLoginCallback});
            } else {
                mAsoLoginCallback = asoLoginCallback;
            }
        }
    }

    static {
        t2o.a(68157471);
    }

    public static /* synthetic */ Object ipc$super(LoginApprearanceExtensions loginApprearanceExtensions, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/common/api/LoginApprearanceExtensions");
    }

    public Class getABHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("aed3339", new Object[]{this});
        }
        return this.mABHelper;
    }

    public Class getDialogHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("27235ec0", new Object[]{this});
        }
        return this.mDialogHelper;
    }

    public Class getNavHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("535fcbaf", new Object[]{this});
        }
        return this.mNavHelper;
    }

    public Class getScaleHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9369ce96", new Object[]{this});
        }
        return this.mScaleHelper;
    }

    public Class getUccHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("152cdba1", new Object[]{this});
        }
        return this.mUccHelper;
    }

    public boolean isNeedDarkStatusBarMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c86840b9", new Object[]{this})).booleanValue();
        }
        return this.needDarkStatusBarMode;
    }

    public boolean isNeedToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2365186", new Object[]{this})).booleanValue();
        }
        return this.needToolbar;
    }

    public boolean needCountryModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6857b37", new Object[]{this})).booleanValue();
        }
        return this.needCountryModule;
    }

    public boolean needRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bdc5564", new Object[]{this})).booleanValue();
        }
        BooleanOrangeResult needRegister = DataProviderFactory.getOrangeConfig().needRegister();
        if (needRegister.orangeExist) {
            return needRegister.value;
        }
        return this.needRegister;
    }

    public void setABHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f504a5", new Object[]{this, cls});
        } else {
            this.mABHelper = cls;
        }
    }

    public void setDialogHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe37effe", new Object[]{this, cls});
        } else {
            this.mDialogHelper = cls;
        }
    }

    public void setNavHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccaf4c87", new Object[]{this, cls});
        } else {
            this.mNavHelper = cls;
        }
    }

    public void setNeedDarkStatusBarMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499121f7", new Object[]{this, new Boolean(z)});
        } else {
            this.needDarkStatusBarMode = z;
        }
    }

    public void setUccHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44843ad5", new Object[]{this, cls});
        } else {
            this.mUccHelper = cls;
        }
    }
}
