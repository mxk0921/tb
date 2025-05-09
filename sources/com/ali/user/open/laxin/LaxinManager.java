package com.ali.user.open.laxin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.service.StorageService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.laxin.LaxinDataCallback;
import com.ali.user.open.laxin.LaxinLogin;
import com.ali.user.open.laxin.data.DataRepository;
import com.ali.user.open.laxin.data.FetchAppInfo;
import com.ali.user.open.ucc.UccCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LaxinManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ucc.LaxinManager";
    private static volatile LaxinManager sInstance;
    private ServiceConnection connection;
    private LaxinLogin mLaxinLogin;

    static {
        t2o.a(73400331);
    }

    public static /* synthetic */ void access$000(LaxinManager laxinManager, Context context, UccCallback uccCallback, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6a7ab0", new Object[]{laxinManager, context, uccCallback, str, new Integer(i), str2});
        } else {
            laxinManager.failBack(context, uccCallback, str, i, str2);
        }
    }

    public static /* synthetic */ void access$100(LaxinManager laxinManager, Context context, Map map, UccCallback uccCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac989613", new Object[]{laxinManager, context, map, uccCallback, str});
        } else {
            laxinManager.succssBack(context, map, uccCallback, str);
        }
    }

    public static /* synthetic */ ServiceConnection access$200(LaxinManager laxinManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceConnection) ipChange.ipc$dispatch("f3c01050", new Object[]{laxinManager});
        }
        return laxinManager.connection;
    }

    private void failBack(Context context, UccCallback uccCallback, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d1715e", new Object[]{this, context, uccCallback, str, new Integer(i), str2});
        } else {
            uccCallback.onFail(str, i, str2);
        }
    }

    public static LaxinManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LaxinManager) ipChange.ipc$dispatch("7a324927", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (LaxinManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LaxinManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void succssBack(Context context, Map<String, String> map, UccCallback uccCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dd0c1e", new Object[]{this, context, map, uccCallback, str});
        } else {
            uccCallback.onSuccess(str, map);
        }
    }

    public void applyLaxinInfo(Context context, String str, String str2, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d952694", new Object[]{this, context, str, str2, uccCallback});
        } else {
            applyLaxinInfo(context, str, uccCallback);
        }
    }

    public void applyDataFrom(final Context context, final String str, final String str2, String str3, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afb344", new Object[]{this, context, str, str2, str3, uccCallback});
        } else if (uccCallback != null) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                SDKLogger.e(TAG, "empty param");
                uccCallback.onFail(str, LaxinCode.INVALID_PARAM, "请求参数不合法");
            }
            final LaxinDataCallback.Stub stub = new LaxinDataCallback.Stub() { // from class: com.ali.user.open.laxin.LaxinManager.1
                @Override // com.ali.user.open.laxin.LaxinDataCallback
                public void onData(Map map) throws RemoteException {
                    try {
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (map == null) {
                        SDKLogger.e(LaxinManager.TAG, "onData paramMap is null");
                        LaxinManager.access$000(LaxinManager.this, context, uccCallback, str, LaxinCode.EMPTY_RESULT, "获取免登token失败");
                        return;
                    }
                    SDKLogger.e(LaxinManager.TAG, "onData paramMap is not null，success：" + map.get("success"));
                    String str4 = (String) map.get("data");
                    if (!TextUtils.isEmpty(str4)) {
                        SDKLogger.e(LaxinManager.TAG, "onData paramMap token is not null");
                        HashMap hashMap = new HashMap();
                        hashMap.put("token", str4);
                        hashMap.put(SessionConstants.LOGIN_SITE, str);
                        LaxinManager.access$100(LaxinManager.this, context, hashMap, uccCallback, str);
                        return;
                    }
                    LaxinManager.access$000(LaxinManager.this, context, uccCallback, str, LaxinCode.UNKNOWN_EXCEPTION, "获取免登token失败");
                }
            };
            ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.ali.user.open.laxin.LaxinManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    SDKLogger.e(LaxinManager.TAG, "bind service success");
                    LaxinLogin asInterface = LaxinLogin.Stub.asInterface(iBinder);
                    try {
                        SDKLogger.e(LaxinManager.TAG, "setCallback unionDataCallback=" + stub);
                        HashMap hashMap = new HashMap();
                        hashMap.put(SessionConstants.LOGIN_SITE, str);
                        hashMap.put("loginAppkey", str2);
                        asInterface.applyLaxinInfo(hashMap, stub);
                    } catch (RemoteException e) {
                        SDKLogger.e(LaxinManager.TAG, "setCallback RemoteException=" + e);
                        e.printStackTrace();
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    } else {
                        SDKLogger.e(LaxinManager.TAG, "onServiceDisconnected ");
                    }
                }
            };
            Intent intent = new Intent("com.ali.user.ucc.laxin");
            intent.setPackage(str3);
            boolean bindService = context.bindService(intent, serviceConnection, 1);
            SDKLogger.e(TAG, "bind service start");
            if (!bindService) {
                SDKLogger.e(TAG, "bindService failed");
                uccCallback.onFail(str, -2, "bindService failed");
            }
        }
    }

    public void applyLaxinInfo(final Context context, final String str, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72bb9de", new Object[]{this, context, str, uccCallback});
            return;
        }
        SDKLogger.e(TAG, "in applyLaxinInfo");
        if (uccCallback != null) {
            final LaxinDataCallback.Stub stub = new LaxinDataCallback.Stub() { // from class: com.ali.user.open.laxin.LaxinManager.3
                @Override // com.ali.user.open.laxin.LaxinDataCallback
                public void onData(Map map) throws RemoteException {
                    if (map == null) {
                        SDKLogger.e(LaxinManager.TAG, "onData params is null");
                        uccCallback.onFail(str, LaxinCode.EMPTY_RESULT, "获取免登token失败");
                        return;
                    }
                    String str2 = (String) map.get("data");
                    SDKLogger.e(LaxinManager.TAG, "applyLaxinInfo data=" + str2);
                    if (!TextUtils.isEmpty(str2)) {
                        uccCallback.onSuccess(str, map);
                        return;
                    }
                    uccCallback.onFail(str, LaxinCode.UNKNOWN_EXCEPTION, "获取免登token失败");
                    try {
                        context.unbindService(LaxinManager.access$200(LaxinManager.this));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            this.connection = new ServiceConnection() { // from class: com.ali.user.open.laxin.LaxinManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    LaxinLogin asInterface = LaxinLogin.Stub.asInterface(iBinder);
                    try {
                        SDKLogger.e(LaxinManager.TAG, "onServiceConnected");
                        HashMap hashMap = new HashMap();
                        hashMap.put(SessionConstants.LOGIN_SITE, AliMemberSDK.getMasterSite());
                        hashMap.put("loginAppKey", ((StorageService) AliMemberSDK.getService(StorageService.class)).getAppKey());
                        asInterface.applyLaxinInfo(hashMap, stub);
                    } catch (RemoteException e) {
                        SDKLogger.e(LaxinManager.TAG, "setCallback RemoteException=" + e.getMessage());
                        e.printStackTrace();
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    } else {
                        SDKLogger.e(LaxinManager.TAG, "onServiceDisconnected ");
                    }
                }
            };
            SDKLogger.e(TAG, "applyLaxinInfo start request appinfo");
            try {
                DataRepository.fetchLaxinPref(new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.laxin.LaxinManager.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                    public void onError(String str2, RpcResponse rpcResponse) {
                        String str3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                            return;
                        }
                        if (("get packages  error=" + rpcResponse) == null) {
                            str3 = "";
                        } else {
                            str3 = rpcResponse.message;
                        }
                        SDKLogger.e(LaxinManager.TAG, str3);
                        uccCallback.onFail(str, -1, "获取免登token失败");
                    }

                    @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                    public void onSystemError(String str2, RpcResponse rpcResponse) {
                        String str3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                            return;
                        }
                        if (("get packages system error=" + rpcResponse) == null) {
                            str3 = "";
                        } else {
                            str3 = rpcResponse.message;
                        }
                        SDKLogger.e(LaxinManager.TAG, str3);
                        uccCallback.onFail(str, -1, "获取免登token失败");
                    }

                    @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                    public void onSuccess(RpcResponse rpcResponse) {
                        String str2;
                        T t;
                        String str3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                            return;
                        }
                        SDKLogger.e(LaxinManager.TAG, "applyLaxinInfo request appinfo success");
                        if (rpcResponse == null || (t = rpcResponse.returnValue) == 0) {
                            if (("applyLaxinInfo request appinfo success but " + rpcResponse) == null) {
                                str2 = "response is null";
                            } else {
                                str2 = "returnValue is null";
                            }
                            SDKLogger.e(LaxinManager.TAG, str2);
                        } else {
                            try {
                                Intent intent = new Intent("com.ali.user.ucc.laxin");
                                String[] strArr = ((FetchAppInfo) t).packages;
                                if (("applyLaxinInfo packages length :" + strArr) == null) {
                                    str3 = "-1";
                                } else {
                                    str3 = strArr.length + "";
                                }
                                SDKLogger.e(LaxinManager.TAG, str3);
                                if (strArr == null || strArr.length <= 0) {
                                    SDKLogger.e(LaxinManager.TAG, "get packages is null");
                                } else {
                                    for (String str4 : strArr) {
                                        intent.setPackage(str4);
                                        SDKLogger.e(LaxinManager.TAG, "bind service start:" + str4);
                                        if (context.bindService(intent, LaxinManager.access$200(LaxinManager.this), 1)) {
                                            SDKLogger.e(LaxinManager.TAG, "bindService success");
                                            return;
                                        } else {
                                            SDKLogger.e(LaxinManager.TAG, "bindService failed");
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                                SDKLogger.e(LaxinManager.TAG, "applyLaxinInfo exception:" + th.getMessage());
                            }
                        }
                        uccCallback.onFail(str, -3, "get packages failed");
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
                uccCallback.onFail(str, -4, "获取umidToken失败");
            }
        }
    }
}
