package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.android.external.UCPReachViewOpenState;
import com.taobao.android.external.UCPReachViewState;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h3b implements dsu, k3e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_REQUEST = "request";
    public static final String KEY_UCP_PROTOCOL = "PageHomeReachView";
    public static final String TAG = "HomePopUcpManager";
    public static final String UCP_SCENE = "Page_Home";
    public static final boolean e = osu.d();

    /* renamed from: a  reason: collision with root package name */
    public k3e f20386a;
    public final cbd b;
    public esu c;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20387a;

        public a(String str) {
            this.f20387a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (h3b.b(h3b.this).a(this.f20387a)) {
                h3b.c(h3b.this);
                h3b.b(h3b.this).c(this.f20387a);
                bgm.d("UcpTriggerTimeout", "", String.valueOf(2), esu.KEY_TERMINAL);
                vfm.f(h3b.TAG, "ucp pop trigger timeout: " + this.f20387a);
            }
        }
    }

    public h3b(cbd cbdVar, tfm tfmVar) {
        this.b = cbdVar;
        if (g()) {
            UCPManager.m(this, KEY_UCP_PROTOCOL);
        }
    }

    public static /* synthetic */ cbd b(h3b h3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cbd) ipChange.ipc$dispatch("176dddeb", new Object[]{h3bVar});
        }
        return h3bVar.b;
    }

    public static /* synthetic */ void c(h3b h3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ceb85", new Object[]{h3bVar});
        } else {
            h3bVar.h();
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[0])).booleanValue();
        }
        return e;
    }

    @Override // tb.k3e
    public void a(UCPReachViewState uCPReachViewState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fcfcef", new Object[]{this, uCPReachViewState});
            return;
        }
        k3e k3eVar = this.f20386a;
        if (k3eVar != null && uCPReachViewState != null) {
            k3eVar.a(uCPReachViewState);
            this.d.removeCallbacksAndMessages(null);
            if (TextUtils.equals(uCPReachViewState.key, "Error") || TextUtils.equals(uCPReachViewState.key, esu.KEY_TERMINAL)) {
                this.c = null;
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (g()) {
            UCPManager.s(KEY_UCP_PROTOCOL);
        }
        this.d.removeCallbacksAndMessages(null);
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec7097e", new Object[]{this, str});
            return;
        }
        vfm.f(TAG, "doTriggerByUCP.");
        this.b.b(str);
    }

    public esu f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esu) ipChange.ipc$dispatch("6182b65b", new Object[]{this});
        }
        return this.c;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b074ea16", new Object[]{this});
        } else {
            osu.e(this.c, "Error", 3, esu.ERROR_MSG_NO_POP_DATA);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c = null;
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // tb.dsu
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return g();
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a7100d", new Object[]{this, str, str2});
        } else if (g()) {
            vfm.f(TAG, "sendUCPEvent, actionType=" + str + " actionName: " + str2);
            UCPManager.p("Page_Home", str, str2, null);
            bgm.c(str, str2);
        }
    }

    @Override // tb.dsu
    public void registerStateSynchronizer(k3e k3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c829a601", new Object[]{this, k3eVar});
            return;
        }
        vfm.f(TAG, "registerStateSynchronizer, synchronizer=" + k3eVar);
        this.f20386a = k3eVar;
    }

    @Override // tb.dsu
    public UCPReachViewOpenState openReachView(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCPReachViewOpenState) ipChange.ipc$dispatch("6afe6146", new Object[]{this, jSONObject, jSONObject2});
        }
        vfm.f(TAG, "openReachView ucpInfo=" + jSONObject);
        vhm.g("ucpTriggerHomePop", "", false, "");
        esu b = esu.b(jSONObject, jSONObject2, this);
        this.c = b;
        osu.e(b, esu.KEY_BIZ_CHECK, 0, esu.KEY_BIZ_CHECK);
        String c = this.c.c();
        if (TextUtils.isEmpty(c)) {
            vfm.f(TAG, "openReachView doTrigger: empty businessId");
            bgm.d("UcpOpenReachView", "", String.valueOf(2), esu.KEY_TERMINAL);
            return UCPReachViewOpenState.TERMINATION;
        }
        vfm.f(TAG, "openReachView doTrigger: " + c);
        bgm.e("UcpOpenReachView", c, "", "");
        e(c);
        this.d.removeCallbacksAndMessages(null);
        this.d.postDelayed(new a(c), osu.f());
        return UCPReachViewOpenState.OPEN;
    }
}
