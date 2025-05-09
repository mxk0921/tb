package com.alipay.ma;

import android.os.AsyncTask;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaBuryRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile EngineBuryRecord sEngineBuryRecord;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface EngineBuryRecord {
        void recodeDecodeFailedMaInfo(String str);

        void recordBigPixelsImageScan(double d, double d2);

        void recordRecognizedPerformance(Object obj);

        void recordScanDecodeTrack(String str, String str2, Map map);

        void reportEightSecondsNotRecognize(long j, String str);

        void reportSoLoadResult(int i, String str, long j);

        void reportUnusualScanCase(int i, String str);
    }

    public static void a(final int i, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f770860", new Object[]{new Integer(i), new Long(j)});
        } else {
            new AsyncTask<Object, Object, Object>() { // from class: com.alipay.ma.MaBuryRecord.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/ma/MaBuryRecord$2");
                }

                @Override // android.os.AsyncTask
                public Object doInBackground(Object... objArr) {
                    try {
                        Class<?> cls = Class.forName("com.alipay.mobile.mascanengine.BuryRecord");
                        cls.getDeclaredMethod("reportSoLoadResult", Integer.TYPE, Long.TYPE).invoke(cls.newInstance(), Integer.valueOf(i), Long.valueOf(j));
                        return null;
                    } catch (ClassNotFoundException e) {
                        Log.e("MaBuryRecord", "asyncBurySoLoad()", e);
                        return null;
                    } catch (IllegalAccessException e2) {
                        Log.e("MaBuryRecord", "asyncBurySoLoad()", e2);
                        return null;
                    } catch (InstantiationException e3) {
                        Log.e("MaBuryRecord", "asyncBurySoLoad()", e3);
                        return null;
                    } catch (NoSuchMethodException e4) {
                        Log.e("MaBuryRecord", "asyncBurySoLoad()", e4);
                        return null;
                    } catch (InvocationTargetException e5) {
                        Log.e("MaBuryRecord", "asyncBurySoLoad()", e5);
                        return null;
                    }
                }
            }.execute(new Object[0]);
        }
    }

    public static void b(final String str, final String str2, final Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa6137b", new Object[]{str, str2, map});
        } else {
            new AsyncTask<Object, Object, Object>() { // from class: com.alipay.ma.MaBuryRecord.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str3, Object... objArr) {
                    str3.hashCode();
                    int hashCode = str3.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alipay/ma/MaBuryRecord$1");
                }

                @Override // android.os.AsyncTask
                public Object doInBackground(Object... objArr) {
                    try {
                        Class<?> cls = Class.forName("com.alipay.mobile.mascanengine.BuryRecord");
                        cls.getDeclaredMethod("recordScanDecodeTrack", String.class, String.class, Map.class).invoke(cls.newInstance(), str, str2, map);
                        return null;
                    } catch (ClassNotFoundException e) {
                        Log.e("MaBuryRecord", "asyncRecordImageDecodeTrack()", e);
                        return null;
                    } catch (IllegalAccessException e2) {
                        Log.e("MaBuryRecord", "asyncRecordImageDecodeTrack()", e2);
                        return null;
                    } catch (InstantiationException e3) {
                        Log.e("MaBuryRecord", "asyncRecordImageDecodeTrack()", e3);
                        return null;
                    } catch (NoSuchMethodException e4) {
                        Log.e("MaBuryRecord", "asyncRecordImageDecodeTrack()", e4);
                        return null;
                    } catch (InvocationTargetException e5) {
                        Log.e("MaBuryRecord", "asyncRecordImageDecodeTrack()", e5);
                        return null;
                    }
                }
            }.execute(new Object[0]);
        }
    }

    public static void recodeDecodeFailedMaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67f3d9e", new Object[]{str});
        } else if (sEngineBuryRecord != null) {
            sEngineBuryRecord.recodeDecodeFailedMaInfo(str);
        }
    }

    public static void recordBigPixelsImageScan(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c713d4e3", new Object[]{new Double(d), new Double(d2)});
        } else if (sEngineBuryRecord != null) {
            sEngineBuryRecord.recordBigPixelsImageScan(d, d2);
        }
    }

    public static void recordRecognizedPerformance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8296e0cc", new Object[]{obj});
        } else if (sEngineBuryRecord != null) {
            sEngineBuryRecord.recordRecognizedPerformance(obj);
        }
    }

    public static void recordScanDecodeTrack(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f86927b", new Object[]{str, str2, map});
        } else if (sEngineBuryRecord != null) {
            sEngineBuryRecord.recordScanDecodeTrack(str, str2, map);
        } else {
            b(str, str2, map);
        }
    }

    public static void registerEngineBuryRecord(EngineBuryRecord engineBuryRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45590e5c", new Object[]{engineBuryRecord});
        } else {
            sEngineBuryRecord = engineBuryRecord;
        }
    }

    public static void reportSoLoadResult(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85871fd1", new Object[]{new Integer(i), str, new Long(j)});
        } else if (sEngineBuryRecord != null) {
            sEngineBuryRecord.reportSoLoadResult(i, str, j);
        } else {
            a(i, j);
        }
    }

    public static void reportUnusualScanCase(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0925444", new Object[]{new Integer(i), str});
        } else if (sEngineBuryRecord != null) {
            sEngineBuryRecord.reportUnusualScanCase(i, str);
        }
    }

    public static void unRegisterEngineBuryRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ebd9730", new Object[0]);
        } else {
            sEngineBuryRecord = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void reportEightSecondsNotRecognize(java.util.Map r9) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.ma.MaBuryRecord.reportEightSecondsNotRecognize(java.util.Map):void");
    }
}
