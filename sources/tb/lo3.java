package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import com.taobao.taolive.sdk.model.interact.MedalLevelEntity;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lo3 implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23457a;
    public final ux9 b;
    public HandlerThread c;
    public Handler d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f23458a;
        public int b;
        public String c;
        public String d;

        static {
            t2o.a(295698585);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f23459a;
        public List<b> b;
        public final d c;
        public final WeakReference<Context> d;
        public final long e;
        public final int f;
        public String i;
        public String j;
        public String k;
        public final List<ChatMessage> l;
        public ChatMessage m;
        public final ITaoLiveKtEmojiManager n;
        public int o = -1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.b(c.this) != null) {
                    c.b(c.this).a(c.d(c.this), System.currentTimeMillis() - c.e(c.this));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements uvd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MedalLevelEntity f23461a;
            public final /* synthetic */ ChatMessage b;
            public final /* synthetic */ List c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;

            public b(MedalLevelEntity medalLevelEntity, ChatMessage chatMessage, List list, int i, int i2) {
                this.f23461a = medalLevelEntity;
                this.b = chatMessage;
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
                q0h.a("ChatPreProcessor3", "generateMedalList error url:" + this.f23461a.medalIcon);
                c.h(c.this, this.b, this.c, new SpannableString(this.f23461a.medalType), this.d, this.e);
            }

            @Override // tb.uvd
            public void onSuccess(Object obj) {
                SpannableString spannableString;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    return;
                }
                q0h.b("ChatPreProcessor3", "generateMedalList url:" + this.f23461a.medalIcon);
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                bitmapDrawable.setBounds(0, 0, (c.f(c.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), c.f(c.this));
                if (this.f23461a.type != 2) {
                    spannableString = new SpannableString(this.f23461a.medalType);
                    spannableString.setSpan(new o34(bitmapDrawable), 0, this.f23461a.medalType.length(), 17);
                } else if (!lvs.i() || TextUtils.isEmpty(this.f23461a.text)) {
                    spannableString = null;
                } else {
                    String str = this.f23461a.text;
                    if (str.length() > 3) {
                        str = str.substring(0, 3);
                    }
                    spannableString = new SpannableString(str);
                    spannableString.setSpan(new co1((Context) c.g(c.this).get(), bitmapDrawable, str), 0, str.length(), 17);
                }
                if (spannableString != null) {
                    c.h(c.this, this.b, this.c, spannableString, this.d, this.e);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.lo3$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0983c implements uvd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f23462a;
            public final /* synthetic */ List b;
            public final /* synthetic */ int c;

            public C0983c(b bVar, List list, int i) {
                this.f23462a = bVar;
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
                q0h.a("ChatPreProcessor3", "generateStickerByIndex error url:" + this.f23462a.d);
                this.b.add(new SpannableString(this.f23462a.c));
                c.i(c.this, this.b, this.c + 1);
            }

            @Override // tb.uvd
            public void onSuccess(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    return;
                }
                if (((Context) c.g(c.this).get()) != null) {
                    q0h.b("ChatPreProcessor3", "generateStickerByIndex url:" + this.f23462a.d);
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    bitmapDrawable.setBounds(0, 0, (c.f(c.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), c.f(c.this));
                    SpannableString spannableString = new SpannableString(this.f23462a.c);
                    spannableString.setSpan(new o34(bitmapDrawable), 0, this.f23462a.c.length(), 17);
                    this.b.add(spannableString);
                }
                c.i(c.this, this.b, this.c + 1);
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
                c.j(c.this).mSpannableContent = new ArrayList();
                c.j(c.this).mSpannableContent.add(new SpannableString(c.c(c.this)));
                c.a(c.this);
            }

            @Override // tb.uvd
            public void onSuccess(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    return;
                }
                c.j(c.this).mSpannableContent = new ArrayList();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                bitmapDrawable.setBounds(0, 0, (c.f(c.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), c.f(c.this));
                SpannableString spannableString = new SpannableString(c.c(c.this));
                spannableString.setSpan(new o34(bitmapDrawable), 0, c.c(c.this).length(), 17);
                c.j(c.this).mSpannableContent.add(spannableString);
                c.a(c.this);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class e implements Comparable<e> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f23464a;
            public SpannableString b;

            static {
                t2o.a(295698591);
            }

            private e() {
            }

            /* renamed from: a */
            public int compareTo(e eVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("1ba08ce9", new Object[]{this, eVar})).intValue();
                }
                return this.f23464a - eVar.f23464a;
            }
        }

        static {
            t2o.a(295698586);
        }

        public c(ux9 ux9Var, Context context, List<ChatMessage> list, int i, d dVar) {
            this.d = new WeakReference<>(context);
            this.l = list;
            this.c = dVar;
            this.f = i;
            if (d9m.f() != null) {
                this.n = d9m.f().getEmojiManager();
            }
            this.e = System.currentTimeMillis();
        }

        public static /* synthetic */ void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40e60e7", new Object[]{cVar});
            } else {
                cVar.q();
            }
        }

        public static /* synthetic */ d b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("841b1f84", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static /* synthetic */ String c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d942eb08", new Object[]{cVar});
            }
            return cVar.f23459a;
        }

        public static /* synthetic */ List d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("2a49f02", new Object[]{cVar});
            }
            return cVar.l;
        }

        public static /* synthetic */ long e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2e32de78", new Object[]{cVar})).longValue();
            }
            return cVar.e;
        }

        public static /* synthetic */ int f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3c3f0856", new Object[]{cVar})).intValue();
            }
            return cVar.f;
        }

        public static /* synthetic */ WeakReference g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("ad5c8810", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ void h(c cVar, ChatMessage chatMessage, List list, SpannableString spannableString, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9c6b50b", new Object[]{cVar, chatMessage, list, spannableString, new Integer(i), new Integer(i2)});
            } else {
                cVar.k(chatMessage, list, spannableString, i, i2);
            }
        }

        public static /* synthetic */ void i(c cVar, List list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("befbae33", new Object[]{cVar, list, new Integer(i)});
            } else {
                cVar.o(list, i);
            }
        }

        public static /* synthetic */ ChatMessage j(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChatMessage) ipChange.ipc$dispatch("d054b32f", new Object[]{cVar});
            }
            return cVar.m;
        }

        public final void k(ChatMessage chatMessage, List<e> list, SpannableString spannableString, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a41f799", new Object[]{this, chatMessage, list, spannableString, new Integer(i), new Integer(i2)});
                return;
            }
            e eVar = new e();
            eVar.b = spannableString;
            eVar.f23464a = i;
            list.add(eVar);
            if (list.size() == i2) {
                q0h.a("ChatPreProcessor3", "medal download finish");
                Collections.sort(list);
                ArrayList arrayList = new ArrayList();
                for (e eVar2 : list) {
                    arrayList.add(eVar2.b);
                }
                chatMessage.mCommentIcons = arrayList;
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
                this.m.mSpannableContent = new ArrayList();
                this.m.mSpannableContent.add(new SpannableString(this.f23459a));
                q();
                return;
            }
            v2s.o().n().load(gq0.l().a(str)).b(new d()).a();
        }

        public final void m(ChatMessage chatMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ed561e", new Object[]{this, chatMessage});
                return;
            }
            List<MedalLevelEntity> p = p(chatMessage.renders);
            if (p == null || p.isEmpty()) {
                n();
                return;
            }
            int size = p.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                MedalLevelEntity medalLevelEntity = p.get(i);
                gme.a(medalLevelEntity.medalIcon).b(new b(medalLevelEntity, chatMessage, arrayList, i, size)).a();
            }
        }

        public final void n() {
            TaoLiveKtEmojiIconItem matchedEmoji;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c5cae8f", new Object[]{this});
            } else if (!qvs.b0()) {
                q();
            } else if (!"anchor_custom_sticker".equals(this.i) || TextUtils.equals("2", this.j)) {
                this.b = new ArrayList();
                int i = 0;
                int i2 = -1;
                for (int i3 = 0; i3 < this.f23459a.length(); i3++) {
                    char charAt = this.f23459a.charAt(i3);
                    if ('[' == charAt) {
                        i2 = i3;
                    } else if (']' == charAt && i2 >= 0) {
                        int i4 = i3 + 1;
                        String substring = this.f23459a.substring(i2, i4);
                        ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.n;
                        if (!(iTaoLiveKtEmojiManager == null || (matchedEmoji = iTaoLiveKtEmojiManager.matchedEmoji(substring)) == null)) {
                            i++;
                            b bVar = new b();
                            bVar.f23458a = i2;
                            bVar.b = i4;
                            bVar.c = substring;
                            bVar.d = matchedEmoji.getThumbnail();
                            ((ArrayList) this.b).add(bVar);
                        }
                        i2 = -1;
                    }
                }
                if (i > 0) {
                    this.m.mSpannableContent = new ArrayList();
                    o(this.m.mSpannableContent, 0);
                    return;
                }
                q();
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
                if (((b) ((ArrayList) this.b).get(i3)).b < this.f23459a.length()) {
                    list.add(new SpannableString(this.f23459a.substring(((b) ((ArrayList) this.b).get(i3)).b)));
                }
                q();
            } else {
                b bVar = (b) ((ArrayList) this.b).get(i);
                if (bVar.f23458a > 0) {
                    String str = this.f23459a;
                    if (i != 0) {
                        i2 = ((b) ((ArrayList) this.b).get(i - 1)).b;
                    }
                    list.add(new SpannableString(str.substring(i2, bVar.f23458a)));
                }
                if (gq0.l() != null) {
                    v2s.o().n().load(bVar.d).b(new C0983c(bVar, list, i)).a();
                    return;
                }
                list.add(new SpannableString(bVar.c));
                o(list, i + 1);
            }
        }

        public final List<MedalLevelEntity> p(HashMap<String, String> hashMap) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d1e9813a", new Object[]{this, hashMap});
            }
            if (hashMap == null) {
                return null;
            }
            if (giv.c().b()) {
                str = hashMap.get(ChatMessage.KEY_MEDAL_LIST_DT);
            } else {
                str = hashMap.get(ChatMessage.KEY_MEDAL_LIST_TB);
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return JSON.parseArray(str, MedalLevelEntity.class);
        }

        public final void q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fac69c34", new Object[]{this});
                return;
            }
            int i = this.o + 1;
            this.o = i;
            if (i >= this.l.size()) {
                Context context = this.d.get();
                if (context != null) {
                    ((Activity) context).runOnUiThread(new a());
                    return;
                }
                return;
            }
            ChatMessage chatMessage = this.l.get(this.o);
            if (chatMessage.mType != ChatMessage.MessageType.TXT || TextUtils.isEmpty(chatMessage.mContent)) {
                q();
                return;
            }
            this.m = chatMessage;
            this.f23459a = chatMessage.mContent;
            this.i = chatMessage.renders.get("commentType");
            this.j = chatMessage.renders.get("stickerVersion");
            this.k = chatMessage.renders.get("stickerId");
            m(chatMessage);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void a(List<ChatMessage> list, long j);
    }

    static {
        t2o.a(295698583);
    }

    public lo3(ux9 ux9Var, Context context) {
        this.b = ux9Var;
        this.f23457a = context;
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
            HandlerThread handlerThread = new HandlerThread("Chat-PreProcess");
            this.c = handlerThread;
            handlerThread.start();
            this.d = new Handler(this.c.getLooper(), this);
        }
    }

    public final void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae870b4d", new Object[]{this, cVar});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 10086;
        obtain.obj = cVar;
        this.d.sendMessage(obtain);
    }

    public void d(String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a130c0", new Object[]{this, str, new Integer(i), dVar});
            return;
        }
        if (TextUtils.isEmpty(str) && dVar != null) {
            dVar.a(null, 0L);
        }
        ArrayList arrayList = new ArrayList();
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.mContent = str;
        arrayList.add(chatMessage);
        c(new c(this.b, this.f23457a, arrayList, i, dVar));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 10086) {
            Object obj = message.obj;
            if (obj instanceof c) {
                c.a((c) obj);
            }
        }
        return true;
    }
}
