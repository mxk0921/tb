package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.media.MediaConstant;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.player.standard.state.LiveStatePlayer;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.media.request.UrlListResponse;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.btd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class soq implements IMediaPlayer.e, btd, b0d, IMediaPlayer.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL = "KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL";
    public static final String KEY_LAST_AUTO_SWITCH_WHEN_MANUAL = "KEY_LAST_AUTO_SWITCH_WHEN_MANUAL";
    public static final String NEW_DEFINITION = "NEW_DEFINITION";
    public static final int REASON_AUTO = 1;
    public static final int REASON_USER_RECOM = 2;
    public static final int REASON_USER_SWITCH = 0;
    public static final String SWITCH_MODE = "SWITCH_MODE";
    public static final int SWITCH_MODE_AUTO = 1;
    public static final int SWITCH_MODE_NOT_AUTO = 2;
    public static final String TAG = soq.class.getSimpleName();
    public String b;
    public final String e;
    public String f;
    public String g;
    public String h;
    public final Context k;
    public btd.b m;
    public btd.a p;
    public final ux9 q;
    public Object r;

    /* renamed from: a  reason: collision with root package name */
    public int f28190a = 1;
    public List<h7m> c = null;
    public boolean d = false;
    public final ArrayList<String> i = new ArrayList<>();
    public boolean j = false;
    public bov l = null;
    public final List<btd.d> n = new ArrayList();
    public final List<btd.c> o = new ArrayList();

    static {
        t2o.a(806356025);
        t2o.a(806356441);
        t2o.a(806356017);
        t2o.a(806355932);
        t2o.a(806356435);
    }

    public soq(Context context, String str, ux9 ux9Var) {
        this.k = context;
        this.e = str;
        this.q = ux9Var;
    }

    public final List<MediaData.QualityLiveItem> B(NetBaseOutDo netBaseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d282129c", new Object[]{this, netBaseOutDo});
        }
        if (netBaseOutDo instanceof UrlListResponse) {
            return ((UrlListResponse) netBaseOutDo).getData().liveUrlList;
        }
        return null;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83afbe1e", new Object[]{this});
            return;
        }
        h7m D = D();
        List<h7m> list = this.c;
        if (list != null) {
            list.clear();
        } else {
            this.c = new ArrayList();
        }
        if (D.b()) {
            this.c.add(D);
        }
    }

    public final void E(btd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca70384", new Object[]{this, bVar});
        } else if (bVar == null) {
            String str = TAG;
            eir.a(str, "setLiveMode mediaPlayController = null mLiveContextKey = " + this.e);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("enAdaptiveLiveSwitch", "1");
            ((BaseStatePlayer) bVar).H(hashMap);
        }
    }

    public final void F(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e536e6b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        HashMap<String, String> c = c();
        c.put("definition", str);
        c.put("isAutoMode", String.valueOf(i));
        c.put("result", str2);
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "Button-DefinitionSwitched", c);
        }
    }

    public final void I(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35be3289", new Object[]{this, str, str2});
            return;
        }
        HashMap<String, String> c = c();
        c.put("definition", str);
        c.put("type", str2);
        if (v2s.o().E() != null) {
            v2s.o().E().track4Show("Page_TaobaoLiveWatch", "Show-WeakNetworkTips", c);
        }
    }

    public final void J(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ede24a", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap<String, String> c = c();
        c.put("definition", str);
        c.put("type", str2);
        c.put("result", str3);
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "Button-WeakNetworkSwitched", c);
        }
    }

    @Override // tb.btd
    public void a(btd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f96a2f", new Object[]{this, bVar});
        } else {
            z(bVar, false);
        }
    }

    @Override // tb.btd
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa9938af", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.btd
    public HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("24f1235b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("liveid", this.f);
        hashMap.put("livesource", this.g);
        hashMap.put("entryLiveSource", this.h);
        btd.b bVar = this.m;
        if (bVar != null) {
            hashMap.put("width", String.valueOf(((BaseStatePlayer) bVar).k0()));
            hashMap.put("height", String.valueOf(((BaseStatePlayer) this.m).g0()));
        }
        return hashMap;
    }

    @Override // tb.btd
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae7a3da", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // tb.btd
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76aaa8e7", new Object[]{this})).intValue();
        }
        return this.f28190a;
    }

    @Override // tb.btd
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833f4e7b", new Object[]{this});
        } else {
            this.p = null;
        }
    }

    @Override // tb.btd
    public void h(btd.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e37eb0", new Object[]{this, dVar});
            return;
        }
        List<btd.d> list = this.n;
        if (list != null) {
            ((ArrayList) list).remove(dVar);
        }
    }

    @Override // tb.btd
    public void i(btd.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d9d090", new Object[]{this, cVar});
            return;
        }
        List<btd.c> list = this.o;
        if (list != null) {
            ((ArrayList) list).remove(cVar);
        }
    }

    @Override // tb.btd
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    @Override // tb.btd
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8af44c8", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    @Override // tb.btd
    public void l(String str, btd.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13041b9", new Object[]{this, str, dVar});
            return;
        }
        String str2 = TAG;
        eir.a(str2, "updateUrlList mLiveContextKey = " + this.e);
        bov bovVar = new bov(this);
        this.l = bovVar;
        bovVar.K(str);
        List<btd.d> list = this.n;
        if (list != null && !((ArrayList) list).contains(dVar)) {
            ((ArrayList) this.n).add(dVar);
        }
    }

    @Override // tb.btd
    public void n(btd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53993dfa", new Object[]{this, aVar});
        } else {
            this.p = aVar;
        }
    }

    @Override // tb.btd
    public void o(btd.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1bd3", new Object[]{this, cVar});
            return;
        }
        List<btd.c> list = this.o;
        if (list != null && !((ArrayList) list).contains(cVar)) {
            ((ArrayList) this.o).add(cVar);
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = TAG;
        eir.a(str, "updateUrlList onError mLiveContextKey = " + this.e);
        if (this.m != null) {
            C();
            List<btd.d> list = this.n;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((btd.d) it.next()).M(this.c);
                }
            }
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        int i = (int) j;
        if (i == 12001) {
            v(j2, obj);
        } else if (i == 12003) {
            w(j2, obj);
        }
        return false;
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = TAG;
        eir.a(str, "updateUrlList onSystemError mLiveContextKey = " + this.e);
        if (this.m != null) {
            C();
            List<btd.d> list = this.n;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((btd.d) it.next()).M(this.c);
                }
            }
        }
    }

    @Override // tb.btd
    public void q(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccb5973", new Object[]{this, obj});
        } else {
            this.r = obj;
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684f2383", new Object[]{this, str});
            return;
        }
        String str2 = TAG;
        eir.a(str2, "adapterAutoSwitch newDefinition = " + str + " mLiveContextKey = " + this.e);
        this.d = true;
        this.b = str;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7bb7b67", new Object[]{this});
            return;
        }
        btd.b bVar = this.m;
        if (bVar != null) {
            int k0 = ((BaseStatePlayer) bVar).k0();
            int g0 = ((BaseStatePlayer) this.m).g0();
            ArrayList<String> arrayList = this.i;
            arrayList.add(k0 + "*" + g0);
            HashMap hashMap = new HashMap();
            hashMap.put("definition", u());
            Object obj = this.r;
            if (obj != null) {
                du4.c(this.q, obj, hashMap);
            } else {
                du4.c(this.q, this.k, hashMap);
            }
        }
    }

    public final void t(HashMap<String, String> hashMap) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db476881", new Object[]{this, hashMap});
            return;
        }
        String str = hashMap.get("autoSwitch");
        if (str != null) {
            if (zqq.j(str) == 1) {
                z = true;
            }
            if (z && this.f28190a == 1) {
                String str2 = TAG;
                eir.a(str2, "check right autoSwitch = true mLiveContextKey = " + this.e + " mSwitchMode = " + this.f28190a);
            } else if (z || this.f28190a == 1) {
                String str3 = TAG;
                eir.a(str3, "check wrong autoSwitch = " + z + " mLiveContextKey = " + this.e + " mSwitchMode = " + this.f28190a);
            } else {
                String str4 = TAG;
                eir.a(str4, "check right autoSwitch = false mLiveContextKey = " + this.e + " mSwitchMode = " + this.f28190a);
            }
        }
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6cc0d944", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.i.size(); i++) {
            sb.append(this.i.get(i));
            if (i < this.i.size() - 1) {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.f28190a = t6t.c(SWITCH_MODE, 1);
        this.b = t6t.a(NEW_DEFINITION);
        String str = TAG;
        eir.a(str, "init mSwitchMode = " + this.f28190a + " mNewDefinition = " + this.b + " mLiveContextKey = " + this.e);
    }

    public final void y(btd.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0cf220", new Object[]{this, bVar, str});
        } else if (bVar == null) {
            String str2 = TAG;
            eir.a(str2, "initDefinition mediaPlayController = null mLiveContextKey = " + this.e);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("initDefinition", str);
            ((BaseStatePlayer) bVar).H(hashMap);
        }
    }

    public void z(btd.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18348e85", new Object[]{this, bVar, new Boolean(z)});
            return;
        }
        String str = TAG;
        eir.a(str, "initStreamChooseInfoWithPlayer mLiveContextKey = " + this.e);
        if (bVar == null) {
            eir.a(str, "initStreamChooseInfoWithPlayer mediaPlayController = null mLiveContextKey = " + this.e);
            return;
        }
        this.m = bVar;
        if (z) {
            y(bVar, MediaConstant.DEFINITION_HD);
            ((LiveStatePlayer) bVar).a2(true);
        } else if (this.f28190a == 1) {
            y(bVar, "auto");
            ((LiveStatePlayer) bVar).a2(true);
        } else {
            if (!TextUtils.isEmpty(this.b)) {
                y(bVar, this.b);
            }
            ((LiveStatePlayer) bVar).a2(false);
        }
        E(bVar);
        ((BaseStatePlayer) bVar).u(this);
        ((LiveStatePlayer) bVar).Z1(this);
        if (this.j) {
            s();
        }
    }

    public final h7m D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h7m) ipChange.ipc$dispatch("5113bf38", new Object[]{this});
        }
        h7m W1 = ((LiveStatePlayer) this.m).W1();
        if (W1 == null || !W1.b()) {
            W1 = new h7m();
            W1.e = true;
            W1.c = "高清";
            W1.d = MediaConstant.DEFINITION_MD;
        }
        if (W1.a()) {
            this.b = W1.b;
        } else {
            this.b = W1.d;
        }
        String str = TAG;
        eir.a(str, "setCurSafeDefinition mNewDefinition = " + this.b + " mLiveContextKey = " + this.e);
        return W1;
    }

    public final void K(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617afff3", new Object[]{this, str, new Boolean(z)});
        } else if (this.f28190a == 1) {
            if (qvs.n()) {
                m(1, str);
                I(str, "auto");
            }
        } else if (!z) {
            if (hjr.b()) {
                String str2 = TAG;
                eir.a(str2, "trySwitchNewDivination autoSwitchStreamWhenManual mLiveContextKey = " + this.e);
                if (System.currentTimeMillis() - t6t.d(KEY_LAST_AUTO_SWITCH_WHEN_MANUAL) > hjr.C()) {
                    t6t.h(KEY_LAST_AUTO_SWITCH_WHEN_MANUAL, System.currentTimeMillis());
                    e(1);
                    Context context = this.k;
                    if (context != null) {
                        Toast.makeText(context.getApplicationContext(), "网络卡顿，已自动调整清晰度", 1).show();
                    }
                    if (System.currentTimeMillis() - t6t.d(KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL) > hjr.D()) {
                        t6t.h(KEY_LAST_AUTO_SWITCH_TIP_WHEN_MANUAL, System.currentTimeMillis());
                        btd.a aVar = this.p;
                        if (aVar != null) {
                            ((LiveMediaManager.c) aVar).b(this.e);
                        }
                    }
                }
            } else if (qvs.l()) {
                String str3 = TAG;
                eir.a(str3, "trySwitchNewDivination onShowAskSwitchDialog mLiveContextKey = " + this.e);
                btd.a aVar2 = this.p;
                if (aVar2 != null) {
                    ((LiveMediaManager.c) aVar2).a(this.e, str);
                }
            }
            I(str, BizTaskData.MANUAL_TIME);
        } else {
            String str4 = TAG;
            eir.a(str4, "trySwitchNewDivination isUp = " + z + " mLiveContextKey = " + this.e);
        }
    }

    @Override // tb.btd
    public void m(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1d3307", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = TAG;
        eir.a(str2, "saveNewDefinition newDefinition = " + str + " mLiveContextKey = " + this.e);
        if (str != null && !str.equals(this.b)) {
            eir.a(str2, "saveNewDefinition success newDefinition = " + str + " mLiveContextKey = " + this.e);
            this.d = true;
            this.b = str;
            btd.b bVar = this.m;
            if (bVar != null) {
                ((LiveStatePlayer) bVar).f2(i, str);
            }
            if (i != 1) {
                t6t.e(NEW_DEFINITION, str);
            }
        }
    }

    @Override // tb.btd
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6464724d", new Object[]{this});
            return;
        }
        String str = TAG;
        eir.a(str, "notifyFirstFrame mLiveContextKey = " + this.e);
        this.j = true;
        s();
    }

    @Override // tb.xkd
    public void unInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[]{this});
            return;
        }
        String str = TAG;
        eir.a(str, "unInit mLiveContextKey = " + this.e);
        v0u.a();
        bov bovVar = this.l;
        if (bovVar != null) {
            bovVar.destroy();
        }
        btd.b bVar = this.m;
        if (bVar != null) {
            ((LiveStatePlayer) bVar).Z1(null);
        }
        List<btd.d> list = this.n;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        List<btd.c> list2 = this.o;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        this.p = null;
        this.j = false;
        this.d = false;
    }

    public final void G(int i, int i2) {
        String str;
        String str2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd74b83", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        String str3 = this.b;
        if (i2 == 1) {
            i3 = 1;
        }
        if (i == -1) {
            str = "failed";
        } else {
            str = "success";
        }
        if (this.f28190a == 1) {
            str2 = "auto";
        } else {
            str2 = BizTaskData.MANUAL_TIME;
        }
        if (i2 == 0) {
            F(str3, i3, str);
        } else {
            J(str3, str2, str);
        }
    }

    @Override // tb.btd
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a854388", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        eir.a(str, "saveSwitchMode switchMode = " + i + " mLiveContextKey = " + this.e);
        this.f28190a = i;
        t6t.g(SWITCH_MODE, i);
        btd.b bVar = this.m;
        if (bVar == null) {
            return;
        }
        if (this.f28190a == 1) {
            ((LiveStatePlayer) bVar).a2(true);
        } else {
            ((LiveStatePlayer) bVar).a2(false);
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        String str = TAG;
        eir.a(str, "updateUrlList onSuccess mLiveContextKey = " + this.e);
        if (this.m != null) {
            List<MediaData.QualityLiveItem> B = B(netBaseOutDo);
            if (B != null && !B.isEmpty()) {
                ((LiveStatePlayer) this.m).g2(B);
            }
            List<h7m> X1 = ((LiveStatePlayer) this.m).X1(true);
            this.c = new ArrayList();
            h7m h7mVar = null;
            if (X1 != null) {
                for (int i2 = 0; i2 < X1.size(); i2++) {
                    if (X1.get(i2) != null && X1.get(i2).a()) {
                        ((ArrayList) this.c).add(X1.get(i2));
                        if (X1.get(i2).e) {
                            this.b = X1.get(i2).b;
                            h7mVar = X1.get(i2);
                        }
                    }
                }
            }
            if (h7mVar == null) {
                C();
            }
            List<btd.d> list = this.n;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((btd.d) it.next()).u0(this.c);
                }
            }
        }
    }

    public final void v(long j, Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971c593f", new Object[]{this, new Long(j), obj});
            return;
        }
        String str = TAG;
        eir.a(str, "handleInfo12001 mLiveContextKey = " + this.e);
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (j != 1) {
                z = false;
            }
            String str2 = null;
            String valueOf = map.containsKey("recomDefinition") ? String.valueOf(map.get("recomDefinition")) : null;
            String valueOf2 = map.containsKey("recomDefinitionName") ? String.valueOf(map.get("recomDefinitionName")) : null;
            String valueOf3 = map.containsKey("currentDefinition") ? String.valueOf(map.get("currentDefinition")) : null;
            if (map.containsKey("currentDefinitionName")) {
                str2 = String.valueOf(map.get("currentDefinitionName"));
            }
            if (valueOf3 != null) {
                this.b = valueOf3;
            }
            eir.a(str, "handleInfo12001 recomDefinition = " + valueOf + " recomDefinitionName = " + valueOf2 + " currentDefinition = " + valueOf3 + " currentDefinitionName = " + str2 + " isUp = " + z);
            if (!TextUtils.isEmpty(valueOf)) {
                K(valueOf, z);
            }
        }
    }

    public final void w(long j, Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1f76fd", new Object[]{this, new Long(j), obj});
            return;
        }
        String str = TAG;
        eir.a(str, "handleInfo12003 mLiveContextKey = " + this.e);
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (j != 1) {
                z = false;
            }
            String str2 = null;
            String valueOf = map.containsKey("recomDefinition") ? String.valueOf(map.get("recomDefinition")) : null;
            String valueOf2 = map.containsKey("recomDefinitionName") ? String.valueOf(map.get("recomDefinitionName")) : null;
            String valueOf3 = map.containsKey("currentDefinition") ? String.valueOf(map.get("currentDefinition")) : null;
            if (map.containsKey("currentDefinitionName")) {
                str2 = String.valueOf(map.get("currentDefinitionName"));
            }
            if (valueOf3 != null) {
                this.b = valueOf3;
            }
            eir.a(str, "handleInfo12003 recomDefinition = " + valueOf + " recomDefinitionName = " + valueOf2 + " currentDefinition = " + valueOf3 + " currentDefinitionName = " + str2 + " isUp = " + z);
            if (!TextUtils.isEmpty(valueOf)) {
                r(valueOf);
            }
        }
    }

    public void A(HashMap<String, String> hashMap) {
        Context context;
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed540ac", new Object[]{this, hashMap});
            return;
        }
        String str = TAG;
        eir.a(str, "onSwitchedToDefinition mLiveContextKey = " + this.e);
        this.d = false;
        if (hashMap != null && hashMap.get(rb.RESULT_KEY) != null) {
            String str2 = hashMap.get(rb.RESULT_KEY);
            String str3 = hashMap.get("reason");
            if (str2 != null && str3 != null) {
                try {
                    int parseInt = Integer.parseInt(str2);
                    int parseInt2 = Integer.parseInt(str3);
                    eir.a(str, "onSwitchedToDefinition ret mLiveContextKey = " + this.e + " isSwitching = " + this.d + " ret = " + parseInt + " reason = " + parseInt2);
                    G(parseInt, parseInt2);
                    t(hashMap);
                    if (parseInt == -1) {
                        if (parseInt2 == 0 && (context2 = this.k) != null) {
                            v0u.b(context2.getApplicationContext(), "清晰度切换失败");
                        }
                        D();
                        if (parseInt2 != 1) {
                            t6t.e(NEW_DEFINITION, this.b);
                        }
                        List<btd.c> list = this.o;
                        if (list != null) {
                            Iterator it = ((ArrayList) list).iterator();
                            while (it.hasNext()) {
                                ((btd.c) it.next()).N0(((LiveStatePlayer) this.m).W1(), parseInt2);
                            }
                            return;
                        }
                        return;
                    }
                    if (parseInt2 == 2 && (context = this.k) != null) {
                        v0u.b(context.getApplicationContext(), "切换成功");
                    }
                    s();
                    List<btd.c> list2 = this.o;
                    if (list2 != null) {
                        Iterator it2 = ((ArrayList) list2).iterator();
                        while (it2.hasNext()) {
                            ((btd.c) it2.next()).O1(((LiveStatePlayer) this.m).W1(), parseInt2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
