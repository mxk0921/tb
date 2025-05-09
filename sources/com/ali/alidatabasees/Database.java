package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Database extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Database(long j) {
        super(j);
    }

    public static Database d(DBConfig dBConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Database) ipChange.ipc$dispatch("465051cf", new Object[]{dBConfig});
        }
        if (!NativeBridgedObject.f1868a) {
            return null;
        }
        long nativeOpenDatabase = nativeOpenDatabase(dBConfig);
        if (nativeOpenDatabase == 0) {
            return null;
        }
        return new Database(nativeOpenDatabase);
    }

    public static /* synthetic */ Object ipc$super(Database database, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/alidatabasees/Database");
    }

    private native long nativeCreateStatement(String str);

    private native void nativeDeleteDatabase();

    private static native long nativeOpenDatabase(DBConfig dBConfig);

    private native long nativePrepareStatement(String str);

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (NativeBridgedObject.f1868a) {
            a();
        }
    }

    public CallableStatement c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CallableStatement) ipChange.ipc$dispatch("b850f165", new Object[]{this, str});
        }
        if (!NativeBridgedObject.f1868a) {
            return null;
        }
        long nativeCreateStatement = nativeCreateStatement(str);
        if (nativeCreateStatement == 0) {
            return null;
        }
        return new CallableStatement(nativeCreateStatement);
    }

    public PreparedStatement e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedStatement) ipChange.ipc$dispatch("b4c5cc3f", new Object[]{this, str});
        }
        if (!NativeBridgedObject.f1868a) {
            return null;
        }
        long nativePrepareStatement = nativePrepareStatement(str);
        if (nativePrepareStatement == 0) {
            return null;
        }
        return new PreparedStatement(nativePrepareStatement);
    }
}
