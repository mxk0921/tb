package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBadgeModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jzf implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22301a;
    public final ux9 b;
    public HandlerThread c;
    public Handler d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f22302a;
        public List<jme> b;
        public final yne c;
        public final WeakReference<Context> d;
        public final long e;
        public final int f;
        public String i;
        public String j;
        public String k;
        public final List<fzf> l;
        public fzf m;
        public final ITaoLiveKtEmojiManager n;
        public int o = -1;

        /* compiled from: Taobao */
        /* renamed from: tb.jzf$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0959a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0959a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.b(a.this) != null) {
                    a.b(a.this).a(a.c(a.this), System.currentTimeMillis() - a.d(a.this));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c implements uvd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ jme f22305a;
            public final /* synthetic */ List b;
            public final /* synthetic */ int c;

            public c(jme jmeVar, List list, int i) {
                this.f22305a = jmeVar;
                this.b = list;
                this.c = i;
            }

            @Override // tb.uvd
            public void onError(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                    return;
                }
                q0h.a("ChatPreProcessor3", "generateStickerByIndex error url:" + this.f22305a.d);
                this.b.add(new SpannableString(this.f22305a.c));
                a.h(a.this, this.b, this.c + 1);
            }

            @Override // tb.uvd
            public void onSuccess(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    return;
                }
                if (((Context) a.f(a.this).get()) != null) {
                    q0h.b("ChatPreProcessor3", "generateStickerByIndex url:" + this.f22305a.d);
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    bitmapDrawable.setBounds(0, 0, (a.e(a.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), a.e(a.this));
                    SpannableString spannableString = new SpannableString(this.f22305a.c);
                    spannableString.setSpan(new o34(bitmapDrawable), 0, this.f22305a.c.length(), 17);
                    this.b.add(spannableString);
                }
                a.h(a.this, this.b, this.c + 1);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class d implements uvd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            @Override // tb.uvd
            public void onError(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                    return;
                }
                a.i(a.this).c = new ArrayList();
                a.i(a.this).c.add(new SpannableString(a.j(a.this)));
                a.a(a.this);
            }

            @Override // tb.uvd
            public void onSuccess(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    return;
                }
                a.i(a.this).c = new ArrayList();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                bitmapDrawable.setBounds(0, 0, (a.e(a.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), a.e(a.this));
                SpannableString spannableString = new SpannableString(a.j(a.this));
                spannableString.setSpan(new o34(bitmapDrawable), 0, a.j(a.this).length(), 17);
                a.i(a.this).c.add(spannableString);
                a.a(a.this);
            }
        }

        static {
            t2o.a(295698669);
        }

        public a(ux9 ux9Var, Context context, List<fzf> list, int i, yne yneVar) {
            this.d = new WeakReference<>(context);
            this.l = list;
            this.c = yneVar;
            this.f = i;
            if (d9m.f() != null) {
                this.n = d9m.f().getEmojiManager();
            }
            this.e = System.currentTimeMillis();
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1c86316", new Object[]{aVar});
            } else {
                aVar.p();
            }
        }

        public static /* synthetic */ yne b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yne) ipChange.ipc$dispatch("1fbd526a", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ List c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("653ade73", new Object[]{aVar});
            }
            return aVar.l;
        }

        public static /* synthetic */ long d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa764067", new Object[]{aVar})).longValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed5adf85", new Object[]{aVar})).intValue();
            }
            return aVar.f;
        }

        public static /* synthetic */ WeakReference f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("7ecae7ff", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ void g(a aVar, fzf fzfVar, List list, SpannableString spannableString, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fddc188", new Object[]{aVar, fzfVar, list, spannableString, new Integer(i), new Integer(i2)});
            } else {
                aVar.k(fzfVar, list, spannableString, i, i2);
            }
        }

        public static /* synthetic */ void h(a aVar, List list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("741c6323", new Object[]{aVar, list, new Integer(i)});
            } else {
                aVar.o(list, i);
            }
        }

        public static /* synthetic */ fzf i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fzf) ipChange.ipc$dispatch("b4a8ed2d", new Object[]{aVar});
            }
            return aVar.m;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9fe21913", new Object[]{aVar});
            }
            return aVar.f22302a;
        }

        public final void k(fzf fzfVar, List<tbi> list, SpannableString spannableString, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5b6f6e7", new Object[]{this, fzfVar, list, spannableString, new Integer(i), new Integer(i2)});
                return;
            }
            tbi tbiVar = new tbi();
            tbiVar.b = spannableString;
            tbiVar.f28615a = i;
            list.add(tbiVar);
            if (list.size() == i2) {
                q0h.a("ChatPreProcessor3", "medal download finish");
                Collections.sort(list);
                ArrayList arrayList = new ArrayList();
                for (tbi tbiVar2 : list) {
                    if (tbiVar2.b.length() != 0) {
                        arrayList.add(tbiVar2.b);
                    }
                }
                fzfVar.b = arrayList;
                n();
            }
        }

        public final void l() {
            String str;
            TaoLiveKtEmojiIconItem matchedEmoji;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d77061e", new Object[]{this});
                return;
            }
            ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.n;
            if (iTaoLiveKtEmojiManager == null || (matchedEmoji = iTaoLiveKtEmojiManager.matchedEmoji(this.k)) == null) {
                str = "";
            } else {
                str = matchedEmoji.getThumbnail();
            }
            if (str == null || str.isEmpty()) {
                this.m.c = new ArrayList();
                ((ArrayList) this.m.c).add(new SpannableString(this.f22302a));
                p();
                return;
            }
            v2s.o().n().load(gq0.l().a(str)).b(new d()).a();
        }

        public final void m(fzf fzfVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb56b76c", new Object[]{this, fzfVar});
                return;
            }
            TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
            if (taoLiveKtCommentEntity != null) {
                List<TaoLiveKtCommentBadgeModel> badgeInfos = taoLiveKtCommentEntity.getBadgeInfos();
                if (badgeInfos == null || badgeInfos.isEmpty()) {
                    n();
                    return;
                }
                int size = badgeInfos.size();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < size; i++) {
                    TaoLiveKtCommentBadgeModel taoLiveKtCommentBadgeModel = badgeInfos.get(i);
                    if (nh4.v()) {
                        str = taoLiveKtCommentBadgeModel.getMedalIcon2();
                    } else {
                        str = taoLiveKtCommentBadgeModel.getMedalIcon();
                    }
                    gme.a(str).b(new b(taoLiveKtCommentBadgeModel, fzfVar, arrayList, i, size)).a();
                }
            }
        }

        public final void n() {
            TaoLiveKtEmojiIconItem matchedEmoji;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c5cae8f", new Object[]{this});
            } else if (!qvs.b0()) {
                p();
            } else if (!"anchor_custom_sticker".equals(this.i) || TextUtils.equals("2", this.j)) {
                this.b = new ArrayList();
                int i = 0;
                int i2 = -1;
                for (int i3 = 0; i3 < this.f22302a.length(); i3++) {
                    char charAt = this.f22302a.charAt(i3);
                    if ('[' == charAt) {
                        i2 = i3;
                    } else if (']' == charAt && i2 >= 0) {
                        int i4 = i3 + 1;
                        String substring = this.f22302a.substring(i2, i4);
                        ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.n;
                        if (!(iTaoLiveKtEmojiManager == null || (matchedEmoji = iTaoLiveKtEmojiManager.matchedEmoji(substring)) == null)) {
                            i++;
                            jme jmeVar = new jme();
                            jmeVar.f22074a = i2;
                            jmeVar.b = i4;
                            jmeVar.c = substring;
                            jmeVar.d = matchedEmoji.getThumbnail();
                            ((ArrayList) this.b).add(jmeVar);
                        }
                        i2 = -1;
                    }
                }
                if (i > 0) {
                    this.m.c = new ArrayList();
                    o(this.m.c, 0);
                    return;
                }
                p();
            } else {
                l();
            }
        }

        public final void o(List<SpannableString> list, int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c2bacd8", new Object[]{this, list, new Integer(i)});
            } else if (i >= ((ArrayList) this.b).size()) {
                int i3 = i - 1;
                if (((jme) ((ArrayList) this.b).get(i3)).b < this.f22302a.length()) {
                    list.add(new SpannableString(this.f22302a.substring(((jme) ((ArrayList) this.b).get(i3)).b)));
                }
                p();
            } else {
                jme jmeVar = (jme) ((ArrayList) this.b).get(i);
                if (jmeVar.f22074a > 0) {
                    String str = this.f22302a;
                    if (i != 0) {
                        i2 = ((jme) ((ArrayList) this.b).get(i - 1)).b;
                    }
                    list.add(new SpannableString(str.substring(i2, jmeVar.f22074a)));
                }
                if (gq0.l() != null) {
                    v2s.o().n().load(jmeVar.d).b(new c(jmeVar, list, i)).a();
                    return;
                }
                list.add(new SpannableString(jmeVar.c));
                o(list, i + 1);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements uvd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TaoLiveKtCommentBadgeModel f22304a;
            public final /* synthetic */ fzf b;
            public final /* synthetic */ List c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;

            public b(TaoLiveKtCommentBadgeModel taoLiveKtCommentBadgeModel, fzf fzfVar, List list, int i, int i2) {
                this.f22304a = taoLiveKtCommentBadgeModel;
                this.b = fzfVar;
                this.c = list;
                this.d = i;
                this.e = i2;
            }

            @Override // tb.uvd
            public void onError(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                    return;
                }
                o3s.b("ChatPreProcessor3", "error: " + fkx.i(obj));
                a.g(a.this, this.b, this.c, new SpannableString(""), this.d, this.e);
            }

            @Override // tb.uvd
            public void onSuccess(Object obj) {
                SpannableString spannableString;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    return;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                bitmapDrawable.setBounds(0, 0, (a.e(a.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), a.e(a.this));
                if (this.f22304a.getType() == null || this.f22304a.getType().intValue() != 2) {
                    spannableString = new SpannableString("placeholder");
                    spannableString.setSpan(new o34(bitmapDrawable), 0, 11, 17);
                } else {
                    String text = this.f22304a.getText();
                    if (!TextUtils.isEmpty(text)) {
                        if (text != null && text.length() > 3) {
                            text = text.substring(0, 3);
                        }
                        spannableString = new SpannableString(text);
                        spannableString.setSpan(new co1((Context) a.f(a.this).get(), bitmapDrawable, text), 0, text != null ? text.length() : 0, 17);
                    } else {
                        spannableString = null;
                    }
                }
                if (spannableString != null) {
                    a.g(a.this, this.b, this.c, spannableString, this.d, this.e);
                }
            }
        }

        public final void p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fac69c34", new Object[]{this});
                return;
            }
            int i = this.o + 1;
            this.o = i;
            if (i >= this.l.size()) {
                Context context = this.d.get();
                if (context instanceof Activity) {
                    ((Activity) context).runOnUiThread(new RunnableC0959a());
                    return;
                }
                return;
            }
            fzf fzfVar = this.l.get(this.o);
            TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
            if (taoLiveKtCommentEntity != null) {
                if (!TextUtils.isEmpty(taoLiveKtCommentEntity.getContent())) {
                    this.m = fzfVar;
                    this.f22302a = taoLiveKtCommentEntity.getContent();
                    Map<String, Object> renders = taoLiveKtCommentEntity.getRenders();
                    if (renders != null) {
                        this.i = (String) renders.get("commentType");
                        this.j = (String) renders.get("stickerVersion");
                        this.k = (String) renders.get("stickerId");
                    }
                    m(fzfVar);
                    return;
                }
                p();
            }
        }
    }

    static {
        t2o.a(295698668);
    }

    public jzf(ux9 ux9Var, Context context) {
        this.b = ux9Var;
        this.f22301a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread("KMPComment-PreProcess");
            this.c = handlerThread;
            handlerThread.start();
            this.d = new Handler(this.c.getLooper(), this);
        }
    }

    public final void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813c5fc", new Object[]{this, aVar});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 10086;
        obtain.obj = aVar;
        this.d.sendMessage(obtain);
    }

    public void d(List<fzf> list, int i, yne yneVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6235c8f0", new Object[]{this, list, new Integer(i), yneVar});
        } else {
            c(new a(this.b, this.f22301a, list, i, yneVar));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 10086) {
            Object obj = message.obj;
            if (obj instanceof a) {
                a.a((a) obj);
            }
        }
        return true;
    }
}
