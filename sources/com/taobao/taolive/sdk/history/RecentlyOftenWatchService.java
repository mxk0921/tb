package com.taobao.taolive.sdk.history;

import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.cir;
import tb.nwg;
import tb.t2o;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RecentlyOftenWatchService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = RecentlyOftenWatchService.class.getSimpleName();
    public static RecentlyOftenWatchService c;

    /* renamed from: a  reason: collision with root package name */
    public Data f13285a = null;
    public final String b = Login.getUserId();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Data implements Serializable {
        public List<DayItem> data;

        static {
            t2o.a(779093452);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class DayItem implements Serializable {
        public Map<String, Long> day;
        public Long timestamp;

        static {
            t2o.a(779093453);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(Data data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5ed2811", new Object[]{this, data});
            } else {
                RecentlyOftenWatchService.a(RecentlyOftenWatchService.this, data);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Comparator<Map.Entry<K, V>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue();
            }
            return -((Comparable) entry.getValue()).compareTo(entry2.getValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends AsyncTask<Object, Void, Data> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a f13287a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public interface a {
        }

        static {
            t2o.a(779093449);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/history/RecentlyOftenWatchService$AsyncReadDataTask");
        }

        /* renamed from: b */
        public void onPostExecute(Data data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31b009f6", new Object[]{this, data});
                return;
            }
            a aVar = this.f13287a;
            if (aVar != null) {
                ((a) aVar).a(data);
            }
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        /* renamed from: a */
        public Data doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Data) ipChange.ipc$dispatch("43113acf", new Object[]{this, objArr});
            }
            if (objArr.length >= 1) {
                try {
                    Object obj = objArr[0];
                    String str = (String) nwg.b("live_recently_often_watch" + obj);
                    if (!zqq.a(str)) {
                        return (Data) JSON.parseObject(str, Data.class);
                    }
                    return null;
                } catch (Exception e) {
                    cir.b(RecentlyOftenWatchService.TAG, "AsyncReadDataTask doInBackground exp.", e);
                }
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d extends AsyncTask<Object, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779093451);
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/history/RecentlyOftenWatchService$AsyncSaveJsonStrTask");
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        /* renamed from: a */
        public Void doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6d120651", new Object[]{this, objArr});
            }
            if (objArr.length < 2) {
                return null;
            }
            try {
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                String jSONString = JSON.toJSONString(obj);
                if (zqq.a(jSONString)) {
                    return null;
                }
                nwg.d("live_recently_often_watch" + obj2, jSONString);
                return null;
            } catch (Throwable th) {
                cir.b(RecentlyOftenWatchService.TAG, "AsyncSaveJsonStrTask doInBackground exp.", th);
                return null;
            }
        }
    }

    static {
        t2o.a(779093446);
    }

    public static /* synthetic */ Data a(RecentlyOftenWatchService recentlyOftenWatchService, Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("c805566d", new Object[]{recentlyOftenWatchService, data});
        }
        recentlyOftenWatchService.f13285a = data;
        return data;
    }

    public static RecentlyOftenWatchService d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecentlyOftenWatchService) ipChange.ipc$dispatch("a8bbb13", new Object[0]);
        }
        if (c == null) {
            c = new RecentlyOftenWatchService();
        }
        return c;
    }

    public static long e(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35b4f8c2", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).longValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3, 0, 0, 0);
        instance.setLenient(true);
        return instance.getTimeInMillis();
    }

    public static boolean f(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1198d4f8", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        if ((j2 - j) / h() >= 1) {
            return true;
        }
        return false;
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6dfbbb7", new Object[0])).longValue();
        }
        return 86400000L;
    }

    public static <K, V extends Comparable<? super V>> List<Map.Entry<K, V>> l(Map<K, V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a5841895", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new b());
        return arrayList;
    }

    public DayItem b() {
        List<DayItem> list;
        DayItem dayItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DayItem) ipChange.ipc$dispatch("9bd2fea1", new Object[]{this});
        }
        long c2 = c();
        Data data = this.f13285a;
        if (data == null || (list = data.data) == null) {
            return null;
        }
        if (!list.isEmpty()) {
            if (f(this.f13285a.data.get(0).timestamp.longValue(), c2)) {
                dayItem = new DayItem();
                dayItem.timestamp = Long.valueOf(c2);
                dayItem.day = new HashMap();
                this.f13285a.data.add(0, dayItem);
            } else {
                dayItem = this.f13285a.data.get(0);
            }
            j(c2);
            return dayItem;
        }
        DayItem dayItem2 = new DayItem();
        dayItem2.timestamp = Long.valueOf(c2);
        dayItem2.day = new HashMap();
        this.f13285a.data.add(0, dayItem2);
        return dayItem2;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("592bf7f", new Object[]{this})).longValue();
        }
        Calendar instance = Calendar.getInstance();
        return e(instance.get(1), instance.get(2), instance.get(5));
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
            return;
        }
        c cVar = new c(null);
        cVar.f13287a = new a();
        cVar.execute(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ab81f9", new Object[]{this, str, new Long(j)});
            return;
        }
        if (this.f13285a == null) {
            this.f13285a = new Data();
        }
        Data data = this.f13285a;
        if (data.data == null) {
            data.data = new ArrayList();
        }
        DayItem b2 = b();
        if (b2 != null && b2.day.containsKey(str)) {
            Long l = b2.day.get(str);
            if (l != null) {
                b2.day.put(str, Long.valueOf(l.longValue() + j));
            } else {
                b2.day.put(str, Long.valueOf(j));
            }
        } else if (b2 != null) {
            b2.day.put(str, Long.valueOf(j));
        }
        if (b2 != null) {
            List l2 = l(b2.day);
            if (l2.size() > 20) {
                List<Map.Entry> subList = l2.subList(0, 20);
                b2.day.clear();
                for (Map.Entry entry : subList) {
                    b2.day.put(entry.getKey(), entry.getValue());
                }
            }
        }
        k();
    }

    public final void j(long j) {
        List<DayItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9ba2", new Object[]{this, new Long(j)});
            return;
        }
        Data data = this.f13285a;
        if (data != null && (list = data.data) != null) {
            if (list.size() > 7) {
                this.f13285a.data.remove(7);
                return;
            }
            Iterator<DayItem> it = this.f13285a.data.iterator();
            while (it.hasNext()) {
                if ((j - it.next().timestamp.longValue()) / h() >= 7) {
                    it.remove();
                }
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69de89c", new Object[]{this});
        } else {
            new d(null).execute(this.f13285a, this.b);
        }
    }
}
