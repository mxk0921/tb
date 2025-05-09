package com.etao.feimagesearch.newresult.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Size;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.newresult.base.IrpRainbowManager;
import com.etao.feimagesearch.pipline.node.ImageTranslateNode;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.afu;
import tb.av6;
import tb.caa;
import tb.ckf;
import tb.cnf;
import tb.cvr;
import tb.cw1;
import tb.fnf;
import tb.foe;
import tb.gd2;
import tb.gy8;
import tb.h19;
import tb.h9;
import tb.hre;
import tb.i0u;
import tb.ivn;
import tb.jzu;
import tb.k7m;
import tb.kqu;
import tb.l53;
import tb.lg4;
import tb.lk0;
import tb.lre;
import tb.lz1;
import tb.mh1;
import tb.mh7;
import tb.mld;
import tb.my4;
import tb.mzu;
import tb.nmf;
import tb.omf;
import tb.ovn;
import tb.p64;
import tb.p7m;
import tb.pg1;
import tb.pmf;
import tb.pv8;
import tb.qk1;
import tb.qrl;
import tb.rdi;
import tb.ri7;
import tb.t2o;
import tb.tn1;
import tb.trl;
import tb.u7j;
import tb.u7m;
import tb.uem;
import tb.v7m;
import tb.vlf;
import tb.w7m;
import tb.wlf;
import tb.wmc;
import tb.wsq;
import tb.wxi;
import tb.wyn;
import tb.x7m;
import tb.xhv;
import tb.y7m;
import tb.yz3;
import tb.z39;
import tb.z7m;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpV2Presenter extends lz1<IrpWidget> implements cw1, y7m.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int MSG_PAGE_LOAD_TIMEOUT_CHECK = 2;
    public final Activity b;
    public boolean c;
    public final wlf d;
    public cnf e;
    public v7m f;
    public boolean g;
    public final ovn h;
    public final omf i;
    public boolean j;
    public boolean k;
    public JSONObject l;
    public boolean m;
    public AuctionItemVO n;
    public final Handler o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297130);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String uri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (u7m.d(caa.c())) {
                List<AlbumMediaItem> h = rdi.h(1L);
                if (!h.isEmpty()) {
                    AlbumMediaItem albumMediaItem = h.get(0);
                    long currentTimeMillis = System.currentTimeMillis() - (qrl.g(albumMediaItem.lastUpdateTime, 0L) * 1000);
                    IrpRainbowManager.a aVar = IrpRainbowManager.Companion;
                    if (currentTimeMillis <= aVar.a().e()) {
                        l53.d dVar = l53.Companion;
                        Uri uri2 = albumMediaItem.imgUri;
                        String str = "";
                        if (!(uri2 == null || (uri = uri2.toString()) == null)) {
                            str = uri;
                        }
                        dVar.k(str);
                        if (aVar.a().f()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put((JSONObject) TBAlbumImg.ATTR_IMG_KEY, albumMediaItem.imgUri.toString());
                            jSONObject.put((JSONObject) TBAlbumImg.ATTR_IMG_ROTATION, albumMediaItem.orientation);
                            jSONObject.put((JSONObject) "objectFit", pg1.ATOM_EXT_fill);
                            jSONObject.put((JSONObject) tn1.KEY_SHARE_CONFIG_SCREENSHOT, String.valueOf(rdi.c(albumMediaItem.imgFilePath)));
                            IrpV2Presenter.this.G().f1(jSONObject);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpV2Presenter f4794a;

            public a(IrpV2Presenter irpV2Presenter) {
                this.f4794a = irpV2Presenter;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f4794a.d0().finish();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpV2Presenter f4795a;

            public b(IrpV2Presenter irpV2Presenter) {
                this.f4795a = irpV2Presenter;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f4795a.d0().finish();
                }
            }
        }

        public c() {
        }

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", "pop");
            jSONObject.put((JSONObject) h9.KEY_POP_CONFIG, (String) IrpV2Presenter.Q(IrpV2Presenter.this));
            IrpV2Presenter.this.G().m1(jSONObject);
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else {
                IrpV2Presenter.P(IrpV2Presenter.this).post(new a(IrpV2Presenter.this));
            }
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
            } else {
                IrpV2Presenter.P(IrpV2Presenter.this).post(new b(IrpV2Presenter.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                IrpV2Presenter.this.G().Z0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            IrpV2Presenter.V(IrpV2Presenter.this);
            v7m O = IrpV2Presenter.O(IrpV2Presenter.this);
            if (O != null) {
                O.l(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface instanceof AlertDialog) {
                if (((AlertDialog) dialogInterface).isShowing()) {
                    dialogInterface.cancel();
                }
            } else if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            if (!IrpV2Presenter.this.d0().isFinishing()) {
                IrpV2Presenter.this.z0(true);
                IrpV2Presenter.this.d0().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                IrpV2Presenter.this.d0().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface instanceof AlertDialog) {
                if (((AlertDialog) dialogInterface).isShowing()) {
                    dialogInterface.cancel();
                }
            } else if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            if (!IrpV2Presenter.this.d0().isFinishing()) {
                IrpV2Presenter.this.z0(true);
                IrpV2Presenter.this.d0().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface instanceof AlertDialog) {
                if (((AlertDialog) dialogInterface).isShowing()) {
                    dialogInterface.cancel();
                }
            } else if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            IrpV2Presenter.V(IrpV2Presenter.this);
            v7m O = IrpV2Presenter.O(IrpV2Presenter.this);
            if (O != null) {
                O.l(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class k implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface instanceof AlertDialog) {
                if (((AlertDialog) dialogInterface).isShowing()) {
                    dialogInterface.cancel();
                }
            } else if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            if (!IrpV2Presenter.this.d0().isFinishing()) {
                IrpV2Presenter.this.d0().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                IrpV2Presenter.this.G().X0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class m implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface instanceof AlertDialog) {
                if (((AlertDialog) dialogInterface).isShowing()) {
                    dialogInterface.cancel();
                }
            } else if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            if (!IrpV2Presenter.this.d0().isFinishing()) {
                IrpV2Presenter.this.d0().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class p implements ImageSearchMtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpV2Presenter f4809a;

            public a(IrpV2Presenter irpV2Presenter) {
                this.f4809a = irpV2Presenter;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f4809a.G().S1(IrpV2Presenter.S(this.f4809a, null));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpV2Presenter f4810a;
            public final /* synthetic */ JSONObject b;

            public b(IrpV2Presenter irpV2Presenter, JSONObject jSONObject) {
                this.f4810a = irpV2Presenter;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    this.f4810a.G().S1(IrpV2Presenter.S(this.f4810a, this.b));
                }
            }
        }

        public p() {
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5be81ac", new Object[]{this, mtopResponse, str, str2, jSONObject});
            } else {
                IrpV2Presenter.P(IrpV2Presenter.this).post(new b(IrpV2Presenter.this, jSONObject));
            }
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void b(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2ca7b", new Object[]{this, str, str2, num, str3});
            } else {
                IrpV2Presenter.P(IrpV2Presenter.this).post(new a(IrpV2Presenter.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class q implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                IrpV2Presenter.this.d0().finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpV2Presenter f4813a;
            public final /* synthetic */ String b;

            public a(IrpV2Presenter irpV2Presenter, String str) {
                this.f4813a = irpV2Presenter;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                IrpV2Presenter.U(this.f4813a, com.etao.feimagesearch.history.a.j().o(this.f4813a.G().W().B().getValue(), this.b, null));
                if (lg4.c0()) {
                    this.f4813a.m(null);
                }
            }
        }

        public r() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String k = mld.k(IrpV2Presenter.this.G().E(), IrpV2Presenter.this.G().W().I(), 90);
            if (!TextUtils.isEmpty(k)) {
                IrpV2Presenter.P(IrpV2Presenter.this).post(new a(IrpV2Presenter.this, k));
            }
        }
    }

    static {
        t2o.a(481297129);
        t2o.a(481297108);
        t2o.a(481297329);
    }

    public /* synthetic */ IrpV2Presenter(Activity activity, IrpWidget irpWidget, boolean z, int i2, a07 a07Var) {
        this(activity, irpWidget, (i2 & 4) != 0 ? false : z);
    }

    public static final /* synthetic */ JSONObject N(IrpV2Presenter irpV2Presenter, JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ba4fb0f", new Object[]{irpV2Presenter, jSONObject, map});
        }
        return irpV2Presenter.W(jSONObject, map);
    }

    public static final /* synthetic */ v7m O(IrpV2Presenter irpV2Presenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v7m) ipChange.ipc$dispatch("4aa32f19", new Object[]{irpV2Presenter});
        }
        return irpV2Presenter.f;
    }

    public static final /* synthetic */ Handler P(IrpV2Presenter irpV2Presenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("22da87f3", new Object[]{irpV2Presenter});
        }
        return irpV2Presenter.o;
    }

    public static final /* synthetic */ JSONObject Q(IrpV2Presenter irpV2Presenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fd46ad28", new Object[]{irpV2Presenter});
        }
        return irpV2Presenter.l;
    }

    public static final /* synthetic */ void R(IrpV2Presenter irpV2Presenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988df190", new Object[]{irpV2Presenter});
        } else {
            irpV2Presenter.t0();
        }
    }

    public static final /* synthetic */ List S(IrpV2Presenter irpV2Presenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1da806a4", new Object[]{irpV2Presenter, jSONObject});
        }
        return irpV2Presenter.u0(jSONObject);
    }

    public static final /* synthetic */ void T(IrpV2Presenter irpV2Presenter, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d696da", new Object[]{irpV2Presenter, new Boolean(z), new Boolean(z2)});
        } else {
            irpV2Presenter.x0(z, z2);
        }
    }

    public static final /* synthetic */ void U(IrpV2Presenter irpV2Presenter, AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ce5e11", new Object[]{irpV2Presenter, auctionItemVO});
        } else {
            irpV2Presenter.n = auctionItemVO;
        }
    }

    public static final /* synthetic */ void V(IrpV2Presenter irpV2Presenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b0d5b4", new Object[]{irpV2Presenter});
        } else {
            irpV2Presenter.C0();
        }
    }

    public static /* synthetic */ Object ipc$super(IrpV2Presenter irpV2Presenter, String str, Object... objArr) {
        if (str.hashCode() == 1083424568) {
            super.I();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpV2Presenter");
    }

    public final void A0(cnf cnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0676ff", new Object[]{this, cnfVar});
        } else {
            this.e = cnfVar;
        }
    }

    public final void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6549572", new Object[]{this});
            return;
        }
        String x2 = lg4.x2();
        ckf.f(x2, "getIrpNotSafeDialogTip()");
        G().G1(-8, x2, null, new q(), "", this.b.getString(R.string.irp_error_message_finish_text));
    }

    @Override // tb.cw1
    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da11eb9", new Object[]{this, str});
        } else if (ckf.b("top", str)) {
            G().z1();
        }
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bfbd27", new Object[]{this});
            return;
        }
        this.o.removeMessages(2);
        this.o.sendEmptyMessageDelayed(2, 15000L);
    }

    @Override // tb.cw1
    public void D(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0068f4", new Object[]{this, rectF});
        } else {
            G().F1(yz3.m(rectF), true);
        }
    }

    public final void D0(v7m v7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c10357b", new Object[]{this, v7mVar});
            return;
        }
        this.f = v7mVar;
        if (v7mVar != null) {
            v7mVar.q(this);
        }
    }

    public final void E0() {
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced7f861", new Object[]{this});
            return;
        }
        nmf o2 = G().W().o();
        if (o2 != null && o2.w() != null && !G().W().V() && !G().W().U()) {
            if (G().W().I() == null) {
                Uri K = G().W().K();
                String str = "";
                if (!(K == null || (uri = K.toString()) == null)) {
                    str = uri;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.n = com.etao.feimagesearch.history.a.j().n(G().E(), G().W().B().getValue(), String.valueOf(G().W().K()), G().W().D(), null);
                }
            } else if (lg4.n4()) {
                z7m.c(new r());
            } else {
                this.n = com.etao.feimagesearch.history.a.j().m(G().E(), G().W().B().getValue(), G().W().I(), null);
                if (lg4.c0()) {
                    m(null);
                }
            }
            if (lg4.c0()) {
                m(null);
            }
        }
    }

    @Override // tb.lz1
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.lz1
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.I();
        afu.INSTANCE.h();
        this.o.removeCallbacksAndMessages(null);
        this.i.c();
    }

    public final JSONObject X(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72c59ac3", new Object[]{this, str, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        jSONObject.put((JSONObject) "tfskey", str);
        return jSONObject;
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b43a41", new Object[]{this});
            return;
        }
        this.h.b();
        qk1.b(G().W().j(), G().W().i(), G().W().L());
    }

    @Override // tb.cw1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620bb549", new Object[]{this});
        } else {
            this.b.finish();
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df20ae77", new Object[]{this});
        } else {
            z7m.c(new b());
        }
    }

    @Override // tb.cw1
    public JSONObject b() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47f27b25", new Object[]{this});
        }
        nmf o2 = G().T0().o();
        if (o2 == null) {
            map = null;
        } else {
            map = o2.q();
        }
        if (map == null) {
            return new JSONObject();
        }
        return new JSONObject(map);
    }

    @Override // tb.cw1
    public omf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omf) ipChange.ipc$dispatch("64b03849", new Object[]{this});
        }
        return this.i;
    }

    @Override // tb.cw1
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1dfd4", new Object[]{this});
        } else {
            G().W().v0(true);
        }
    }

    public final Activity d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.cw1
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6247246f", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.cw1
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b729aa24", new Object[]{this, str});
        } else {
            G().V1(str);
        }
    }

    public final boolean f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d487c1e", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // tb.cw1
    public void g(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac7d08b", new Object[]{this, new Integer(i2)});
        } else {
            G().H0(i2);
        }
    }

    public final cnf g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cnf) ipChange.ipc$dispatch("be6a1ed5", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.cw1
    public void h(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa822c52", new Object[]{this, new Integer(i2)});
        } else {
            G().T1(i2);
        }
    }

    public final void h0(x7m x7mVar) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538c3f2e", new Object[]{this, x7mVar});
        } else if (x7mVar.d()) {
            G().W().x0(kqu.c(x7mVar.a()));
            if (!this.j && G().S0() && (frameLayout = (FrameLayout) G().X()) != null) {
                frameLayout.post(new d());
            }
        }
    }

    @Override // tb.cw1
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24cce15", new Object[]{this, new Boolean(z)});
        }
    }

    public final void i0(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d741793", new Object[]{this, x7mVar});
        } else if (x7mVar.d()) {
            if (x7mVar.a() instanceof Integer) {
                IrpDatasource W = G().W();
                Object a2 = x7mVar.a();
                if (a2 != null) {
                    W.i0((Integer) a2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            } else if (kqu.m(x7mVar.a())) {
                IrpDatasource W2 = G().W();
                Object a3 = x7mVar.a();
                if (a3 != null) {
                    W2.h0(kqu.d(a3));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String?, kotlin.String?>");
            }
        }
    }

    @Override // tb.cw1
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1d13c5", new Object[]{this, str});
        } else {
            G().U1(str);
        }
    }

    public final void k0(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eed96c95", new Object[]{this, x7mVar});
        } else if (x7mVar.d() && (x7mVar.a() instanceof lre)) {
            IrpDatasource W = G().W();
            Object a2 = x7mVar.a();
            if (a2 != null) {
                W.g0(((lre) a2).b());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.pipline.model.ImgProcessResult");
        }
    }

    @Override // tb.cw1
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34eb5914", new Object[]{this, new Boolean(z)});
        } else {
            G().O1(z);
        }
    }

    @Override // tb.cw1
    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade6b007", new Object[]{this, jSONObject});
            return;
        }
        AuctionItemVO auctionItemVO = this.n;
        if (auctionItemVO != null) {
            auctionItemVO.allowanceStatus = 1;
            com.etao.feimagesearch.history.a.j().t();
        }
    }

    @Override // tb.cw1
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ea104a", new Object[]{this, new Boolean(z)});
        } else {
            G().Q1(z);
        }
    }

    public final void n0(x7m x7mVar) {
        String str;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7408a7c0", new Object[]{this, x7mVar});
            return;
        }
        i iVar = new i();
        int i3 = -3;
        if (x7mVar instanceof gy8) {
            gy8 gy8Var = (gy8) x7mVar;
            Integer g2 = gy8Var.g();
            if (g2 != null && g2.intValue() == -10) {
                wlf wlfVar = this.d;
                if (wlfVar != null) {
                    wlfVar.h("NetRequest", "30013", "NoNetWork");
                }
                str = ckf.p(pv8.TIP_NETWORK_OFFLINE, "(30013)");
                cnf cnfVar = this.e;
                if (cnfVar != null) {
                    cnfVar.d();
                }
                iVar = null;
                i3 = -4;
            } else {
                if (gy8Var.g() == null) {
                    i2 = -6;
                } else {
                    Integer g3 = gy8Var.g();
                    ckf.d(g3);
                    i2 = g3.intValue();
                }
                wlf wlfVar2 = this.d;
                if (wlfVar2 != null) {
                    wlfVar2.h("NetRequest", String.valueOf(i2), gy8Var.h());
                }
                if (i2 == -17) {
                    str = Localization.q(R.string.taobao_app_1007_1_19002);
                    ckf.f(str, "{\n            errCode = …1007_1_19002)\n          }");
                    i3 = -6;
                } else if (i2 != -16) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) pv8.TIP_IMAGE_UPLOAD_ERROR);
                    sb.append('(');
                    sb.append(i2);
                    sb.append(')');
                    str = sb.toString();
                } else {
                    str = Localization.q(R.string.taobao_app_1007_1_19021);
                    ckf.f(str, "{\n            errCode = …1007_1_19021)\n          }");
                    i3 = -7;
                }
                p7m.a("irpTimeout", ckf.p("tm_tpp_fail ", G().W().B()));
            }
        } else {
            str = pv8.TIP_ERROR;
            ckf.f(str, "TIP_ERROR");
            wlf wlfVar3 = this.d;
            if (wlfVar3 != null) {
                wlfVar3.h("NetRequest", "30022", "unknown");
            }
            i3 = -3;
        }
        if (ckf.b(G().W().y(), "newyear25")) {
            str = "哎呀，现在参加活动人太多了，稍后试试吧";
            iVar = null;
        }
        IrpWidget.H1(G(), i3, str, iVar, new h(), null, null, 48, null);
    }

    @Override // tb.y7m.a
    public void o(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d240027", new Object[]{this, x7mVar});
            return;
        }
        ckf.g(x7mVar, "event");
        String b2 = x7mVar.b();
        if (b2 != null) {
            switch (b2.hashCode()) {
                case -670529065:
                    if (b2.equals("Invalid")) {
                        G().G0(true);
                        IrpWidget.H1(G(), -9, ckf.p(pv8.TIP_ERROR, "(-7)"), null, new k(), null, null, 48, null);
                        return;
                    }
                    return;
                case -544699821:
                    if (b2.equals("ImageTranslate")) {
                        l0(x7mVar);
                        return;
                    }
                    return;
                case -466095421:
                    if (!b2.equals("ImageSearch")) {
                        return;
                    }
                    break;
                case 417667782:
                    if (b2.equals("ImageFeatureExtract")) {
                        i0(x7mVar);
                        return;
                    }
                    return;
                case 453063860:
                    if (b2.equals(av6.IMAGE_PROCESS_TAG)) {
                        k0(x7mVar);
                        return;
                    }
                    return;
                case 651715211:
                    if (b2.equals("ImageCodeDetect")) {
                        h0(x7mVar);
                        return;
                    }
                    return;
                case 1125571777:
                    if (b2.equals("ImageLoad")) {
                        j0(x7mVar);
                        return;
                    }
                    return;
                case 1372034246:
                    if (!b2.equals("ImageMockResponse")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            m0(x7mVar);
        }
    }

    public final void o0() {
        JSONObject jSONObject;
        String c2;
        String str;
        Uri K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3774a834", new Object[]{this});
            return;
        }
        G().R1(1.0f, 1.0f);
        G().W().d("objectFrom", Constants.Value.ORIGINAL);
        G().W().c("regionIndex", "0");
        G().W().d(k7m.KEY_DEVICE_TYPE, k7m.a());
        String str2 = "";
        if (G().W().S() && (K = G().W().K()) != null) {
            String uri = K.toString();
            l53.d dVar = l53.Companion;
            if (ckf.b(uri, dVar.d())) {
                G().W().d("isConSearch", "true");
                dVar.k(str2);
            }
        }
        G().W().d("fontSize", String.valueOf(caa.c().getResources().getConfiguration().fontScale));
        G().W().d("isElderVer", String.valueOf(cvr.INSTANCE.c()));
        if (G().W().W()) {
            String z = G().W().z("queryFromMainSearch");
            if (!TextUtils.isEmpty(z)) {
                G().W().d("queryFromMainSearch", z);
            }
        }
        if (G().W().T()) {
            l53.d dVar2 = l53.Companion;
            nmf o2 = G().W().o();
            if (o2 == null || (str = o2.h()) == null) {
                str = str2;
            }
            dVar2.j(str);
            if (u7m.d(this.b)) {
                G().W().d("albumUpdate", lk0.INSTANCE.b());
            } else {
                G().W().d("albumUpdate", "noaccess");
            }
        }
        String str3 = null;
        if (G().b1()) {
            nmf o3 = G().W().o();
            String w = o3 == null ? null : o3.w();
            if (w != null && !TextUtils.isEmpty(w)) {
                IrpWidget G = G();
                nmf o4 = G().W().o();
                G.o1(X(w, o4 == null ? null : o4.q()));
            }
        }
        if (G().b1()) {
            nmf o5 = G().W().o();
            JSONObject u = o5 == null ? null : o5.u();
            nmf o6 = G().W().o();
            jSONObject = W(u, o6 == null ? null : o6.q());
        } else {
            nmf o7 = G().W().o();
            JSONObject d2 = o7 == null ? null : o7.d();
            nmf o8 = G().W().o();
            jSONObject = W(d2, o8 == null ? null : o8.q());
        }
        G().G0(false);
        nmf o9 = G().W().o();
        if (o9 == null || o9.A()) {
            G().W().w().t(false);
        }
        if (G().W().Q()) {
            G().L1();
        } else {
            if (!G().W().b0()) {
                fnf w2 = G().W().w();
                nmf o10 = G().W().o();
                w2.v((o10 != null && !o10.y()) ? 0.5f : 0.0f);
            }
            if (!G().W().w().n()) {
                y0();
            }
            G().K1();
        }
        nmf o11 = G().W().o();
        if (o11 != null) {
            str3 = o11.c();
        }
        if (!TextUtils.isEmpty(str3)) {
            fnf w3 = G().W().w();
            nmf o12 = G().W().o();
            if (!(o12 == null || (c2 = o12.c()) == null)) {
                str2 = c2;
            }
            w3.x(str2);
        }
        G().n1(jSONObject);
    }

    @Override // tb.cw1
    public RectF p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("765d43cb", new Object[]{this, str});
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List z0 = wsq.z0(str, new String[]{","}, false, 0, 6, null);
        if (z0.size() != 4) {
            return null;
        }
        int[] x = G().W().x();
        if (!(x[0] == 0 || x[1] == 0)) {
            RectF rectF = new RectF(Float.parseFloat((String) z0.get(0)) / x[0], Float.parseFloat((String) z0.get(2)) / x[1], Float.parseFloat((String) z0.get(1)) / x[0], Float.parseFloat((String) z0.get(3)) / x[1]);
            if (rectF.left < 0.0f) {
                rectF.left = 0.0f;
            }
            if (rectF.right > 1.0f) {
                rectF.right = 1.0f;
            }
            if (rectF.top < 0.0f) {
                rectF.top = 0.0f;
            }
            if (rectF.bottom > 1.0f) {
                rectF.bottom = 1.0f;
            }
            if (rectF.width() >= 0.0f && rectF.width() <= 1.0f && rectF.height() >= 0.0f && rectF.height() <= 1.0f) {
                return rectF;
            }
        }
        return null;
    }

    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20d629f4", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.cw1
    public Bitmap q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bd9231c7", new Object[]{this});
        }
        return G().R0();
    }

    public final boolean q0() {
        String w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf2ae737", new Object[]{this})).booleanValue();
        }
        if (G().W().X()) {
            afu afuVar = afu.INSTANCE;
            nmf o2 = G().W().o();
            String str = "";
            if (!(o2 == null || (w = o2.w()) == null)) {
                str = w;
            }
            afuVar.f(str);
        }
        return G().W().X();
    }

    @Override // tb.cw1
    public void r(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d028f57b", new Object[]{this, new Boolean(z), str});
        } else {
            G().y1(z, str);
        }
    }

    @Override // tb.cw1
    public Bitmap s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4bf34a35", new Object[]{this});
        }
        return G().W().H();
    }

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76014542", new Object[]{this});
        } else {
            C0();
        }
    }

    @Override // tb.cw1
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b883a5c", new Object[]{this});
        }
    }

    @Override // tb.cw1
    public void v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff74791", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "popLayerConfig");
        this.l = jSONObject;
    }

    @Override // tb.cw1
    public void w(boolean z, boolean z2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a76077", new Object[]{this, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (z) {
            G().N1(jSONObject);
            G().w0(z2);
        } else {
            G().t1(false, true);
        }
    }

    @Override // tb.cw1
    public void x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75046c9", new Object[]{this, jSONObject});
        } else {
            G().M1(jSONObject);
        }
    }

    public void z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c9181c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class n implements ImageSearchMtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map<String, String> b;

        public n(Map<String, String> map) {
            this.b = map;
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void b(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2ca7b", new Object[]{this, str, str2, num, str3});
                return;
            }
            IrpV2Presenter.this.G().h1();
            IrpV2Presenter.T(IrpV2Presenter.this, false, false);
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5be81ac", new Object[]{this, mtopResponse, str, str2, jSONObject});
                return;
            }
            JSONObject N = IrpV2Presenter.N(IrpV2Presenter.this, nmf.Companion.b(jSONObject).d(), this.b);
            N.put((JSONObject) "header", "new");
            IrpV2Presenter.this.G().n1(N);
            jzu.f("Page_PhotoSearchResult", "irpMnnLogs", IrpV2Presenter.this.G().W().e());
            IrpV2Presenter.T(IrpV2Presenter.this, true, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class o implements ImageSearchMtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map<String, String> b;

        public o(Map<String, String> map) {
            this.b = map;
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void b(String str, String str2, Integer num, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2ca7b", new Object[]{this, str, str2, num, str3});
                return;
            }
            IrpV2Presenter.this.G().h1();
            IrpV2Presenter.T(IrpV2Presenter.this, false, false);
        }

        @Override // com.etao.feimagesearch.util.ImageSearchMtopUtil.a
        public void a(MtopResponse mtopResponse, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5be81ac", new Object[]{this, mtopResponse, str, str2, jSONObject});
                return;
            }
            JSONObject N = IrpV2Presenter.N(IrpV2Presenter.this, nmf.Companion.b(jSONObject).d(), this.b);
            N.put((JSONObject) "header", "new");
            IrpV2Presenter.this.G().n1(N);
            jzu.f("Page_PhotoSearchResult", "irpMnnLogs", IrpV2Presenter.this.G().W().e());
            IrpV2Presenter.T(IrpV2Presenter.this, true, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpV2Presenter(Activity activity, IrpWidget irpWidget, boolean z) {
        super(irpWidget);
        ckf.g(activity, "activity");
        ckf.g(irpWidget, "widget");
        this.b = activity;
        this.c = z;
        this.h = new ovn();
        this.i = new omf();
        this.o = new Handler(Looper.getMainLooper(), new j());
        C0();
        if (activity instanceof vlf) {
            this.d = ((vlf) activity).p1();
        }
    }

    @Override // tb.cw1
    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7612e017", new Object[]{this, str});
        } else {
            G().W1(!ckf.b("search", str));
        }
    }

    public final JSONObject W(JSONObject jSONObject, Map<String, String> map) {
        Map<String, String> s;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1bf6682", new Object[]{this, jSONObject, map});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (G().b1()) {
            jSONObject2.put((JSONObject) "searchResult", (String) jSONObject);
        } else {
            jSONObject2.put((JSONObject) "result", (String) jSONObject);
        }
        jSONObject2.put((JSONObject) "error", (String) 0);
        if (map == null) {
            map = null;
        } else if (!map.containsKey("imgFeatureExtractInfo") && (s = G().W().s()) != null) {
            map.putAll(s);
        }
        jSONObject2.put((JSONObject) "searchParams", (String) map);
        jSONObject2.put((JSONObject) "pageParams", (String) G().W().A());
        jSONObject2.put((JSONObject) "clientUTParams", (String) G().W().m());
        jSONObject2.put((JSONObject) PopConst.POP_CLIENT_PARAMS_KEY, (String) G().W().k());
        jSONObject2.put((JSONObject) "header", "new");
        Boolean c2 = wyn.c(new IrpV2Presenter$assembleSearchPageResult$aiWidgetState$1(this));
        if (c2 != null) {
            z = c2.booleanValue();
        }
        jSONObject2.put((JSONObject) "aiWidgetEnable", String.valueOf(z));
        return jSONObject2;
    }

    @Override // tb.cw1
    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        try {
            Activity E = G().E();
            Object systemService = E.getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(E.getWindow().getDecorView().getWindowToken(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ea7f83", new Object[]{this});
        } else if (!this.g) {
            this.j = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = "30022";
            linkedHashMap.put("errCode", str);
            if (!G().c1()) {
                p7m.a("irpTimeout", ckf.p("tm_mus_fail ", G().W().B()));
                wlf wlfVar = this.d;
                str = "30031";
                if (wlfVar != null) {
                    wlfVar.h("PageLoad", str, "tm_mus_fail");
                }
                linkedHashMap.put("errMsg", "mus_load_failure");
            } else if (G().W().o() == null) {
                wlf wlfVar2 = this.d;
                if (wlfVar2 != null) {
                    wlfVar2.h("PageLoad", str, "request_timeout");
                }
                p7m.a("irpTimeout", ckf.p("tm_tpp_fail ", G().W().B()));
                linkedHashMap.put("errMsg", "request_timeout");
            } else {
                p7m.a("irpTimeout", ckf.p("tm_mus_load_timeout ", G().W().B()));
                wlf wlfVar3 = this.d;
                if (wlfVar3 != null) {
                    wlfVar3.h("PageLoad", str, "mus_load_timeout");
                }
                linkedHashMap.put("errMsg", "mus_load_timeout");
            }
            TLogTracker.k("IrpLoadTimeout", linkedHashMap);
            IrpWidget G = G();
            IrpWidget.H1(G, -5, pv8.TIP_ERROR + '(' + str + ')', null, new m(), null, null, 48, null);
        }
    }

    @Override // tb.cw1
    public Map<String, Object> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f8844051", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        nmf o2 = G().W().o();
        Map<String, String> map = null;
        jSONObject.put((JSONObject) "result", (String) (o2 == null ? null : o2.d()));
        jSONObject.put((JSONObject) "error", (String) 0);
        nmf o3 = G().W().o();
        if (o3 != null) {
            map = o3.q();
        }
        jSONObject.put((JSONObject) "searchParams", (String) map);
        jSONObject.put((JSONObject) "header", "new");
        return jSONObject;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            ckf.g(message, "msg");
            if (message.what != 2) {
                return false;
            }
            IrpV2Presenter.R(IrpV2Presenter.this);
            return true;
        }
    }

    public final void Z(Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403aac7", new Object[]{this, pair, pair2});
            return;
        }
        ckf.g(pair, "srcLang");
        ckf.g(pair2, "targetLang");
        G().v1(false);
        G().M0();
        G().x1(false);
        G().J1();
        v7m v7mVar = this.f;
        if (v7mVar != null) {
            v7mVar.i(new ImageTranslateNode(null, new Pair(pair, pair2), false, 1, null), true);
        }
    }

    public final boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e334d5a0", new Object[]{this})).booleanValue();
        }
        if (this.m || p0()) {
            return false;
        }
        uem.m(h19.i(this.l, "popLayerUrl", ""), "").j(new c()).l();
        this.m = true;
        return true;
    }

    public final boolean c0(gy8 gy8Var) {
        Map<String, String> s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2296e526", new Object[]{this, gy8Var})).booleanValue();
        }
        nmf nmfVar = (nmf) gy8Var.a();
        Map<String, String> q2 = nmfVar == null ? null : nmfVar.q();
        if (q2 == null || q2.containsKey("imgExtractInfo") || TextUtils.isEmpty(lg4.r2()) || (s = G().W().s()) == null || s.isEmpty() || !lg4.p0() || lg4.C4(G().W().y())) {
            return false;
        }
        Integer g2 = gy8Var.g();
        return (g2 == null || g2.intValue() != -10) && (g2 == null || g2.intValue() != -16) && (g2 == null || g2.intValue() != -17);
    }

    public final int[] e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("7ba369ea", new Object[]{this});
        }
        String[] C2 = lg4.C2();
        int[] iArr = null;
        if (C2.length >= 2) {
            try {
                String str = C2[0];
                ckf.f(str, "sizeConfigStrArr[0]");
                int parseInt = Integer.parseInt(str);
                String str2 = C2[1];
                ckf.f(str2, "sizeConfigStrArr[1]");
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt > 0 && parseInt2 > 0) {
                    iArr = new int[]{parseInt, parseInt2};
                }
            } catch (Exception unused) {
            }
        }
        return iArr == null ? new int[]{224, 224} : iArr;
    }

    @Override // tb.cw1
    public void j(String str, boolean z) {
        JSONObject jSONObject;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e5e7b8", new Object[]{this, str, new Boolean(z)});
        } else if (this.g || this.j) {
            G().X0();
        } else {
            this.g = true;
            if (z) {
                pmf.v0();
                wlf wlfVar = this.d;
                if (wlfVar != null) {
                    wlfVar.i("PageLoad");
                }
            }
            G().W().j0(str);
            if (lg4.N4()) {
                G().y1(true, "https://gw.alicdn.com/imgextra/i4/O1CN01FgpGTc1FdczEXTRZK_!!6000000000510-2-tps-1500-1800.png");
            }
            E0();
            try {
                jSONObject = JSON.parseObject(G().W().v());
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                JSONObject d2 = h19.d(jSONObject, "pageParams");
                cnf g0 = g0();
                if (g0 != null) {
                    g0.f(d2);
                }
                pmf.A0(h19.d(jSONObject, "perfStatics"));
            }
            String y = G().W().y();
            String value = G().W().B().getValue();
            nmf o2 = G().W().o();
            if (o2 != null) {
                i2 = o2.p();
            }
            mzu.q("Page_PhotoSearchResult", "IrpShow", "pssource", y, wxi.KEY_PHOTO_FROM, value, "networkQualityLevel", String.valueOf(i2), "deviceLevel", String.valueOf(ri7.b()));
            this.o.postDelayed(new l(), 100L);
            pmf.w0();
            jzu.f("Page_PhotoSearchResult", "irpMnnLogs", G().W().e());
        }
    }

    public final void l0(x7m x7mVar) {
        String str;
        Integer g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23216f", new Object[]{this, x7mVar});
            return;
        }
        G().G0(true);
        if (!x7mVar.d()) {
            if (!(x7mVar instanceof gy8) || (g2 = ((gy8) x7mVar).g()) == null || g2.intValue() != -10099) {
                str = "没有识别到，再试一次吧";
            } else {
                str = "没有识别到可翻译的文字";
            }
            afu.INSTANCE.g(false, str);
            Pair pair = (Pair) x7mVar.a();
            if (pair != null && !((Boolean) pair.getFirst()).booleanValue()) {
                G().P1((Pair) ((Pair) pair.getSecond()).getFirst(), (Pair) ((Pair) pair.getSecond()).getSecond());
                G().x1(true);
                i0u.b().d(this.b, str);
                return;
            }
            G().G1(-1, str, null, new g(), "", wmc.CONFIRM);
            return;
        }
        this.g = true;
        Object a2 = x7mVar.a();
        if (a2 != null) {
            Pair pair2 = (Pair) a2;
            G().X1((ArrayList) pair2.getSecond());
            G().P1((Pair) ((Pair) pair2.getFirst()).getFirst(), (Pair) ((Pair) pair2.getFirst()).getSecond());
            G().x1(true);
            afu afuVar = afu.INSTANCE;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "result", JSON.toJSONString(pair2.getSecond()));
            jSONObject.put((JSONObject) "config", ((String) ((Pair) ((Pair) pair2.getFirst()).getFirst()).getSecond()) + '_' + ((String) ((Pair) ((Pair) pair2.getFirst()).getSecond()).getSecond()));
            xhv xhvVar = xhv.INSTANCE;
            String jSONString = jSONObject.toJSONString();
            ckf.f(jSONString, "JSONObject().apply {\n   …nd}\"\n    }.toJSONString()");
            afuVar.g(true, jSONString);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<kotlin.Pair<kotlin.Pair<kotlin.String, kotlin.String>, kotlin.Pair<kotlin.String, kotlin.String>>, java.util.ArrayList<com.etao.feimagesearch.translate.bean.TranslateResult>{ kotlin.collections.TypeAliasesKt.ArrayList<com.etao.feimagesearch.translate.bean.TranslateResult> }>");
    }

    public final void r0(RectF rectF, Integer num) {
        JSONObject d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3ef9f9", new Object[]{this, rectF, num});
            return;
        }
        ckf.g(rectF, "newRegion");
        G().W().d0("regionIndex");
        G().t1(false, true);
        if (!(num == null || (d2 = this.i.d(num)) == null)) {
            mzu.k("Page_PhotoSearchResult", "changeOldRegion", ckf.p("index=", num));
            if (lg4.W0()) {
                G().W().d("changeOldRegion", WXStorageModule.NAME);
                nmf o2 = G().W().o();
                JSONObject W = W(d2, o2 == null ? null : o2.q());
                W.put((JSONObject) "header", "new");
                G().n1(W);
                return;
            }
        }
        G().W().d("changeOldRegion", "common");
        if (num == null || num.intValue() < 0) {
            G().W().c("regionIndex", String.valueOf(G().U0()));
        } else {
            G().W().c("regionIndex", num.toString());
        }
        nmf o3 = G().W().o();
        if (o3 != null && o3.D()) {
            v0(rectF);
        } else {
            w0(rectF);
        }
    }

    public final void v0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd497717", new Object[]{this, rectF});
            return;
        }
        Bitmap d2 = gd2.d(G().W().H(), rectF);
        if (d2 != null) {
            my4.c();
            G().i1();
            int[] e0 = e0();
            Bitmap n2 = gd2.n(d2, e0[0], e0[1]);
            if (n2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, String> c2 = u7j.c(G().W().y(), G().W().A());
                ckf.f(c2, "preHandleRequestExtraPar…dget.model.params\n      )");
                linkedHashMap.putAll(c2);
                linkedHashMap.put("regionChanged", "true");
                linkedHashMap.put("hasCropedImage", "true");
                linkedHashMap.put("originalRegion", G().W().p());
                Map<String, String> s = G().W().s();
                if (s != null) {
                    linkedHashMap.putAll(s);
                }
                this.h.c(n2, linkedHashMap, new n(linkedHashMap));
            }
        }
    }

    public final void w0(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6ead8c", new Object[]{this, rectF});
            return;
        }
        my4.c();
        G().i1();
        int[] x = G().W().x();
        RectF rectF2 = new RectF();
        float f2 = rectF.left;
        float f3 = x[0];
        rectF2.left = f2 * f3;
        float f4 = rectF.top;
        float f5 = x[1];
        rectF2.top = f4 * f5;
        rectF2.right = rectF.right * f3;
        rectF2.bottom = rectF.bottom * f5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> c2 = u7j.c(G().W().y(), G().W().A());
        ckf.f(c2, "preHandleRequestExtraPar…dget.model.params\n      )");
        linkedHashMap.putAll(c2);
        linkedHashMap.put("regionChanged", "true");
        linkedHashMap.put("hasCropedImage", "true");
        nmf o2 = G().W().o();
        String str = null;
        linkedHashMap.put("pltSession", o2 == null ? null : o2.m());
        Map<String, String> s = G().W().s();
        if (s != null) {
            linkedHashMap.putAll(s);
        }
        ovn ovnVar = this.h;
        nmf o3 = G().W().o();
        if (o3 != null) {
            str = o3.w();
        }
        ovnVar.d(str, rectF2, "0," + x[0] + ",0," + x[1], linkedHashMap, new o(linkedHashMap));
    }

    public final void x0(boolean z, boolean z2) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cea60d", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component", "client_monitor_api");
        linkedHashMap.put("requestDisasterRecovery", String.valueOf(z2));
        if (z2) {
            z3 = z;
        }
        linkedHashMap.put("disasterRecoverySuccess", String.valueOf(z3));
        linkedHashMap.put("finalSuccess", String.valueOf(z));
        v7m v7mVar = this.f;
        if (v7mVar != null) {
            v7mVar.i(new p64("37747", lg4.F1(), lg4.G1(), linkedHashMap, "plt-search-report", false), true);
        }
    }

    public final void y0() {
        LinkedList<mh7> g2;
        int E;
        String str;
        int i2;
        int i3;
        w7m f2;
        Size f3;
        w7m f4;
        Size f5;
        w7m f6;
        char c2 = 0;
        char c3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d02932", new Object[]{this});
        } else if (!this.k) {
            IrpDatasource W = G().W();
            if (W.w().d() && W.I() != null && (g2 = W.g()) != null && (E = W.E()) > 0) {
                this.k = true;
                if (E <= 1) {
                    G().S1(u0(null));
                    return;
                }
                int[] x = G().W().x();
                v7m v7mVar = this.f;
                String str2 = "";
                if (v7mVar == null || (f6 = v7mVar.f()) == null || (str = f6.n()) == null) {
                    str = str2;
                }
                v7m v7mVar2 = this.f;
                int width = (v7mVar2 == null || (f4 = v7mVar2.f()) == null || (f5 = f4.f()) == null) ? 0 : f5.getWidth();
                v7m v7mVar3 = this.f;
                int height = (v7mVar3 == null || (f2 = v7mVar3.f()) == null || (f3 = f2.f()) == null) ? 0 : f3.getHeight();
                JSONArray jSONArray = new JSONArray(E);
                Iterator<mh7> it = g2.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    i4++;
                    mh7 next = it.next();
                    if (!ckf.b(pv8.REGION_SCAN, next.b)) {
                        JSONObject jSONObject = new JSONObject();
                        RectF rectF = next.f24039a;
                        jSONObject.put((JSONObject) "imageId", String.valueOf(i4));
                        float f7 = rectF.left;
                        float f8 = x[c2];
                        int i5 = (int) (f7 * f8);
                        if (i5 >= 0 && i5 <= width) {
                            float f9 = rectF.top;
                            float f10 = x[c3];
                            int i6 = (int) (f9 * f10);
                            if (i6 >= 0 && i6 <= height && (i2 = (int) (rectF.right * f8)) >= 0 && i2 <= width && (i3 = (int) (rectF.bottom * f10)) >= 0 && i3 <= height) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(i5);
                                sb.append(',');
                                sb.append(i2);
                                sb.append(',');
                                sb.append(i6);
                                sb.append(',');
                                sb.append(i3);
                                jSONObject.put((JSONObject) "region", sb.toString());
                                jSONArray.add(jSONObject);
                            }
                        }
                    }
                    c2 = 0;
                    c3 = 1;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!jSONArray.isEmpty()) {
                    str2 = jSONArray.toJSONString();
                }
                linkedHashMap.put("imageInfos", str2);
                linkedHashMap.put("imgWidth", String.valueOf(width));
                linkedHashMap.put("imgHeight", String.valueOf(height));
                linkedHashMap.put("sversion", caa.i());
                linkedHashMap.put("utd_id", caa.o(caa.c()));
                linkedHashMap.put("debug", String.valueOf(caa.q()));
                linkedHashMap.put("api", "mtop.relationrecommend.PailitaoRecommend.recommend");
                linkedHashMap.put("imageBase64", str);
                linkedHashMap.put("scene", "multiObject");
                linkedHashMap.put("_sid_", "69148");
                linkedHashMap.put("source", "crop_digest_card");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("params", JSON.toJSONString(linkedHashMap));
                linkedHashMap2.put("appId", "32969");
                ImageSearchMtopUtil.p("mtop.relationrecommend.PailitaoRecommend.recommend", "1.0", linkedHashMap2, new p());
            }
        }
    }

    public final void m0(x7m x7mVar) {
        nmf o2;
        z39 h2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208fb2b", new Object[]{this, x7mVar});
            return;
        }
        Integer t = G().W().t();
        if (!(t == null || (h2 = hre.INSTANCE.h(Integer.valueOf(t.intValue()))) == null)) {
            if (h2.g()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("imgExtractInfo", h2.e());
                linkedHashMap.put("imgRongzaiExtraInfo", h2.d());
                G().W().h0(linkedHashMap);
            }
            pmf.m0(h2.a());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("result", h2.toString());
            linkedHashMap2.put("costTime", String.valueOf(h2.b()));
            linkedHashMap2.put("clientCostTime", String.valueOf(h2.a()));
            xhv xhvVar = xhv.INSTANCE;
            TLogTracker.r(hre.TAG, "GotResult", linkedHashMap2);
        }
        if (x7mVar.d()) {
            if (x7mVar.a() instanceof nmf) {
                IrpDatasource W = G().W();
                Object a2 = x7mVar.a();
                if (a2 != null) {
                    W.w0((nmf) a2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.newresult.base.IrpNetResultModel");
                }
            }
            if (lg4.M0() && (o2 = G().W().o()) != null && o2.i()) {
                this.o.removeMessages(2);
                B0();
            } else if (!q0()) {
                o0();
            }
            pmf.F0();
            wlf wlfVar = this.d;
            if (wlfVar != null) {
                wlfVar.i("NetRequest");
            }
            Object a3 = x7mVar.a();
            if (a3 != null) {
                if (((nmf) a3).C()) {
                    wlf wlfVar2 = this.d;
                    if (wlfVar2 != null) {
                        wlfVar2.h("NetRequestEmpty", "-1", "empty");
                    }
                } else {
                    wlf wlfVar3 = this.d;
                    if (wlfVar3 != null) {
                        wlfVar3.i("NetRequestEmpty");
                    }
                }
                nmf o3 = G().W().o();
                if (o3 != null) {
                    z = o3.B();
                }
                x0(true, z);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.newresult.base.IrpNetResultModel");
        }
        gy8 gy8Var = (gy8) x7mVar;
        nmf nmfVar = (nmf) gy8Var.a();
        boolean c0 = c0(gy8Var);
        if (nmfVar == null || !c0) {
            n0(x7mVar);
            nmf o4 = G().W().o();
            x0(false, o4 == null ? false : o4.B());
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Map<String, String> q2 = nmfVar.q();
        if (q2 != null) {
            linkedHashMap3.putAll(q2);
        }
        linkedHashMap3.put(ImageSearchMtopUtil.KEY_IMG, nmfVar.v());
        Map<String, String> s = G().W().s();
        if (s != null) {
            linkedHashMap3.putAll(s);
        }
        v7m v7mVar = this.f;
        if (v7mVar != null) {
            v7mVar.i(new foe(lg4.r2(), lg4.F1(), lg4.G1(), linkedHashMap3, "plt-search-drs", true, false, null, null, false, 960, null), true);
        }
    }

    public final List<ivn> u0(JSONObject jSONObject) {
        JSONObject d2;
        String str;
        JSONObject jSONObject2;
        MaResult maResult;
        ScancodeType scancodeType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ebdce8d7", new Object[]{this, jSONObject});
        }
        LinkedList<mh7> g2 = G().W().g();
        String str2 = null;
        if (g2 == null) {
            return null;
        }
        JSONArray c2 = h19.c(h19.d(jSONObject, "data"), "realtimeResult");
        int[] x = G().W().x();
        ArrayList arrayList = new ArrayList();
        Iterator<mh7> it = g2.iterator();
        while (it.hasNext()) {
            mh7 next = it.next();
            boolean b2 = ckf.b(next.b, pv8.REGION_SCAN);
            String f2 = trl.f(next.f24039a);
            ckf.f(f2, "regionKey");
            if (b2) {
                str = "nt_scan_code_hint";
            } else {
                str = "nt_region_digest";
            }
            if (b2) {
                jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "region", f2);
                nmf o2 = G().W().o();
                if (o2 != null) {
                    str2 = o2.w();
                }
                jSONObject2.put((JSONObject) "tfskey", str2);
                if (x.length == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(x[0]);
                    sb.append('_');
                    sb.append(x[1]);
                    jSONObject2.put((JSONObject) "imgSize", sb.toString());
                }
                zmf.a r2 = G().W().r(next.f24039a);
                jSONObject2.put((JSONObject) "type", (r2 == null || (scancodeType = r2.f) == null) ? null : scancodeType.toString());
                jSONObject2.put((JSONObject) "content", (r2 == null || (maResult = r2.f32866a) == null) ? null : maResult.getText());
                xhv xhvVar = xhv.INSTANCE;
            } else {
                jSONObject2 = null;
            }
            arrayList.add(new ivn(f2, str, jSONObject2, b2));
            str2 = null;
        }
        if (c2 == null) {
            c2 = new JSONArray();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = c2.size();
        int i2 = 0;
        while (i2 < size) {
            i2++;
            JSONObject jSONObject3 = c2.getJSONObject(i2);
            int g3 = h19.g(jSONObject3, "imageId", -1);
            if (g3 >= 0 && g3 < g2.size() && (d2 = h19.d(h19.d(jSONObject3, "objectData"), "showCardInfo")) != null) {
                String str3 = "";
                String i3 = h19.i(d2, "title", str3);
                JSONObject d3 = h19.d(d2, mh1.PRICE_BLOCK);
                if (d3 != null) {
                    str3 = h19.i(d3, "price", str3);
                }
                ((ivn) arrayList.get(g3)).e(d2);
                if (!TextUtils.isEmpty(i3) && !TextUtils.isEmpty(str3)) {
                    String str4 = i3 + '_' + ((Object) str3);
                    if (linkedHashSet.contains(str4)) {
                        ((ivn) arrayList.get(g3)).f(false);
                    } else {
                        ((ivn) arrayList.get(g3)).f(true);
                        linkedHashSet.add(str4);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void j0(x7m x7mVar) {
        String str;
        wlf wlfVar;
        Bitmap H;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce09438", new Object[]{this, x7mVar});
            return;
        }
        e eVar = null;
        Integer[] numArr = null;
        if (x7mVar.d()) {
            wlf wlfVar2 = this.d;
            if (wlfVar2 != null) {
                wlfVar2.i("ImageLoad");
            }
            pmf.o0();
            if (x7mVar.a() instanceof Bitmap) {
                IrpDatasource W = G().W();
                Object a2 = x7mVar.a();
                if (a2 != null) {
                    W.s0((Bitmap) a2);
                    G().B1(!G().W().w().e());
                    if (G().W().a0()) {
                        nmf o2 = G().W().o();
                        if (o2 != null) {
                            numArr = o2.s();
                        }
                        if (numArr == null) {
                            numArr = new Integer[]{640, 640};
                        }
                        float width = ((G().W().H() == null ? 0 : H.getWidth()) * 1.0f) / numArr[0].intValue();
                        Bitmap H2 = G().W().H();
                        if (H2 != null) {
                            i2 = H2.getHeight();
                        }
                        G().R1(width, (i2 * 1.0f) / numArr[1].intValue());
                        return;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
            }
            if (G().W().Q()) {
                G().a1(null);
                return;
            }
            return;
        }
        if (G().W().c0()) {
            if (G().W().Q()) {
                G().a1(null);
            }
        } else if (G().W().a0()) {
            G().Q1(true);
        } else if (G().W().P()) {
            G().D1();
            if (G().W().Q()) {
                G().a1(null);
            }
        } else {
            if ((x7mVar instanceof gy8) && (wlfVar = this.d) != null) {
                gy8 gy8Var = (gy8) x7mVar;
                wlfVar.h("ImageLoad", String.valueOf(gy8Var.g()), gy8Var.h());
            }
            if (G().W().V()) {
                str = ((Object) pv8.TIP_IMAGE_DOWNLOAD_ERROR) + "(30033)";
                eVar = new e();
            } else {
                str = ((Object) pv8.TIP_DECODE_FAILED) + "(30033)";
            }
            IrpWidget.H1(G(), G().W().V() ? -1 : -2, str, eVar, new f(), null, null, 48, null);
            return;
        }
        wlf wlfVar3 = this.d;
        if (wlfVar3 != null) {
            wlfVar3.i("ImageLoad");
        }
    }
}
