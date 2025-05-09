package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ac;
import com.xiaomi.push.bj;
import com.xiaomi.push.ih;
import com.xiaomi.push.ii;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class az {

    /* renamed from: a  reason: collision with root package name */
    private static volatile az f15060a;

    /* renamed from: a  reason: collision with other field name */
    protected SharedPreferences f1572a;

    /* renamed from: a  reason: collision with other field name */
    private HashSet<a> f1573a = new HashSet<>();
    protected SharedPreferences b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class a implements Runnable {
        private String mDescription;
        private int mId;

        public a(int i, String str) {
            this.mId = i;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || this.mId != ((a) obj).mId) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.mId;
        }

        public abstract void onCallback();

        @Override // java.lang.Runnable
        public final void run() {
            onCallback();
        }
    }

    private az(Context context) {
        this.f1572a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    public int a(int i, int i2) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getInt(a2, 0) : this.f1572a.contains(a2) ? this.f1572a.getInt(a2, 0) : i2;
        } catch (Exception e) {
            b.m410a(i + " oc int error " + e);
            return i2;
        }
    }

    public void b() {
        b.c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f1573a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    public int a(ii iiVar, int i) {
        try {
            return this.f1572a.getInt(a(iiVar), i);
        } catch (Exception e) {
            b.m410a(iiVar + " version error " + e);
            return i;
        }
    }

    public long a(int i, long j) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getLong(a2, 0L) : this.f1572a.contains(a2) ? this.f1572a.getLong(a2, 0L) : j;
        } catch (Exception e) {
            b.m410a(i + " oc long error " + e);
            return j;
        }
    }

    public static az a(Context context) {
        if (f15060a == null) {
            synchronized (az.class) {
                try {
                    if (f15060a == null) {
                        f15060a = new az(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15060a;
    }

    private String a(int i) {
        return "oc_" + i;
    }

    public String a(int i, String str) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getString(a2, null) : this.f1572a.contains(a2) ? this.f1572a.getString(a2, null) : str;
        } catch (Exception e) {
            b.m410a(i + " oc string error " + e);
            return str;
        }
    }

    private String a(ii iiVar) {
        return "oc_version_" + iiVar.a();
    }

    public synchronized void a() {
        this.f1573a.clear();
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (str.equals(a(ih.AppIsInstalledList.a()))) {
                str2 = bj.a(str2);
            }
            editor.putString(str, str2);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public synchronized void a(a aVar) {
        if (!this.f1573a.contains(aVar)) {
            this.f1573a.add(aVar);
        }
    }

    public void a(List<Pair<Integer, Object>> list) {
        if (!ac.a(list)) {
            SharedPreferences.Editor edit = this.b.edit();
            for (Pair<Integer, Object> pair : list) {
                Object obj = pair.first;
                if (obj != null) {
                    String a2 = a(((Integer) obj).intValue());
                    if (pair.second == null) {
                        edit.remove(a2);
                    } else {
                        a(edit, pair, a2);
                    }
                }
            }
            edit.apply();
        }
    }

    public void a(List<Pair<ii, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (ac.a(list) || ac.a(list2)) {
            b.m410a("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor edit = this.f1572a.edit();
        edit.clear();
        for (Pair<ii, Integer> pair : list) {
            Object obj = pair.first;
            if (!(obj == null || pair.second == null)) {
                edit.putInt(a((ii) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (!(obj2 == null || pair2.second == null)) {
                a(edit, pair2, a(((Integer) obj2).intValue()));
            }
        }
        edit.apply();
    }

    public boolean a(int i, boolean z) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getBoolean(a2, false) : this.f1572a.contains(a2) ? this.f1572a.getBoolean(a2, false) : z;
        } catch (Exception e) {
            b.m410a(i + " oc boolean error " + e);
            return z;
        }
    }
}
