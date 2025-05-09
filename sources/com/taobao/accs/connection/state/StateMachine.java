package com.taobao.accs.connection.state;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class StateMachine {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long c = 0;

    /* renamed from: a  reason: collision with root package name */
    public volatile a f6041a;
    public final Object b = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Event implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int eventId;
        private final long happenedTimeInMill = SystemClock.elapsedRealtime();

        static {
            t2o.a(343933073);
        }

        private Event(int i) {
            this.eventId = i;
        }

        public static Event obtain(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event) ipChange.ipc$dispatch("31fd30b7", new Object[]{new Integer(i)});
            }
            return new Event(i);
        }

        public int getEventId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
            }
            return this.eventId;
        }

        public long getHappenedTimeInMill() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7973d620", new Object[]{this})).longValue();
            }
            return this.happenedTimeInMill;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343933074);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccc95f5f", new Object[]{this});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            }
        }

        public abstract int c();

        public abstract void d(Event event);
    }

    static {
        t2o.a(343933072);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2dab72", new Object[]{this, aVar});
            return;
        }
        b(aVar);
        this.f6041a = aVar;
    }

    public final void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cee1f05", new Object[]{this, aVar});
        } else if (aVar == null) {
            throw new NullPointerException("StateMachine's state = null");
        }
    }

    public int d() {
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ebbd69c", new Object[]{this})).intValue();
        }
        synchronized (this.b) {
            c2 = this.f6041a.c();
        }
        return c2;
    }

    public final void c(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7862ee", new Object[]{this, event});
        } else if (c <= 0 || event.getHappenedTimeInMill() >= c) {
            c = event.getHappenedTimeInMill();
            e(event);
        } else {
            ALog.e("StateMachine", "event expired", "eventId", Integer.valueOf(event.getEventId()));
        }
    }

    public void e(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcffb7e", new Object[]{this, event});
            return;
        }
        ALog.e("StateMachine", "processEvent", "eventId", Integer.valueOf(event.getEventId()), "stateId", Integer.valueOf(this.f6041a.c()));
        this.f6041a.d(event);
    }

    public void f(a aVar) {
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1162c882", new Object[]{this, aVar});
            return;
        }
        b(aVar);
        synchronized (this.b) {
            aVar2 = this.f6041a;
            this.f6041a = aVar;
        }
        ALog.e("StateMachine", "transitionTo", "old_state", Integer.valueOf(aVar2.c()), "new_state", Integer.valueOf(this.f6041a.c()));
        if (aVar2.c() != this.f6041a.c()) {
            this.f6041a.a();
            aVar2.b();
        }
    }
}
