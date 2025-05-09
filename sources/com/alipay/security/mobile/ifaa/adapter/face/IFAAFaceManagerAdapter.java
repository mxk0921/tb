package com.alipay.security.mobile.ifaa.adapter.face;

import android.content.Context;
import com.alipay.security.mobile.ifaa.adapter.IFAAManagerFactoryAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.face.IFAAFaceManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IFAAFaceManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IFAAFaceManagerAdapter sInstance;
    private IFAAFaceManager ifaaFaceManager;

    private IFAAFaceManagerAdapter(Context context) {
        this.ifaaFaceManager = IFAAManagerFactoryAdapter.getIFAAFaceManager(context);
    }

    public static synchronized IFAAFaceManagerAdapter getInstance(Context context) {
        synchronized (IFAAFaceManagerAdapter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAAFaceManagerAdapter) ipChange.ipc$dispatch("149416", new Object[]{context});
            }
            if (sInstance == null) {
                sInstance = new IFAAFaceManagerAdapter(context);
            }
            return sInstance;
        }
    }

    public void authenticate(IFAAFaceManager.AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17a64c7", new Object[]{this, authenticatorCallback});
            return;
        }
        IFAAFaceManager iFAAFaceManager = this.ifaaFaceManager;
        if (iFAAFaceManager != null) {
            try {
                iFAAFaceManager.authenticate(0, 0, authenticatorCallback);
            } catch (Throwable unused) {
                if (authenticatorCallback != null) {
                    authenticatorCallback.onAuthenticationError(-2);
                }
            }
        } else if (authenticatorCallback != null) {
            authenticatorCallback.onAuthenticationError(-1);
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        IFAAFaceManager iFAAFaceManager = this.ifaaFaceManager;
        if (iFAAFaceManager != null) {
            iFAAFaceManager.cancel(0);
        }
    }

    public boolean isSupportIFAAFaceManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d9cdbf9", new Object[]{this})).booleanValue();
        }
        if (this.ifaaFaceManager != null) {
            return true;
        }
        return false;
    }
}
