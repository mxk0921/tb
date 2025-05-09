package com.taobao.android.protodb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.gp;
import tb.k3g;
import tb.kkj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Series extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Series(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(Series series, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/protodb/Series");
    }

    private native void nativeAppendRecord(long j, String str, String str2, ValueWrapper[] valueWrapperArr);

    private native long nativeGetRecord(long j, String str);

    private static native long nativeOpen(String str, Config config);

    public static Series open(String str, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Series) ipChange.ipc$dispatch("bd502fe6", new Object[]{str, config});
        }
        Application a2 = gp.a();
        if (a2 == null) {
            throw new RuntimeException("failed to get android context!");
        } else if (kkj.b() < 0) {
            return null;
        } else {
            long nativeOpen = nativeOpen(a2.getFilesDir() + File.separator + "lsdb-series-" + str, config);
            if (nativeOpen > 0) {
                return new Series(nativeOpen);
            }
            return null;
        }
    }

    public void appendRecord(k3g k3gVar, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1fed69", new Object[]{this, k3gVar, str, objArr});
            return;
        }
        ValueWrapper[] valueWrapperArr = new ValueWrapper[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                valueWrapperArr[i] = ValueWrapper.stringValue((String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    valueWrapperArr[i] = ValueWrapper.intValue(((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    valueWrapperArr[i] = ValueWrapper.longValue(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    valueWrapperArr[i] = ValueWrapper.floatValue(((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    valueWrapperArr[i] = ValueWrapper.doubleValue(((Double) obj).doubleValue());
                }
            }
        }
        nativeAppendRecord(getNativePointer(), k3gVar.a(), str, valueWrapperArr);
    }

    public Record getRecord(k3g k3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Record) ipChange.ipc$dispatch("c5d65dbe", new Object[]{this, k3gVar});
        }
        long nativeGetRecord = nativeGetRecord(getNativePointer(), k3gVar.a());
        if (nativeGetRecord > 0) {
            return new Record(nativeGetRecord);
        }
        return null;
    }

    public static Series open(String str, String str2, Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Series) ipChange.ipc$dispatch("e18ed1c", new Object[]{str, str2, config});
        }
        if (kkj.b() < 0) {
            return null;
        }
        long nativeOpen = nativeOpen(str + File.separator + "lsdb-series-" + str2, config);
        if (nativeOpen > 0) {
            return new Series(nativeOpen);
        }
        return null;
    }
}
