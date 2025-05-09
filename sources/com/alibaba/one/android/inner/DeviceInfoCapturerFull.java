package com.alibaba.one.android.inner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaDrm;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.taobao.orange.OConstant;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONObject;
import tb.tck;

/* loaded from: classes.dex */
public class DeviceInfoCapturerFull {

    /* renamed from: a  reason: collision with root package name */
    private static Context f2495a;
    private static volatile IBinder b;
    private static volatile IBinder c;
    private static volatile String d;
    private static volatile String e;
    private static volatile IBinder f;
    private static volatile IBinder g;
    private static volatile IBinder h;
    private static volatile IBinder i;
    private static a j = new a("hw_ifaa");
    private static CountDownLatch k = null;
    private static CountDownLatch l = null;
    private static a m = new a("honor_ifaa");
    private static a n = new a("xm_tz_token");
    private static volatile boolean o = false;
    private static Object p = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.one.android.inner.DeviceInfoCapturerFull$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2497a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        AnonymousClass2(String str, String str2, Context context) {
            this.f2497a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.alibaba.one.android.inner.DeviceInfoCapturerFull.2.1
                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
                    new Thread(new Runnable() { // from class: com.alibaba.one.android.inner.DeviceInfoCapturerFull.2.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (AnonymousClass2.this.f2497a.equals("com.tencent.soter.soterserver.ISoterService")) {
                                    IBinder unused = DeviceInfoCapturerFull.b = iBinder;
                                } else if (AnonymousClass2.this.f2497a.equals("org.ifaa.aidl.manager.IfaaManagerService")) {
                                    IBinder unused2 = DeviceInfoCapturerFull.c = iBinder;
                                } else if (AnonymousClass2.this.f2497a.equals("com.hihonor.hnpanpayservice.HwIFAAService")) {
                                    IBinder unused3 = DeviceInfoCapturerFull.h = iBinder;
                                } else if (AnonymousClass2.this.f2497a.equals("com.huawei.hwpanpayservice.HwIFAAService")) {
                                    IBinder unused4 = DeviceInfoCapturerFull.g = iBinder;
                                } else if (AnonymousClass2.this.f2497a.equals("com.huawei.wallet.hmspass.action.CALL_AIDL_SERVICE")) {
                                    IBinder unused5 = DeviceInfoCapturerFull.f = iBinder;
                                } else if (AnonymousClass2.this.f2497a.equals("com.xiaomi.account.action.SECURITY_DEVICE_SIGN")) {
                                    IBinder unused6 = DeviceInfoCapturerFull.i = iBinder;
                                }
                            } catch (Exception unused7) {
                            }
                        }
                    }).start();
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }
            };
            Intent intent = new Intent(this.f2497a);
            intent.setPackage(this.b);
            this.c.bindService(intent, serviceConnection, 1);
        }
    }

    /* loaded from: classes.dex */
    static class a extends Binder {

        /* renamed from: a  reason: collision with root package name */
        public String f2500a;
        private String b = "com.xiaomi.passport.ISecurityDeviceSignResponse";

        public a(String str) {
            this.f2500a = "";
            this.f2500a = str;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str;
            if (!this.f2500a.equalsIgnoreCase("xm_tz_token")) {
                if (this.f2500a.equalsIgnoreCase("hw_ifaa")) {
                    str = "com.huawei.hwpanpayservice.IHwIFAAServiceCallBack";
                } else if (!this.f2500a.equalsIgnoreCase("honor_ifaa")) {
                    return false;
                } else {
                    str = "com.hihonor.hnpanpayservice.IHwIFAAServiceCallBack";
                }
                if (i != 1598968902) {
                    if (i != 1) {
                        try {
                            return super.onTransact(i, parcel, parcel2, i2);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                    parcel.enforceInterface(str);
                    int readInt = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    if (readInt == 0 && DeviceInfoCapturerFull.bytesToIntLowAhead(createByteArray, 0) == 0 && DeviceInfoCapturerFull.bytesToIntLowAhead(createByteArray, 4) == 40) {
                        byte[] bArr = new byte[32];
                        System.arraycopy(createByteArray, 8, bArr, 0, 32);
                        String unused = DeviceInfoCapturerFull.d = DeviceInfoCapturerFull.toHexString(bArr);
                        DeviceInfoCapturerFull.k.countDown();
                    }
                    parcel2.writeNoException();
                    return true;
                }
                parcel2.writeString(str);
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString(this.b);
                return true;
            } else {
                if (i == 1) {
                    parcel.enforceInterface(this.b);
                    parcel.readInt();
                    String str2 = (String) parcel.readBundle().get("userData");
                    if (str2 == null) {
                        return true;
                    }
                    try {
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        return true;
                    }
                    String unused2 = DeviceInfoCapturerFull.e = new JSONObject(new String(Base64.decode(str2, 0), StandardCharsets.UTF_8)).getString("tzToken").substring(0, tck.DETECT_WIDTH);
                    DeviceInfoCapturerFull.l.countDown();
                    parcel2.writeNoException();
                }
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f2501a;
        String b;

        public b(String str) {
            this.f2501a = -1;
            this.b = "";
            this.f2501a = -1;
            this.b = str;
        }
    }

    private DeviceInfoCapturerFull() {
    }

    private static String a(Context context) {
        String string = Settings.System.getString(context.getContentResolver(), "com.baidu.deviceid.v2");
        if (string == null) {
            return "";
        }
        byte[] decode = Base64.decode(string, 0);
        SecretKeySpec secretKeySpec = new SecretKeySpec("30212102dicudiab".getBytes(), "AES");
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec("30212102dicudiab".getBytes()));
            return new String(instance.doFinal(decode));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String a(IBinder iBinder, IBinder iBinder2) {
        if (iBinder == null) {
            return null;
        }
        byte[] bArr = {4, 0, 0, 0};
        byte[] bArr2 = {0, 0, 0, 0};
        byte[] bArr3 = new byte[0];
        if (iBinder2 != null) {
            bArr2 = new byte[]{1, 0, 0, 0};
            bArr3 = new byte[]{1};
        }
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        byte[] bytes = "com.test.notexist".getBytes(StandardCharsets.UTF_8);
        byte[] a2 = a(bArr, bArr2, bArr3, intToBytesLowAhead(bytes.length), bytes, new byte[]{1, 0, 0, 0}, new byte[]{0, 0, 0, 0}, new byte[0]);
        if (iBinder2 != null) {
            a(iBinder, iBinder2, a2);
            return null;
        }
        byte[] a3 = a(iBinder, iBinder2, a2);
        if (bytesToIntLowAhead(a3, 0) != 0 || bytesToIntLowAhead(a3, 4) != 48) {
            return null;
        }
        byte[] bArr4 = new byte[40];
        System.arraycopy(a3, 16, bArr4, 0, 40);
        return toHexString(bArr4);
    }

    private static void a(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (Build.VERSION.SDK_INT > 24) {
                    new Thread(new AnonymousClass2(str2, str, context)).start();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static byte[] a(IBinder iBinder, IBinder iBinder2, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        byte[] bArr2 = null;
        try {
            obtain.writeInterfaceToken(iBinder.getInterfaceDescriptor());
            if (iBinder2 != null) {
                obtain.writeStrongBinder(iBinder2);
                obtain.writeByteArray(bArr);
                if (iBinder.transact(1, obtain, obtain2, 0)) {
                    obtain2.readException();
                }
            } else {
                obtain.writeByteArray(bArr);
                obtain.writeString("org.ifaa.ext.key.GET_SENSOR_LOCATION");
                if (iBinder.transact(4, obtain, obtain2, 0)) {
                    obtain2.readException();
                    bArr2 = obtain2.createByteArray();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return bArr2;
    }

    private static byte[] a(byte[]... bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            i2 += bArr[i3].length;
        }
        byte[] bArr2 = new byte[i2];
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            byte[] bArr3 = bArr[i5];
            System.arraycopy(bArr3, 0, bArr2, i4, bArr3.length);
            i4 += bArr3.length;
        }
        return bArr2;
    }

    public static int audioRoute() {
        AudioManager audioManager;
        Context context = f2495a;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            if (!(devices == null || devices[0] == null)) {
                return devices[0].getType();
            }
        } else if (audioManager.isWiredHeadsetOn()) {
            return 3;
        } else {
            if (audioManager.isBluetoothScoOn()) {
                return 7;
            }
            if (audioManager.isBluetoothA2dpOn()) {
                return 8;
            }
        }
        return -1;
    }

    private static boolean b(Context context) {
        boolean z = false;
        try {
            if (context.getContentResolver().getType(Uri.parse("content://com.huawei.wallet.thirdprovider/getPassDeviceId/12234")) != null) {
                z = true;
            }
            Log.v(RPCDataItems.SWITCH_TAG_LOG, "res：".concat(String.valueOf(z)));
        } catch (Exception unused) {
        }
        return z;
    }

    public static int byteArrayToInt(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i2 += (bArr[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public static int bytesToIntLowAhead(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static String currentThread() {
        return Thread.currentThread().getName();
    }

    private static String d() {
        Method method;
        boolean z = false;
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.framework.ApmMonitorAdapter");
            if (!(cls == null || (method = cls.getMethod("isForeground", new Class[0])) == null)) {
                z = ((Boolean) method.invoke(null, new Object[0])).booleanValue();
            }
        } catch (Exception unused) {
        }
        return z ? "1" : "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
        if (com.alibaba.one.sdk.e.b() != false) goto L_0x017f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String doCommandForString(int r9) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturerFull.doCommandForString(int):java.lang.String");
    }

    private static String e() {
        Method method;
        try {
            Class<?> cls = Class.forName("com.taobao.login4android.Login");
            if (cls == null || (method = cls.getMethod("getNick", new Class[0])) == null) {
                return null;
            }
            return (String) method.invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String f() {
        Method declaredMethod;
        Object invoke;
        Method declaredMethod2;
        try {
            Class<?> cls = Class.forName(OConstant.REFLECT_SECURITYGUARD);
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getInstance", Context.class)) == null) {
                return null;
            }
            Object invoke2 = declaredMethod.invoke(cls, f2495a);
            Method declaredMethod3 = cls.getDeclaredMethod("getStaticDataStoreComp", new Class[0]);
            if (invoke2 == null || declaredMethod3 == null || (invoke = declaredMethod3.invoke(invoke2, new Object[0])) == null || (declaredMethod2 = invoke.getClass().getDeclaredMethod("getAppKeyByIndex", Integer.TYPE, String.class)) == null) {
                return null;
            }
            return (String) declaredMethod2.invoke(invoke, 0, "");
        } catch (Exception unused) {
            return null;
        }
    }

    private static int g(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i2 = 0;
        try {
            try {
                obtain.writeInterfaceToken(iBinder.getInterfaceDescriptor());
                obtain.writeInt(0);
                obtain.writeString("abcdefghijklmn");
                if (iBinder.transact(4, obtain, obtain2, 0)) {
                    obtain2.readException();
                    i2 = obtain2.readInt();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return i2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String g() {
        /*
            r0 = -1
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x0023
            r3 = 8
            if (r2 <= r3) goto L_0x0023
            android.content.Context r2 = com.alibaba.one.android.inner.DeviceInfoCapturerFull.f2495a     // Catch: Exception -> 0x0023
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: Exception -> 0x0023
            android.content.Context r3 = com.alibaba.one.android.inner.DeviceInfoCapturerFull.f2495a     // Catch: Exception -> 0x0023
            java.lang.String r3 = r3.getPackageName()     // Catch: Exception -> 0x0023
            r4 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: Exception -> 0x0023
            if (r2 == 0) goto L_0x0023
            long r3 = java.lang.System.currentTimeMillis()     // Catch: Exception -> 0x0023
            long r5 = r2.firstInstallTime     // Catch: Exception -> 0x0023
            long r3 = r3 - r5
            goto L_0x0024
        L_0x0023:
            r3 = r0
        L_0x0024:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = java.lang.String.valueOf(r3)
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturerFull.g():java.lang.String");
    }

    public static String getAudioVolume() {
        Context context = f2495a;
        if (context == null) {
            return null;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return String.valueOf(audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3));
    }

    public static String getUid(String str) {
        Context context = f2495a;
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return String.valueOf(applicationInfo.uid);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static b h(IBinder iBinder) {
        b bVar = new b("");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken(iBinder.getInterfaceDescriptor());
                obtain.writeInt(0);
                obtain.writeString("abcdefghijklmn");
                if (iBinder.transact(6, obtain, obtain2, 0)) {
                    obtain2.readException();
                    if (obtain2.readInt() == 1) {
                        int readInt = obtain2.readInt();
                        byte[] createByteArray = obtain2.createByteArray();
                        obtain2.readInt();
                        bVar.f2501a = readInt;
                        if (readInt == 0) {
                            byte[] bArr = new byte[4];
                            System.arraycopy(createByteArray, 0, bArr, 0, 4);
                            int byteArrayToInt = byteArrayToInt(bArr);
                            byte[] bArr2 = new byte[byteArrayToInt];
                            System.arraycopy(createByteArray, 4, bArr2, 0, byteArrayToInt);
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            if (jSONObject.has("cpu_id")) {
                                bVar.b = jSONObject.getString("cpu_id");
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return bVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String h() {
        /*
            r0 = -1
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x001c
            r3 = 8
            if (r2 <= r3) goto L_0x001c
            android.content.Context r2 = com.alibaba.one.android.inner.DeviceInfoCapturerFull.f2495a     // Catch: Exception -> 0x001c
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: Exception -> 0x001c
            android.content.Context r3 = com.alibaba.one.android.inner.DeviceInfoCapturerFull.f2495a     // Catch: Exception -> 0x001c
            java.lang.String r3 = r3.getPackageName()     // Catch: Exception -> 0x001c
            r4 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: Exception -> 0x001c
            long r2 = r2.lastUpdateTime     // Catch: Exception -> 0x001c
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            java.lang.String r0 = java.lang.String.valueOf(r2)
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturerFull.h():java.lang.String");
    }

    private static int i(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        int i2 = 0;
        try {
            try {
                obtain.writeInterfaceToken(iBinder.getInterfaceDescriptor());
                obtain.writeInt(0);
                if (iBinder.transact(1, obtain, obtain2, 0)) {
                    obtain2.readException();
                    i2 = obtain2.readInt();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return i2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    private static String i() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return timeZone.getID() + " " + timeZone.getDisplayName(false, 0);
        } catch (AssertionError | Exception unused) {
            return null;
        }
    }

    public static void initialize(Context context) {
        f2495a = context;
        a(context, "com.tencent.soter.soterserver", "com.tencent.soter.soterserver.ISoterService");
        a(f2495a, "org.ifaa.aidl.manager", "org.ifaa.aidl.manager.IfaaManagerService");
        if ((Build.BRAND.equalsIgnoreCase("huawei") || Build.BRAND.equalsIgnoreCase("honor")) && b(f2495a)) {
            a(f2495a, "com.huawei.wallet", "com.huawei.wallet.hmspass.action.CALL_AIDL_SERVICE");
        }
        if (Build.BRAND.equalsIgnoreCase("xiaomi")) {
            l = new CountDownLatch(1);
            a(f2495a, "com.xiaomi.account", "com.xiaomi.account.action.SECURITY_DEVICE_SIGN");
        }
        if (context.getPackageManager().checkPermission("cn.org.ifaa.permission.USE_IFAA_MANAGER", f2495a.getPackageName()) != 0) {
            return;
        }
        if (Build.BRAND.equalsIgnoreCase("huawei") || Build.BRAND.equalsIgnoreCase("honor")) {
            k = new CountDownLatch(1);
            a(f2495a, "com.huawei.hwpanpayservice", "com.huawei.hwpanpayservice.HwIFAAService");
            a(f2495a, "com.hihonor.hnpanpayservice", "com.hihonor.hnpanpayservice.HwIFAAService");
        }
    }

    public static byte[] intToBytesLowAhead(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 24) & 255)};
    }

    private static b j(IBinder iBinder) {
        b bVar = new b("");
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken(iBinder.getInterfaceDescriptor());
                obtain.writeInt(0);
                if (iBinder.transact(2, obtain, obtain2, 0)) {
                    obtain2.readException();
                    if (obtain2.readInt() == 1) {
                        int readInt = obtain2.readInt();
                        byte[] createByteArray = obtain2.createByteArray();
                        obtain2.readInt();
                        bVar.f2501a = readInt;
                        if (readInt == 0) {
                            byte[] bArr = new byte[4];
                            System.arraycopy(createByteArray, 0, bArr, 0, 4);
                            int byteArrayToInt = byteArrayToInt(bArr);
                            byte[] bArr2 = new byte[byteArrayToInt];
                            System.arraycopy(createByteArray, 4, bArr2, 0, byteArrayToInt);
                            JSONObject jSONObject = new JSONObject(new String(bArr2));
                            if (jSONObject.has("cpu_id")) {
                                bVar.b = jSONObject.getString("cpu_id");
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return bVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    private static String j() {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName(OConstant.REFLECT_SECURITYGUARD);
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getGlobalUserData", new Class[0])) == null) {
                return null;
            }
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String k() {
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT < 30) {
                MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                if (propertyByteArray != null) {
                    str = Base64.encodeToString(propertyByteArray, 2);
                }
                mediaDrm.release();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    private static String l() {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                PackageInfo packageInfo = f2495a.getPackageManager().getPackageInfo(f2495a.getPackageName(), 4096);
                if (!(packageInfo == null || packageInfo.requestedPermissions == null || packageInfo.requestedPermissions.length == 0)) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < packageInfo.requestedPermissions.length; i2++) {
                        String str = packageInfo.requestedPermissions[i2];
                        if (str != null) {
                            if (str.startsWith("android.permission.")) {
                                str = str.substring(19);
                            }
                            if ((packageInfo.requestedPermissionsFlags[i2] & 2) != 0) {
                                sb.append(str);
                                sb.append(",");
                            }
                        }
                    }
                    return sb.toString();
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:20|(10:21|(3:46|23|24)(1:58)|27|50|28|29|30|31|(2:48|37)|(1:60)(2:42|43))|26|27|50|28|29|30|31|(2:48|37)|(2:40|60)(1:59)) */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturerFull.m():java.lang.String");
    }

    private static String n() {
        String str = null;
        if (b == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.getInterfaceDescriptor());
            if (b.transact(11, obtain, obtain2, 0)) {
                obtain2.readException();
                if (obtain2.readInt() == 1 && obtain2.readInt() == 0) {
                    str = toHexString(obtain2.createByteArray());
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return str;
    }

    private static String o() {
        String str = null;
        if (f == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                obtain.writeInterfaceToken(f.getInterfaceDescriptor());
                obtain.writeString("don't change");
                f.transact(9, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 1) {
                    if (obtain2.readString().equals("0")) {
                        for (int i2 = 0; i2 < 10; i2++) {
                            obtain2.readInt();
                        }
                        str = obtain2.readString().split(SymbolExpUtil.SYMBOL_VERTICALBAR, 3)[1];
                    } else {
                        obtain2.readString();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return str;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toLowerCase();
    }
}
