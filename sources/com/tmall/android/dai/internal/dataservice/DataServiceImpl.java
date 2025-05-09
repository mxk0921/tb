package com.tmall.android.dai.internal.dataservice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import java.util.Map;
import tb.eo1;
import tb.t2o;
import tb.t45;
import tb.vzu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DataServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DataServiceImpl instance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends eo1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.tmall.android.dai.internal.dataservice.DataServiceImpl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC0829a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0829a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    DataServiceImpl.access$000(DataServiceImpl.this);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/dataservice/DataServiceImpl$1");
        }

        @Override // tb.tzu
        public void onSwitchBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74060788", new Object[]{this});
            } else {
                t45.c().e(new RunnableC0829a());
            }
        }
    }

    static {
        t2o.a(1034944640);
    }

    private DataServiceImpl() {
    }

    public static /* synthetic */ void access$000(DataServiceImpl dataServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07fad19", new Object[]{dataServiceImpl});
        } else {
            dataServiceImpl.syncAllBatchData();
        }
    }

    public static synchronized DataServiceImpl getInstance() {
        synchronized (DataServiceImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataServiceImpl) ipChange.ipc$dispatch("6fa612e6", new Object[0]);
            }
            if (instance == null) {
                instance = new DataServiceImpl();
            }
            return instance;
        }
    }

    private static native int nativeDataCenterSaveData(String str, String str2, String str3, Map<String, String> map);

    private static native void nativeSyncAllBatchData();

    private void syncAllBatchData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661ddd25", new Object[]{this});
        } else {
            syncAllDataCenterBatchData();
        }
    }

    private void syncAllDataCenterBatchData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78170e46", new Object[]{this});
        } else {
            nativeSyncAllBatchData();
        }
    }

    public void detectAppEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0c224f", new Object[]{this});
        } else {
            vzu.getInstance().registerAppStatusCallbacks(new a());
        }
    }

    public int saveData(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7459acc", new Object[]{this, str, str2, str3, map})).intValue();
        }
        if (DAI.loadNativeDBBeforeStart() != 1 || map == null || map.size() == 0) {
            return -1;
        }
        return nativeDataCenterSaveData(str, str2, str3, map);
    }
}
