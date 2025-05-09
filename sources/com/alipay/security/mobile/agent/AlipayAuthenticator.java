package com.alipay.security.mobile.agent;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.IAlipayAuthenticatorListener;
import com.alipay.security.mobile.alipayauthenticatorservice.IAlipayAuthenticatorService;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.AuthenticatorResponseUtil;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.alipay.security.mobile.fingerprint.vendor.VendorFingerPrint;
import com.alipay.security.mobile.util.LogCollect;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlipayAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String bindServicePackageName = "";
    private static AlipayAuthenticator mAlipayAuthenticator;
    private AuthenticatorCallback mAuthenticatorCallback;
    private Context mContext = null;
    private Connection mAlipayAuthenticatorConnection = null;
    private IAlipayAuthenticatorListener processListener = new IAlipayAuthenticatorListener.Stub() { // from class: com.alipay.security.mobile.agent.AlipayAuthenticator.1
        @Override // com.alipay.security.mobile.alipayauthenticatorservice.IAlipayAuthenticatorListener
        public int callback(Bundle bundle) throws RemoteException {
            Message message = new Message();
            message.setData(bundle);
            LogCollect.parseLog(bundle);
            AuthenticatorResponse authenticatorResponse = AuthenticatorResponseUtil.getAuthenticatorResponse(message);
            if (!(authenticatorResponse == null || authenticatorResponse.getType() == 9 || authenticatorResponse.getResult() != 100)) {
                AuthenticatorCache.getInstance().refreshCache(AlipayAuthenticator.access$000(AlipayAuthenticator.this), "", 5000L);
            }
            if (authenticatorResponse != null) {
                AuthenticatorLOG.fpInfo("VendorFingerPrint.processAsyn callback [type:" + authenticatorResponse.getType() + ",result:" + authenticatorResponse.getResult() + ",message:" + authenticatorResponse.getResultMessage() + "]");
            } else {
                AuthenticatorLOG.fpInfo("VendorFingerPrint.processAsyn callback [null]");
            }
            AlipayAuthenticator.access$100(AlipayAuthenticator.this).callback(authenticatorResponse);
            return 0;
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class RequestException extends Exception {
        private static final long serialVersionUID = 1;

        private RequestException(String str) {
            super(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ServiceException extends Exception {
        private static final long serialVersionUID = 1;

        private ServiceException(String str) {
            super(str);
        }
    }

    public static AlipayAuthenticator Instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayAuthenticator) ipChange.ipc$dispatch("87f2d5df", new Object[0]);
        }
        if (mAlipayAuthenticator == null) {
            mAlipayAuthenticator = new AlipayAuthenticator();
        }
        return mAlipayAuthenticator;
    }

    public static /* synthetic */ Context access$000(AlipayAuthenticator alipayAuthenticator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("77721e34", new Object[]{alipayAuthenticator});
        }
        return alipayAuthenticator.mContext;
    }

    public static /* synthetic */ AuthenticatorCallback access$100(AlipayAuthenticator alipayAuthenticator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorCallback) ipChange.ipc$dispatch("33ad9c88", new Object[]{alipayAuthenticator});
        }
        return alipayAuthenticator.mAuthenticatorCallback;
    }

    public static /* synthetic */ String access$1002(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f433536e", new Object[]{str});
        }
        bindServicePackageName = str;
        return str;
    }

    private Connection authentServiceConnection() throws ServiceException {
        Connection connection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Connection) ipChange.ipc$dispatch("2d79e370", new Object[]{this});
        }
        Connection connection2 = this.mAlipayAuthenticatorConnection;
        if ((connection2 != null && Connection.access$700(connection2) == null) || ((connection = this.mAlipayAuthenticatorConnection) != null && !Connection.access$700(connection).asBinder().pingBinder())) {
            mAlipayAuthenticator.uninit();
        }
        Connection connection3 = this.mAlipayAuthenticatorConnection;
        if (connection3 != null) {
            return connection3;
        }
        throw new ServiceException("AlipayAuthenticator not connected");
    }

    public static String getApkKeyHash(Context context, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6de719c", new Object[]{context, str});
        }
        byte[] encoded = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())).getEncoded();
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(encoded);
        return Base64.encodeToString(instance.digest(), 10).replace("=", "");
    }

    public int init(Context context, VendorFingerPrint.InitCallback initCallback) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70d1d66f", new Object[]{this, context, initCallback})).intValue();
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            Context applicationContext = context.getApplicationContext();
            try {
                try {
                    Context context2 = this.mContext;
                    if (context2 == null) {
                        this.mContext = applicationContext;
                    } else if (!context2.equals(applicationContext)) {
                        uninit();
                        this.mContext = applicationContext;
                    }
                    if (!"".equals(bindServicePackageName) && !Version.SERVICE_PACKAGE_NAME.equals(bindServicePackageName)) {
                        uninit();
                    }
                    StringBuilder sb = new StringBuilder("package:");
                    sb.append(bindServicePackageName);
                    sb.append(" ");
                    sb.append(Version.SERVICE_PACKAGE_NAME);
                    i = Version.checkServiceVersion(applicationContext);
                    Connection instance = Connection.getInstance(applicationContext, initCallback);
                    if (i == 122 && (this.mAlipayAuthenticatorConnection == null || !Connection.access$200(instance))) {
                        i = 100;
                        if (!Connection.access$300(instance)) {
                            Intent intent = new Intent();
                            intent.setClassName("com.alipay.security.mobile.authenticator", "com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ui.StartTransEmpty");
                            intent.addFlags(268435456);
                            this.mContext.startActivity(intent);
                            Thread.sleep(150L);
                            if (!Connection.access$300(instance)) {
                                i = 126;
                            } else {
                                this.mAlipayAuthenticatorConnection = instance;
                            }
                        } else {
                            this.mAlipayAuthenticatorConnection = instance;
                        }
                    }
                } catch (Throwable unused) {
                    mAlipayAuthenticator.uninit();
                    i = 105;
                    return i;
                }
            } catch (Throwable unused2) {
                i = 105;
                return i;
            }
        }
        return i;
    }

    public Bundle process(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("7f9f2e2", new Object[]{this, bundle});
        }
        try {
            return Connection.access$600(authentServiceConnection(), bundle);
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
            return null;
        }
    }

    public void processAsync(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8370bd", new Object[]{this, authenticatorMessage, authenticatorCallback, new Integer(i)});
            return;
        }
        this.mAuthenticatorCallback = authenticatorCallback;
        Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, authenticatorMessage.getType());
        bundle.putString(AuthenticatorMessage.KEY_MESSAGE, authenticatorMessage.getData());
        bundle.putInt(AuthenticatorMessage.KEY_VENDOR_TYPE, i);
        bundle.putInt(AuthenticatorMessage.KEY_AUTHENTICATOR_TYPE, authenticatorMessage.getAuthenticatorType());
        bundle.putString(AuthenticatorMessage.KEY_EXTRA_PARAMS, authenticatorMessage.getExtraParams());
        bundle.putInt("KEY_VERSION", authenticatorMessage.getVersion());
        try {
            Connection.access$500(authentServiceConnection(), bundle, this.processListener);
        } catch (Exception e) {
            AuthenticatorLOG.error(e);
        }
    }

    public void uninit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae64730", new Object[]{this});
            return;
        }
        Connection connection = this.mAlipayAuthenticatorConnection;
        if (connection != null) {
            Connection.access$400(connection);
        }
        this.mAlipayAuthenticatorConnection = null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Connection {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Connection sConnection;
        private IAlipayAuthenticatorService mAlipayAuthenticatorService;
        private Context mContext;
        private ServiceConnection mServiceConnection;

        private Connection(Context context, final VendorFingerPrint.InitCallback initCallback) throws ServiceException {
            this.mAlipayAuthenticatorService = null;
            this.mServiceConnection = null;
            this.mContext = null;
            if (context != null) {
                this.mContext = context;
                this.mAlipayAuthenticatorService = null;
                this.mServiceConnection = new ServiceConnection() { // from class: com.alipay.security.mobile.agent.AlipayAuthenticator.Connection.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                            return;
                        }
                        Connection.access$702(Connection.this, IAlipayAuthenticatorService.Stub.asInterface(iBinder));
                        initCallback.callback(100);
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName componentName) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                            return;
                        }
                        Connection.access$702(Connection.this, null);
                        Connection.access$902(null);
                    }
                };
                return;
            }
            throw new ServiceException("Invalid parameter exception");
        }

        public static /* synthetic */ boolean access$200(Connection connection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("be8ea234", new Object[]{connection})).booleanValue();
            }
            return connection.isConnected();
        }

        public static /* synthetic */ boolean access$300(Connection connection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40d95713", new Object[]{connection})).booleanValue();
            }
            return connection.bindService();
        }

        public static /* synthetic */ void access$400(Connection connection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3240bee", new Object[]{connection});
            } else {
                connection.unbindService();
            }
        }

        public static /* synthetic */ int access$500(Connection connection, Bundle bundle, IAlipayAuthenticatorListener iAlipayAuthenticatorListener) throws ServiceException, RequestException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ea29c67", new Object[]{connection, bundle, iAlipayAuthenticatorListener})).intValue();
            }
            return connection.sendCommandAsync(bundle, iAlipayAuthenticatorListener);
        }

        public static /* synthetic */ Bundle access$600(Connection connection, Bundle bundle) throws ServiceException, RequestException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("2a6a9a6c", new Object[]{connection, bundle});
            }
            return connection.sendCommand(bundle);
        }

        public static /* synthetic */ IAlipayAuthenticatorService access$700(Connection connection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IAlipayAuthenticatorService) ipChange.ipc$dispatch("2dc6e295", new Object[]{connection});
            }
            return connection.mAlipayAuthenticatorService;
        }

        public static /* synthetic */ IAlipayAuthenticatorService access$702(Connection connection, IAlipayAuthenticatorService iAlipayAuthenticatorService) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IAlipayAuthenticatorService) ipChange.ipc$dispatch("16efcb7b", new Object[]{connection, iAlipayAuthenticatorService});
            }
            connection.mAlipayAuthenticatorService = iAlipayAuthenticatorService;
            return iAlipayAuthenticatorService;
        }

        public static /* synthetic */ Connection access$902(Connection connection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Connection) ipChange.ipc$dispatch("ab01a500", new Object[]{connection});
            }
            sConnection = connection;
            return connection;
        }

        public static final synchronized Connection getInstance(Context context, VendorFingerPrint.InitCallback initCallback) throws Exception {
            synchronized (Connection.class) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Connection) ipChange.ipc$dispatch("2430121a", new Object[]{context, initCallback});
                }
                Connection connection = sConnection;
                if (connection == null || connection.mAlipayAuthenticatorService == null) {
                    sConnection = new Connection(context, initCallback);
                }
                return sConnection;
            }
        }

        private boolean isConnected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
            }
            if (this.mAlipayAuthenticatorService != null) {
                return true;
            }
            return false;
        }

        private Bundle sendCommand(Bundle bundle) throws ServiceException, RequestException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("8343d2e", new Object[]{this, bundle});
            }
            try {
                this.mAlipayAuthenticatorService.processCommand(bundle);
                if (bundle.size() >= 1) {
                    LogCollect.parseLog(bundle);
                    return bundle;
                }
                throw new ServiceException("Null pointer exception");
            } catch (RemoteException unused) {
                return null;
            }
        }

        private int sendCommandAsync(Bundle bundle, IAlipayAuthenticatorListener iAlipayAuthenticatorListener) throws ServiceException, RequestException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7881cc34", new Object[]{this, bundle, iAlipayAuthenticatorListener})).intValue();
            }
            try {
                return this.mAlipayAuthenticatorService.processCommandAsync(bundle, iAlipayAuthenticatorListener);
            } catch (RemoteException unused) {
                throw new ServiceException("Null pointer exception");
            }
        }

        private void unbindService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425e2086", new Object[]{this});
                return;
            }
            try {
                this.mContext.unbindService(this.mServiceConnection);
            } catch (IllegalArgumentException unused) {
            }
            this.mAlipayAuthenticatorService = null;
        }

        private boolean bindService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("780e5443", new Object[]{this})).booleanValue();
            }
            Intent intent = new Intent();
            String str = Version.SERVICE_PACKAGE_NAME;
            try {
                if (!"KtSH_COUctZpUnIrhpOobXUbfWY".equals(AlipayAuthenticator.getApkKeyHash(this.mContext, str)) && !"qi9jRyfvLzSHCk7cLWFW2mR2T9g".equals(AlipayAuthenticator.getApkKeyHash(this.mContext, str))) {
                    AuthenticatorLOG.fpInfo("AlipayAuthenticator_Connection_bindService fail [package hash not match] ");
                    return false;
                }
                intent.setComponent(new ComponentName(str, Version.SERVICE_CLASS_NAME));
                boolean bindService = this.mContext.bindService(intent, this.mServiceConnection, 1);
                if (bindService) {
                    AlipayAuthenticator.access$1002(str);
                    AuthenticatorLOG.fpInfo("AlipayAuthenticator_Connection_bindService success");
                } else {
                    try {
                        Intent intent2 = new Intent();
                        intent2.setClassName("com.alipay.security.mobile.authenticator", "com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.ui.StartTransEmpty");
                        intent2.addFlags(268435456);
                        this.mContext.startActivity(intent2);
                        Thread.sleep(150L);
                    } catch (Throwable unused) {
                    }
                    bindService = this.mContext.bindService(intent, this.mServiceConnection, 1);
                    if (bindService) {
                        AlipayAuthenticator.access$1002(str);
                        AuthenticatorLOG.fpInfo("AlipayAuthenticator_Connection_bindService success on the second time");
                    } else {
                        AuthenticatorLOG.fpInfo("AlipayAuthenticator_Connection_bindService fail [bindservice api return false] ");
                    }
                }
                return bindService;
            } catch (Exception e) {
                AuthenticatorLOG.fpInfo("AlipayAuthenticator_Connection_bindService fail [catch exception : " + e.getMessage() + "]");
                return false;
            }
        }
    }
}
