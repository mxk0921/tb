package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog;
import java.util.Calendar;
import java.util.Date;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class C0450a implements Comparable<C0450a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f8661a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        static {
            t2o.a(295699735);
        }

        public C0450a(long j) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(j));
            this.f8661a = instance.get(1);
            this.b = instance.get(2);
            this.c = instance.get(5);
            this.d = instance.get(11);
            this.e = instance.get(12);
            this.f = instance.get(13);
        }

        private long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("51dc4da9", new Object[]{this})).longValue();
            }
            Calendar instance = Calendar.getInstance();
            instance.set(this.f8661a, this.b, this.c, this.d, this.e, this.f);
            instance.setLenient(true);
            return instance.getTimeInMillis();
        }

        public static long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a6dfbbb7", new Object[0])).longValue();
            }
            return 86400000L;
        }

        /* renamed from: a */
        public int compareTo(C0450a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc43ce00", new Object[]{this, aVar})).intValue();
            }
            return Long.compare(d(), aVar.d());
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c216d2b9", new Object[]{this})).longValue();
            }
            Calendar instance = Calendar.getInstance();
            instance.set(this.f8661a, this.b, this.c, 0, 0, 0);
            instance.setLenient(true);
            return instance.getTimeInMillis();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f8661a + "-" + (this.b + 1) + "-" + this.c + " " + this.d + ":" + this.e + ":" + this.f;
        }
    }

    static {
        t2o.a(295699734);
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlanding/strategy/DayLog");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog
    public boolean d(SmartLandingTask.ShowStrategy showStrategy, MemoryLog.LogItem logItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24b36bc", new Object[]{this, showStrategy, logItem, new Long(j)})).booleanValue();
        }
        if (showStrategy == null || logItem == null || showStrategy.interval > (new C0450a(j).b() - new C0450a(logItem.interval).b()) / C0450a.e()) {
            return false;
        }
        return true;
    }
}
