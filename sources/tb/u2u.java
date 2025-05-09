package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.EffectResConfig;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.ArrayList;
import java.util.List;
import tb.g12;
import tb.lo3;
import tb.v2u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u2u extends v2u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final lo3 s;
    public final boolean u;
    public final int v;
    public final ITaoLiveKtEmojiManager w;
    public List<lo3.b> x;
    public List<SpannableString> y;
    public long n = 2000;
    public long o = 0;
    public String p = "";
    public boolean q = false;
    public boolean r = false;
    public final Runnable z = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements lo3.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TopAtmosphereMessage f29093a;

        public a(TopAtmosphereMessage topAtmosphereMessage) {
            this.f29093a = topAtmosphereMessage;
        }

        @Override // tb.lo3.d
        public void a(List<ChatMessage> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97158b76", new Object[]{this, list, new Long(j)});
                return;
            }
            if (list == null || list.isEmpty() || list.get(0) == null) {
                u2u.j(u2u.this, this.f29093a.data.content);
            } else {
                u2u.j(u2u.this, list.get(0).mContent);
            }
            u2u.this.i(3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements uvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lo3.b f29094a;
        public final /* synthetic */ List b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public b(lo3.b bVar, List list, String str, int i) {
            this.f29094a = bVar;
            this.b = list;
            this.c = str;
            this.d = i;
        }

        @Override // tb.uvd
        public void onError(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                return;
            }
            this.b.add(new SpannableString(this.f29094a.c));
            u2u.l(u2u.this, this.c, this.b, this.d + 1);
        }

        @Override // tb.uvd
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            q0h.b("TopAtmosphereCommentComboView", "generateStickerByIndex url:" + this.f29094a.d);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
            bitmapDrawable.setBounds(0, 0, (u2u.k(u2u.this) * bitmapDrawable.getIntrinsicWidth()) / bitmapDrawable.getIntrinsicHeight(), u2u.k(u2u.this));
            SpannableString spannableString = new SpannableString(this.f29094a.c);
            spannableString.setSpan(new o34(bitmapDrawable), 0, this.f29094a.c.length(), 17);
            this.b.add(spannableString);
            u2u.l(u2u.this, this.c, this.b, this.d + 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            v2u.b bVar = u2u.this.k;
            if (bVar != null) {
                TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType = TopAtmosphereMessage.TopAtmosphereMessageType.COMMENT_COMBO;
                TopAtmosphereMessage a2 = ((g12.a) bVar).a(topAtmosphereMessageType);
                if (a2 == null || u2u.m(u2u.this) == null || !u2u.m(u2u.this).equals(a2.data.contentHash)) {
                    u2u u2uVar = u2u.this;
                    u2uVar.b.postDelayed(u2uVar.z, 0L);
                    return;
                }
                u2u.this.b(a2.data.getCountShow());
                u2u u2uVar2 = u2u.this;
                u2uVar2.b.postDelayed(u2uVar2.z, u2u.n(u2uVar2));
                ((g12.a) u2u.this.k).b(topAtmosphereMessageType);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(u2u.this.f29752a, R.anim.taolive_certification_out_flexalocal);
                loadAnimation.setDuration(500L);
                loadAnimation.setAnimationListener(new v2u.a(5));
                u2u.this.b.startAnimation(loadAnimation);
            } catch (Throwable th) {
                o3s.b("TopAtmosphereCommentComboView", "mCommentComboRunnable e: " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(295698602);
    }

    public u2u(Context context, View view, v2u.b bVar, v2u.c cVar, lo3 lo3Var, ux9 ux9Var) {
        super(context, view, bVar, cVar, ux9Var);
        this.s = lo3Var;
        if (lo3Var != null) {
            lo3Var.b();
        }
        if (d9m.f() != null) {
            this.w = d9m.f().getEmojiManager();
        }
        this.u = k0r.w();
        this.v = hw0.b(context, 15.0f);
    }

    public static /* synthetic */ Object ipc$super(u2u u2uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/view/TopAtmosphereCommentComboView");
    }

    public static /* synthetic */ void j(u2u u2uVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d3d6c7", new Object[]{u2uVar, str});
        } else {
            u2uVar.r(str);
        }
    }

    public static /* synthetic */ int k(u2u u2uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4df18531", new Object[]{u2uVar})).intValue();
        }
        return u2uVar.v;
    }

    public static /* synthetic */ void l(u2u u2uVar, String str, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b569f09", new Object[]{u2uVar, str, list, new Integer(i)});
        } else {
            u2uVar.p(str, list, i);
        }
    }

    public static /* synthetic */ String m(u2u u2uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67011160", new Object[]{u2uVar});
        }
        return u2uVar.p;
    }

    public static /* synthetic */ long n(u2u u2uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58886e35", new Object[]{u2uVar})).longValue();
        }
        return u2uVar.n;
    }

    @Override // tb.v2u
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (this.r || this.q) {
            return true;
        }
        return false;
    }

    @Override // tb.v2u
    public void h(TopAtmosphereMessage topAtmosphereMessage) {
        TopAtmosphereMessage.ContentData contentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432d9b16", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage != null && (contentData = topAtmosphereMessage.data) != null && contentData.pushTime >= this.o) {
            String str = this.p;
            if (str == null || !str.equals(contentData.contentHash) || !this.q) {
                q(topAtmosphereMessage);
                if (!qvs.b0()) {
                    i(3);
                }
                this.r = true;
            } else {
                b(topAtmosphereMessage.data.getCountShow());
                this.b.removeCallbacks(this.z);
                this.b.postDelayed(this.z, this.n);
            }
            a(topAtmosphereMessage);
            TopAtmosphereMessage.ContentData contentData2 = topAtmosphereMessage.data;
            this.o = contentData2.pushTime;
            this.p = contentData2.contentHash;
        }
    }

    public final void o(String str) {
        TaoLiveKtEmojiIconItem matchedEmoji;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bef299", new Object[]{this, str});
            return;
        }
        this.x = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if ('[' == charAt) {
                i2 = i3;
            } else if (']' == charAt && i2 >= 0) {
                int i4 = i3 + 1;
                String substring = str.substring(i2, i4);
                ITaoLiveKtEmojiManager iTaoLiveKtEmojiManager = this.w;
                if (!(iTaoLiveKtEmojiManager == null || (matchedEmoji = iTaoLiveKtEmojiManager.matchedEmoji(substring)) == null)) {
                    i++;
                    lo3.b bVar = new lo3.b();
                    bVar.f23458a = i2;
                    bVar.b = i4;
                    bVar.c = substring;
                    bVar.d = matchedEmoji.getThumbnail();
                    this.x.add(bVar);
                }
                i2 = -1;
            }
        }
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            p(str, arrayList, 0);
            this.g.setText("");
            if (!this.y.isEmpty()) {
                for (SpannableString spannableString : this.y) {
                    this.g.append(spannableString);
                }
            }
            this.g.append(" ");
            return;
        }
        this.g.setText(str);
    }

    public final void p(String str, List<SpannableString> list, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1b72ce", new Object[]{this, str, list, new Integer(i)});
        } else if (i >= ((ArrayList) this.x).size()) {
            int i3 = i - 1;
            if (((lo3.b) ((ArrayList) this.x).get(i3)).b < str.length()) {
                list.add(new SpannableString(str.substring(((lo3.b) ((ArrayList) this.x).get(i3)).b)));
            }
        } else {
            lo3.b bVar = (lo3.b) ((ArrayList) this.x).get(i);
            if (bVar.f23458a > 0) {
                if (i != 0) {
                    i2 = ((lo3.b) ((ArrayList) this.x).get(i - 1)).b;
                }
                list.add(new SpannableString(str.substring(i2, bVar.f23458a)));
            }
            if (gq0.l() != null) {
                v2s.o().n().load(bVar.d).b(new b(bVar, list, str, i)).a();
                return;
            }
            list.add(new SpannableString(bVar.c));
            p(str, list, i + 1);
        }
    }

    public final void q(TopAtmosphereMessage topAtmosphereMessage) {
        ux9 ux9Var;
        List<EffectResConfig> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185ffb41", new Object[]{this, topAtmosphereMessage});
            return;
        }
        this.n = k0r.C();
        this.h.setText(topAtmosphereMessage.data.backgroundTitle);
        this.h.setTextSize(1, 10.0f);
        TextView textView = this.h;
        Typeface typeface = Typeface.DEFAULT;
        textView.setTypeface(typeface, 0);
        int b2 = hw0.b(this.f29752a, 16.0f);
        if (this.s == null || !qvs.b0()) {
            r(topAtmosphereMessage.data.content);
        } else {
            this.s.d(topAtmosphereMessage.data.content, b2, new a(topAtmosphereMessage));
        }
        this.g.setTextSize(1, 14.0f);
        this.g.setTypeface(typeface, 1);
        this.d.setVisibility(8);
        this.c.setImageUrl(topAtmosphereMessage.data.backgroundImg);
        this.i.setVisibility(0);
        this.i.setText(c(topAtmosphereMessage.data.getCountShow()));
        this.f.setVisibility(8);
        if (!TextUtils.isEmpty(topAtmosphereMessage.data.atmosphere) && (ux9Var = this.m) != null && (ux9Var.e() instanceof mhb) && (e = ((mhb) this.m.e()).e(topAtmosphereMessage.data.atmosphere)) != null && !e.isEmpty() && !TextUtils.isEmpty(e.get(0).effectRes)) {
            this.f.setVisibility(0);
            this.f.setImageUrl(gq0.l().a(e.get(0).effectRes));
        }
        e();
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d95880", new Object[]{this, str});
        } else if (this.u) {
            o(str);
        } else {
            this.g.setText(str);
        }
    }

    @Override // tb.v2u
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9923fcc", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.removeCallbacks(this.z);
        if (i == 3) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f29752a, R.anim.taolive_certification_in2_flexalocal);
                loadAnimation.setDuration(500L);
                loadAnimation.setAnimationListener(new v2u.a(4));
                this.b.startAnimation(loadAnimation);
            } catch (Exception e) {
                o3s.b("TopAtmosphereCommentComboView", "onEnterAnimationEnd exception: " + e.getMessage());
            }
        } else if (i == 4) {
            this.r = false;
            this.q = true;
            this.b.postDelayed(new c(), this.n);
        } else if (i == 5) {
            this.b.setVisibility(4);
            this.r = false;
            this.q = false;
            v2u.c cVar = this.l;
            if (cVar != null) {
                ((g12.b) cVar).a(TopAtmosphereMessage.TopAtmosphereMessageType.COMMENT_COMBO);
            }
        }
    }
}
