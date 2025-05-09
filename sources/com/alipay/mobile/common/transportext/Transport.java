package com.alipay.mobile.common.transportext;

import android.content.Context;
import com.alipay.bifrost.AppLogicICallBackImpl;
import com.alipay.bifrost.Bifrost;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.bifrost.StnLogicICallBackImpl;
import com.alipay.mars.Mars;
import com.alipay.mars.app.AppLogic;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.amnet.Channel;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.alipay.mobile.common.transportext.amnet.Mercury;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.alipay.mobile.common.transportext.amnet.Notepad;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.atj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Transport {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Transport i;
    public static boolean j;
    public static final BitSet k = new BitSet();
    public Mercury h = null;

    /* renamed from: a  reason: collision with root package name */
    public final Result f4162a = new DftResult();
    public final Notepad b = new DftNotepad();
    public final Mercury c = new Messenger();
    public Alarm d = new DftAlarm();
    public final Bifrost e = Bifrost.instance();
    public boolean f = false;
    public int g = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Activating {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, String> cfgLongLink;
        public Map<String, String> cfgMultiplexLink;
        public Map<String, String> cfgShortLink;
        public Context context;
        public String domainLongLink;
        public String domainMultiplexLink;
        public String domainShortLink;
        public Map<String, Object> extParams;
        public boolean ground;
        public long id;
        public Linkage linkage;
        public boolean master;
        public String netMajor;
        public String netMinor;
        public boolean screen;
        public Map<Byte, Channel> service;
        public Storage storage;
        public AmnetSwitchManager swchmng;
        public boolean universal;
        public int targetType = 0;
        public boolean isReconnect = false;

        public void addExtParam(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b44c8dda", new Object[]{this, str, obj});
            } else if (str != null && str.trim().length() >= 1 && obj != null) {
                if (this.extParams == null) {
                    this.extParams = new HashMap(1);
                }
                this.extParams.put(str, obj);
            }
        }

        public boolean isTargetH2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9bdf3b90", new Object[]{this})).booleanValue();
            }
            if (this.targetType == 1) {
                return true;
            }
            return false;
        }

        public boolean isTargetMmtp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4df8722", new Object[]{this})).booleanValue();
            }
            if (this.targetType == 0) {
                return true;
            }
            return false;
        }

        public boolean isTargetMqtt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8b0d22a", new Object[]{this})).booleanValue();
            }
            if (this.targetType == 2) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Alarm {
        void handle(Throwable th);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Alerter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Alerting f4163a;
        private Result b;

        public Alerter(Alerting alerting, Result result) {
            this.f4163a = alerting;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f4163a == null) {
                this.b.notify(false);
            } else {
                Bifrost access$300 = Transport.access$300(Transport.this);
                Alerting alerting = this.f4163a;
                if (access$300.alert(alerting.id, alerting.receipt, alerting.duration)) {
                    this.b.notify(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Alerting {
        public long duration;
        public long id;
        public long receipt;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Alterer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Altering f4164a;
        private Result b;

        public Alterer(Altering altering, Result result) {
            this.f4164a = altering;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f4164a == null) {
                this.b.notify(false);
            } else {
                Bifrost access$300 = Transport.access$300(Transport.this);
                Altering altering = this.f4164a;
                if (access$300.alter(altering.id, altering.status, altering.infMajor, altering.infMinor, altering.extMap)) {
                    this.b.notify(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Altering {
        public Map<Byte, byte[]> extMap;
        public long id;
        public String infMajor;
        public String infMinor;
        public int status;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Asker implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Asking f4165a;
        private Result b;

        public Asker(Asking asking, Result result) {
            this.f4165a = asking;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f4165a == null) {
                this.b.notify(false);
            } else {
                this.f4165a.answer(Transport.access$300(Transport.this).query(this.f4165a.id));
                this.b.notify(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class Asking {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long id;

        public abstract void answer(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Detecter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Detecting f4166a;
        private Result b;

        public Detecter(Detecting detecting, Result result) {
            this.f4166a = detecting;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f4166a == null) {
                this.b.notify(false);
            } else {
                Bifrost access$300 = Transport.access$300(Transport.this);
                Detecting detecting = this.f4166a;
                if (access$300.launch(detecting.id, detecting.report)) {
                    this.b.notify(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Detecting {
        public long id;
        public NetTest report;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DftAlarm implements Alarm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DftAlarm() {
        }

        @Override // com.alipay.mobile.common.transportext.Transport.Alarm
        public void handle(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c32ca8a6", new Object[]{this, th});
            } else {
                LogCatUtil.error("-AMNET-MNG", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DftMercury implements Mercury {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean ret;

        public DftMercury() {
            this.ret = false;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void drive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae704911", new Object[]{this});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void post(Runnable runnable) {
            synchronized (this) {
                if (runnable != null) {
                    try {
                        if (runnable instanceof Logger) {
                            this.ret = true;
                        } else {
                            this.ret = false;
                        }
                        Field declaredField = runnable.getClass().getDeclaredField(atj.CALL_BACK);
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(runnable);
                        if (obj != null && (obj instanceof Result)) {
                            final Result result = (Result) obj;
                            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.Transport.DftMercury.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange = $ipChange;
                                    if (ipChange instanceof IpChange) {
                                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    LogCatUtil.debug("Transport", "DftMercury post, notify=" + DftMercury.this.ret + ",hash=" + hashCode());
                                    result.notify(DftMercury.this.ret);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DftNotepad implements Notepad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DftNotepad() {
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Notepad
        public void print(String str, String str2, String str3) {
            int i = 3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7290cb92", new Object[]{this, str, str2, str3});
                return;
            }
            if (str.compareTo("DEBUG") != 0) {
                if (str.compareTo("INFO") == 0) {
                    i = 4;
                } else if (str.compareTo("WARN") == 0) {
                    i = 5;
                } else if (str.compareTo("ERROR") == 0) {
                    i = 6;
                } else if (str.compareTo("FATAL") == 0) {
                    i = 7;
                } else {
                    i = 2;
                }
            }
            Bifrost.track(i, str2, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DftResult implements Result {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DftResult() {
        }

        @Override // com.alipay.mobile.common.transportext.Transport.Result
        public void notify(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Logger implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Notepad f4167a;
        private Result b;

        public Logger(Notepad notepad, Result result) {
            this.f4167a = notepad;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Messenger implements Mercury {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public LinkedList<Runnable> f4168a = new LinkedList<>();
        public LinkedList<Runnable> b = new LinkedList<>();

        public Messenger() {
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void drive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae704911", new Object[]{this});
                return;
            }
            LinkedList<Runnable> linkedList = this.b;
            synchronized (this) {
                this.b = this.f4168a;
                this.f4168a = linkedList;
            }
            while (!this.b.isEmpty()) {
                Runnable removeFirst = this.b.removeFirst();
                if (removeFirst != null) {
                    try {
                        removeFirst.run();
                    } finally {
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Mercury
        public void post(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
                return;
            }
            synchronized (this) {
                this.f4168a.addLast(runnable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Poster implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Posting f4169a;
        private Result b;
        private long c;

        public Poster(Posting posting, Result result, long j) {
            this.f4169a = posting;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f4169a == null) {
                this.b.notify(false);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.c;
                Notepad access$100 = Transport.access$100(Transport.this);
                access$100.print("INFO", "-AMNET-DATA", "Poster run, rpcid=" + this.f4169a.receipt + ", using time=" + currentTimeMillis);
                Bifrost access$300 = Transport.access$300(Transport.this);
                Posting posting = this.f4169a;
                if (access$300.post(posting.id, posting.stamp, posting.receipt, posting.important, posting.secret, posting.nearing, posting.shortcut, posting.nolong, posting.shortLinkIPList, posting.channel, posting.fwdip, posting.traceid, posting.header, posting.body, posting.params, currentTimeMillis, this.c, posting.multiplex, posting.isUrgent)) {
                    this.b.notify(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Posting {
        public byte[] body;
        public byte channel;
        public String fwdip;
        public Map<String, String> header;
        public long id;
        public boolean important;
        public boolean isUrgent;
        public boolean nearing;
        public boolean nolong;
        public Map<String, String> params;
        public long receipt;
        public boolean secret;
        public String shortLinkIPList;
        public boolean shortcut;
        public String traceid;
        public boolean multiplex = false;
        public long stamp = System.nanoTime();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class PreConnecter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f4170a;
        private String b;
        private int c;
        private boolean d;
        private int e;
        private Result f;

        public PreConnecter(long j, String str, int i, boolean z, int i2, Result result) {
            this.f4170a = j;
            this.b = str;
            this.c = i;
            this.d = z;
            this.e = i2;
            this.f = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Transport.access$300(Transport.this).preConnect(this.f4170a, this.b, this.c, this.d, this.e);
            this.f.notify(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Result {
        void notify(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Stopper implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f4172a;
        private Result b;

        public Stopper(long j, Result result) {
            this.f4172a = j;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Transport.access$100(Transport.this).print("INFO", "MNET", "stop active");
            Transport.access$700(Transport.this, this.f4172a);
            this.b.notify(true);
        }
    }

    public static /* synthetic */ Result access$000(Transport transport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("41d31a1a", new Object[]{transport});
        }
        return transport.f4162a;
    }

    public static /* synthetic */ Notepad access$100(Transport transport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notepad) ipChange.ipc$dispatch("42a7f720", new Object[]{transport});
        }
        return transport.b;
    }

    public static /* synthetic */ boolean access$200(Transport transport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbe8bcc", new Object[]{transport})).booleanValue();
        }
        return transport.f;
    }

    public static /* synthetic */ boolean access$202(Transport transport, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debc4a92", new Object[]{transport, new Boolean(z)})).booleanValue();
        }
        transport.f = z;
        return z;
    }

    public static /* synthetic */ Bifrost access$300(Transport transport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bifrost) ipChange.ipc$dispatch("d32fa1ea", new Object[]{transport});
        }
        return transport.e;
    }

    public static /* synthetic */ int access$400(Transport transport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee2b3179", new Object[]{transport})).intValue();
        }
        return transport.g;
    }

    public static /* synthetic */ int access$402(Transport transport, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29e41cb2", new Object[]{transport, new Integer(i2)})).intValue();
        }
        transport.g = i2;
        return i2;
    }

    public static /* synthetic */ boolean access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue();
        }
        return j;
    }

    public static /* synthetic */ boolean access$502(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb2bda", new Object[]{new Boolean(z)})).booleanValue();
        }
        j = z;
        return z;
    }

    public static /* synthetic */ BitSet access$600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitSet) ipChange.ipc$dispatch("344e1dd3", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ void access$700(Transport transport, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f79101", new Object[]{transport, new Long(j2)});
        } else {
            transport.d(j2);
        }
    }

    public static /* synthetic */ Transport access$800() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("ff5c2a90", new Object[0]);
        }
        return i;
    }

    public static /* synthetic */ Alarm access$900(Transport transport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Alarm) ipChange.ipc$dispatch("b62e78c5", new Object[]{transport});
        }
        return transport.d;
    }

    public static synchronized void c() {
        synchronized (Transport.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("257e375", new Object[0]);
                return;
            }
            if (i == null) {
                i = new Transport();
            }
        }
    }

    public static final Transport instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("aa281ad", new Object[0]);
        }
        if (i == null) {
            c();
        }
        return i;
    }

    private native void nop();

    public final Mercury a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mercury) ipChange.ipc$dispatch("ab60c160", new Object[]{this});
        }
        Mercury mercury = this.h;
        if (mercury == null) {
            return new DftMercury();
        }
        if (mercury instanceof DftMercury) {
            LogCatUtil.debug("Transport", "diverterHandler instanceof DftMercury,hash=" + this.h.hashCode());
            if (this.e.isHasInitBifrost()) {
                this.h = this.e.getHandler();
                LogCatUtil.debug("Transport", "diverterHandler hash=" + this.h.hashCode());
            }
        }
        return this.h;
    }

    public void activate(Activating activating, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da90e63", new Object[]{this, activating, result});
        } else if (activating != null) {
            b(activating.universal).post(new Starter(activating, result));
        } else {
            a().post(new Starter(activating, result));
        }
    }

    public void alert(Alerting alerting, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e178b776", new Object[]{this, alerting, result});
        } else {
            a().post(new Alerter(alerting, result));
        }
    }

    public void alter(Altering altering, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8f5bea", new Object[]{this, altering, result});
        } else {
            a().post(new Alterer(altering, result));
        }
    }

    public void ask(Asking asking, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c86b9f0", new Object[]{this, asking, result});
        } else {
            a().post(new Asker(asking, result));
        }
    }

    public final Mercury b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mercury) ipChange.ipc$dispatch("120d695e", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.e.bifrostInit();
            this.h = this.e.getHandler();
        } else {
            this.h = this.c;
        }
        if (this.h == null) {
            LogCatUtil.warn("Transport", "getHandler,diverterHandler is null");
            this.h = new DftMercury();
        }
        return this.h;
    }

    public native void connect();

    public final void d(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e954f5da", new Object[]{this, new Long(j2)});
            return;
        }
        this.e.inactivate(j2);
        this.f = false;
        this.g = 0;
    }

    public void detect(Detecting detecting, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c796eca", new Object[]{this, detecting, result});
        } else {
            a().post(new Detecter(detecting, result));
        }
    }

    public void inactivate(long j2, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb297bd3", new Object[]{this, new Long(j2), result});
        } else {
            a().post(new Stopper(j2, result));
        }
    }

    public void post(Posting posting, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff5eeea", new Object[]{this, posting, result});
        } else {
            a().post(new Poster(posting, result, System.currentTimeMillis()));
        }
    }

    public void preConnect(long j2, String str, int i2, boolean z, int i3, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d91e5c0", new Object[]{this, new Long(j2), str, new Integer(i2), new Boolean(z), new Integer(i3), result});
        } else {
            a().post(new PreConnecter(j2, str, i2, z, i3, result));
        }
    }

    public native void record(int i2, String str, String str2);

    public void register(Alarm alarm) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e0a54a", new Object[]{this, alarm});
        } else if (alarm != null) {
            synchronized (i) {
                this.d = alarm;
            }
        }
    }

    public native void remind();

    public final void routine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c6e34b", new Object[]{this});
        } else {
            this.c.drive();
        }
    }

    public final void track(int i2, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34acf585", new Object[]{this, new Integer(i2), str, str2});
            return;
        }
        if (i2 == 3) {
            str3 = "DEBUG";
        } else if (i2 == 4) {
            str3 = "INFO";
        } else if (i2 == 5) {
            str3 = "WARN";
        } else if (i2 == 6) {
            str3 = "ERROR";
        } else if (i2 == 7) {
            str3 = "FATAL";
        } else {
            str3 = "VERBOSE";
        }
        this.b.print(str3, str, str2);
    }

    public void transportNop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca29206d", new Object[]{this});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Starter implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Activating f4171a;
        private Result b;
        private int c;

        public Starter(Activating activating, Result result) {
            this.f4171a = activating;
            this.b = result == null ? Transport.access$000(Transport.this) : result;
            this.c = 0;
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (Transport.access$500()) {
                return true;
            }
            for (int i = 0; i < 3; i++) {
                try {
                    if (!Transport.access$600().get(2)) {
                        AppLogicICallBackImpl.getInstance().register(this.f4171a.context);
                        Transport.access$600().set(2);
                    }
                    if (!Transport.access$600().get(3)) {
                        AppLogic.setCallBack(AppLogicICallBackImpl.getInstance());
                        StnLogic.setCallBack(StnLogicICallBackImpl.getInstance());
                        Transport.access$600().set(3);
                    }
                    if (!Transport.access$600().get(4)) {
                        Mars.init(this.f4171a.context, null);
                        Transport.access$600().set(4);
                    }
                    if (!Transport.access$600().get(5)) {
                        Mars.onCreate(true);
                        Transport.access$600().set(5);
                    }
                    Transport.access$502(true);
                    return true;
                } catch (Throwable th) {
                    LogCatUtil.error("MNET", "initMars exception, i:" + i, th);
                    if (i < 3) {
                        try {
                            Thread.sleep(20L);
                        } catch (Throwable th2) {
                            LogCatUtil.error("MNET", th2);
                        }
                    }
                }
            }
            return false;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!this.f4171a.isReconnect && Transport.access$200(Transport.this)) {
                Activating activating = this.f4171a;
                if (!activating.universal) {
                    this.c = 1;
                } else {
                    int i = activating.targetType;
                    if (i == 0) {
                        this.c = 2;
                    } else if (1 == i) {
                        this.c = 3;
                    } else if (2 == i) {
                        this.c = 4;
                    } else {
                        Transport.access$100(Transport.this).print("WARN", "MNET", "target is error");
                    }
                }
                if (this.c != Transport.access$400(Transport.this) || Transport.access$400(Transport.this) == 0) {
                    Transport.access$100(Transport.this).print("WARN", "MNET", "already has lib, first stop");
                    Transport.access$700(Transport.this, this.f4171a.id);
                } else {
                    Transport.access$100(Transport.this).print("WARN", "MNET", "already has same lib, do not activate");
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f4171a == null) {
                this.b.notify(false);
            } else {
                Notepad access$100 = Transport.access$100(Transport.this);
                StringBuilder sb = new StringBuilder("start active, bifrost:");
                sb.append(this.f4171a.universal);
                sb.append(", contex:");
                sb.append(this.f4171a.context != null);
                access$100.print("INFO", "MNET", sb.toString());
                if (!b()) {
                    this.b.notify(true);
                    return;
                }
                Context context = this.f4171a.context;
                if (context != null) {
                    BifrostEnvUtils.setContext(context);
                }
                Activating activating = this.f4171a;
                if (activating.universal) {
                    Bifrost.setSwchmng(activating.swchmng);
                    if (!a()) {
                        Transport.access$100(Transport.this).print("ERROR", "MNET", "initMars error");
                        return;
                    }
                    Transport transport = Transport.this;
                    Bifrost access$300 = Transport.access$300(transport);
                    Activating activating2 = this.f4171a;
                    Transport.access$202(transport, access$300.activate(activating2.id, activating2.storage, activating2.linkage, activating2.swchmng, activating2.service, activating2.domainLongLink, activating2.domainShortLink, activating2.domainMultiplexLink, activating2.cfgLongLink, activating2.cfgShortLink, activating2.cfgMultiplexLink, activating2.netMajor, activating2.netMinor, activating2.ground, activating2.screen, activating2.master, activating2.targetType, activating2.extParams));
                    if (Transport.access$200(Transport.this)) {
                        Transport.access$402(Transport.this, this.c);
                    }
                    this.b.notify(Transport.access$200(Transport.this));
                }
                Notepad access$1002 = Transport.access$100(Transport.this);
                StringBuilder sb2 = new StringBuilder("end active, bifrost:");
                sb2.append(this.f4171a.universal);
                sb2.append(", contex:");
                if (this.f4171a.context == null) {
                    z = false;
                }
                sb2.append(z);
                access$1002.print("INFO", "MNET", sb2.toString());
            }
        }
    }

    public void register(Notepad notepad, Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239972ab", new Object[]{this, notepad, result});
        } else {
            this.e.register(notepad);
        }
    }
}
