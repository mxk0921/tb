package com.tmall.android.dai.internal.streamprocessing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.n3v;
import tb.oeh;
import tb.p3v;
import tb.t2o;
import tb.v0v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WalleUtTrackerListener extends n3v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String LISTENER_NAME = "WalleUtTrackerListener";
    public static final String TAG = "[StreamProcessing]";
    public static final Set<String> e = new HashSet<String>() { // from class: com.tmall.android.dai.internal.streamprocessing.WalleUtTrackerListener.1
        {
            add("2001");
            add("2101");
            add("2201");
            add("2601");
            add("1010");
            add("1023");
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final WalleUtTrackerListener f14214a = new WalleUtTrackerListener();

        static {
            t2o.a(1034944665);
        }

        public static /* synthetic */ WalleUtTrackerListener a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WalleUtTrackerListener) ipChange.ipc$dispatch("17c054da", new Object[0]);
            }
            return f14214a;
        }
    }

    static {
        t2o.a(1034944663);
    }

    public static WalleUtTrackerListener a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WalleUtTrackerListener) ipChange.ipc$dispatch("dde466df", new Object[0]);
        }
        return a.a();
    }

    public static /* synthetic */ Object ipc$super(WalleUtTrackerListener walleUtTrackerListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/streamprocessing/WalleUtTrackerListener");
    }

    public final boolean b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2093e748", new Object[]{this, map})).booleanValue();
        }
        if (((HashSet) e).contains(map.get(oeh.EVENTID))) {
            return true;
        }
        return false;
    }

    @Override // tb.n3v
    public void beginEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
        } else if (v0vVar != null) {
            WalleStreamSource.getInstance().beginEvent(v0vVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966c3ef0", new Object[]{this});
        } else {
            p3v.getInstance().registerListener(a());
        }
    }

    @Override // tb.n3v
    public void endEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
        } else if (v0vVar != null) {
            WalleStreamSource.getInstance().endEvent(v0vVar);
        }
    }

    @Override // tb.n3v
    public void send(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
        } else {
            sendEvent(map);
        }
    }

    @Override // tb.n3v
    public void sendEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602af6ec", new Object[]{this, map});
        } else if (b(map)) {
            WalleStreamSource.getInstance().sendEventMap(map);
        }
    }

    @Override // tb.n3v
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
        }
        return LISTENER_NAME;
    }

    @Override // tb.n3v
    public void updateEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
        } else if (v0vVar != null) {
            WalleStreamSource.getInstance().updateEvent(v0vVar);
        }
    }

    @Override // tb.n3v
    public void updateEventPageName(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
        } else if (v0vVar != null) {
            WalleStreamSource.getInstance().updateEventPageName(v0vVar);
        }
    }
}
