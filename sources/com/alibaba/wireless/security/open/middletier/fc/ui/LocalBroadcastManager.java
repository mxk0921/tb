package com.alibaba.wireless.security.open.middletier.fc.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.alibaba.security.realidentity.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocalBroadcastManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object f = new Object();
    private static LocalBroadcastManager g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3468a;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap<>();
    private final HashMap<String, ArrayList<ReceiverRecord>> c = new HashMap<>();
    private final ArrayList<BroadcastRecord> d = new ArrayList<>();
    private final Handler e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class BroadcastRecord {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f3470a;
        public final ArrayList<ReceiverRecord> b;

        static {
            t2o.a(659554418);
        }

        public BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.f3470a = intent;
            this.b = arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ReceiverRecord {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f3471a;
        public final BroadcastReceiver b;
        public boolean c;

        static {
            t2o.a(659554419);
        }

        public ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3471a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.f3471a);
            sb.append("}");
            return sb.toString();
        }
    }

    static {
        t2o.a(659554416);
    }

    private LocalBroadcastManager(Context context) {
        this.f3468a = context;
        this.e = new Handler(context.getMainLooper()) { // from class: com.alibaba.wireless.security.open.middletier.fc.ui.LocalBroadcastManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/ui/LocalBroadcastManager$1");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.a(LocalBroadcastManager.this);
                }
            }
        };
    }

    private void a() {
        int size;
        BroadcastRecord[] broadcastRecordArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this.b) {
                try {
                    size = this.d.size();
                    if (size > 0) {
                        broadcastRecordArr = new BroadcastRecord[size];
                        this.d.toArray(broadcastRecordArr);
                        this.d.clear();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                BroadcastRecord broadcastRecord = broadcastRecordArr[i];
                for (int i2 = 0; i2 < broadcastRecord.b.size(); i2++) {
                    broadcastRecord.b.get(i2).b.onReceive(this.f3468a, broadcastRecord.f3470a);
                }
            }
        }
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalBroadcastManager) ipChange.ipc$dispatch("7829e46b", new Object[]{context});
        }
        synchronized (f) {
            try {
                if (g == null) {
                    g = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public boolean sendBroadcast(Intent intent) {
        boolean z;
        ArrayList<ReceiverRecord> arrayList;
        int i;
        ArrayList arrayList2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("798729e1", new Object[]{this, intent})).booleanValue();
        }
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f3468a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    intent.toString();
                }
                ArrayList<ReceiverRecord> arrayList3 = this.c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z) {
                        arrayList3.toString();
                    }
                    ArrayList arrayList4 = null;
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        ReceiverRecord receiverRecord = arrayList3.get(i2);
                        if (z) {
                            Objects.toString(receiverRecord.f3471a);
                        }
                        if (receiverRecord.c) {
                            i = i2;
                            arrayList2 = arrayList4;
                            arrayList = arrayList3;
                        } else {
                            i = i2;
                            arrayList2 = arrayList4;
                            arrayList = arrayList3;
                            int match = receiverRecord.f3471a.match(action, resolveTypeIfNeeded, scheme, data, categories, h.f);
                            if (match >= 0) {
                                if (z) {
                                    Integer.toHexString(match);
                                }
                                if (arrayList2 == null) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList2;
                                }
                                arrayList4.add(receiverRecord);
                                receiverRecord.c = true;
                                i2 = i + 1;
                                arrayList3 = arrayList;
                            }
                        }
                        arrayList4 = arrayList2;
                        i2 = i + 1;
                        arrayList3 = arrayList;
                    }
                    if (arrayList4 != null) {
                        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                            ((ReceiverRecord) arrayList4.get(i3)).c = false;
                        }
                        this.d.add(new BroadcastRecord(intent, arrayList4));
                        if (!this.e.hasMessages(1)) {
                            this.e.sendEmptyMessage(1);
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

    public void sendBroadcastSync(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b24ad98", new Object[]{this, intent});
        } else if (sendBroadcast(intent)) {
            a();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdcb6b5", new Object[]{this, broadcastReceiver});
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<IntentFilter> remove = this.b.remove(broadcastReceiver);
                if (remove != null) {
                    for (int i = 0; i < remove.size(); i++) {
                        IntentFilter intentFilter = remove.get(i);
                        for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                            String action = intentFilter.getAction(i2);
                            ArrayList<ReceiverRecord> arrayList = this.c.get(action);
                            if (arrayList != null) {
                                int i3 = 0;
                                while (i3 < arrayList.size()) {
                                    if (arrayList.get(i3).b == broadcastReceiver) {
                                        arrayList.remove(i3);
                                        i3--;
                                    }
                                    i3++;
                                }
                                if (arrayList.size() <= 0) {
                                    this.c.remove(action);
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

    public static /* synthetic */ void a(LocalBroadcastManager localBroadcastManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a45425d", new Object[]{localBroadcastManager});
        } else {
            localBroadcastManager.a();
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef98653", new Object[]{this, broadcastReceiver, intentFilter});
            return;
        }
        synchronized (this.b) {
            try {
                ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<ReceiverRecord> arrayList2 = this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
