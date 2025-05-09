package com.taobao.message.kit.cache;

import android.os.SystemClock;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class KVDataStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = true;
    private static final int LIMIT = 262144;
    private static final int STATE_INITIALIZATION = 1;
    private static final int STATE_UNUSABLE = 0;
    private static final int STATE_WORK = 2;
    private static final String TAG = "KVDataStorage";
    private static final int VERSION = 1;
    private MappedByteBuffer mBuffer;
    private RandomAccessFile mFile;
    private String mFilePath;
    private StorageDO mStorageDO;
    private boolean mMappedBufferDemote = false;
    private AtomicInteger mInitState = new AtomicInteger(0);
    private List<InitListener> mInitListenerList = new ArrayList(4);
    private List<BaseRunnable> mTasks = new ArrayList();
    private Map<String, String> mDataMap = new ConcurrentHashMap(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface InitListener {
        void init(Map<String, String> map);
    }

    static {
        t2o.a(529530930);
    }

    public KVDataStorage(String str) {
        this.mFilePath = str;
    }

    public static /* synthetic */ String access$000(KVDataStorage kVDataStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5c3759f", new Object[]{kVDataStorage});
        }
        return kVDataStorage.mFilePath;
    }

    public static /* synthetic */ void access$100(KVDataStorage kVDataStorage, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0959253", new Object[]{kVDataStorage, th});
        } else {
            kVDataStorage.processError(th);
        }
    }

    public static /* synthetic */ Map access$200(KVDataStorage kVDataStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b2f43998", new Object[]{kVDataStorage});
        }
        return kVDataStorage.mDataMap;
    }

    public static /* synthetic */ Map access$202(KVDataStorage kVDataStorage, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("abdd4a75", new Object[]{kVDataStorage, map});
        }
        kVDataStorage.mDataMap = map;
        return map;
    }

    public static /* synthetic */ List access$300(KVDataStorage kVDataStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15b81f63", new Object[]{kVDataStorage});
        }
        return kVDataStorage.mInitListenerList;
    }

    public static /* synthetic */ AtomicInteger access$400(KVDataStorage kVDataStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("4fedc0cf", new Object[]{kVDataStorage});
        }
        return kVDataStorage.mInitState;
    }

    public static /* synthetic */ void access$500(KVDataStorage kVDataStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eced9e6", new Object[]{kVDataStorage});
        } else {
            kVDataStorage.store();
        }
    }

    private static boolean demoteWriteFile(String str, int i, byte[] bArr) {
        Throwable th;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a03ff6", new Object[]{str, new Integer(i), bArr})).booleanValue();
        }
        File createSDFile = FileUtil.createSDFile(str);
        FileOutputStream fileOutputStream2 = null;
        if (createSDFile != null) {
            try {
                fileOutputStream = new FileOutputStream(createSDFile);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ByteBuffer allocate = ByteBuffer.allocate(16);
                allocate.putInt(1);
                allocate.putInt(i);
                fileOutputStream.write(allocate.array(), 0, allocate.position());
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream2 = fileOutputStream;
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                try {
                    fileOutputStream2.close();
                } catch (Exception unused3) {
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (Exception unused4) {
                    return false;
                }
            }
        }
        try {
            fileOutputStream2.close();
            return true;
        } catch (Exception unused5) {
            return false;
        }
    }

    private void processError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97965f15", new Object[]{this, th});
            return;
        }
        TLog.loge(TAG, "init fail. e:" + th.toString() + " try delete file.");
        try {
            new File(this.mFilePath).delete();
        } catch (Exception unused) {
            TLog.loge(TAG, "delete fail.");
        }
        this.mInitState.compareAndSet(1, 0);
    }

    public void addInitListener(InitListener initListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dec1d2", new Object[]{this, initListener});
        } else {
            this.mInitListenerList.add(initListener);
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        for (BaseRunnable baseRunnable : this.mTasks) {
            baseRunnable.terminal();
        }
        this.mTasks.clear();
    }

    public int getInitState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d92c1a5", new Object[]{this})).intValue();
        }
        return this.mInitState.get();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.mInitState.compareAndSet(0, 1)) {
            BaseRunnable baseRunnable = new BaseRunnable() { // from class: com.taobao.message.kit.cache.KVDataStorage.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/kit/cache/KVDataStorage$1");
                }

                @Override // com.taobao.message.kit.threadpool.BaseRunnable
                public void execute() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                        return;
                    }
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        byte[] readFile = FileUtil.readFile(KVDataStorage.access$000(KVDataStorage.this));
                        if (readFile != null && readFile.length > 0) {
                            try {
                                ByteBuffer wrap = ByteBuffer.wrap(readFile);
                                wrap.getInt();
                                byte[] bArr = new byte[wrap.getInt()];
                                wrap.get(bArr);
                                String str = new String(bArr);
                                wrap.clear();
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                StorageDO storageDO = (StorageDO) JSON.parseObject(str, StorageDO.class);
                                if (storageDO != null) {
                                    KVDataStorage.access$202(KVDataStorage.this, storageDO.dataMap);
                                }
                                if (KVDataStorage.access$300(KVDataStorage.this).size() > 0) {
                                    for (InitListener initListener : KVDataStorage.access$300(KVDataStorage.this)) {
                                        initListener.init(KVDataStorage.access$200(KVDataStorage.this));
                                    }
                                }
                                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                TLog.loge(BaseRunnable.TAG, "read1|read byte file" + (elapsedRealtime2 - elapsedRealtime));
                                TLog.loge(BaseRunnable.TAG, "read1|json and process format:" + (elapsedRealtime3 - elapsedRealtime2));
                                AppMonitor.Counter.commit("MSGKVDataStore", "initTime", (double) (elapsedRealtime3 - elapsedRealtime));
                            } catch (OutOfMemoryError e) {
                                TLog.loge(BaseRunnable.TAG, "outOfMemoryError");
                                KVDataStorage.access$100(KVDataStorage.this, e);
                                return;
                            }
                        }
                        KVDataStorage.access$400(KVDataStorage.this).compareAndSet(1, 2);
                    } catch (Throwable th) {
                        KVDataStorage.access$100(KVDataStorage.this, th);
                    }
                }
            };
            this.mTasks.add(baseRunnable);
            Coordinator.doBackGroundTask(baseRunnable);
        } else {
            TLog.loge(TAG, "init fail. compareAndSet false");
        }
    }

    public boolean isInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        if (this.mInitState.get() == 1) {
            return true;
        }
        return false;
    }

    public boolean isWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b90266", new Object[]{this})).booleanValue();
        }
        if (this.mInitState.get() == 2) {
            return true;
        }
        return false;
    }

    public void put(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, obj});
            return;
        }
        BaseRunnable baseRunnable = new BaseRunnable() { // from class: com.taobao.message.kit.cache.KVDataStorage.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/kit/cache/KVDataStorage$2");
            }

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                Pair pair = new Pair(str, obj);
                try {
                    if (pair.second instanceof String) {
                        KVDataStorage.access$200(KVDataStorage.this).put(pair.first, (String) pair.second);
                    } else {
                        KVDataStorage.access$200(KVDataStorage.this).put(pair.first, JSON.toJSONString(pair.second, SerializerFeature.DisableCircularReferenceDetect));
                    }
                    KVDataStorage.access$500(KVDataStorage.this);
                } catch (OutOfMemoryError e) {
                    TLog.loge(BaseRunnable.TAG, "KVDataStorage store|" + e.toString());
                }
            }
        };
        this.mTasks.add(baseRunnable);
        Coordinator.doBackGroundSerialTask(baseRunnable);
    }

    public void removeInitListener(InitListener initListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4579094f", new Object[]{this, initListener});
        } else {
            this.mInitListenerList.remove(initListener);
        }
    }

    public boolean tryWaitInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("850ee78b", new Object[]{this})).booleanValue() : tryWaitInit(100L);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class StorageDO implements Serializable {
        private static final long serialVersionUID = 1;
        public Map<String, String> dataMap;
        public int versation = 1;

        static {
            t2o.a(529530934);
        }

        public StorageDO() {
        }

        public StorageDO(Map<String, String> map) {
            this.dataMap = map;
        }
    }

    public boolean tryWaitInit(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cce8021", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (!isInit()) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        do {
            Thread.yield();
            if (!isInit()) {
                TLog.loge(TAG, "wait time: " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                return true;
            }
        } while (Math.abs(SystemClock.elapsedRealtime() - elapsedRealtime) < j);
        TLog.loge(TAG, "tryWaitInit timeout.");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void store() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.kit.cache.KVDataStorage.store():void");
    }
}
