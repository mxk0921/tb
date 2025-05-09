package com.alipay.security.mobile.auth;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFactory;
import com.alipay.security.mobile.api.IFAAManagerAdaptor;
import com.alipay.security.mobile.bracelet.xiaomi.XiaomiAuthenticator;
import com.alipay.security.mobile.face.FaceAuthenticatorAdapter;
import com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticator;
import com.alipay.security.mobile.fingerprint.adapter.FingerprintAuthenticatorAdapter;
import com.alipay.security.mobile.fingerprint.other.VendorOther;
import com.alipay.security.mobile.fingerprint.vendor.VendorFingerPrint;
import com.alipay.security.mobile.ifaa.adapter.IFAAManagerFactoryAdapter;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.IFAAManager;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthenticatorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int TYPE_FINGERPRINT = Constants.TYPE_FINGERPRINT;
    public static int TYPE_BRACELET = Constants.TYPE_BRACELET;
    private static String[] samsungFPModle = {"SM-G900", "SM-T805C", "SM-T800N", "SM-T705C", "SM-T700N", "SM-G8508S", "SM-N91", "SM-G920", "SM-G925", "SM-A8000", "SM-G928"};
    private static String modelName = null;
    private static IAuthenticator mFingerprintAuthenticatorCache = null;
    private static IAuthenticator mBraceletAuthenticatorCache = null;
    private static String servicePackageName = "com.alipay.security.mobile.authenticator";

    private static IAuthenticator alipayFingerprintSolution(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("52c692db", new Object[]{context});
        }
        VendorOther vendorOther = new VendorOther();
        if (supportSamsungAsm(context)) {
            return new VendorFingerPrint(Constants.VENDOR_SAMSUNG_V2, Constants.PROTOCOL_TYPE_ALIPAY, 2, "com.alipay.security.mobile.authenticator", "https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk");
        }
        Cursor query = context.getContentResolver().query(Uri.parse("content://authentication.information"), null, null, null, null);
        if (query != null && query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("fingerprint");
            int columnIndex2 = query.getColumnIndex("protocalType");
            int columnIndex3 = query.getColumnIndex("protocalVersion");
            int columnIndex4 = query.getColumnIndex("vendor");
            if (columnIndex == -1 || columnIndex3 == -1 || columnIndex2 == -1 || columnIndex4 == -1) {
                query.close();
            } else {
                VendorFingerPrint vendorFingerPrint = new VendorFingerPrint(query.getInt(columnIndex4), query.getInt(columnIndex2), query.getInt(columnIndex3), "com.alipay.security.mobile.authenticator", "https://t.alipayobjects.com/L1/71/900/androidSec/Alipaysec_common.apk");
                try {
                    query.close();
                } catch (Throwable unused) {
                }
                return vendorFingerPrint;
            }
        }
        return vendorOther;
    }

    public static IAuthenticator create(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("8b63650b", new Object[]{context, new Integer(i)});
        }
        if (i == TYPE_FINGERPRINT) {
            if (isNeedUpdateAuthenticator(context, i) || mFingerprintAuthenticatorCache == null) {
                mFingerprintAuthenticatorCache = createInside(context, i);
            }
            return mFingerprintAuthenticatorCache;
        } else if (i != TYPE_BRACELET) {
            return createInside(context, i);
        } else {
            IAuthenticator iAuthenticator = mBraceletAuthenticatorCache;
            if (iAuthenticator != null) {
                return iAuthenticator;
            }
            IAuthenticator createInside = createInside(context, i);
            mBraceletAuthenticatorCache = createInside;
            return createInside;
        }
    }

    private static IAuthenticator createInside(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("3890a36f", new Object[]{context, new Integer(i)});
        }
        Context applicationContext = context.getApplicationContext();
        try {
            if (i == TYPE_FINGERPRINT) {
                IFAAManager iFAAManager = IFAAFingerprintManagerFactory.getIFAAManager(applicationContext);
                if (iFAAManager == null || (iFAAManager.getSupportBIOTypes(applicationContext) & TYPE_FINGERPRINT) == 0) {
                    String deviceMode = getDeviceMode(applicationContext);
                    if (isSupportSamSungFP(deviceMode)) {
                        return new VendorOther();
                    }
                    String property = ModelsUtil.getProperty(deviceMode);
                    if (property == null) {
                        return alipayFingerprintSolution(applicationContext);
                    }
                    String property2 = ModelsUtil.getProperty(property);
                    if (property2 == null) {
                        return new VendorOther();
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(property2);
                        String string = jSONObject.getString(Constants.PACKAGENAME);
                        VendorFingerPrint vendorFingerPrint = new VendorFingerPrint(jSONObject.getInt(Constants.VENDOR), jSONObject.getInt(Constants.PROTOCALTYPE), jSONObject.getInt(Constants.PROTOCALVERSION), string, jSONObject.getString(Constants.SERVICEURL));
                        servicePackageName = string;
                        return vendorFingerPrint;
                    } catch (JSONException unused) {
                        return new VendorOther();
                    }
                } else if (IFAAManagerAdaptor.isIgnoreFpIndex(applicationContext)) {
                    return new FingerprintAuthenticator(applicationContext);
                } else {
                    return new FingerprintAuthenticatorAdapter();
                }
            } else if (i == TYPE_BRACELET) {
                return new XiaomiAuthenticator();
            } else {
                if (i == Constants.TYPE_FACE) {
                    IFAAManager iFAAManager2 = IFAAManagerFactoryAdapter.getIFAAManager(applicationContext);
                    if (iFAAManager2 != null && (iFAAManager2.getSupportBIOTypes(applicationContext) & Constants.TYPE_FACE) != 0) {
                        return new FaceAuthenticatorAdapter();
                    }
                    AuthenticatorLOG.fpInfo("IFAAManager create failed ");
                    return new VendorOther();
                }
                throw new IllegalArgumentException("Unknown type : " + i);
            }
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return new VendorOther();
        }
    }

    public static String getDeviceMode(Context context) {
        Cursor query;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f263446e", new Object[]{context});
        }
        String str = modelName;
        if (str != null) {
            return str;
        }
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                String deviceModel = IFAAFingerprintManagerFactory.getIFAAManager(context).getDeviceModel();
                modelName = deviceModel;
                if (deviceModel != null) {
                    String replace = deviceModel.replace(" ", "-");
                    modelName = replace;
                    String replace2 = replace.replace("#", "-");
                    modelName = replace2;
                    modelName = replace2.replace("_", "-");
                    AuthenticatorLOG.fpInfo("IFAA2.0_getDeviceModel_SUCESS: " + modelName);
                    return modelName;
                }
                AuthenticatorLOG.fpInfo("IFAA2.0_getDeviceModel_NULL");
            }
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
        }
        try {
            query = context.getContentResolver().query(Uri.parse("content://authentication.information"), null, null, null, null);
        } catch (Exception unused) {
        }
        if (query == null) {
            String replace3 = Build.MODEL.replace(" ", "-");
            modelName = replace3;
            return replace3;
        }
        if (query.moveToFirst()) {
            int columnIndex = query.getColumnIndex("model");
            if (columnIndex == -1) {
                query.close();
                String replace4 = Build.MODEL.replace(" ", "-");
                modelName = replace4;
                return replace4;
            }
            String string = query.getString(columnIndex);
            query.close();
            if (string != null) {
                String replace5 = string.replace(" ", "-").replace("#", "-");
                modelName = replace5;
                return replace5;
            }
        }
        String replace6 = Build.MODEL.replace(" ", "-");
        modelName = replace6;
        return replace6;
    }

    public static int getServiceVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3e4725b", new Object[]{context})).intValue();
        }
        try {
            String str = servicePackageName;
            if (str == null || str.length() <= 0) {
                return -1;
            }
            return context.getPackageManager().getPackageInfo(servicePackageName, 0).versionCode;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static boolean isNotSupportNNL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed500c9b", new Object[]{str})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                String[] strArr = {"SM-G92", "SM-A8000"};
                for (int i = 0; i < 2; i++) {
                    if (str.indexOf(strArr[i]) == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private static boolean isSupportSamSungFP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab9bdf4", new Object[]{str})).booleanValue();
        }
        for (String str2 : samsungFPModle) {
            if (str.indexOf(str2) == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean supportSamsungAsm(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60571d5", new Object[]{context})).booleanValue();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.getPackageInfo("com.sec.android.fido.uaf.asm", 4096) != null) {
                if ((packageManager.getPackageInfo("com.alipay.security.mobile.authenticator", 4096).applicationInfo.flags & 1) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean isNeedUpdateAuthenticator(Context context, int i) {
        IAuthenticator iAuthenticator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeb86b0", new Object[]{context, new Integer(i)})).booleanValue();
        }
        return !"off".equalsIgnoreCase(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IGNORE_FP, "")) && i == Constants.TYPE_FINGERPRINT && ((iAuthenticator = mFingerprintAuthenticatorCache) == null || iAuthenticator.isIgnoreFpIndex() != IFAAManagerAdaptor.isIgnoreFpIndex(context));
    }
}
