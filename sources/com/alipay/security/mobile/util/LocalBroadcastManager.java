package com.alipay.security.mobile.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LocalBroadcastManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    public static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final Context mAppContext;
    private final Handler mHandler;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers = new HashMap<>();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap<>();
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class BroadcastRecord {
        public final Intent intent;
        public final ArrayList<ReceiverRecord> receivers;

        public BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ReceiverRecord {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean broadcasting;
        public final IntentFilter filter;
        public final BroadcastReceiver receiver;

        public ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            sb.append("}");
            return sb.toString();
        }
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) { // from class: com.alipay.security.mobile.util.LocalBroadcastManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/security/mobile/util/LocalBroadcastManager$1");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.access$000(LocalBroadcastManager.this);
                }
            }
        };
    }

    public static /* synthetic */ void access$000(LocalBroadcastManager localBroadcastManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3af02b", new Object[]{localBroadcastManager});
        } else {
            localBroadcastManager.executePendingBroadcasts();
        }
    }

    private void executePendingBroadcasts() {
        int size;
        BroadcastRecord[] broadcastRecordArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc6c05b", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this.mReceivers) {
                try {
                    size = this.mPendingBroadcasts.size();
                    if (size > 0) {
                        broadcastRecordArr = new BroadcastRecord[size];
                        this.mPendingBroadcasts.toArray(broadcastRecordArr);
                        this.mPendingBroadcasts.clear();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                BroadcastRecord broadcastRecord = broadcastRecordArr[i];
                for (int i2 = 0; i2 < broadcastRecord.receivers.size(); i2++) {
                    broadcastRecord.receivers.get(i2).receiver.onReceive(this.mAppContext, broadcastRecord.intent);
                }
            }
        }
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalBroadcastManager) ipChange.ipc$dispatch("d34ff8e8", new Object[]{context});
        }
        synchronized (mLock) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = mInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef98653", new Object[]{this, broadcastReceiver, intentFilter});
            return;
        }
        synchronized (this.mReceivers) {
            try {
                ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.mReceivers.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.mReceivers.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<ReceiverRecord> arrayList2 = this.mActions.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.mActions.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendBroadcastSync(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b24ad98", new Object[]{this, intent});
        } else if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdcb6b5", new Object[]{this, broadcastReceiver});
            return;
        }
        synchronized (this.mReceivers) {
            try {
                ArrayList<IntentFilter> remove = this.mReceivers.remove(broadcastReceiver);
                if (remove != null) {
                    for (int i = 0; i < remove.size(); i++) {
                        IntentFilter intentFilter = remove.get(i);
                        for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                            String action = intentFilter.getAction(i2);
                            ArrayList<ReceiverRecord> arrayList = this.mActions.get(action);
                            if (arrayList != null) {
                                int i3 = 0;
                                while (i3 < arrayList.size()) {
                                    if (arrayList.get(i3).receiver == broadcastReceiver) {
                                        arrayList.remove(i3);
                                        i3--;
                                    }
                                    i3++;
                                }
                                if (arrayList.size() <= 0) {
                                    this.mActions.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendBroadcast(Intent intent) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("798729e1", new Object[]{this, intent})).booleanValue();
        }
        synchronized (this.mReceivers) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                ArrayList<ReceiverRecord> arrayList = this.mActions.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    for (int i2 = 0; i2 < arrayList.size(); i2 = i + 1) {
                        ReceiverRecord receiverRecord = arrayList.get(i2);
                        if (receiverRecord.broadcasting) {
                            i = i2;
                            arrayList2 = arrayList2;
                            arrayList = arrayList;
                        } else {
                            i = i2;
                            arrayList2 = arrayList2;
                            arrayList = arrayList;
                            int match = receiverRecord.filter.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                                arrayList2.add(receiverRecord);
                                receiverRecord.broadcasting = true;
                            } else if (z) {
                                if (match == -4) {
                                    str = "category";
                                } else if (match == -3) {
                                    str = "action";
                                } else if (match == -2) {
                                    str = "data";
                                } else if (match != -1) {
                                    str = "unknown reason";
                                } else {
                                    str = "type";
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("  Filter did not match: ");
                                sb.append(str);
                            }
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((ReceiverRecord) arrayList2.get(i3)).broadcasting = false;
                        }
                        this.mPendingBroadcasts.add(new BroadcastRecord(intent, arrayList2));
                        if (!this.mHandler.hasMessages(1)) {
                            this.mHandler.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
