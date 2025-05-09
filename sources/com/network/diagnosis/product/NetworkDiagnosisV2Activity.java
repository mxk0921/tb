package com.network.diagnosis.product;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.ProxyStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.toolchain.InternalDetectActivity;
import com.network.diagnosis.toolchain.WVNetworkDiagnosisPlugin;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.material.TBCircularProgressDrawable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import tb.acq;
import tb.h1p;
import tb.k68;
import tb.pod;
import tb.tl;
import tb.y1r;
import tb.y59;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NetworkDiagnosisV2Activity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageButton A;
    public Handler G;
    public Handler H;
    public Context I;
    public LinearLayout b;
    public TextView c;
    public ArcProgressBar d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public ImageView h;
    public ImageView i;
    public TBCircularProgressDrawable j;
    public TBCircularProgressDrawable k;
    public TBCircularProgressDrawable l;
    public TBCircularProgressDrawable m;
    public TBCircularProgressDrawable n;
    public ImageView o;
    public ImageView p;
    public ImageView q;
    public ImageView r;
    public ImageView s;
    public Button t;
    public Button u;
    public LinearLayout v;
    public TextView w;
    public ContentView x;
    public Button y;
    public ImageButton z;

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f5938a = new ArrayList();
    public final AtomicBoolean B = new AtomicBoolean(false);
    public volatile int C = 0;
    public volatile int D = -1;
    public int E = 0;
    public final AtomicBoolean F = new AtomicBoolean(false);
    public volatile String J = null;
    public boolean K = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.B3(NetworkDiagnosisV2Activity.this).start();
            NetworkDiagnosisV2Activity.C3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity.D3(NetworkDiagnosisV2Activity.this).setVisibility(4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NetworkDiagnosisV2Activity.p3(NetworkDiagnosisV2Activity.this, -5);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.B3(NetworkDiagnosisV2Activity.this).stop();
            NetworkDiagnosisV2Activity.C3(NetworkDiagnosisV2Activity.this).setVisibility(4);
            NetworkDiagnosisV2Activity.D3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 20);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
            NetworkDiagnosisV2Activity.t3(NetworkDiagnosisV2Activity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.E3(NetworkDiagnosisV2Activity.this).start();
            NetworkDiagnosisV2Activity.F3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity.G3(NetworkDiagnosisV2Activity.this).setVisibility(4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 6);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 6);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 6);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NetworkDiagnosisV2Activity.p3(NetworkDiagnosisV2Activity.this, -6);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.E3(NetworkDiagnosisV2Activity.this).stop();
            NetworkDiagnosisV2Activity.F3(NetworkDiagnosisV2Activity.this).setVisibility(4);
            NetworkDiagnosisV2Activity.G3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 2);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
            NetworkDiagnosisV2Activity.t3(NetworkDiagnosisV2Activity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements EventCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5948a;
        public final /* synthetic */ TnetSpdySession b;
        public final /* synthetic */ boolean[] c;
        public final /* synthetic */ CountDownLatch d;

        public j(String str, TnetSpdySession tnetSpdySession, boolean[] zArr, CountDownLatch countDownLatch) {
            this.f5948a = str;
            this.b = tnetSpdySession;
            this.c = zArr;
            this.d = countDownLatch;
        }

        @Override // anet.channel.entity.EventCb
        public void onEvent(Session session, int i, Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i), event});
                return;
            }
            ALog.e("NetworkDiagnosisV2", "[detectTaoBaoServer]", NetworkDiagnosisV2Activity.L3(NetworkDiagnosisV2Activity.this), "host", this.f5948a, "eventType");
            if (i == 1) {
                this.b.close(false);
                this.c[0] = true;
            }
            this.d.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.O3(NetworkDiagnosisV2Activity.this).start();
            NetworkDiagnosisV2Activity.n3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity.o3(NetworkDiagnosisV2Activity.this).setVisibility(4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5950a;
        public final /* synthetic */ Runnable b;

        public l(int i, Runnable runnable) {
            this.f5950a = i;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NetworkDiagnosisV2Activity.l3(NetworkDiagnosisV2Activity.this).get() && NetworkDiagnosisV2Activity.H3(NetworkDiagnosisV2Activity.this) == this.f5950a) {
                this.b.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class m implements IConnStrategy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5951a;
        public final /* synthetic */ int b;
        public final /* synthetic */ ConnProtocol c;

        public m(String str, int i, ConnProtocol connProtocol) {
            this.f5951a = str;
            this.b = i;
            this.c = connProtocol;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public String getAccessPoint() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7a134b63", new Object[]{this});
            }
            return null;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public Map<String, Object> getCommonInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6eaa1deb", new Object[]{this});
            }
            return null;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getConnectionTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3af0dde7", new Object[]{this})).intValue();
            }
            return 1500;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getHeartbeat() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public String getIp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this});
            }
            return this.f5951a;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getIpSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e15dde12", new Object[]{this})).intValue();
            }
            return 2;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getIpType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getPort() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
            }
            return this.b;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public ConnProtocol getProtocol() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConnProtocol) ipChange.ipc$dispatch("f3fe3d0f", new Object[]{this});
            }
            return this.c;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public List<ProxyStrategy> getProxyStrategies() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("69e2ba17", new Object[]{this});
            }
            return null;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getReadTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
            }
            return 1500;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getRetryTimes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public int getStatus() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public String getUnit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9e7fcd3f", new Object[]{this});
            }
            return null;
        }

        @Override // anet.channel.strategy.IConnStrategy
        public boolean isSupportMultiPath() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("43485f44", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NetworkDiagnosisV2Activity.p3(NetworkDiagnosisV2Activity.this, -2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.O3(NetworkDiagnosisV2Activity.this).stop();
            NetworkDiagnosisV2Activity.n3(NetworkDiagnosisV2Activity.this).setVisibility(4);
            NetworkDiagnosisV2Activity.o3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 20);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
            NetworkDiagnosisV2Activity.t3(NetworkDiagnosisV2Activity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.u3(NetworkDiagnosisV2Activity.this).start();
            NetworkDiagnosisV2Activity.v3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity.w3(NetworkDiagnosisV2Activity.this).setVisibility(4);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NetworkDiagnosisV2Activity.p3(NetworkDiagnosisV2Activity.this, -3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.u3(NetworkDiagnosisV2Activity.this).stop();
            NetworkDiagnosisV2Activity.v3(NetworkDiagnosisV2Activity.this).setVisibility(4);
            NetworkDiagnosisV2Activity.w3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 20);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
            NetworkDiagnosisV2Activity.t3(NetworkDiagnosisV2Activity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class s implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.x3(NetworkDiagnosisV2Activity.this).start();
            NetworkDiagnosisV2Activity.z3(NetworkDiagnosisV2Activity.this).setVisibility(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class t implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                NetworkDiagnosisV2Activity.p3(NetworkDiagnosisV2Activity.this, -4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class u implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NetworkDiagnosisV2Activity.x3(NetworkDiagnosisV2Activity.this).stop();
            NetworkDiagnosisV2Activity.z3(NetworkDiagnosisV2Activity.this).setVisibility(4);
            NetworkDiagnosisV2Activity.A3(NetworkDiagnosisV2Activity.this).setVisibility(0);
            NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
            NetworkDiagnosisV2Activity.r3(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.q3(networkDiagnosisV2Activity) + 20);
            NetworkDiagnosisV2Activity.s3(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.q3(NetworkDiagnosisV2Activity.this));
            NetworkDiagnosisV2Activity.t3(NetworkDiagnosisV2Activity.this);
        }
    }

    public static /* synthetic */ ImageView A3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("89756b16", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.q;
    }

    public static /* synthetic */ TBCircularProgressDrawable B3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBCircularProgressDrawable) ipChange.ipc$dispatch("7bd49e81", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.k;
    }

    public static /* synthetic */ ImageView C3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("f9572154", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.f;
    }

    public static /* synthetic */ ImageView D3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("3147fc73", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.p;
    }

    public static /* synthetic */ TBCircularProgressDrawable E3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBCircularProgressDrawable) ipChange.ipc$dispatch("bca7e804", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.n;
    }

    public static /* synthetic */ ImageView F3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a129b2b1", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.i;
    }

    public static /* synthetic */ ImageView G3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("d91a8dd0", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.s;
    }

    public static /* synthetic */ int H3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7825e1b4", new Object[]{networkDiagnosisV2Activity})).intValue();
        }
        return networkDiagnosisV2Activity.C;
    }

    public static /* synthetic */ void I3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e135bd2e", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.d4();
        }
    }

    public static /* synthetic */ void J3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef5352f", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.f4();
        }
    }

    public static /* synthetic */ void K3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb4ad30", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.e4();
        }
    }

    public static /* synthetic */ String L3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eae0b78f", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.J;
    }

    public static /* synthetic */ void M3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18339d32", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.U3();
        }
    }

    public static /* synthetic */ void N3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, boolean z, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd1146c", new Object[]{networkDiagnosisV2Activity, new Boolean(z), new Integer(i2), str});
        } else {
            networkDiagnosisV2Activity.R3(z, i2, str);
        }
    }

    public static /* synthetic */ TBCircularProgressDrawable O3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBCircularProgressDrawable) ipChange.ipc$dispatch("d414767a", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.j;
    }

    public static IConnStrategy Y3(ConnProtocol connProtocol, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnStrategy) ipChange.ipc$dispatch("3818b5d", new Object[]{connProtocol, str, new Integer(i2)});
        }
        return new m(str, i2, connProtocol);
    }

    public static /* synthetic */ Object ipc$super(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/network/diagnosis/product/NetworkDiagnosisV2Activity");
        }
    }

    public static /* synthetic */ AtomicBoolean l3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("5d3224ab", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.B;
    }

    public static /* synthetic */ void m3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b6cd2c", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.b4();
        }
    }

    public static /* synthetic */ ImageView n3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("8b5a0736", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.e;
    }

    public static /* synthetic */ ImageView o3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("c34ae255", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.o;
    }

    public static /* synthetic */ void p3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b81ce7", new Object[]{networkDiagnosisV2Activity, new Integer(i2)});
        } else {
            networkDiagnosisV2Activity.a4(i2);
        }
    }

    public static /* synthetic */ int q3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89390190", new Object[]{networkDiagnosisV2Activity})).intValue();
        }
        return networkDiagnosisV2Activity.E;
    }

    public static /* synthetic */ int r3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9aa9acb7", new Object[]{networkDiagnosisV2Activity, new Integer(i2)})).intValue();
        }
        networkDiagnosisV2Activity.E = i2;
        return i2;
    }

    public static /* synthetic */ ArcProgressBar s3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArcProgressBar) ipChange.ipc$dispatch("64c44fa6", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.d;
    }

    public static /* synthetic */ void t3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b7f19f", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.h4();
        }
    }

    public static /* synthetic */ TBCircularProgressDrawable u3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBCircularProgressDrawable) ipChange.ipc$dispatch("346708e6", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.m;
    }

    public static /* synthetic */ ImageView v3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("12f0050f", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.h;
    }

    public static /* synthetic */ ImageView w3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("4ae0e02e", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.r;
    }

    public static /* synthetic */ TBCircularProgressDrawable x3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBCircularProgressDrawable) ipChange.ipc$dispatch("753a5269", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.l;
    }

    public static /* synthetic */ void y3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9376452d", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.c4();
        }
    }

    public static /* synthetic */ ImageView z3(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("51848ff7", new Object[]{networkDiagnosisV2Activity});
        }
        return networkDiagnosisV2Activity.g;
    }

    public final void P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199f269e", new Object[]{this});
            return;
        }
        ALog.e("NetworkDiagnosisV2", "[cancelDiagnosis]", this.J, new Object[0]);
        this.C = 0;
        this.B.set(false);
        Z3();
    }

    public final synchronized void Q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c05a0f3", new Object[]{this});
            return;
        }
        Handler handler = this.G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.G.getLooper().quit();
            this.G = null;
        }
    }

    public final void R3(boolean z, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597bc8e3", new Object[]{this, new Boolean(z), new Integer(i2), str});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "TBNetworkDetector";
        alarmObject.modulePoint = "Detection_Success_Rate";
        alarmObject.isSuccess = z;
        if (!z) {
            alarmObject.errorCode = String.valueOf(i2);
            alarmObject.errorMsg = str;
        }
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public final void T3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9910258c", new Object[]{this});
        } else if (this.F.get()) {
            Toast.makeText(this.I, Localization.q(R.string.taobao_app_1012_1_14016), 0).show();
        } else if (y59.a()) {
            this.F.set(true);
            Toast.makeText(this.I, Localization.q(R.string.taobao_app_1012_1_14006), 0).show();
        } else {
            Toast.makeText(this.I, Localization.q(R.string.taobao_app_1012_1_14036), 0).show();
        }
    }

    public final void U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53213925", new Object[]{this});
            return;
        }
        ALog.e("NetworkDiagnosisV2", "[finishDiagnosis]", this.J, new Object[0]);
        this.d.setCurrentValues(100.0f);
        a4(-1);
    }

    public final synchronized Handler V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("290ce1bc", new Object[]{this});
        }
        Handler handler = this.G;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("[network_diagnosis]");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.G = handler2;
        return handler2;
    }

    public final void W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cce4cf", new Object[]{this});
        } else {
            startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public final void X3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3723e02", new Object[]{this});
            return;
        }
        switch (this.D) {
            case -6:
            case -1:
                T3();
                return;
            case -5:
            case -4:
                Z3();
                g4();
                return;
            case -3:
            case -2:
                W3();
                return;
            default:
                return;
        }
    }

    public final void Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36a71b", new Object[]{this});
            return;
        }
        this.t.setText(R.string.diagnosis_btn_start);
        this.c.setText(R.string.diagnosis_title_default);
        this.d.reset();
        this.E = 0;
        this.j.stop();
        this.e.setVisibility(4);
        this.k.stop();
        this.f.setVisibility(4);
        this.l.stop();
        this.g.setVisibility(4);
        this.m.stop();
        this.h.setVisibility(4);
        this.n.stop();
        this.i.setVisibility(4);
        this.o.setVisibility(4);
        this.p.setVisibility(4);
        this.q.setVisibility(4);
        this.r.setVisibility(4);
        this.s.setVisibility(4);
        this.v.setVisibility(8);
        this.b.setVisibility(0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void b4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9333bcb", new Object[]{this});
            return;
        }
        j4(new k(), 1);
        boolean isConnected = NetworkStatusHelper.isConnected();
        ALog.e("NetworkDiagnosisV2", "[startCheckConnection]", this.J, "connected", Boolean.valueOf(isConnected));
        if (!isConnected) {
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
            j4(new n(), 1);
            R3(false, 1, "no network");
            return;
        }
        j4(new o(), 1);
    }

    public final void c4() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c5a23c", new Object[]{this});
            return;
        }
        j4(new p(), 2);
        if (checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            z = false;
        } else {
            z = true;
        }
        ALog.e("NetworkDiagnosisV2", "[startCheckPermission]", this.J, "hasPermission", Boolean.valueOf(z));
        if (!z) {
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
            j4(new q(), 2);
            R3(false, 2, "app forbidden network");
            return;
        }
        j4(new r(), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e4() {
        /*
            r10 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.network.diagnosis.product.NetworkDiagnosisV2Activity.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0013
            java.lang.String r0 = "7b57d4b0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r10
            r3.ipc$dispatch(r0, r2)
            return
        L_0x0013:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$d r3 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$d
            r3.<init>()
            r4 = 5
            r10.j4(r3, r4)
            java.lang.String r3 = "guide-acs.m.taobao.com"
            android.util.Pair r3 = r10.S3(r3, r2)
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$e r5 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$e
            r5.<init>()
            r10.j4(r5, r4)
            java.lang.Object r5 = r3.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x003a
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
        L_0x0038:
            r5 = 0
            goto L_0x0077
        L_0x003a:
            java.lang.String r3 = "gw.alicdn.com"
            android.util.Pair r3 = r10.S3(r3, r0)
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$f r5 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$f
            r5.<init>()
            r10.j4(r5, r4)
            java.lang.Object r5 = r3.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0057
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0038
        L_0x0057:
            java.lang.String r3 = "msgacs.m.taobao.com"
            android.util.Pair r3 = r10.S3(r3, r2)
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$g r5 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$g
            r5.<init>()
            r10.j4(r5, r4)
            java.lang.Object r5 = r3.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0075
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0038
        L_0x0075:
            r3 = 0
            r5 = 1
        L_0x0077:
            java.lang.String r6 = r10.J
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "isAvailable"
            r8[r1] = r9
            r8[r2] = r7
            java.lang.String r2 = "message"
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            java.lang.String r0 = "NetworkDiagnosisV2"
            java.lang.String r2 = "[startCheckServer]"
            anet.channel.util.ALog.e(r0, r2, r6, r8)
            if (r5 != 0) goto L_0x00a3
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$h r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$h
            r0.<init>()
            r10.j4(r0, r4)
            r10.R3(r1, r4, r3)
            return
        L_0x00a3:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$i r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$i
            r0.<init>()
            r10.j4(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.product.NetworkDiagnosisV2Activity.e4():void");
    }

    public final void g4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e769b6", new Object[]{this});
            return;
        }
        this.J = "nd_" + System.currentTimeMillis();
        ALog.e("NetworkDiagnosisV2", "[startDiagnosis]", this.J, new Object[0]);
        this.c.setText(R.string.diagnosis_title_ing);
        this.t.setText(R.string.diagnosis_btn_cancel);
        this.C = 0;
        this.B.set(true);
        Q3();
        h4();
    }

    public final void j4(Runnable runnable, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5027781", new Object[]{this, runnable, new Integer(i2)});
        } else {
            this.H.post(new l(i2, runnable));
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.network_diagnosis_v2);
        String dataString = getIntent().getDataString();
        if (TextUtils.isEmpty(dataString) || !dataString.contains("diagnosis_page_mode=half")) {
            z = false;
        } else {
            z = true;
        }
        this.K = z;
        this.I = this;
        this.b = (LinearLayout) findViewById(R.id.layout_diagnosis);
        this.z = (ImageButton) findViewById(R.id.nd_close_button_in_check);
        this.c = (TextView) findViewById(R.id.nd_title);
        this.d = (ArcProgressBar) findViewById(R.id.nd_progress);
        this.e = (ImageView) findViewById(R.id.connection_status);
        this.f = (ImageView) findViewById(R.id.signal_status);
        this.g = (ImageView) findViewById(R.id.proxy_status);
        this.h = (ImageView) findViewById(R.id.permission_status);
        this.i = (ImageView) findViewById(R.id.server_status);
        int parseColor = Color.parseColor("#CCCCCC");
        this.j = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.k = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.l = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.m = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.n = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.e.setImageDrawable(this.j);
        this.f.setImageDrawable(this.k);
        this.g.setImageDrawable(this.l);
        this.h.setImageDrawable(this.m);
        this.i.setImageDrawable(this.n);
        this.o = (ImageView) findViewById(R.id.connection_result);
        this.p = (ImageView) findViewById(R.id.signal_result);
        this.q = (ImageView) findViewById(R.id.proxy_result);
        this.r = (ImageView) findViewById(R.id.permission_result);
        this.s = (ImageView) findViewById(R.id.server_result);
        this.t = (Button) findViewById(R.id.btn_start);
        this.v = (LinearLayout) findViewById(R.id.layout_diagnosis_result);
        this.A = (ImageButton) findViewById(R.id.nd_close_button_in_result);
        this.w = (TextView) findViewById(R.id.nd_result_title);
        this.x = (ContentView) findViewById(R.id.nd_result_content);
        this.y = (Button) findViewById(R.id.btn_result);
        this.b.setVisibility(0);
        this.v.setVisibility(8);
        this.d.reset();
        this.u = (Button) findViewById(R.id.btn_internal_detect);
        if (WVNetworkDiagnosisPlugin.isEnableInternalDetect()) {
            this.u.setVisibility(0);
        }
        if (this.K) {
            getSupportActionBar().hide();
            this.z.setVisibility(0);
            this.A.setVisibility(0);
            this.d.setDiameter(130);
            this.d.setBgArcWidth(5);
            this.d.setProgressWidth(5);
            this.d.setDialWidth(3);
            this.d.setDialIntervalWidth(7);
            this.d.updateView();
        } else {
            getSupportActionBar().setTitle(Localization.q(R.string.taobao_app_1012_1_14011));
            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.nd_white));
            this.z.setVisibility(8);
            this.A.setVisibility(8);
        }
        ((ArrayList) this.f5938a).add(0);
        ((ArrayList) this.f5938a).add(1);
        ((ArrayList) this.f5938a).add(2);
        ((ArrayList) this.f5938a).add(3);
        ((ArrayList) this.f5938a).add(4);
        ((ArrayList) this.f5938a).add(5);
        this.H = new Handler(Looper.getMainLooper());
        if (this.B.compareAndSet(false, true)) {
            g4();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Q3();
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void startOnclickListener(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e61470", new Object[]{this, view});
        } else if (view.getId() == R.id.btn_start) {
            if (this.B.compareAndSet(false, true)) {
                g4();
            } else {
                P3();
            }
        } else if (view.getId() == R.id.btn_result) {
            X3();
        } else if (view.getId() == R.id.btn_internal_detect) {
            startActivity(new Intent(this, InternalDetectActivity.class));
        } else if (view.getId() == R.id.nd_close_button_in_check || view.getId() == R.id.nd_close_button_in_result) {
            finish();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class v implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f5960a;

        public v(int i) {
            this.f5960a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NetworkDiagnosisV2Activity.l3(NetworkDiagnosisV2Activity.this).get()) {
                try {
                    int i = this.f5960a;
                    if (i == 1) {
                        NetworkDiagnosisV2Activity.m3(NetworkDiagnosisV2Activity.this);
                    } else if (i == 2) {
                        NetworkDiagnosisV2Activity.y3(NetworkDiagnosisV2Activity.this);
                    } else if (i == 3) {
                        NetworkDiagnosisV2Activity.I3(NetworkDiagnosisV2Activity.this);
                    } else if (i == 4) {
                        NetworkDiagnosisV2Activity.J3(NetworkDiagnosisV2Activity.this);
                    } else if (i == 5) {
                        NetworkDiagnosisV2Activity.K3(NetworkDiagnosisV2Activity.this);
                    }
                } catch (Exception unused) {
                    ALog.e("NetworkDiagnosisV2", "DiagnosisRunnable error.", NetworkDiagnosisV2Activity.L3(NetworkDiagnosisV2Activity.this), tl.KEY_STEP, Integer.valueOf(this.f5960a));
                    NetworkDiagnosisV2Activity.M3(NetworkDiagnosisV2Activity.this);
                    NetworkDiagnosisV2Activity.N3(NetworkDiagnosisV2Activity.this, false, 6, "runtime error");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d4() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.network.diagnosis.product.NetworkDiagnosisV2Activity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "45e308cf"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$s r2 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$s
            r2.<init>()
            r3 = 3
            r9.j4(r2, r3)
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch: Exception -> 0x0021
            goto L_0x0022
        L_0x0021:
        L_0x0022:
            boolean r2 = anet.channel.status.NetworkStatusHelper.isProxy()
            if (r2 == 0) goto L_0x002a
        L_0x0028:
            r2 = 1
            goto L_0x004d
        L_0x002a:
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r9.getSystemService(r2)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.Network[] r4 = r2.getAllNetworks()
            int r5 = r4.length
            r6 = 0
        L_0x0038:
            if (r6 >= r5) goto L_0x004c
            r7 = r4[r6]
            android.net.NetworkCapabilities r7 = r2.getNetworkCapabilities(r7)
            if (r7 == 0) goto L_0x004a
            r8 = 4
            boolean r7 = r7.hasTransport(r8)
            if (r7 == 0) goto L_0x004a
            goto L_0x0028
        L_0x004a:
            int r6 = r6 + r1
            goto L_0x0038
        L_0x004c:
            r2 = 0
        L_0x004d:
            java.lang.String r4 = r9.J
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "hasProxy"
            r6[r0] = r7
            r6[r1] = r5
            java.lang.String r1 = "NetworkDiagnosisV2"
            java.lang.String r5 = "[startCheckProxy]"
            anet.channel.util.ALog.e(r1, r5, r4, r6)
            if (r2 == 0) goto L_0x0074
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$t r1 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$t
            r1.<init>()
            r9.j4(r1, r3)
            java.lang.String r1 = "using proxy"
            r9.R3(r0, r3, r1)
            return
        L_0x0074:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$u r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$u
            r0.<init>()
            r9.j4(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.product.NetworkDiagnosisV2Activity.d4():void");
    }

    public final void h4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476526e8", new Object[]{this});
            return;
        }
        int indexOf = ((ArrayList) this.f5938a).indexOf(Integer.valueOf(this.C)) + 1;
        if (indexOf < ((ArrayList) this.f5938a).size()) {
            this.C = ((Integer) ((ArrayList) this.f5938a).get(indexOf)).intValue();
            V3().post(new v(this.C));
            return;
        }
        U3();
        R3(true, 0, "result ok");
    }

    public final String i4(PingResponse pingResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba252b93", new Object[]{this, pingResponse});
        }
        if (pingResponse == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(pod.IP, pingResponse.getLocalIPStr());
            jSONObject.put("errCode", Integer.valueOf(pingResponse.getErrcode()));
            jSONObject.put("successCnt", Integer.valueOf(pingResponse.getSuccessCnt()));
            PingEntry[] results = pingResponse.getResults();
            JSONArray jSONArray = new JSONArray();
            if (results != null) {
                for (PingEntry pingEntry : results) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("hop", (Object) Integer.valueOf(pingEntry.hop));
                    jSONObject2.put(y1r.COL_SEQ, (Object) Integer.valueOf(pingEntry.seq));
                    jSONObject2.put("rtt", (Object) Double.valueOf(pingEntry.rtt));
                    jSONArray.add(jSONObject2);
                }
            }
            jSONObject.put("results", (Object) jSONArray);
            return jSONObject.toJSONString();
        } catch (Exception unused) {
            ALog.e("NetworkDiagnosisV2", "[toFormatPingResponse]error.", null, new Object[0]);
            return "";
        }
    }

    public final void a4(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503d7aca", new Object[]{this, new Integer(i2)});
            return;
        }
        this.d.setCurrentValues(100.0f);
        this.B.set(false);
        this.D = i2;
        ALog.e("NetworkDiagnosisV2", "[showResultTips]", this.J, "result", Boolean.valueOf(i2 == -1), "code", Integer.valueOf(i2));
        this.b.setVisibility(8);
        this.v.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        switch (this.D) {
            case -6:
                this.w.setText(R.string.diagnosis_server_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_server_subtitle), getString(R.string.diagnosis_server_content)));
                this.x.setContent(arrayList);
                this.y.setText(R.string.diagnosis_server_btn);
                return;
            case -5:
                this.w.setText(R.string.diagnosis_signal_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_1), getString(R.string.diagnosis_signal_content_1)));
                if (NetworkStatusHelper.getStatus().isWifi()) {
                    arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_2), getString(R.string.diagnosis_signal_content_2)));
                    arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_3), getString(R.string.diagnosis_signal_content_3)));
                    arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_4), getString(R.string.diagnosis_signal_content_4)));
                }
                this.x.setContent(arrayList);
                this.y.setText(R.string.diagnosis_signal_btn);
                return;
            case -4:
                this.w.setText(R.string.diagnosis_proxy_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_proxy_subtitle), getString(R.string.diagnosis_proxy_content)));
                this.x.setContent(arrayList);
                this.y.setText(R.string.diagnosis_proxy_btn);
                return;
            case -3:
                this.w.setText(R.string.diagnosis_permission_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_permission_subtitle), getString(R.string.diagnosis_permission_content)));
                this.x.setContent(arrayList);
                this.y.setText(R.string.diagnosis_permission_btn);
                return;
            case -2:
                this.w.setText(R.string.diagnosis_error_connection_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_error_connection_subtitle_1), getString(R.string.diagnosis_error_connection_content_1)));
                arrayList.add(Pair.create(getString(R.string.diagnosis_error_connection_subtitle_2), getString(R.string.diagnosis_error_connection_content_2)));
                this.x.setContent(arrayList);
                this.y.setText(R.string.diagnosis_error_connection_btn);
                return;
            case -1:
                this.w.setText(R.string.diagnosis_ok_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_ok_subtitle), getString(R.string.diagnosis_ok_content)));
                this.x.setContent(arrayList);
                this.y.setText(R.string.diagnosis_ok_btn);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
        if (r6.getSuccessCnt() < 3) goto L_0x0058;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f4() {
        /*
            r18 = this;
            r0 = r18
            r1 = 2
            r2 = 0
            r3 = 1
            com.android.alibaba.ip.runtime.IpChange r4 = com.network.diagnosis.product.NetworkDiagnosisV2Activity.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0015
            java.lang.String r1 = "a762d995"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r4.ipc$dispatch(r1, r3)
            return
        L_0x0015:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$a r4 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$a
            r4.<init>()
            r5 = 4
            r0.j4(r4, r5)
            org.android.netutil.PingTask r4 = new org.android.netutil.PingTask
            r10 = 0
            r11 = 0
            java.lang.String r7 = "223.5.5.5"
            r8 = 1000(0x3e8, float:1.401E-42)
            r15 = 3
            r6 = r4
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            java.util.concurrent.Future r4 = r4.launch()
            r6 = 0
            java.lang.Object r4 = r4.get()     // Catch: Exception -> 0x0038
            org.android.netutil.PingResponse r4 = (org.android.netutil.PingResponse) r4     // Catch: Exception -> 0x0038
            goto L_0x003a
        L_0x0038:
            r4 = r6
        L_0x003a:
            java.lang.String r7 = r0.J
            java.lang.String r8 = r0.i4(r4)
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r10 = "v4TaskResponse"
            r9[r2] = r10
            r9[r3] = r8
            java.lang.String r8 = "NetworkDiagnosisV2"
            java.lang.String r10 = "[startCheckSignal]"
            anet.channel.util.ALog.e(r8, r10, r7, r9)
            if (r4 == 0) goto L_0x005a
            int r7 = r4.getSuccessCnt()
            if (r7 >= r15) goto L_0x005a
        L_0x0058:
            r4 = 1
            goto L_0x009b
        L_0x005a:
            int r7 = anet.channel.util.Inet64Util.getStackType()
            r9 = 3
            if (r7 == r9) goto L_0x0062
            goto L_0x009a
        L_0x0062:
            org.android.netutil.PingTask r7 = new org.android.netutil.PingTask
            r16 = 0
            r17 = 0
            java.lang.String r13 = "2400:3200::1"
            r14 = 1000(0x3e8, float:1.401E-42)
            r12 = r7
            r9 = 3
            r15 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.concurrent.Future r7 = r7.launch()
            java.lang.Object r7 = r7.get()     // Catch: Exception -> 0x007e
            org.android.netutil.PingResponse r7 = (org.android.netutil.PingResponse) r7     // Catch: Exception -> 0x007e
            r6 = r7
            goto L_0x007f
        L_0x007e:
        L_0x007f:
            java.lang.String r7 = r0.J
            java.lang.String r4 = r0.i4(r4)
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.String r12 = "v6TaskResponse"
            r11[r2] = r12
            r11[r3] = r4
            anet.channel.util.ALog.e(r8, r10, r7, r11)
            if (r6 == 0) goto L_0x009a
            int r4 = r6.getSuccessCnt()
            if (r4 >= r9) goto L_0x009a
            goto L_0x0058
        L_0x009a:
            r4 = 0
        L_0x009b:
            java.lang.String r6 = r0.J
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r9 = "isWeak"
            r1[r2] = r9
            r1[r3] = r7
            anet.channel.util.ALog.e(r8, r10, r6, r1)
            if (r4 == 0) goto L_0x00bd
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$b r1 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$b
            r1.<init>()
            r0.j4(r1, r5)
            java.lang.String r1 = "signal weak"
            r0.R3(r2, r5, r1)
            return
        L_0x00bd:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$c r1 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$c
            r1.<init>()
            r0.j4(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.product.NetworkDiagnosisV2Activity.f4():void");
    }

    public final Pair<Boolean, String> S3(String str, int i2) {
        String str2;
        PingResponse pingResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6094c6a8", new Object[]{this, str, new Integer(i2)});
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost == null || connStrategyListByHost.isEmpty()) {
            return Pair.create(Boolean.TRUE, "ok");
        }
        String ip = connStrategyListByHost.get(0).getIp();
        int i3 = 1 == i2 ? 1232 : 1390;
        if (1 == i2) {
            str2 = ConnType.PK_ACS;
        } else {
            str2 = "cdn";
        }
        Future<PingResponse> launch = new PingTask(ip, 1000, 2, i3 - 28, 0).launch();
        ConnProtocol valueOf = ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str2);
        Context context = GlobalAppRuntimeInfo.getContext();
        TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new ConnInfo(h1p.HTTPS_PREFIX + str, str + "_" + this.J, Y3(valueOf, ip, 443)));
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean[] zArr = {false};
        tnetSpdySession.registerEventcb(257, new j(str, tnetSpdySession, zArr, countDownLatch));
        tnetSpdySession.connect();
        try {
            countDownLatch.await(1500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            ALog.e("NetworkDiagnosisV2", "[detectTaoBaoServer]", this.J, e2, new Object[0]);
        }
        try {
            pingResponse = launch.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        ALog.e("NetworkDiagnosisV2", "[detectTaoBaoServer]", this.J, "host", str, "mtuResponse", i4(pingResponse));
        if (pingResponse == null || pingResponse.getSuccessCnt() != 0 || zArr[0]) {
            return Pair.create(Boolean.TRUE, "ok");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(k68.KEY_OP, (Object) "mtu");
        jSONObject.put("host", (Object) str);
        jSONObject.put(pod.IP, (Object) ip);
        return Pair.create(Boolean.FALSE, jSONObject.toString());
    }
}
