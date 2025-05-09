package com.network.diagnosis.toolchain;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.request.Request;
import anet.channel.session.HttpConnector;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.ProxyStrategy;
import anet.channel.util.HttpUrl;
import anet.channel.util.TlsSniSocketFactory;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.acq;
import tb.fjf;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class InternalDetectActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f5963a;
    public EditText b;
    public EditText c;
    public Spinner d;
    public Button e;
    public TextView f;
    public TextView g;
    public final AtomicInteger h = new AtomicInteger(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements EventCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HttpUrl f5964a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TnetSpdySession c;
        public final /* synthetic */ long d;

        /* compiled from: Taobao */
        /* renamed from: com.network.diagnosis.toolchain.InternalDetectActivity$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0300a implements RequestCb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0300a() {
            }

            @Override // anet.channel.RequestCb
            public void onDataReceive(ByteArray byteArray, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                } else if (byteArray != null) {
                    InternalDetectActivity.p3(InternalDetectActivity.this, byteArray.getBuffer());
                }
            }

            @Override // anet.channel.RequestCb
            public void onFinish(int i, String str, RequestStatistic requestStatistic) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                a aVar = a.this;
                long j = currentTimeMillis - aVar.d;
                aVar.c.close(false);
                if (i == -304 && requestStatistic != null) {
                    i = requestStatistic.tnetErrorCode;
                }
                InternalDetectActivity.q3(InternalDetectActivity.this, i, j);
            }

            @Override // anet.channel.RequestCb
            public void onResponseCode(int i, Map<String, List<String>> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                } else {
                    InternalDetectActivity.o3(InternalDetectActivity.this, map);
                }
            }
        }

        public a(HttpUrl httpUrl, String str, TnetSpdySession tnetSpdySession, long j) {
            this.f5964a = httpUrl;
            this.b = str;
            this.c = tnetSpdySession;
            this.d = j;
        }

        @Override // anet.channel.entity.EventCb
        public void onEvent(Session session, int i, Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i), event});
            } else if (i == 1) {
                this.c.request(new Request.Builder().setUrl(this.f5964a).setReadTimeout(5000).setRedirectEnable(false).setSeq(this.b).build(), new C0300a());
            } else {
                InternalDetectActivity.q3(InternalDetectActivity.this, event.errorCode, System.currentTimeMillis() - this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5966a;
        public final /* synthetic */ long b;

        public b(int i, long j) {
            this.f5966a = i;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f5966a != 200) {
                InternalDetectActivity.l3(InternalDetectActivity.this).setTextColor(-65536);
            } else {
                InternalDetectActivity.l3(InternalDetectActivity.this).setTextColor(-16711936);
            }
            TextView l3 = InternalDetectActivity.l3(InternalDetectActivity.this);
            l3.setText(Localization.q(R.string.taobao_app_1012_1_14021) + this.f5966a + Localization.q(R.string.taobao_app_1012_1_14030) + this.b + "ms");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5967a;

        public c(String str) {
            this.f5967a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            InternalDetectActivity.l3(InternalDetectActivity.this).setTextColor(-65536);
            InternalDetectActivity.l3(InternalDetectActivity.this).setText(this.f5967a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f5968a;

        public d(Map map) {
            this.f5968a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView m3 = InternalDetectActivity.m3(InternalDetectActivity.this);
            m3.append("headers:\n" + this.f5968a + "\n\nbody:\n");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f5969a;

        public e(byte[] bArr) {
            this.f5969a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InternalDetectActivity.m3(InternalDetectActivity.this).append(new String(this.f5969a));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements IConnStrategy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f5970a;
        public final /* synthetic */ int b;
        public final /* synthetic */ ConnProtocol c;

        public f(String str, int i, ConnProtocol connProtocol) {
            this.f5970a = str;
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
            return 5000;
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
            return this.f5970a;
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
            return 5000;
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

    public static /* synthetic */ Object ipc$super(InternalDetectActivity internalDetectActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/network/diagnosis/toolchain/InternalDetectActivity");
        }
    }

    public static /* synthetic */ TextView l3(InternalDetectActivity internalDetectActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("aef81c78", new Object[]{internalDetectActivity});
        }
        return internalDetectActivity.f;
    }

    public static /* synthetic */ TextView m3(InternalDetectActivity internalDetectActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1d7f2db9", new Object[]{internalDetectActivity});
        }
        return internalDetectActivity.g;
    }

    public static /* synthetic */ void n3(InternalDetectActivity internalDetectActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d4886", new Object[]{internalDetectActivity});
        } else {
            internalDetectActivity.v3();
        }
    }

    public static /* synthetic */ void o3(InternalDetectActivity internalDetectActivity, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6707de", new Object[]{internalDetectActivity, map});
        } else {
            internalDetectActivity.y3(map);
        }
    }

    public static /* synthetic */ void p3(InternalDetectActivity internalDetectActivity, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b072a3cf", new Object[]{internalDetectActivity, bArr});
        } else {
            internalDetectActivity.w3(bArr);
        }
    }

    public static /* synthetic */ void q3(InternalDetectActivity internalDetectActivity, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2a0b2a", new Object[]{internalDetectActivity, new Integer(i), new Long(j)});
        } else {
            internalDetectActivity.z3(i, j);
        }
    }

    public static IConnStrategy s3(ConnProtocol connProtocol, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnStrategy) ipChange.ipc$dispatch("3818b5d", new Object[]{connProtocol, str, new Integer(i)});
        }
        return new f(str, i, connProtocol);
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

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.network_internal_detect);
        getSupportActionBar().setTitle(Localization.q(R.string.taobao_app_1012_1_14008));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.nd_white));
        r3();
    }

    public final void r3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.f5963a = (EditText) findViewById(R.id.et_url);
        this.b = (EditText) findViewById(R.id.et_ip);
        this.c = (EditText) findViewById(R.id.et_port);
        this.d = (Spinner) findViewById(R.id.sp_protocol);
        this.e = (Button) findViewById(R.id.btn_start);
        this.f = (TextView) findViewById(R.id.tv_result);
        this.g = (TextView) findViewById(R.id.tv_content);
        this.e.setOnClickListener(new fjf(this));
    }

    public final void t3(String str, String str2, int i, String str3) {
        ConnProtocol connProtocol;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4f135", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        String[] split = str3.split("_");
        if (split.length == 3) {
            connProtocol = ConnProtocol.valueOf(split[0], split[1], split[2]);
        } else {
            connProtocol = ConnProtocol.valueOf(str3, null, null);
        }
        String str5 = "ND" + this.h.getAndIncrement();
        ConnType valueOf = ConnType.valueOf(connProtocol);
        HttpUrl parse = HttpUrl.parse(str);
        if (valueOf != null && parse != null) {
            if (TextUtils.isEmpty(str2)) {
                try {
                    str2 = InetAddress.getByName(parse.host()).getHostAddress();
                } catch (UnknownHostException unused) {
                }
            }
            Context context = GlobalAppRuntimeInfo.getContext();
            StringBuilder sb = new StringBuilder();
            if (valueOf.isSSL()) {
                str4 = h1p.HTTPS_PREFIX;
            } else {
                str4 = h1p.HTTP_PREFIX;
            }
            sb.append(str4);
            sb.append(parse.host());
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, new ConnInfo(sb.toString(), str5, s3(connProtocol, str2, i)));
            tnetSpdySession.registerEventcb(257, new a(parse, str5, tnetSpdySession, System.currentTimeMillis()));
            tnetSpdySession.connect();
        }
    }

    public final void u3(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16c7879", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        HttpUrl parse = HttpUrl.parse(str);
        parse.setScheme(str3);
        Request build = new Request.Builder().setUrl(parse).addHeader("Connection", "close").setRedirectEnable(false).setReadTimeout(5000).setConnectTimeout(5000).setSslSocketFactory(new TlsSniSocketFactory(parse.host())).setSeq("ND").build();
        if (!TextUtils.isEmpty(str2)) {
            build.setDnsOptimize(str2, i);
        }
        long currentTimeMillis = System.currentTimeMillis();
        HttpConnector.Response connect = HttpConnector.connect(build);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (connect == null) {
            x3(Localization.q(R.string.taobao_app_1012_1_14012));
            return;
        }
        z3(connect.httpCode, currentTimeMillis2);
        Map<String, List<String>> map = connect.header;
        if (map != null) {
            y3(map);
            byte[] bArr = connect.out;
            if (bArr != null) {
                w3(bArr);
            }
        }
    }

    public final void v3() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c326d69b", new Object[]{this});
            return;
        }
        String obj = this.f5963a.getEditableText().toString();
        String obj2 = this.b.getEditableText().toString();
        if (TextUtils.isEmpty(this.c.getEditableText().toString())) {
            i = 80;
        } else {
            i = Integer.valueOf(this.c.getEditableText().toString()).intValue();
        }
        String obj3 = this.d.getSelectedItem().toString();
        if (TextUtils.isEmpty(obj) || HttpUrl.parse(obj) == null) {
            x3(Localization.q(R.string.taobao_app_1012_1_14025));
        } else if (!NetworkStatusHelper.isConnected()) {
            x3(Localization.q(R.string.taobao_app_1012_1_14038));
        } else if (obj3.equals("http") || obj3.equals("https")) {
            u3(obj, obj2, i, obj3);
        } else {
            t3(obj, obj2, i, obj3);
        }
    }

    public final void w3(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ea5959", new Object[]{this, bArr});
        } else {
            runOnUiThread(new e(bArr));
        }
    }

    public final void x3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3835ad4d", new Object[]{this, str});
        } else {
            runOnUiThread(new c(str));
        }
    }

    public final void y3(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76633a8", new Object[]{this, map});
        } else {
            runOnUiThread(new d(map));
        }
    }

    public final void z3(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd908ae", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            runOnUiThread(new b(i, j));
        }
    }
}
