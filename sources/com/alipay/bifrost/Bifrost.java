package com.alipay.bifrost;

import android.text.TextUtils;
import com.alipay.mars.sdt.SdtLogic;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnet.util.AmnetLibraryLoadUtils;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.amnetcore.DftAmnetSwitchManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Channel;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.alipay.mobile.common.transportext.amnet.Mercury;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.alipay.mobile.common.transportext.amnet.Notepad;
import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Bifrost {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Bifrost g;

    /* renamed from: a  reason: collision with root package name */
    public Target f3790a;
    public static AmnetSwitchManager f = new DftAmnetSwitchManager();
    public static final BitSet h = new BitSet();
    public boolean e = false;
    public Notepad b = new DftNotepad();
    public final Mercury c = new Messenger();
    public final Alarm d = new DftAlarm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Alarm {
        void handle(Throwable th);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class CmdResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3791a;

        public CmdResult(byte[] bArr) {
            this.f3791a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.resultCmd(this.f3791a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ConnResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3792a;

        public ConnResult(byte[] bArr) {
            this.f3792a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.resultConn(this.f3792a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ConnectionStatus implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f3793a;
        private int b;

        public ConnectionStatus(int i, int i2) {
            this.f3793a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.statusConnection(this.f3793a, this.b);
            }
            Bifrost.access$500(this.f3793a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DataPackage implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3794a;

        public DataPackage(byte[] bArr) {
            this.f3794a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.packageData(this.f3794a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DataRecycle implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3795a;

        public DataRecycle(byte[] bArr) {
            this.f3795a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.recycleData(this.f3795a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DataResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f3796a;
        private int b;
        private int c;

        public DataResult(int i, int i2, int i3) {
            this.f3796a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Bifrost.access$100(Bifrost.access$000()) != null) {
                Bifrost.access$600(this.f3796a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DftAlarm implements Alarm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DftAlarm() {
        }

        @Override // com.alipay.bifrost.Bifrost.Alarm
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
    public class DftNotepad implements Notepad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DftNotepad() {
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Notepad
        public void print(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7290cb92", new Object[]{this, str, str2, str3});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class DisconnResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3797a;

        public DisconnResult(byte[] bArr) {
            this.f3797a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.resultDisconn(this.f3797a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class HbResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3798a;

        public HbResult(byte[] bArr) {
            this.f3798a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.resultHb(this.f3798a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class InitInfCollect implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private InitInfCollect() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                Bifrost.access$200();
                access$100.collectInitInf();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class InitResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3799a;

        public InitResult(byte[] bArr) {
            this.f3799a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.resultInit(this.f3799a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class LaunchResult implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f3800a;
        private byte[] b;

        public LaunchResult(long j, byte[] bArr) {
            this.f3800a = j;
            this.b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.resultLaunch(this.f3800a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class LoginRetry implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.reLogin();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class Messenger implements Mercury {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public LinkedList<Runnable> f3801a;
        public LinkedList<Runnable> b;

        public Messenger() {
            this.f3801a = new LinkedList<>();
            this.b = new LinkedList<>();
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
                this.b = this.f3801a;
                this.f3801a = linkedList;
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
                this.f3801a.addLast(runnable);
            }
            Bifrost.remind();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ReadZstdFileTelling implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private ReadZstdFileTelling() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.tellReadZstdFile();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ReportPerfinfo implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3802a;

        public ReportPerfinfo(byte[] bArr) {
            this.f3802a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.reportPerfinfo(this.f3802a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class RestrictByServer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f3803a;
        private String b;

        public RestrictByServer(int i, String str) {
            this.f3803a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.serverRestrict(this.f3803a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SaveCfg implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f3804a;
        private boolean b;
        private boolean c;
        private boolean d;

        public SaveCfg(byte[] bArr, boolean z, boolean z2, boolean z3) {
            this.f3804a = bArr;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.saveCfg(this.f3804a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SendTrafficTelling implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f3805a;
        private long b;
        private int c;
        private int d;

        public SendTrafficTelling(int i, long j, int i2, int i3) {
            this.f3805a = i;
            this.b = j;
            this.c = i2;
            this.d = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.tellSendTraffic(this.f3805a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SeqAck implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f3806a;

        public SeqAck(long j) {
            this.f3806a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Bifrost.access$100(Bifrost.access$000()) != null) {
                Bifrost.access$400(this.f3806a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SeqUpdate implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f3807a;
        private boolean b;
        private boolean c;

        public SeqUpdate(long j, boolean z, boolean z2) {
            this.f3807a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Bifrost.access$100(Bifrost.access$000()) != null) {
                Bifrost.access$300(this.f3807a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SessionCompensate implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.resendSessionid();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SorryMsg implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f3808a;
        private int b;
        private String c;
        private int d;

        public SorryMsg(long j, int i, String str, int i2) {
            this.f3808a = j;
            this.b = i;
            this.c = str;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Target access$100 = Bifrost.access$100(Bifrost.access$000());
            if (access$100 != null) {
                access$100.sorry(this.f3808a, this.b, this.c, this.d);
            }
        }
    }

    public static synchronized void a() {
        synchronized (Bifrost.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            if (g == null) {
                g = new Bifrost();
            }
        }
    }

    public static /* synthetic */ Bifrost access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bifrost) ipChange.ipc$dispatch("71ab771a", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ Target access$100(Bifrost bifrost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Target) ipChange.ipc$dispatch("4d314d0a", new Object[]{bifrost});
        }
        return bifrost.f3790a;
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            prepare();
        }
    }

    public static /* synthetic */ void access$300(long j, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7f34ca", new Object[]{new Long(j), new Boolean(z), new Boolean(z2)});
        } else {
            changeSeq(j, z, z2);
        }
    }

    public static /* synthetic */ void access$400(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7011a9", new Object[]{new Long(j)});
        } else {
            acknowledge(j);
        }
    }

    public static /* synthetic */ void access$500(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d6911c", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            changeConnStatus(i, i2);
        }
    }

    public static /* synthetic */ void access$600(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca457686", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            report(i, i2, i3);
        }
    }

    public static /* synthetic */ Alarm access$700(Bifrost bifrost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Alarm) ipChange.ipc$dispatch("b6b5bdcb", new Object[]{bifrost});
        }
        return bifrost.d;
    }

    public static final void ackSeq(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2beeedc7", new Object[]{new Long(j)});
        } else {
            g.c.post(new SeqAck(j));
        }
    }

    private static native void acknowledge(long j);

    public static native void alert(byte[] bArr);

    public static native void alter(byte[] bArr);

    public static native int ask();

    private static native void changeConnStatus(int i, int i2);

    private static native void changeSeq(long j, boolean z, boolean z2);

    public static final void collectInitInf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc56d2e", new Object[0]);
        } else {
            g.c.post(new InitInfCollect());
        }
    }

    public static final byte[] getCfg(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("160744be", new Object[]{str, new Boolean(z), new Boolean(z2)});
        }
        Bifrost bifrost = g;
        if (bifrost == null) {
            track("ERROR", "Bifrost", "[getCfg] instance is null. ");
            return new byte[0];
        } else if (bifrost.f3790a == null) {
            track("ERROR", "Bifrost", "[getCfg] instance.target is null. ");
            return new byte[0];
        } else if (!TextUtils.isEmpty(str)) {
            return g.f3790a.getCfg(str, z, z2);
        } else {
            track("ERROR", "Bifrost", "[getCfg] key is null or empty. ");
            return new byte[0];
        }
    }

    public static AmnetSwitchManager getSwchmng() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetSwitchManager) ipChange.ipc$dispatch("1503dfaa", new Object[0]);
        }
        return f;
    }

    public static native void init();

    public static native void initialize(byte[] bArr);

    public static final Bifrost instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bifrost) ipChange.ipc$dispatch("a1e268d5", new Object[0]);
        }
        if (g == null) {
            a();
        }
        return g;
    }

    public static native void launch(long j);

    public static void loadLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c5cafc", new Object[0]);
            return;
        }
        AmnetLibraryLoadUtils.a("c++_shared", false);
        AmnetLibraryLoadUtils.a("openssl", false);
        AmnetLibraryLoadUtils.a("Bifrost", false);
        StnLogic.checkLibrary();
        SdtLogic.checkLibrary();
    }

    public static final void packageData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00eec9e", new Object[]{bArr});
        } else {
            g.c.post(new DataPackage(bArr));
        }
    }

    public static native void post(byte[] bArr);

    public static native void preConnect(String str, int i, boolean z, int i2);

    private static native void prepare();

    public static final void reLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb6f27d", new Object[0]);
        } else {
            g.c.post(new LoginRetry());
        }
    }

    public static native void readLock();

    public static native void readUnlock();

    public static final void recycleData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25496eab", new Object[]{bArr});
        } else {
            g.c.post(new DataRecycle(bArr));
        }
    }

    public static native void remind();

    private static native void report(int i, int i2, int i3);

    public static final void reportPerfinfo(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695037b9", new Object[]{bArr});
        } else {
            g.c.post(new ReportPerfinfo(bArr));
        }
    }

    public static final void resendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e3e1bd", new Object[0]);
        } else {
            g.c.post(new SessionCompensate());
        }
    }

    public static final void resultCmd(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9a49ab", new Object[]{bArr});
        } else {
            g.c.post(new CmdResult(bArr));
        }
    }

    public static final void resultConn(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0c75b7", new Object[]{bArr});
        } else {
            g.c.post(new ConnResult(bArr));
        }
    }

    public static final void resultData(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f941175", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            g.c.post(new DataResult(i, i2, i3));
        }
    }

    public static final void resultDisconn(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7c7bab", new Object[]{bArr});
        } else {
            g.c.post(new DisconnResult(bArr));
        }
    }

    public static final void resultHb(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361a9c45", new Object[]{bArr});
        } else {
            g.c.post(new HbResult(bArr));
        }
    }

    public static final void resultInit(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5880309b", new Object[]{bArr});
        } else {
            g.c.post(new InitResult(bArr));
        }
    }

    public static final void resultLaunch(long j, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98fc074", new Object[]{new Long(j), bArr});
        } else {
            g.c.post(new LaunchResult(j, bArr));
        }
    }

    public static final void routine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c6e34b", new Object[0]);
        } else {
            g.c.drive();
        }
    }

    public static final void saveCfg(byte[] bArr, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d0d43f", new Object[]{bArr, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            g.c.post(new SaveCfg(bArr, z, z2, z3));
        }
    }

    public static final void serverRestrict(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65c9c27", new Object[]{new Integer(i), str});
        } else {
            g.c.post(new RestrictByServer(i, str));
        }
    }

    public static native void setCfg(byte[] bArr);

    public static void setSwchmng(AmnetSwitchManager amnetSwitchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf34a6a", new Object[]{amnetSwitchManager});
        } else if (amnetSwitchManager != null) {
            f = amnetSwitchManager;
        }
    }

    public static native void setSwitch(byte[] bArr);

    public static final void sorry(long j, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743eb976", new Object[]{new Long(j), new Integer(i), str, new Integer(i2)});
        } else {
            g.c.post(new SorryMsg(j, i, str, i2));
        }
    }

    public static native boolean start(byte[] bArr);

    public static final void statusConnection(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea122f97", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            g.c.post(new ConnectionStatus(i, i2));
        }
    }

    public static native void stop();

    public static final void tellReadZstdFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e687d13", new Object[0]);
        } else {
            g.c.post(new ReadZstdFileTelling());
        }
    }

    public static final void tellSendTraffic(int i, long j, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e9c22c", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
        } else {
            g.c.post(new SendTrafficTelling(i, j, i2, i3));
        }
    }

    public static void track(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9493e8b0", new Object[]{str, str2, str3});
        } else {
            g.b.print(str, str2, str3);
        }
    }

    public static final void updateSeq(long j, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bc62c7", new Object[]{new Long(j), new Boolean(z), new Boolean(z2)});
        } else {
            g.c.post(new SeqUpdate(j, z, z2));
        }
    }

    public static native void writeLock();

    public static native void writeUnlock();

    public boolean activate(long j, Storage storage, Linkage linkage, AmnetSwitchManager amnetSwitchManager, Map<Byte, Channel> map, String str, String str2, String str3, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str4, String str5, boolean z, boolean z2, boolean z3, int i, Map<String, Object> map5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4df3a78", new Object[]{this, new Long(j), storage, linkage, amnetSwitchManager, map, str, str2, str3, map2, map3, map4, str4, str5, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), map5})).booleanValue();
        }
        Target target = this.f3790a;
        if (target != null && !target.hit(j)) {
            this.f3790a.inactivate();
            this.f3790a = null;
        }
        if (this.f3790a == null) {
            this.f3790a = new Target(this.c, j);
        }
        return this.f3790a.activate(storage, linkage, amnetSwitchManager, map, str, str2, str3, map2, map3, map4, str4, str5, z, z2, z3, i, map5);
    }

    public boolean alert(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe1c7f85", new Object[]{this, new Long(j), new Long(j2), new Long(j3)})).booleanValue();
        }
        Target target = this.f3790a;
        if (target == null || !target.hit(j)) {
            return false;
        }
        this.f3790a.alert(j2, j3);
        return true;
    }

    public boolean alter(long j, int i, String str, String str2, Map<Byte, byte[]> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caaa3359", new Object[]{this, new Long(j), new Integer(i), str, str2, map})).booleanValue();
        }
        Target target = this.f3790a;
        if (target == null || !target.hit(j)) {
            return false;
        }
        this.f3790a.alter(i, str, str2, map);
        return true;
    }

    public synchronized void bifrostInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e387f94", new Object[]{this});
        } else if (!this.e) {
            if (0 < 3) {
                BitSet bitSet = h;
                if (!bitSet.get(1)) {
                    loadLibrary();
                    bitSet.set(1);
                }
                if (!bitSet.get(2)) {
                    init();
                    bitSet.set(2);
                }
                this.e = true;
            }
        }
    }

    public Mercury getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mercury) ipChange.ipc$dispatch("ab60c160", new Object[]{this});
        }
        return this.c;
    }

    public void inactivate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46890505", new Object[]{this, new Long(j)});
            return;
        }
        Target target = this.f3790a;
        if (target != null && target.hit(j)) {
            this.f3790a.inactivate();
            this.f3790a = null;
        }
    }

    public boolean isHasInitBifrost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35199e88", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean launch(long j, NetTest netTest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1859f313", new Object[]{this, new Long(j), netTest})).booleanValue();
        }
        Target target = this.f3790a;
        if (target == null || !target.hit(j)) {
            return false;
        }
        this.f3790a.launch(netTest);
        return true;
    }

    public boolean post(long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, byte b, String str2, String str3, Map<String, String> map, byte[] bArr, Map<String, String> map2, long j4, long j5, boolean z6, boolean z7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f634c2c", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), str, new Byte(b), str2, str3, map, bArr, map2, new Long(j4), new Long(j5), new Boolean(z6), new Boolean(z7)})).booleanValue();
        }
        Target target = this.f3790a;
        if (target == null || !target.hit(j)) {
            return false;
        }
        this.f3790a.post(j2, j3, z, z2, z3, z4, z5, str, b, str2, str3, map, bArr, map2, j4, j5, z6, z7);
        return true;
    }

    public void preConnect(long j, String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363119f2", new Object[]{this, new Long(j), str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        Target target = this.f3790a;
        if (target != null && target.hit(j)) {
            this.f3790a.preConnect(str, i, z, i2);
        }
    }

    public int query(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f324a748", new Object[]{this, new Long(j)})).intValue();
        }
        Target target = this.f3790a;
        if (target == null || !target.hit(j)) {
            return -1;
        }
        return this.f3790a.query();
    }

    public void register(Notepad notepad) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c363dd", new Object[]{this, notepad});
        } else {
            this.b = notepad;
        }
    }

    public static final void track(int i, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34acf585", new Object[]{new Integer(i), str, str2});
            return;
        }
        if (i == 0) {
            str3 = "VERBOSE";
        } else if (i == 1) {
            str3 = "DEBUG";
        } else if (i == 2) {
            str3 = "INFO";
        } else if (i == 3) {
            str3 = "WARN";
        } else if (i == 4) {
            str3 = "ERROR";
        } else if (i == 5) {
            str3 = "FATAL";
        } else if (i == 6) {
            str3 = "NONE";
        } else {
            str3 = "UNKNOWN";
        }
        track(str3, str, str2);
    }
}
