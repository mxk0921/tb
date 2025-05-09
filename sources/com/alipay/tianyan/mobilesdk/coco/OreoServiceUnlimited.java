package com.alipay.tianyan.mobilesdk.coco;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OreoServiceUnlimited {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_START_SERVICE = 16707567;
    public static final String DESCRIPTOR_START_SERVICE = "OreoServiceUnlimited-startService";
    public static final int ERROR_CODE_NO_TARGET_SERVICE = -1;
    public static final int ERROR_CODE_UNKNOWN_ERROR = -2;
    public static final String KEY_MONITOR_TRACE_OREO_UNLIMITED_SERVICE = "monitor_trace_oreo_unlimited_service";
    public static final String TAG = "OreoServiceUnlimited";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4548a;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class StartServiceServiceConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f4549a;
        public final Intent b;
        public final String c;

        public StartServiceServiceConnection(Context context, Intent intent, String str) {
            this.f4549a = new WeakReference<>(context);
            this.b = intent;
            this.c = str;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            Context context = this.f4549a.get();
            if (context != null) {
                try {
                    if (this.b == null) {
                    } else {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        obtain.writeInterfaceToken(OreoServiceUnlimited.DESCRIPTOR_START_SERVICE);
                        this.b.writeToParcel(obtain, 0);
                        iBinder.transact(OreoServiceUnlimited.CODE_START_SERVICE, obtain, obtain2, 0);
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        if (readInt < 0) {
                            String readString = obtain2.readString();
                            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                            traceLogger.error(OreoServiceUnlimited.TAG, "Call Oreo startService error, code: " + readInt + ", error: " + readString);
                        }
                        OreoServiceUnlimitedTracker.trackAfterCall(this.c);
                        obtain.recycle();
                        obtain2.recycle();
                        try {
                            context.unbindService(this);
                        } catch (Throwable th) {
                            LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th);
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th2);
                        try {
                            context.unbindService(this);
                        } catch (Throwable th3) {
                            LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th3);
                        }
                    } finally {
                        try {
                            context.unbindService(this);
                        } catch (Throwable th4) {
                            LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th4);
                        }
                    }
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            try {
                Context context = this.f4549a.get();
                if (context != null) {
                    context.unbindService(this);
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, th);
            }
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class WrappedBinder extends Binder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private IBinder f4550a;
        private WeakReference<Service> b;

        public WrappedBinder(IBinder iBinder, Service service) {
            this.f4550a = iBinder;
            this.b = new WeakReference<>(service);
        }

        public static /* synthetic */ Object ipc$super(WrappedBinder wrappedBinder, String str, Object... objArr) {
            if (str.hashCode() == 94517172) {
                return new Boolean(super.onTransact(((Number) objArr[0]).intValue(), (Parcel) objArr[1], (Parcel) objArr[2], ((Number) objArr[3]).intValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/tianyan/mobilesdk/coco/OreoServiceUnlimited$WrappedBinder");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a237b4", new Object[]{this, new Integer(i), parcel, parcel2, new Integer(i2)})).booleanValue();
            }
            if (i == 16707567) {
                try {
                    parcel.enforceInterface(OreoServiceUnlimited.DESCRIPTOR_START_SERVICE);
                    try {
                        parcel2.writeNoException();
                        Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                        Service service = this.b.get();
                        if (service == null) {
                            parcel2.writeInt(-1);
                            parcel2.writeString("");
                            return true;
                        }
                        intent.setExtrasClassLoader(service.getClassLoader());
                        service.onStartCommand(intent, 0, -1);
                        parcel2.writeInt(0);
                        return true;
                    } catch (Exception e) {
                        LoggerFactory.getTraceLogger().error(OreoServiceUnlimited.TAG, e);
                        parcel2.writeInt(-2);
                        parcel2.writeString(e.getMessage());
                        return true;
                    }
                } catch (SecurityException unused) {
                }
            }
            IBinder iBinder = this.f4550a;
            if (iBinder != null) {
                return iBinder.transact(i, parcel, parcel2, i2);
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public static ComponentName a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("74d7a0fc", new Object[]{context, intent});
        }
        try {
            if (TianyanLoggingStatus.isMonitorBackground()) {
                return null;
            }
            return context.startService(intent);
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error(TAG, "Start service in foreground error, msg: " + th.getMessage());
            return null;
        }
    }

    public static boolean shouldUseIt(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6081ea66", new Object[]{context})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (context.getApplicationInfo().targetSdkVersion >= 26) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static ComponentName startService(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("c167cc2a", new Object[]{context, intent});
        }
        if (intent == null) {
            return null;
        }
        try {
            if (!shouldUseIt(context)) {
                return context.startService(intent);
            }
            ComponentName a2 = a(context, intent);
            if (a2 != null) {
                LoggerFactory.getTraceLogger().info(TAG, "Start service in foreground");
                return a2;
            }
            Context applicationContext = context.getApplicationContext();
            ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
            if (resolveService == null) {
                LoggerFactory.getTraceLogger().error(TAG, "Can't find target service");
                return null;
            } else if (!TextUtils.equals(resolveService.serviceInfo.packageName, applicationContext.getPackageName())) {
                LoggerFactory.getTraceLogger().error(TAG, "Can't support outer package");
                return null;
            } else if (!IOreoServiceUnlimited.class.isAssignableFrom(Class.forName(resolveService.serviceInfo.name))) {
                LoggerFactory.getTraceLogger().error(TAG, "Target service not implement IOreoServiceUnlimited");
                return null;
            } else {
                if (!f4548a) {
                    f4548a = true;
                    if ("true".equals(TianyanLoggingStatus.getConfigValueByKey(KEY_MONITOR_TRACE_OREO_UNLIMITED_SERVICE, null))) {
                        OreoServiceUnlimitedTracker.startTrack();
                        LoggerFactory.getTraceLogger().info(TAG, "Start log track");
                    } else {
                        LoggerFactory.getTraceLogger().info(TAG, "Disable log track");
                    }
                }
                String str = LoggerFactory.getProcessInfo().getProcessId() + ":" + UUID.randomUUID().toString();
                applicationContext.bindService(intent, new StartServiceServiceConnection(applicationContext, intent, str), 1);
                OreoServiceUnlimitedTracker.trackBeforeCall(str);
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                return new ComponentName(serviceInfo.packageName, serviceInfo.name);
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, "Fail to startService, intent: " + intent + ", error: " + th.getMessage());
            return null;
        }
    }
}
