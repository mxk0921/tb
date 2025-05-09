package com.alibaba.security.realidentity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "LocalBroadcastManager";
    public static final boolean g = false;
    public static final int h = 1;
    public static final Object i = new Object();
    public static h j;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2724a;
    public final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap<>();
    public final HashMap<String, ArrayList<b>> c = new HashMap<>();
    public final ArrayList<a> d = new ArrayList<>();
    public final c e = new c(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f2725a;
        public final ArrayList<b> b;

        public a(Intent intent, ArrayList<b> arrayList) {
            this.f2725a = intent;
            this.b = arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f2726a;
        public final BroadcastReceiver b;
        public boolean c;

        public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f2726a = intentFilter;
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
            sb.append(this.f2726a);
            sb.append("}");
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final h f2727a;

        public c(h hVar) {
            super(Looper.getMainLooper());
            this.f2727a = hVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 72182663) {
                super.dispatchMessage((Message) objArr[0]);
                return null;
            } else if (hashCode == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/security/realidentity/h$c");
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                return;
            }
            super.dispatchMessage(message);
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                h.a(this.f2727a);
            }
        }
    }

    public h(Context context) {
        this.f2724a = context;
    }

    public static /* synthetic */ void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4376d16", new Object[]{hVar});
        } else {
            hVar.b();
        }
    }

    public void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
        } else if (a(intent)) {
            b();
        }
    }

    public static h a(Context context) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("86ad420e", new Object[]{context});
        }
        synchronized (i) {
            try {
                if (j == null) {
                    j = new h(context.getApplicationContext());
                }
                hVar = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    private void b() {
        int size;
        a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        while (true) {
            synchronized (this.b) {
                try {
                    size = this.d.size();
                    if (size > 0) {
                        aVarArr = new a[size];
                        this.d.toArray(aVarArr);
                        this.d.clear();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = aVarArr[i2];
                for (int i3 = 0; i3 < aVar.b.size(); i3++) {
                    aVar.b.get(i3).b.onReceive(this.f2724a, aVar.f2725a);
                }
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be287d04", new Object[]{this, broadcastReceiver, intentFilter});
            return;
        }
        synchronized (this.b) {
            try {
                b bVar = new b(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList<b> arrayList2 = this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db70fdf", new Object[]{this, broadcastReceiver});
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<IntentFilter> remove = this.b.remove(broadcastReceiver);
                if (remove != null) {
                    for (int i2 = 0; i2 < remove.size(); i2++) {
                        IntentFilter intentFilter = remove.get(i2);
                        for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                            String action = intentFilter.getAction(i3);
                            ArrayList<b> arrayList = this.c.get(action);
                            if (arrayList != null) {
                                int i4 = 0;
                                while (i4 < arrayList.size()) {
                                    if (arrayList.get(i4).b == broadcastReceiver) {
                                        arrayList.remove(i4);
                                        i4--;
                                    }
                                    i4++;
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

    public boolean a(Intent intent) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2724a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    com.alibaba.security.realidentity.a.d(f, "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<b> arrayList = this.c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        com.alibaba.security.realidentity.a.d(f, "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        b bVar = arrayList.get(i3);
                        if (z) {
                            com.alibaba.security.realidentity.a.d(f, "Matching against filter " + bVar.f2726a);
                        }
                        if (bVar.c) {
                            if (z) {
                                com.alibaba.security.realidentity.a.d(f, "  Filter's target already added");
                            }
                            i2 = i3;
                            scheme = scheme;
                        } else {
                            i2 = i3;
                            scheme = scheme;
                            int match = bVar.f2726a.match(action, resolveTypeIfNeeded, scheme, data, categories, f);
                            if (match >= 0) {
                                if (z) {
                                    com.alibaba.security.realidentity.a.d(f, "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.c = true;
                            }
                        }
                        i3 = i2 + 1;
                    }
                    if (arrayList2 != null) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            ((b) arrayList2.get(i4)).c = false;
                        }
                        this.d.add(new a(intent, arrayList2));
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

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            j = null;
        }
    }
}
