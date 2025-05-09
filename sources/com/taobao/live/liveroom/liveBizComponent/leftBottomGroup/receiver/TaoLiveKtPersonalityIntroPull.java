package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.Regex;
import tb.a07;
import tb.azs;
import tb.ckf;
import tb.czs;
import tb.e3t;
import tb.exs;
import tb.g1a;
import tb.h2t;
import tb.l1t;
import tb.mhr;
import tb.rxs;
import tb.t2o;
import tb.tvr;
import tb.u1a;
import tb.vqx;
import tb.xhv;
import tb.xys;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003RG\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rj\u0004\u0018\u0001`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtPersonalityIntroPull;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "<init>", "()V", "", "", "", "data", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "mkPersonalizedGreetEntity", "(Ljava/util/Map;)Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "Ltb/xhv;", "pullMTopPersonalityIntro", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "personalityIntro", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtPersonalityIntroFetchCallback;", "fetchCallback", "Ltb/g1a;", "getFetchCallback", "()Ltb/g1a;", "setFetchCallback", "(Ltb/g1a;)V", vqx.HUMMER_FOUNDATION_GET_INTPUT_PARAMS, "()Ljava/util/Map;", "inputParams", "Companion", "a", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtPersonalityIntroPull extends TaoLiveKtComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private g1a<? super TaoLiveKtCommentEntity, xhv> fetchCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1010827370);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a(exs exsVar) {
            String str;
            czs a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70a6d79a", new Object[]{this, exsVar});
            }
            if (exsVar == null || (a2 = exsVar.a()) == null || (str = a2.a()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                return null;
            }
            return "personality_introduction_".concat(str);
        }

        public final boolean b(exs exsVar) {
            String str;
            czs a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9473641a", new Object[]{this, exsVar})).booleanValue();
            }
            e3t e3tVar = e3t.INSTANCE;
            if (!e3tVar.v()) {
                return false;
            }
            if (exsVar == null || (a2 = exsVar.a()) == null || (str = a2.n()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                return true;
            }
            if (c(exsVar)) {
                return false;
            }
            String z = e3tVar.z();
            if (z.length() == 0) {
                return false;
            }
            return new Regex(z).matches(str);
        }

        public final boolean c(exs exsVar) {
            KMPJsonObject kMPJsonObject;
            int i;
            int i2;
            czs a2;
            KMPJsonObject s;
            Integer num;
            String string;
            Integer num2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b132de6c", new Object[]{this, exsVar})).booleanValue();
            }
            String a3 = a(exsVar);
            String str = "";
            if (a3 == null) {
                a3 = str;
            }
            if (a3.length() == 0) {
                return false;
            }
            String str2 = mhr.Y().get(a3);
            if (str2 == null) {
                str2 = str;
            }
            Object a4 = KMPJSONUtils_androidKt.a(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, str2);
            if (a4 instanceof KMPJsonObject) {
                kMPJsonObject = (KMPJsonObject) a4;
            } else {
                kMPJsonObject = null;
            }
            String b = azs.INSTANCE.b();
            if (b == null) {
                b = str;
            }
            if (tvr.c(kMPJsonObject)) {
                d(a3, b, 1);
                return false;
            }
            if (kMPJsonObject == null || (num2 = kMPJsonObject.getInt("count")) == null) {
                i = 0;
            } else {
                i = num2.intValue();
            }
            if (!(kMPJsonObject == null || (string = kMPJsonObject.getString("date")) == null)) {
                str = string;
            }
            if (str.length() > 0 && b.length() > 0 && ckf.b(str, b)) {
                if (!h2t.INSTANCE.l()) {
                    i2 = e3t.INSTANCE.y();
                } else if (exsVar == null || (a2 = exsVar.a()) == null || (s = a2.s()) == null || (num = s.getInt("aiPersonalIntroduceMaxCount")) == null) {
                    i2 = e3t.INSTANCE.y();
                } else {
                    i2 = num.intValue();
                }
                if (i >= i2) {
                    return true;
                }
                i++;
            }
            d(a3, b, i);
            return false;
        }

        public final void d(String str, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2e54c5", new Object[]{this, str, str2, new Integer(i)});
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("date", str2);
            linkedHashMap.put("count", Integer.valueOf(i));
            String c = l1t.INSTANCE.c(linkedHashMap);
            if (c == null) {
                c = "";
            }
            if (c.length() > 0) {
                mhr.Y().set(str, c);
            }
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements u1a<Map<String, ? extends Object>, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(Map<String, ? extends Object> map, boolean z) {
            TaoLiveKtCommentEntity taoLiveKtCommentEntity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d6736ee", new Object[]{this, map, new Boolean(z)});
                return;
            }
            if (!z || map == null || !(!map.isEmpty())) {
                taoLiveKtCommentEntity = null;
            } else {
                taoLiveKtCommentEntity = TaoLiveKtPersonalityIntroPull.access$mkPersonalizedGreetEntity(TaoLiveKtPersonalityIntroPull.this, map);
            }
            g1a<TaoLiveKtCommentEntity, xhv> fetchCallback = TaoLiveKtPersonalityIntroPull.this.getFetchCallback();
            if (fetchCallback != null) {
                fetchCallback.invoke(taoLiveKtCommentEntity);
            }
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map, Boolean bool) {
            a(map, bool.booleanValue());
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827369);
    }

    public static final /* synthetic */ TaoLiveKtCommentEntity access$mkPersonalizedGreetEntity(TaoLiveKtPersonalityIntroPull taoLiveKtPersonalityIntroPull, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("11d1370f", new Object[]{taoLiveKtPersonalityIntroPull, map});
        }
        return taoLiveKtPersonalityIntroPull.mkPersonalizedGreetEntity(map);
    }

    private final Map<String, String> getInputParams() {
        String str;
        String str2;
        String str3;
        czs a2;
        String i;
        czs a3;
        czs a4;
        czs a5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad86a8b6", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        exs bizContext = getBizContext();
        String str4 = "";
        if (bizContext == null || (a5 = bizContext.a()) == null || (str = a5.a()) == null) {
            str = str4;
        }
        linkedHashMap.put(RequestConfig.KEY_ANCHOR_ID, str);
        exs bizContext2 = getBizContext();
        if (bizContext2 == null || (a4 = bizContext2.a()) == null || (str2 = a4.m()) == null) {
            str2 = str4;
        }
        linkedHashMap.put("liveId", str2);
        exs bizContext3 = getBizContext();
        if (bizContext3 == null || (a3 = bizContext3.a()) == null || (str3 = a3.v()) == null) {
            str3 = str4;
        }
        linkedHashMap.put("topic", str3);
        exs bizContext4 = getBizContext();
        if (!(bizContext4 == null || (a2 = bizContext4.a()) == null || (i = a2.i()) == null)) {
            str4 = i;
        }
        linkedHashMap.put("liveSource", str4);
        return linkedHashMap;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtPersonalityIntroPull taoLiveKtPersonalityIntroPull, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtPersonalityIntroPull");
    }

    private final TaoLiveKtCommentEntity mkPersonalizedGreetEntity(Map<String, ? extends Object> map) {
        String str;
        KMPJsonObject jsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("5ea922bd", new Object[]{this, map});
        }
        czs czsVar = null;
        if (!(map instanceof Object)) {
            map = null;
        }
        KMPJsonObject jsonObject2 = new KMPJsonObject(map).getJsonObject("data");
        Map<String, ? extends Object> map2 = (jsonObject2 == null || (jsonObject = jsonObject2.getJsonObject("data")) == null) ? null : jsonObject.toMap();
        if (e3t.INSTANCE.t()) {
            if (h2t.INSTANCE.r()) {
                str = "taolive_comment_denoise_ai_personality_introduction";
            } else {
                str = "taolive_comment_ai_personality_introduction";
            }
            rxs rxsVar = rxs.INSTANCE;
            exs bizContext = getBizContext();
            if (bizContext != null) {
                czsVar = bizContext.a();
            }
            map2 = rxsVar.b(czsVar, map2);
        } else {
            str = "taolive_comment_personality_introduction";
        }
        return rxs.INSTANCE.j(map2, str);
    }

    public final g1a<TaoLiveKtCommentEntity, xhv> getFetchCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("b86c5aec", new Object[]{this});
        }
        return this.fetchCallback;
    }

    public final void pullMTopPersonalityIntro() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a33f52", new Object[]{this});
        } else {
            xys.INSTANCE.c(getInputParams(), new b());
        }
    }

    public final void setFetchCallback(g1a<? super TaoLiveKtCommentEntity, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30afdfaa", new Object[]{this, g1aVar});
        } else {
            this.fetchCallback = g1aVar;
        }
    }
}
