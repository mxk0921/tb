package org.ifaa.android.manager.fingerprint;

import android.content.Context;
import android.util.Log;
import com.alipay.security.mobile.agent.managerservice.ServiceAidlImpl;
import org.ifaa.android.manager.IFAAManagerV4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class IFAAManagerImplV4 extends IFAAManagerV4 {
    private static final String TAG = "IFAAManagerImplV4";
    private static IFAAManagerImplV4 mIns;

    public static IFAAManagerImplV4 getInstance() {
        if (mIns == null) {
            mIns = new IFAAManagerImplV4();
        }
        return mIns;
    }

    @Override // org.ifaa.android.manager.IFAAManager
    public String getDeviceModel() {
        try {
            return ServiceAidlImpl.getInstance().getDeviceModel();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManagerV4
    public int getEnabled(int i) {
        try {
            return ServiceAidlImpl.getInstance().getEnabled(i);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManagerV3
    public String getExtInfo(int i, String str) {
        try {
            return ServiceAidlImpl.getInstance().getExtInfo(i, str);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManagerV4
    public int[] getIDList(int i) {
        try {
            return ServiceAidlImpl.getInstance().getIDList(i);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return new int[0];
        }
    }

    @Override // org.ifaa.android.manager.IFAAManager
    public int getSupportBIOTypes(Context context) {
        try {
            return ServiceAidlImpl.getInstance().getSupportBIOTypes();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManagerV4, org.ifaa.android.manager.IFAAManager
    public int getVersion() {
        try {
            return ServiceAidlImpl.getInstance().getVersion();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManagerV2
    public byte[] processCmdV2(Context context, byte[] bArr) {
        try {
            return ServiceAidlImpl.getInstance().processCmd(context, bArr);
        } catch (NullPointerException e) {
            Log.e(TAG, e.toString());
            return new byte[0];
        }
    }

    @Override // org.ifaa.android.manager.IFAAManagerV3
    public void setExtInfo(int i, String str, String str2) {
        try {
            ServiceAidlImpl.getInstance().setExtInfo(i, str, str2);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }

    @Override // org.ifaa.android.manager.IFAAManager
    public int startBIOManager(Context context, int i) {
        try {
            return ServiceAidlImpl.getInstance().startBIOManager(i);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }
}
